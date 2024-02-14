package com.arlosoft.macrodroid.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

@Dao
/* renamed from: com.arlosoft.macrodroid.database.room.q */
/* compiled from: SubscriptionUpdateItemDao.kt */
public interface C4421q {
    @Query("DELETE FROM SubscriptionUpdateItem WHERE id == :id")
    /* renamed from: a */
    Object mo28766a(long j, C13635d<? super C13339u> dVar);

    @Insert(onConflict = 1)
    /* renamed from: b */
    Object mo28767b(C4419p pVar, C13635d<? super Long> dVar);

    @Query("SELECT * FROM SubscriptionUpdateItem ORDER BY timestamp DESC")
    /* renamed from: c */
    Object mo28768c(C13635d<? super List<C4419p>> dVar);
}
