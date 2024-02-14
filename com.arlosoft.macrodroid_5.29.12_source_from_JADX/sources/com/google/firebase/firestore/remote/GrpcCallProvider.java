package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import com.google.firestore.p228v1.FirestoreGrpc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C12530b;
import p292io.grpc.C12542c;
import p292io.grpc.C12558f;
import p292io.grpc.C12926n;
import p292io.grpc.C12930o0;
import p292io.grpc.C12951p0;
import p292io.grpc.C12972r0;
import p347o9.C15820a;

public class GrpcCallProvider {

    /* renamed from: h */
    private static Supplier<C12951p0<?>> f54607h;

    /* renamed from: a */
    private Task<C12930o0> f54608a;

    /* renamed from: b */
    private final AsyncQueue f54609b;

    /* renamed from: c */
    private C12542c f54610c;

    /* renamed from: d */
    private AsyncQueue.DelayedTask f54611d;

    /* renamed from: e */
    private final Context f54612e;

    /* renamed from: f */
    private final DatabaseInfo f54613f;

    /* renamed from: g */
    private final C12530b f54614g;

    GrpcCallProvider(AsyncQueue asyncQueue, Context context, DatabaseInfo databaseInfo, C12530b bVar) {
        this.f54609b = asyncQueue;
        this.f54612e = context;
        this.f54613f = databaseInfo;
        this.f54614g = bVar;
        m76219d();
    }

    /* renamed from: a */
    private void m76217a() {
        if (this.f54611d != null) {
            Logger.m76508a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f54611d.mo63157e();
            this.f54611d = null;
        }
    }

    /* renamed from: c */
    private C12930o0 m76218c(Context context, DatabaseInfo databaseInfo) {
        C12951p0<?> p0Var;
        try {
            ProviderInstaller.m66581a(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e) {
            Logger.m76511d("GrpcCallProvider", "Failed to update ssl context: %s", e);
        }
        Supplier<C12951p0<?>> supplier = f54607h;
        if (supplier != null) {
            p0Var = supplier.get();
        } else {
            C12951p0<?> b = C12951p0.m85026b(databaseInfo.mo23840b());
            if (!databaseInfo.mo23842d()) {
                b.mo69746d();
            }
            p0Var = b;
        }
        p0Var.mo69745c(30, TimeUnit.SECONDS);
        return C15820a.m95414k(p0Var).mo75601i(context).mo69212a();
    }

    /* renamed from: d */
    private void m76219d() {
        this.f54608a = Tasks.m66664c(Executors.f54771c, GrpcCallProvider$$Lambda$5.m76236a(this));
    }

    /* renamed from: g */
    static /* synthetic */ C12930o0 m76222g(GrpcCallProvider grpcCallProvider) throws Exception {
        C12930o0 c = grpcCallProvider.m76218c(grpcCallProvider.f54612e, grpcCallProvider.f54613f);
        grpcCallProvider.f54609b.mo63152h(GrpcCallProvider$$Lambda$6.m76237a(grpcCallProvider, c));
        grpcCallProvider.f54610c = ((FirestoreGrpc.FirestoreStub) ((FirestoreGrpc.FirestoreStub) FirestoreGrpc.m77868d(c).mo79316c(grpcCallProvider.f54614g)).mo79317d(grpcCallProvider.f54609b.mo63153i())).mo79315b();
        Logger.m76508a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return c;
    }

    /* renamed from: h */
    static /* synthetic */ void m76223h(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        Logger.m76508a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        grpcCallProvider.m76217a();
        grpcCallProvider.m76228m(o0Var);
    }

    /* renamed from: k */
    static /* synthetic */ void m76226k(GrpcCallProvider grpcCallProvider, C12930o0 o0Var) {
        o0Var.mo69275o();
        grpcCallProvider.m76219d();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m76227l(C12930o0 o0Var) {
        C12926n k = o0Var.mo69271k(true);
        Logger.m76508a("GrpcCallProvider", "Current gRPC connectivity state: " + k, new Object[0]);
        m76217a();
        if (k == C12926n.CONNECTING) {
            Logger.m76508a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f54611d = this.f54609b.mo63151g(AsyncQueue.TimerId.CONNECTIVITY_ATTEMPT_TIMER, 15000, GrpcCallProvider$$Lambda$2.m76233a(this, o0Var));
        }
        o0Var.mo69272l(k, GrpcCallProvider$$Lambda$3.m76234a(this, o0Var));
    }

    /* renamed from: m */
    private void m76228m(C12930o0 o0Var) {
        this.f54609b.mo63152h(GrpcCallProvider$$Lambda$4.m76235a(this, o0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <ReqT, RespT> Task<C12558f<ReqT, RespT>> mo63037b(C12972r0<ReqT, RespT> r0Var) {
        return this.f54608a.mo23713n(this.f54609b.mo63153i(), GrpcCallProvider$$Lambda$1.m76231b(this, r0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo63038n() {
        Class<FirestoreChannel> cls = FirestoreChannel.class;
        try {
            C12930o0 o0Var = (C12930o0) Tasks.m66662a(this.f54608a);
            o0Var.mo69274n();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!o0Var.mo69269i(1, timeUnit)) {
                    Logger.m76508a(cls.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                    o0Var.mo69275o();
                    if (!o0Var.mo69269i(60, timeUnit)) {
                        Logger.m76511d(cls.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                o0Var.mo69275o();
                Logger.m76511d(cls.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (ExecutionException e) {
            Logger.m76511d(cls.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e);
        } catch (InterruptedException unused2) {
            Logger.m76511d(cls.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
