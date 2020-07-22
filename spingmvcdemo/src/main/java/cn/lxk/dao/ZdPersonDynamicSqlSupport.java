package cn.lxk.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZdPersonDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ZdPerson zdPerson = new ZdPerson();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = zdPerson.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = zdPerson.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> bfAccount = zdPerson.bfAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteFlag = zdPerson.deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> caseNum = zdPerson.caseNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ZdPerson extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> bfAccount = column("bf_account", JDBCType.VARCHAR);

        public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.CHAR);

        public final SqlColumn<String> caseNum = column("case_num", JDBCType.VARCHAR);

        public ZdPerson() {
            super("zd_person");
        }
    }
}