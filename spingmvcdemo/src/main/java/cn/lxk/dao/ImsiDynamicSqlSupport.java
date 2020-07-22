package cn.lxk.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ImsiDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Imsi imsi = new Imsi();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = imsi.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regindId = imsi.regindId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> serialId = imsi.serialId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userId = imsi.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> collectionTime = imsi.collectionTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> time = imsi.time;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> source = imsi.source;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> messageLogo = imsi.messageLogo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = imsi.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteFlag = imsi.deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Imsi extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> regindId = column("regind_id", JDBCType.VARCHAR);

        public final SqlColumn<String> serialId = column("serial_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> collectionTime = column("collection_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> imsi = column("imsi", JDBCType.VARCHAR);

        public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> messageLogo = column("message_logo", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.VARCHAR);

        public Imsi() {
            super("imsi");
        }
    }
}