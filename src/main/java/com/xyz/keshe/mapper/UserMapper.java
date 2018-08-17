package com.xyz.keshe.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xyz.keshe.pojo.User;
import com.xyz.keshe.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
//    long countByExample(UserExample example);
//
//    int deleteByExample(UserExample example);
//
//    int deleteByPrimaryKey(Integer uId);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    List<User> selectByExample(UserExample example);
//
//    User selectByPrimaryKey(Integer uId);
//
//    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
//
//    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
    
    List<User> selectAll();
    
    List<User> selectuser(String uNum,String uPwd);
    
    List<User> selectusers(String uName,String uNum,String  uMail);
    
    int  insertUser(String uName,String uNum,String  uMail,String uPwd);
    
}