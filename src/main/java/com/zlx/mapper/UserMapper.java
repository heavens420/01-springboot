package com.zlx.mapper;

import com.zlx.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface UserMapper {
    void adduser(User user);
    List<User> selectall();
    User selectbyid(int id);
    void deletebyud(int id);
    void updateuser(User user);
}
