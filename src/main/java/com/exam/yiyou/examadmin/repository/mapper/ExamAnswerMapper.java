package com.exam.yiyou.examadmin.repository.mapper;

import com.exam.yiyou.examadmin.repository.model.ExamAnswer;
import com.exam.yiyou.examadmin.repository.model.ExamAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamAnswerMapper {
    int countByExample(ExamAnswerExample example);

    int deleteByExample(ExamAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamAnswer record);

    int insertSelective(ExamAnswer record);

    List<ExamAnswer> selectByExample(ExamAnswerExample example);

    ExamAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamAnswer record, @Param("example") ExamAnswerExample example);

    int updateByExample(@Param("record") ExamAnswer record, @Param("example") ExamAnswerExample example);

    int updateByPrimaryKeySelective(ExamAnswer record);

    int updateByPrimaryKey(ExamAnswer record);
}