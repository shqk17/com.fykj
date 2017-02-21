/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-dao
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月21日 上午11:59:40
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.dao.use;

import com.fykj.web.beans.use.UserInfo;

/**
  * <p>
  *   IUserInfoMapper描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
public interface IUserInfoMapper {
    public UserInfo selectUserInfo(String userName);
}
