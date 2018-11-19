package chenzb.mybatis.dao;

import chenzb.mybatis.model.App;

/**
 * Created by chenzibin on 2018/11/19.
 */
public interface AppMapper {

    App selectApp(Integer appId);
}
