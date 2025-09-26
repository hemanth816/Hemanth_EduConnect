package com.wecp.progressive.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

    private static final Properties properties =new Properties();

    static {
        loadProperties();
    }

private static void loadProperties()
{
    try(InputStream input=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties"))
    {
        if(input==null)
        {
            throw new IllegalArgumentException("resource.properties not found in classpath");

        }
        properties.load(input);
    }
    catch(Exception e)
    {
        throw new RuntimeException("Error loading properties file",e);
    }
   
}
public static Connection getConnection() throws SQLException
{
<<<<<<< HEAD
    String url=properties.getProperty("spring.datasource.url");
=======
    String url=properties.getProperty("spring datasource.url");
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
    String user=properties.getProperty("spring.datasource.username");
    String password=properties.getProperty("spring.datasource.password");
    return DriverManager.getConnection(url,user,password);
}

}
