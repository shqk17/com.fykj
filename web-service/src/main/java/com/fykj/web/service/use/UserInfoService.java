/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-service
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年3月8日 下午1:35:00
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.service.use;

import com.fykj.web.beans.use.UserInfo;

/**
  * <p>
  *   UserInfoService描述
  * </p>
  *  
  * @author fengshuhao 
  * @since 0.0.1
  */
public interface UserInfoService {

    /**
      * <p>
      *    方法说明
      * </p>
      *
      * @action
      *    aaa 2017年3月8日 下午1:35:08 描述
      *
      * @param userName
      * @return UserInfo
      */
    UserInfo getUserInfo(String userName);

}
