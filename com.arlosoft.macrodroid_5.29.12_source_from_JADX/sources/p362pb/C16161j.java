package p362pb;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;
import p297ja.C13337s;

/* renamed from: pb.j */
/* compiled from: StandardClassIds.kt */
public final class C16161j {

    /* renamed from: a */
    private static final C16152c f66393a;

    /* renamed from: b */
    private static final C16152c f66394b;

    static {
        C16152c cVar = new C16152c("java.lang");
        f66393a = cVar;
        C16152c c = cVar.mo78557c(C16157f.m97019i("annotation"));
        C13706o.m87928e(c, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f66394b = c;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C16151b m97050j(String str) {
        return new C16151b(C16160i.f66342a.mo78592b(), C16157f.m97019i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C16151b m97051k(String str) {
        return new C16151b(C16160i.f66342a.mo78595e(), C16157f.m97019i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C16151b m97052l(String str) {
        return new C16151b(C16160i.f66342a.mo78593c(), C16157f.m97019i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C16151b m97053m(String str) {
        return new C16151b(C16160i.f66342a.mo78594d(), C16157f.m97019i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final <K, V> Map<V, K> m97054n(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            C13328m a = C13337s.m85692a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a.mo70154c(), a.mo70155d());
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final C16151b m97055o(C16157f fVar) {
        C16160i iVar = C16160i.f66342a;
        C16152c h = iVar.mo78591a().mo78549h();
        return new C16151b(h, C16157f.m97019i(fVar.mo78586f() + iVar.mo78591a().mo78552j().mo78586f()));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final C16151b m97056p(String str) {
        return new C16151b(C16160i.f66342a.mo78596f(), C16157f.m97019i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final C16151b m97057q(String str) {
        return new C16151b(C16160i.f66342a.mo78597g(), C16157f.m97019i(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final C16151b m97058r(C16151b bVar) {
        C16152c e = C16160i.f66342a.mo78595e();
        return new C16151b(e, C16157f.m97019i('U' + bVar.mo78552j().mo78586f()));
    }
}
