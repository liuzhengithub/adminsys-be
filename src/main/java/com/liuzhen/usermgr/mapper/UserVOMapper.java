package com.liuzhen.usermgr.mapper;

import com.liuzhen.usermgr.entity.UserVO;

public interface UserVOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bd_user
     *
     * @mbg.generated Mon Apr 09 23:38:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bd_user
     *
     * @mbg.generated Mon Apr 09 23:38:19 CST 2018
     */
    int insert(UserVO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bd_user
     *
     * @mbg.generated Mon Apr 09 23:38:19 CST 2018
     */
    int insertSelective(UserVO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bd_user
     *
     * @mbg.generated Mon Apr 09 23:38:19 CST 2018
     */
    UserVO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bd_user
     *
     * @mbg.generated Mon Apr 09 23:38:19 CST 2018
     */
    int updateByPrimaryKeySelective(UserVO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bd_user
     *
     * @mbg.generated Mon Apr 09 23:38:19 CST 2018
     */
    int updateByPrimaryKey(UserVO record);
}