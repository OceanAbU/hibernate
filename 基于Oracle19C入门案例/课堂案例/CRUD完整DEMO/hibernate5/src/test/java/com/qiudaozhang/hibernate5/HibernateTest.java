package com.qiudaozhang.hibernate5;

import com.qiudaozhang.hibernate5.model.Product;
import com.qiudaozhang.hibernate5.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author 深圳邱道长
 * @since 2019/9/12
 */
@Test
public class HibernateTest {


    Session session;

    @BeforeClass
    public void pre(){
        session = HibernateUtil.getSession();
        session.beginTransaction();
    }


    public void insert(){
        Product p = new Product("西瓜",23.33);
        Product p2 = new Product("东瓜",33.33);
        Product p3 = new Product("北瓜",43.33);
        session.save(p);
        session.save(p2);
        session.save(p3);
    }


    public void get(){
        Product product = session.get(Product.class, 4);
        System.out.println(product);
    }

    public void load(){
        Product product = session.load(Product.class, 4);
        System.out.println(product);
    }


    public void update(){
        Product p = session.get(Product.class,2);
        p.setName("香烟");
        p.setPrice(100.00);
        session.update(p);
    }


    public void delete(){
        Product p = session.get(Product.class,2);
        session.delete(p);
    }

    @AfterClass
    public void clear(){
        session.getTransaction().commit();
        session.close();
    }
}
