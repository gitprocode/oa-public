package com.ynw.oa.project.po;

import java.util.Date;

public class GuestBook{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guestbook.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guestbook.msgFromUserName
     *
     * @mbggenerated
     */
    private String msgFromUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guestbook.msgToUserId
     *
     * @mbggenerated
     */
    private String msgToUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guestbook.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_guestbook.context
     *
     * @mbggenerated
     */
    private String context;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guestbook.id
     *
     * @return the value of t_guestbook.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guestbook.id
     *
     * @param id the value for t_guestbook.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guestbook.msgFromUserName
     *
     * @return the value of t_guestbook.msgFromUserName
     *
     * @mbggenerated
     */
    public String getMsgFromUserName() {
        return msgFromUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guestbook.msgFromUserName
     *
     * @param msgFromUserName the value for t_guestbook.msgFromUserName
     *
     * @mbggenerated
     */
    public void setMsgFromUserName(String msgFromUserName) {
        this.msgFromUserName = msgFromUserName == null ? null : msgFromUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guestbook.msgToUserId
     *
     * @return the value of t_guestbook.msgToUserId
     *
     * @mbggenerated
     */
    public String getMsgToUserId() {
        return msgToUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guestbook.msgToUserId
     *
     * @param msgToUserId the value for t_guestbook.msgToUserId
     *
     * @mbggenerated
     */
    public void setMsgToUserId(String msgToUserId) {
        this.msgToUserId = msgToUserId == null ? null : msgToUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guestbook.createTime
     *
     * @return the value of t_guestbook.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guestbook.createTime
     *
     * @param createTime the value for t_guestbook.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_guestbook.context
     *
     * @return the value of t_guestbook.context
     *
     * @mbggenerated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_guestbook.context
     *
     * @param context the value for t_guestbook.context
     *
     * @mbggenerated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}