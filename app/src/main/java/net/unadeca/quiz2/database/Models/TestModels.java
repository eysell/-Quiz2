package net.unadeca.quiz2.database.Models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import net.unadeca.quiz2.database.TestDatabase;

@Table(database = TestDatabase.class)
public class TestModels extends BaseModel {

    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column()
    public String name;

    @Column
    public String last_name;

}
