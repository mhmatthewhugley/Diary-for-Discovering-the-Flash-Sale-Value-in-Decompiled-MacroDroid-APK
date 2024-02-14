package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.C13685e;
import kotlin.jvm.internal.C13689f0;
import kotlin.jvm.internal.C13699k;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13709r;
import kotlin.jvm.internal.C13713v;
import kotlin.jvm.internal.C13715x;
import p433xa.C16875d;
import p433xa.C16878g;
import p433xa.C16879h;
import p433xa.C16880i;
import p433xa.C16883k;
import p433xa.C16885l;
import p441ya.C16979c;

/* renamed from: kotlin.reflect.jvm.internal.d0 */
/* compiled from: ReflectionFactoryImpl */
public class C13782d0 extends C13689f0 {
    /* renamed from: i */
    private static C13832i m88049i(C13685e eVar) {
        C16878g owner = eVar.getOwner();
        return owner instanceof C13832i ? (C13832i) owner : C13720b.f61937f;
    }

    /* renamed from: a */
    public C16879h mo71932a(C13703l lVar) {
        return new C15047j(m88049i(lVar), lVar.getName(), lVar.getSignature(), lVar.getBoundReceiver());
    }

    /* renamed from: b */
    public C16875d mo71933b(Class cls) {
        return C13803g.m88110a(cls);
    }

    /* renamed from: c */
    public C16878g mo71934c(Class cls, String str) {
        return new C15061o(cls, str);
    }

    /* renamed from: d */
    public C16880i mo71935d(C13709r rVar) {
        return new C15055l(m88049i(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    /* renamed from: e */
    public C16883k mo71936e(C13713v vVar) {
        return new C15073q(m88049i(vVar), vVar.getName(), vVar.getSignature(), vVar.getBoundReceiver());
    }

    /* renamed from: f */
    public C16885l mo71937f(C13715x xVar) {
        return new C15077r(m88049i(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    /* renamed from: g */
    public String mo71938g(C13699k kVar) {
        C15047j b;
        C16879h a = C16979c.m100218a(kVar);
        if (a == null || (b = C13841i0.m88197b(a)) == null) {
            return super.mo71938g(kVar);
        }
        return C13788e0.f62008a.mo72027e(b.mo72037v());
    }

    /* renamed from: h */
    public String mo71939h(C13708q qVar) {
        return mo71938g(qVar);
    }
}
