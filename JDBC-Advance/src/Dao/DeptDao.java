package Dao;

import Entity.DeptEntity;
import util.JDBCUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Enum.DeptEnum;


/**
 * 基于流程封装
 * Dao工具类
 */
public class DeptDao {
    /**
     * 插入sql语句
     */
    public int insert(DeptEntity dept) throws Exception {
        String sql = "insert into dept values(?,?,?)";
        int rs = 0;
        // 加载Driver
        try {
            JDBCUtil.loadClassName();
            JDBCUtil.getConnect();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            ps.setInt(1, dept.getDeptId());
            ps.setString(2, dept.getDeptName());
            ps.setString(3, dept.getLoc());
            rs = JDBCUtil.updateExecute();
        } finally {
            JDBCUtil.close();
        }
        return rs;
    }

    /**
     * 更新sql语句
     */
    public int update(DeptEntity dept) throws Exception{
        String sql = "update dept set dname=?,loc=? where deptno=?";
        int rs = 0;
        try {
            JDBCUtil.loadClassName();
            JDBCUtil.getConnect();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            ps.setString(1, dept.getDeptName());
            ps.setString(2, dept.getLoc());
            ps.setInt(3, dept.getDeptId());
            rs = ps.executeUpdate();
        } finally {
            JDBCUtil.close();
        }
        return rs;
    }

    /**
     * 删除sql语句
     */
    public int delete(int deptno) throws Exception{
        String sql = "delete from dept where deptno=?";

        int rs = 0;
        try {
            JDBCUtil.loadClassName();
            JDBCUtil.getConnect();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            ps.setInt(1, deptno);
            rs = JDBCUtil.updateExecute();
        } finally {
            JDBCUtil.close();
        }
        return rs;
    }

    /**
     * 查询数据
     */
    public List<DeptEntity> query() throws Exception {
        String sql = "select * from dept";
        List<DeptEntity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            JDBCUtil.loadClassName();
            JDBCUtil.getConnect();
            JDBCUtil.getPreparedStatement(sql);
            rs = JDBCUtil.executeQuery();
            while (rs.next()) {
                DeptEntity dept = new DeptEntity();
                dept.setDeptId(rs.getInt(DeptEnum.DEPTNO.getDescrption()));
                dept.setDeptName(rs.getString(DeptEnum.DENAEM.getDescrption()));
                dept.setLoc(rs.getString(DeptEnum.LOC.getDescrption()));
                list.add(dept);
            }
        } finally {
            JDBCUtil.close(rs);
        }
        return list;
    }
}
