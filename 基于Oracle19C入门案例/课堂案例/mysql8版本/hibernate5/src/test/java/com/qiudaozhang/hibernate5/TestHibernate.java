package com.qiudaozhang.hibernate5;

import com.qiudaozhang.hibernate5.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.Test;

/**
 * @author 深圳邱道长
 * @since 2019/9/12
 */
@Test
public class TestHibernate {


    public void helloHibernate(){
        // 核心目标是为了获得会话，通过Session和数据库交流
        // 要得到会话，通过工厂模式来生产的，所以必须先得到会话工厂

        // 首先得到标准的注册对象
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        // 利用元数据资源对象读取配置对象，来完成工厂创建 ，工厂是重量级对象，一般一个就可以了
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        // 使用会话工厂来创建会话
        Session session = sessionFactory.openSession();
        // 开启事务
        session.beginTransaction();

        // 使用会话的api完成数据库的操作
        // save一下（对象）
        Product p = new Product(1,"西瓜",23.33);
        // 会话API存储，其实就送insert 一条数据
        session.save(p);
        // 提交事务
        session.getTransaction().commit();
        // 关闭会话
        session.close();
    }
}
