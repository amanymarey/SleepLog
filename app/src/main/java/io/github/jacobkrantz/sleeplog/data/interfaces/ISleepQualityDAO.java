package io.github.jacobkrantz.sleeplog.data.interfaces;

import android.database.Cursor;

import java.util.List;

import io.github.jacobkrantz.sleeplog.data.models.SleepQuality;

/**
 * Created by Jacob on 11/14/2017.
 */

public interface ISleepQualityDAO {
    String SLEEP_QUALITY_TABLE = "sleep_quality";
    String COLUMN_ID = "_id";
    String COLUMN_NAME = "name";
    String SLEEP_QUALITY_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + SLEEP_QUALITY_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME
            + " TEXT "
            + ")";
    String[] SLEEP_QUALITY_COLUMNS = new String[]{
            COLUMN_ID,
            COLUMN_NAME
    };

    void loadSleepQualities();
    long addSleepQuality(SleepQuality sleepQuality);
    long update(SleepQuality sleepQuality);
    int delete(SleepQuality sleepQuality);
    int deleteAll();
    SleepQuality getSleepQualityId(long id);
    List<SleepQuality> getAllSleepQualities();
    Cursor getAllSleepQualitiesCursor();
}
