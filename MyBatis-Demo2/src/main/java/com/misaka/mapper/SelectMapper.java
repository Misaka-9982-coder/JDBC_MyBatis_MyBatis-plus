package com.misaka.mapper;

import com.misaka.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();
}
