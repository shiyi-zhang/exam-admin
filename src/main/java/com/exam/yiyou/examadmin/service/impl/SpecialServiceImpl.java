package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.SpecialBean;
import com.exam.yiyou.examadmin.repository.mapper.SpecialMapper;
import com.exam.yiyou.examadmin.repository.model.Special;
import com.exam.yiyou.examadmin.repository.model.SpecialExample;
import com.exam.yiyou.examadmin.service.SpecialService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张世一
 * @version 1.0
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Autowired
    private SpecialMapper specialMapper;

    @Override
    public List<Special> list(String name) {
        SpecialExample specialExample=new SpecialExample();
        if (StringUtils.isNotBlank(name)) {
            specialExample.createCriteria().andNameLike("%" + name + "%");
        }
        return specialMapper.selectByExample(specialExample);
    }

    @Override
    public boolean update(SpecialBean bean) {
        return specialMapper.updateByPrimaryKeySelective(bean)>0;
    }

    @Override
    public boolean save(SpecialBean bean) {
        return specialMapper.insertSelective(bean)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return specialMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public Special single(Integer id) {
        return specialMapper.selectByPrimaryKey(id);
    }
}
