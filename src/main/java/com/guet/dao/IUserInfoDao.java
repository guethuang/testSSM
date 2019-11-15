package com.guet.dao;
import com.guet.domain.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
//dao与数据库交互的接口
@Repository
public interface IUserInfoDao {
    /*
     * 查询所有操作
     * */
    @Select("select * from user")
    List<UserInfo> findAll();
    @Insert("insert into user (username,address) value(#{username},#{address})")
    void saveUser(UserInfo user);
}
