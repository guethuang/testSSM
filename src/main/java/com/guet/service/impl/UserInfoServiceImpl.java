package com.guet.service.impl;

import com.guet.dao.IUserInfoDao;
import com.guet.domain.UserInfo;
import com.guet.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("IUserInfoService")
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private IUserInfoDao iUserInfoDao;
    public List<UserInfo> findAll() {

        System.out.println("查询所有用户");
        return iUserInfoDao.findAll();
    }


    public void saveUser(UserInfo user) {

        System.out.println("保存所有用户");
        iUserInfoDao.saveUser(user);
    }
}
