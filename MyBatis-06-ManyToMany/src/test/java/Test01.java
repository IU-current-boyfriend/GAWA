import com.linno.cn.entity.CEntity;
import com.linno.cn.entity.CEntity2;
import com.linno.cn.entity.SEntity;
import com.linno.cn.entity.SEntity2;
import com.linno.cn.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class Test01 {
    private final SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);

    @Test
    public void test1() {
        SEntity stu = sqlSession.selectOne("sql_1");

        List<CEntity> courses = stu.getcList();

        for (CEntity c : courses) {
            System.out.println(stu.getsName() + "的课程成绩如下:" + c);
        }
    }

    @Test
    public void test2() {
        CEntity2 course = sqlSession.selectOne("CXml.sql_1", "数学");

        List<SEntity2> students = course.getStudents();

        for (SEntity2 student : students) {
            System.out.println(course.getcName() + "下的学生信息:" + student);
        }

    }
}
