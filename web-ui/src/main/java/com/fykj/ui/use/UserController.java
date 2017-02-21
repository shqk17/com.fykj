/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-ui
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月20日 下午4:23:20
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.ui.use;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fykj.web.beans.ResultBean;
import com.fykj.web.beans.use.UserInfo;
import com.fykj.web.service.use.UserInfoService;

/**
 * <p>
 * UserController描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
@Controller
@RequestMapping("/userpage")
public class UserController {
    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);
    private UserInfoService userInfoService = new UserInfoService();

    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    @RequestMapping("/userinfo")
    @ResponseBody
    public ResultBean<UserInfo> getUserInfo(HttpServletRequest request,
            String userName) {
         ResultBean<UserInfo> result = new ResultBean<UserInfo>(false, "查询失败",
                null);
        logger.info("开始查询");
        if (userName.trim().equals("")) {
            result.setProperties(false, "请输入正确的用户名", null);
            return result;
        }
        UserInfo userInfo= userInfoService.getUserInfo(userName);
        logger.info("开始查询:"+userName);
        result.setProperties(true, "success", userInfo);
        return result;

    }

}
