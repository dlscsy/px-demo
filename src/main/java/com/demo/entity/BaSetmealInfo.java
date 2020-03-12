package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Table(name = "ba_setmeal_info")
public class BaSetmealInfo {
    @Id
    private String guid;

    @Column(name = "meal_code")
    private String mealCode;

    @Column(name = "meal_name")
    private String mealName;

    @Column(name = "meal_type")
    private String mealType;

    @Column(name = "effective_date")
    private Date effectiveDate;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "status")
    private String status;

    private String operator;

    private Date operatetime;

    private List mealTypeTree;

    /**
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * @param guid
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * @return meal_code
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * @param mealCode
     */
    public void setMealCode(String mealCode) {
        this.mealCode = mealCode == null ? null : mealCode.trim();
    }

    /**
     * @return meal_name
     */
    public String getMealName() {
        return mealName;
    }

    /**
     * @param mealName
     */
    public void setMealName(String mealName) {
        this.mealName = mealName == null ? null : mealName.trim();
    }

    /**
     * @return meal_type
     */
    public String getMealType() {
        return mealType;
    }

    /**
     * @param mealType
     */
    public void setMealType(String mealType) {
        this.mealType = mealType == null ? null : mealType.trim();
    }

    /**
     * @return effective_date
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @param effectiveDate
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * @return expiry_date
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * @return operatetime
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * @param operatetime
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public List getMealTypeTree() {
        return mealTypeTree;
    }

    public void setMealTypeTree(List mealTypeTree) {
        this.mealTypeTree = mealTypeTree;
    }

    @Override
    public String toString() {
        return "BaSetmealInfo{" +
                "guid='" + guid + '\'' +
                ", mealCode='" + mealCode + '\'' +
                ", mealName='" + mealName + '\'' +
                ", mealType='" + mealType + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", expiryDate=" + expiryDate +
                ", status='" + status + '\'' +
                ", operator='" + operator + '\'' +
                ", operatetime=" + operatetime +
                ", mealTypeTree='" + mealTypeTree + '\'' +
                '}';
    }
}