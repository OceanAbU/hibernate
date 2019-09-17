package com.qiudaozhang.hibernate5.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 深圳邱道长
 * @since 2019/9/17
 */
@Getter
@Setter
public class Region {

    private Integer id;

    private String name;


    private Set<Country> countries = new HashSet<>();


    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
