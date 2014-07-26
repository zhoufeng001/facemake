package com.facemake.dal.mapper;

import com.facemake.dal.pojo.FmUser;
import com.facemake.dal.pojo.FmUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmUserMapper {
    int xxxx(FmUserCriteria example);

    int deleteByExample(FmUserCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(FmUser record);

    int insertSelective(FmUser record);

    List<FmUser> selectByExampleWithBLOBs(FmUserCriteria example);

    List<FmUser> selectByExample(FmUserCriteria example);

    FmUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FmUser record, @Param("example") FmUserCriteria example);

    int updateByExampleWithBLOBs(@Param("record") FmUser record, @Param("example") FmUserCriteria example);

    int updateByExample(@Param("record") FmUser record, @Param("example") FmUserCriteria example);

    int updateByPrimaryKeySelective(FmUser record);

    int updateByPrimaryKeyWithBLOBs(FmUser record);

    int updateByPrimaryKey(FmUser record);
}