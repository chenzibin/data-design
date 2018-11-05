package chenzb.pattern.template.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzibin on 2018/11/5.
 */
public class JdbcTemplate {

    public List executeQuery(String sql, RowMapper mapper) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://47.98.193.129:3306/disconf", "root", "admin");
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            List result = new ArrayList();
            while(rs.next()) {
                result.add(mapper.mapRow(rs));
            }
            return result;
        }
    }
}
