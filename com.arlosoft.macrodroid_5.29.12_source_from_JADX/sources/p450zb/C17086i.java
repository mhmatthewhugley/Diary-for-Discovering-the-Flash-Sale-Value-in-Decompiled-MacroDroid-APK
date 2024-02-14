package p450zb;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13849e;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: zb.i */
/* compiled from: ErrorTypeConstructor.kt */
public final class C17086i implements C14901e1 {

    /* renamed from: a */
    private final C17087j f68556a;

    /* renamed from: b */
    private final String[] f68557b;

    /* renamed from: c */
    private final String f68558c;

    public C17086i(C17087j jVar, String... strArr) {
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
        this.f68556a = jVar;
        this.f68557b = strArr;
        String d = C17078b.ERROR_TYPE.mo80345d();
        String d2 = jVar.mo80359d();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(d2, Arrays.copyOf(copyOf, copyOf.length));
        C13706o.m87928e(format, "format(this, *args)");
        String format2 = String.format(d, Arrays.copyOf(new Object[]{format}, 1));
        C13706o.m87928e(format2, "format(this, *args)");
        this.f68558c = format2;
    }

    /* renamed from: a */
    public C14901e1 mo72368a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: c */
    public C13961h mo62183c() {
        return C17088k.f68644a.mo80365h();
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return false;
    }

    /* renamed from: e */
    public final C17087j mo80356e() {
        return this.f68556a;
    }

    /* renamed from: f */
    public final String mo80357f(int i) {
        return this.f68557b[i];
    }

    public List<C13950e1> getParameters() {
        return C13614t.m87748j();
    }

    /* renamed from: l */
    public Collection<C14900e0> mo72370l() {
        return C13614t.m87748j();
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        return C13849e.f62067h.mo72110a();
    }

    public String toString() {
        return this.f68558c;
    }
}
