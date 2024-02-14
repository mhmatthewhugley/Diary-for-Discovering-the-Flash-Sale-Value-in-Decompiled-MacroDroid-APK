package com.arlosoft.macrodroid.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.coroutines.C13635d;

@Dao
/* renamed from: com.arlosoft.macrodroid.database.room.b */
/* compiled from: BlockedMacroDao.kt */
public interface C4384b {
    @Query("SELECT * FROM BlockedMacro")
    /* renamed from: a */
    Object mo28706a(C13635d<? super List<C4382a>> dVar);

    @Insert(onConflict = 1)
    /* renamed from: b */
    Object mo28707b(C4382a aVar, C13635d<? super Long> dVar);
}
