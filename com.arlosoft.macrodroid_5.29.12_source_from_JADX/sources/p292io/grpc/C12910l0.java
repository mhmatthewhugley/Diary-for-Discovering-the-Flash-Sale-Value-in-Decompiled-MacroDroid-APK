package p292io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p292io.grpc.C12520a;
import p292io.grpc.C12900j;

/* renamed from: io.grpc.l0 */
/* compiled from: LoadBalancer */
public abstract class C12910l0 {
    @Deprecated

    /* renamed from: a */
    public static final C12520a.C12523c<Map<String, ?>> f60452a = C12520a.C12523c.m83647a("io.grpc.LoadBalancer.loadBalancingConfig");

    /* renamed from: io.grpc.l0$b */
    /* compiled from: LoadBalancer */
    public static final class C12912b {

        /* renamed from: a */
        private final List<C13005w> f60453a;

        /* renamed from: b */
        private final C12520a f60454b;

        /* renamed from: c */
        private final Object[][] f60455c;

        /* renamed from: io.grpc.l0$b$a */
        /* compiled from: LoadBalancer */
        public static final class C12913a {

            /* renamed from: a */
            private List<C13005w> f60456a;

            /* renamed from: b */
            private C12520a f60457b = C12520a.f59384b;

            /* renamed from: c */
            private Object[][] f60458c = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

            C12913a() {
            }

            /* renamed from: a */
            public C12912b mo69675a() {
                return new C12912b(this.f60456a, this.f60457b, this.f60458c);
            }

            /* renamed from: b */
            public C12913a mo69676b(C13005w wVar) {
                this.f60456a = Collections.singletonList(wVar);
                return this;
            }

            /* renamed from: c */
            public C12913a mo69677c(List<C13005w> list) {
                Preconditions.m5378e(!list.isEmpty(), "addrs is empty");
                this.f60456a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* renamed from: d */
            public C12913a mo69678d(C12520a aVar) {
                this.f60457b = (C12520a) Preconditions.m5393t(aVar, "attrs");
                return this;
            }
        }

        /* renamed from: c */
        public static C12913a m84887c() {
            return new C12913a();
        }

        /* renamed from: a */
        public List<C13005w> mo69672a() {
            return this.f60453a;
        }

        /* renamed from: b */
        public C12520a mo69673b() {
            return this.f60454b;
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("addrs", this.f60453a).mo22194d("attrs", this.f60454b).mo22194d("customOptions", Arrays.deepToString(this.f60455c)).toString();
        }

        private C12912b(List<C13005w> list, C12520a aVar, Object[][] objArr) {
            this.f60453a = (List) Preconditions.m5393t(list, "addresses are not set");
            this.f60454b = (C12520a) Preconditions.m5393t(aVar, "attrs");
            this.f60455c = (Object[][]) Preconditions.m5393t(objArr, "customOptions");
        }
    }

    /* renamed from: io.grpc.l0$c */
    /* compiled from: LoadBalancer */
    public static abstract class C12914c {
        /* renamed from: a */
        public abstract C12910l0 mo69515a(C12915d dVar);
    }

    /* renamed from: io.grpc.l0$d */
    /* compiled from: LoadBalancer */
    public static abstract class C12915d {
        /* renamed from: a */
        public C12920h mo69305a(C12912b bVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C12554e mo69306b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public C12550d1 mo69307c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public abstract void mo69308d(C12926n nVar, C12921i iVar);
    }

    /* renamed from: io.grpc.l0$e */
    /* compiled from: LoadBalancer */
    public static final class C12916e {

        /* renamed from: e */
        private static final C12916e f60459e = new C12916e((C12920h) null, (C12900j.C12901a) null, C12537b1.f59407f, false);

        /* renamed from: a */
        private final C12920h f60460a;

        /* renamed from: b */
        private final C12900j.C12901a f60461b;

        /* renamed from: c */
        private final C12537b1 f60462c;

        /* renamed from: d */
        private final boolean f60463d;

        private C12916e(C12920h hVar, C12900j.C12901a aVar, C12537b1 b1Var, boolean z) {
            this.f60460a = hVar;
            this.f60461b = aVar;
            this.f60462c = (C12537b1) Preconditions.m5393t(b1Var, NotificationCompat.CATEGORY_STATUS);
            this.f60463d = z;
        }

        /* renamed from: e */
        public static C12916e m84899e(C12537b1 b1Var) {
            Preconditions.m5378e(!b1Var.mo69064o(), "drop status shouldn't be OK");
            return new C12916e((C12920h) null, (C12900j.C12901a) null, b1Var, true);
        }

        /* renamed from: f */
        public static C12916e m84900f(C12537b1 b1Var) {
            Preconditions.m5378e(!b1Var.mo69064o(), "error status shouldn't be OK");
            return new C12916e((C12920h) null, (C12900j.C12901a) null, b1Var, false);
        }

        /* renamed from: g */
        public static C12916e m84901g() {
            return f60459e;
        }

        /* renamed from: h */
        public static C12916e m84902h(C12920h hVar) {
            return m84903i(hVar, (C12900j.C12901a) null);
        }

        /* renamed from: i */
        public static C12916e m84903i(C12920h hVar, C12900j.C12901a aVar) {
            return new C12916e((C12920h) Preconditions.m5393t(hVar, "subchannel"), aVar, C12537b1.f59407f, false);
        }

        /* renamed from: a */
        public C12537b1 mo69679a() {
            return this.f60462c;
        }

        /* renamed from: b */
        public C12900j.C12901a mo69680b() {
            return this.f60461b;
        }

        /* renamed from: c */
        public C12920h mo69681c() {
            return this.f60460a;
        }

        /* renamed from: d */
        public boolean mo69682d() {
            return this.f60463d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12916e)) {
                return false;
            }
            C12916e eVar = (C12916e) obj;
            if (!Objects.m5349a(this.f60460a, eVar.f60460a) || !Objects.m5349a(this.f60462c, eVar.f60462c) || !Objects.m5349a(this.f60461b, eVar.f60461b) || this.f60463d != eVar.f60463d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f60460a, this.f60462c, this.f60461b, Boolean.valueOf(this.f60463d));
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("subchannel", this.f60460a).mo22194d("streamTracerFactory", this.f60461b).mo22194d(NotificationCompat.CATEGORY_STATUS, this.f60462c).mo22195e("drop", this.f60463d).toString();
        }
    }

    /* renamed from: io.grpc.l0$f */
    /* compiled from: LoadBalancer */
    public static abstract class C12917f {
        /* renamed from: a */
        public abstract C12542c mo69524a();

        /* renamed from: b */
        public abstract C12960q0 mo69525b();

        /* renamed from: c */
        public abstract C12972r0<?, ?> mo69526c();
    }

    /* renamed from: io.grpc.l0$g */
    /* compiled from: LoadBalancer */
    public static final class C12918g {

        /* renamed from: a */
        private final List<C13005w> f60464a;

        /* renamed from: b */
        private final C12520a f60465b;

        /* renamed from: c */
        private final Object f60466c;

        /* renamed from: io.grpc.l0$g$a */
        /* compiled from: LoadBalancer */
        public static final class C12919a {

            /* renamed from: a */
            private List<C13005w> f60467a;

            /* renamed from: b */
            private C12520a f60468b = C12520a.f59384b;

            /* renamed from: c */
            private Object f60469c;

            C12919a() {
            }

            /* renamed from: a */
            public C12918g mo69692a() {
                return new C12918g(this.f60467a, this.f60468b, this.f60469c);
            }

            /* renamed from: b */
            public C12919a mo69693b(List<C13005w> list) {
                this.f60467a = list;
                return this;
            }

            /* renamed from: c */
            public C12919a mo69694c(C12520a aVar) {
                this.f60468b = aVar;
                return this;
            }

            /* renamed from: d */
            public C12919a mo69695d(Object obj) {
                this.f60469c = obj;
                return this;
            }
        }

        /* renamed from: d */
        public static C12919a m84911d() {
            return new C12919a();
        }

        /* renamed from: a */
        public List<C13005w> mo69686a() {
            return this.f60464a;
        }

        /* renamed from: b */
        public C12520a mo69687b() {
            return this.f60465b;
        }

        /* renamed from: c */
        public Object mo69688c() {
            return this.f60466c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12918g)) {
                return false;
            }
            C12918g gVar = (C12918g) obj;
            if (!Objects.m5349a(this.f60464a, gVar.f60464a) || !Objects.m5349a(this.f60465b, gVar.f60465b) || !Objects.m5349a(this.f60466c, gVar.f60466c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f60464a, this.f60465b, this.f60466c);
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("addresses", this.f60464a).mo22194d("attributes", this.f60465b).mo22194d("loadBalancingPolicyConfig", this.f60466c).toString();
        }

        private C12918g(List<C13005w> list, C12520a aVar, Object obj) {
            this.f60464a = Collections.unmodifiableList(new ArrayList((Collection) Preconditions.m5393t(list, "addresses")));
            this.f60465b = (C12520a) Preconditions.m5393t(aVar, "attributes");
            this.f60466c = obj;
        }
    }

    /* renamed from: io.grpc.l0$h */
    /* compiled from: LoadBalancer */
    public static abstract class C12920h {
        /* renamed from: a */
        public final C13005w mo69696a() {
            List<C13005w> b = mo69336b();
            boolean z = true;
            if (b.size() != 1) {
                z = false;
            }
            Preconditions.m5372C(z, "%s does not have exactly one group", b);
            return b.get(0);
        }

        /* renamed from: b */
        public List<C13005w> mo69336b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract C12520a mo69337c();

        /* renamed from: d */
        public Object mo69338d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo69339e();

        /* renamed from: f */
        public abstract void mo69340f();

        /* renamed from: g */
        public void mo69341g(C12922j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: h */
        public void mo69342h(List<C13005w> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: io.grpc.l0$i */
    /* compiled from: LoadBalancer */
    public static abstract class C12921i {
        /* renamed from: a */
        public abstract C12916e mo69281a(C12917f fVar);

        @Deprecated
        /* renamed from: b */
        public void mo69697b() {
        }
    }

    /* renamed from: io.grpc.l0$j */
    /* compiled from: LoadBalancer */
    public interface C12922j {
        /* renamed from: a */
        void mo69497a(C12929o oVar);
    }

    /* renamed from: a */
    public boolean mo69671a() {
        return false;
    }

    /* renamed from: b */
    public abstract void mo69427b(C12537b1 b1Var);

    /* renamed from: c */
    public abstract void mo69428c(C12918g gVar);

    /* renamed from: d */
    public void mo69496d() {
    }

    /* renamed from: e */
    public abstract void mo69429e();
}
