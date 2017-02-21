/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-dao
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月21日 下午2:29:57
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.dao.use;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fykj.web.beans.use.UserInfo;

/**
 * <p>
 * UserInfoDao描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
@Repository("IUserInfoMapper")
public class UserInfoDao {
    private static final Logger logger = LoggerFactory
            .getLogger(UserInfoDao.class);
    @Resource
    private IUserInfoMapper infoMapper;; 

    public UserInfo selectUserInfo(String userName) {  
        return infoMapper.selectUserInfo(userName);  
    }
}
