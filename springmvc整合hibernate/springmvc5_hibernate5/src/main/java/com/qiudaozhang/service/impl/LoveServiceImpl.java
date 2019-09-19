package com.qiudaozhang.service.impl;

import com.qiudaozhang.dao.LoveDao;
import com.qiudaozhang.model.Love;
import com.qiudaozhang.service.LoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
@Service
public class LoveServiceImpl implements LoveService {

    @Autowired
    private LoveDao loveDao;


    @Override
    public void add(Love love) {
        loveDao.save(love);
    }

    @Override
    public List<Love> findAll() {

        return loveDao.findAll();
    }

    @Override
    public void del(Long id) {
        loveDao.delById(id);
    }

    @Override
    public Love findById(Long id) {
        return loveDao.findById(id);
    }
}
