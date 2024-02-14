package p434xb;

import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p362pb.C16152c;
import p425wb.C16793a;

/* renamed from: xb.a */
/* compiled from: BuiltInSerializerProtocol.kt */
public final class C16903a extends C16793a {

    /* renamed from: n */
    public static final C16903a f68154n = new C16903a();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C16903a() {
        /*
            r14 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14490f.m90911d()
            p318lb.C15619b.m94871a(r1)
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.l, java.lang.Integer> r2 = p318lb.C15619b.f64881a
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.C13706o.m87928e(r2, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.d, java.util.List<kb.b>> r3 = p318lb.C15619b.f64883c
            java.lang.String r0 = "constructorAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.c, java.util.List<kb.b>> r4 = p318lb.C15619b.f64882b
            java.lang.String r0 = "classAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.i, java.util.List<kb.b>> r5 = p318lb.C15619b.f64884d
            java.lang.String r0 = "functionAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.n, java.util.List<kb.b>> r6 = p318lb.C15619b.f64885e
            java.lang.String r0 = "propertyAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.n, java.util.List<kb.b>> r7 = p318lb.C15619b.f64886f
            java.lang.String r0 = "propertyGetterAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r7, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.n, java.util.List<kb.b>> r8 = p318lb.C15619b.f64887g
            java.lang.String r0 = "propertySetterAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r8, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.g, java.util.List<kb.b>> r9 = p318lb.C15619b.f64889i
            java.lang.String r0 = "enumEntryAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.n, kb.b$b$c> r10 = p318lb.C15619b.f64888h
            java.lang.String r0 = "compileTimeValue"
            kotlin.jvm.internal.C13706o.m87928e(r10, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.u, java.util.List<kb.b>> r11 = p318lb.C15619b.f64890j
            java.lang.String r0 = "parameterAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r11, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.q, java.util.List<kb.b>> r12 = p318lb.C15619b.f64891k
            java.lang.String r0 = "typeAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r12, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.s, java.util.List<kb.b>> r13 = p318lb.C15619b.f64892l
            java.lang.String r0 = "typeParameterAnnotation"
            kotlin.jvm.internal.C13706o.m87928e(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p434xb.C16903a.<init>():void");
    }

    /* renamed from: o */
    private final String m99960o(C16152c cVar) {
        if (cVar.mo78558d()) {
            return "default-package";
        }
        String d = cVar.mo78562g().mo78583d();
        C13706o.m87928e(d, "fqName.shortName().asString()");
        return d;
    }

    /* renamed from: m */
    public final String mo80075m(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return m99960o(cVar) + ".kotlin_builtins";
    }

    /* renamed from: n */
    public final String mo80076n(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        String b = cVar.mo78556b();
        C13706o.m87928e(b, "fqName.asString()");
        sb.append(C15176v.m93629D(b, FilenameUtils.EXTENSION_SEPARATOR, '/', false, 4, (Object) null));
        sb.append('/');
        sb.append(mo80075m(cVar));
        return sb.toString();
    }
}
