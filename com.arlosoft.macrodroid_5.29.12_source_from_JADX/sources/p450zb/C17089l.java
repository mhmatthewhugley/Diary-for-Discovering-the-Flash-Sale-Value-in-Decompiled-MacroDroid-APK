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
import p263fb.C12253b;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: zb.l */
/* compiled from: ThrowingScope.kt */
public final class C17089l extends C17083f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17089l(C17084g gVar, String... strArr) {
        super(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        C13706o.m87929f(gVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        throw new IllegalStateException(mo80350j() + ", required name: " + fVar);
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        throw new IllegalStateException(mo80350j());
    }

    /* renamed from: h */
    public Set<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        throw new IllegalStateException(mo80350j() + ", required name: " + fVar);
    }

    /* renamed from: i */
    public Set<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        throw new IllegalStateException(mo80350j() + ", required name: " + fVar);
    }

    public String toString() {
        return "ThrowingScope{" + mo80350j() + '}';
    }
}
