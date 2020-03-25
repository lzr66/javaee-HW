package JDBC;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class databasepool {
    private  static HikariDataSource hikariDataSource ;
    public static HikariDataSource getHikariDataSource(){

        if(null!= hikariDataSource){
            return hikariDataSource;
        }
        //加锁
        synchronized (databasepool.class) {
            if (null==hikariDataSource) {
                HikariConfig hikariConfig = new HikariConfig();
                hikariConfig.setUsername("root");
                hikariConfig.setPassword("123456");
                hikariConfig.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC");
                hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
                 hikariDataSource = new HikariDataSource(hikariConfig);
                return hikariDataSource;
            }
        }
        return  null;
    }
    public static void main(String[] args) {

        getHikariDataSource();

    }


}
