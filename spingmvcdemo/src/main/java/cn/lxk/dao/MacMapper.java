package cn.lxk.dao;

import static cn.lxk.dao.MacDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.Mac;
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
public interface MacMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, regindId, serialId, userId, collectionTime, ssid, address, time, typeOfDevice, tzmac, zdmac, terminal, encryption, factory, band, channel, signalstrength, source, messageLogo, createTime, deleteFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mac> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Mac> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MacResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="serial_id", property="serialId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ssid", property="ssid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="type_of_device", property="typeOfDevice", jdbcType=JdbcType.VARCHAR),
        @Result(column="tzmac", property="tzmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="zdmac", property="zdmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="terminal", property="terminal", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryption", property="encryption", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="band", property="band", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="signalstrength", property="signalstrength", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Mac> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MacResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="serial_id", property="serialId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ssid", property="ssid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="type_of_device", property="typeOfDevice", jdbcType=JdbcType.VARCHAR),
        @Result(column="tzmac", property="tzmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="zdmac", property="zdmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="terminal", property="terminal", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryption", property="encryption", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="band", property="band", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="signalstrength", property="signalstrength", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    List<Mac> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Mac record) {
        return MyBatis3Utils.insert(this::insert, record, mac, c ->
            c.map(id).toProperty("id")
            .map(regindId).toProperty("regindId")
            .map(serialId).toProperty("serialId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(ssid).toProperty("ssid")
            .map(address).toProperty("address")
            .map(time).toProperty("time")
            .map(typeOfDevice).toProperty("typeOfDevice")
            .map(tzmac).toProperty("tzmac")
            .map(zdmac).toProperty("zdmac")
            .map(terminal).toProperty("terminal")
            .map(encryption).toProperty("encryption")
            .map(factory).toProperty("factory")
            .map(band).toProperty("band")
            .map(channel).toProperty("channel")
            .map(signalstrength).toProperty("signalstrength")
            .map(source).toProperty("source")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Mac> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mac, c ->
            c.map(id).toProperty("id")
            .map(regindId).toProperty("regindId")
            .map(serialId).toProperty("serialId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(ssid).toProperty("ssid")
            .map(address).toProperty("address")
            .map(time).toProperty("time")
            .map(typeOfDevice).toProperty("typeOfDevice")
            .map(tzmac).toProperty("tzmac")
            .map(zdmac).toProperty("zdmac")
            .map(terminal).toProperty("terminal")
            .map(encryption).toProperty("encryption")
            .map(factory).toProperty("factory")
            .map(band).toProperty("band")
            .map(channel).toProperty("channel")
            .map(signalstrength).toProperty("signalstrength")
            .map(source).toProperty("source")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Mac record) {
        return MyBatis3Utils.insert(this::insert, record, mac, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(regindId).toPropertyWhenPresent("regindId", record::getRegindId)
            .map(serialId).toPropertyWhenPresent("serialId", record::getSerialId)
            .map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(collectionTime).toPropertyWhenPresent("collectionTime", record::getCollectionTime)
            .map(ssid).toPropertyWhenPresent("ssid", record::getSsid)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(typeOfDevice).toPropertyWhenPresent("typeOfDevice", record::getTypeOfDevice)
            .map(tzmac).toPropertyWhenPresent("tzmac", record::getTzmac)
            .map(zdmac).toPropertyWhenPresent("zdmac", record::getZdmac)
            .map(terminal).toPropertyWhenPresent("terminal", record::getTerminal)
            .map(encryption).toPropertyWhenPresent("encryption", record::getEncryption)
            .map(factory).toPropertyWhenPresent("factory", record::getFactory)
            .map(band).toPropertyWhenPresent("band", record::getBand)
            .map(channel).toPropertyWhenPresent("channel", record::getChannel)
            .map(signalstrength).toPropertyWhenPresent("signalstrength", record::getSignalstrength)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(messageLogo).toPropertyWhenPresent("messageLogo", record::getMessageLogo)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::getDeleteFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Mac> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Mac> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Mac> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Mac> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Mac record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(regindId).equalTo(record::getRegindId)
                .set(serialId).equalTo(record::getSerialId)
                .set(userId).equalTo(record::getUserId)
                .set(collectionTime).equalTo(record::getCollectionTime)
                .set(ssid).equalTo(record::getSsid)
                .set(address).equalTo(record::getAddress)
                .set(time).equalTo(record::getTime)
                .set(typeOfDevice).equalTo(record::getTypeOfDevice)
                .set(tzmac).equalTo(record::getTzmac)
                .set(zdmac).equalTo(record::getZdmac)
                .set(terminal).equalTo(record::getTerminal)
                .set(encryption).equalTo(record::getEncryption)
                .set(factory).equalTo(record::getFactory)
                .set(band).equalTo(record::getBand)
                .set(channel).equalTo(record::getChannel)
                .set(signalstrength).equalTo(record::getSignalstrength)
                .set(source).equalTo(record::getSource)
                .set(messageLogo).equalTo(record::getMessageLogo)
                .set(createTime).equalTo(record::getCreateTime)
                .set(deleteFlag).equalTo(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Mac record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(regindId).equalToWhenPresent(record::getRegindId)
                .set(serialId).equalToWhenPresent(record::getSerialId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
                .set(ssid).equalToWhenPresent(record::getSsid)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(time).equalToWhenPresent(record::getTime)
                .set(typeOfDevice).equalToWhenPresent(record::getTypeOfDevice)
                .set(tzmac).equalToWhenPresent(record::getTzmac)
                .set(zdmac).equalToWhenPresent(record::getZdmac)
                .set(terminal).equalToWhenPresent(record::getTerminal)
                .set(encryption).equalToWhenPresent(record::getEncryption)
                .set(factory).equalToWhenPresent(record::getFactory)
                .set(band).equalToWhenPresent(record::getBand)
                .set(channel).equalToWhenPresent(record::getChannel)
                .set(signalstrength).equalToWhenPresent(record::getSignalstrength)
                .set(source).equalToWhenPresent(record::getSource)
                .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Mac record) {
        return update(c ->
            c.set(regindId).equalTo(record::getRegindId)
            .set(serialId).equalTo(record::getSerialId)
            .set(userId).equalTo(record::getUserId)
            .set(collectionTime).equalTo(record::getCollectionTime)
            .set(ssid).equalTo(record::getSsid)
            .set(address).equalTo(record::getAddress)
            .set(time).equalTo(record::getTime)
            .set(typeOfDevice).equalTo(record::getTypeOfDevice)
            .set(tzmac).equalTo(record::getTzmac)
            .set(zdmac).equalTo(record::getZdmac)
            .set(terminal).equalTo(record::getTerminal)
            .set(encryption).equalTo(record::getEncryption)
            .set(factory).equalTo(record::getFactory)
            .set(band).equalTo(record::getBand)
            .set(channel).equalTo(record::getChannel)
            .set(signalstrength).equalTo(record::getSignalstrength)
            .set(source).equalTo(record::getSource)
            .set(messageLogo).equalTo(record::getMessageLogo)
            .set(createTime).equalTo(record::getCreateTime)
            .set(deleteFlag).equalTo(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Mac record) {
        return update(c ->
            c.set(regindId).equalToWhenPresent(record::getRegindId)
            .set(serialId).equalToWhenPresent(record::getSerialId)
            .set(userId).equalToWhenPresent(record::getUserId)
            .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
            .set(ssid).equalToWhenPresent(record::getSsid)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(time).equalToWhenPresent(record::getTime)
            .set(typeOfDevice).equalToWhenPresent(record::getTypeOfDevice)
            .set(tzmac).equalToWhenPresent(record::getTzmac)
            .set(zdmac).equalToWhenPresent(record::getZdmac)
            .set(terminal).equalToWhenPresent(record::getTerminal)
            .set(encryption).equalToWhenPresent(record::getEncryption)
            .set(factory).equalToWhenPresent(record::getFactory)
            .set(band).equalToWhenPresent(record::getBand)
            .set(channel).equalToWhenPresent(record::getChannel)
            .set(signalstrength).equalToWhenPresent(record::getSignalstrength)
            .set(source).equalToWhenPresent(record::getSource)
            .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}