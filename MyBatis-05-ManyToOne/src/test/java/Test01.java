import cn.entity.DeptEntity;
import cn.entity.EmpEntity;
import cn.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test01 {
    private final SqlSession session = SqlSessionUtils.getSqlSession(true);
    @Test
    public void test01() {
        EmpEntity emp = session.selectOne("sql_1");
        // 获取emp所属的部门
        DeptEntity dept = emp.getDept();

        System.out.println(emp.getEname() + "所属的部门信息: => " + dept);
    }

    @Test
    public void test02() {
        List<EmpEntity> empList = session.selectList("sql_2");

        for (EmpEntity emp : empList) {
            DeptEntity dept = emp.getDept();
            System.out.println(emp.getEname() + "的薪资为" + emp.getSal() + ", 所属部门信息" + dept);
        }
    }
}
