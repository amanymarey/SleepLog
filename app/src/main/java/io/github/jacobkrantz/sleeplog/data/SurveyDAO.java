package io.github.jacobkrantz.sleeplog.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.Date;
import java.util.List;

import io.github.jacobkrantz.sleeplog.data.interfaces.ISurveyDAO;
import io.github.jacobkrantz.sleeplog.data.models.Survey;

/**
 * Created by Jacob on 11/14/2017.
 */

public class SurveyDAO implements ISurveyDAO {
    private static final String TAG = "SurveyDAO";
    private SQLiteDatabase mDb;
    private Cursor cursor;
    private ContentValues contentValues;

    public SurveyDAO(SQLiteDatabase db){
        this.mDb = db;
    }

    @Override
    public long addSurvey(Survey survey) {
        return 0;
    }

    @Override
    public long update(Survey survey) {
        return 0;
    }

    @Override
    public int delete(Survey survey) {
        return 0;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public Survey getSleepQualityId(long id) {
        return null;
    }

    @Override
    public List<Survey> getAllSurveys() {
        return null;
    }

    @Override
    public Cursor getAllSurveysCursor() {
        return null;
    }

    @Override
    public List<Survey> getAllSurveysSince(Date date) {
        return null;
    }
}
