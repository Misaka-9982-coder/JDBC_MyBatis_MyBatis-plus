package com.misaka.mapper;

import com.misaka.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    List<User> getUserByLike(@Param("username") String username);

    int deleteMore(@Param("ids") String ids);
}
