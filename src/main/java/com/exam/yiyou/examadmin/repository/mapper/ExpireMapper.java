package com.exam.yiyou.examadmin.repository.mapper;

import com.exam.yiyou.examadmin.repository.model.Expire;
import com.exam.yiyou.examadmin.repository.model.ExpireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpireMapper {
    int countByExample(ExpireExample example);

    int deleteByExample(ExpireExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Expire record);

    int insertSelective(Expire record);

    List<Expire> selectByExample(ExpireExample example);

    Expire selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Expire record, @Param("example") ExpireExample example);

    int updateByExample(@Param("record") Expire record, @Param("example") ExpireExample example);

    int updateByPrimaryKeySelective(Expire record);

    int updateByPrimaryKey(Expire record);
}