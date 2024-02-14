package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13706o;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.h */
/* compiled from: BuiltinSpecialProperties.kt */
public final class C14207h {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C16152c m89765c(C16152c cVar, String str) {
        C16152c c = cVar.mo78557c(C16157f.m97019i(str));
        C13706o.m87928e(c, "child(Name.identifier(name))");
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C16152c m89766d(C16153d dVar, String str) {
        C16152c l = dVar.mo78569c(C16157f.m97019i(str)).mo78579l();
        C13706o.m87928e(l, "child(Name.identifier(name)).toSafe()");
        return l;
    }
}
