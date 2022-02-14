package com.ePay.abs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MB_CUSTOMER_MST")
public class CustomerMST {
    @Id
    @Column(name = "CUST_NO")
    private Integer customerNumber;
    @Column(name = "CUST_CODE")
    private String customerCode;
    @Column(name = "CUST_TYPE")
    private String customerType;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "FATHER_NAME")
    private String fatherName;
    @Column(name = "MOTHER_NAME")
    private String motherName;
    @Column(name = "CUST_DOB")
    private Date customerDateOfBirth;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "MARITUAL_STATUS")
    private String martialStatus;
    @Column(name = "SPOUSE_NAME")
    private String spouseName;
    @Column(name = "NO_OF_CHILDREN")
    private Integer noOfChildren;
    @Column(name = "SON")
    private Integer son;
    @Column(name = "DAUGHTER")
    private Integer daughter;
    @Column(name = "NO_OF_DEPENDANT")
    private Integer noOfDependant;
    @Column(name = "FAX_NO")
    private String faxNo;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "MOBILE_TYPE")
    private String mobileType;
    @Column(name = "MAIL_ID")
    private String mailId;
    @Column(name = "RELIGIOUS_CODE")
    private String religiousCode;
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;
    @Column(name = "ANNUAL_INCOME")
    private Integer annualIncome;
    @Column(name = "CUST_STATUS")
    private String custStatus;
    @Column(name = "OTHER_BANK")
    private String otherBank;
    @Column(name = "OTHER_BANK_ACC_NO")
    private String otherBankAccountNo;
    @Column(name = "MEDIA")
    private String media;
    @Column(name = "INCOME_PERSON")
    private Integer incomePerosn;
    @Column(name = "INCOME_MALE")
    private Integer incomeMale;
    @Column(name = "INCOME_FEMALE")
    private Integer incomeFemale;
    @Column(name = "LIVE_PERIOD")
    private Integer livePeriod;
    @Column(name = "HOME_TYPE")
    private String homeType;
    @Column(name = "LAND_DESC")
    private String landDescription;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "LAST_EDUCATION")
    private String lastEducation;
    @Column(name = "FATHER_LAND")
    private String fatherLand;
    @Column(name = "FAMILY_GUARDIAN")
    private String familyGuardian;
    @Column(name = "RELATION_WITH_GUARDIAN")
    private String relationWithGuardian;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "CREATE_BY")
    private String createBy;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "UPDATE_BY")
    private String updateBy;
    @Column(name = "UPDATE_DATE")
    private Date updateDate;
    @Column(name = "CHECK_BY")
    private String checkBy;
    @Column(name = "CHECK_DATE")
    private Date checkDate;
    @Column(name = "REVIEW_STATUS")
    private String reviewStatus;
    @Column(name = "MOBILE_NO2")
    private String mobileNo2;
    @Column(name = "AGN_TYPE")
    private String agnType;
    @Column(name = "REF_AGN")
    private Integer refAgn;
    @Column(name = "AGENT_POINT_ID")
    private Integer agentPointId;
    @Column(name = "TOKEN_NO")
    private String tokenNo;
    @Column(name = "AML_STATUS")
    private String amlStatus;
    @Column(name = "AML_SENDING_DATE")
    private Date amlSendingDate;
    @Column(name = "AML_STATUS_UPDATE_DATE")
    private Date amlStatusUpdateDate;
    @Column(name = "PROJECT_TYPE")
    private Integer projectType;
    @Column(name = "PROJECT_REF_NO")
    private String projectRefNo;
    @Column(name = "CBS_CUST_CODE")
    private String cbsCustCode;
}
