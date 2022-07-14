package com.misaka.mapper;

import com.misaka.pojo.User;

import java.util.List;

public interface ParameterMapper {
    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(String username, String password);
}
