package p450zb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p263fb.C12253b;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: zb.f */
/* compiled from: ErrorScope.kt */
public class C17083f implements C14692h {

    /* renamed from: b */
    private final C17084g f68536b;

    /* renamed from: c */
    private final String f68537c;

    public C17083f(C17084g gVar, String... strArr) {
        C13706o.m87929f(gVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
        this.f68536b = gVar;
        String d = gVar.mo80352d();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(d, Arrays.copyOf(copyOf, copyOf.length));
        C13706o.m87928e(format, "format(this, *args)");
        this.f68537c = format;
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        return C13627z0.m87806d();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        return C13627z0.m87806d();
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        String format = String.format(C17078b.ERROR_CLASS.mo80345d(), Arrays.copyOf(new Object[]{fVar}, 1));
        C13706o.m87928e(format, "format(this, *args)");
        C16157f l = C16157f.m97021l(format);
        C13706o.m87928e(l, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new C17077a(l);
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return C13627z0.m87806d();
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        return C13614t.m87748j();
    }

    /* renamed from: h */
    public Set<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C13625y0.m87800c(new C17079c(C17088k.f68644a.mo80365h()));
    }

    /* renamed from: i */
    public Set<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C17088k.f68644a.mo80367j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo80350j() {
        return this.f68537c;
    }

    public String toString() {
        return "ErrorScope{" + this.f68537c + '}';
    }
}
