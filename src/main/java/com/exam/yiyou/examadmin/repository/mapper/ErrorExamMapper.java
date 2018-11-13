package com.exam.yiyou.examadmin.repository.mapper;

import com.exam.yiyou.examadmin.repository.model.ErrorExam;
import com.exam.yiyou.examadmin.repository.model.ErrorExamExample;
import com.exam.yiyou.examadmin.repository.model.ErrorExamKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorExamMapper {
    int countByExample(ErrorExamExample example);

    int deleteByExample(ErrorExamExample example);

    int deleteByPrimaryKey(ErrorExamKey key);

    int insert(ErrorExam record);

    int insertSelective(ErrorExam record);

    List<ErrorExam> selectByExample(ErrorExamExample example);

    ErrorExam selectByPrimaryKey(ErrorExamKey key);

    int updateByExampleSelective(@Param("record") ErrorExam record, @Param("example") ErrorExamExample example);

    int updateByExample(@Param("record") ErrorExam record, @Param("example") ErrorExamExample example);

    int updateByPrimaryKeySelective(ErrorExam record);

    int updateByPrimaryKey(ErrorExam record);
}