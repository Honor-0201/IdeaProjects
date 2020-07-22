package cn.lxk.dao;

import static cn.lxk.dao.ActualPersonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.ActualPerson;
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
public interface ActualPersonMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, personId, institutionId, houseId, regindId, userId, collectionTime, idcardAddress, name, idcard, idcardImg, sex, birthday, nativePlace, education, profession, phone, roomRole, enterTime, owner, lon, lat, source, address, messageLogo, createTime, deleteFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ActualPerson> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ActualPerson> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActualPersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="person_id", property="personId", jdbcType=JdbcType.VARCHAR),
        @Result(column="institution_id", property="institutionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="idcard_address", property="idcardAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard", property="idcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard_img", property="idcardImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="native_place", property="nativePlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="profession", property="profession", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="room_role", property="roomRole", jdbcType=JdbcType.VARCHAR),
        @Result(column="enter_time", property="enterTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="owner", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="lon", property="lon", jdbcType=JdbcType.VARCHAR),
        @Result(column="lat", property="lat", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<ActualPerson> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ActualPersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="person_id", property="personId", jdbcType=JdbcType.VARCHAR),
        @Result(column="institution_id", property="institutionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_id", property="houseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="regind_id", property="regindId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="collection_time", property="collectionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="idcard_address", property="idcardAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard", property="idcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard_img", property="idcardImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="native_place", property="nativePlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="profession", property="profession", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="room_role", property="roomRole", jdbcType=JdbcType.VARCHAR),
        @Result(column="enter_time", property="enterTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="owner", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="lon", property="lon", jdbcType=JdbcType.VARCHAR),
        @Result(column="lat", property="lat", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="message_logo", property="messageLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.VARCHAR)
    })
    List<ActualPerson> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, actualPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, actualPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ActualPerson record) {
        return MyBatis3Utils.insert(this::insert, record, actualPerson, c ->
            c.map(id).toProperty("id")
            .map(personId).toProperty("personId")
            .map(institutionId).toProperty("institutionId")
            .map(houseId).toProperty("houseId")
            .map(regindId).toProperty("regindId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(idcardAddress).toProperty("idcardAddress")
            .map(name).toProperty("name")
            .map(idcard).toProperty("idcard")
            .map(idcardImg).toProperty("idcardImg")
            .map(sex).toProperty("sex")
            .map(birthday).toProperty("birthday")
            .map(nativePlace).toProperty("nativePlace")
            .map(education).toProperty("education")
            .map(profession).toProperty("profession")
            .map(phone).toProperty("phone")
            .map(roomRole).toProperty("roomRole")
            .map(enterTime).toProperty("enterTime")
            .map(owner).toProperty("owner")
            .map(lon).toProperty("lon")
            .map(lat).toProperty("lat")
            .map(source).toProperty("source")
            .map(address).toProperty("address")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ActualPerson> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, actualPerson, c ->
            c.map(id).toProperty("id")
            .map(personId).toProperty("personId")
            .map(institutionId).toProperty("institutionId")
            .map(houseId).toProperty("houseId")
            .map(regindId).toProperty("regindId")
            .map(userId).toProperty("userId")
            .map(collectionTime).toProperty("collectionTime")
            .map(idcardAddress).toProperty("idcardAddress")
            .map(name).toProperty("name")
            .map(idcard).toProperty("idcard")
            .map(idcardImg).toProperty("idcardImg")
            .map(sex).toProperty("sex")
            .map(birthday).toProperty("birthday")
            .map(nativePlace).toProperty("nativePlace")
            .map(education).toProperty("education")
            .map(profession).toProperty("profession")
            .map(phone).toProperty("phone")
            .map(roomRole).toProperty("roomRole")
            .map(enterTime).toProperty("enterTime")
            .map(owner).toProperty("owner")
            .map(lon).toProperty("lon")
            .map(lat).toProperty("lat")
            .map(source).toProperty("source")
            .map(address).toProperty("address")
            .map(messageLogo).toProperty("messageLogo")
            .map(createTime).toProperty("createTime")
            .map(deleteFlag).toProperty("deleteFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ActualPerson record) {
        return MyBatis3Utils.insert(this::insert, record, actualPerson, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(personId).toPropertyWhenPresent("personId", record::getPersonId)
            .map(institutionId).toPropertyWhenPresent("institutionId", record::getInstitutionId)
            .map(houseId).toPropertyWhenPresent("houseId", record::getHouseId)
            .map(regindId).toPropertyWhenPresent("regindId", record::getRegindId)
            .map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(collectionTime).toPropertyWhenPresent("collectionTime", record::getCollectionTime)
            .map(idcardAddress).toPropertyWhenPresent("idcardAddress", record::getIdcardAddress)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(idcard).toPropertyWhenPresent("idcard", record::getIdcard)
            .map(idcardImg).toPropertyWhenPresent("idcardImg", record::getIdcardImg)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
            .map(nativePlace).toPropertyWhenPresent("nativePlace", record::getNativePlace)
            .map(education).toPropertyWhenPresent("education", record::getEducation)
            .map(profession).toPropertyWhenPresent("profession", record::getProfession)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(roomRole).toPropertyWhenPresent("roomRole", record::getRoomRole)
            .map(enterTime).toPropertyWhenPresent("enterTime", record::getEnterTime)
            .map(owner).toPropertyWhenPresent("owner", record::getOwner)
            .map(lon).toPropertyWhenPresent("lon", record::getLon)
            .map(lat).toPropertyWhenPresent("lat", record::getLat)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(messageLogo).toPropertyWhenPresent("messageLogo", record::getMessageLogo)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::getDeleteFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ActualPerson> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, actualPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ActualPerson> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, actualPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ActualPerson> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, actualPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ActualPerson> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, actualPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ActualPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(personId).equalTo(record::getPersonId)
                .set(institutionId).equalTo(record::getInstitutionId)
                .set(houseId).equalTo(record::getHouseId)
                .set(regindId).equalTo(record::getRegindId)
                .set(userId).equalTo(record::getUserId)
                .set(collectionTime).equalTo(record::getCollectionTime)
                .set(idcardAddress).equalTo(record::getIdcardAddress)
                .set(name).equalTo(record::getName)
                .set(idcard).equalTo(record::getIdcard)
                .set(idcardImg).equalTo(record::getIdcardImg)
                .set(sex).equalTo(record::getSex)
                .set(birthday).equalTo(record::getBirthday)
                .set(nativePlace).equalTo(record::getNativePlace)
                .set(education).equalTo(record::getEducation)
                .set(profession).equalTo(record::getProfession)
                .set(phone).equalTo(record::getPhone)
                .set(roomRole).equalTo(record::getRoomRole)
                .set(enterTime).equalTo(record::getEnterTime)
                .set(owner).equalTo(record::getOwner)
                .set(lon).equalTo(record::getLon)
                .set(lat).equalTo(record::getLat)
                .set(source).equalTo(record::getSource)
                .set(address).equalTo(record::getAddress)
                .set(messageLogo).equalTo(record::getMessageLogo)
                .set(createTime).equalTo(record::getCreateTime)
                .set(deleteFlag).equalTo(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ActualPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(personId).equalToWhenPresent(record::getPersonId)
                .set(institutionId).equalToWhenPresent(record::getInstitutionId)
                .set(houseId).equalToWhenPresent(record::getHouseId)
                .set(regindId).equalToWhenPresent(record::getRegindId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
                .set(idcardAddress).equalToWhenPresent(record::getIdcardAddress)
                .set(name).equalToWhenPresent(record::getName)
                .set(idcard).equalToWhenPresent(record::getIdcard)
                .set(idcardImg).equalToWhenPresent(record::getIdcardImg)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(nativePlace).equalToWhenPresent(record::getNativePlace)
                .set(education).equalToWhenPresent(record::getEducation)
                .set(profession).equalToWhenPresent(record::getProfession)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(roomRole).equalToWhenPresent(record::getRoomRole)
                .set(enterTime).equalToWhenPresent(record::getEnterTime)
                .set(owner).equalToWhenPresent(record::getOwner)
                .set(lon).equalToWhenPresent(record::getLon)
                .set(lat).equalToWhenPresent(record::getLat)
                .set(source).equalToWhenPresent(record::getSource)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ActualPerson record) {
        return update(c ->
            c.set(personId).equalTo(record::getPersonId)
            .set(institutionId).equalTo(record::getInstitutionId)
            .set(houseId).equalTo(record::getHouseId)
            .set(regindId).equalTo(record::getRegindId)
            .set(userId).equalTo(record::getUserId)
            .set(collectionTime).equalTo(record::getCollectionTime)
            .set(idcardAddress).equalTo(record::getIdcardAddress)
            .set(name).equalTo(record::getName)
            .set(idcard).equalTo(record::getIdcard)
            .set(idcardImg).equalTo(record::getIdcardImg)
            .set(sex).equalTo(record::getSex)
            .set(birthday).equalTo(record::getBirthday)
            .set(nativePlace).equalTo(record::getNativePlace)
            .set(education).equalTo(record::getEducation)
            .set(profession).equalTo(record::getProfession)
            .set(phone).equalTo(record::getPhone)
            .set(roomRole).equalTo(record::getRoomRole)
            .set(enterTime).equalTo(record::getEnterTime)
            .set(owner).equalTo(record::getOwner)
            .set(lon).equalTo(record::getLon)
            .set(lat).equalTo(record::getLat)
            .set(source).equalTo(record::getSource)
            .set(address).equalTo(record::getAddress)
            .set(messageLogo).equalTo(record::getMessageLogo)
            .set(createTime).equalTo(record::getCreateTime)
            .set(deleteFlag).equalTo(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ActualPerson record) {
        return update(c ->
            c.set(personId).equalToWhenPresent(record::getPersonId)
            .set(institutionId).equalToWhenPresent(record::getInstitutionId)
            .set(houseId).equalToWhenPresent(record::getHouseId)
            .set(regindId).equalToWhenPresent(record::getRegindId)
            .set(userId).equalToWhenPresent(record::getUserId)
            .set(collectionTime).equalToWhenPresent(record::getCollectionTime)
            .set(idcardAddress).equalToWhenPresent(record::getIdcardAddress)
            .set(name).equalToWhenPresent(record::getName)
            .set(idcard).equalToWhenPresent(record::getIdcard)
            .set(idcardImg).equalToWhenPresent(record::getIdcardImg)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(birthday).equalToWhenPresent(record::getBirthday)
            .set(nativePlace).equalToWhenPresent(record::getNativePlace)
            .set(education).equalToWhenPresent(record::getEducation)
            .set(profession).equalToWhenPresent(record::getProfession)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(roomRole).equalToWhenPresent(record::getRoomRole)
            .set(enterTime).equalToWhenPresent(record::getEnterTime)
            .set(owner).equalToWhenPresent(record::getOwner)
            .set(lon).equalToWhenPresent(record::getLon)
            .set(lat).equalToWhenPresent(record::getLat)
            .set(source).equalToWhenPresent(record::getSource)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(messageLogo).equalToWhenPresent(record::getMessageLogo)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}