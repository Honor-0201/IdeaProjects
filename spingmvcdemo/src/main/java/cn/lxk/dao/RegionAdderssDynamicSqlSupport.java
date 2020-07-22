package cn.lxk.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RegionAdderssDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final RegionAdderss regionAdderss = new RegionAdderss();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = regionAdderss.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regionId = regionAdderss.regionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> province = regionAdderss.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = regionAdderss.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> area = regionAdderss.area;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> street = regionAdderss.street;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> addressType = regionAdderss.addressType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> community = regionAdderss.community;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> buildNum = regionAdderss.buildNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> floorNum = regionAdderss.floorNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> unitNum = regionAdderss.unitNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> portalNum = regionAdderss.portalNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> village = regionAdderss.village;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> groupNum = regionAdderss.groupNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseNum = regionAdderss.houseNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adderss = regionAdderss.adderss;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> source = regionAdderss.source;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = regionAdderss.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class RegionAdderss extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> regionId = column("region_id", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> area = column("area", JDBCType.VARCHAR);

        public final SqlColumn<String> street = column("street", JDBCType.VARCHAR);

        public final SqlColumn<String> addressType = column("address_type", JDBCType.VARCHAR);

        public final SqlColumn<String> community = column("community", JDBCType.VARCHAR);

        public final SqlColumn<String> buildNum = column("build_num", JDBCType.VARCHAR);

        public final SqlColumn<String> floorNum = column("floor_num", JDBCType.VARCHAR);

        public final SqlColumn<String> unitNum = column("unit_num", JDBCType.VARCHAR);

        public final SqlColumn<String> portalNum = column("portal_num", JDBCType.VARCHAR);

        public final SqlColumn<String> village = column("village", JDBCType.VARCHAR);

        public final SqlColumn<String> groupNum = column("group_num", JDBCType.VARCHAR);

        public final SqlColumn<String> houseNum = column("house_num", JDBCType.VARCHAR);

        public final SqlColumn<String> adderss = column("adderss", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public RegionAdderss() {
            super("region_adderss");
        }
    }
}