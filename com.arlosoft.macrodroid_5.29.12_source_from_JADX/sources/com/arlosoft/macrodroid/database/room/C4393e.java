package com.arlosoft.macrodroid.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

@Dao
/* renamed from: com.arlosoft.macrodroid.database.room.e */
/* compiled from: BlockedUserDao.kt */
public interface C4393e {
    @Query("SELECT * FROM BlockedUser")
    /* renamed from: a */
    Object mo28718a(C13635d<? super List<C4391d>> dVar);

    @Insert(onConflict = 1)
    /* renamed from: b */
    Object mo28719b(C4391d dVar, C13635d<? super Long> dVar2);

    @Query("DELETE FROM BlockedUser WHERE userId == :userId")
    /* renamed from: c */
    Object mo28720c(int i, C13635d<? super C13339u> dVar);
}
