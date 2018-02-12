package util;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by likun on 2018/2/12 0012.
 */
public class Jdbc {
    String url;
    String username;
    String password;

    public Jdbc() {
    }

    public Connection getConnection(){
        Connection connection=null;
        init();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  connection;
    }

    public ResultSet getResultSet(String sql){
        Connection connection=getConnection();
        try {
            Statement statement=connection.createStatement();
            return  statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void init(){
        SAXBuilder builder = new SAXBuilder();
        InputStream is=this.getClass().getResourceAsStream("jdbc.xml");
        try {
            Document document=builder.build(is);
            Element root=document.getRootElement();
            Element dataSource=root.getChild("dataSource");
            url=dataSource.getChildText("url");
            username=dataSource.getChildText("username");
            password=dataSource.getChildText("password");
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
