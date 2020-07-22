package cn.lxk.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class ZdAccountDetail {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String bfAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dfAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String queryAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String oppositeAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String payAccountId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String payBankName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String payBankCardNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal tradeAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal tradeRemainderAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveAccountId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveAccountName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveBankName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveBankCardNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tradeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String borrowLoanType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date tradeTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tradeResult;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String payType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String outInType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String currencyType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveMerchantId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String receiveMerchantName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String proofNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ip;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tradePlaceJd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tradePlaceWd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tradeSummary;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String caseNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tradeBillType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userQxm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String publicFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBfAccount() {
        return bfAccount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBfAccount(String bfAccount) {
        this.bfAccount = bfAccount == null ? null : bfAccount.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDfAccount() {
        return dfAccount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDfAccount(String dfAccount) {
        this.dfAccount = dfAccount == null ? null : dfAccount.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQueryAccount() {
        return queryAccount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQueryAccount(String queryAccount) {
        this.queryAccount = queryAccount == null ? null : queryAccount.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOppositeAccount() {
        return oppositeAccount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOppositeAccount(String oppositeAccount) {
        this.oppositeAccount = oppositeAccount == null ? null : oppositeAccount.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPayAccountId() {
        return payAccountId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayAccountId(String payAccountId) {
        this.payAccountId = payAccountId == null ? null : payAccountId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPayBankName() {
        return payBankName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName == null ? null : payBankName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPayBankCardNumber() {
        return payBankCardNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayBankCardNumber(String payBankCardNumber) {
        this.payBankCardNumber = payBankCardNumber == null ? null : payBankCardNumber.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getTradeRemainderAmount() {
        return tradeRemainderAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeRemainderAmount(BigDecimal tradeRemainderAmount) {
        this.tradeRemainderAmount = tradeRemainderAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveAccountId() {
        return receiveAccountId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveAccountId(String receiveAccountId) {
        this.receiveAccountId = receiveAccountId == null ? null : receiveAccountId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveAccountName() {
        return receiveAccountName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveAccountName(String receiveAccountName) {
        this.receiveAccountName = receiveAccountName == null ? null : receiveAccountName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveBankName() {
        return receiveBankName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveBankName(String receiveBankName) {
        this.receiveBankName = receiveBankName == null ? null : receiveBankName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveBankCardNumber() {
        return receiveBankCardNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveBankCardNumber(String receiveBankCardNumber) {
        this.receiveBankCardNumber = receiveBankCardNumber == null ? null : receiveBankCardNumber.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTradeType() {
        return tradeType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBorrowLoanType() {
        return borrowLoanType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBorrowLoanType(String borrowLoanType) {
        this.borrowLoanType = borrowLoanType == null ? null : borrowLoanType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getTradeTime() {
        return tradeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTradeResult() {
        return tradeResult;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeResult(String tradeResult) {
        this.tradeResult = tradeResult == null ? null : tradeResult.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPayType() {
        return payType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOutInType() {
        return outInType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOutInType(String outInType) {
        this.outInType = outInType == null ? null : outInType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCurrencyType() {
        return currencyType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveMerchantId() {
        return receiveMerchantId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveMerchantId(String receiveMerchantId) {
        this.receiveMerchantId = receiveMerchantId == null ? null : receiveMerchantId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveMerchantName() {
        return receiveMerchantName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveMerchantName(String receiveMerchantName) {
        this.receiveMerchantName = receiveMerchantName == null ? null : receiveMerchantName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProofNum() {
        return proofNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProofNum(String proofNum) {
        this.proofNum = proofNum == null ? null : proofNum.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIp() {
        return ip;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMac() {
        return mac;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTradePlaceJd() {
        return tradePlaceJd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradePlaceJd(String tradePlaceJd) {
        this.tradePlaceJd = tradePlaceJd == null ? null : tradePlaceJd.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTradePlaceWd() {
        return tradePlaceWd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradePlaceWd(String tradePlaceWd) {
        this.tradePlaceWd = tradePlaceWd == null ? null : tradePlaceWd.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTradeSummary() {
        return tradeSummary;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeSummary(String tradeSummary) {
        this.tradeSummary = tradeSummary == null ? null : tradeSummary.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCaseNumber() {
        return caseNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber == null ? null : caseNumber.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTradeBillType() {
        return tradeBillType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTradeBillType(String tradeBillType) {
        this.tradeBillType = tradeBillType == null ? null : tradeBillType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserQxm() {
        return userQxm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserQxm(String userQxm) {
        this.userQxm = userQxm == null ? null : userQxm.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPublicFlag() {
        return publicFlag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPublicFlag(String publicFlag) {
        this.publicFlag = publicFlag == null ? null : publicFlag.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeleteFlag() {
        return deleteFlag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}