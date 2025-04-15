package com.linno.cn.daoImpl;

import com.linno.cn.dao.DeptDaoInterface;
import com.linno.cn.entity.DeptEntity;
import com.linno.cn.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DeptDaoImpl implements DeptDaoInterface {
    private SqlSession sqlSession = SqlSessionUtil.getSqlSession(true);

    @Override
    public int insertDept(DeptEntity dept) {
        return sqlSession.update("DeptXml.insert", dept);
    }

    @Override
    public int deleteDept(int deptNo) {
        return sqlSession.update("DeptXml.delete", deptNo);
    }

    @Override
    public int updateDept(DeptEntity dept) {
        return sqlSession.update("DeptXml.update", dept);
    }

    @Override
    public DeptEntity findByIdDept(int deptNo) {
        return sqlSession.selectOne("DeptXml.findById", deptNo);
    }

    @Override
    public List<DeptEntity> findAllDept() {
        return sqlSession.selectList("DeptXml.findAllDept");
    }
}
