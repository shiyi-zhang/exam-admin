package com.exam.yiyou.examadmin.repository.mapper;

import com.exam.yiyou.examadmin.repository.model.Special;
import com.exam.yiyou.examadmin.repository.model.SpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialMapper {
    int countByExample(SpecialExample example);

    int deleteByExample(SpecialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Special record);

    int insertSelective(Special record);

    List<Special> selectByExample(SpecialExample example);

    Special selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByExample(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByPrimaryKeySelective(Special record);

    int updateByPrimaryKey(Special record);
}