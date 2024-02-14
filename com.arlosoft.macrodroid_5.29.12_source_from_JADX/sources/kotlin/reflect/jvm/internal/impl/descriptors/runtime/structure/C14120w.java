package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p288ib.C12479a;
import p288ib.C12492g;
import p288ib.C12507u;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w */
/* compiled from: ReflectJavaPackage.kt */
public final class C14120w extends C14112p implements C12507u {

    /* renamed from: a */
    private final C16152c f62744a;

    public C14120w(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        this.f62744a = cVar;
    }

    /* renamed from: A */
    public Collection<C12492g> mo69005A(C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(lVar, "nameFilter");
        return C13614t.m87748j();
    }

    /* renamed from: H */
    public C12479a mo68961H(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return null;
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return false;
    }

    /* renamed from: N */
    public List<C12479a> getAnnotations() {
        return C13614t.m87748j();
    }

    /* renamed from: e */
    public C16152c mo69006e() {
        return this.f62744a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14120w) && C13706o.m87924a(mo69006e(), ((C14120w) obj).mo69006e());
    }

    public int hashCode() {
        return mo69006e().hashCode();
    }

    /* renamed from: t */
    public Collection<C12507u> mo69007t() {
        return C13614t.m87748j();
    }

    public String toString() {
        return C14120w.class.getName() + ": " + mo69006e();
    }
}
