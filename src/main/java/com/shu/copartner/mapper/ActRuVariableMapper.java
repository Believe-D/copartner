package com.shu.copartner.mapper;

import com.shu.copartner.pojo.ActRuVariable;
import com.shu.copartner.pojo.ActRuVariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuVariableMapper {
    long countByExample(ActRuVariableExample example);

    int deleteByExample(ActRuVariableExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActRuVariable record);

    int insertSelective(ActRuVariable record);

    List<ActRuVariable> selectByExample(ActRuVariableExample example);

    ActRuVariable selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActRuVariable record, @Param("example") ActRuVariableExample example);

    int updateByExample(@Param("record") ActRuVariable record, @Param("example") ActRuVariableExample example);

    int updateByPrimaryKeySelective(ActRuVariable record);

    int updateByPrimaryKey(ActRuVariable record);
}