package Entity;

/**
 * 实体类的，实体类的目的是什么呢？
 * 有时候Dao工具类中的方法参数很多,不方便我们传递参数
 * 所以我们可以封装一个实体类，表示一张表,来解决参数过长的问题
 */
public class DeptEntity {
    private int deptId;
    private String deptName;
    private String loc;
    public DeptEntity() {}
    public DeptEntity(int deptId, String deptName, String loc) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
