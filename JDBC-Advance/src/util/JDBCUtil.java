package util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Dao工具类中的JDBC使用过于繁琐,将JDBC功能进行抽离
 */
public class JDBCUtil {
    private static String dbUrl;
    private static String dbUser;
    private static String dbPwd;
    private static Connection conn = null;
    private static PreparedStatement ps;
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final Properties prop = new Properties();


    public static void getDBConfig() throws Exception {
        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("resources/db.config.properties");
        prop.load(in);
        dbUrl = prop.getProperty("dbUrl");
        dbUser = prop.getProperty("dbUser");
        dbPwd = prop.getProperty("dbPwd");
        if (in != null) in.close();
    }

    public static void loadClassName() throws Exception {
        Class.forName(Driver);
    }

    public static void getConnect() throws Exception {
        getDBConfig();
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
    }

    public static PreparedStatement getPreparedStatement(String sql) throws Exception {
        ps = conn.prepareStatement(sql);
        return ps;
    }

    public static int updateExecute() throws Exception {
        return ps.executeUpdate();
    }

    public static ResultSet executeQuery() throws Exception {
        return ps.executeQuery();
    }

    public static void close() throws Exception {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    }

    public static void close(ResultSet rs) throws Exception {
        close();
        if (rs != null) rs.close();
    }

}
