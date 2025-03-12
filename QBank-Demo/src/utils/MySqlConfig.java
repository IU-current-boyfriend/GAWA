package utils;

/**
 * mySql配置对象
 */
public class MySqlConfig {
    private String url;
    private String root;
    private String pwd;
    public final String DBURL = "dbUrl";
    public final String DBUSER = "dbUser";
    public final String DBPWD = "dbPwd";
    public MySqlConfig(String root, String url, String pwd) {
        this.root = root;
        this.url = url;
        this.pwd = pwd;
    }

    public MySqlConfig() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}