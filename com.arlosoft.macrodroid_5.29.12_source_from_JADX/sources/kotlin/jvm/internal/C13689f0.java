package kotlin.jvm.internal;

import p433xa.C16875d;
import p433xa.C16878g;
import p433xa.C16879h;
import p433xa.C16880i;
import p433xa.C16883k;
import p433xa.C16885l;

/* renamed from: kotlin.jvm.internal.f0 */
/* compiled from: ReflectionFactory */
public class C13689f0 {
    /* renamed from: a */
    public C16879h mo71932a(C13703l lVar) {
        return lVar;
    }

    /* renamed from: b */
    public C16875d mo71933b(Class cls) {
        return new C13690g(cls);
    }

    /* renamed from: c */
    public C16878g mo71934c(Class cls, String str) {
        return new C13712u(cls, str);
    }

    /* renamed from: d */
    public C16880i mo71935d(C13709r rVar) {
        return rVar;
    }

    /* renamed from: e */
    public C16883k mo71936e(C13713v vVar) {
        return vVar;
    }

    /* renamed from: f */
    public C16885l mo71937f(C13715x xVar) {
        return xVar;
    }

    /* renamed from: g */
    public String mo71938g(C13699k kVar) {
        String obj = kVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: h */
    public String mo71939h(C13708q qVar) {
        return mo71938g(qVar);
    }
}
