package com.exam.yiyou.examadmin.service;

import com.exam.yiyou.examadmin.entry.ExamBean;
import com.exam.yiyou.examadmin.repository.model.Exam;
import java.util.List;

/**
 * @author 张世一
 * @version 1.0
 */
public interface ExamService {

    Exam single(Integer id);

    List<Exam> list();

    boolean update(ExamBean bean);

    boolean save(ExamBean bean);

    boolean delete(Integer id);
}
