package Enum;

public enum DeptEnum {
    DEPTNO("deptno"),
    DENAEM("dname"),
    LOC("loc");

    private final String descrption;

    DeptEnum(String descrption) {
        this.descrption = descrption;
    }

    public String getDescrption() {
        return descrption;
    }
}
