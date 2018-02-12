package service;

import entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

/**
 * Created by likun on 2018/2/12 0012.
 */
public interface UserService {
    void initUser(HttpServletRequest req) throws SQLException;
}
