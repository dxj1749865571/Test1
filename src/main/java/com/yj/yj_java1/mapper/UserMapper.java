package com.yj.yj_java1.mapper;

import com.yj.yj_java1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository@Mapper
public interface UserMapper {
    int addUserInfo(User user);
}
