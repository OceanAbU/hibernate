package com.qiudaozhang.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
@Entity
@Setter
@Getter
public class Love implements Serializable {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "love",fetch = FetchType.EAGER)
    private Set<Dog> dogs = new HashSet<>();
}
