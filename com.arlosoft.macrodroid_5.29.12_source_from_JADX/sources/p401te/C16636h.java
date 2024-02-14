package p401te;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.p356bp.zone.ZoneRulesException;
import p383re.C16501d;

/* renamed from: te.h */
/* compiled from: ZoneRulesProvider */
public abstract class C16636h {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<C16636h> f67492a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private static final ConcurrentMap<String, C16636h> f67493b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        C16633g.m99046a();
    }

    protected C16636h() {
    }

    /* renamed from: a */
    private static C16636h m99051a(String str) {
        ConcurrentMap<String, C16636h> concurrentMap = f67493b;
        C16636h hVar = (C16636h) concurrentMap.get(str);
        if (hVar != null) {
            return hVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    /* renamed from: b */
    public static C16631f m99052b(String str, boolean z) {
        C16501d.m98548i(str, "zoneId");
        return m99051a(str).mo79512c(str, z);
    }

    /* renamed from: e */
    public static void m99053e(C16636h hVar) {
        C16501d.m98548i(hVar, "provider");
        m99054f(hVar);
        f67492a.add(hVar);
    }

    /* renamed from: f */
    private static void m99054f(C16636h hVar) {
        for (String next : hVar.mo79513d()) {
            C16501d.m98548i(next, "zoneId");
            if (f67493b.putIfAbsent(next, hVar) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + next + ", currently loading from provider: " + hVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C16631f mo79512c(String str, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Set<String> mo79513d();
}
