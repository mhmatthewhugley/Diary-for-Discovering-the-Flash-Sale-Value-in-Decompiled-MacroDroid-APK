package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p292io.grpc.C12926n;

/* renamed from: io.grpc.internal.w */
/* compiled from: ConnectivityStateManager */
final class C12837w {

    /* renamed from: a */
    private ArrayList<C12838a> f60278a = new ArrayList<>();

    /* renamed from: b */
    private volatile C12926n f60279b = C12926n.IDLE;

    /* renamed from: io.grpc.internal.w$a */
    /* compiled from: ConnectivityStateManager */
    private static final class C12838a {

        /* renamed from: a */
        final Runnable f60280a;

        /* renamed from: b */
        final Executor f60281b;

        C12838a(Runnable runnable, Executor executor) {
            this.f60280a = runnable;
            this.f60281b = executor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69604a() {
            this.f60281b.execute(this.f60280a);
        }
    }

    C12837w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12926n mo69601a() {
        C12926n nVar = this.f60279b;
        if (nVar != null) {
            return nVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo69602b(C12926n nVar) {
        Preconditions.m5393t(nVar, "newState");
        if (this.f60279b != nVar && this.f60279b != C12926n.SHUTDOWN) {
            this.f60279b = nVar;
            if (!this.f60278a.isEmpty()) {
                ArrayList<C12838a> arrayList = this.f60278a;
                this.f60278a = new ArrayList<>();
                Iterator<C12838a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo69604a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo69603c(Runnable runnable, Executor executor, C12926n nVar) {
        Preconditions.m5393t(runnable, "callback");
        Preconditions.m5393t(executor, "executor");
        Preconditions.m5393t(nVar, "source");
        C12838a aVar = new C12838a(runnable, executor);
        if (this.f60279b != nVar) {
            aVar.mo69604a();
        } else {
            this.f60278a.add(aVar);
        }
    }
}
