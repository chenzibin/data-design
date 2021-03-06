package chenzb.mybatis.model;

import lombok.Data;

import java.util.List;

/**
 * Created by chenzibin on 2018/11/19.
 */
@Data
public class App {

    private Integer appId;

    private String name;

    private String description;

    private String email;

    private List<Config> configs;

}
