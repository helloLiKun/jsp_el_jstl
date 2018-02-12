package service.impl;

import entity.User;
import service.UserService;
import util.Jdbc;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by likun on 2018/2/12 0012.
 */
public class UserServiceImpl implements UserService {
    Jdbc jdbc=new Jdbc();
    @Override
    public void initUser(HttpServletRequest req) throws SQLException {
        List<User> users=new ArrayList<>();
        String sql="select * from T_USER t";
        ResultSet rs=jdbc.getResultSet(req,sql);
        while(rs.next()){
            String id=rs.getString("id");
            String name=rs.getString("name");
            User u=new User();
            u.setId(id);
            u.setName(name);
            users.add(u);
        }
        req.getSession().setAttribute("users",users);
    }

}
