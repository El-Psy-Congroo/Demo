package com.mapper;

import com.pojo.UseAlarm;

public interface UseAlarmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAlarm record);

    int insertSelective(UseAlarm record);

    UseAlarm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAlarm record);

    int updateByPrimaryKeyWithBLOBs(UseAlarm record);

    int updateByPrimaryKey(UseAlarm record);
}