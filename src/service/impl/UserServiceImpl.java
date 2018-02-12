package service.impl;

import entity.User;
import service.UserService;
import util.Jdbc;

import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by likun on 2018/2/12 0012.
 */
public class UserServiceImpl implements UserService {
    Jdbc jdbc=new Jdbc();
    @Override
    public void initUser(HttpSession httpSession) {
        Map<String,User> users=new HashMap<>();
        String sql="select * from T_USER t";
        ResultSet rs=jdbc.getResultSet(sql);
        if(rs!=null){

        }
        httpSession.setAttribute("users",users);
    }

    @Override
    public User getUserById(String id) {

        return null;
    }
}
