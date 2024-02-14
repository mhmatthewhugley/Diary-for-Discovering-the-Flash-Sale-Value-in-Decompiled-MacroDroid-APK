package androidx.room;

/* renamed from: androidx.room.r0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1139r0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ QueryInterceptorDatabase f670a;

    /* renamed from: c */
    public final /* synthetic */ String f671c;

    public /* synthetic */ C1139r0(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        this.f670a = queryInterceptorDatabase;
        this.f671c = str;
    }

    public final void run() {
        this.f670a.lambda$query$6(this.f671c);
    }
}
