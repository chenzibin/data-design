package chenzb.mybatis;

import chenzb.mybatis.dao.AppMapper;
import chenzb.mybatis.dao.ConfigMapper;
import chenzb.mybatis.model.App;
import chenzb.mybatis.model.Config;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chenzibin on 2018/11/18.
 *
 * 1、TypeHandler 通过类型处理器的范型，得知该类型处理器处理的Java类型？
 * 2、ResultMap 需要显式的指定TypeHandler，或者设置includeNullJdbcType为true？
 *
 */
public class MybatisTest {

    private SqlSession sqlSession;

    @Before
    public void before() throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testSelectOneApp() throws IOException {
        AppMapper mapper = sqlSession.getMapper(AppMapper.class);
        App app = mapper.selectOne(2);
        System.out.println(app);
    }

    @Test
    public void testSelectOneConfig() throws IOException {
        ConfigMapper mapper = sqlSession.getMapper(ConfigMapper.class);
        Config config = mapper.selectOne(4);
        System.out.println(config);
    }
}
