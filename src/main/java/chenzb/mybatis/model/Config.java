package chenzb.mybatis.model;

import chenzb.mybatis.enums.ConfigStatus;
import chenzb.mybatis.enums.ConfigType;
import lombok.Data;

/**
 * Created by chenzibin on 2018/11/20.
 */
@Data
public class Config {

    private Integer configId;

    private ConfigType type;

    private ConfigStatus status;

    private String name;

    private String value;

    private Integer appId;

}
