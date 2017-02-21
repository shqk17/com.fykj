/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-ui
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月21日 下午4:11:04
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.ui.common;

import java.util.Calendar;
import java.util.Date;

/**
  * <p>
  *   DateUtil描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
public class DateUtil {

    public static void main(String[] args) {
              Calendar c = Calendar.getInstance();
              // 这是已知的日期
              Date d = new Date();
              c.setTime(d);
              c.set(Calendar.DAY_OF_MONTH, 1);
              d = c.getTime();
              d.setHours(0);
              d.setMinutes(0);
              d.setSeconds(0);
              System.out.println(d.toLocaleString());
              
    }
    /**
     * 得到当月第一天开始时间
     * */
    @SuppressWarnings("deprecation")
    public String firstDayMouth(){
        Calendar c = Calendar.getInstance();
        // 这是已知的日期
        Date d = new Date();
        c.setTime(d);
        c.set(Calendar.DAY_OF_MONTH, 1);
        d = c.getTime();
        d.setHours(0);
        d.setMinutes(0);
        d.setSeconds(0);
        return d.toLocaleString();        
    }
    /**
     * 得到当月最后一天截止时间
     * */
    @SuppressWarnings("deprecation")
    public String lastDayMouth(){
        
        return null;        
    }
    
}
