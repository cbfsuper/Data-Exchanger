package com.cbf.data_exchange.config_enum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sky
 * @version 1.0
 * @date 2021/5/28
 * @description:
 */
public enum MysqlDataTypeEnum {
    BIT("bit"),
    BIGINT("bigint"),
    TEXT("text"),
    SMALLINT("smallint"),
    BLOB("blob"),
    BINARY("binary"),
    GEOMETRY("geometry"),
    MULTIPOINT("multipoint"),
    INT("int"),
    SET("set"),
    DOUBLE("double"),
    POINT("point"),
    VARBINARY("varbinary"),
    TINYBLOB("tinyblob"),
    DATETIME("datetime"),
    TIMESTAMP("timestamp"),
    MULTIPOLYGON("multipolygon"),
    MEDIUMINT("mediumint"),
    MEDIUMTEXT("mediumtext"),
    DATE("date"),
    LINESTRING("linestring"),
    MEDIUMBLOB("mediumblob"),
    TIME("time"),
    LONGTEXT("longtext"),
    DECIMAL("decimal"),
    GEOMETRYCOLLECTION("geometrycollection"),
    VARCHAR("varchar"),
    FLOAT("float"),
    LONGBLOB("longblob"),
    MULTILINESTRING("multilinestring"),
    TINYTEXT("tinytext"),
    ENUM("enum"),
    CHAR("char"),
    TINYINT("tinyint"),
    JSON("json"),
    POLYGON("polygon"),
    REAL("real"),
    NUMERIC("numeric"),
    INTEGER("integer");
    private String dbType;
    public String getDbType() {
        return dbType;
    }
    MysqlDataTypeEnum(String dbType){
        this.dbType = dbType;
    }

    /**
     * {mysqlDataTypeString:MysqlDataTypeEnum}
     */
    public static Map<String, MysqlDataTypeEnum> map = new HashMap<>();;
    static {
        constructTypeMap();
    }
    private static void constructTypeMap(){
        MysqlDataTypeEnum[] typeEnums = MysqlDataTypeEnum.values();
        for(MysqlDataTypeEnum typeEnum: typeEnums){
            map.put(typeEnum.getDbType(), typeEnum);
        }
    }
    public MysqlDataTypeEnum getEnum(String dbType){
        return map.get(dbType);
    }

}
