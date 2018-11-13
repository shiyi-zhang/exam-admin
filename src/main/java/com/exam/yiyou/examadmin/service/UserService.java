package com.exam.yiyou.examadmin.service;

import com.exam.yiyou.examadmin.entry.UserBean;
import com.exam.yiyou.examadmin.repository.model.User;
import java.util.List;

/**
 * @author 张世一
 * @version 1.0
 */
public interface UserService {

    List<User> list();

    boolean update(UserBean userBean);

    boolean save(UserBean userBean);

    boolean delete(Integer id);

    User single(Integer id);
}
