package kotlin.reflect.jvm.internal.impl.protobuf;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.k */
/* compiled from: LazyFieldLite */
public class C14510k {

    /* renamed from: a */
    private C14485d f63384a;

    /* renamed from: b */
    private C14490f f63385b;

    /* renamed from: c */
    private volatile boolean f63386c;

    /* renamed from: d */
    protected volatile C14516o f63387d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(1:12)(1:13)|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73418a(kotlin.reflect.jvm.internal.impl.protobuf.C14516o r3) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.o r0 = r2.f63387d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.o r0 = r2.f63387d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x000c:
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.f63384a     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            kotlin.reflect.jvm.internal.impl.protobuf.q r3 = r3.mo71017f()     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.f63384a     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = r2.f63385b     // Catch:{ IOException -> 0x0023 }
            java.lang.Object r3 = r3.mo73286b(r0, r1)     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r3 = (kotlin.reflect.jvm.internal.impl.protobuf.C14516o) r3     // Catch:{ IOException -> 0x0023 }
            r2.f63387d = r3     // Catch:{ IOException -> 0x0023 }
            goto L_0x0023
        L_0x0021:
            r2.f63387d = r3     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14510k.mo73418a(kotlin.reflect.jvm.internal.impl.protobuf.o):void");
    }

    /* renamed from: b */
    public int mo73419b() {
        if (this.f63386c) {
            return this.f63387d.mo71015c();
        }
        return this.f63384a.size();
    }

    /* renamed from: c */
    public C14516o mo73420c(C14516o oVar) {
        mo73418a(oVar);
        return this.f63387d;
    }

    /* renamed from: d */
    public C14516o mo73421d(C14516o oVar) {
        C14516o oVar2 = this.f63387d;
        this.f63387d = oVar;
        this.f63384a = null;
        this.f63386c = true;
        return oVar2;
    }
}
