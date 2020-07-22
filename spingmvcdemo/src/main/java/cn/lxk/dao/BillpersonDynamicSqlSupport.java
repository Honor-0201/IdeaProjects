package cn.lxk.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BillpersonDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Billperson billperson = new Billperson();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = billperson.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> xm = billperson.xm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sjhm = billperson.sjhm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = billperson.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> starttime = billperson.starttime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = billperson.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteflag = billperson.deleteflag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Billperson extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> xm = column("xm", JDBCType.VARCHAR);

        public final SqlColumn<String> sjhm = column("sjhm", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> starttime = column("starttime", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> deleteflag = column("deleteflag", JDBCType.VARCHAR);

        public Billperson() {
            super("billperson");
        }
    }
}