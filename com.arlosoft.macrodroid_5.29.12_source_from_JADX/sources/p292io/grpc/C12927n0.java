package p292io.grpc;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12527a1;
import p292io.grpc.internal.C12780p1;
import p396t9.C16601b;

/* renamed from: io.grpc.n0 */
/* compiled from: LoadBalancerRegistry */
public final class C12927n0 {

    /* renamed from: c */
    private static final Logger f60479c = Logger.getLogger(C12927n0.class.getName());

    /* renamed from: d */
    private static C12927n0 f60480d;

    /* renamed from: e */
    private static final Iterable<Class<?>> f60481e = m84938c();

    /* renamed from: a */
    private final LinkedHashSet<C12924m0> f60482a = new LinkedHashSet<>();

    /* renamed from: b */
    private final LinkedHashMap<String, C12924m0> f60483b = new LinkedHashMap<>();

    /* renamed from: io.grpc.n0$a */
    /* compiled from: LoadBalancerRegistry */
    private static final class C12928a implements C12527a1.C12529b<C12924m0> {
        C12928a() {
        }

        /* renamed from: c */
        public int mo69018b(C12924m0 m0Var) {
            return m0Var.mo69517c();
        }

        /* renamed from: d */
        public boolean mo69017a(C12924m0 m0Var) {
            return m0Var.mo69518d();
        }
    }

    /* renamed from: a */
    private synchronized void m84936a(C12924m0 m0Var) {
        Preconditions.m5378e(m0Var.mo69518d(), "isAvailable() returned false");
        this.f60482a.add(m0Var);
    }

    /* renamed from: b */
    public static synchronized C12927n0 m84937b() {
        C12927n0 n0Var;
        Class<C12924m0> cls = C12924m0.class;
        synchronized (C12927n0.class) {
            if (f60480d == null) {
                List<Class<?>> f = C12527a1.m83662f(cls, f60481e, cls.getClassLoader(), new C12928a());
                f60480d = new C12927n0();
                Iterator<Class<?>> it = f.iterator();
                while (it.hasNext()) {
                    C12924m0 m0Var = (C12924m0) it.next();
                    Logger logger = f60479c;
                    logger.fine("Service loader found " + m0Var);
                    if (m0Var.mo69518d()) {
                        f60480d.m84936a(m0Var);
                    }
                }
                f60480d.m84939e();
            }
            n0Var = f60480d;
        }
        return n0Var;
    }

    @VisibleForTesting
    /* renamed from: c */
    static List<Class<?>> m84938c() {
        ArrayList arrayList = new ArrayList();
        Class<C12780p1> cls = C12780p1.class;
        try {
            int i = C12780p1.f60153b;
            arrayList.add(cls);
        } catch (ClassNotFoundException e) {
            f60479c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", e);
        }
        Class<C16601b> cls2 = C16601b.class;
        try {
            int i2 = C16601b.f67428b;
            arrayList.add(cls2);
        } catch (ClassNotFoundException e2) {
            f60479c.log(Level.FINE, "Unable to find round-robin LoadBalancer", e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private synchronized void m84939e() {
        this.f60483b.clear();
        Iterator it = this.f60482a.iterator();
        while (it.hasNext()) {
            C12924m0 m0Var = (C12924m0) it.next();
            String b = m0Var.mo69516b();
            C12924m0 m0Var2 = this.f60483b.get(b);
            if (m0Var2 == null || m0Var2.mo69517c() < m0Var.mo69517c()) {
                this.f60483b.put(b, m0Var);
            }
        }
    }

    /* renamed from: d */
    public synchronized C12924m0 mo69703d(String str) {
        return this.f60483b.get(Preconditions.m5393t(str, "policy"));
    }
}
