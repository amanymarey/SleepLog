package io.github.jacobkrantz.sleeplog.data.interfaces;

import android.database.Cursor;

import java.util.List;

import io.github.jacobkrantz.sleeplog.data.models.Dream;

/**
 * Created by Jacob on 11/14/2017.
 */

public interface IDreamsDAO {
    String DREAMS_TABLE = "dreams";
    String COLUMN_ID = "_id";
    String COLUMN_SUMMARY = "summary";
    String COLUMN_NOTES = "notes";
    String DREAMS_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + DREAMS_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_SUMMARY
            + " TEXT "
            + COLUMN_NOTES
            + " TEXT "
            + ")";
    String[] DREAMS_COLUMNS = new String[]{
            COLUMN_ID,
            COLUMN_SUMMARY,
            COLUMN_NOTES
    };

    long addDream(Dream dream);
    long update(Dream dream);
    int delete(Dream dream);
    int deleteAll();
    Dream getDreamById(long id);
    List<Dream> getAllDreams();
    Cursor getAllDreamsCursor();
}
