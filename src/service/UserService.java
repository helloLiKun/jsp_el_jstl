package service;

import entity.User;

import javax.servlet.http.HttpSession;

/**
 * Created by likun on 2018/2/12 0012.
 */
public interface UserService {
    void initUser(HttpSession httpSession);
    User getUserById(String id);
}
