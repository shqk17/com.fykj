/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-ui
  * @作者：aaa
  * @联系方式：aaa@
  * @创建时间：2017年3月8日 下午1:29:37
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.ui.use;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fykj.web.beans.ResultBean;
import com.fykj.web.beans.use.UserInfo;
import com.fykj.web.service.use.UserInfoService;

/**
  * <p>
  *   UserInfoController描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
@Controller
@RequestMapping("/use")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService; 
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
        if (userName.trim().equals("")) {
            result.setProperties(false, "请输入正确的用户名", null);
            return result;
        }
        UserInfo userInfo= userInfoService.getUserInfo(userName);
        result.setProperties(true, "success", userInfo);
        return result;

    }

}
