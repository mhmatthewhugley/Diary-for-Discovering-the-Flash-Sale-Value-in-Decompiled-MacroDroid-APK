package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13706o;
import p433xa.C16875d;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.e */
/* compiled from: AttributeArrayOwner.kt */
public abstract class C15003e<K, T> extends C14996a<K, T> {

    /* renamed from: a */
    private C14999c<T> f64129a;

    protected C15003e(C14999c<T> cVar) {
        C13706o.m87929f(cVar, "arrayMap");
        this.f64129a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C14999c<T> mo74254c() {
        return this.f64129a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo74264f(C16875d<? extends K> dVar, T t) {
        C13706o.m87929f(dVar, "tClass");
        C13706o.m87929f(t, "value");
        int d = mo74043d().mo74294d(dVar);
        int c = this.f64129a.mo74260c();
        if (c != 0) {
            if (c == 1) {
                C14999c<T> cVar = this.f64129a;
                C13706o.m87927d(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                C15024o oVar = (C15024o) cVar;
                if (oVar.mo74282f() == d) {
                    this.f64129a = new C15024o(t, d);
                    return;
                }
                C15000d dVar2 = new C15000d();
                this.f64129a = dVar2;
                dVar2.mo74261d(oVar.mo74282f(), oVar.mo74283h());
            }
            this.f64129a.mo74261d(d, t);
            return;
        }
        this.f64129a = new C15024o(t, d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15003e() {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.util.i r0 = kotlin.reflect.jvm.internal.impl.util.C15014i.f64142a
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.C15003e.<init>():void");
    }
}
