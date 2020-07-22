package cn.lxk.dao;

import static cn.lxk.dao.ZdPersonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lxk.entity.ZdPerson;
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
public interface ZdPersonMapper {

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, bfAccount, deleteFlag, caseNum);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZdPerson> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ZdPerson> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZdPersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="bf_account", property="bfAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.CHAR),
        @Result(column="case_num", property="caseNum", jdbcType=JdbcType.VARCHAR)
    })
    Optional<ZdPerson> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZdPersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="bf_account", property="bfAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.CHAR),
        @Result(column="case_num", property="caseNum", jdbcType=JdbcType.VARCHAR)
    })
    List<ZdPerson> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, zdPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, zdPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ZdPerson record) {
        return MyBatis3Utils.insert(this::insert, record, zdPerson, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(bfAccount).toProperty("bfAccount")
            .map(deleteFlag).toProperty("deleteFlag")
            .map(caseNum).toProperty("caseNum")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ZdPerson> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, zdPerson, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(bfAccount).toProperty("bfAccount")
            .map(deleteFlag).toProperty("deleteFlag")
            .map(caseNum).toProperty("caseNum")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ZdPerson record) {
        return MyBatis3Utils.insert(this::insert, record, zdPerson, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(bfAccount).toPropertyWhenPresent("bfAccount", record::getBfAccount)
            .map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::getDeleteFlag)
            .map(caseNum).toPropertyWhenPresent("caseNum", record::getCaseNum)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ZdPerson> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, zdPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ZdPerson> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, zdPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ZdPerson> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, zdPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ZdPerson> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, zdPerson, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ZdPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(bfAccount).equalTo(record::getBfAccount)
                .set(deleteFlag).equalTo(record::getDeleteFlag)
                .set(caseNum).equalTo(record::getCaseNum);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ZdPerson record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(bfAccount).equalToWhenPresent(record::getBfAccount)
                .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
                .set(caseNum).equalToWhenPresent(record::getCaseNum);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ZdPerson record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(bfAccount).equalTo(record::getBfAccount)
            .set(deleteFlag).equalTo(record::getDeleteFlag)
            .set(caseNum).equalTo(record::getCaseNum)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ZdPerson record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(bfAccount).equalToWhenPresent(record::getBfAccount)
            .set(deleteFlag).equalToWhenPresent(record::getDeleteFlag)
            .set(caseNum).equalToWhenPresent(record::getCaseNum)
            .where(id, isEqualTo(record::getId))
        );
    }
}