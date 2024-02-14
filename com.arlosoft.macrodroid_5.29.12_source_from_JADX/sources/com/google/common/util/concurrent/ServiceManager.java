package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ServiceManager implements ServiceManagerBridge {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f53661b = Logger.getLogger(ServiceManager.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ListenerCallQueue.Event<Listener> f53662c = new ListenerCallQueue.Event<Listener>() {
        /* renamed from: b */
        public void mo61626a(Listener listener) {
            listener.mo61900b();
        }

        public String toString() {
            return "healthy()";
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ListenerCallQueue.Event<Listener> f53663d = new ListenerCallQueue.Event<Listener>() {
        /* renamed from: b */
        public void mo61626a(Listener listener) {
            listener.mo61901c();
        }

        public String toString() {
            return "stopped()";
        }
    };

    /* renamed from: a */
    private final ImmutableList<Service> f53664a;

    private static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }
    }

    public static abstract class Listener {
        /* renamed from: a */
        public void mo61899a(Service service) {
        }

        /* renamed from: b */
        public void mo61900b() {
        }

        /* renamed from: c */
        public void mo61901c() {
        }
    }

    private static final class NoOpService extends AbstractService {
        private NoOpService() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo61557d() {
            mo61625k();
        }
    }

    private static final class ServiceListener extends Service.Listener {

        /* renamed from: a */
        final Service f53665a;

        /* renamed from: b */
        final WeakReference<ServiceManagerState> f53666b;

        /* renamed from: a */
        public void mo61608a(Service.State state, Throwable th) {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f53666b.get();
            if (serviceManagerState != null) {
                if (!(this.f53665a instanceof NoOpService)) {
                    Logger a = ServiceManager.f53661b;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(this.f53665a);
                    String valueOf2 = String.valueOf(state);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 34 + valueOf2.length());
                    sb.append("Service ");
                    sb.append(valueOf);
                    sb.append(" has failed in the ");
                    sb.append(valueOf2);
                    sb.append(" state.");
                    a.log(level, sb.toString(), th);
                }
                serviceManagerState.mo61906e(this.f53665a, state, Service.State.FAILED);
            }
        }

        /* renamed from: b */
        public void mo61891b() {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f53666b.get();
            if (serviceManagerState != null) {
                serviceManagerState.mo61906e(this.f53665a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        /* renamed from: c */
        public void mo61892c() {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f53666b.get();
            if (serviceManagerState != null) {
                serviceManagerState.mo61906e(this.f53665a, Service.State.NEW, Service.State.STARTING);
                if (!(this.f53665a instanceof NoOpService)) {
                    ServiceManager.f53661b.log(Level.FINE, "Starting {0}.", this.f53665a);
                }
            }
        }

        /* renamed from: d */
        public void mo61893d(Service.State state) {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f53666b.get();
            if (serviceManagerState != null) {
                serviceManagerState.mo61906e(this.f53665a, state, Service.State.STOPPING);
            }
        }

        /* renamed from: e */
        public void mo61609e(Service.State state) {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f53666b.get();
            if (serviceManagerState != null) {
                if (!(this.f53665a instanceof NoOpService)) {
                    ServiceManager.f53661b.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f53665a, state});
                }
                serviceManagerState.mo61906e(this.f53665a, state, Service.State.TERMINATED);
            }
        }
    }

    private static final class ServiceManagerState {

        /* renamed from: a */
        final Monitor f53667a;
        @GuardedBy

        /* renamed from: b */
        final SetMultimap<Service.State, Service> f53668b;
        @GuardedBy

        /* renamed from: c */
        final Multiset<Service.State> f53669c;
        @GuardedBy

        /* renamed from: d */
        final Map<Service, Stopwatch> f53670d;
        @GuardedBy

        /* renamed from: e */
        boolean f53671e;
        @GuardedBy

        /* renamed from: f */
        boolean f53672f;

        /* renamed from: g */
        final int f53673g;

        /* renamed from: h */
        final ListenerCallQueue<Listener> f53674h;

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1 */
        class C110201 implements Function<Map.Entry<Service, Long>, Long> {
            /* renamed from: a */
            public Long apply(Map.Entry<Service, Long> entry) {
                return entry.getValue();
            }
        }

        final class AwaitHealthGuard extends Monitor.Guard {

            /* renamed from: e */
            final /* synthetic */ ServiceManagerState f53676e;

            @GuardedBy
            /* renamed from: a */
            public boolean mo61637a() {
                int J1 = this.f53676e.f53669c.mo34601J1(Service.State.RUNNING);
                ServiceManagerState serviceManagerState = this.f53676e;
                return J1 == serviceManagerState.f53673g || serviceManagerState.f53669c.contains(Service.State.STOPPING) || this.f53676e.f53669c.contains(Service.State.TERMINATED) || this.f53676e.f53669c.contains(Service.State.FAILED);
            }
        }

        final class StoppedGuard extends Monitor.Guard {

            /* renamed from: e */
            final /* synthetic */ ServiceManagerState f53677e;

            @GuardedBy
            /* renamed from: a */
            public boolean mo61637a() {
                return this.f53677e.f53669c.mo34601J1(Service.State.TERMINATED) + this.f53677e.f53669c.mo34601J1(Service.State.FAILED) == this.f53677e.f53673g;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61902a() {
            Preconditions.m5399z(!this.f53667a.mo61848c(), "It is incorrect to execute listeners with the monitor held.");
            this.f53674h.mo61842b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo61903b(final Service service) {
            this.f53674h.mo61843c(new ListenerCallQueue.Event<Listener>(this) {
                /* renamed from: b */
                public void mo61626a(Listener listener) {
                    listener.mo61899a(service);
                }

                public String toString() {
                    String valueOf = String.valueOf(service);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("failed({service=");
                    sb.append(valueOf);
                    sb.append("})");
                    return sb.toString();
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo61904c() {
            this.f53674h.mo61843c(ServiceManager.f53662c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo61905d() {
            this.f53674h.mo61843c(ServiceManager.f53663d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo61906e(Service service, Service.State state, Service.State state2) {
            Preconditions.m5392s(service);
            Preconditions.m5377d(state != state2);
            this.f53667a.mo61847b();
            try {
                this.f53672f = true;
                if (this.f53671e) {
                    Preconditions.m5373D(this.f53668b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                    Preconditions.m5373D(this.f53668b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                    Stopwatch stopwatch = this.f53670d.get(service);
                    if (stopwatch == null) {
                        stopwatch = Stopwatch.m5463c();
                        this.f53670d.put(service, stopwatch);
                    }
                    Service.State state3 = Service.State.RUNNING;
                    if (state2.compareTo(state3) >= 0 && stopwatch.mo22253g()) {
                        stopwatch.mo22256j();
                        if (!(service instanceof NoOpService)) {
                            ServiceManager.f53661b.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, stopwatch});
                        }
                    }
                    Service.State state4 = Service.State.FAILED;
                    if (state2 == state4) {
                        mo61903b(service);
                    }
                    if (this.f53669c.mo34601J1(state3) == this.f53673g) {
                        mo61904c();
                    } else if (this.f53669c.mo34601J1(Service.State.TERMINATED) + this.f53669c.mo34601J1(state4) == this.f53673g) {
                        mo61905d();
                    }
                    this.f53667a.mo61849e();
                    mo61902a();
                }
            } finally {
                this.f53667a.mo61849e();
                mo61902a();
            }
        }
    }

    public String toString() {
        return MoreObjects.m5333b(ServiceManager.class).mo22194d("services", Collections2.m26542d(this.f53664a, Predicates.m5409j(Predicates.m5407h(NoOpService.class)))).toString();
    }
}
