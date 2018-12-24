package com.hpe.microservice.model.vo;

import java.util.Date;

/**
 * @author wanghan
 * @date 2018/12/21 15:40
 */
public class Staff {
    private Integer id;
    private String userName; //用户名
    private String realName; //真实姓名
    private Integer sex; //性别，0女性，1男性
    private Date birth; //生日
    private String address; //家庭地址
    private String phone; //电话
    private String cardNum; //身份证号
    private Date modifyDate; //修改日期
    private String modifyUser; //修改用户
    private Date createDate; //创建日期
    private String createUser;  //创建用户
    private Character isEnable; //是否可用
    private Integer serialNumber; //序号
    private Integer type;     //组织类型  1 总部   2 城市   3 门店
    private Integer vendorId; //商户ID(平台及员工 商户ID为0)
    private String cityId;
    private Integer storeId; //门店ID（若为0 则该用户不属于任何门店）
    private String managementStores;
    private String jobNumber;  //工号
    private String belongOrgs;   //所属组织id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Character getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Character isEnable) {
        this.isEnable = isEnable;
    }


    public Integer getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getManagementStores() {
        return managementStores;
    }

    public void setManagementStores(String managementStores) {
        this.managementStores = managementStores;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getBelongOrgs() {
        return belongOrgs;
    }

    public void setBelongOrgs(String belongOrgs) {
        this.belongOrgs = belongOrgs;
    }

}
