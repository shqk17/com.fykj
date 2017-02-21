/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-bll
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月21日 上午11:39:56
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.bll.use;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fykj.web.beans.use.UserInfo;
import com.fykj.web.dao.use.UserInfoDao;

/**
 * <p>
 * UserInfoBll描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class UserInfoBll {
    private UserInfoDao userInfoDao =new UserInfoDao();
    private static final Logger logger = LoggerFactory
            .getLogger(UserInfoBll.class);

    /**
     * <p>
     * 方法说明
     * </p>
     *
     * @action fengshuhao 2017年2月21日 上午11:41:57 描述
     *
     * @param userName
     * @return UserInfo
     */
    public UserInfo getUserInfo(String userName) {
        logger.info("开始查询3:" + userName);
        
        UserInfo info = userInfoDao.selectUserInfo(userName);
        return info;
        
    }

}
