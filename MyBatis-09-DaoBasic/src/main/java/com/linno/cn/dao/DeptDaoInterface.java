package com.linno.cn.dao;

import com.linno.cn.entity.DeptEntity;

import java.util.List;

public interface DeptDaoInterface {
    // 增加部门
    int insertDept(DeptEntity dept);
    // 删除部门
    int deleteDept(int deptNo);
    // 更新部门
    int updateDept(DeptEntity dept);
    // 查询单个部门
    DeptEntity findByIdDept(int deptNo);
    // 查询所有部门
    List<DeptEntity> findAllDept();
}
