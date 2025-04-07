package com.linno.cn;

import com.linno.cn.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class TestOne {

    @Test
    public void test1() throws Exception {
        // 如何使用MyBatis?
        // 1. 首先要让MyBatis读取我的mybatis文件和SQL配置文件
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        // 2. 利用MyBatis中的方法获取到读取mybatis.xml文件配置
        InputStream stream = Resources.getResourceAsStream("mybatis.xml");
        // 3. 创建SQLSessionFactory对象,将内存中读取的内容交给SQLSessionFactory对象
        // 形成configuration对象
        SqlSessionFactory sqlSessionFactory = ssfb.build(stream);
        // 创建SqlSession对象,让其推送你的Session语句
        // openSession方法参数默认false,也就是开启事务管理
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        int affectRows = sqlSession.delete("Dept.delete");

//        if (affectRows != 0) {
            // 如果删除成功的话,则提交事务
//            sqlSession.commit();
            System.out.println("删除了: =>" + affectRows + "个部门...");
//        }

    }

    @Test
    public void test2() throws Exception {
        // 1. 创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 2. 读取mybatis配置文件到内存中
        InputStream stream = Resources.getResourceAsStream("mybatis.xml");
        // 3. 通过SqlSessionFactoryBuilder创建SqlSessionFactory对象，将配置对象传入到build中
        SqlSessionFactory sessionFactory = builder.build(stream);
        // 4. 获取session对象,由session对象驱动executor执行器去处理SQL语句，并且
        // 调用相应处理器去推送SQL语句
        SqlSession session = sessionFactory.openSession(true);
        // 5. session驱动executor执行器
        int affectRows = session.insert("Dept.insert");

        if (affectRows != 0) {
            System.out.println("插入了" + affectRows + "条数据...");
        }
    }


    @Test
    public void test3() throws Exception {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream stream = Resources.getResourceAsStream("myBatis.xml");
        SqlSessionFactory sessionFactory = builder.build(stream);
        SqlSession sqlSession = sessionFactory.openSession(true);
        int affectRows = sqlSession.update("Dept.update");
        if (affectRows != 0) {
            System.out.println("更新了" + affectRows + "行数据");
        }
    }

    /**
     * 需要注意的知识点：
     * 1. SqlSession对象无论是insert、delete、update方法,其实SqlSession对象都会驱动
     * executor.update方法。也就是说,insert、delete、update方法本质上底层调用的都是update方法。
     *
     * 2. openSession(AutoCommit)参数问题：
     *  AutoCommit默认为false,也就是说默认开启事务管理模式,本质上SQL语句的操作就在临时表中,所以
     *  当你推送SQL语句成功的时候,你会发现数据库的原始表内容并未发生变化。这是你因为当前的数据库开启
     *  了事务管理模式,此时SQL语句的推送并不会影响到原始数据库。所以,需要我们手动进行事务的“推送”或者“回滚”
     *  commit/rollback
     *
     */


    @Test
    public void test4() throws Exception {
        // 通过我自己封装的utils来创建SqlSession对象
        // SqlSession session = SqlSessionUtils.getSqlSessionFactory(true);
        SqlSession session = SqlSessionUtils.getSqlSessionFactory(false);
        // 提交
//        int affectRows = session.insert("Dept.insert");
//
//        if (affectRows != 0) {
//            session.commit();
//            System.out.println("哥们插入了😁" + affectRows + "行数据。。。");
//        }

        try {
            session.insert("Dept.insert");
            session.update("Dept.update");
            session.commit();
            System.out.println("哥们插入和新增了一些数据😁...");
        } catch (Exception e) {
            session.rollback();
            System.out.println("SQL有问题,哥们要回滚数据了😁...");
            throw new RuntimeException(e);
        }

    }



}