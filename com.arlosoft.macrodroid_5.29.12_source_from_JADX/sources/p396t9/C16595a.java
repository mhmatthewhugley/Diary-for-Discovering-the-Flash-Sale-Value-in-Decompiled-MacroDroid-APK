package p396t9;

import androidx.core.app.NotificationCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p292io.grpc.C12520a;
import p292io.grpc.C12537b1;
import p292io.grpc.C12910l0;
import p292io.grpc.C12926n;
import p292io.grpc.C12929o;
import p292io.grpc.C13005w;

/* renamed from: t9.a */
/* compiled from: RoundRobinLoadBalancer */
final class C16595a extends C12910l0 {
    @VisibleForTesting

    /* renamed from: g */
    static final C12520a.C12523c<C16599d<C12929o>> f67414g = C12520a.C12523c.m83647a("state-info");

    /* renamed from: h */
    private static final C12537b1 f67415h = C12537b1.f59407f.mo69066q("no subchannels ready");

    /* renamed from: b */
    private final C12910l0.C12915d f67416b;

    /* renamed from: c */
    private final Map<C13005w, C12910l0.C12920h> f67417c = new HashMap();

    /* renamed from: d */
    private final Random f67418d;

    /* renamed from: e */
    private C12926n f67419e;

    /* renamed from: f */
    private C16600e f67420f = new C16597b(f67415h);

    /* renamed from: t9.a$a */
    /* compiled from: RoundRobinLoadBalancer */
    class C16596a implements C12910l0.C12922j {

        /* renamed from: a */
        final /* synthetic */ C12910l0.C12920h f67421a;

        C16596a(C12910l0.C12920h hVar) {
            this.f67421a = hVar;
        }

        /* renamed from: a */
        public void mo69497a(C12929o oVar) {
            C16595a.this.m98883k(this.f67421a, oVar);
        }
    }

    @VisibleForTesting
    /* renamed from: t9.a$b */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C16597b extends C16600e {

        /* renamed from: a */
        private final C12537b1 f67423a;

        C16597b(C12537b1 b1Var) {
            super((C16596a) null);
            this.f67423a = (C12537b1) Preconditions.m5393t(b1Var, NotificationCompat.CATEGORY_STATUS);
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            return this.f67423a.mo69064o() ? C12910l0.C12916e.m84901g() : C12910l0.C12916e.m84900f(this.f67423a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo79444c(C16600e eVar) {
            if (eVar instanceof C16597b) {
                C16597b bVar = (C16597b) eVar;
                if (Objects.m5349a(this.f67423a, bVar.f67423a) || (this.f67423a.mo69064o() && bVar.f67423a.mo69064o())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return MoreObjects.m5333b(C16597b.class).mo22194d(NotificationCompat.CATEGORY_STATUS, this.f67423a).toString();
        }
    }

    @VisibleForTesting
    /* renamed from: t9.a$c */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C16598c extends C16600e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater<C16598c> f67424c = AtomicIntegerFieldUpdater.newUpdater(C16598c.class, "b");

        /* renamed from: a */
        private final List<C12910l0.C12920h> f67425a;

        /* renamed from: b */
        private volatile int f67426b;

        C16598c(List<C12910l0.C12920h> list, int i) {
            super((C16596a) null);
            Preconditions.m5378e(!list.isEmpty(), "empty list");
            this.f67425a = list;
            this.f67426b = i - 1;
        }

        /* renamed from: d */
        private C12910l0.C12920h m98897d() {
            int size = this.f67425a.size();
            AtomicIntegerFieldUpdater<C16598c> atomicIntegerFieldUpdater = f67424c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i);
                incrementAndGet = i;
            }
            return this.f67425a.get(incrementAndGet);
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            return C12910l0.C12916e.m84902h(m98897d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo79444c(C16600e eVar) {
            if (!(eVar instanceof C16598c)) {
                return false;
            }
            C16598c cVar = (C16598c) eVar;
            if (cVar == this || (this.f67425a.size() == cVar.f67425a.size() && new HashSet(this.f67425a).containsAll(cVar.f67425a))) {
                return true;
            }
            return false;
        }

        public String toString() {
            return MoreObjects.m5333b(C16598c.class).mo22194d("list", this.f67425a).toString();
        }
    }

    @VisibleForTesting
    /* renamed from: t9.a$d */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C16599d<T> {

        /* renamed from: a */
        T f67427a;

        C16599d(T t) {
            this.f67427a = t;
        }
    }

    /* renamed from: t9.a$e */
    /* compiled from: RoundRobinLoadBalancer */
    private static abstract class C16600e extends C12910l0.C12921i {
        private C16600e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo79444c(C16600e eVar);

        /* synthetic */ C16600e(C16596a aVar) {
            this();
        }
    }

    C16595a(C12910l0.C12915d dVar) {
        this.f67416b = (C12910l0.C12915d) Preconditions.m5393t(dVar, "helper");
        this.f67418d = new Random();
    }

    /* renamed from: g */
    private static List<C12910l0.C12920h> m98880g(Collection<C12910l0.C12920h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C12910l0.C12920h next : collection) {
            if (m98882j(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static C16599d<C12929o> m98881h(C12910l0.C12920h hVar) {
        return (C16599d) Preconditions.m5393t(hVar.mo69337c().mo69026b(f67414g), "STATE_INFO");
    }

    /* renamed from: j */
    static boolean m98882j(C12910l0.C12920h hVar) {
        return ((C12929o) m98881h(hVar).f67427a).mo69706c() == C12926n.READY;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m98883k(C12910l0.C12920h hVar, C12929o oVar) {
        if (this.f67417c.get(m98886n(hVar.mo69696a())) == hVar) {
            if (oVar.mo69706c() == C12926n.IDLE) {
                hVar.mo69339e();
            }
            m98881h(hVar).f67427a = oVar;
            m98888p();
        }
    }

    /* renamed from: l */
    private static <T> Set<T> m98884l(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* renamed from: m */
    private void m98885m(C12910l0.C12920h hVar) {
        hVar.mo69340f();
        m98881h(hVar).f67427a = C12929o.m84945a(C12926n.SHUTDOWN);
    }

    /* renamed from: n */
    private static C13005w m98886n(C13005w wVar) {
        return new C13005w(wVar.mo69861a());
    }

    /* renamed from: o */
    private static Map<C13005w, C13005w> m98887o(List<C13005w> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (C13005w next : list) {
            hashMap.put(m98886n(next), next);
        }
        return hashMap;
    }

    /* renamed from: p */
    private void m98888p() {
        List<C12910l0.C12920h> g = m98880g(mo79443i());
        if (g.isEmpty()) {
            boolean z = false;
            C12537b1 b1Var = f67415h;
            for (C12910l0.C12920h h : mo79443i()) {
                C12929o oVar = (C12929o) m98881h(h).f67427a;
                if (oVar.mo69706c() == C12926n.CONNECTING || oVar.mo69706c() == C12926n.IDLE) {
                    z = true;
                }
                if (b1Var == f67415h || !b1Var.mo69064o()) {
                    b1Var = oVar.mo69707d();
                }
            }
            m98889q(z ? C12926n.CONNECTING : C12926n.TRANSIENT_FAILURE, new C16597b(b1Var));
            return;
        }
        m98889q(C12926n.READY, new C16598c(g, this.f67418d.nextInt(g.size())));
    }

    /* renamed from: q */
    private void m98889q(C12926n nVar, C16600e eVar) {
        if (nVar != this.f67419e || !eVar.mo79444c(this.f67420f)) {
            this.f67416b.mo69308d(nVar, eVar);
            this.f67419e = nVar;
            this.f67420f = eVar;
        }
    }

    /* renamed from: b */
    public void mo69427b(C12537b1 b1Var) {
        C12926n nVar = C12926n.TRANSIENT_FAILURE;
        C16600e eVar = this.f67420f;
        if (!(eVar instanceof C16598c)) {
            eVar = new C16597b(b1Var);
        }
        m98889q(nVar, eVar);
    }

    /* renamed from: c */
    public void mo69428c(C12910l0.C12918g gVar) {
        List<C13005w> a = gVar.mo69686a();
        Set<C13005w> keySet = this.f67417c.keySet();
        Map<C13005w, C13005w> o = m98887o(a);
        Set<T> l = m98884l(keySet, o.keySet());
        for (Map.Entry next : o.entrySet()) {
            C13005w wVar = (C13005w) next.getKey();
            C13005w wVar2 = (C13005w) next.getValue();
            C12910l0.C12920h hVar = this.f67417c.get(wVar);
            if (hVar != null) {
                hVar.mo69342h(Collections.singletonList(wVar2));
            } else {
                C12910l0.C12920h hVar2 = (C12910l0.C12920h) Preconditions.m5393t(this.f67416b.mo69305a(C12910l0.C12912b.m84887c().mo69676b(wVar2).mo69678d(C12520a.m83640c().mo69033d(f67414g, new C16599d(C12929o.m84945a(C12926n.IDLE))).mo69031a()).mo69675a()), "subchannel");
                hVar2.mo69341g(new C16596a(hVar2));
                this.f67417c.put(wVar, hVar2);
                hVar2.mo69339e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T remove : l) {
            arrayList.add(this.f67417c.remove(remove));
        }
        m98888p();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m98885m((C12910l0.C12920h) it.next());
        }
    }

    /* renamed from: e */
    public void mo69429e() {
        for (C12910l0.C12920h m : mo79443i()) {
            m98885m(m);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: i */
    public Collection<C12910l0.C12920h> mo79443i() {
        return this.f67417c.values();
    }
}
