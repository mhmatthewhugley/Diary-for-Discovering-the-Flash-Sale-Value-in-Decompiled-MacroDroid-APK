package p292io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p292io.grpc.C12520a;

/* renamed from: io.grpc.s0 */
/* compiled from: NameResolver */
public abstract class C12981s0 {

    /* renamed from: io.grpc.s0$a */
    /* compiled from: NameResolver */
    class C12982a extends C12990f {

        /* renamed from: a */
        final /* synthetic */ C12991g f60711a;

        C12982a(C12991g gVar) {
            this.f60711a = gVar;
        }

        /* renamed from: a */
        public void mo69311a(C12537b1 b1Var) {
            this.f60711a.mo69311a(b1Var);
        }

        /* renamed from: c */
        public void mo69312c(C12992h hVar) {
            this.f60711a.mo69838b(hVar.mo69839a(), hVar.mo69840b());
        }
    }

    /* renamed from: io.grpc.s0$b */
    /* compiled from: NameResolver */
    public static final class C12983b {

        /* renamed from: a */
        private final int f60713a;

        /* renamed from: b */
        private final C13011y0 f60714b;

        /* renamed from: c */
        private final C12550d1 f60715c;

        /* renamed from: d */
        private final C12994i f60716d;

        /* renamed from: e */
        private final ScheduledExecutorService f60717e;

        /* renamed from: f */
        private final C12554e f60718f;

        /* renamed from: g */
        private final Executor f60719g;

        /* renamed from: io.grpc.s0$b$a */
        /* compiled from: NameResolver */
        public static final class C12984a {

            /* renamed from: a */
            private Integer f60720a;

            /* renamed from: b */
            private C13011y0 f60721b;

            /* renamed from: c */
            private C12550d1 f60722c;

            /* renamed from: d */
            private C12994i f60723d;

            /* renamed from: e */
            private ScheduledExecutorService f60724e;

            /* renamed from: f */
            private C12554e f60725f;

            /* renamed from: g */
            private Executor f60726g;

            C12984a() {
            }

            /* renamed from: a */
            public C12983b mo69819a() {
                return new C12983b(this.f60720a, this.f60721b, this.f60722c, this.f60723d, this.f60724e, this.f60725f, this.f60726g, (C12982a) null);
            }

            /* renamed from: b */
            public C12984a mo69820b(C12554e eVar) {
                this.f60725f = (C12554e) Preconditions.m5392s(eVar);
                return this;
            }

            /* renamed from: c */
            public C12984a mo69821c(int i) {
                this.f60720a = Integer.valueOf(i);
                return this;
            }

            /* renamed from: d */
            public C12984a mo69822d(Executor executor) {
                this.f60726g = executor;
                return this;
            }

            /* renamed from: e */
            public C12984a mo69823e(C13011y0 y0Var) {
                this.f60721b = (C13011y0) Preconditions.m5392s(y0Var);
                return this;
            }

            /* renamed from: f */
            public C12984a mo69824f(ScheduledExecutorService scheduledExecutorService) {
                this.f60724e = (ScheduledExecutorService) Preconditions.m5392s(scheduledExecutorService);
                return this;
            }

            /* renamed from: g */
            public C12984a mo69825g(C12994i iVar) {
                this.f60723d = (C12994i) Preconditions.m5392s(iVar);
                return this;
            }

            /* renamed from: h */
            public C12984a mo69826h(C12550d1 d1Var) {
                this.f60722c = (C12550d1) Preconditions.m5392s(d1Var);
                return this;
            }
        }

        /* synthetic */ C12983b(Integer num, C13011y0 y0Var, C12550d1 d1Var, C12994i iVar, ScheduledExecutorService scheduledExecutorService, C12554e eVar, Executor executor, C12982a aVar) {
            this(num, y0Var, d1Var, iVar, scheduledExecutorService, eVar, executor);
        }

        /* renamed from: f */
        public static C12984a m85149f() {
            return new C12984a();
        }

        /* renamed from: a */
        public int mo69813a() {
            return this.f60713a;
        }

        /* renamed from: b */
        public Executor mo69814b() {
            return this.f60719g;
        }

        /* renamed from: c */
        public C13011y0 mo69815c() {
            return this.f60714b;
        }

        /* renamed from: d */
        public C12994i mo69816d() {
            return this.f60716d;
        }

        /* renamed from: e */
        public C12550d1 mo69817e() {
            return this.f60715c;
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22192b("defaultPort", this.f60713a).mo22194d("proxyDetector", this.f60714b).mo22194d("syncContext", this.f60715c).mo22194d("serviceConfigParser", this.f60716d).mo22194d("scheduledExecutorService", this.f60717e).mo22194d("channelLogger", this.f60718f).mo22194d("executor", this.f60719g).toString();
        }

        private C12983b(Integer num, C13011y0 y0Var, C12550d1 d1Var, C12994i iVar, ScheduledExecutorService scheduledExecutorService, C12554e eVar, Executor executor) {
            this.f60713a = ((Integer) Preconditions.m5393t(num, "defaultPort not set")).intValue();
            this.f60714b = (C13011y0) Preconditions.m5393t(y0Var, "proxyDetector not set");
            this.f60715c = (C12550d1) Preconditions.m5393t(d1Var, "syncContext not set");
            this.f60716d = (C12994i) Preconditions.m5393t(iVar, "serviceConfigParser not set");
            this.f60717e = scheduledExecutorService;
            this.f60718f = eVar;
            this.f60719g = executor;
        }
    }

    /* renamed from: io.grpc.s0$d */
    /* compiled from: NameResolver */
    public static abstract class C12986d {
        @Deprecated

        /* renamed from: a */
        public static final C12520a.C12523c<Integer> f60729a = C12520a.C12523c.m83647a("params-default-port");
        @Deprecated

        /* renamed from: b */
        public static final C12520a.C12523c<C13011y0> f60730b = C12520a.C12523c.m83647a("params-proxy-detector");
        @Deprecated

        /* renamed from: c */
        private static final C12520a.C12523c<C12550d1> f60731c = C12520a.C12523c.m83647a("params-sync-context");
        @Deprecated

        /* renamed from: d */
        private static final C12520a.C12523c<C12994i> f60732d = C12520a.C12523c.m83647a("params-parser");

        /* renamed from: io.grpc.s0$d$a */
        /* compiled from: NameResolver */
        class C12987a extends C12994i {

            /* renamed from: a */
            final /* synthetic */ C12989e f60733a;

            C12987a(C12989e eVar) {
                this.f60733a = eVar;
            }

            /* renamed from: a */
            public C12985c mo69332a(Map<String, ?> map) {
                return this.f60733a.mo69837d(map);
            }
        }

        /* renamed from: io.grpc.s0$d$b */
        /* compiled from: NameResolver */
        class C12988b extends C12989e {

            /* renamed from: a */
            final /* synthetic */ C12983b f60735a;

            C12988b(C12983b bVar) {
                this.f60735a = bVar;
            }

            /* renamed from: a */
            public int mo69834a() {
                return this.f60735a.mo69813a();
            }

            /* renamed from: b */
            public C13011y0 mo69835b() {
                return this.f60735a.mo69815c();
            }

            /* renamed from: c */
            public C12550d1 mo69836c() {
                return this.f60735a.mo69817e();
            }

            /* renamed from: d */
            public C12985c mo69837d(Map<String, ?> map) {
                return this.f60735a.mo69816d().mo69332a(map);
            }
        }

        /* renamed from: a */
        public abstract String mo69444a();

        @Deprecated
        /* renamed from: b */
        public C12981s0 mo69832b(URI uri, C12520a aVar) {
            return mo69445c(uri, C12983b.m85149f().mo69821c(((Integer) aVar.mo69026b(f60729a)).intValue()).mo69823e((C13011y0) aVar.mo69026b(f60730b)).mo69826h((C12550d1) aVar.mo69026b(f60731c)).mo69825g((C12994i) aVar.mo69026b(f60732d)).mo69819a());
        }

        /* renamed from: c */
        public C12981s0 mo69445c(URI uri, C12983b bVar) {
            return mo69833d(uri, new C12988b(bVar));
        }

        @Deprecated
        /* renamed from: d */
        public C12981s0 mo69833d(URI uri, C12989e eVar) {
            return mo69832b(uri, C12520a.m83640c().mo69033d(f60729a, Integer.valueOf(eVar.mo69834a())).mo69033d(f60730b, eVar.mo69835b()).mo69033d(f60731c, eVar.mo69836c()).mo69033d(f60732d, new C12987a(eVar)).mo69031a());
        }
    }

    @Deprecated
    /* renamed from: io.grpc.s0$e */
    /* compiled from: NameResolver */
    public static abstract class C12989e {
        /* renamed from: a */
        public abstract int mo69834a();

        /* renamed from: b */
        public abstract C13011y0 mo69835b();

        /* renamed from: c */
        public abstract C12550d1 mo69836c();

        /* renamed from: d */
        public abstract C12985c mo69837d(Map<String, ?> map);
    }

    /* renamed from: io.grpc.s0$f */
    /* compiled from: NameResolver */
    public static abstract class C12990f implements C12991g {
        /* renamed from: a */
        public abstract void mo69311a(C12537b1 b1Var);

        @Deprecated
        /* renamed from: b */
        public final void mo69838b(List<C13005w> list, C12520a aVar) {
            mo69312c(C12992h.m85185d().mo69846b(list).mo69847c(aVar).mo69845a());
        }

        /* renamed from: c */
        public abstract void mo69312c(C12992h hVar);
    }

    /* renamed from: io.grpc.s0$g */
    /* compiled from: NameResolver */
    public interface C12991g {
        /* renamed from: a */
        void mo69311a(C12537b1 b1Var);

        /* renamed from: b */
        void mo69838b(List<C13005w> list, C12520a aVar);
    }

    /* renamed from: io.grpc.s0$h */
    /* compiled from: NameResolver */
    public static final class C12992h {

        /* renamed from: a */
        private final List<C13005w> f60737a;

        /* renamed from: b */
        private final C12520a f60738b;

        /* renamed from: c */
        private final C12985c f60739c;

        /* renamed from: io.grpc.s0$h$a */
        /* compiled from: NameResolver */
        public static final class C12993a {

            /* renamed from: a */
            private List<C13005w> f60740a = Collections.emptyList();

            /* renamed from: b */
            private C12520a f60741b = C12520a.f59384b;

            /* renamed from: c */
            private C12985c f60742c;

            C12993a() {
            }

            /* renamed from: a */
            public C12992h mo69845a() {
                return new C12992h(this.f60740a, this.f60741b, this.f60742c);
            }

            /* renamed from: b */
            public C12993a mo69846b(List<C13005w> list) {
                this.f60740a = list;
                return this;
            }

            /* renamed from: c */
            public C12993a mo69847c(C12520a aVar) {
                this.f60741b = aVar;
                return this;
            }

            /* renamed from: d */
            public C12993a mo69848d(C12985c cVar) {
                this.f60742c = cVar;
                return this;
            }
        }

        C12992h(List<C13005w> list, C12520a aVar, C12985c cVar) {
            this.f60737a = Collections.unmodifiableList(new ArrayList(list));
            this.f60738b = (C12520a) Preconditions.m5393t(aVar, "attributes");
            this.f60739c = cVar;
        }

        /* renamed from: d */
        public static C12993a m85185d() {
            return new C12993a();
        }

        /* renamed from: a */
        public List<C13005w> mo69839a() {
            return this.f60737a;
        }

        /* renamed from: b */
        public C12520a mo69840b() {
            return this.f60738b;
        }

        /* renamed from: c */
        public C12985c mo69841c() {
            return this.f60739c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12992h)) {
                return false;
            }
            C12992h hVar = (C12992h) obj;
            if (!Objects.m5349a(this.f60737a, hVar.f60737a) || !Objects.m5349a(this.f60738b, hVar.f60738b) || !Objects.m5349a(this.f60739c, hVar.f60739c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f60737a, this.f60738b, this.f60739c);
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("addresses", this.f60737a).mo22194d("attributes", this.f60738b).mo22194d("serviceConfig", this.f60739c).toString();
        }
    }

    /* renamed from: io.grpc.s0$i */
    /* compiled from: NameResolver */
    public static abstract class C12994i {
        /* renamed from: a */
        public abstract C12985c mo69332a(Map<String, ?> map);
    }

    /* renamed from: a */
    public abstract String mo69218a();

    /* renamed from: b */
    public void mo69219b() {
    }

    /* renamed from: c */
    public abstract void mo69220c();

    /* renamed from: d */
    public void mo69221d(C12990f fVar) {
        mo69448e(fVar);
    }

    /* renamed from: e */
    public void mo69448e(C12991g gVar) {
        if (gVar instanceof C12990f) {
            mo69221d((C12990f) gVar);
        } else {
            mo69221d(new C12982a(gVar));
        }
    }

    /* renamed from: io.grpc.s0$c */
    /* compiled from: NameResolver */
    public static final class C12985c {

        /* renamed from: a */
        private final C12537b1 f60727a;

        /* renamed from: b */
        private final Object f60728b;

        private C12985c(Object obj) {
            this.f60728b = Preconditions.m5393t(obj, "config");
            this.f60727a = null;
        }

        /* renamed from: a */
        public static C12985c m85163a(Object obj) {
            return new C12985c(obj);
        }

        /* renamed from: b */
        public static C12985c m85164b(C12537b1 b1Var) {
            return new C12985c(b1Var);
        }

        /* renamed from: c */
        public Object mo69827c() {
            return this.f60728b;
        }

        /* renamed from: d */
        public C12537b1 mo69828d() {
            return this.f60727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12985c.class != obj.getClass()) {
                return false;
            }
            C12985c cVar = (C12985c) obj;
            if (!Objects.m5349a(this.f60727a, cVar.f60727a) || !Objects.m5349a(this.f60728b, cVar.f60728b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f60727a, this.f60728b);
        }

        public String toString() {
            if (this.f60728b != null) {
                return MoreObjects.m5334c(this).mo22194d("config", this.f60728b).toString();
            }
            return MoreObjects.m5334c(this).mo22194d("error", this.f60727a).toString();
        }

        private C12985c(C12537b1 b1Var) {
            this.f60728b = null;
            this.f60727a = (C12537b1) Preconditions.m5393t(b1Var, NotificationCompat.CATEGORY_STATUS);
            Preconditions.m5385l(!b1Var.mo69064o(), "cannot use OK status: %s", b1Var);
        }
    }
}
