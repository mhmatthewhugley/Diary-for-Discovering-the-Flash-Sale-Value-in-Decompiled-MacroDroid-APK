package com.arlosoft.macrodroid.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

@Dao
/* renamed from: com.arlosoft.macrodroid.database.room.w */
/* compiled from: UserSubscriptionDao.kt */
public interface C4445w {
    @Insert(onConflict = 1)
    /* renamed from: a */
    Object mo28800a(C4443v vVar, C13635d<? super Long> dVar);

    @Query("SELECT * FROM UserSubscription WHERE userId == :userId")
    /* renamed from: b */
    Object mo28801b(int i, C13635d<? super C4443v> dVar);

    @Query("SELECT * FROM UserSubscription")
    /* renamed from: c */
    Object mo28802c(C13635d<? super List<C4443v>> dVar);

    @Query("DELETE FROM UserSubscription WHERE userId == :userId")
    /* renamed from: d */
    Object mo28803d(int i, C13635d<? super C13339u> dVar);
}
