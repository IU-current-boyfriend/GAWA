import cn.entity.DeptEntity;
import cn.entity.EmpEntity;
import cn.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test01 {
    private final SqlSession session = SqlSessionUtils.getSqlSession(true);


    @Test
    public void test01(){
        DeptEntity dept = session.selectOne("DeptXml.sql_1");

        List<EmpEntity> empList = dept.getEmpList();

        for (EmpEntity emp : empList) {
            System.out.println("部门"+ dept.getDeptNo() + "下的员工信息: =>" + emp);
        }
    }

    @Test
    public void test02(){
        List<DeptEntity> depts = session.selectList("DeptXml.sql_2");

        for (DeptEntity dept : depts) {
            // 获取每个部门所拥有的员工信息
            List<EmpEntity> emps = dept.getEmpList();
            // 打印员工信息
            for (EmpEntity emp : emps) {
                System.out.println("部门" + dept.getDeptNo() + "下的员工信息: =>" + emp);
            }
        }
    }

    @Test
    public void test03(){
        List<DeptEntity> deptList = session.selectList("sql_1");

        for (DeptEntity dept : deptList) {
            List<EmpEntity> emps = dept.getEmpList();

            for (EmpEntity emp : emps) {
                System.out.println(dept.getdName() + "所属的人员信息" + emp + ", 其中该员工的薪资信息为" + emp.getSalGrade());
            }
        }
    }
}
