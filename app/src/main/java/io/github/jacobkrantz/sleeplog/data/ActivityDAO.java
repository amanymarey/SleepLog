package io.github.jacobkrantz.sleeplog.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import io.github.jacobkrantz.sleeplog.data.interfaces.IActivityDAO;
import io.github.jacobkrantz.sleeplog.data.models.Activity;

/**
 * Created by Jacob on 11/14/2017.
 */

public class ActivityDAO implements IActivityDAO {
    private static final String TAG = "ActivityDAO";
    private SQLiteDatabase mDb;
    private Cursor cursor;
    private ContentValues contentValues;

    public ActivityDAO(SQLiteDatabase db){
        this.mDb = db;
    }

    @Override
    public void loadActivities() {

    }

    @Override
    public long addActivity(Activity activity) {
        return 0;
    }

    @Override
    public long update(Activity activity) {
        return 0;
    }

    @Override
    public int delete(Activity activity) {
        return 0;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public Activity getActivityById(long id) {
        return null;
    }

    @Override
    public List<Activity> getAllActivities() {
        return null;
    }

    @Override
    public Cursor getAllActivitiesCursor() {
        return null;
    }
}
