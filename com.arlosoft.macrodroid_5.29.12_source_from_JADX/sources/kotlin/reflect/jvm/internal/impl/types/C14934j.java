package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13926i;
import p433xa.C16875d;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.j */
/* compiled from: AnnotationsTypeAttribute.kt */
public final class C14934j extends C14991y0<C14934j> {

    /* renamed from: a */
    private final C13921g f64057a;

    public C14934j(C13921g gVar) {
        C13706o.m87929f(gVar, "annotations");
        this.f64057a = gVar;
    }

    /* renamed from: b */
    public C16875d<? extends C14934j> mo74196b() {
        return C13687e0.m87868b(C14934j.class);
    }

    /* renamed from: d */
    public C14934j mo74195a(C14934j jVar) {
        return jVar == null ? this : new C14934j(C13926i.m88508a(this.f64057a, jVar.f64057a));
    }

    /* renamed from: e */
    public final C13921g mo74199e() {
        return this.f64057a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14934j)) {
            return false;
        }
        return C13706o.m87924a(((C14934j) obj).f64057a, this.f64057a);
    }

    /* renamed from: f */
    public C14934j mo74197c(C14934j jVar) {
        if (C13706o.m87924a(jVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f64057a.hashCode();
    }
}
