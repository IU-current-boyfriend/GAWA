package utils;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * JDBC连接数据库工具类
 */
public class JDBCUtil {
    private static Connection conn = null;
    private static PreparedStatement ps = null;
    private final static String Driver = "com.mysql.jdbc.Driver";
    private final static Properties props = new Properties();
    private final static MySqlConfig sqlConfig = new MySqlConfig();


    public static void getDBConfig() throws Exception{
        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("resource/mysql.config.properties");
        props.load(in);
        sqlConfig.setUrl(props.getProperty(sqlConfig.DBURL));
        sqlConfig.setRoot(props.getProperty(sqlConfig.DBUSER));
        sqlConfig.setPwd(props.getProperty(sqlConfig.DBPWD));
        if (in != null) in.close();
    }


    public static void loadClass() throws Exception {
        Class.forName(Driver);
        
    }

    public static void getConnection() throws Exception {
        getDBConfig();
        conn = DriverManager.getConnection(sqlConfig.getUrl(), sqlConfig.getRoot(), sqlConfig.getPwd());
    }

    public static PreparedStatement getPreparedStatement(String sql) throws Exception {
        ps = conn.prepareStatement(sql);
        return ps;
    }

    public static void close() throws Exception{
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    }

    public static void close(ResultSet rs) throws Exception{
        close();
        if (rs != null) rs.close();
    }
}