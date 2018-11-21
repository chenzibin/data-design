package chenzb.mybatis.enums;

import lombok.Getter;

/**
 * Created by chenzibin on 2018/11/20.
 */
@Getter
public enum ConfigType implements BaseEnum {

    FILE(0), ITEM(1);

    private int value;

    ConfigType(int value) {
        this.value = value;
    }

}
