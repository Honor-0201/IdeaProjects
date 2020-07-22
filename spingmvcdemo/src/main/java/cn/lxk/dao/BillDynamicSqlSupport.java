package cn.lxk.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BillDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Bill bill = new Bill();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = bill.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfhm = bill.dfhm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> thsj = bill.thsj;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> bfhm = bill.bfhm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> bfgsd = bill.bfgsd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfgsd = bill.dfgsd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> thsc = bill.thsc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jh = bill.jh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> lac = bill.lac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> ci = bill.ci;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> zbjbz = bill.zbjbz;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sjfsd = bill.sjfsd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> yys = bill.yys;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ajbh = bill.ajbh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jzjd = bill.jzjd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jzwd = bill.jzwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> xqdz = bill.xqdz;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userQxm = bill.userQxm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> publicFlag = bill.publicFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Bill extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> dfhm = column("dfhm", JDBCType.VARCHAR);

        public final SqlColumn<String> thsj = column("thsj", JDBCType.VARCHAR);

        public final SqlColumn<String> bfhm = column("bfhm", JDBCType.VARCHAR);

        public final SqlColumn<String> bfgsd = column("bfgsd", JDBCType.VARCHAR);

        public final SqlColumn<String> dfgsd = column("dfgsd", JDBCType.VARCHAR);

        public final SqlColumn<Integer> thsc = column("thsc", JDBCType.INTEGER);

        public final SqlColumn<String> jh = column("jh", JDBCType.VARCHAR);

        public final SqlColumn<Integer> lac = column("lac", JDBCType.INTEGER);

        public final SqlColumn<Integer> ci = column("ci", JDBCType.INTEGER);

        public final SqlColumn<String> zbjbz = column("zbjbz", JDBCType.VARCHAR);

        public final SqlColumn<String> sjfsd = column("sjfsd", JDBCType.VARCHAR);

        public final SqlColumn<String> yys = column("yys", JDBCType.VARCHAR);

        public final SqlColumn<String> ajbh = column("ajbh", JDBCType.VARCHAR);

        public final SqlColumn<String> jzjd = column("jzjd", JDBCType.VARCHAR);

        public final SqlColumn<String> jzwd = column("jzwd", JDBCType.VARCHAR);

        public final SqlColumn<String> xqdz = column("xqdz", JDBCType.VARCHAR);

        public final SqlColumn<String> userQxm = column("user_qxm", JDBCType.VARCHAR);

        public final SqlColumn<String> publicFlag = column("public_flag", JDBCType.VARCHAR);

        public Bill() {
            super("bill");
        }
    }
}