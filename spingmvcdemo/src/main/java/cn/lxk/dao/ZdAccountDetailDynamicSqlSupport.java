package cn.lxk.dao;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZdAccountDetailDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ZdAccountDetail zdAccountDetail = new ZdAccountDetail();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = zdAccountDetail.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> bfAccount = zdAccountDetail.bfAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfAccount = zdAccountDetail.dfAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> queryAccount = zdAccountDetail.queryAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> oppositeAccount = zdAccountDetail.oppositeAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> payAccountId = zdAccountDetail.payAccountId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> payBankName = zdAccountDetail.payBankName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> payBankCardNumber = zdAccountDetail.payBankCardNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> tradeAmount = zdAccountDetail.tradeAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> tradeRemainderAmount = zdAccountDetail.tradeRemainderAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveAccountId = zdAccountDetail.receiveAccountId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveAccountName = zdAccountDetail.receiveAccountName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveBankName = zdAccountDetail.receiveBankName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveBankCardNumber = zdAccountDetail.receiveBankCardNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tradeType = zdAccountDetail.tradeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> borrowLoanType = zdAccountDetail.borrowLoanType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> tradeTime = zdAccountDetail.tradeTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tradeResult = zdAccountDetail.tradeResult;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> payType = zdAccountDetail.payType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> outInType = zdAccountDetail.outInType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> currencyType = zdAccountDetail.currencyType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveMerchantId = zdAccountDetail.receiveMerchantId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveMerchantName = zdAccountDetail.receiveMerchantName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> proofNum = zdAccountDetail.proofNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ip = zdAccountDetail.ip;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mac = zdAccountDetail.mac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tradePlaceJd = zdAccountDetail.tradePlaceJd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tradePlaceWd = zdAccountDetail.tradePlaceWd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tradeSummary = zdAccountDetail.tradeSummary;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> caseNumber = zdAccountDetail.caseNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tradeBillType = zdAccountDetail.tradeBillType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userQxm = zdAccountDetail.userQxm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> publicFlag = zdAccountDetail.publicFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteFlag = zdAccountDetail.deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ZdAccountDetail extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> bfAccount = column("bf_account", JDBCType.VARCHAR);

        public final SqlColumn<String> dfAccount = column("df_account", JDBCType.VARCHAR);

        public final SqlColumn<String> queryAccount = column("query_account", JDBCType.VARCHAR);

        public final SqlColumn<String> oppositeAccount = column("opposite_account", JDBCType.VARCHAR);

        public final SqlColumn<String> payAccountId = column("pay_account_id", JDBCType.VARCHAR);

        public final SqlColumn<String> payBankName = column("pay_bank_name", JDBCType.VARCHAR);

        public final SqlColumn<String> payBankCardNumber = column("pay_bank_card_number", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> tradeAmount = column("trade_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> tradeRemainderAmount = column("trade_remainder_amount", JDBCType.DECIMAL);

        public final SqlColumn<String> receiveAccountId = column("receive_account_id", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveAccountName = column("receive_account_name", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveBankName = column("receive_bank_name", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveBankCardNumber = column("receive_bank_card_number", JDBCType.VARCHAR);

        public final SqlColumn<String> tradeType = column("trade_type", JDBCType.VARCHAR);

        public final SqlColumn<String> borrowLoanType = column("borrow_loan_type", JDBCType.VARCHAR);

        public final SqlColumn<Date> tradeTime = column("trade_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> tradeResult = column("trade_result", JDBCType.VARCHAR);

        public final SqlColumn<String> payType = column("pay_type", JDBCType.VARCHAR);

        public final SqlColumn<String> outInType = column("out_in_type", JDBCType.VARCHAR);

        public final SqlColumn<String> currencyType = column("currency_type", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveMerchantId = column("receive_merchant_id", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveMerchantName = column("receive_merchant_name", JDBCType.VARCHAR);

        public final SqlColumn<String> proofNum = column("proof_num", JDBCType.VARCHAR);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> mac = column("mac", JDBCType.VARCHAR);

        public final SqlColumn<String> tradePlaceJd = column("trade_place_jd", JDBCType.VARCHAR);

        public final SqlColumn<String> tradePlaceWd = column("trade_place_wd", JDBCType.VARCHAR);

        public final SqlColumn<String> tradeSummary = column("trade_summary", JDBCType.VARCHAR);

        public final SqlColumn<String> caseNumber = column("case_number", JDBCType.VARCHAR);

        public final SqlColumn<String> tradeBillType = column("trade_bill_type", JDBCType.VARCHAR);

        public final SqlColumn<String> userQxm = column("user_qxm", JDBCType.VARCHAR);

        public final SqlColumn<String> publicFlag = column("public_flag", JDBCType.VARCHAR);

        public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.VARCHAR);

        public ZdAccountDetail() {
            super("zd_account_detail");
        }
    }
}