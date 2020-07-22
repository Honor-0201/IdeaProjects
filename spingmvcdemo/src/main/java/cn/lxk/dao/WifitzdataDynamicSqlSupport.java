package cn.lxk.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WifitzdataDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Wifitzdata wifitzdata = new Wifitzdata();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = wifitzdata.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> time = wifitzdata.time;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ssid = wifitzdata.ssid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> address = wifitzdata.address;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> province = wifitzdata.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = wifitzdata.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> area = wifitzdata.area;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> street = wifitzdata.street;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> longitude = wifitzdata.longitude;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> latitude = wifitzdata.latitude;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> typeOfDevice = wifitzdata.typeOfDevice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tzmac = wifitzdata.tzmac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> zdmac = wifitzdata.zdmac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> terminal = wifitzdata.terminal;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> encryption = wifitzdata.encryption;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> factory = wifitzdata.factory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> band = wifitzdata.band;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> channel = wifitzdata.channel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> signalstrength = wifitzdata.signalstrength;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> other = wifitzdata.other;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Wifitzdata extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ssid = column("ssid", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> area = column("area", JDBCType.VARCHAR);

        public final SqlColumn<String> street = column("street", JDBCType.VARCHAR);

        public final SqlColumn<String> longitude = column("longitude", JDBCType.VARCHAR);

        public final SqlColumn<String> latitude = column("latitude", JDBCType.VARCHAR);

        public final SqlColumn<String> typeOfDevice = column("type_of_device", JDBCType.VARCHAR);

        public final SqlColumn<String> tzmac = column("tzmac", JDBCType.VARCHAR);

        public final SqlColumn<String> zdmac = column("zdmac", JDBCType.VARCHAR);

        public final SqlColumn<String> terminal = column("terminal", JDBCType.VARCHAR);

        public final SqlColumn<String> encryption = column("encryption", JDBCType.VARCHAR);

        public final SqlColumn<String> factory = column("factory", JDBCType.VARCHAR);

        public final SqlColumn<String> band = column("band", JDBCType.VARCHAR);

        public final SqlColumn<String> channel = column("channel", JDBCType.VARCHAR);

        public final SqlColumn<String> signalstrength = column("signalstrength", JDBCType.VARCHAR);

        public final SqlColumn<String> other = column("other", JDBCType.VARCHAR);

        public Wifitzdata() {
            super("wifitzdata");
        }
    }
}