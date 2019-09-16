package com.qiudaozhang.hibernate5;

import com.qiudaozhang.hibernate5.model.Address;
import com.qiudaozhang.hibernate5.model.Person;
import com.qiudaozhang.hibernate5.util.HibernateUtil;
import org.hibernate.Session;
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



    @AfterClass
    public void clear(){
        session.getTransaction().commit();
        session.close();
    }


    public void epmty(){

    }

    public void create(){
//        Address a = new Address();
//        a.setCity("深圳");
//
//        Address a2 = new Address();
//        a2.setCity("广州");
//        session.save(a);
//        session.save(a2);

    }
}
