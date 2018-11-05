package chenzb.pattern.template.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chenzibin on 2018/11/6.
 */
public interface RowMapper<T> {

    T mapRow(ResultSet resultSet) throws SQLException;

}
