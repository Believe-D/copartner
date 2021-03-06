package com.shu.copartner.mapper;

import com.shu.copartner.pojo.ActRuExecution;
import com.shu.copartner.pojo.ActRuExecutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuExecutionMapper {
    long countByExample(ActRuExecutionExample example);

    int deleteByExample(ActRuExecutionExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActRuExecution record);

    int insertSelective(ActRuExecution record);

    List<ActRuExecution> selectByExample(ActRuExecutionExample example);

    ActRuExecution selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActRuExecution record, @Param("example") ActRuExecutionExample example);

    int updateByExample(@Param("record") ActRuExecution record, @Param("example") ActRuExecutionExample example);

    int updateByPrimaryKeySelective(ActRuExecution record);

    int updateByPrimaryKey(ActRuExecution record);
}