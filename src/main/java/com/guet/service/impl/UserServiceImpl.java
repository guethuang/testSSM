package com.guet.service.impl;

import com.guet.dao.IUserDao;
import com.guet.domain.User;
import com.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("IUserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao iUserDao;
    public void findUser(User user)
    {
        iUserDao.findUser(user);
    }

}
