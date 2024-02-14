package p398tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import p362pb.C16157f;

/* renamed from: tb.a */
/* compiled from: SyntheticJavaPartsProvider.kt */
public final class C16606a implements C16611f {

    /* renamed from: b */
    private final List<C16611f> f67431b;

    public C16606a(List<? extends C16611f> list) {
        C13706o.m87929f(list, "inner");
        this.f67431b = list;
    }

    /* renamed from: a */
    public List<C16157f> mo79449a(C13948e eVar) {
        C13706o.m87929f(eVar, "thisDescriptor");
        List<C16611f> list = this.f67431b;
        ArrayList arrayList = new ArrayList();
        for (C16611f a : list) {
            boolean unused = C13624y.m87797z(arrayList, a.mo79449a(eVar));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo79450b(C13948e eVar, C16157f fVar, Collection<C14156y0> collection) {
        C13706o.m87929f(eVar, "thisDescriptor");
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(collection, "result");
        for (C16611f b : this.f67431b) {
            b.mo79450b(eVar, fVar, collection);
        }
    }

    /* renamed from: c */
    public void mo79451c(C13948e eVar, List<C13944d> list) {
        C13706o.m87929f(eVar, "thisDescriptor");
        C13706o.m87929f(list, "result");
        for (C16611f c : this.f67431b) {
            c.mo79451c(eVar, list);
        }
    }

    /* renamed from: d */
    public void mo79452d(C13948e eVar, C16157f fVar, Collection<C14156y0> collection) {
        C13706o.m87929f(eVar, "thisDescriptor");
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(collection, "result");
        for (C16611f d : this.f67431b) {
            d.mo79452d(eVar, fVar, collection);
        }
    }

    /* renamed from: e */
    public List<C16157f> mo79453e(C13948e eVar) {
        C13706o.m87929f(eVar, "thisDescriptor");
        List<C16611f> list = this.f67431b;
        ArrayList arrayList = new ArrayList();
        for (C16611f e : list) {
            boolean unused = C13624y.m87797z(arrayList, e.mo79453e(eVar));
        }
        return arrayList;
    }
}
