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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fykj.web.beans.ResultBean;

/**
  * <p>
  *   UserController描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
@Controller
@RequestMapping("/userpage")
public class UserController {
    @RequestMapping("/login")    
    public String login(){      
        
        return "login";    
    } 
    
}
