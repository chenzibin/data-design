package chenzb.mybatis.enums;

import lombok.Getter;

/**
 * Created by chenzibin on 2018/11/20.
 */
@Getter
public enum ConfigStatus {

    NORMAL(1), DELETE(0);

    private int ordinal;

    ConfigStatus(int ordinal) {
        this.ordinal = ordinal;
    }
}
