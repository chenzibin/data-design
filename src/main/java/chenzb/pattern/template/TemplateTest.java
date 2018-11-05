package chenzb.pattern.template;

import org.junit.Test;

import java.sql.*;

/**
 * Created by chenzibin on 2018/11/5.
 */
public class TemplateTest {

    @Test
    public void testJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://47.98.193.129:3306/disconf", "root", "admin");
        PreparedStatement ps = conn.prepareStatement("select * from app");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("app_id"));
            System.out.println(rs.getString("name"));
        }
        rs.close();
        ps.close();
        conn.close();
    }
}
