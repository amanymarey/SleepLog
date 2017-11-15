package io.github.jacobkrantz.sleeplog.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import io.github.jacobkrantz.sleeplog.data.interfaces.IDreamsDAO;
import io.github.jacobkrantz.sleeplog.data.models.Dream;

/**
 * Created by Jacob on 11/14/2017.
 */

public class DreamDAO implements IDreamsDAO {
    private static final String TAG = "DreamDAO";
    private SQLiteDatabase mDb;
    private Cursor cursor;
    private ContentValues contentValues;

    public DreamDAO(SQLiteDatabase db){
        this.mDb = db;
    }

    @Override
    public long addDream(Dream dream) {
        return 0;
    }

    @Override
    public long update(Dream dream) {
        return 0;
    }

    @Override
    public int delete(Dream dream) {
        return 0;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public Dream getDreamById(long id) {
        return null;
    }

    @Override
    public List<Dream> getAllDreams() {
        return null;
    }

    @Override
    public Cursor getAllDreamsCursor() {
        return null;
    }
}
