package com.qiudaozhang.hibernate5.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 深圳邱道长
 * @since 2019/9/17
 */
@Getter
@Setter
@Entity// 标记我为实体
@Table(name = "regions")// 描述如何和数据库的表进行映射
public class Region {

    @Id
    @Column(name = "region_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "region_name")
    private String name;


//    private Set<Country> countries = new HashSet<>();


    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
