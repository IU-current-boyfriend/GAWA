import com.linno.cn.entity.DeptEntity;
import com.linno.cn.entity.SEntity;
import com.linno.cn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class Test01 {
    private static final SqlSession session = SqlSessionUtil.getSqlSession(true);
    @Test
    public void test1() {
//        DeptEntity dept = session.selectOne("DeptXML.sql_1", 10);

        List<DeptEntity> dept = session.selectList("DeptXML.sql_1");

//        dept.forEach(new Consumer<DeptEntity>() {
//            @Override
//            public void accept(DeptEntity deptEntity) {
//                System.out.println(deptEntity);
//            }
//        });

        dept.forEach(System.out::println);
    }

    @Test
    public void test2() {
        HashMap map = new HashMap();
        map.put("SNO", 10);
        map.put("SName", "JACK");
//        map.put("id", 1);
        int rows = session.update("sql_1", map);

        System.out.println(rows);
    }


    @Test
    public void test3() {
        int[] sNo = {1, 2};

        int rows = session.update("SXml.sql_1", sNo);

        System.out.println("删除了" + rows + "个学生...");
    }


    @Test
    public void test4() {
        List<SEntity> students = new ArrayList<>();
        students.add(new SEntity(99, "TOM"));
        students.add(new SEntity(100, "SMITH"));



        int rows = session.update("sql_2", students);

        System.out.println("插入了" + rows + "个学生...");
    }

}
