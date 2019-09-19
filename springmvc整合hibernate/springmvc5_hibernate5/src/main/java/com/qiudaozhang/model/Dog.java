package com.qiudaozhang.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
@Getter
@Setter
@Entity
public class Dog {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private Long id;

    private String name;

    private String brand;

    @ManyToOne
    @JoinColumn(name = "love_id")
    private Love love;
}
