package com.music.vandanp.classicaltutor.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.music.vandanp.classicaltutor.model.Note;

/**
 * Created by vandanp on 5/4/16.
 */
public class DatabaseHanderUtils extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "notesManager";

    // Note table name
    private static final String TABLE_NOTE = "notes";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_START_FREQ = "start_frequency";
    private static final String KEY_END_FREQ = "end_frequency";

    public DatabaseHanderUtils(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_NOTES_TABLE = "CREATE TABLE " + TABLE_NOTE + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_NAME + " TEXT,"
                + KEY_START_FREQ + " REAL,"
                + KEY_END_FREQ + " REAL"
                + ")";
        db.execSQL(CREATE_NOTES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTE);

        // Create tables again
        onCreate(db);
    }

    // Adding new Note
    public void addNote(Note note) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, note.getName());
        values.put(KEY_START_FREQ, note.getStartFrequency());
        values.put(KEY_END_FREQ, note.getEndFrequency());

        // Inserting Row
        db.insert(TABLE_NOTE, null, values);
        db.close(); // Closing database connection
    }
}
