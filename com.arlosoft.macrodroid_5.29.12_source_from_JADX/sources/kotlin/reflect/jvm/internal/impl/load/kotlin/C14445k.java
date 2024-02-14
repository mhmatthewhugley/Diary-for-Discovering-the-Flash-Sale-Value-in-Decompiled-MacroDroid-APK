package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13911a1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14810t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14749e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import p349ob.C15834e;
import p362pb.C16151b;
import p362pb.C16157f;
import p398tb.C16609d;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.k */
/* compiled from: JvmPackagePartSource.kt */
public final class C14445k implements C14750f {

    /* renamed from: b */
    private final C16609d f63282b;

    /* renamed from: c */
    private final C16609d f63283c;

    /* renamed from: d */
    private final C14810t<C15834e> f63284d;

    /* renamed from: e */
    private final boolean f63285e;

    /* renamed from: f */
    private final C14749e f63286f;

    /* renamed from: g */
    private final C14459q f63287g;

    /* renamed from: h */
    private final String f63288h;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0032, code lost:
        r2 = r5.getString(r2.intValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14445k(p398tb.C16609d r2, p398tb.C16609d r3, p308kb.C13488l r4, p327mb.C15719c r5, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14810t<p349ob.C15834e> r6, boolean r7, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14749e r8, kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q r9) {
        /*
            r1 = this;
            java.lang.String r0 = "className"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            java.lang.String r0 = "packageProto"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            java.lang.String r0 = "abiStability"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            r1.<init>()
            r1.f63282b = r2
            r1.f63283c = r3
            r1.f63284d = r6
            r1.f63285e = r7
            r1.f63286f = r8
            r1.f63287g = r9
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.l, java.lang.Integer> r2 = p336nb.C15766a.f65123m
            java.lang.String r3 = "packageModuleName"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            java.lang.Object r2 = p327mb.C15722e.m95026a(r4, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x003c
            int r2 = r2.intValue()
            java.lang.String r2 = r5.getString(r2)
            if (r2 != 0) goto L_0x003e
        L_0x003c:
            java.lang.String r2 = "main"
        L_0x003e:
            r1.f63288h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C14445k.<init>(tb.d, tb.d, kb.l, mb.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.t, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e, kotlin.reflect.jvm.internal.impl.load.kotlin.q):void");
    }

    /* renamed from: a */
    public String mo73170a() {
        return "Class '" + mo73171d().mo78544b().mo78556b() + '\'';
    }

    /* renamed from: b */
    public C13911a1 mo67419b() {
        C13911a1 a1Var = C13911a1.f62310a;
        C13706o.m87928e(a1Var, "NO_SOURCE_FILE");
        return a1Var;
    }

    /* renamed from: d */
    public final C16151b mo73171d() {
        return new C16151b(mo73172e().mo79459g(), mo73175h());
    }

    /* renamed from: e */
    public C16609d mo73172e() {
        return this.f63282b;
    }

    /* renamed from: f */
    public C16609d mo73173f() {
        return this.f63283c;
    }

    /* renamed from: g */
    public final C14459q mo73174g() {
        return this.f63287g;
    }

    /* renamed from: h */
    public final C16157f mo73175h() {
        String f = mo73172e().mo79458f();
        C13706o.m87928e(f, "className.internalName");
        C16157f i = C16157f.m97019i(C15177w.m93658K0(f, '/', (String) null, 2, (Object) null));
        C13706o.m87928e(i, "identifier(className.int….substringAfterLast('/'))");
        return i;
    }

    public String toString() {
        return C14445k.class.getSimpleName() + ": " + mo73172e();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14445k(kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q r11, p308kb.C13488l r12, p327mb.C15719c r13, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14810t<p349ob.C15834e> r14, boolean r15, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14749e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            pb.b r0 = r11.mo67429d()
            tb.d r2 = p398tb.C16609d.m98927b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.C13706o.m87928e(r2, r0)
            jb.a r0 = r11.mo67427b()
            java.lang.String r0 = r0.mo70764e()
            r1 = 0
            if (r0 == 0) goto L_0x0040
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0040
            tb.d r1 = p398tb.C16609d.m98929d(r0)
        L_0x0040:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C14445k.<init>(kotlin.reflect.jvm.internal.impl.load.kotlin.q, kb.l, mb.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.t, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e):void");
    }
}
