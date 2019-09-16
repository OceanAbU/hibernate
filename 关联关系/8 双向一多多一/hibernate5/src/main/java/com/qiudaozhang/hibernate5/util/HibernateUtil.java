package com.qiudaozhang.hibernate5.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author 深圳邱道长
 * @since 2019/9/12
 * hibernate工具类
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;



    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }


    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
