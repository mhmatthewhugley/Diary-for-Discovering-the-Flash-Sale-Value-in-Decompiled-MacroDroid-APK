package com.arlosoft.macrodroid.database.room;

import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(autoMigrations = {@AutoMigration(from = 1, mo14333to = 2), @AutoMigration(from = 2, mo14333to = 3)}, entities = {SystemLogEntry.class, C4443v.class, C4407l.class, C4419p.class, C4391d.class, C4382a.class}, exportSchema = true, version = 3)
@TypeConverters({C4401g.class})
/* compiled from: MacroDroidRoomDatabase.kt */
public abstract class MacroDroidRoomDatabase extends RoomDatabase {
    /* renamed from: c */
    public abstract C4384b mo28677c();

    /* renamed from: d */
    public abstract C4393e mo28678d();

    /* renamed from: e */
    public abstract C4409m mo28679e();

    /* renamed from: f */
    public abstract C4421q mo28680f();

    /* renamed from: g */
    public abstract C4429s mo28681g();

    /* renamed from: h */
    public abstract C4445w mo28682h();
}
