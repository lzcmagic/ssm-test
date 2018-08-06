package com.lzc.basicssm.entity;

import java.util.Date;
import java.util.List;

public class DiaryType {

    private List<Diary> diaries;

    public List<Diary> getDiaries() {
        return diaries;
    }

    public void setDiaries(List<Diary> diaries) {
        this.diaries = diaries;
    }

    private int userId;
    private String nickName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column diary_type.id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column diary_type.type_name
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column diary_type.diary_number
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Integer diaryNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column diary_type.create_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column diary_type.important_level
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    private int importantLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column diary_type.id
     *
     * @return the value of diary_type.id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column diary_type.id
     *
     * @param id the value for diary_type.id
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column diary_type.type_name
     *
     * @return the value of diary_type.type_name
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column diary_type.type_name
     *
     * @param typeName the value for diary_type.type_name
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column diary_type.diary_number
     *
     * @return the value of diary_type.diary_number
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Integer getDiaryNumber() {
        return diaryNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column diary_type.diary_number
     *
     * @param diaryNumber the value for diary_type.diary_number
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setDiaryNumber(Integer diaryNumber) {
        this.diaryNumber = diaryNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column diary_type.create_time
     *
     * @return the value of diary_type.create_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column diary_type.create_time
     *
     * @param createTime the value for diary_type.create_time
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column diary_type.important_level
     *
     * @return the value of diary_type.important_level
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public int getImportantLevel() {
        return importantLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column diary_type.important_level
     *
     * @param importantLevel the value for diary_type.important_level
     *
     * @mbggenerated Thu Aug 02 13:44:56 CST 2018
     */
    public void setImportantLevel(int importantLevel) {
        this.importantLevel = importantLevel;
    }
}