package cn.lxk.dao;

import static cn.lxk.dao.ImsiDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.Imsi;
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
public interface ImsiMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, regindId, serialId, userId, collectionTime, imsi.imsi, time, source, messageLogo, createTime, deleteFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Imsi> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Imsi> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ImsiResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="serial_id", property="serialId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="imsi", property="imsi", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Imsi> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ImsiResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="serial_id", property="serialId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="imsi", property="imsi", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    List<Imsi> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, imsi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, imsi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Imsi record) {
        return MyBatis3Utils.insert(this::insert, record, imsi, c ->
            c.map(id).toProperty("id")
            .map(regindId).toProperty("regindId")
            .map(serialId).toProperty("serialId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(imsi.imsi).toProperty("imsi")
            .map(time).toProperty("time")
            .map(source).toProperty("source")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Imsi> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, imsi, c ->
            c.map(id).toProperty("id")
            .map(regindId).toProperty("regindId")
            .map(serialId).toProperty("serialId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(imsi.imsi).toProperty("imsi")
            .map(time).toProperty("time")
            .map(source).toProperty("source")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Imsi record) {
        return MyBatis3Utils.insert(this::insert, record, imsi, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(regindId).toPropertyWhenPresent("regindId", record::getRegindId)
            .map(serialId).toPropertyWhenPresent("serialId", record::getSerialId)
            .map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(collectionTime).toPropertyWhenPresent("collectionTime", record::getCollectionTime)
            .map(imsi.imsi).toPropertyWhenPresent("imsi", record::getImsi)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(messageLogo).toPropertyWhenPresent("messageLogo", record::getMessageLogo)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::getDeleteFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Imsi> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, imsi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Imsi> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, imsi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Imsi> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, imsi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Imsi> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, imsi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Imsi record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(regindId).equalTo(record::getRegindId)
                .set(serialId).equalTo(record::getSerialId)
                .set(userId).equalTo(record::getUserId)
                .set(collectionTime).equalTo(record::getCollectionTime)
                .set(imsi.imsi).equalTo(record::getImsi)
                .set(time).equalTo(record::getTime)
                .set(source).equalTo(record::getSource)
                .set(messageLogo).equalTo(record::getMessageLogo)
                .set(createTime).equalTo(record::getCreateTime)
                .set(deleteFlag).equalTo(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Imsi record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(regindId).equalToWhenPresent(record::getRegindId)
                .set(serialId).equalToWhenPresent(record::getSerialId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
                .set(imsi.imsi).equalToWhenPresent(record::getImsi)
                .set(time).equalToWhenPresent(record::getTime)
                .set(source).equalToWhenPresent(record::getSource)
                .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Imsi record) {
        return update(c ->
            c.set(regindId).equalTo(record::getRegindId)
            .set(serialId).equalTo(record::getSerialId)
            .set(userId).equalTo(record::getUserId)
            .set(collectionTime).equalTo(record::getCollectionTime)
            .set(imsi.imsi).equalTo(record::getImsi)
            .set(time).equalTo(record::getTime)
            .set(source).equalTo(record::getSource)
            .set(messageLogo).equalTo(record::getMessageLogo)
            .set(createTime).equalTo(record::getCreateTime)
            .set(deleteFlag).equalTo(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Imsi record) {
        return update(c ->
            c.set(regindId).equalToWhenPresent(record::getRegindId)
            .set(serialId).equalToWhenPresent(record::getSerialId)
            .set(userId).equalToWhenPresent(record::getUserId)
            .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
            .set(imsi.imsi).equalToWhenPresent(record::getImsi)
            .set(time).equalToWhenPresent(record::getTime)
            .set(source).equalToWhenPresent(record::getSource)
            .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}