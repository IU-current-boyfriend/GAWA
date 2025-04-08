package com.linno.cn;

import com.linno.cn.entity.DeptEntity;
import com.linno.cn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestOne {

    /**
     * 总结:
     *  1. ParameterType驱动器中的参数占位符格式: #{}
     *  2. ParameterType参数的类型
     *      a. 基本类型数据: 此时占位符名称【可以随意设置】
     *      b. java.util.Map: 此时占位符名称【必须是Map集合中key的名字_大小写完全相同】,为什么呢？因为在SqlSession.update时,传入的Map对象将按照键值对的形式,给ParameterType中的参数传递值
     *      c. 自定义类时,此时占位符名称【必须是实体类中属性名_大小写完全相同】,理由与Map类似。
     *      d. java.util.List,array，动态SQL拼接讲解
     *      e. 可以省略,parameterHandler通过【反射】机制了解SqlSession使用何种类型容器存放占位符值。
     *
     *
     *
     */

    @Test
    public void testOne() {
    // 如果你SQL配置文件中ParameterHandler的参数是Map的形式
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        Map<String, Object> deptInfo = new HashMap<>();
        deptInfo.put("deptNo", 100);
        deptInfo.put("dName", "IT研发部门");
        deptInfo.put("loc", "杭州");
        int affectRows = session.insert("insert", deptInfo);
        System.out.println("插入了" + affectRows + "行数据...");
    }

    @Test
    public void testTwo() {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        int affectRows = session.delete("delete", 100);
        System.out.println("删除了" + affectRows + "行数据...");
    }


    @Test
    public void testThree() {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setId(1000);
        deptEntity.setDeptNo(100);
        deptEntity.setdName("IT产品技术部门");
        deptEntity.setLoc("深圳");
        int affectRows = session.update("update", deptEntity);
        System.out.println("更新了" + affectRows + "行数据...");
    }
}
