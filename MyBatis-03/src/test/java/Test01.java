import com.linno.cn.entity.DeptEntity;
import com.linno.cn.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test01 {
    private final SqlSession session = SqlSessionUtils.getSqlSession(true);


    @Test
    public void test1() {

        // 查询数据
        int rs = session.selectOne("DeptXML.sql_1");
        System.out.println("查询部门个数为: =>" + rs);
    }

    @Test
    public void test2() {


        List<String> deptNames = session.selectList("DeptXML.sql_2");

        // 循环迭代
        for (String deptName : deptNames) {
            System.out.println("当前查询的部门名称为: =>" + deptName);
        }

    }


    @Test
    public void test3() {
        DeptEntity dept = session.selectOne("DeptXML.sql_3", 10);

        System.out.println("本次查询到的部门信息如下: =>" + dept);
    }


    @Test
    public void test4() {
        List<DeptEntity> depts = session.selectList("DeptXML.sql_4");

        for (DeptEntity dept : depts) {
            System.out.println("本次查询到以下部门信息: =>" + dept);
        }
    }
}
