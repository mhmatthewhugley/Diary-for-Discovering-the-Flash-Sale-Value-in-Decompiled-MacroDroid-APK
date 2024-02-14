package androidx.room;

import java.util.List;

/* renamed from: androidx.room.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1116h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ QueryInterceptorDatabase f641a;

    /* renamed from: c */
    public final /* synthetic */ String f642c;

    /* renamed from: d */
    public final /* synthetic */ List f643d;

    public /* synthetic */ C1116h0(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        this.f641a = queryInterceptorDatabase;
        this.f642c = str;
        this.f643d = list;
    }

    public final void run() {
        this.f641a.lambda$execSQL$11(this.f642c, this.f643d);
    }
}
