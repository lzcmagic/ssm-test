package com.lzc.basicssm.entity;

import java.util.Date;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.login_id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Integer loginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.head_img
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private String headImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.nick_name
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.gender
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.age
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.register_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Date registerTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.last_login_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.personal_sign
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private String personalSign;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.login_id
     *
     * @return the value of user_info.login_id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.login_id
     *
     * @param loginId the value for user_info.login_id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.head_img
     *
     * @return the value of user_info.head_img
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.head_img
     *
     * @param headImg the value for user_info.head_img
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.nick_name
     *
     * @return the value of user_info.nick_name
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.nick_name
     *
     * @param nickName the value for user_info.nick_name
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.gender
     *
     * @return the value of user_info.gender
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.gender
     *
     * @param gender the value for user_info.gender
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.age
     *
     * @return the value of user_info.age
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.age
     *
     * @param age the value for user_info.age
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.register_time
     *
     * @return the value of user_info.register_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.register_time
     *
     * @param registerTime the value for user_info.register_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.last_login_time
     *
     * @return the value of user_info.last_login_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.last_login_time
     *
     * @param lastLoginTime the value for user_info.last_login_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.personal_sign
     *
     * @return the value of user_info.personal_sign
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public String getPersonalSign() {
        return personalSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.personal_sign
     *
     * @param personalSign the value for user_info.personal_sign
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setPersonalSign(String personalSign) {
        this.personalSign = personalSign == null ? null : personalSign.trim();
    }
}