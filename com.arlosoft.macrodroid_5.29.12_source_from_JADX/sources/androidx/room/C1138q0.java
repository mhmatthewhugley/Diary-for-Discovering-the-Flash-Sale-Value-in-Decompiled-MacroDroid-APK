package androidx.room;

/* renamed from: androidx.room.q0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1138q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ QueryInterceptorDatabase f668a;

    /* renamed from: c */
    public final /* synthetic */ String f669c;

    public /* synthetic */ C1138q0(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        this.f668a = queryInterceptorDatabase;
        this.f669c = str;
    }

    public final void run() {
        this.f668a.lambda$execSQL$10(this.f669c);
    }
}
