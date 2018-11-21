package chenzb.mybatis.enums;

import lombok.Getter;

/**
 * Created by chenzibin on 2018/11/20.
 */
@Getter
public enum ConfigStatus implements BaseEnum {

    NORMAL(1), DELETE(0);

    private int value;

    ConfigStatus(int value) {
        this.value = value;
    }
}
