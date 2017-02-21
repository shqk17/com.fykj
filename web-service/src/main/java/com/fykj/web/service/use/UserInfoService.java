/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-service
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月21日 上午11:28:51
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.service.use;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fykj.web.beans.use.UserInfo;
import com.fykj.web.bll.use.UserInfoBll;

/**
 * <p>
 * UserInfoService描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class UserInfoService {

    private static final Logger logger = LoggerFactory
            .getLogger(UserInfoService.class);
    private UserInfoBll userInfoBll = new UserInfoBll();

    /**
     * <p>
     * 方法说明
     * </p>
     * 
     * @param userName
     *
     * @action fengshuhao 2017年2月21日 上午11:37:17 描述
     *
     * @return UserInfo
     */
    public UserInfo getUserInfo(String userName) {
        logger.info("开始查询2:" + userName);
        UserInfo user = userInfoBll.getUserInfo(userName);
        return user;
    }

}
