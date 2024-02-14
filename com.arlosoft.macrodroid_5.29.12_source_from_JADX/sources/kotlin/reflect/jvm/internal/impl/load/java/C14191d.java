package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import p362pb.C16152c;
import p362pb.C16157f;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.d */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class C14191d extends C14160a<C13915c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14191d(C14403w wVar) {
        super(wVar);
        C13706o.m87929f(wVar, "javaTypeEnhancementState");
    }

    /* renamed from: y */
    private final List<String> m89716y(C14617g<?> gVar) {
        if (gVar instanceof C14612b) {
            ArrayList arrayList = new ArrayList();
            for (C14617g y : (Iterable) ((C14612b) gVar).mo73727b()) {
                boolean unused = C13624y.m87797z(arrayList, m89716y(y));
            }
            return arrayList;
        } else if (gVar instanceof C14622j) {
            return C13612s.m87736e(((C14622j) gVar).mo73735c().mo78586f());
        } else {
            return C13614t.m87748j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Iterable<String> mo72671b(C13915c cVar, boolean z) {
        List<String> list;
        C13706o.m87929f(cVar, "<this>");
        Map<C16157f, C14617g<?>> a = cVar.mo72240a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : a.entrySet()) {
            C16157f fVar = (C16157f) next.getKey();
            C14617g gVar = (C14617g) next.getValue();
            if (!z || C13706o.m87924a(fVar, C14163a0.f62786c)) {
                list = m89716y(gVar);
            } else {
                list = C13614t.m87748j();
            }
            boolean unused = C13624y.m87797z(arrayList, list);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C16152c mo72675i(C13915c cVar) {
        C13706o.m87929f(cVar, "<this>");
        return cVar.mo72241e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Object mo72676j(C13915c cVar) {
        C13706o.m87929f(cVar, "<this>");
        C13948e e = C16519a.m98612e(cVar);
        C13706o.m87926c(e);
        return e;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.getAnnotations();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c> mo72677k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c r2) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = p389sb.C16519a.m98612e(r2)
            if (r2 == 0) goto L_0x0012
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            if (r2 == 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            java.util.List r2 = kotlin.collections.C13614t.m87748j()
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C14191d.mo72677k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c):java.lang.Iterable");
    }
}
