package cn.lxk.dao;

import static cn.lxk.dao.WifitzdataDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.Wifitzdata;
import java.util.Collection;
import java.util.Date;
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
public interface WifitzdataMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, time, ssid, address, province, city, area, street, longitude, latitude, typeOfDevice, tzmac, zdmac, terminal, encryption, factory, band, channel, signalstrength, other);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Wifitzdata> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Wifitzdata> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WifitzdataResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP, id=true),
        @Result(column="ssid", property="ssid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_of_device", property="typeOfDevice", jdbcType=JdbcType.VARCHAR),
        @Result(column="tzmac", property="tzmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="zdmac", property="zdmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="terminal", property="terminal", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryption", property="encryption", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="band", property="band", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="signalstrength", property="signalstrength", jdbcType=JdbcType.VARCHAR),
        @Result(column="other", property="other", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Wifitzdata> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WifitzdataResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP, id=true),
        @Result(column="ssid", property="ssid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_of_device", property="typeOfDevice", jdbcType=JdbcType.VARCHAR),
        @Result(column="tzmac", property="tzmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="zdmac", property="zdmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="terminal", property="terminal", jdbcType=JdbcType.VARCHAR),
        @Result(column="encryption", property="encryption", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory", property="factory", jdbcType=JdbcType.VARCHAR),
        @Result(column="band", property="band", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="signalstrength", property="signalstrength", jdbcType=JdbcType.VARCHAR),
        @Result(column="other", property="other", jdbcType=JdbcType.VARCHAR)
    })
    List<Wifitzdata> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wifitzdata, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wifitzdata, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_, Date time_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(time, isEqualTo(time_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Wifitzdata record) {
        return MyBatis3Utils.insert(this::insert, record, wifitzdata, c ->
            c.map(id).toProperty("id")
            .map(time).toProperty("time")
            .map(ssid).toProperty("ssid")
            .map(address).toProperty("address")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(area).toProperty("area")
            .map(street).toProperty("street")
            .map(longitude).toProperty("longitude")
            .map(latitude).toProperty("latitude")
            .map(typeOfDevice).toProperty("typeOfDevice")
            .map(tzmac).toProperty("tzmac")
            .map(zdmac).toProperty("zdmac")
            .map(terminal).toProperty("terminal")
            .map(encryption).toProperty("encryption")
            .map(factory).toProperty("factory")
            .map(band).toProperty("band")
            .map(channel).toProperty("channel")
            .map(signalstrength).toProperty("signalstrength")
            .map(other).toProperty("other")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Wifitzdata> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wifitzdata, c ->
            c.map(id).toProperty("id")
            .map(time).toProperty("time")
            .map(ssid).toProperty("ssid")
            .map(address).toProperty("address")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(area).toProperty("area")
            .map(street).toProperty("street")
            .map(longitude).toProperty("longitude")
            .map(latitude).toProperty("latitude")
            .map(typeOfDevice).toProperty("typeOfDevice")
            .map(tzmac).toProperty("tzmac")
            .map(zdmac).toProperty("zdmac")
            .map(terminal).toProperty("terminal")
            .map(encryption).toProperty("encryption")
            .map(factory).toProperty("factory")
            .map(band).toProperty("band")
            .map(channel).toProperty("channel")
            .map(signalstrength).toProperty("signalstrength")
            .map(other).toProperty("other")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Wifitzdata record) {
        return MyBatis3Utils.insert(this::insert, record, wifitzdata, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(ssid).toPropertyWhenPresent("ssid", record::getSsid)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(province).toPropertyWhenPresent("province", record::getProvince)
            .map(city).toPropertyWhenPresent("city", record::getCity)
            .map(area).toPropertyWhenPresent("area", record::getArea)
            .map(street).toPropertyWhenPresent("street", record::getStreet)
            .map(longitude).toPropertyWhenPresent("longitude", record::getLongitude)
            .map(latitude).toPropertyWhenPresent("latitude", record::getLatitude)
            .map(typeOfDevice).toPropertyWhenPresent("typeOfDevice", record::getTypeOfDevice)
            .map(tzmac).toPropertyWhenPresent("tzmac", record::getTzmac)
            .map(zdmac).toPropertyWhenPresent("zdmac", record::getZdmac)
            .map(terminal).toPropertyWhenPresent("terminal", record::getTerminal)
            .map(encryption).toPropertyWhenPresent("encryption", record::getEncryption)
            .map(factory).toPropertyWhenPresent("factory", record::getFactory)
            .map(band).toPropertyWhenPresent("band", record::getBand)
            .map(channel).toPropertyWhenPresent("channel", record::getChannel)
            .map(signalstrength).toPropertyWhenPresent("signalstrength", record::getSignalstrength)
            .map(other).toPropertyWhenPresent("other", record::getOther)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Wifitzdata> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wifitzdata, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Wifitzdata> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wifitzdata, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Wifitzdata> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wifitzdata, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Wifitzdata> selectByPrimaryKey(Long id_, Date time_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(time, isEqualTo(time_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wifitzdata, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Wifitzdata record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(time).equalTo(record::getTime)
                .set(ssid).equalTo(record::getSsid)
                .set(address).equalTo(record::getAddress)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(area).equalTo(record::getArea)
                .set(street).equalTo(record::getStreet)
                .set(longitude).equalTo(record::getLongitude)
                .set(latitude).equalTo(record::getLatitude)
                .set(typeOfDevice).equalTo(record::getTypeOfDevice)
                .set(tzmac).equalTo(record::getTzmac)
                .set(zdmac).equalTo(record::getZdmac)
                .set(terminal).equalTo(record::getTerminal)
                .set(encryption).equalTo(record::getEncryption)
                .set(factory).equalTo(record::getFactory)
                .set(band).equalTo(record::getBand)
                .set(channel).equalTo(record::getChannel)
                .set(signalstrength).equalTo(record::getSignalstrength)
                .set(other).equalTo(record::getOther);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Wifitzdata record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(time).equalToWhenPresent(record::getTime)
                .set(ssid).equalToWhenPresent(record::getSsid)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(area).equalToWhenPresent(record::getArea)
                .set(street).equalToWhenPresent(record::getStreet)
                .set(longitude).equalToWhenPresent(record::getLongitude)
                .set(latitude).equalToWhenPresent(record::getLatitude)
                .set(typeOfDevice).equalToWhenPresent(record::getTypeOfDevice)
                .set(tzmac).equalToWhenPresent(record::getTzmac)
                .set(zdmac).equalToWhenPresent(record::getZdmac)
                .set(terminal).equalToWhenPresent(record::getTerminal)
                .set(encryption).equalToWhenPresent(record::getEncryption)
                .set(factory).equalToWhenPresent(record::getFactory)
                .set(band).equalToWhenPresent(record::getBand)
                .set(channel).equalToWhenPresent(record::getChannel)
                .set(signalstrength).equalToWhenPresent(record::getSignalstrength)
                .set(other).equalToWhenPresent(record::getOther);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Wifitzdata record) {
        return update(c ->
            c.set(ssid).equalTo(record::getSsid)
            .set(address).equalTo(record::getAddress)
            .set(province).equalTo(record::getProvince)
            .set(city).equalTo(record::getCity)
            .set(area).equalTo(record::getArea)
            .set(street).equalTo(record::getStreet)
            .set(longitude).equalTo(record::getLongitude)
            .set(latitude).equalTo(record::getLatitude)
            .set(typeOfDevice).equalTo(record::getTypeOfDevice)
            .set(tzmac).equalTo(record::getTzmac)
            .set(zdmac).equalTo(record::getZdmac)
            .set(terminal).equalTo(record::getTerminal)
            .set(encryption).equalTo(record::getEncryption)
            .set(factory).equalTo(record::getFactory)
            .set(band).equalTo(record::getBand)
            .set(channel).equalTo(record::getChannel)
            .set(signalstrength).equalTo(record::getSignalstrength)
            .set(other).equalTo(record::getOther)
            .where(id, isEqualTo(record::getId))
            .and(time, isEqualTo(record::getTime))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Wifitzdata record) {
        return update(c ->
            c.set(ssid).equalToWhenPresent(record::getSsid)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(province).equalToWhenPresent(record::getProvince)
            .set(city).equalToWhenPresent(record::getCity)
            .set(area).equalToWhenPresent(record::getArea)
            .set(street).equalToWhenPresent(record::getStreet)
            .set(longitude).equalToWhenPresent(record::getLongitude)
            .set(latitude).equalToWhenPresent(record::getLatitude)
            .set(typeOfDevice).equalToWhenPresent(record::getTypeOfDevice)
            .set(tzmac).equalToWhenPresent(record::getTzmac)
            .set(zdmac).equalToWhenPresent(record::getZdmac)
            .set(terminal).equalToWhenPresent(record::getTerminal)
            .set(encryption).equalToWhenPresent(record::getEncryption)
            .set(factory).equalToWhenPresent(record::getFactory)
            .set(band).equalToWhenPresent(record::getBand)
            .set(channel).equalToWhenPresent(record::getChannel)
            .set(signalstrength).equalToWhenPresent(record::getSignalstrength)
            .set(other).equalToWhenPresent(record::getOther)
            .where(id, isEqualTo(record::getId))
            .and(time, isEqualTo(record::getTime))
        );
    }
}