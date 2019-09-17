package com.qiudaozhang.hibernate5;

import com.qiudaozhang.hibernate5.model.Region;
import com.qiudaozhang.hibernate5.util.HibernateUtil;
import org.hibernate.Session;
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


    public void empty(){

    }


    public void from(){
        // 执行HQL 依赖Query对象
        /// 从Session获得Query对象
        // 如果你查询的不止一个字段，list里面每项都是个数组
        String hql = "select name ,max(id) from Region group by  name ";
        Query query = session.createQuery(hql);
        List list = query.list();
        for(int i = 0 ; i < list.size();i++){
            Object[] obs = (Object[]) list.get(i);
            System.out.println(Arrays.toString(obs));
        }
    }


    public void select(){
        // 执行HQL 依赖Query对象
        /// 从Session获得Query对象
        // 如果你查询的不止一个字段，list里面每项都是个数组
        String hql = "from  java.lang.Object";
        Query query = session.createQuery(hql);
        List list = query.list();
        System.out.println(list);
    }

    public void insert(){
        // 执行HQL 依赖Query对象
        /// 从Session获得Query对象
        // 如果你查询的不止一个字段，list里面每项都是个数组
        Region re = new Region();
//        re.setId(11);
        re.setName("东莞");
        session.save(re);
    }
    public void update(){
        String hql = "update Region r set r.name = :name where r.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("name","深圳");
        query.setParameter("id",12);
        query.executeUpdate();

    }

    public void delete(){
        String hql = "delete Region r where r.id > :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",4);
        query.executeUpdate();

    }

}
