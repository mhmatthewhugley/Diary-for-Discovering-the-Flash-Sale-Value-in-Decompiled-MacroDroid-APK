package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzu;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends GoogleApi<zzn> {

    /* renamed from: k */
    private static final Api.ClientKey<zzu> f2690k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder<zzu, zzn> f2691l;

    /* renamed from: m */
    private static final Api<zzn> f2692m;

    private static class zza<T> extends zzs {

        /* renamed from: a */
        private zzb<T> f2693a;

        public zza(zzb<T> zzb) {
            this.f2693a = zzb;
        }

        /* renamed from: G5 */
        public final void mo20777G5(Status status) {
            this.f2693a.mo20780h(status);
        }
    }

    private static abstract class zzb<T> extends TaskApiCall<zzu, T> {

        /* renamed from: d */
        private TaskCompletionSource<T> f2694d;

        private zzb() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo20778a(T t) {
            this.f2694d.mo56139c(t);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public /* synthetic */ void mo20779d(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.f2694d = taskCompletionSource;
            mo20781i((zzz) ((zzu) anyClient).mo21626I());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo20780h(Status status) {
            AccountTransferClient.m3143G(this.f2694d, status);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public abstract void mo20781i(zzz zzz) throws RemoteException;

        /* synthetic */ zzb(zzc zzc) {
            this();
        }
    }

    private static abstract class zzc extends zzb<Void> {

        /* renamed from: e */
        zzy f2695e = new zzk(this);

        private zzc() {
            super((zzc) null);
        }
    }

    static {
        Api.ClientKey<zzu> clientKey = new Api.ClientKey<>();
        f2690k = clientKey;
        zzc zzc2 = new zzc();
        f2691l = zzc2;
        f2692m = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzc2, clientKey);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static void m3143G(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.mo56138b(new AccountTransferException(status));
    }
}
