package com.guet.service;

import com.guet.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public interface IUserInfoService {
  public   List<UserInfo> findAll();
   public void saveUser(UserInfo user);
}
