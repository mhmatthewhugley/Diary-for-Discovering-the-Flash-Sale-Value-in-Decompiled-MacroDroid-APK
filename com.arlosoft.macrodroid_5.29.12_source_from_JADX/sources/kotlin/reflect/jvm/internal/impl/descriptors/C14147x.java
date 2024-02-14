package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p362pb.C16151b;
import p370qa.C16265l;
import p433xa.C16878g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x */
/* compiled from: findClassInModule.kt */
public final class C14147x {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$a */
    /* compiled from: findClassInModule.kt */
    /* synthetic */ class C14148a extends C13703l implements C16265l<C16151b, C16151b> {

        /* renamed from: a */
        public static final C14148a f62768a = new C14148a();

        C14148a() {
            super(1);
        }

        public final String getName() {
            return "getOuterClassId";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C16151b.class);
        }

        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        /* renamed from: l */
        public final C16151b invoke(C16151b bVar) {
            C13706o.m87929f(bVar, "p0");
            return bVar.mo78548g();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$b */
    /* compiled from: findClassInModule.kt */
    static final class C14149b extends C13708q implements C16265l<C16151b, Integer> {

        /* renamed from: a */
        public static final C14149b f62769a = new C14149b();

        C14149b() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C16151b bVar) {
            C13706o.m87929f(bVar, "it");
            return 0;
        }
    }

    /* renamed from: a */
    public static final C13948e m89564a(C13958g0 g0Var, C16151b bVar) {
        C13706o.m87929f(g0Var, "<this>");
        C13706o.m87929f(bVar, "classId");
        C13961h b = m89565b(g0Var, bVar);
        if (b instanceof C13948e) {
            return (C13948e) b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.C13961h m89565b(kotlin.reflect.jvm.internal.impl.descriptors.C13958g0 r10, p362pb.C16151b r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r0 = kotlin.reflect.jvm.internal.impl.resolve.C14674n.m91798a(r10)
            java.lang.String r1 = "name"
            r2 = 1
            java.lang.String r3 = "segments.first()"
            java.lang.String r4 = "classId.relativeClassName.pathSegments()"
            java.lang.String r5 = "classId.packageFqName"
            r6 = 0
            if (r0 != 0) goto L_0x0082
            pb.c r0 = r11.mo78549h()
            kotlin.jvm.internal.C13706o.m87928e(r0, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.p0 r10 = r10.mo72295V(r0)
            pb.c r11 = r11.mo78551i()
            java.util.List r11 = r11.mo78561f()
            kotlin.jvm.internal.C13706o.m87928e(r11, r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r10 = r10.mo72524n()
            java.lang.Object r0 = kotlin.collections.C13566b0.m87422W(r11)
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            pb.f r0 = (p362pb.C16157f) r0
            fb.d r3 = p263fb.C12256d.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.h r10 = r10.mo72800e(r0, r3)
            if (r10 != 0) goto L_0x0047
            goto L_0x014c
        L_0x0047:
            int r0 = r11.size()
            java.util.List r11 = r11.subList(r2, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r11.next()
            pb.f r0 = (p362pb.C16157f) r0
            boolean r2 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r2 != 0) goto L_0x0065
            goto L_0x014c
        L_0x0065:
            kotlin.reflect.jvm.internal.impl.descriptors.e r10 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r10
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r10 = r10.mo72284T()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            fb.d r2 = p263fb.C12256d.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.h r10 = r10.mo72800e(r0, r2)
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r0 == 0) goto L_0x007b
            kotlin.reflect.jvm.internal.impl.descriptors.e r10 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r10
            goto L_0x007c
        L_0x007b:
            r10 = r6
        L_0x007c:
            if (r10 == 0) goto L_0x014c
            goto L_0x0053
        L_0x007f:
            r6 = r10
            goto L_0x014c
        L_0x0082:
            pb.c r7 = r11.mo78549h()
            kotlin.jvm.internal.C13706o.m87928e(r7, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.p0 r0 = r0.mo72295V(r7)
            pb.c r7 = r11.mo78551i()
            java.util.List r7 = r7.mo78561f()
            kotlin.jvm.internal.C13706o.m87928e(r7, r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r0 = r0.mo72524n()
            java.lang.Object r8 = kotlin.collections.C13566b0.m87422W(r7)
            kotlin.jvm.internal.C13706o.m87928e(r8, r3)
            pb.f r8 = (p362pb.C16157f) r8
            fb.d r9 = p263fb.C12256d.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.h r0 = r0.mo72800e(r8, r9)
            if (r0 != 0) goto L_0x00af
        L_0x00ad:
            r0 = r6
            goto L_0x00e6
        L_0x00af:
            int r8 = r7.size()
            java.util.List r7 = r7.subList(r2, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x00bb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r7.next()
            pb.f r8 = (p362pb.C16157f) r8
            boolean r9 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r9 != 0) goto L_0x00cc
            goto L_0x00ad
        L_0x00cc:
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r0 = r0.mo72284T()
            kotlin.jvm.internal.C13706o.m87928e(r8, r1)
            fb.d r9 = p263fb.C12256d.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.h r0 = r0.mo72800e(r8, r9)
            boolean r8 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r8 == 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r0
            goto L_0x00e3
        L_0x00e2:
            r0 = r6
        L_0x00e3:
            if (r0 == 0) goto L_0x00ad
            goto L_0x00bb
        L_0x00e6:
            if (r0 != 0) goto L_0x014b
            pb.c r0 = r11.mo78549h()
            kotlin.jvm.internal.C13706o.m87928e(r0, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.p0 r10 = r10.mo72295V(r0)
            pb.c r11 = r11.mo78551i()
            java.util.List r11 = r11.mo78561f()
            kotlin.jvm.internal.C13706o.m87928e(r11, r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r10 = r10.mo72524n()
            java.lang.Object r0 = kotlin.collections.C13566b0.m87422W(r11)
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            pb.f r0 = (p362pb.C16157f) r0
            fb.d r3 = p263fb.C12256d.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.h r10 = r10.mo72800e(r0, r3)
            if (r10 != 0) goto L_0x0114
            goto L_0x014c
        L_0x0114:
            int r0 = r11.size()
            java.util.List r11 = r11.subList(r2, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0120:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r11.next()
            pb.f r0 = (p362pb.C16157f) r0
            boolean r2 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r2 != 0) goto L_0x0131
            goto L_0x014c
        L_0x0131:
            kotlin.reflect.jvm.internal.impl.descriptors.e r10 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r10
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r10 = r10.mo72284T()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            fb.d r2 = p263fb.C12256d.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.h r10 = r10.mo72800e(r0, r2)
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r0 == 0) goto L_0x0147
            kotlin.reflect.jvm.internal.impl.descriptors.e r10 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r10
            goto L_0x0148
        L_0x0147:
            r10 = r6
        L_0x0148:
            if (r10 == 0) goto L_0x014c
            goto L_0x0120
        L_0x014b:
            r6 = r0
        L_0x014c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C14147x.m89565b(kotlin.reflect.jvm.internal.impl.descriptors.g0, pb.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    /* renamed from: c */
    public static final C13948e m89566c(C13958g0 g0Var, C16151b bVar, C14043j0 j0Var) {
        C13706o.m87929f(g0Var, "<this>");
        C13706o.m87929f(bVar, "classId");
        C13706o.m87929f(j0Var, "notFoundClasses");
        C13948e a = m89564a(g0Var, bVar);
        if (a != null) {
            return a;
        }
        return j0Var.mo72552d(bVar, C15132p.m93480D(C15132p.m93494w(C15125n.m93473h(bVar, C14148a.f62768a), C14149b.f62769a)));
    }

    /* renamed from: d */
    public static final C13947d1 m89567d(C13958g0 g0Var, C16151b bVar) {
        C13706o.m87929f(g0Var, "<this>");
        C13706o.m87929f(bVar, "classId");
        C13961h b = m89565b(g0Var, bVar);
        if (b instanceof C13947d1) {
            return (C13947d1) b;
        }
        return null;
    }
}
