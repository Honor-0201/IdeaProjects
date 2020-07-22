package cn.lxk.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ActualPersonDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ActualPerson actualPerson = new ActualPerson();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = actualPerson.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personId = actualPerson.personId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> institutionId = actualPerson.institutionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = actualPerson.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regindId = actualPerson.regindId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userId = actualPerson.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> collectionTime = actualPerson.collectionTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> idcardAddress = actualPerson.idcardAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = actualPerson.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> idcard = actualPerson.idcard;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> idcardImg = actualPerson.idcardImg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sex = actualPerson.sex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> birthday = actualPerson.birthday;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nativePlace = actualPerson.nativePlace;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> education = actualPerson.education;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> profession = actualPerson.profession;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = actualPerson.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> roomRole = actualPerson.roomRole;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> enterTime = actualPerson.enterTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> owner = actualPerson.owner;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lon = actualPerson.lon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lat = actualPerson.lat;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> source = actualPerson.source;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> address = actualPerson.address;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> messageLogo = actualPerson.messageLogo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = actualPerson.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteFlag = actualPerson.deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ActualPerson extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> personId = column("person_id", JDBCType.VARCHAR);

        public final SqlColumn<String> institutionId = column("institution_id", JDBCType.VARCHAR);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> regindId = column("regind_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> collectionTime = column("collection_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> idcardAddress = column("idcard_address", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> idcard = column("idcard", JDBCType.VARCHAR);

        public final SqlColumn<String> idcardImg = column("idcard_img", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("sex", JDBCType.VARCHAR);

        public final SqlColumn<Date> birthday = column("birthday", JDBCType.TIMESTAMP);

        public final SqlColumn<String> nativePlace = column("native_place", JDBCType.VARCHAR);

        public final SqlColumn<String> education = column("education", JDBCType.VARCHAR);

        public final SqlColumn<String> profession = column("profession", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> roomRole = column("room_role", JDBCType.VARCHAR);

        public final SqlColumn<Date> enterTime = column("enter_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> owner = column("owner", JDBCType.VARCHAR);

        public final SqlColumn<String> lon = column("lon", JDBCType.VARCHAR);

        public final SqlColumn<String> lat = column("lat", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> messageLogo = column("message_logo", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.VARCHAR);

        public ActualPerson() {
            super("actual_person");
        }
    }
}