package com.qiudaozhang.service;

import com.qiudaozhang.model.Love;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
public interface LoveService {
    void add(Love love);

    List<Love> findAll();

    void del(Long id);

    Love findById(Long id);
}
