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
@Table(name = "MB_PRODUCT_MST")
public class ProductMST {
    @Id
    @Column(name = "AC_TYPE_ID")
    private Integer accountTypeId;
    @Column(name = "BRANCH_CODE")
    private String branchCode;
    @Column(name = "AC_TYPE")
    private String accountType;
    @Column(name = "CUR_CODE")
    private String curCode;
    @Column(name = "SHORT_DESC")
    private String shortDesciption;
    @Column(name = "FULL_DESC")
    private String fullDescription;
    @Column(name = "ASST_LIB")
    private String asstLib;
    @Column(name = "DEP_NATURE")
    private String depNature;
    @Column(name = "ALLOW_DEBIT_BAL")
    private String allowDebitBalance;
    @Column(name = "ALLOW_INT_PROVISION")
    private String allowIntProvision;
    @Column(name = "INT_CAL_BAL")
    private String intCalBal;
    @Column(name = "INT_POST_PERIOD")
    private String intPostPeriod;
    @Column(name = "DORMANT_PERIOD")
    private Integer dormantPeriod;
    @Column(name = "INACTIVE_PERIOD")
    private Integer inactivePeriod;
    @Column(name = "OD_LIMIT")
    private String odLimit;
    @Column(name = "PRV_DEBIT_GLAC_ID")
    private Integer prvDebitGlacId;
    @Column(name = "PRV_CREDIT_GLAC_ID")
    private Integer prvCreditGlacId;
    @Column(name = "PRV_CREDIT_SUSP_GLAC_ID")
    private Integer prvCreditSuspGlacId;
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
    @Column(name = "MIN_BAL")
    private Integer minBal;
    @Column(name = "AC_PREFIX")
    private String acPrefix;
    @Column(name = "CHECK_STATUS")
    private String checkStatus;
    @Column(name = "PRODUCT_GLAC_ID")
    private Integer productGlacId;
    @Column(name = "INI_DEP_REQUIRED")
    private String iniDepRequired;
    @Column(name = "INI_AMOUNT")
    private Integer iniAmount;
    @Column(name = "INS_START_DAY")
    private Integer insStartDay;
    @Column(name = "INS_END_DAY")
    private Integer insEndDay;
    @Column(name = "MAX_DEFAULT_INS_ALLOW")
    private Integer maxDefaultInsAllow;
    @Column(name = "DEFAULT_ACTION")
    private String defaultAction;
    @Column(name = "CASH_TRANSACTION_ALLOW")
    private String cashTransactionAllow;
    @Column(name = "DEFAULT_INS_MATURITY_ALLOW")
    private String defaultInsMaturityAllow;
    @Column(name = "MIN_DEP_AMOUNT")
    private Integer minDepAmount;
    @Column(name = "MAX_DEP_AMOUNT")
    private Integer maxDepAmount;
    @Column(name = "DEP_MULTIPLY_BY")
    private Integer depMultiplyBy;
    @Column(name = "INS_FREQUENCY")
    private String insFrequency;
    @Column(name = "MAX_CASH_TRN")
    private Integer maxCashTrn;
    @Column(name = "MAX_CASH_TRAN_FRQ")
    private String maxCashTranFrq;
    @Column(name = "DORMANT_PROVISION")
    private String dormantProvision;
    @Column(name = "INACTIVE_PROVISION")
    private String inactiveProvision;
    @Column(name = "MUT_AC_ALLOW")
    private String mutAcAllow;
    @Column(name = "MAX_AC")
    private Integer maxAc;
    @Column(name = "INS_HOLIDAY_ALLOW")
    private String insHolydayAllow;
    @Column(name = "MATURITY_MAX_DAY")
    private Integer maturityMaxDay;
    @Column(name = "FINE_ALLOW")
    private String fineAllow;
    @Column(name = "TP_ALLOW")
    private String tpAllow;
    @Column(name = "LAST_PROVISION_DATE")
    private Date lastProvisionDate;
    @Column(name = "TAX_ON_INTEREST_FLAG")
    private String taxOnInterestFlag;
    @Column(name = "MAT_AMT")
    private String matAmt;
    @Column(name = "FLOAT_SHARING_ALLOW")
    private String floatSharingAllow;
    @Column(name = "FLOAT_SHARE_BAL")
    private String floatShareBal;
    @Column(name = "FLOAT_POST_PERIOD")
    private String floatPostPeriod;
    @Column(name = "EXCISE_DUTY_ALLOW")
    private String exciseDutyAllow;
    @Column(name = "EXCISE_DUTY_CAL_BAL")
    private String exciseDutyCalBal;
    @Column(name = "ATM_TRAN_ALLOW")
    private String atmTranAllow;
    @Column(name = "TRAN_CHG_APPLICABLE")
    private String tranChgApplicable;
    @Column(name = "IC_CHARGE_ALLOW")
    private String icChargeAllow;
    @Column(name = "TDS_DPS_NATURE")
    private String tdsDpsNature;
    @Column(name = "INI_AMOUNT_PARKING_GL")
    private Integer iniAmountParkingGl;
    @Column(name = "CHEQUE_ALLOW")
    private String chequeAllow;
    @Column(name = "DEBIT_CARD_CHARGE_ALLOW")
    private String debitCardChargeAllow;
    @Column(name = "PROJECT_ALLOW")
    private String projectAllow;
    @Column(name = "MANUAL_AC_OPEN")
    private String manualAcOpen;
    @Column(name = "INT_CALC_RANGE")
    private String intCalRange;
    @Column(name = "COMP_INT")
    private Integer compInt;
    @Column(name = "COMPOUNDING")
    private String compounding;
    @Column(name = "RTGS_CHG_ALLOW")
    private String rtgsChgAllow;
    @Column(name = "HOLDER_TYPE")
    private String holderType;
    @Column(name = "GENDER")
    private String gender;

}
