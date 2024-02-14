package com.arlosoft.macrodroid.database.room;

import androidx.paging.PagingSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Transaction;
import androidx.sqlite.p010db.SupportSQLiteQuery;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import p297ja.C13339u;

@Dao
/* renamed from: com.arlosoft.macrodroid.database.room.s */
/* compiled from: SystemLogEntryDao.kt */
public interface C4429s {

    /* renamed from: com.arlosoft.macrodroid.database.room.s$a */
    /* compiled from: SystemLogEntryDao.kt */
    public static final class C4430a {

        /* renamed from: com.arlosoft.macrodroid.database.room.s$a$a */
        /* compiled from: SystemLogEntryDao.kt */
        static final class C4431a extends C13656d {
            int I$0;
            Object L$0;
            int label;
            /* synthetic */ Object result;

            C4431a(C13635d<? super C4431a> dVar) {
                super(dVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C4430a.m17501a((C4429s) null, (SystemLogEntry) null, 0, this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @androidx.room.Transaction
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object m17501a(com.arlosoft.macrodroid.database.room.C4429s r6, com.arlosoft.macrodroid.database.room.SystemLogEntry r7, int r8, kotlin.coroutines.C13635d<? super p297ja.C13339u> r9) {
            /*
                boolean r0 = r9 instanceof com.arlosoft.macrodroid.database.room.C4429s.C4430a.C4431a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                com.arlosoft.macrodroid.database.room.s$a$a r0 = (com.arlosoft.macrodroid.database.room.C4429s.C4430a.C4431a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.arlosoft.macrodroid.database.room.s$a$a r0 = new com.arlosoft.macrodroid.database.room.s$a$a
                r0.<init>(r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                p297ja.C13332o.m85685b(r9)
                goto L_0x0062
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                int r8 = r0.I$0
                java.lang.Object r6 = r0.L$0
                com.arlosoft.macrodroid.database.room.s r6 = (com.arlosoft.macrodroid.database.room.C4429s) r6
                p297ja.C13332o.m85685b(r9)
                goto L_0x004e
            L_0x003e:
                p297ja.C13332o.m85685b(r9)
                r0.L$0 = r6
                r0.I$0 = r8
                r0.label = r4
                java.lang.Object r9 = r6.mo28780e(r7, r0)
                if (r9 != r1) goto L_0x004e
                return r1
            L_0x004e:
                java.lang.Number r9 = (java.lang.Number) r9
                long r4 = r9.longValue()
                long r7 = (long) r8
                long r4 = r4 - r7
                r7 = 0
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r6 = r6.mo28781f(r4, r0)
                if (r6 != r1) goto L_0x0062
                return r1
            L_0x0062:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.database.room.C4429s.C4430a.m17501a(com.arlosoft.macrodroid.database.room.s, com.arlosoft.macrodroid.database.room.SystemLogEntry, int, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Query("DELETE FROM SystemLogEntry")
    /* renamed from: a */
    Object mo28776a(C13635d<? super C13339u> dVar);

    @Query("SELECT * FROM SystemLogEntry WHERE logLevel >= :logLevel")
    /* renamed from: b */
    Object mo28777b(C4403i iVar, C13635d<? super List<SystemLogEntry>> dVar);

    @Query("SELECT * FROM SystemLogEntry WHERE logLevel >= :logLevel ORDER BY id DESC LIMIT :count")
    /* renamed from: c */
    Object mo28778c(int i, int i2, C13635d<? super List<SystemLogEntry>> dVar);

    @Transaction
    /* renamed from: d */
    Object mo28779d(SystemLogEntry systemLogEntry, int i, C13635d<? super C13339u> dVar);

    @Insert(onConflict = 1)
    /* renamed from: e */
    Object mo28780e(SystemLogEntry systemLogEntry, C13635d<? super Long> dVar);

    @Query("DELETE FROM SystemLogEntry WHERE id < :id")
    /* renamed from: f */
    Object mo28781f(long j, C13635d<? super C13339u> dVar);

    @RawQuery(observedEntities = {SystemLogEntry.class})
    /* renamed from: g */
    PagingSource<Integer, SystemLogEntry> mo28782g(SupportSQLiteQuery supportSQLiteQuery);
}
