package com.misaka.mapper;

import com.misaka.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String, Object> getUserByIdMap(@Param("id") Integer id);

    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
