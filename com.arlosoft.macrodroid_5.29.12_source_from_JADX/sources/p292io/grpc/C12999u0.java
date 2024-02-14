package p292io.grpc;

import androidx.core.p007os.EnvironmentCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12527a1;
import p292io.grpc.C12981s0;
import p292io.grpc.internal.C12615c0;

/* renamed from: io.grpc.u0 */
/* compiled from: NameResolverRegistry */
public final class C12999u0 {

    /* renamed from: d */
    private static final Logger f60750d = Logger.getLogger(C12999u0.class.getName());

    /* renamed from: e */
    private static C12999u0 f60751e;

    /* renamed from: a */
    private final C12981s0.C12986d f60752a = new C13001b(this, (C13000a) null);

    /* renamed from: b */
    private final LinkedHashSet<C12996t0> f60753b = new LinkedHashSet<>();

    /* renamed from: c */
    private List<C12996t0> f60754c = Collections.emptyList();

    /* renamed from: io.grpc.u0$a */
    /* compiled from: NameResolverRegistry */
    class C13000a implements Comparator<C12996t0> {
        C13000a() {
        }

        /* renamed from: a */
        public int compare(C12996t0 t0Var, C12996t0 t0Var2) {
            return t0Var.mo69241f() - t0Var2.mo69241f();
        }
    }

    /* renamed from: io.grpc.u0$b */
    /* compiled from: NameResolverRegistry */
    private final class C13001b extends C12981s0.C12986d {
        private C13001b() {
        }

        /* renamed from: a */
        public String mo69444a() {
            List<C12996t0> e = C12999u0.this.mo69854e();
            if (e.isEmpty()) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return e.get(0).mo69444a();
        }

        /* renamed from: c */
        public C12981s0 mo69445c(URI uri, C12981s0.C12983b bVar) {
            for (C12996t0 c : C12999u0.this.mo69854e()) {
                C12981s0 c2 = c.mo69445c(uri, bVar);
                if (c2 != null) {
                    return c2;
                }
            }
            return null;
        }

        /* synthetic */ C13001b(C12999u0 u0Var, C13000a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.u0$c */
    /* compiled from: NameResolverRegistry */
    private static final class C13002c implements C12527a1.C12529b<C12996t0> {
        private C13002c() {
        }

        /* synthetic */ C13002c(C13000a aVar) {
            this();
        }

        /* renamed from: c */
        public int mo69018b(C12996t0 t0Var) {
            return t0Var.mo69241f();
        }

        /* renamed from: d */
        public boolean mo69017a(C12996t0 t0Var) {
            return t0Var.mo69446e();
        }
    }

    /* renamed from: a */
    private synchronized void m85204a(C12996t0 t0Var) {
        Preconditions.m5378e(t0Var.mo69446e(), "isAvailable() returned false");
        this.f60753b.add(t0Var);
    }

    /* renamed from: c */
    public static synchronized C12999u0 m85205c() {
        C12999u0 u0Var;
        Class<C12996t0> cls = C12996t0.class;
        synchronized (C12999u0.class) {
            if (f60751e == null) {
                List<T> f = C12527a1.m83662f(cls, m85206d(), cls.getClassLoader(), new C13002c((C13000a) null));
                if (f.isEmpty()) {
                    f60750d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f60751e = new C12999u0();
                for (T t : f) {
                    Logger logger = f60750d;
                    logger.fine("Service loader found " + t);
                    if (t.mo69446e()) {
                        f60751e.m85204a(t);
                    }
                }
                f60751e.m85207f();
            }
            u0Var = f60751e;
        }
        return u0Var;
    }

    @VisibleForTesting
    /* renamed from: d */
    static List<Class<?>> m85206d() {
        ArrayList arrayList = new ArrayList();
        Class<C12615c0> cls = C12615c0.class;
        try {
            int i = C12615c0.f59674g;
            arrayList.add(cls);
        } catch (ClassNotFoundException e) {
            f60750d.log(Level.FINE, "Unable to find DNS NameResolver", e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    private synchronized void m85207f() {
        ArrayList arrayList = new ArrayList(this.f60753b);
        Collections.sort(arrayList, Collections.reverseOrder(new C13000a()));
        this.f60754c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public C12981s0.C12986d mo69853b() {
        return this.f60752a;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public synchronized List<C12996t0> mo69854e() {
        return this.f60754c;
    }
}
