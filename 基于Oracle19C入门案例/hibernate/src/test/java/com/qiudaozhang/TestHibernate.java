package com.qiudaozhang;

import com.qiudaozhang.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.testng.annotations.Test;

/**
 * @author 深圳邱道长
 * @since 2019/9/11
 */
@Test
public class TestHibernate {


    public void m1(){
        final StandardServiceRegistry  registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student s = new Student();
        s.setName("baby");
        session.save(s);
        session.getTransaction().commit();
    }
}
