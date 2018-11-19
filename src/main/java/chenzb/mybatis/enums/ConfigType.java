package chenzb.mybatis.enums;

import lombok.Getter;

/**
 * Created by chenzibin on 2018/11/20.
 */
@Getter
public enum ConfigType {

    FILE(0), ITEM(1);

    private int ordinal;

    ConfigType(int ordinal) {
        this.ordinal = ordinal;
    }

}
