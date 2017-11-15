package io.github.jacobkrantz.sleeplog.data.interfaces;

import android.database.Cursor;

import java.util.Date;
import java.util.List;

import io.github.jacobkrantz.sleeplog.data.models.Survey;

/**
 * Created by Jacob on 11/14/2017.
 */

public interface ISurveyDAO {
    String SURVEY_TABLE = "sleep_quality";
    String COLUMN_ID = "_id";
    String COLUMN_NIGHT_OF = "night_of";
    String COLUMN_FALL_ASLEEP_TIME = "fall_asleep_time";
    String COLUMN_SLEEP_QUALITY_ID = "sleep_quality_id";
    String COLUMN_ACTIVITY_ID = "activity_id";
    String COLUMN_DREAM_ID = "dream_id";
    String SURVEY_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + SURVEY_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NIGHT_OF
            + " TEXT, "
            + COLUMN_FALL_ASLEEP_TIME
            + " TEXT, "
            + COLUMN_SLEEP_QUALITY_ID
            + " INTEGER, "
            + COLUMN_ACTIVITY_ID
            + " INTEGER, "
            + COLUMN_DREAM_ID
            + " INTEGER "
            + ")";
    String[] SURVEY_COLUMNS = new String[]{
            COLUMN_ID,
            COLUMN_NIGHT_OF,
            COLUMN_FALL_ASLEEP_TIME,
            COLUMN_SLEEP_QUALITY_ID,
            COLUMN_ACTIVITY_ID,
            COLUMN_DREAM_ID,
    };

    long addSurvey(Survey survey);
    long update(Survey survey);
    int delete(Survey survey);
    int deleteAll();
    Survey getSleepQualityId(long id);
    List<Survey> getAllSurveys();
    Cursor getAllSurveysCursor();
    List<Survey> getAllSurveysSince(Date date);
}
