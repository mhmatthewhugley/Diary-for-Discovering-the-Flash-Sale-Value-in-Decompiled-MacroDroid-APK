package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1693c0 implements SchemaManager.Migration {

    /* renamed from: a */
    public static final /* synthetic */ C1693c0 f1613a = new C1693c0();

    private /* synthetic */ C1693c0() {
    }

    /* renamed from: a */
    public final void mo19625a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
