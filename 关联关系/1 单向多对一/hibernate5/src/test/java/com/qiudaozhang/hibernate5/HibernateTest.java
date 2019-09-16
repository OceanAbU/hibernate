package com.qiudaozhang.hibernate5;

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

    public void create(){

    }
}
