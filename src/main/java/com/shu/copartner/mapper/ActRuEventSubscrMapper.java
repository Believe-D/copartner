package com.shu.copartner.mapper;

import com.shu.copartner.pojo.ActRuEventSubscr;
import com.shu.copartner.pojo.ActRuEventSubscrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuEventSubscrMapper {
    long countByExample(ActRuEventSubscrExample example);

    int deleteByExample(ActRuEventSubscrExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActRuEventSubscr record);

    int insertSelective(ActRuEventSubscr record);

    List<ActRuEventSubscr> selectByExample(ActRuEventSubscrExample example);

    ActRuEventSubscr selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActRuEventSubscr record, @Param("example") ActRuEventSubscrExample example);

    int updateByExample(@Param("record") ActRuEventSubscr record, @Param("example") ActRuEventSubscrExample example);

    int updateByPrimaryKeySelective(ActRuEventSubscr record);

    int updateByPrimaryKey(ActRuEventSubscr record);
}