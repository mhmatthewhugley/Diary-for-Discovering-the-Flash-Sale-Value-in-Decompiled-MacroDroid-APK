package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13933m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13934n;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p288ib.C12482b;
import p288ib.C12498m;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16157f;
import p370qa.C16265l;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.d */
/* compiled from: JavaAnnotationMapper.kt */
public final class C14175d {

    /* renamed from: a */
    public static final C14175d f62855a = new C14175d();

    /* renamed from: b */
    private static final Map<String, EnumSet<C13934n>> f62856b = C13615t0.m87762l(C13337s.m85692a("PACKAGE", EnumSet.noneOf(C13934n.class)), C13337s.m85692a("TYPE", EnumSet.of(C13934n.CLASS, C13934n.FILE)), C13337s.m85692a("ANNOTATION_TYPE", EnumSet.of(C13934n.ANNOTATION_CLASS)), C13337s.m85692a("TYPE_PARAMETER", EnumSet.of(C13934n.TYPE_PARAMETER)), C13337s.m85692a("FIELD", EnumSet.of(C13934n.FIELD)), C13337s.m85692a("LOCAL_VARIABLE", EnumSet.of(C13934n.LOCAL_VARIABLE)), C13337s.m85692a("PARAMETER", EnumSet.of(C13934n.VALUE_PARAMETER)), C13337s.m85692a("CONSTRUCTOR", EnumSet.of(C13934n.CONSTRUCTOR)), C13337s.m85692a("METHOD", EnumSet.of(C13934n.FUNCTION, C13934n.PROPERTY_GETTER, C13934n.PROPERTY_SETTER)), C13337s.m85692a("TYPE_USE", EnumSet.of(C13934n.TYPE)));

    /* renamed from: c */
    private static final Map<String, C13933m> f62857c = C13615t0.m87762l(C13337s.m85692a("RUNTIME", C13933m.RUNTIME), C13337s.m85692a("CLASS", C13933m.BINARY), C13337s.m85692a("SOURCE", C13933m.SOURCE));

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.d$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C14176a extends C13708q implements C16265l<C13958g0, C14900e0> {

        /* renamed from: a */
        public static final C14176a f62858a = new C14176a();

        C14176a() {
            super(1);
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "module");
            C13966i1 b = C14169a.m89659b(C14174c.f62850a.mo72692d(), g0Var.mo72296m().mo72142o(C13902k.C13903a.f62217H));
            C14900e0 type = b != null ? b.getType() : null;
            return type == null ? C17088k.m100540d(C17087j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    private C14175d() {
    }

    /* renamed from: a */
    public final C14617g<?> mo72694a(C12482b bVar) {
        C12498m mVar = bVar instanceof C12498m ? (C12498m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, C13933m> map = f62857c;
        C16157f d = mVar.mo68990d();
        C13933m mVar2 = map.get(d != null ? d.mo78583d() : null);
        if (mVar2 == null) {
            return null;
        }
        C16151b m = C16151b.m96975m(C13902k.C13903a.f62223K);
        C13706o.m87928e(m, "topLevel(StandardNames.F…ames.annotationRetention)");
        C16157f i = C16157f.m97019i(mVar2.name());
        C13706o.m87928e(i, "identifier(retention.name)");
        return new C14622j(m, i);
    }

    /* renamed from: b */
    public final Set<C13934n> mo72695b(String str) {
        EnumSet enumSet = f62856b.get(str);
        return enumSet != null ? enumSet : C13627z0.m87806d();
    }

    /* renamed from: c */
    public final C14617g<?> mo72696c(List<? extends C12482b> list) {
        C13706o.m87929f(list, "arguments");
        ArrayList<C12498m> arrayList = new ArrayList<>();
        for (T next : list) {
            if (next instanceof C12498m) {
                arrayList.add(next);
            }
        }
        ArrayList<C13934n> arrayList2 = new ArrayList<>();
        for (C12498m d : arrayList) {
            C14175d dVar = f62855a;
            C16157f d2 = d.mo68990d();
            boolean unused = C13624y.m87797z(arrayList2, dVar.mo72695b(d2 != null ? d2.mo78583d() : null));
        }
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(arrayList2, 10));
        for (C13934n name : arrayList2) {
            C16151b m = C16151b.m96975m(C13902k.C13903a.f62221J);
            C13706o.m87928e(m, "topLevel(StandardNames.FqNames.annotationTarget)");
            C16157f i = C16157f.m97019i(name.name());
            C13706o.m87928e(i, "identifier(kotlinTarget.name)");
            arrayList3.add(new C14622j(m, i));
        }
        return new C14612b(arrayList3, C14176a.f62858a);
    }
}
