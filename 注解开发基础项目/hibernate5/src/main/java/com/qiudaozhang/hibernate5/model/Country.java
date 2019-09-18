package com.qiudaozhang.hibernate5.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 深圳邱道长
 * @since 2019/9/17
 */
@Getter
@Setter
public class Country {

    private String id;

    private String name;

    private Region region;


    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
