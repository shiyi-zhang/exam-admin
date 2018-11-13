package com.exam.yiyou.examadmin.repository.mapper;

import com.exam.yiyou.examadmin.repository.model.RoleSourceExample;
import com.exam.yiyou.examadmin.repository.model.RoleSourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleSourceMapper {
    int countByExample(RoleSourceExample example);

    int deleteByExample(RoleSourceExample example);

    int deleteByPrimaryKey(RoleSourceKey key);

    int insert(RoleSourceKey record);

    int insertSelective(RoleSourceKey record);

    List<RoleSourceKey> selectByExample(RoleSourceExample example);

    int updateByExampleSelective(@Param("record") RoleSourceKey record, @Param("example") RoleSourceExample example);

    int updateByExample(@Param("record") RoleSourceKey record, @Param("example") RoleSourceExample example);
}