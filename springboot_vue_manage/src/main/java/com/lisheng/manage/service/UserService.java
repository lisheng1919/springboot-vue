package com.lisheng.manage.service;

import com.lisheng.manage.domain.User;
import com.lisheng.manage.respository.UserRespository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserRespository userRespository;

    /**
     *
     * @return 查询所有用户信息
     */
    public List<User> findAllUser() {
        return userRespository.findAll();
    }

}
