package cn.lxk.dao;

import static cn.lxk.dao.BillpersonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.Billperson;
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
public interface BillpersonMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, xm, sjhm, city, starttime, description, deleteflag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Billperson> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Billperson> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BillpersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xm", property="xm", jdbcType=JdbcType.VARCHAR),
        @Result(column="sjhm", property="sjhm", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="starttime", property="starttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteflag", property="deleteflag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Billperson> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BillpersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xm", property="xm", jdbcType=JdbcType.VARCHAR),
        @Result(column="sjhm", property="sjhm", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="starttime", property="starttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleteflag", property="deleteflag", jdbcType=JdbcType.VARCHAR)
    })
    List<Billperson> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, billperson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, billperson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Billperson record) {
        return MyBatis3Utils.insert(this::insert, record, billperson, c ->
            c.map(id).toProperty("id")
            .map(xm).toProperty("xm")
            .map(sjhm).toProperty("sjhm")
            .map(city).toProperty("city")
            .map(starttime).toProperty("starttime")
            .map(description).toProperty("description")
            .map(deleteflag).toProperty("deleteflag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Billperson> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, billperson, c ->
            c.map(id).toProperty("id")
            .map(xm).toProperty("xm")
            .map(sjhm).toProperty("sjhm")
            .map(city).toProperty("city")
            .map(starttime).toProperty("starttime")
            .map(description).toProperty("description")
            .map(deleteflag).toProperty("deleteflag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Billperson record) {
        return MyBatis3Utils.insert(this::insert, record, billperson, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(xm).toPropertyWhenPresent("xm", record::getXm)
            .map(sjhm).toPropertyWhenPresent("sjhm", record::getSjhm)
            .map(city).toPropertyWhenPresent("city", record::getCity)
            .map(starttime).toPropertyWhenPresent("starttime", record::getStarttime)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(deleteflag).toPropertyWhenPresent("deleteflag", record::getDeleteflag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Billperson> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, billperson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Billperson> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, billperson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Billperson> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, billperson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Billperson> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, billperson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Billperson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(xm).equalTo(record::getXm)
                .set(sjhm).equalTo(record::getSjhm)
                .set(city).equalTo(record::getCity)
                .set(starttime).equalTo(record::getStarttime)
                .set(description).equalTo(record::getDescription)
                .set(deleteflag).equalTo(record::getDeleteflag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Billperson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(xm).equalToWhenPresent(record::getXm)
                .set(sjhm).equalToWhenPresent(record::getSjhm)
                .set(city).equalToWhenPresent(record::getCity)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(deleteflag).equalToWhenPresent(record::getDeleteflag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Billperson record) {
        return update(c ->
            c.set(xm).equalTo(record::getXm)
            .set(sjhm).equalTo(record::getSjhm)
            .set(city).equalTo(record::getCity)
            .set(starttime).equalTo(record::getStarttime)
            .set(description).equalTo(record::getDescription)
            .set(deleteflag).equalTo(record::getDeleteflag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Billperson record) {
        return update(c ->
            c.set(xm).equalToWhenPresent(record::getXm)
            .set(sjhm).equalToWhenPresent(record::getSjhm)
            .set(city).equalToWhenPresent(record::getCity)
            .set(starttime).equalToWhenPresent(record::getStarttime)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(deleteflag).equalToWhenPresent(record::getDeleteflag)
            .where(id, isEqualTo(record::getId))
        );
    }
}