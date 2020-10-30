package com.wulee.administrator.zuji.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.wulee.administrator.zuji.database.bean.PersonInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PERSONINFO_TABLE".
*/
public class PersonInfoDao extends AbstractDao<PersonInfo, String> {

    public static final String TABLENAME = "PERSONINFO_TABLE";

    /**
     * Properties of entity PersonInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Mobile = new Property(0, String.class, "mobile", true, "MOBILE");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Sex = new Property(2, String.class, "sex", false, "SEX");
        public final static Property Birthday = new Property(3, String.class, "birthday", false, "BIRTHDAY");
        public final static Property Address = new Property(4, String.class, "address", false, "ADDRESS");
        public final static Property Header_img_url = new Property(5, String.class, "header_img_url", false, "HEADER_IMG_URL");
        public final static Property HomeLat = new Property(6, Double.class, "homeLat", false, "HOME_LAT");
        public final static Property HomeLon = new Property(7, Double.class, "homeLon", false, "HOME_LON");
        public final static Property HomeAddress = new Property(8, String.class, "homeAddress", false, "HOME_ADDRESS");
        public final static Property CompanyLat = new Property(9, Double.class, "companyLat", false, "COMPANY_LAT");
        public final static Property CompanyLon = new Property(10, Double.class, "companyLon", false, "COMPANY_LON");
        public final static Property CompanyAddress = new Property(11, String.class, "companyAddress", false, "COMPANY_ADDRESS");
    };


    public PersonInfoDao(DaoConfig config) {
        super(config);
    }
    
    public PersonInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PERSONINFO_TABLE\" (" + //
                "\"MOBILE\" TEXT PRIMARY KEY NOT NULL ," + // 0: mobile
                "\"NAME\" TEXT," + // 1: name
                "\"SEX\" TEXT," + // 2: sex
                "\"BIRTHDAY\" TEXT," + // 3: birthday
                "\"ADDRESS\" TEXT," + // 4: address
                "\"HEADER_IMG_URL\" TEXT," + // 5: header_img_url
                "\"HOME_LAT\" REAL," + // 6: homeLat
                "\"HOME_LON\" REAL," + // 7: homeLon
                "\"HOME_ADDRESS\" TEXT," + // 8: homeAddress
                "\"COMPANY_LAT\" REAL," + // 9: companyLat
                "\"COMPANY_LON\" REAL," + // 10: companyLon
                "\"COMPANY_ADDRESS\" TEXT);"); // 11: companyAddress
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PERSONINFO_TABLE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PersonInfo entity) {
        stmt.clearBindings();
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(1, mobile);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(3, sex);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(4, birthday);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String header_img_url = entity.getHeader_img_url();
        if (header_img_url != null) {
            stmt.bindString(6, header_img_url);
        }
 
        Double homeLat = entity.getHomeLat();
        if (homeLat != null) {
            stmt.bindDouble(7, homeLat);
        }
 
        Double homeLon = entity.getHomeLon();
        if (homeLon != null) {
            stmt.bindDouble(8, homeLon);
        }
 
        String homeAddress = entity.getHomeAddress();
        if (homeAddress != null) {
            stmt.bindString(9, homeAddress);
        }
 
        Double companyLat = entity.getCompanyLat();
        if (companyLat != null) {
            stmt.bindDouble(10, companyLat);
        }
 
        Double companyLon = entity.getCompanyLon();
        if (companyLon != null) {
            stmt.bindDouble(11, companyLon);
        }
 
        String companyAddress = entity.getCompanyAddress();
        if (companyAddress != null) {
            stmt.bindString(12, companyAddress);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public PersonInfo readEntity(Cursor cursor, int offset) {
        PersonInfo entity = new PersonInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // mobile
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // sex
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // birthday
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // header_img_url
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // homeLat
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // homeLon
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // homeAddress
            cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9), // companyLat
            cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10), // companyLon
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // companyAddress
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PersonInfo entity, int offset) {
        entity.setMobile(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSex(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBirthday(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAddress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHeader_img_url(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setHomeLat(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setHomeLon(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setHomeAddress(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setCompanyLat(cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9));
        entity.setCompanyLon(cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10));
        entity.setCompanyAddress(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(PersonInfo entity, long rowId) {
        return entity.getMobile();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(PersonInfo entity) {
        if(entity != null) {
            return entity.getMobile();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
