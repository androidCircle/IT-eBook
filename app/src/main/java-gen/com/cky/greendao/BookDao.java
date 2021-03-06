package com.cky.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cky.greendao.Book;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK".
*/
public class BookDao extends AbstractDao<Book, Long> {

    public static final String TABLENAME = "BOOK";

    /**
     * Properties of entity Book.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Book_name = new Property(1, String.class, "book_name", false, "BOOK_NAME");
        public final static Property Book_isbn = new Property(2, String.class, "book_isbn", false, "BOOK_ISBN");
        public final static Property Book_id = new Property(3, String.class, "book_id", false, "BOOK_ID");
        public final static Property Request_id = new Property(4, String.class, "request_id", false, "REQUEST_ID");
        public final static Property Download_status = new Property(5, String.class, "download_status", false, "DOWNLOAD_STATUS");
    };


    public BookDao(DaoConfig config) {
        super(config);
    }
    
    public BookDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"BOOK_NAME\" TEXT," + // 1: book_name
                "\"BOOK_ISBN\" TEXT," + // 2: book_isbn
                "\"BOOK_ID\" TEXT," + // 3: book_id
                "\"REQUEST_ID\" TEXT," + // 4: request_id
                "\"DOWNLOAD_STATUS\" TEXT);"); // 5: download_status
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Book entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String book_name = entity.getBook_name();
        if (book_name != null) {
            stmt.bindString(2, book_name);
        }
 
        String book_isbn = entity.getBook_isbn();
        if (book_isbn != null) {
            stmt.bindString(3, book_isbn);
        }
 
        String book_id = entity.getBook_id();
        if (book_id != null) {
            stmt.bindString(4, book_id);
        }
 
        String request_id = entity.getRequest_id();
        if (request_id != null) {
            stmt.bindString(5, request_id);
        }
 
        String download_status = entity.getDownload_status();
        if (download_status != null) {
            stmt.bindString(6, download_status);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Book readEntity(Cursor cursor, int offset) {
        Book entity = new Book( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // book_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // book_isbn
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // book_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // request_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // download_status
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Book entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBook_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBook_isbn(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBook_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRequest_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDownload_status(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Book entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Book entity) {
        if(entity != null) {
            return entity.getId();
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
