package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import p327mb.C15719c;
import p362pb.C16151b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.x */
/* compiled from: NameResolverUtil.kt */
public final class C14823x {
    /* renamed from: a */
    public static final C16151b m92358a(C15719c cVar, int i) {
        C13706o.m87929f(cVar, "<this>");
        C16151b f = C16151b.m96974f(cVar.mo75164b(i), cVar.mo75163a(i));
        C13706o.m87928e(f, "fromString(getQualifiedC… isLocalClassName(index))");
        return f;
    }

    /* renamed from: b */
    public static final C16157f m92359b(C15719c cVar, int i) {
        C13706o.m87929f(cVar, "<this>");
        C16157f g = C16157f.m97018g(cVar.getString(i));
        C13706o.m87928e(g, "guessByFirstCharacter(getString(index))");
        return g;
    }
}
