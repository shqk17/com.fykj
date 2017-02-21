/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-beans
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月21日 上午11:09:11
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.beans.use;

import java.util.Date;

/**
  * <p>
  *   UserInfo描述
  * </p>
  *  
  * @author fengshuhao
  * @since 0.0.1
  */
public class UserInfo {
        private int id;
        private String userName;
        private String email;
        private String sex;
        private String phoneNum;
        private Date birthday;
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
        /**
         * @return the userName
         */
        public String getUserName() {
            return userName;
        }
        /**
         * @param userName the userName to set
         */
        public void setUserName(String userName) {
            this.userName = userName;
        }
        /**
         * @return the email
         */
        public String getEmail() {
            return email;
        }
        /**
         * @param email the email to set
         */
        public void setEmail(String email) {
            this.email = email;
        }
        /**
         * @return the sex
         */
        public String getSex() {
            return sex;
        }
        /**
         * @param sex the sex to set
         */
        public void setSex(String sex) {
            this.sex = sex;
        }
        /**
         * @return the phoneNum
         */
        public String getPhoneNum() {
            return phoneNum;
        }
        /**
         * @param phoneNum the phoneNum to set
         */
        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }
        /**
         * @return the birthday
         */
        public Date getBirthday() {
            return birthday;
        }
        /**
         * @param birthday the birthday to set
         */
        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }
        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return "UserInfo [id=" + id + ", userName=" + userName + ", email="
                    + email + ", sex=" + sex + ", phoneNum=" + phoneNum
                    + ", birthday=" + birthday + "]";
        }
        
}
