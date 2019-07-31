package com.hao.dao;

import org.springframework.stereotype.Repository;

/**
 * @Describe com.com.hao.dao
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 */
@Repository("userDao2")
public class UserDaoImpl2 implements UserDao{

    public void saveUser() {
        System.out.println("保存成功2222");
    }
}
