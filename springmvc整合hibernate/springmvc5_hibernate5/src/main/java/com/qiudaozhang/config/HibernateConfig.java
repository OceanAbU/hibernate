package com.qiudaozhang.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
@Configuration
@PropertySource("classpath:/db.properties")
@ComponentScan(basePackages = {"com.qiudaozhang.dao"})
@EnableTransactionManagement
public class HibernateConfig {


    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driver}")
    private String driver;

    // 配置数据源
    @Bean
    public DataSource dataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setDriverClassName(driver);
        ds.setPassword(password);
        ds.setUsername(username);
        return ds;
    }


    // 配置事务管理器
    @Bean("txManager")
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager tx = new HibernateTransactionManager();
        tx.setSessionFactory(sessionFactoryBean().getObject());
        return tx;
    }


//    @Bean("txManager")
//    public DataSourceTransactionManager dataSourceTransactionManager(){
//        DataSourceTransactionManager tx = new DataSourceTransactionManager();
//        tx.setDataSource(dataSource());
//        return tx;
//    }

    // 配置会话工厂
    @Bean("sessionFactory")
    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean fb = new LocalSessionFactoryBean();
        // 设置数据源
        fb.setDataSource(dataSource());
        fb.setPackagesToScan("com.qiudaozhang.model");
        Properties props = new Properties();
//        oracle19c方言
//        props.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle12cDialect");
        // mysql8方言
        //current_session_context_class
        props.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        props.setProperty("current_session_context_class","thread");
        props.setProperty("hibernate.show_sql","true");
        props.setProperty("hibernate.format_sql","true");
        props.setProperty("hibernate.hbm2ddl.auto","update");
        fb.setHibernateProperties(props);
        return fb;
    }
}
