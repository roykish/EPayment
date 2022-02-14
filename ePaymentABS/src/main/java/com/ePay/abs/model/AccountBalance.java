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
@Table(name = "MB_ACCOUNT_BALANCE")
public class AccountBalance {
    @Id
    @Column(name = "AC_ID")
    private Integer accId;
    @Column(name = "Branch_Code")
    private String branchCode;
    @Column(name = "AC_TYPE_ID")
    private Integer accTypeId;
    @Column(name = "CUR_BAL")
    private Double currentBalance;
    @Column(name = "BLOCK_AMT")
    private Double blockAMT;
    @Column(name = "CLEAR_AMT")
    private Double clearAMT;
    @Column(name = "SHADOW_CR")
    private Double shadowCR;
    @Column(name = "SHADOW_DR")
    private Double ShadowDR;
    @Column(name = "REC_STATUS")
    private String recStatus;
    @Column(name = "CREATE_BY")
    private String createBy;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "BLOCK_REMARKS")
    private String blockRemarks;

}
