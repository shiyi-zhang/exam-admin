package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.ExamBean;
import com.exam.yiyou.examadmin.repository.mapper.ExamMapper;
import com.exam.yiyou.examadmin.repository.model.Exam;
import com.exam.yiyou.examadmin.repository.model.ExamExample;
import com.exam.yiyou.examadmin.service.ExamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张世一
 * @version 1.0
 */
@Service
public class ExamServiceImpl implements ExamService {
@Autowired
private ExamMapper examMapper;
    @Override
    public Exam single(Integer id) {
        return examMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Exam> list() {
        ExamExample examExample=new ExamExample();
        return examMapper.selectByExample(examExample);
    }

    @Override
    public boolean update(ExamBean bean) {
        return examMapper.updateByPrimaryKeySelective(bean)>0;
    }

    @Override
    public boolean save(ExamBean bean) {
        return examMapper.insertSelective(bean)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return examMapper.deleteByPrimaryKey(id)>0;
    }
}
