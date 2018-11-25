package chenzb.mybatis.transaction;

import org.apache.ibatis.transaction.Transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by chenzibin on 2018/11/23.
 */
public class MyTransaction implements Transaction {
    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public void commit() throws SQLException {

    }

    @Override
    public void rollback() throws SQLException {

    }

    @Override
    public void close() throws SQLException {

    }

    @Override
    public Integer getTimeout() throws SQLException {
        return null;
    }
}
