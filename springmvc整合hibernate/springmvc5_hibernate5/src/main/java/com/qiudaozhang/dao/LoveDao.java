package com.qiudaozhang.dao;

import com.qiudaozhang.model.Love;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
public interface LoveDao {
    void save(Love love);

    List<Love> findAll();

    void delById(Long id);

    Love findById(Long id);
}
