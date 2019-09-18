package com.qiudaozhang.hibernate5;

import com.qiudaozhang.hibernate5.model.Region;
import com.qiudaozhang.hibernate5.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/12
 */
@Test
public class HibernateTest {

    long start =  System.currentTimeMillis();
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



    public void select(){

        Region region = new Region();
        region.setName("太平洋");
        session.save(region);
    }



}
