package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.j */
/* compiled from: MemberScope.kt */
public final class C14697j {
    /* renamed from: a */
    public static final Set<C16157f> m91884a(Iterable<? extends C14692h> iterable) {
        C13706o.m87929f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (C14692h f : iterable) {
            Set<C16157f> f2 = f.mo72404f();
            if (f2 == null) {
                return null;
            }
            boolean unused = C13624y.m87797z(hashSet, f2);
        }
        return hashSet;
    }
}
