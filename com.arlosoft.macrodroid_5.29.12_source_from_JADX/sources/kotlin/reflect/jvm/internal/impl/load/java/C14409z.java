package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13706o;
import p253ec.C12187a;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.z */
/* compiled from: JvmAbi.kt */
public final class C14409z {

    /* renamed from: a */
    public static final C14409z f63195a = new C14409z();

    /* renamed from: b */
    public static final C16152c f63196b;

    /* renamed from: c */
    public static final C16151b f63197c;

    /* renamed from: d */
    private static final C16151b f63198d;

    /* renamed from: e */
    private static final C16151b f63199e;

    static {
        C16152c cVar = new C16152c("kotlin.jvm.JvmField");
        f63196b = cVar;
        C16151b m = C16151b.m96975m(cVar);
        C13706o.m87928e(m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f63197c = m;
        C16151b m2 = C16151b.m96975m(new C16152c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        C13706o.m87928e(m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f63198d = m2;
        C16151b e = C16151b.m96973e("kotlin/jvm/internal/RepeatableContainer");
        C13706o.m87928e(e, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f63199e = e;
    }

    private C14409z() {
    }

    /* renamed from: b */
    public static final String m90470b(String str) {
        C13706o.m87929f(str, "propertyName");
        if (m90474f(str)) {
            return str;
        }
        return "get" + C12187a.m82850a(str);
    }

    /* renamed from: c */
    public static final boolean m90471c(String str) {
        C13706o.m87929f(str, "name");
        return C15176v.m93634I(str, "get", false, 2, (Object) null) || C15176v.m93634I(str, "is", false, 2, (Object) null);
    }

    /* renamed from: d */
    public static final boolean m90472d(String str) {
        C13706o.m87929f(str, "name");
        return C15176v.m93634I(str, "set", false, 2, (Object) null);
    }

    /* renamed from: e */
    public static final String m90473e(String str) {
        String str2;
        C13706o.m87929f(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (m90474f(str)) {
            str2 = str.substring(2);
            C13706o.m87928e(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = C12187a.m82850a(str);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m90474f(String str) {
        C13706o.m87929f(str, "name");
        if (!C15176v.m93634I(str, "is", false, 2, (Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (C13706o.m87931h(97, charAt) > 0 || C13706o.m87931h(charAt, 122) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C16151b mo73108a() {
        return f63199e;
    }
}
