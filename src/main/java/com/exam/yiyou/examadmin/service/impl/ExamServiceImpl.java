package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.entry.ExamBean;
import com.exam.yiyou.examadmin.repository.mapper.ExamAnswerMapper;
import com.exam.yiyou.examadmin.repository.mapper.ExamMapper;
import com.exam.yiyou.examadmin.repository.model.Exam;
import com.exam.yiyou.examadmin.repository.model.ExamAnswer;
import com.exam.yiyou.examadmin.repository.model.ExamAnswerExample;
import com.exam.yiyou.examadmin.repository.model.ExamExample;
import com.exam.yiyou.examadmin.repository.model.ExamExample.Criteria;
import com.exam.yiyou.examadmin.service.ExamService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
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
    @Autowired
    private ExamAnswerMapper examAnswerMapper;

    @Override
    public ExamBean single(Integer id) {
        Exam exam = examMapper.selectByPrimaryKey(id);
        ExamAnswerExample examAnswerExample=new ExamAnswerExample();
        examAnswerExample.createCriteria().andExamIdEqualTo(id);
        List<ExamAnswer> examAnswers = examAnswerMapper.selectByExample(examAnswerExample);
        ModelMapper modelMapper=new ModelMapper();
        ExamBean examBean = modelMapper.map(exam, ExamBean.class);
        examBean.setAnswers(examAnswers);
        return examBean;
    }

    @Override
    public List<Exam> list(String examContent, String type, Integer specialId, Integer paperId) {
        ExamExample examExample = new ExamExample();
        Criteria criteria = examExample.createCriteria();
        if (StringUtils.isNotBlank(examContent)) {
            criteria.andContentLike("%" + examContent + "%");
        }
        if (StringUtils.isNotBlank(type)) {
            criteria.andTypeEqualTo(type);
        }
        if (null != specialId) {
            criteria.andSpecialIdEqualTo(specialId);
        }
        if (null != paperId) {
            criteria.andPaperIdEqualTo(paperId);
        }
        return examMapper.selectByExample(examExample);
    }

    @Override
    public boolean update(ExamBean bean) {
        List<ExamAnswer> answers = bean.getAnswers();
        for (ExamAnswer answer : answers) {
            examAnswerMapper.updateByPrimaryKeySelective(answer);
        }
        return examMapper.updateByPrimaryKeySelective(bean) > 0;
    }

    @Override
    public boolean save(ExamBean bean) {
        int flag = examMapper.insertSelective(bean);
        for (ExamAnswer answer : bean.getAnswers()) {
            answer.setExamId(bean.getId());
            examAnswerMapper.insertSelective(answer);
        }
        return flag > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return examMapper.deleteByPrimaryKey(id) > 0;
    }
}
