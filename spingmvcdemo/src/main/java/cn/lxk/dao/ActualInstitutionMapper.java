package cn.lxk.dao;

import static cn.lxk.dao.ActualInstitutionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.ActualInstitution;
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
public interface ActualInstitutionMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, institutionId, houseId, regindId, userId, collectionTime, institutionName, institutionType, placeOfficeTime, legalPerson, registeredCapital, registerDate, startTime, endTime, registeredAddress, employeeNum, lon, lat, source, messageLogo, createTime, deleteFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ActualInstitution> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ActualInstitution> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActualInstitutionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="institution_id", property="institutionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="institution_name", property="institutionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="institution_type", property="institutionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="place_office_time", property="placeOfficeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="legal_person", property="legalPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="registered_capital", property="registeredCapital", jdbcType=JdbcType.DOUBLE),
        @Result(column="register_date", property="registerDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="registered_address", property="registeredAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="employee_num", property="employeeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="lon", property="lon", jdbcType=JdbcType.VARCHAR),
        @Result(column="lat", property="lat", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<ActualInstitution> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActualInstitutionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="institution_id", property="institutionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="institution_name", property="institutionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="institution_type", property="institutionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="place_office_time", property="placeOfficeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="legal_person", property="legalPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="registered_capital", property="registeredCapital", jdbcType=JdbcType.DOUBLE),
        @Result(column="register_date", property="registerDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="registered_address", property="registeredAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="employee_num", property="employeeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="lon", property="lon", jdbcType=JdbcType.VARCHAR),
        @Result(column="lat", property="lat", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    List<ActualInstitution> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, actualInstitution, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, actualInstitution, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ActualInstitution record) {
        return MyBatis3Utils.insert(this::insert, record, actualInstitution, c ->
            c.map(id).toProperty("id")
            .map(institutionId).toProperty("institutionId")
            .map(houseId).toProperty("houseId")
            .map(regindId).toProperty("regindId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(institutionName).toProperty("institutionName")
            .map(institutionType).toProperty("institutionType")
            .map(placeOfficeTime).toProperty("placeOfficeTime")
            .map(legalPerson).toProperty("legalPerson")
            .map(registeredCapital).toProperty("registeredCapital")
            .map(registerDate).toProperty("registerDate")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(registeredAddress).toProperty("registeredAddress")
            .map(employeeNum).toProperty("employeeNum")
            .map(lon).toProperty("lon")
            .map(lat).toProperty("lat")
            .map(source).toProperty("source")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ActualInstitution> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, actualInstitution, c ->
            c.map(id).toProperty("id")
            .map(institutionId).toProperty("institutionId")
            .map(houseId).toProperty("houseId")
            .map(regindId).toProperty("regindId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(institutionName).toProperty("institutionName")
            .map(institutionType).toProperty("institutionType")
            .map(placeOfficeTime).toProperty("placeOfficeTime")
            .map(legalPerson).toProperty("legalPerson")
            .map(registeredCapital).toProperty("registeredCapital")
            .map(registerDate).toProperty("registerDate")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(registeredAddress).toProperty("registeredAddress")
            .map(employeeNum).toProperty("employeeNum")
            .map(lon).toProperty("lon")
            .map(lat).toProperty("lat")
            .map(source).toProperty("source")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ActualInstitution record) {
        return MyBatis3Utils.insert(this::insert, record, actualInstitution, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(institutionId).toPropertyWhenPresent("institutionId", record::getInstitutionId)
            .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
            .map(regindId).toPropertyWhenPresent("regindId", record::getRegindId)
            .map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(collectionTime).toPropertyWhenPresent("collectionTime", record::getCollectionTime)
            .map(institutionName).toPropertyWhenPresent("institutionName", record::getInstitutionName)
            .map(institutionType).toPropertyWhenPresent("institutionType", record::getInstitutionType)
            .map(placeOfficeTime).toPropertyWhenPresent("placeOfficeTime", record::getPlaceOfficeTime)
            .map(legalPerson).toPropertyWhenPresent("legalPerson", record::getLegalPerson)
            .map(registeredCapital).toPropertyWhenPresent("registeredCapital", record::getRegisteredCapital)
            .map(registerDate).toPropertyWhenPresent("registerDate", record::getRegisterDate)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", record::getEndTime)
            .map(registeredAddress).toPropertyWhenPresent("registeredAddress", record::getRegisteredAddress)
            .map(employeeNum).toPropertyWhenPresent("employeeNum", record::getEmployeeNum)
            .map(lon).toPropertyWhenPresent("lon", record::getLon)
            .map(lat).toPropertyWhenPresent("lat", record::getLat)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(messageLogo).toPropertyWhenPresent("messageLogo", record::getMessageLogo)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::getDeleteFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ActualInstitution> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, actualInstitution, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ActualInstitution> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, actualInstitution, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ActualInstitution> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, actualInstitution, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ActualInstitution> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, actualInstitution, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ActualInstitution record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(institutionId).equalTo(record::getInstitutionId)
                .set(houseId).equalTo(record::getHouseId)
                .set(regindId).equalTo(record::getRegindId)
                .set(userId).equalTo(record::getUserId)
                .set(collectionTime).equalTo(record::getCollectionTime)
                .set(institutionName).equalTo(record::getInstitutionName)
                .set(institutionType).equalTo(record::getInstitutionType)
                .set(placeOfficeTime).equalTo(record::getPlaceOfficeTime)
                .set(legalPerson).equalTo(record::getLegalPerson)
                .set(registeredCapital).equalTo(record::getRegisteredCapital)
                .set(registerDate).equalTo(record::getRegisterDate)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime)
                .set(registeredAddress).equalTo(record::getRegisteredAddress)
                .set(employeeNum).equalTo(record::getEmployeeNum)
                .set(lon).equalTo(record::getLon)
                .set(lat).equalTo(record::getLat)
                .set(source).equalTo(record::getSource)
                .set(messageLogo).equalTo(record::getMessageLogo)
                .set(createTime).equalTo(record::getCreateTime)
                .set(deleteFlag).equalTo(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ActualInstitution record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(institutionId).equalToWhenPresent(record::getInstitutionId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(regindId).equalToWhenPresent(record::getRegindId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
                .set(institutionName).equalToWhenPresent(record::getInstitutionName)
                .set(institutionType).equalToWhenPresent(record::getInstitutionType)
                .set(placeOfficeTime).equalToWhenPresent(record::getPlaceOfficeTime)
                .set(legalPerson).equalToWhenPresent(record::getLegalPerson)
                .set(registeredCapital).equalToWhenPresent(record::getRegisteredCapital)
                .set(registerDate).equalToWhenPresent(record::getRegisterDate)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime)
                .set(registeredAddress).equalToWhenPresent(record::getRegisteredAddress)
                .set(employeeNum).equalToWhenPresent(record::getEmployeeNum)
                .set(lon).equalToWhenPresent(record::getLon)
                .set(lat).equalToWhenPresent(record::getLat)
                .set(source).equalToWhenPresent(record::getSource)
                .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ActualInstitution record) {
        return update(c ->
            c.set(institutionId).equalTo(record::getInstitutionId)
            .set(houseId).equalTo(record::getHouseId)
            .set(regindId).equalTo(record::getRegindId)
            .set(userId).equalTo(record::getUserId)
            .set(collectionTime).equalTo(record::getCollectionTime)
            .set(institutionName).equalTo(record::getInstitutionName)
            .set(institutionType).equalTo(record::getInstitutionType)
            .set(placeOfficeTime).equalTo(record::getPlaceOfficeTime)
            .set(legalPerson).equalTo(record::getLegalPerson)
            .set(registeredCapital).equalTo(record::getRegisteredCapital)
            .set(registerDate).equalTo(record::getRegisterDate)
            .set(startTime).equalTo(record::getStartTime)
            .set(endTime).equalTo(record::getEndTime)
            .set(registeredAddress).equalTo(record::getRegisteredAddress)
            .set(employeeNum).equalTo(record::getEmployeeNum)
            .set(lon).equalTo(record::getLon)
            .set(lat).equalTo(record::getLat)
            .set(source).equalTo(record::getSource)
            .set(messageLogo).equalTo(record::getMessageLogo)
            .set(createTime).equalTo(record::getCreateTime)
            .set(deleteFlag).equalTo(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ActualInstitution record) {
        return update(c ->
            c.set(institutionId).equalToWhenPresent(record::getInstitutionId)
            .set(houseId).equalToWhenPresent(record::getHouseId)
            .set(regindId).equalToWhenPresent(record::getRegindId)
            .set(userId).equalToWhenPresent(record::getUserId)
            .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
            .set(institutionName).equalToWhenPresent(record::getInstitutionName)
            .set(institutionType).equalToWhenPresent(record::getInstitutionType)
            .set(placeOfficeTime).equalToWhenPresent(record::getPlaceOfficeTime)
            .set(legalPerson).equalToWhenPresent(record::getLegalPerson)
            .set(registeredCapital).equalToWhenPresent(record::getRegisteredCapital)
            .set(registerDate).equalToWhenPresent(record::getRegisterDate)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(endTime).equalToWhenPresent(record::getEndTime)
            .set(registeredAddress).equalToWhenPresent(record::getRegisteredAddress)
            .set(employeeNum).equalToWhenPresent(record::getEmployeeNum)
            .set(lon).equalToWhenPresent(record::getLon)
            .set(lat).equalToWhenPresent(record::getLat)
            .set(source).equalToWhenPresent(record::getSource)
            .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}