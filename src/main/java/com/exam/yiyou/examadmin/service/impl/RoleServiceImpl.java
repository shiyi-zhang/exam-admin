package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.RoleBean;
import com.exam.yiyou.examadmin.repository.mapper.RoleMapper;
import com.exam.yiyou.examadmin.repository.model.Role;
import com.exam.yiyou.examadmin.repository.model.RoleExample;
import com.exam.yiyou.examadmin.service.RoleService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张世一
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> list(String name) {
        RoleExample roleExample = new RoleExample();
        if (StringUtils.isNotBlank(name)) {
            roleExample.createCriteria().andRoleNameLike("%" + name + "%");
        }
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    public boolean update(RoleBean bean) {
        return roleMapper.updateByPrimaryKeySelective(bean) > 0;
    }

    @Override
    public boolean save(RoleBean bean) {
        return roleMapper.insertSelective(bean) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return roleMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public RoleBean single(Integer id) {
        return null;
    }
}
