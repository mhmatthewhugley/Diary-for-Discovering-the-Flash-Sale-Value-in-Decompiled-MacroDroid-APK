package androidx.room;

import java.util.List;

/* renamed from: androidx.room.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1118i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ QueryInterceptorDatabase f645a;

    /* renamed from: c */
    public final /* synthetic */ String f646c;

    /* renamed from: d */
    public final /* synthetic */ List f647d;

    public /* synthetic */ C1118i0(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        this.f645a = queryInterceptorDatabase;
        this.f646c = str;
        this.f647d = list;
    }

    public final void run() {
        this.f645a.lambda$query$7(this.f646c, this.f647d);
    }
}
