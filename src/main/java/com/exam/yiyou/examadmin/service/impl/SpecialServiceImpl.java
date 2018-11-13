package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.SpecialBean;
import com.exam.yiyou.examadmin.repository.mapper.SpecialMapper;
import com.exam.yiyou.examadmin.repository.model.Special;
import com.exam.yiyou.examadmin.repository.model.SpecialExample;
import com.exam.yiyou.examadmin.service.SpecialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 张世一
 * @version 1.0
 */
public class SpecialServiceImpl implements SpecialService {
    @Autowired
    private SpecialMapper specialMapper;

    @Override
    public List<Special> list() {
        SpecialExample specialExample=new SpecialExample();
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
