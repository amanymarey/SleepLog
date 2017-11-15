package io.github.jacobkrantz.sleeplog.data;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import io.github.jacobkrantz.sleeplog.data.interfaces.IActivityDAO;
import io.github.jacobkrantz.sleeplog.data.interfaces.IDreamsDAO;
import io.github.jacobkrantz.sleeplog.data.interfaces.ISleepQualityDAO;
import io.github.jacobkrantz.sleeplog.data.interfaces.ISurveyDAO;

/**
 * Created by Jacob on 11/14/2017.
 */

public class Database {
    private static final String TAG = "SleepLogLocalDatabase";
    private static final String DATABASE_NAME = "sleep_log_db";
    private static final int DATABASE_VERSION = 1;
    private DatabaseHelper mDbHelper;
    private final Context mContext;
    private static DatabaseHelper mInstance = null;

    public ActivityDAO mActivityDAO;
    public DreamDAO mDreamDAO;
    public SleepQualityDAO mSleepQualityDAO;
    public SurveyDAO mSurveyDAO;


    public Database(Context context){
        this.mContext = context;
    }

    public Database open() throws SQLException {
        mDbHelper = DatabaseHelper.getInstance(mContext);
        mActivityDAO = new ActivityDAO(mDbHelper.getWritableDatabase());
        mDreamDAO = new DreamDAO(mDbHelper.getWritableDatabase());
        mSleepQualityDAO = new SleepQualityDAO(mDbHelper.getWritableDatabase());
        mSurveyDAO = new SurveyDAO(mDbHelper.getWritableDatabase());
        return this;
    }

    /**
     * Inner class for managing the database.
     */
    private static class DatabaseHelper extends SQLiteOpenHelper {
        /**
         * keeps the DatabaseHelper from instantiating more than once.
         * @param context, Context
         * @return DatabaseHelper
         */
        public static DatabaseHelper getInstance(Context context){
            if(mInstance == null) {
                mInstance = new DatabaseHelper(context);
            }
            return mInstance;
        }

        /**
         * Privatized constructor.
         * @param context, Context
         */
        private DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        /**
         * Creates all desired tabled when the database is first created.
         * @param db, SQLiteDatabase
         */
        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.d(TAG, "onCreate: " + IActivityDAO.ACTIVITY_TABLE);
            db.execSQL(IActivityDAO.ACTIVITY_TABLE_CREATE);
            db.execSQL(IDreamsDAO.DREAMS_TABLE_CREATE);
            db.execSQL(ISleepQualityDAO.SLEEP_QUALITY_TABLE_CREATE);
            db.execSQL(ISurveyDAO.SURVEY_TABLE_CREATE);

        }

        /**
         * Updates the database version. Deletes the data and recreates the
         * schema by calling onCreate().
         * @param db, SQLiteDatabase
         * @param oldVersion, int
         * @param newVersion, int
         */
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version "
                    + oldVersion + " to "
                    + newVersion + " which destroys all old data");

            db.execSQL("DROP TABLE IF EXISTS " + IActivityDAO.ACTIVITY_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + IDreamsDAO.DREAMS_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + ISleepQualityDAO.SLEEP_QUALITY_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + ISurveyDAO.SURVEY_TABLE);
            onCreate(db);
        }
    }
}
