package p242db;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14010m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14439g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14458p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14678b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p298jb.C13359a;
import p362pb.C16151b;
import p362pb.C16152c;
import p398tb.C16609d;

/* renamed from: db.a */
/* compiled from: PackagePartScopeCache.kt */
public final class C11990a {

    /* renamed from: a */
    private final C14439g f58189a;

    /* renamed from: b */
    private final C11997g f58190b;

    /* renamed from: c */
    private final ConcurrentHashMap<C16151b, C14692h> f58191c = new ConcurrentHashMap<>();

    public C11990a(C14439g gVar, C11997g gVar2) {
        C13706o.m87929f(gVar, "resolver");
        C13706o.m87929f(gVar2, "kotlinClassFinder");
        this.f58189a = gVar;
        this.f58190b = gVar2;
    }

    /* renamed from: a */
    public final C14692h mo67418a(C11995f fVar) {
        List<C14459q> list;
        C13706o.m87929f(fVar, "fileClass");
        ConcurrentHashMap<C16151b, C14692h> concurrentHashMap = this.f58191c;
        C16151b d = fVar.mo67429d();
        Object obj = concurrentHashMap.get(d);
        if (obj == null) {
            C16152c h = fVar.mo67429d().mo78549h();
            C13706o.m87928e(h, "fileClass.classId.packageFqName");
            if (fVar.mo67427b().mo70762c() == C13359a.C13360a.MULTIFILE_CLASS) {
                List<String> f = fVar.mo67427b().mo70765f();
                list = new ArrayList<>();
                for (String d2 : f) {
                    C16151b m = C16151b.m96975m(C16609d.m98929d(d2).mo79456e());
                    C13706o.m87928e(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    C14459q b = C14458p.m90655b(this.f58190b, m);
                    if (b != null) {
                        list.add(b);
                    }
                }
            } else {
                list = C13612s.m87736e(fVar);
            }
            C14010m mVar = new C14010m(this.f58189a.mo73161d().mo73974p(), h);
            ArrayList arrayList = new ArrayList();
            for (C14459q b2 : list) {
                C14692h b3 = this.f58189a.mo73160b(mVar, b2);
                if (b3 != null) {
                    arrayList.add(b3);
                }
            }
            List F0 = C13566b0.m87402F0(arrayList);
            C14678b.C14679a aVar = C14678b.f63681d;
            Object a = aVar.mo73796a("package " + h + " (" + fVar + ')', F0);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(d, a);
            obj = putIfAbsent == null ? a : putIfAbsent;
        }
        C13706o.m87928e(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return (C14692h) obj;
    }
}
