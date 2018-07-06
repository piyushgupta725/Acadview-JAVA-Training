package com.example.piyush.database;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class DBHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "contacts.db";
    static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "contacts";
    static final String KEY_ID = "id";
    static final String NAME = "name";
    static final String EMAIL = "email";
    static final String PHONE = "phoneno";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        SQLiteDatabase db = this.getWritableDatabase();
        String QUERY="CREATE TABLE "+TABLE_NAME+"("+KEY_ID+"INTEGER PRIMARY KEY AUTOINCREMENT , "+NAME+"TEXT,"+EMAIL+"TEXT,"+PHONE+"TEXT"+")";
        db.execSQL(QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS"+" "+TABLE_NAME);
        onCreate(db);
    }
    public  void addContact(contacts contact){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME,contact.getname());
        cv.put(PHONE,contact.getPhoneno());
        cv.put(EMAIL,contact.getemail());
        db.insert(TABLE_NAME, "null",cv);
        db.close();

    }
    public void deleteContact(contacts contact)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(TABLE_NAME,KEY_ID+"=?",new String[]{String.valueOf(contact.getid())});
    }
    public int getCount(){
        SQLiteDatabase db=this.getReadableDatabase();
        String count="Select * from "+TABLE_NAME;
        Cursor cursor=db.rawQuery(count,null);
        }
        public contacts getContact(int id) {
            contacts contact = null;
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query(TABLE_NAME, new String[]{KEY_ID, NAME, EMAIL, PHONE}, KEY_ID + "=?", new String[]{String.valueOf(id)}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                contact = new contacts(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3));
            }
            return contact;
        }
         int updateContact(contacts contact){
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues cv= new ContentValues();
            cv.put(NAME, contact.getname());
            cv.put(PHONE, contact.getPhoneno());
            cv.put(EMAIL, contact.getemail());
            return db.update(TABLE_NAME,cv,KEY_ID+"=?",new String[]{String.valueOf(contact.getid())});
            }

            }

