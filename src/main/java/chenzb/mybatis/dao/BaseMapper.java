package chenzb.mybatis.dao;

import java.util.List;

/**
 * Created by chenzibin on 2018/11/21.
 */
public interface BaseMapper<T> {

    T selectOne(Integer id);

    List<T> selectList();

    int insert(T t);

    int update(T t);
}
