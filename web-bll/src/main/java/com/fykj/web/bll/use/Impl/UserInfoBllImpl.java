/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-bll
  * @作者：aaa
  * @联系方式：aaa@
  * @创建时间：2017年3月8日 下午1:45:05
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.bll.use.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fykj.web.beans.use.UserInfo;
import com.fykj.web.bll.use.UserInfoBll;
import com.fykj.web.dao.use.UserInfoBllMapper;

/**
  * <p>
  *   UserInfoBllImpl描述
  * </p>
  *  
  * @author aaa
  * @since 0.0.1
  */
@Service
public class UserInfoBllImpl implements UserInfoBll {
    @Autowired
    private UserInfoBllMapper userInfoBllMapper;
    /* (non-Javadoc)
     * @see com.fykj.web.bll.use.UserInfoBll#getUserInfo(java.lang.String)
     */
    @Override
    public UserInfo getUserInfo(String userName) {
        UserInfo userInfo=userInfoBllMapper.getUserInfo(userName);
        return userInfo;
    }

}
