package io.github.jacobkrantz.sleeplog.data.interfaces;

import android.database.Cursor;

import java.util.List;

import io.github.jacobkrantz.sleeplog.data.models.Activity;

/**
 * Created by Jacob on 11/14/2017.
 */

public interface IActivityDAO {
    String ACTIVITY_TABLE = "activities";
    String COLUMN_ID = "_id";
    String COLUMN_NAME = "name";
    String ACTIVITY_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + ACTIVITY_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME
            + " TEXT NOT NULL"
            + ")";
    String[] ACTIVITY_COLUMNS = new String[]{
            COLUMN_ID,
            COLUMN_NAME
    };

    void loadActivities();
    long addActivity(Activity activity);
    long update(Activity activity);
    int delete(Activity activity);
    int deleteAll();
    Activity getActivityById(long id);
    List<Activity> getAllActivities();
    Cursor getAllActivitiesCursor();
}
