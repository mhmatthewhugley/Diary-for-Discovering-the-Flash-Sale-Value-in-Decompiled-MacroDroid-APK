package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.ForOverride;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractService implements Service {

    /* renamed from: h */
    private static final ListenerCallQueue.Event<Service.Listener> f53419h = new ListenerCallQueue.Event<Service.Listener>() {
        /* renamed from: b */
        public void mo61626a(Service.Listener listener) {
            listener.mo61892c();
        }

        public String toString() {
            return "starting()";
        }
    };

    /* renamed from: i */
    private static final ListenerCallQueue.Event<Service.Listener> f53420i = new ListenerCallQueue.Event<Service.Listener>() {
        /* renamed from: b */
        public void mo61626a(Service.Listener listener) {
            listener.mo61891b();
        }

        public String toString() {
            return "running()";
        }
    };

    /* renamed from: j */
    private static final ListenerCallQueue.Event<Service.Listener> f53421j;

    /* renamed from: k */
    private static final ListenerCallQueue.Event<Service.Listener> f53422k;

    /* renamed from: l */
    private static final ListenerCallQueue.Event<Service.Listener> f53423l = m74009m(Service.State.NEW);

    /* renamed from: m */
    private static final ListenerCallQueue.Event<Service.Listener> f53424m;

    /* renamed from: n */
    private static final ListenerCallQueue.Event<Service.Listener> f53425n;

    /* renamed from: o */
    private static final ListenerCallQueue.Event<Service.Listener> f53426o = m74009m(Service.State.STOPPING);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Monitor f53427a = new Monitor();

    /* renamed from: b */
    private final Monitor.Guard f53428b = new IsStartableGuard();

    /* renamed from: c */
    private final Monitor.Guard f53429c = new IsStoppableGuard();

    /* renamed from: d */
    private final Monitor.Guard f53430d = new HasReachedRunningGuard();

    /* renamed from: e */
    private final Monitor.Guard f53431e = new IsStoppedGuard();

    /* renamed from: f */
    private final ListenerCallQueue<Service.Listener> f53432f = new ListenerCallQueue<>();

    /* renamed from: g */
    private volatile StateSnapshot f53433g = new StateSnapshot(Service.State.NEW);

    /* renamed from: com.google.common.util.concurrent.AbstractService$6 */
    static /* synthetic */ class C109716 {

        /* renamed from: a */
        static final /* synthetic */ int[] f53438a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53438a = r0
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53438a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53438a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53438a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53438a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f53438a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractService.C109716.<clinit>():void");
        }
    }

    private final class HasReachedRunningGuard extends Monitor.Guard {
        HasReachedRunningGuard() {
            super(AbstractService.this.f53427a);
        }

        /* renamed from: a */
        public boolean mo61637a() {
            return AbstractService.this.mo61550a().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    private final class IsStartableGuard extends Monitor.Guard {
        IsStartableGuard() {
            super(AbstractService.this.f53427a);
        }

        /* renamed from: a */
        public boolean mo61637a() {
            return AbstractService.this.mo61550a() == Service.State.NEW;
        }
    }

    private final class IsStoppableGuard extends Monitor.Guard {
        IsStoppableGuard() {
            super(AbstractService.this.f53427a);
        }

        /* renamed from: a */
        public boolean mo61637a() {
            return AbstractService.this.mo61550a().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    private final class IsStoppedGuard extends Monitor.Guard {
        IsStoppedGuard() {
            super(AbstractService.this.f53427a);
        }

        /* renamed from: a */
        public boolean mo61637a() {
            return AbstractService.this.mo61550a().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    private static final class StateSnapshot {

        /* renamed from: a */
        final Service.State f53443a;

        /* renamed from: b */
        final boolean f53444b;

        /* renamed from: c */
        final Throwable f53445c;

        StateSnapshot(Service.State state) {
            this(state, false, (Throwable) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Service.State mo61638a() {
            if (!this.f53444b || this.f53443a != Service.State.STARTING) {
                return this.f53443a;
            }
            return Service.State.STOPPING;
        }

        StateSnapshot(Service.State state, boolean z, Throwable th) {
            boolean z2 = false;
            Preconditions.m5385l(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.m5387n((th != null) == (state == Service.State.FAILED) ? true : z2, "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.f53443a = state;
            this.f53444b = z;
            this.f53445c = th;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f53421j = m74008l(state);
        Service.State state2 = Service.State.RUNNING;
        f53422k = m74008l(state2);
        f53424m = m74009m(state);
        f53425n = m74009m(state2);
    }

    protected AbstractService() {
    }

    /* renamed from: c */
    private void m74004c() {
        if (!this.f53427a.mo61848c()) {
            this.f53432f.mo61842b();
        }
    }

    /* renamed from: e */
    private void m74005e(final Service.State state, final Throwable th) {
        this.f53432f.mo61843c(new ListenerCallQueue.Event<Service.Listener>(this) {
            /* renamed from: b */
            public void mo61626a(Service.Listener listener) {
                listener.mo61608a(state, th);
            }

            public String toString() {
                String valueOf = String.valueOf(state);
                String valueOf2 = String.valueOf(th);
                StringBuilder sb = new StringBuilder(valueOf.length() + 27 + valueOf2.length());
                sb.append("failed({from = ");
                sb.append(valueOf);
                sb.append(", cause = ");
                sb.append(valueOf2);
                sb.append("})");
                return sb.toString();
            }
        });
    }

    /* renamed from: f */
    private void m74006f() {
        this.f53432f.mo61843c(f53420i);
    }

    /* renamed from: g */
    private void m74007g(Service.State state) {
        switch (C109716.f53438a[state.ordinal()]) {
            case 1:
                this.f53432f.mo61843c(f53423l);
                return;
            case 2:
                this.f53432f.mo61843c(f53424m);
                return;
            case 3:
                this.f53432f.mo61843c(f53425n);
                return;
            case 4:
                this.f53432f.mo61843c(f53426o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    /* renamed from: l */
    private static ListenerCallQueue.Event<Service.Listener> m74008l(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() {
            /* renamed from: b */
            public void mo61626a(Service.Listener listener) {
                listener.mo61893d(Service.State.this);
            }

            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("stopping({from = ");
                sb.append(valueOf);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    /* renamed from: m */
    private static ListenerCallQueue.Event<Service.Listener> m74009m(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() {
            /* renamed from: b */
            public void mo61626a(Service.Listener listener) {
                listener.mo61609e(Service.State.this);
            }

            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("terminated({from = ");
                sb.append(valueOf);
                sb.append("})");
                return sb.toString();
            }
        };
    }

    /* renamed from: a */
    public final Service.State mo61550a() {
        return this.f53433g.mo61638a();
    }

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: d */
    public abstract void mo61557d();

    /* renamed from: h */
    public final boolean mo61622h() {
        return mo61550a() == Service.State.RUNNING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo61623i(Throwable th) {
        Preconditions.m5392s(th);
        this.f53427a.mo61847b();
        try {
            Service.State a = mo61550a();
            int i = C109716.f53438a[a.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.f53433g = new StateSnapshot(Service.State.FAILED, false, th);
                    m74005e(a, th);
                } else if (i != 5) {
                }
                return;
            }
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Failed while in state:");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), th);
        } finally {
            this.f53427a.mo61849e();
            m74004c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo61624j() {
        this.f53427a.mo61847b();
        try {
            if (this.f53433g.f53443a == Service.State.STARTING) {
                if (this.f53433g.f53444b) {
                    this.f53433g = new StateSnapshot(Service.State.STOPPING);
                    mo61557d();
                } else {
                    this.f53433g = new StateSnapshot(Service.State.RUNNING);
                    m74006f();
                }
                return;
            }
            String valueOf = String.valueOf(this.f53433g.f53443a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("Cannot notifyStarted() when the service is ");
            sb.append(valueOf);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            mo61623i(illegalStateException);
            throw illegalStateException;
        } finally {
            this.f53427a.mo61849e();
            m74004c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo61625k() {
        this.f53427a.mo61847b();
        try {
            Service.State a = mo61550a();
            switch (C109716.f53438a[a.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                    sb.append("Cannot notifyStopped() when the service is ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                case 2:
                case 3:
                case 4:
                    this.f53433g = new StateSnapshot(Service.State.TERMINATED);
                    m74007g(a);
                    break;
            }
        } finally {
            this.f53427a.mo61849e();
            m74004c();
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(mo61550a());
        StringBuilder sb = new StringBuilder(simpleName.length() + 3 + valueOf.length());
        sb.append(simpleName);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
