package io.github.jacobkrantz.sleeplog.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import io.github.jacobkrantz.sleeplog.data.interfaces.ISleepQualityDAO;
import io.github.jacobkrantz.sleeplog.data.models.SleepQuality;

/**
 * Created by Jacob on 11/14/2017.
 */

public class SleepQualityDAO implements ISleepQualityDAO {
    private static final String TAG = "SleepQualityDAO";
    private SQLiteDatabase mDb;
    private Cursor cursor;
    private ContentValues contentValues;

    public SleepQualityDAO(SQLiteDatabase db){
        this.mDb = db;
    }

    @Override
    public void loadSleepQualities() {

    }

    @Override
    public long addSleepQuality(SleepQuality sleepQuality) {
        return 0;
    }

    @Override
    public long update(SleepQuality sleepQuality) {
        return 0;
    }

    @Override
    public int delete(SleepQuality sleepQuality) {
        return 0;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public SleepQuality getSleepQualityId(long id) {
        return null;
    }

    @Override
    public List<SleepQuality> getAllSleepQualities() {
        return null;
    }

    @Override
    public Cursor getAllSleepQualitiesCursor() {
        return null;
    }
}
