package com.fykj.web.dao;


import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fykj.web.beans.tools.SmartConfig;



/**
 * Created by DerCg on 2016/5/29.
 */
public class MyBatisConnectionFactory {
    private static SqlSessionFactory sqlSecuritySessionFactory;
    private static final Logger LOG = LoggerFactory.getLogger(MyBatisConnectionFactory.class);

    static{

        try {
            Properties prop = new Properties();
            SmartConfig config = new SmartConfig("config/jdbc.smt");
            prop.load(config.getConfigAsReader());
            String resource = "config/mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            if (sqlSecuritySessionFactory == null) {
                sqlSecuritySessionFactory = new SqlSessionFactoryBuilder().build(reader,"SecurityDB",prop);
            }
        } catch (IOException e) {
            LOG.error("MyBatisConnectionFactory初始化异常：{}",e);
        }
    }

    /**
     * 静态方法返回SQL实例
     * @return
     */
    public static SqlSessionFactory getSqlSecuritySessionFactory() {

        return sqlSecuritySessionFactory;
    }
}
