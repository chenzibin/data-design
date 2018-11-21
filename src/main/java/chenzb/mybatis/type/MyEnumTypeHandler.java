package chenzb.mybatis.type;

import chenzb.mybatis.enums.BaseEnum;
import chenzb.mybatis.enums.ConfigStatus;
import chenzb.mybatis.enums.ConfigType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 * Created by chenzibin on 2018/11/21.
 */
@MappedTypes({ConfigStatus.class, ConfigType.class})
@MappedJdbcTypes(value = {JdbcType.VARCHAR, JdbcType.TINYINT}, includeNullJdbcType = true)
public class MyEnumTypeHandler<T extends BaseEnum> extends BaseTypeHandler<T> {

    private Class<T> type;

    public MyEnumTypeHandler(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        T[] enums = type.getEnumConstants();
        for (T e : enums) {
            if (Objects.equals(String.valueOf(e.getValue()), value)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
