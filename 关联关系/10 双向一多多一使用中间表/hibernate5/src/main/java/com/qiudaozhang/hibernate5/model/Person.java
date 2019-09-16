package com.qiudaozhang.hibernate5.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 深圳邱道长
 * @since 2019/9/16
 */
@Data
public class Person {


    private Integer pid;

    private String name;

    private Set<Address> addresses = new HashSet<>();


}
