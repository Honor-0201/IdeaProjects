package cn.lxk.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MacDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Mac mac = new Mac();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = mac.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regindId = mac.regindId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> serialId = mac.serialId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userId = mac.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> collectionTime = mac.collectionTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ssid = mac.ssid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> address = mac.address;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> time = mac.time;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> typeOfDevice = mac.typeOfDevice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tzmac = mac.tzmac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> zdmac = mac.zdmac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> terminal = mac.terminal;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> encryption = mac.encryption;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> factory = mac.factory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> band = mac.band;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> channel = mac.channel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> signalstrength = mac.signalstrength;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> source = mac.source;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> messageLogo = mac.messageLogo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = mac.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteFlag = mac.deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Mac extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> regindId = column("regind_id", JDBCType.VARCHAR);

        public final SqlColumn<String> serialId = column("serial_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> collectionTime = column("collection_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ssid = column("ssid", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> typeOfDevice = column("type_of_device", JDBCType.VARCHAR);

        public final SqlColumn<String> tzmac = column("tzmac", JDBCType.VARCHAR);

        public final SqlColumn<String> zdmac = column("zdmac", JDBCType.VARCHAR);

        public final SqlColumn<String> terminal = column("terminal", JDBCType.VARCHAR);

        public final SqlColumn<String> encryption = column("encryption", JDBCType.VARCHAR);

        public final SqlColumn<String> factory = column("factory", JDBCType.VARCHAR);

        public final SqlColumn<String> band = column("band", JDBCType.VARCHAR);

        public final SqlColumn<String> channel = column("channel", JDBCType.VARCHAR);

        public final SqlColumn<String> signalstrength = column("signalstrength", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> messageLogo = column("message_logo", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.VARCHAR);

        public Mac() {
            super("mac");
        }
    }
}