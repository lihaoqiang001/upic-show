package com.xyz.keshe.mapper;

import com.xyz.keshe.pojo.Pic;
import com.xyz.keshe.pojo.PicExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicMapper {
//    long countByExample(PicExample example);
//
//    int deleteByExample(PicExample example);
//
//    int deleteByPrimaryKey(Integer pId);
//
//    int insert(Pic record);
//
//    int insertSelective(Pic record);
//
//    List<Pic> selectByExample(PicExample example);
//
//    Pic selectByPrimaryKey(Integer pId);
//
//    int updateByExampleSelective(@Param("record") Pic record, @Param("example") PicExample example);
//
//    int updateByExample(@Param("record") Pic record, @Param("example") PicExample example);
//
//    int updateByPrimaryKeySelective(Pic record);
//
//    int updateByPrimaryKey(Pic record);
	String search1(String type);
	
	String search2();
	
	int insert(int mId,String pUrl);
	
	List<String> search(String pName);
}