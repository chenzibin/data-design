package chenzb.mybatis.type;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chenzibin on 2018/11/20.
 *
 * 通过Jdbc获取数据库字段名及JdbcType， 通过数据库字段名匹配ResultType对象的字段并获取其字段类型
 * 当JdbcType满足MappedJdbcTypes配置，且对象字段类型满足MappedTypes时，通过该类型处理器进行处理
 */
@MappedTypes(String.class)
@MappedJdbcTypes(value = {JdbcType.NVARCHAR, JdbcType.VARCHAR}, includeNullJdbcType=true)
public class MyStringTypeHandler extends BaseTypeHandler<String> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter);
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getString(columnName) + "_mystring";
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
