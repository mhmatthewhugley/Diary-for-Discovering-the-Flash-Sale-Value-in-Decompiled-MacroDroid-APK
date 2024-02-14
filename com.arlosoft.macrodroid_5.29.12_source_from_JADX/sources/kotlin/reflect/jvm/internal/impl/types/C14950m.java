package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.m */
/* compiled from: ClassifierBasedTypeConstructor.kt */
public abstract class C14950m implements C14901e1 {

    /* renamed from: a */
    private int f64073a;

    /* renamed from: f */
    private final boolean m92956f(C13961h hVar) {
        return !C17088k.m100541m(hVar) && !C14650d.m91605E(hVar);
    }

    /* renamed from: c */
    public abstract C13961h mo62183c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo74219e(C13961h hVar, C13961h hVar2) {
        C13706o.m87929f(hVar, "first");
        C13706o.m87929f(hVar2, "second");
        if (!C13706o.m87924a(hVar.getName(), hVar2.getName())) {
            return false;
        }
        C14064m b = hVar.mo62163b();
        C14064m b2 = hVar2.mo62163b();
        while (b != null && b2 != null) {
            if (b instanceof C13958g0) {
                return b2 instanceof C13958g0;
            }
            if (b2 instanceof C13958g0) {
                return false;
            }
            if (b instanceof C14050k0) {
                if (!(b2 instanceof C14050k0) || !C13706o.m87924a(((C14050k0) b).mo72551e(), ((C14050k0) b2).mo72551e())) {
                    return false;
                }
                return true;
            } else if ((b2 instanceof C14050k0) || !C13706o.m87924a(b.getName(), b2.getName())) {
                return false;
            } else {
                b = b.mo62163b();
                b2 = b2.mo62163b();
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14901e1) || obj.hashCode() != hashCode()) {
            return false;
        }
        C14901e1 e1Var = (C14901e1) obj;
        if (e1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C13961h c = mo62183c();
        C13961h c2 = e1Var.mo62183c();
        if (c2 != null && m92956f(c) && m92956f(c2)) {
            return mo72381g(c2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo72381g(C13961h hVar);

    public int hashCode() {
        int i;
        int i2 = this.f64073a;
        if (i2 != 0) {
            return i2;
        }
        C13961h c = mo62183c();
        if (m92956f(c)) {
            i = C14650d.m91626m(c).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.f64073a = i;
        return i;
    }
}
