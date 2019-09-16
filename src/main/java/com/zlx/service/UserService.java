package com.zlx.service;

import com.zlx.bean.User;

import java.util.List;

public interface UserService {
     void insertuser(User user);
     List<User> queryall();
     User sById(int id);
     void delete(int id);
     void updateUser(User user);
}
