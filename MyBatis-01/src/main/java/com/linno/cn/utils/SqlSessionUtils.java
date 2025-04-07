package com.linno.cn.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 用于封装SqlSession
 */
public class SqlSessionUtils {
    static private SqlSessionFactory sqlSessionFactory = null;
    static private final String BATIS_CONFIG = "mybatis.xml";
    static {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 2. 读取MyBatis.xml文件
        InputStream stream = null;
        try {
            stream = Resources.getResourceAsStream(BATIS_CONFIG);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 3. 创建SqlSessionFactory对象
        sqlSessionFactory = builder.build(stream);
    }

    public static SqlSession getSqlSessionFactory(boolean autoCommit) {
        return sqlSessionFactory.openSession(autoCommit);
    }
}
