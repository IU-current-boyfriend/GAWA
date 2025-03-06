package ServiceImpl;

import Dao.DeptDao;
import Entity.DeptEntity;
import Service.ServiceBase;

import java.util.List;

/**
 * 湖北地区的接口实现类
 */
public class HuBeiServiceImpl implements ServiceBase {
    private DeptDao dao = new DeptDao();
    @Override
    public int insert(DeptEntity dept) throws Exception {
        return dao.insert(dept);
    }

    @Override
    public int update(DeptEntity dept) throws Exception {
        return dao.update(dept);
    }

    @Override
    public int delete(int deptno) throws Exception {
        return dao.delete(deptno);
    }

    @Override
    public List<DeptEntity> queryAllData() throws Exception {
        return dao.query();
    }
}
