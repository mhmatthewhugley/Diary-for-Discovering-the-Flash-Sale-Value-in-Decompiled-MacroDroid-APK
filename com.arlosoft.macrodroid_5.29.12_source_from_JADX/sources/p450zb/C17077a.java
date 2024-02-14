package p450zb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13995h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: zb.a */
/* compiled from: ErrorClassDescriptor.kt */
public final class C17077a extends C13995h {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17077a(p362pb.C16157f r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "name"
            r2 = r21
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            zb.k r10 = p450zb.C17088k.f68644a
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r1 = r10.mo80366i()
            kotlin.reflect.jvm.internal.impl.descriptors.d0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.descriptors.C13951f.CLASS
            java.util.List r5 = kotlin.collections.C13614t.m87748j()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r11 = kotlin.reflect.jvm.internal.impl.descriptors.C14158z0.f62778a
            yb.n r8 = p442yb.C16986f.f68366e
            r7 = 0
            r0 = r20
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g.f62330v
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.mo72251b()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.C13991f.m88832n1(r9, r0, r1, r11)
            java.util.List r2 = kotlin.collections.C13614t.m87748j()
            kotlin.reflect.jvm.internal.impl.descriptors.u r3 = kotlin.reflect.jvm.internal.impl.descriptors.C14127t.f62753d
            r0.mo72394q1(r2, r3)
            java.lang.String r2 = "create(this, Annotations…          )\n            }"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            zb.g r2 = p450zb.C17084g.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            pb.f r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "errorConstructor.name.toString()"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            zb.f r1 = p450zb.C17088k.m100539b(r2, r3)
            zb.h r2 = new zb.h
            zb.j r14 = p450zb.C17087j.ERROR_CLASS
            java.lang.String[] r3 = new java.lang.String[r5]
            zb.i r12 = r10.mo80362e(r14, r3)
            java.lang.String[] r3 = new java.lang.String[r5]
            r15 = 0
            r16 = 0
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.mo72467g1(r2)
            java.util.Set r2 = kotlin.collections.C13625y0.m87800c(r0)
            r9.mo72402K0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p450zb.C17077a.<init>(pb.f):void");
    }

    /* renamed from: G0 */
    public C13948e mo72267c(C14945l1 l1Var) {
        C13706o.m87929f(l1Var, "substitutor");
        return this;
    }

    /* renamed from: h0 */
    public C14692h mo72309h0(C14936j1 j1Var, C14849g gVar) {
        C13706o.m87929f(j1Var, "typeSubstitution");
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C17084g gVar2 = C17084g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        C13706o.m87928e(fVar, "name.toString()");
        return C17088k.m100539b(gVar2, fVar, j1Var.toString());
    }

    public String toString() {
        String d = getName().mo78583d();
        C13706o.m87928e(d, "name.asString()");
        return d;
    }
}
