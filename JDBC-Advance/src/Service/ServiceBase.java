package Service;

import Entity.DeptEntity;

import java.util.List;

public interface ServiceBase {
    int insert(DeptEntity dept) throws Exception;
    int update(DeptEntity dept) throws Exception;
    int delete(int deptno) throws Exception;
    List<DeptEntity> queryAllData() throws Exception;
}
