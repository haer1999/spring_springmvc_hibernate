package com.afei.spring_springmvc_hibernate.service;

import com.afei.spring_springmvc_hibernate.dao.IUserDao;
import com.afei.spring_springmvc_hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cxm on 2017/10/13.
 */
@Service
public class UserService implements IUserService{
    @Autowired
    IUserDao userDao;

    public void test() {
        System.out.println("hello test");

    }

    public void save(User user) {
        userDao.save(user);
    }
}
