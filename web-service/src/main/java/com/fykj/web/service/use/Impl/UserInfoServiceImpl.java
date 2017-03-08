/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-service
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年3月8日 下午1:39:19
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.service.use.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fykj.web.beans.use.UserInfo;
import com.fykj.web.bll.use.UserInfoBll;
import com.fykj.web.service.use.UserInfoService;
    
/**
  * <p>
  *   UserInfoServiceImpl描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoBll userInfoBll;
    /* (non-Javadoc)
     * @see com.fykj.web.service.use.UserInfoService#getUserInfo(java.lang.String)
     */
    @Override
    public UserInfo getUserInfo(String userName) {
        UserInfo userInfo = userInfoBll.getUserInfo(userName);
        return userInfo;
    }

}
