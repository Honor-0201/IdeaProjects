package cn.lxk.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ActualInstitutionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ActualInstitution actualInstitution = new ActualInstitution();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = actualInstitution.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> institutionId = actualInstitution.institutionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> houseId = actualInstitution.houseId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regindId = actualInstitution.regindId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userId = actualInstitution.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> collectionTime = actualInstitution.collectionTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> institutionName = actualInstitution.institutionName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> institutionType = actualInstitution.institutionType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> placeOfficeTime = actualInstitution.placeOfficeTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> legalPerson = actualInstitution.legalPerson;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Double> registeredCapital = actualInstitution.registeredCapital;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> registerDate = actualInstitution.registerDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startTime = actualInstitution.startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> endTime = actualInstitution.endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> registeredAddress = actualInstitution.registeredAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> employeeNum = actualInstitution.employeeNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lon = actualInstitution.lon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lat = actualInstitution.lat;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> source = actualInstitution.source;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> messageLogo = actualInstitution.messageLogo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = actualInstitution.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deleteFlag = actualInstitution.deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ActualInstitution extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> institutionId = column("institution_id", JDBCType.VARCHAR);

        public final SqlColumn<String> houseId = column("house_id", JDBCType.VARCHAR);

        public final SqlColumn<String> regindId = column("regind_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> collectionTime = column("collection_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> institutionName = column("institution_name", JDBCType.VARCHAR);

        public final SqlColumn<String> institutionType = column("institution_type", JDBCType.VARCHAR);

        public final SqlColumn<Date> placeOfficeTime = column("place_office_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> legalPerson = column("legal_person", JDBCType.VARCHAR);

        public final SqlColumn<Double> registeredCapital = column("registered_capital", JDBCType.DOUBLE);

        public final SqlColumn<Date> registerDate = column("register_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> registeredAddress = column("registered_address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> employeeNum = column("employee_num", JDBCType.INTEGER);

        public final SqlColumn<String> lon = column("lon", JDBCType.VARCHAR);

        public final SqlColumn<String> lat = column("lat", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> messageLogo = column("message_logo", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> deleteFlag = column("delete_flag", JDBCType.VARCHAR);

        public ActualInstitution() {
            super("actual_institution");
        }
    }
}