package cn.lxk.dao;

import static cn.lxk.dao.RegionAdderssDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.RegionAdderss;
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
public interface RegionAdderssMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, regionId, province, city, area, street, addressType, community, buildNum, floorNum, unitNum, portalNum, village, groupNum, houseNum, adderss, source, createTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RegionAdderss> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RegionAdderss> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RegionAdderssResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="region_id", property="regionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_type", property="addressType", jdbcType=JdbcType.VARCHAR),
        @Result(column="community", property="community", jdbcType=JdbcType.VARCHAR),
        @Result(column="build_num", property="buildNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="floor_num", property="floorNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit_num", property="unitNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="portal_num", property="portalNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="village", property="village", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_num", property="groupNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_num", property="houseNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="adderss", property="adderss", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Optional<RegionAdderss> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RegionAdderssResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="region_id", property="regionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_type", property="addressType", jdbcType=JdbcType.VARCHAR),
        @Result(column="community", property="community", jdbcType=JdbcType.VARCHAR),
        @Result(column="build_num", property="buildNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="floor_num", property="floorNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit_num", property="unitNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="portal_num", property="portalNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="village", property="village", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_num", property="groupNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_num", property="houseNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="adderss", property="adderss", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RegionAdderss> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, regionAdderss, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, regionAdderss, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(RegionAdderss record) {
        return MyBatis3Utils.insert(this::insert, record, regionAdderss, c ->
            c.map(id).toProperty("id")
            .map(regionId).toProperty("regionId")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(area).toProperty("area")
            .map(street).toProperty("street")
            .map(addressType).toProperty("addressType")
            .map(community).toProperty("community")
            .map(buildNum).toProperty("buildNum")
            .map(floorNum).toProperty("floorNum")
            .map(unitNum).toProperty("unitNum")
            .map(portalNum).toProperty("portalNum")
            .map(village).toProperty("village")
            .map(groupNum).toProperty("groupNum")
            .map(houseNum).toProperty("houseNum")
            .map(adderss).toProperty("adderss")
            .map(source).toProperty("source")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<RegionAdderss> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, regionAdderss, c ->
            c.map(id).toProperty("id")
            .map(regionId).toProperty("regionId")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(area).toProperty("area")
            .map(street).toProperty("street")
            .map(addressType).toProperty("addressType")
            .map(community).toProperty("community")
            .map(buildNum).toProperty("buildNum")
            .map(floorNum).toProperty("floorNum")
            .map(unitNum).toProperty("unitNum")
            .map(portalNum).toProperty("portalNum")
            .map(village).toProperty("village")
            .map(groupNum).toProperty("groupNum")
            .map(houseNum).toProperty("houseNum")
            .map(adderss).toProperty("adderss")
            .map(source).toProperty("source")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(RegionAdderss record) {
        return MyBatis3Utils.insert(this::insert, record, regionAdderss, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(regionId).toPropertyWhenPresent("regionId", record::getRegionId)
            .map(province).toPropertyWhenPresent("province", record::getProvince)
            .map(city).toPropertyWhenPresent("city", record::getCity)
            .map(area).toPropertyWhenPresent("area", record::getArea)
            .map(street).toPropertyWhenPresent("street", record::getStreet)
            .map(addressType).toPropertyWhenPresent("addressType", record::getAddressType)
            .map(community).toPropertyWhenPresent("community", record::getCommunity)
            .map(buildNum).toPropertyWhenPresent("buildNum", record::getBuildNum)
            .map(floorNum).toPropertyWhenPresent("floorNum", record::getFloorNum)
            .map(unitNum).toPropertyWhenPresent("unitNum", record::getUnitNum)
            .map(portalNum).toPropertyWhenPresent("portalNum", record::getPortalNum)
            .map(village).toPropertyWhenPresent("village", record::getVillage)
            .map(groupNum).toPropertyWhenPresent("groupNum", record::getGroupNum)
            .map(houseNum).toPropertyWhenPresent("houseNum", record::getHouseNum)
            .map(adderss).toPropertyWhenPresent("adderss", record::getAdderss)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RegionAdderss> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, regionAdderss, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RegionAdderss> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, regionAdderss, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RegionAdderss> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, regionAdderss, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RegionAdderss> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, regionAdderss, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(RegionAdderss record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(regionId).equalTo(record::getRegionId)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(area).equalTo(record::getArea)
                .set(street).equalTo(record::getStreet)
                .set(addressType).equalTo(record::getAddressType)
                .set(community).equalTo(record::getCommunity)
                .set(buildNum).equalTo(record::getBuildNum)
                .set(floorNum).equalTo(record::getFloorNum)
                .set(unitNum).equalTo(record::getUnitNum)
                .set(portalNum).equalTo(record::getPortalNum)
                .set(village).equalTo(record::getVillage)
                .set(groupNum).equalTo(record::getGroupNum)
                .set(houseNum).equalTo(record::getHouseNum)
                .set(adderss).equalTo(record::getAdderss)
                .set(source).equalTo(record::getSource)
                .set(createTime).equalTo(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RegionAdderss record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(regionId).equalToWhenPresent(record::getRegionId)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(area).equalToWhenPresent(record::getArea)
                .set(street).equalToWhenPresent(record::getStreet)
                .set(addressType).equalToWhenPresent(record::getAddressType)
                .set(community).equalToWhenPresent(record::getCommunity)
                .set(buildNum).equalToWhenPresent(record::getBuildNum)
                .set(floorNum).equalToWhenPresent(record::getFloorNum)
                .set(unitNum).equalToWhenPresent(record::getUnitNum)
                .set(portalNum).equalToWhenPresent(record::getPortalNum)
                .set(village).equalToWhenPresent(record::getVillage)
                .set(groupNum).equalToWhenPresent(record::getGroupNum)
                .set(houseNum).equalToWhenPresent(record::getHouseNum)
                .set(adderss).equalToWhenPresent(record::getAdderss)
                .set(source).equalToWhenPresent(record::getSource)
                .set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(RegionAdderss record) {
        return update(c ->
            c.set(regionId).equalTo(record::getRegionId)
            .set(province).equalTo(record::getProvince)
            .set(city).equalTo(record::getCity)
            .set(area).equalTo(record::getArea)
            .set(street).equalTo(record::getStreet)
            .set(addressType).equalTo(record::getAddressType)
            .set(community).equalTo(record::getCommunity)
            .set(buildNum).equalTo(record::getBuildNum)
            .set(floorNum).equalTo(record::getFloorNum)
            .set(unitNum).equalTo(record::getUnitNum)
            .set(portalNum).equalTo(record::getPortalNum)
            .set(village).equalTo(record::getVillage)
            .set(groupNum).equalTo(record::getGroupNum)
            .set(houseNum).equalTo(record::getHouseNum)
            .set(adderss).equalTo(record::getAdderss)
            .set(source).equalTo(record::getSource)
            .set(createTime).equalTo(record::getCreateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(RegionAdderss record) {
        return update(c ->
            c.set(regionId).equalToWhenPresent(record::getRegionId)
            .set(province).equalToWhenPresent(record::getProvince)
            .set(city).equalToWhenPresent(record::getCity)
            .set(area).equalToWhenPresent(record::getArea)
            .set(street).equalToWhenPresent(record::getStreet)
            .set(addressType).equalToWhenPresent(record::getAddressType)
            .set(community).equalToWhenPresent(record::getCommunity)
            .set(buildNum).equalToWhenPresent(record::getBuildNum)
            .set(floorNum).equalToWhenPresent(record::getFloorNum)
            .set(unitNum).equalToWhenPresent(record::getUnitNum)
            .set(portalNum).equalToWhenPresent(record::getPortalNum)
            .set(village).equalToWhenPresent(record::getVillage)
            .set(groupNum).equalToWhenPresent(record::getGroupNum)
            .set(houseNum).equalToWhenPresent(record::getHouseNum)
            .set(adderss).equalToWhenPresent(record::getAdderss)
            .set(source).equalToWhenPresent(record::getSource)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}