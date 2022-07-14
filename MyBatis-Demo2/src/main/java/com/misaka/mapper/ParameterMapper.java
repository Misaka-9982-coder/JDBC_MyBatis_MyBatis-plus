package com.misaka.mapper;

import com.misaka.pojo.User;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    int insertUser(User user);
}
