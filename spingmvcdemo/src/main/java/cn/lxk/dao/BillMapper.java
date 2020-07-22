package cn.lxk.dao;

import static cn.lxk.dao.BillDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.Bill;
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
public interface BillMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, dfhm, thsj, bfhm, bfgsd, dfgsd, thsc, jh, lac, ci, zbjbz, sjfsd, yys, ajbh, jzjd, jzwd, xqdz, userQxm, publicFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Bill> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Bill> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BillResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dfhm", property="dfhm", jdbcType=JdbcType.VARCHAR),
        @Result(column="thsj", property="thsj", jdbcType=JdbcType.VARCHAR),
        @Result(column="bfhm", property="bfhm", jdbcType=JdbcType.VARCHAR),
        @Result(column="bfgsd", property="bfgsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="dfgsd", property="dfgsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="thsc", property="thsc", jdbcType=JdbcType.INTEGER),
        @Result(column="jh", property="jh", jdbcType=JdbcType.VARCHAR),
        @Result(column="lac", property="lac", jdbcType=JdbcType.INTEGER),
        @Result(column="ci", property="ci", jdbcType=JdbcType.INTEGER),
        @Result(column="zbjbz", property="zbjbz", jdbcType=JdbcType.VARCHAR),
        @Result(column="sjfsd", property="sjfsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="yys", property="yys", jdbcType=JdbcType.VARCHAR),
        @Result(column="ajbh", property="ajbh", jdbcType=JdbcType.VARCHAR),
        @Result(column="jzjd", property="jzjd", jdbcType=JdbcType.VARCHAR),
        @Result(column="jzwd", property="jzwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="xqdz", property="xqdz", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_qxm", property="userQxm", jdbcType=JdbcType.VARCHAR),
        @Result(column="public_flag", property="publicFlag", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Bill> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BillResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dfhm", property="dfhm", jdbcType=JdbcType.VARCHAR),
        @Result(column="thsj", property="thsj", jdbcType=JdbcType.VARCHAR),
        @Result(column="bfhm", property="bfhm", jdbcType=JdbcType.VARCHAR),
        @Result(column="bfgsd", property="bfgsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="dfgsd", property="dfgsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="thsc", property="thsc", jdbcType=JdbcType.INTEGER),
        @Result(column="jh", property="jh", jdbcType=JdbcType.VARCHAR),
        @Result(column="lac", property="lac", jdbcType=JdbcType.INTEGER),
        @Result(column="ci", property="ci", jdbcType=JdbcType.INTEGER),
        @Result(column="zbjbz", property="zbjbz", jdbcType=JdbcType.VARCHAR),
        @Result(column="sjfsd", property="sjfsd", jdbcType=JdbcType.VARCHAR),
        @Result(column="yys", property="yys", jdbcType=JdbcType.VARCHAR),
        @Result(column="ajbh", property="ajbh", jdbcType=JdbcType.VARCHAR),
        @Result(column="jzjd", property="jzjd", jdbcType=JdbcType.VARCHAR),
        @Result(column="jzwd", property="jzwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="xqdz", property="xqdz", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_qxm", property="userQxm", jdbcType=JdbcType.VARCHAR),
        @Result(column="public_flag", property="publicFlag", jdbcType=JdbcType.VARCHAR)
    })
    List<Bill> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bill, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bill, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Bill record) {
        return MyBatis3Utils.insert(this::insert, record, bill, c ->
            c.map(id).toProperty("id")
            .map(dfhm).toProperty("dfhm")
            .map(thsj).toProperty("thsj")
            .map(bfhm).toProperty("bfhm")
            .map(bfgsd).toProperty("bfgsd")
            .map(dfgsd).toProperty("dfgsd")
            .map(thsc).toProperty("thsc")
            .map(jh).toProperty("jh")
            .map(lac).toProperty("lac")
            .map(ci).toProperty("ci")
            .map(zbjbz).toProperty("zbjbz")
            .map(sjfsd).toProperty("sjfsd")
            .map(yys).toProperty("yys")
            .map(ajbh).toProperty("ajbh")
            .map(jzjd).toProperty("jzjd")
            .map(jzwd).toProperty("jzwd")
            .map(xqdz).toProperty("xqdz")
            .map(userQxm).toProperty("userQxm")
            .map(publicFlag).toProperty("publicFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Bill> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, bill, c ->
            c.map(id).toProperty("id")
            .map(dfhm).toProperty("dfhm")
            .map(thsj).toProperty("thsj")
            .map(bfhm).toProperty("bfhm")
            .map(bfgsd).toProperty("bfgsd")
            .map(dfgsd).toProperty("dfgsd")
            .map(thsc).toProperty("thsc")
            .map(jh).toProperty("jh")
            .map(lac).toProperty("lac")
            .map(ci).toProperty("ci")
            .map(zbjbz).toProperty("zbjbz")
            .map(sjfsd).toProperty("sjfsd")
            .map(yys).toProperty("yys")
            .map(ajbh).toProperty("ajbh")
            .map(jzjd).toProperty("jzjd")
            .map(jzwd).toProperty("jzwd")
            .map(xqdz).toProperty("xqdz")
            .map(userQxm).toProperty("userQxm")
            .map(publicFlag).toProperty("publicFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Bill record) {
        return MyBatis3Utils.insert(this::insert, record, bill, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(dfhm).toPropertyWhenPresent("dfhm", record::getDfhm)
            .map(thsj).toPropertyWhenPresent("thsj", record::getThsj)
            .map(bfhm).toPropertyWhenPresent("bfhm", record::getBfhm)
            .map(bfgsd).toPropertyWhenPresent("bfgsd", record::getBfgsd)
            .map(dfgsd).toPropertyWhenPresent("dfgsd", record::getDfgsd)
            .map(thsc).toPropertyWhenPresent("thsc", record::getThsc)
            .map(jh).toPropertyWhenPresent("jh", record::getJh)
            .map(lac).toPropertyWhenPresent("lac", record::getLac)
            .map(ci).toPropertyWhenPresent("ci", record::getCi)
            .map(zbjbz).toPropertyWhenPresent("zbjbz", record::getZbjbz)
            .map(sjfsd).toPropertyWhenPresent("sjfsd", record::getSjfsd)
            .map(yys).toPropertyWhenPresent("yys", record::getYys)
            .map(ajbh).toPropertyWhenPresent("ajbh", record::getAjbh)
            .map(jzjd).toPropertyWhenPresent("jzjd", record::getJzjd)
            .map(jzwd).toPropertyWhenPresent("jzwd", record::getJzwd)
            .map(xqdz).toPropertyWhenPresent("xqdz", record::getXqdz)
            .map(userQxm).toPropertyWhenPresent("userQxm", record::getUserQxm)
            .map(publicFlag).toPropertyWhenPresent("publicFlag", record::getPublicFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Bill> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bill, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Bill> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bill, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Bill> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bill, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Bill> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bill, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Bill record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(dfhm).equalTo(record::getDfhm)
                .set(thsj).equalTo(record::getThsj)
                .set(bfhm).equalTo(record::getBfhm)
                .set(bfgsd).equalTo(record::getBfgsd)
                .set(dfgsd).equalTo(record::getDfgsd)
                .set(thsc).equalTo(record::getThsc)
                .set(jh).equalTo(record::getJh)
                .set(lac).equalTo(record::getLac)
                .set(ci).equalTo(record::getCi)
                .set(zbjbz).equalTo(record::getZbjbz)
                .set(sjfsd).equalTo(record::getSjfsd)
                .set(yys).equalTo(record::getYys)
                .set(ajbh).equalTo(record::getAjbh)
                .set(jzjd).equalTo(record::getJzjd)
                .set(jzwd).equalTo(record::getJzwd)
                .set(xqdz).equalTo(record::getXqdz)
                .set(userQxm).equalTo(record::getUserQxm)
                .set(publicFlag).equalTo(record::getPublicFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Bill record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(dfhm).equalToWhenPresent(record::getDfhm)
                .set(thsj).equalToWhenPresent(record::getThsj)
                .set(bfhm).equalToWhenPresent(record::getBfhm)
                .set(bfgsd).equalToWhenPresent(record::getBfgsd)
                .set(dfgsd).equalToWhenPresent(record::getDfgsd)
                .set(thsc).equalToWhenPresent(record::getThsc)
                .set(jh).equalToWhenPresent(record::getJh)
                .set(lac).equalToWhenPresent(record::getLac)
                .set(ci).equalToWhenPresent(record::getCi)
                .set(zbjbz).equalToWhenPresent(record::getZbjbz)
                .set(sjfsd).equalToWhenPresent(record::getSjfsd)
                .set(yys).equalToWhenPresent(record::getYys)
                .set(ajbh).equalToWhenPresent(record::getAjbh)
                .set(jzjd).equalToWhenPresent(record::getJzjd)
                .set(jzwd).equalToWhenPresent(record::getJzwd)
                .set(xqdz).equalToWhenPresent(record::getXqdz)
                .set(userQxm).equalToWhenPresent(record::getUserQxm)
                .set(publicFlag).equalToWhenPresent(record::getPublicFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Bill record) {
        return update(c ->
            c.set(dfhm).equalTo(record::getDfhm)
            .set(thsj).equalTo(record::getThsj)
            .set(bfhm).equalTo(record::getBfhm)
            .set(bfgsd).equalTo(record::getBfgsd)
            .set(dfgsd).equalTo(record::getDfgsd)
            .set(thsc).equalTo(record::getThsc)
            .set(jh).equalTo(record::getJh)
            .set(lac).equalTo(record::getLac)
            .set(ci).equalTo(record::getCi)
            .set(zbjbz).equalTo(record::getZbjbz)
            .set(sjfsd).equalTo(record::getSjfsd)
            .set(yys).equalTo(record::getYys)
            .set(ajbh).equalTo(record::getAjbh)
            .set(jzjd).equalTo(record::getJzjd)
            .set(jzwd).equalTo(record::getJzwd)
            .set(xqdz).equalTo(record::getXqdz)
            .set(userQxm).equalTo(record::getUserQxm)
            .set(publicFlag).equalTo(record::getPublicFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Bill record) {
        return update(c ->
            c.set(dfhm).equalToWhenPresent(record::getDfhm)
            .set(thsj).equalToWhenPresent(record::getThsj)
            .set(bfhm).equalToWhenPresent(record::getBfhm)
            .set(bfgsd).equalToWhenPresent(record::getBfgsd)
            .set(dfgsd).equalToWhenPresent(record::getDfgsd)
            .set(thsc).equalToWhenPresent(record::getThsc)
            .set(jh).equalToWhenPresent(record::getJh)
            .set(lac).equalToWhenPresent(record::getLac)
            .set(ci).equalToWhenPresent(record::getCi)
            .set(zbjbz).equalToWhenPresent(record::getZbjbz)
            .set(sjfsd).equalToWhenPresent(record::getSjfsd)
            .set(yys).equalToWhenPresent(record::getYys)
            .set(ajbh).equalToWhenPresent(record::getAjbh)
            .set(jzjd).equalToWhenPresent(record::getJzjd)
            .set(jzwd).equalToWhenPresent(record::getJzwd)
            .set(xqdz).equalToWhenPresent(record::getXqdz)
            .set(userQxm).equalToWhenPresent(record::getUserQxm)
            .set(publicFlag).equalToWhenPresent(record::getPublicFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}