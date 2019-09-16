package com.zlx.serviceimpl;

import com.zlx.bean.User;
import com.zlx.mapper.UserMapper;
import com.zlx.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public void insertuser(User user) {
        this.userMapper.adduser(user);
    }

    @Override
    public List<User> queryall() {
        return this.userMapper.selectall();
    }

    @Override
    public User sById(int id) {
        return userMapper.selectbyid(id);
    }

    @Override
    public void delete(int id) {
        userMapper.deletebyud(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateuser(user);
    }
}
