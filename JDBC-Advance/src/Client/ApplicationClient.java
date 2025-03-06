package Client;

import Entity.DeptEntity;
import Service.ServiceBase;
import ServiceImpl.HuBeiServiceImpl;

import java.util.List;
import java.util.Scanner;


public class ApplicationClient {
    private final static Scanner sc = new Scanner(System.in);
    private final static ServiceBase serviceBase = new HuBeiServiceImpl();
    private static DeptEntity dept;
    public static void main(String[] args) {
        while (true) {
            System.out.println("请您选择操作方法:1.新增部门 2.更新部门 3.删除部门 4.查询全部数据 5.退出");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    insertOperation();
                    break;
                case 2:
                    updateOperation();
                    break;
                case 3:
                    deleteOperation();
                    break;
                case 4:
                    queryOperation();
                    break;
                case 5:
                    outOperation();
                    return;
            }
        }
    }

    public static void insertOperation() {
        System.out.println("请您输入需要新增的部门编号");
        int deptno = sc.nextInt();
        System.out.println("请您输入需要新增的部门名称");
        String dname = sc.next();
        System.out.println("请您输入需要新增的部门地址");
        String loc = sc.next();
        try {
            int rs = serviceBase.insert(new DeptEntity(deptno, dname, loc));
            System.out.println("恭喜🎉您新增"+rs+"个部门");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void updateOperation() {
        System.out.println("请您输入需要更新的部门编号");
        int deptno = sc.nextInt();
        System.out.println("请您输入需要更新的部门名称");
        String dname = sc.next();
        System.out.println("请您输入需要更新的部门地址");
        String loc = sc.next();
        try {
            int rs = serviceBase.update(new DeptEntity(deptno, dname, loc));
            System.out.println("恭喜🎉您更新"+rs+"个部门");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void deleteOperation() {
        System.out.println("请您输入需要删除的部门编号");
        int deptno = sc.nextInt();
        try {
            int rs = serviceBase.delete(deptno);
            System.out.println("恭喜🎉您删除"+rs+"个部门");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void queryOperation() {
        System.out.println("将为您查询数据中...");
        try {
            List<DeptEntity> list = serviceBase.queryAllData();
            // 输出查询到的结果
            list.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void outOperation() {
        System.out.println("退出系统中...");
    }
}
