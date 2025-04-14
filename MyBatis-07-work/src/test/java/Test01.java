import cn.entity.DeptEntity;
import cn.entity.DeptEntity2;
import cn.entity.EmpEntity;
import cn.entity.EmpEntity2;
import cn.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test01 {
    private final SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);

    @Test
    public void test01(){
        List<DeptEntity> depts = sqlSession.selectList("DeptXml.sql_1");

        for (DeptEntity dept : depts) {
            List<EmpEntity> emps = dept.getEmp();

            for (EmpEntity emp : emps) {
                System.out.println("所属部门" + dept.getDeptName() + "的员工有" + emp);
            }
        }
    }

    @Test
    public void test02(){
        List<DeptEntity2> depts = sqlSession.selectList("sql_2");

        for (DeptEntity2 dept : depts) {
            List<EmpEntity2> emps = dept.getEmpList();

            for (EmpEntity2 emp : emps) {
                System.out.println("部门"+ dept.getDeptName() + "员工信息个人薪资信息" + emp);
            }
        }
    }
}
