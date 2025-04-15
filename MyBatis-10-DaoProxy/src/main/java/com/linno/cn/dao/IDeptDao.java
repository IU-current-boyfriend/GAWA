package com.linno.cn.dao;

import com.linno.cn.entity.DeptEntity;

import java.util.List;

public interface IDeptDao {
    // 增加部门
    int insert(DeptEntity dept);
    // 删除部门
    int delete(int deptNo);
    // 更新部门
    int update(DeptEntity dept);
    // 查询单个部门
    DeptEntity findById(int deptNo);
    // 查询所有部门
    List<DeptEntity> findAll();
}
