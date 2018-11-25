package chenzb.mybatis.dao;

import chenzb.mybatis.model.Config;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenzibin on 2018/11/21.
 */
public interface ConfigMapper extends BaseMapper<Config> {

    List<Config> selectByAppId(@Param("appId") String appId);
}
