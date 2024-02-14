package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.w */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C14036w implements C14035v {

    /* renamed from: a */
    private final List<C14037x> f62637a;

    /* renamed from: b */
    private final Set<C14037x> f62638b;

    /* renamed from: c */
    private final List<C14037x> f62639c;

    /* renamed from: d */
    private final Set<C14037x> f62640d;

    public C14036w(List<C14037x> list, Set<C14037x> set, List<C14037x> list2, Set<C14037x> set2) {
        C13706o.m87929f(list, "allDependencies");
        C13706o.m87929f(set, "modulesWhoseInternalsAreVisible");
        C13706o.m87929f(list2, "directExpectedByDependencies");
        C13706o.m87929f(set2, "allExpectedByDependencies");
        this.f62637a = list;
        this.f62638b = set;
        this.f62639c = list2;
        this.f62640d = set2;
    }

    /* renamed from: a */
    public List<C14037x> mo72532a() {
        return this.f62637a;
    }

    /* renamed from: b */
    public List<C14037x> mo72533b() {
        return this.f62639c;
    }

    /* renamed from: c */
    public Set<C14037x> mo72534c() {
        return this.f62638b;
    }
}
