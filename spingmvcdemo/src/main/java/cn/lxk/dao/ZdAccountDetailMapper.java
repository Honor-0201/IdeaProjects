package cn.lxk.dao;

import static cn.lxk.dao.ZdAccountDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.ZdAccountDetail;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ZdAccountDetailMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, bfAccount, dfAccount, queryAccount, oppositeAccount, payAccountId, payBankName, payBankCardNumber, tradeAmount, tradeRemainderAmount, receiveAccountId, receiveAccountName, receiveBankName, receiveBankCardNumber, tradeType, borrowLoanType, tradeTime, tradeResult, payType, outInType, currencyType, receiveMerchantId, receiveMerchantName, proofNum, ip, mac, tradePlaceJd, tradePlaceWd, tradeSummary, caseNumber, tradeBillType, userQxm, publicFlag, deleteFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZdAccountDetail> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ZdAccountDetail> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZdAccountDetailResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bf_account", property="bfAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="df_account", property="dfAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="query_account", property="queryAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="opposite_account", property="oppositeAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_account_id", property="payAccountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_bank_name", property="payBankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_bank_card_number", property="payBankCardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_amount", property="tradeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="trade_remainder_amount", property="tradeRemainderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="receive_account_id", property="receiveAccountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_account_name", property="receiveAccountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_bank_name", property="receiveBankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_bank_card_number", property="receiveBankCardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_type", property="tradeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="borrow_loan_type", property="borrowLoanType", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_time", property="tradeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_result", property="tradeResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_in_type", property="outInType", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency_type", property="currencyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_merchant_id", property="receiveMerchantId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_merchant_name", property="receiveMerchantName", jdbcType=JdbcType.VARCHAR),
        @Result(column="proof_num", property="proofNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="mac", property="mac", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_place_jd", property="tradePlaceJd", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_place_wd", property="tradePlaceWd", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_summary", property="tradeSummary", jdbcType=JdbcType.VARCHAR),
        @Result(column="case_number", property="caseNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_bill_type", property="tradeBillType", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_qxm", property="userQxm", jdbcType=JdbcType.VARCHAR),
        @Result(column="public_flag", property="publicFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<ZdAccountDetail> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZdAccountDetailResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bf_account", property="bfAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="df_account", property="dfAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="query_account", property="queryAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="opposite_account", property="oppositeAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_account_id", property="payAccountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_bank_name", property="payBankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_bank_card_number", property="payBankCardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_amount", property="tradeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="trade_remainder_amount", property="tradeRemainderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="receive_account_id", property="receiveAccountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_account_name", property="receiveAccountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_bank_name", property="receiveBankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_bank_card_number", property="receiveBankCardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_type", property="tradeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="borrow_loan_type", property="borrowLoanType", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_time", property="tradeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_result", property="tradeResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_in_type", property="outInType", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency_type", property="currencyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_merchant_id", property="receiveMerchantId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_merchant_name", property="receiveMerchantName", jdbcType=JdbcType.VARCHAR),
        @Result(column="proof_num", property="proofNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="mac", property="mac", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_place_jd", property="tradePlaceJd", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_place_wd", property="tradePlaceWd", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_summary", property="tradeSummary", jdbcType=JdbcType.VARCHAR),
        @Result(column="case_number", property="caseNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_bill_type", property="tradeBillType", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_qxm", property="userQxm", jdbcType=JdbcType.VARCHAR),
        @Result(column="public_flag", property="publicFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    List<ZdAccountDetail> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, zdAccountDetail, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, zdAccountDetail, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ZdAccountDetail record) {
        return MyBatis3Utils.insert(this::insert, record, zdAccountDetail, c ->
            c.map(id).toProperty("id")
            .map(bfAccount).toProperty("bfAccount")
            .map(dfAccount).toProperty("dfAccount")
            .map(queryAccount).toProperty("queryAccount")
            .map(oppositeAccount).toProperty("oppositeAccount")
            .map(payAccountId).toProperty("payAccountId")
            .map(payBankName).toProperty("payBankName")
            .map(payBankCardNumber).toProperty("payBankCardNumber")
            .map(tradeAmount).toProperty("tradeAmount")
            .map(tradeRemainderAmount).toProperty("tradeRemainderAmount")
            .map(receiveAccountId).toProperty("receiveAccountId")
            .map(receiveAccountName).toProperty("receiveAccountName")
            .map(receiveBankName).toProperty("receiveBankName")
            .map(receiveBankCardNumber).toProperty("receiveBankCardNumber")
            .map(tradeType).toProperty("tradeType")
            .map(borrowLoanType).toProperty("borrowLoanType")
            .map(tradeTime).toProperty("tradeTime")
            .map(tradeResult).toProperty("tradeResult")
            .map(payType).toProperty("payType")
            .map(outInType).toProperty("outInType")
            .map(currencyType).toProperty("currencyType")
            .map(receiveMerchantId).toProperty("receiveMerchantId")
            .map(receiveMerchantName).toProperty("receiveMerchantName")
            .map(proofNum).toProperty("proofNum")
            .map(ip).toProperty("ip")
            .map(mac).toProperty("mac")
            .map(tradePlaceJd).toProperty("tradePlaceJd")
            .map(tradePlaceWd).toProperty("tradePlaceWd")
            .map(tradeSummary).toProperty("tradeSummary")
            .map(caseNumber).toProperty("caseNumber")
            .map(tradeBillType).toProperty("tradeBillType")
            .map(userQxm).toProperty("userQxm")
            .map(publicFlag).toProperty("publicFlag")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ZdAccountDetail> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, zdAccountDetail, c ->
            c.map(id).toProperty("id")
            .map(bfAccount).toProperty("bfAccount")
            .map(dfAccount).toProperty("dfAccount")
            .map(queryAccount).toProperty("queryAccount")
            .map(oppositeAccount).toProperty("oppositeAccount")
            .map(payAccountId).toProperty("payAccountId")
            .map(payBankName).toProperty("payBankName")
            .map(payBankCardNumber).toProperty("payBankCardNumber")
            .map(tradeAmount).toProperty("tradeAmount")
            .map(tradeRemainderAmount).toProperty("tradeRemainderAmount")
            .map(receiveAccountId).toProperty("receiveAccountId")
            .map(receiveAccountName).toProperty("receiveAccountName")
            .map(receiveBankName).toProperty("receiveBankName")
            .map(receiveBankCardNumber).toProperty("receiveBankCardNumber")
            .map(tradeType).toProperty("tradeType")
            .map(borrowLoanType).toProperty("borrowLoanType")
            .map(tradeTime).toProperty("tradeTime")
            .map(tradeResult).toProperty("tradeResult")
            .map(payType).toProperty("payType")
            .map(outInType).toProperty("outInType")
            .map(currencyType).toProperty("currencyType")
            .map(receiveMerchantId).toProperty("receiveMerchantId")
            .map(receiveMerchantName).toProperty("receiveMerchantName")
            .map(proofNum).toProperty("proofNum")
            .map(ip).toProperty("ip")
            .map(mac).toProperty("mac")
            .map(tradePlaceJd).toProperty("tradePlaceJd")
            .map(tradePlaceWd).toProperty("tradePlaceWd")
            .map(tradeSummary).toProperty("tradeSummary")
            .map(caseNumber).toProperty("caseNumber")
            .map(tradeBillType).toProperty("tradeBillType")
            .map(userQxm).toProperty("userQxm")
            .map(publicFlag).toProperty("publicFlag")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ZdAccountDetail record) {
        return MyBatis3Utils.insert(this::insert, record, zdAccountDetail, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(bfAccount).toPropertyWhenPresent("bfAccount", record::getBfAccount)
            .map(dfAccount).toPropertyWhenPresent("dfAccount", record::getDfAccount)
            .map(queryAccount).toPropertyWhenPresent("queryAccount", record::getQueryAccount)
            .map(oppositeAccount).toPropertyWhenPresent("oppositeAccount", record::getOppositeAccount)
            .map(payAccountId).toPropertyWhenPresent("payAccountId", record::getPayAccountId)
            .map(payBankName).toPropertyWhenPresent("payBankName", record::getPayBankName)
            .map(payBankCardNumber).toPropertyWhenPresent("payBankCardNumber", record::getPayBankCardNumber)
            .map(tradeAmount).toPropertyWhenPresent("tradeAmount", record::getTradeAmount)
            .map(tradeRemainderAmount).toPropertyWhenPresent("tradeRemainderAmount", record::getTradeRemainderAmount)
            .map(receiveAccountId).toPropertyWhenPresent("receiveAccountId", record::getReceiveAccountId)
            .map(receiveAccountName).toPropertyWhenPresent("receiveAccountName", record::getReceiveAccountName)
            .map(receiveBankName).toPropertyWhenPresent("receiveBankName", record::getReceiveBankName)
            .map(receiveBankCardNumber).toPropertyWhenPresent("receiveBankCardNumber", record::getReceiveBankCardNumber)
            .map(tradeType).toPropertyWhenPresent("tradeType", record::getTradeType)
            .map(borrowLoanType).toPropertyWhenPresent("borrowLoanType", record::getBorrowLoanType)
            .map(tradeTime).toPropertyWhenPresent("tradeTime", record::getTradeTime)
            .map(tradeResult).toPropertyWhenPresent("tradeResult", record::getTradeResult)
            .map(payType).toPropertyWhenPresent("payType", record::getPayType)
            .map(outInType).toPropertyWhenPresent("outInType", record::getOutInType)
            .map(currencyType).toPropertyWhenPresent("currencyType", record::getCurrencyType)
            .map(receiveMerchantId).toPropertyWhenPresent("receiveMerchantId", record::getReceiveMerchantId)
            .map(receiveMerchantName).toPropertyWhenPresent("receiveMerchantName", record::getReceiveMerchantName)
            .map(proofNum).toPropertyWhenPresent("proofNum", record::getProofNum)
            .map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(mac).toPropertyWhenPresent("mac", record::getMac)
            .map(tradePlaceJd).toPropertyWhenPresent("tradePlaceJd", record::getTradePlaceJd)
            .map(tradePlaceWd).toPropertyWhenPresent("tradePlaceWd", record::getTradePlaceWd)
            .map(tradeSummary).toPropertyWhenPresent("tradeSummary", record::getTradeSummary)
            .map(caseNumber).toPropertyWhenPresent("caseNumber", record::getCaseNumber)
            .map(tradeBillType).toPropertyWhenPresent("tradeBillType", record::getTradeBillType)
            .map(userQxm).toPropertyWhenPresent("userQxm", record::getUserQxm)
            .map(publicFlag).toPropertyWhenPresent("publicFlag", record::getPublicFlag)
            .map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::getDeleteFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ZdAccountDetail> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, zdAccountDetail, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ZdAccountDetail> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, zdAccountDetail, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ZdAccountDetail> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, zdAccountDetail, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ZdAccountDetail> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, zdAccountDetail, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ZdAccountDetail record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(bfAccount).equalTo(record::getBfAccount)
                .set(dfAccount).equalTo(record::getDfAccount)
                .set(queryAccount).equalTo(record::getQueryAccount)
                .set(oppositeAccount).equalTo(record::getOppositeAccount)
                .set(payAccountId).equalTo(record::getPayAccountId)
                .set(payBankName).equalTo(record::getPayBankName)
                .set(payBankCardNumber).equalTo(record::getPayBankCardNumber)
                .set(tradeAmount).equalTo(record::getTradeAmount)
                .set(tradeRemainderAmount).equalTo(record::getTradeRemainderAmount)
                .set(receiveAccountId).equalTo(record::getReceiveAccountId)
                .set(receiveAccountName).equalTo(record::getReceiveAccountName)
                .set(receiveBankName).equalTo(record::getReceiveBankName)
                .set(receiveBankCardNumber).equalTo(record::getReceiveBankCardNumber)
                .set(tradeType).equalTo(record::getTradeType)
                .set(borrowLoanType).equalTo(record::getBorrowLoanType)
                .set(tradeTime).equalTo(record::getTradeTime)
                .set(tradeResult).equalTo(record::getTradeResult)
                .set(payType).equalTo(record::getPayType)
                .set(outInType).equalTo(record::getOutInType)
                .set(currencyType).equalTo(record::getCurrencyType)
                .set(receiveMerchantId).equalTo(record::getReceiveMerchantId)
                .set(receiveMerchantName).equalTo(record::getReceiveMerchantName)
                .set(proofNum).equalTo(record::getProofNum)
                .set(ip).equalTo(record::getIp)
                .set(mac).equalTo(record::getMac)
                .set(tradePlaceJd).equalTo(record::getTradePlaceJd)
                .set(tradePlaceWd).equalTo(record::getTradePlaceWd)
                .set(tradeSummary).equalTo(record::getTradeSummary)
                .set(caseNumber).equalTo(record::getCaseNumber)
                .set(tradeBillType).equalTo(record::getTradeBillType)
                .set(userQxm).equalTo(record::getUserQxm)
                .set(publicFlag).equalTo(record::getPublicFlag)
                .set(deleteFlag).equalTo(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ZdAccountDetail record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(bfAccount).equalToWhenPresent(record::getBfAccount)
                .set(dfAccount).equalToWhenPresent(record::getDfAccount)
                .set(queryAccount).equalToWhenPresent(record::getQueryAccount)
                .set(oppositeAccount).equalToWhenPresent(record::getOppositeAccount)
                .set(payAccountId).equalToWhenPresent(record::getPayAccountId)
                .set(payBankName).equalToWhenPresent(record::getPayBankName)
                .set(payBankCardNumber).equalToWhenPresent(record::getPayBankCardNumber)
                .set(tradeAmount).equalToWhenPresent(record::getTradeAmount)
                .set(tradeRemainderAmount).equalToWhenPresent(record::getTradeRemainderAmount)
                .set(receiveAccountId).equalToWhenPresent(record::getReceiveAccountId)
                .set(receiveAccountName).equalToWhenPresent(record::getReceiveAccountName)
                .set(receiveBankName).equalToWhenPresent(record::getReceiveBankName)
                .set(receiveBankCardNumber).equalToWhenPresent(record::getReceiveBankCardNumber)
                .set(tradeType).equalToWhenPresent(record::getTradeType)
                .set(borrowLoanType).equalToWhenPresent(record::getBorrowLoanType)
                .set(tradeTime).equalToWhenPresent(record::getTradeTime)
                .set(tradeResult).equalToWhenPresent(record::getTradeResult)
                .set(payType).equalToWhenPresent(record::getPayType)
                .set(outInType).equalToWhenPresent(record::getOutInType)
                .set(currencyType).equalToWhenPresent(record::getCurrencyType)
                .set(receiveMerchantId).equalToWhenPresent(record::getReceiveMerchantId)
                .set(receiveMerchantName).equalToWhenPresent(record::getReceiveMerchantName)
                .set(proofNum).equalToWhenPresent(record::getProofNum)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(mac).equalToWhenPresent(record::getMac)
                .set(tradePlaceJd).equalToWhenPresent(record::getTradePlaceJd)
                .set(tradePlaceWd).equalToWhenPresent(record::getTradePlaceWd)
                .set(tradeSummary).equalToWhenPresent(record::getTradeSummary)
                .set(caseNumber).equalToWhenPresent(record::getCaseNumber)
                .set(tradeBillType).equalToWhenPresent(record::getTradeBillType)
                .set(userQxm).equalToWhenPresent(record::getUserQxm)
                .set(publicFlag).equalToWhenPresent(record::getPublicFlag)
                .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ZdAccountDetail record) {
        return update(c ->
            c.set(bfAccount).equalTo(record::getBfAccount)
            .set(dfAccount).equalTo(record::getDfAccount)
            .set(queryAccount).equalTo(record::getQueryAccount)
            .set(oppositeAccount).equalTo(record::getOppositeAccount)
            .set(payAccountId).equalTo(record::getPayAccountId)
            .set(payBankName).equalTo(record::getPayBankName)
            .set(payBankCardNumber).equalTo(record::getPayBankCardNumber)
            .set(tradeAmount).equalTo(record::getTradeAmount)
            .set(tradeRemainderAmount).equalTo(record::getTradeRemainderAmount)
            .set(receiveAccountId).equalTo(record::getReceiveAccountId)
            .set(receiveAccountName).equalTo(record::getReceiveAccountName)
            .set(receiveBankName).equalTo(record::getReceiveBankName)
            .set(receiveBankCardNumber).equalTo(record::getReceiveBankCardNumber)
            .set(tradeType).equalTo(record::getTradeType)
            .set(borrowLoanType).equalTo(record::getBorrowLoanType)
            .set(tradeTime).equalTo(record::getTradeTime)
            .set(tradeResult).equalTo(record::getTradeResult)
            .set(payType).equalTo(record::getPayType)
            .set(outInType).equalTo(record::getOutInType)
            .set(currencyType).equalTo(record::getCurrencyType)
            .set(receiveMerchantId).equalTo(record::getReceiveMerchantId)
            .set(receiveMerchantName).equalTo(record::getReceiveMerchantName)
            .set(proofNum).equalTo(record::getProofNum)
            .set(ip).equalTo(record::getIp)
            .set(mac).equalTo(record::getMac)
            .set(tradePlaceJd).equalTo(record::getTradePlaceJd)
            .set(tradePlaceWd).equalTo(record::getTradePlaceWd)
            .set(tradeSummary).equalTo(record::getTradeSummary)
            .set(caseNumber).equalTo(record::getCaseNumber)
            .set(tradeBillType).equalTo(record::getTradeBillType)
            .set(userQxm).equalTo(record::getUserQxm)
            .set(publicFlag).equalTo(record::getPublicFlag)
            .set(deleteFlag).equalTo(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ZdAccountDetail record) {
        return update(c ->
            c.set(bfAccount).equalToWhenPresent(record::getBfAccount)
            .set(dfAccount).equalToWhenPresent(record::getDfAccount)
            .set(queryAccount).equalToWhenPresent(record::getQueryAccount)
            .set(oppositeAccount).equalToWhenPresent(record::getOppositeAccount)
            .set(payAccountId).equalToWhenPresent(record::getPayAccountId)
            .set(payBankName).equalToWhenPresent(record::getPayBankName)
            .set(payBankCardNumber).equalToWhenPresent(record::getPayBankCardNumber)
            .set(tradeAmount).equalToWhenPresent(record::getTradeAmount)
            .set(tradeRemainderAmount).equalToWhenPresent(record::getTradeRemainderAmount)
            .set(receiveAccountId).equalToWhenPresent(record::getReceiveAccountId)
            .set(receiveAccountName).equalToWhenPresent(record::getReceiveAccountName)
            .set(receiveBankName).equalToWhenPresent(record::getReceiveBankName)
            .set(receiveBankCardNumber).equalToWhenPresent(record::getReceiveBankCardNumber)
            .set(tradeType).equalToWhenPresent(record::getTradeType)
            .set(borrowLoanType).equalToWhenPresent(record::getBorrowLoanType)
            .set(tradeTime).equalToWhenPresent(record::getTradeTime)
            .set(tradeResult).equalToWhenPresent(record::getTradeResult)
            .set(payType).equalToWhenPresent(record::getPayType)
            .set(outInType).equalToWhenPresent(record::getOutInType)
            .set(currencyType).equalToWhenPresent(record::getCurrencyType)
            .set(receiveMerchantId).equalToWhenPresent(record::getReceiveMerchantId)
            .set(receiveMerchantName).equalToWhenPresent(record::getReceiveMerchantName)
            .set(proofNum).equalToWhenPresent(record::getProofNum)
            .set(ip).equalToWhenPresent(record::getIp)
            .set(mac).equalToWhenPresent(record::getMac)
            .set(tradePlaceJd).equalToWhenPresent(record::getTradePlaceJd)
            .set(tradePlaceWd).equalToWhenPresent(record::getTradePlaceWd)
            .set(tradeSummary).equalToWhenPresent(record::getTradeSummary)
            .set(caseNumber).equalToWhenPresent(record::getCaseNumber)
            .set(tradeBillType).equalToWhenPresent(record::getTradeBillType)
            .set(userQxm).equalToWhenPresent(record::getUserQxm)
            .set(publicFlag).equalToWhenPresent(record::getPublicFlag)
            .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}