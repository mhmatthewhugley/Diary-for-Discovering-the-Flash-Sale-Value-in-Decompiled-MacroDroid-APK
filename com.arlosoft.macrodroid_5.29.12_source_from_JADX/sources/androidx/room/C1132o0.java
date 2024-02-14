package androidx.room;

import androidx.sqlite.p010db.SupportSQLiteQuery;

/* renamed from: androidx.room.o0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1132o0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ QueryInterceptorDatabase f659a;

    /* renamed from: c */
    public final /* synthetic */ SupportSQLiteQuery f660c;

    /* renamed from: d */
    public final /* synthetic */ QueryInterceptorProgram f661d;

    public /* synthetic */ C1132o0(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        this.f659a = queryInterceptorDatabase;
        this.f660c = supportSQLiteQuery;
        this.f661d = queryInterceptorProgram;
    }

    public final void run() {
        this.f659a.lambda$query$8(this.f660c, this.f661d);
    }
}
