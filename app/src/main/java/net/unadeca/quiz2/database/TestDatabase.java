package net.unadeca.quiz2.database;

import com.raizlabs.android.dbflow.annotation.Database;


// versión de base de datos = 1

@Database(name = TestDatabase.dbname,version = TestDatabase.dbversion)
public class TestDatabase {
    public static final String dbname = "TestDatabase";
    public static final int dbversion = 1;

}
