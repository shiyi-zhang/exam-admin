package com.exam.yiyou.examadmin.repository.mapper;

import com.exam.yiyou.examadmin.repository.model.testCentre;
import com.exam.yiyou.examadmin.repository.model.testCentreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface testCentreMapper {
    int countByExample(testCentreExample example);

    int deleteByExample(testCentreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(testCentre record);

    int insertSelective(testCentre record);

    List<testCentre> selectByExampleWithBLOBs(testCentreExample example);

    List<testCentre> selectByExample(testCentreExample example);

    testCentre selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") testCentre record, @Param("example") testCentreExample example);

    int updateByExampleWithBLOBs(@Param("record") testCentre record, @Param("example") testCentreExample example);

    int updateByExample(@Param("record") testCentre record, @Param("example") testCentreExample example);

    int updateByPrimaryKeySelective(testCentre record);

    int updateByPrimaryKeyWithBLOBs(testCentre record);

    int updateByPrimaryKey(testCentre record);
}