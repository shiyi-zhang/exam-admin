package com.exam.yiyou.examadmin.service;

import com.exam.yiyou.examadmin.entry.RoleBean;
import com.exam.yiyou.examadmin.repository.model.Role;
import java.util.List;

/**
 * @author 张世一
 * @version 1.0
 */
public interface RoleService {

    List<Role> list(String name);

    boolean update(RoleBean bean);

    boolean save(RoleBean bean);

    boolean delete(Integer id);

    RoleBean single(Integer id);
}
