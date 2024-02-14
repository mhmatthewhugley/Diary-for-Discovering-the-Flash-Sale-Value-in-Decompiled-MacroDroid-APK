package com.arlosoft.macrodroid.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

@Dao
/* renamed from: com.arlosoft.macrodroid.database.room.m */
/* compiled from: MacroSubscriptionDao.kt */
public interface C4409m {
    @Insert(onConflict = 1)
    /* renamed from: a */
    Object mo28741a(C4407l lVar, C13635d<? super Long> dVar);

    @Query("SELECT * FROM MacroSubscription WHERE macroId == :macroId")
    /* renamed from: b */
    Object mo28742b(int i, C13635d<? super C4407l> dVar);

    @Query("DELETE FROM MacroSubscription WHERE macroId == :macroId")
    /* renamed from: c */
    Object mo28743c(int i, C13635d<? super C13339u> dVar);

    @Query("SELECT * FROM MacroSubscription")
    /* renamed from: d */
    Object mo28744d(C13635d<? super List<C4407l>> dVar);
}
