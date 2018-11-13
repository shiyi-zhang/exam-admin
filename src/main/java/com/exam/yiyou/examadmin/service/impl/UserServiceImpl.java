package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.UserBean;
import com.exam.yiyou.examadmin.repository.mapper.UserMapper;
import com.exam.yiyou.examadmin.repository.model.User;
import com.exam.yiyou.examadmin.repository.model.UserExample;
import com.exam.yiyou.examadmin.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张世一
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        UserExample userExample=new UserExample();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public boolean update(UserBean userBean) {
        return  userMapper.updateByPrimaryKeySelective(userBean)>0;
    }

    @Override
    public boolean save(UserBean userBean) {
        return userMapper.insertSelective(userBean)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public User single(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
