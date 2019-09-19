package com.qiudaozhang.dao.impl;

import com.qiudaozhang.dao.LoveDao;
import com.qiudaozhang.model.Love;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
@Repository
@Transactional
public class LoveDaoImpl implements LoveDao {


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void save(Love love) {
        Session session = getSession();
        session.save(love);
        System.out.println("保存。。。");
    }

    @Override
    public List<Love> findAll() {
        Session session = getSession();
        return session.createQuery("from Love").list();
    }

    @Override
    public void delById(Long id) {
        Session session = getSession();
        Love love = session.get(Love.class, id);
        session.delete(love);
    }

    @Override
    public Love findById(Long id) {
        Session session = getSession();
        Love love = session.get(Love.class, id);
        return love;
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
