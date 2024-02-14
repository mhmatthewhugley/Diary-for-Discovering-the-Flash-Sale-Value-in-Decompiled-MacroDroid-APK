package p416vb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: vb.e */
/* compiled from: ImplicitClassReceiver.kt */
public class C16755e implements C16756f, C16758h {

    /* renamed from: a */
    private final C13948e f67695a;

    /* renamed from: b */
    private final C16755e f67696b;

    /* renamed from: c */
    private final C13948e f67697c;

    public C16755e(C13948e eVar, C16755e eVar2) {
        C13706o.m87929f(eVar, "classDescriptor");
        this.f67695a = eVar;
        this.f67696b = eVar2 == null ? this : eVar2;
        this.f67697c = eVar;
    }

    /* renamed from: b */
    public C14951m0 getType() {
        C14951m0 p = this.f67695a.mo72274p();
        C13706o.m87928e(p, "classDescriptor.defaultType");
        return p;
    }

    public boolean equals(Object obj) {
        C13948e eVar = this.f67695a;
        C13948e eVar2 = null;
        C16755e eVar3 = obj instanceof C16755e ? (C16755e) obj : null;
        if (eVar3 != null) {
            eVar2 = eVar3.f67695a;
        }
        return C13706o.m87924a(eVar, eVar2);
    }

    public int hashCode() {
        return this.f67695a.hashCode();
    }

    /* renamed from: s */
    public final C13948e mo79740s() {
        return this.f67695a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
