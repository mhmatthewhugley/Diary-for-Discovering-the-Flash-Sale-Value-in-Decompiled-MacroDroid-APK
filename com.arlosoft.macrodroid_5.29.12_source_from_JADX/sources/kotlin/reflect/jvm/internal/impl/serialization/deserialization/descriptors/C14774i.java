package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import p217bb.C11119b;
import p252eb.C12186a;
import p263fb.C12253b;
import p263fb.C12256d;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i */
/* compiled from: DeserializedPackageMemberScope.kt */
public class C14774i extends C14752h {

    /* renamed from: g */
    private final C14050k0 f63848g;

    /* renamed from: h */
    private final String f63849h;

    /* renamed from: i */
    private final C16152c f63850i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14774i(kotlin.reflect.jvm.internal.impl.descriptors.C14050k0 r17, p308kb.C13488l r18, p327mb.C15719c r19, p327mb.C15712a r20, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f r21, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k r22, java.lang.String r23, p370qa.C16254a<? extends java.util.Collection<p362pb.C16157f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.C13706o.m87929f(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.C13706o.m87929f(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.C13706o.m87929f(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            mb.g r10 = new mb.g
            kb.t r0 = r18.mo71310Z()
            java.lang.String r7 = "proto.typeTable"
            kotlin.jvm.internal.C13706o.m87928e(r0, r7)
            r10.<init>(r0)
            mb.h$a r0 = p327mb.C15725h.f65073b
            kb.w r7 = r18.mo71311a0()
            java.lang.String r8 = "proto.versionRequirementTable"
            kotlin.jvm.internal.C13706o.m87928e(r7, r8)
            mb.h r11 = r0.mo75167a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r7.mo73959a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.mo71303R()
            java.lang.String r0 = "proto.functionList"
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)
            java.util.List r4 = r18.mo71306V()
            java.lang.String r0 = "proto.propertyList"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
            java.util.List r7 = r18.mo71309Y()
            java.lang.String r0 = "proto.typeAliasList"
            kotlin.jvm.internal.C13706o.m87928e(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f63848g = r14
            r6.f63849h = r15
            pb.c r0 = r17.mo72551e()
            r6.f63850i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14774i.<init>(kotlin.reflect.jvm.internal.impl.descriptors.k0, kb.l, mb.c, mb.a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f, kotlin.reflect.jvm.internal.impl.serialization.deserialization.k, java.lang.String, qa.a):void");
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        mo73928z(fVar, bVar);
        return super.mo72800e(fVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo73871i(Collection<C14064m> collection, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(lVar, "nameFilter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C16151b mo73874m(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return new C16151b(this.f63850i, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Set<C16157f> mo73875s() {
        return C13627z0.m87806d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Set<C16157f> mo73876t() {
        return C13627z0.m87806d();
    }

    public String toString() {
        return this.f63849h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Set<C16157f> mo73877u() {
        return C13627z0.m87806d();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo73900w(p362pb.C16157f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            boolean r0 = super.mo73900w(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0045
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r5.mo73898p()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r0 = r0.mo73988c()
            java.lang.Iterable r0 = r0.mo73969k()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0028
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r6 = 0
            goto L_0x0041
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r0.next()
            bb.b r3 = (p217bb.C11119b) r3
            pb.c r4 = r5.f63850i
            boolean r3 = r3.mo62148c(r4, r6)
            if (r3 == 0) goto L_0x002c
            r6 = 1
        L_0x0041:
            if (r6 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14774i.mo73900w(pb.f):boolean");
    }

    /* renamed from: y */
    public List<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        Collection<C14064m> j = mo73897j(dVar, lVar, C12256d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<C11119b> k = mo73898p().mo73988c().mo73969k();
        ArrayList arrayList = new ArrayList();
        for (C11119b a : k) {
            boolean unused = C13624y.m87797z(arrayList, a.mo62146a(this.f63850i));
        }
        return C13566b0.m87442q0(j, arrayList);
    }

    /* renamed from: z */
    public void mo73928z(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C12186a.m82848b(mo73898p().mo73988c().mo73973o(), bVar, this.f63848g, fVar);
    }
}
