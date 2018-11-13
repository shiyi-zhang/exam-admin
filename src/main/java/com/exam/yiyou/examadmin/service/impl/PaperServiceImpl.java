package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.PaperBean;
import com.exam.yiyou.examadmin.repository.mapper.PaperMapper;
import com.exam.yiyou.examadmin.repository.model.Paper;
import com.exam.yiyou.examadmin.repository.model.PaperExample;
import com.exam.yiyou.examadmin.service.PaperService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 张世一
 * @version 1.0
 */
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;
    @Override
    public List<Paper> list() {
        PaperExample paperExample=new PaperExample();
        return paperMapper.selectByExample(paperExample);
    }

    @Override
    public boolean update(PaperBean bean) {
        return paperMapper.updateByPrimaryKeySelective(bean)>0;
    }

    @Override
    public boolean save(PaperBean bean) {
        return paperMapper.insertSelective(bean)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return paperMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public Paper single(Integer id) {
        return paperMapper.selectByPrimaryKey(id);
    }
}
