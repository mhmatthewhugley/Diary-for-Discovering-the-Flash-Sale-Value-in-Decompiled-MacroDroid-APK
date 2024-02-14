package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbj;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    /* renamed from: L */
    private final Task<Void> m64643L(zzba zzba, LocationCallback locationCallback, Looper looper, zzan zzan, int i) {
        ListenerHolder a = ListenerHolders.m3811a(locationCallback, zzbj.m59262a(looper), LocationCallback.class.getSimpleName());
        zzak zzak = new zzak(this, a);
        return mo21231q(RegistrationMethods.m3853a().mo21396b(new zzae(this, zzak, locationCallback, zzan, zzba, a)).mo21399e(zzak).mo21400f(a).mo21398d(i).mo21395a());
    }

    @NonNull
    /* renamed from: G */
    public Task<Void> mo54150G(@NonNull LocationCallback locationCallback) {
        return TaskUtil.m3879c(mo21232r(ListenerHolders.m3812b(locationCallback, LocationCallback.class.getSimpleName())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo54151H(zzba zzba, PendingIntent pendingIntent, zzaz zzaz, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzao zzao = new zzao(taskCompletionSource);
        zzba.mo50579m2(mo21239y());
        zzaz.mo50570v0(zzba, pendingIntent, zzao);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo54152I(zzap zzap, LocationCallback locationCallback, zzan zzan, zzba zzba, ListenerHolder listenerHolder, zzaz zzaz, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzam zzam = new zzam(taskCompletionSource, new zzx(this, zzap, locationCallback, zzan));
        zzba.mo50579m2(mo21239y());
        zzaz.mo50568t0(zzba, listenerHolder, zzam);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo54153J(CancellationToken cancellationToken, zzba zzba, zzaz zzaz, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaj zzaj = new zzaj(this, taskCompletionSource);
        if (cancellationToken != null) {
            cancellationToken.mo56133b(new zzy(this, zzaj));
        }
        m64643L(zzba, zzaj, Looper.getMainLooper(), new zzz(taskCompletionSource), 2437).mo23712m(new zzaa(taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo54154K(zzaz zzaz, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.mo56139c(zzaz.mo50566N0(mo21239y()));
    }
}
