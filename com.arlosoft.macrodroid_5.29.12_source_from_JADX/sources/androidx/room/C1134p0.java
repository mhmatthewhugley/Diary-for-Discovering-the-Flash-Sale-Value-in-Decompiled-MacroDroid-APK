package androidx.room;

import androidx.sqlite.p010db.SupportSQLiteQuery;

/* renamed from: androidx.room.p0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1134p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ QueryInterceptorDatabase f663a;

    /* renamed from: c */
    public final /* synthetic */ SupportSQLiteQuery f664c;

    /* renamed from: d */
    public final /* synthetic */ QueryInterceptorProgram f665d;

    public /* synthetic */ C1134p0(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        this.f663a = queryInterceptorDatabase;
        this.f664c = supportSQLiteQuery;
        this.f665d = queryInterceptorProgram;
    }

    public final void run() {
        this.f663a.lambda$query$9(this.f664c, this.f665d);
    }
}
