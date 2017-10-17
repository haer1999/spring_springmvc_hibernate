package com.afei.test;

import com.afei.spring_springmvc_hibernate.entity.User;
import com.afei.spring_springmvc_hibernate.service.IUserService;
import com.afei.spring_springmvc_hibernate.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cxm on 2017/10/13.
 */
public class TestSpring {
    Logger log = Logger.getLogger(TestSpring.class);

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
        IUserService userService = ac.getBean(UserService.class);
        userService.test();
        User user = new User();
        user.setName("xiao11");
        user.setPassword("xiao11");
        userService.save(user);
        log.info("addUser Success");
        log.info("i am happy");

    }
}
