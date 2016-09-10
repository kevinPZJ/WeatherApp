package kevin.example.com.weather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kevin on 2016/9/10.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    private static final String CREATE_PROVINCE="create table Province(" + "id  integer primary key autoincrement,"
            +"province_name text,"+"province_code text)";
    private static final String CREATE_CIYT="create table CITY(" + "id  integer primary key autoincrement,"
            +"city_name text,"+"city_code text)";
    private static final String CREATE_COUNTY="create table COUNTY(" + "id  integer primary key autoincrement,"
            +"county_name text,"+"county_code text)";







    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CIYT);
        db.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
