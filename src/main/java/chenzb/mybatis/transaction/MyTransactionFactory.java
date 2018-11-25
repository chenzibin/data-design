package chenzb.mybatis.transaction;

import org.apache.ibatis.session.TransactionIsolationLevel;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created by chenzibin on 2018/11/23.
 */
public class MyTransactionFactory implements TransactionFactory {
    @Override
    public void setProperties(Properties props) {

    }

    @Override
    public Transaction newTransaction(Connection conn) {
        return null;
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return null;
    }
}
