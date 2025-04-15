import com.linno.cn.dao.IDeptDao;
import com.linno.cn.entity.DeptEntity;
import com.linno.cn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test01 {
    private final SqlSession session = SqlSessionUtil.getSqlSession(true);
    private final IDeptDao deptDao = session.getMapper(IDeptDao.class);

    @Test
    public void test01() {
        // 创建部门对象
        DeptEntity dept = new DeptEntity(999, "IT研发部门", "深圳");
        // 推送SQL
        int rows = deptDao.insert(dept);
        // 打印结果
        System.out.println(rows);
    }

    @Test
    public void test02() {
        // 删除部门
        int rows = deptDao.delete(999);
        System.out.println(rows);
    }

    @Test
    public void test03() {
        // 更新部门
        int rows = deptDao.update(new DeptEntity(999, "IT晨跑部门", "武汉"));

        System.out.println(rows);
    }


    @Test
    public void test04() {
        DeptEntity dept = deptDao.findById(999);

        System.out.println(dept);
    }

    @Test
    public void test05() {
        List<DeptEntity> depts = deptDao.findAll();

        for (DeptEntity dept : depts) {
            System.out.println(dept);
        }
    }
}
