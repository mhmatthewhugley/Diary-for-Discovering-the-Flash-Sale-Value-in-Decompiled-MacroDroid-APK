package com.google.android.gms.location.places;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.places.zzh;
import com.google.android.gms.location.places.internal.zzaa;

public class zzm extends zzaa {

    /* renamed from: o */
    private static final String f46042o = zzm.class.getSimpleName();

    /* renamed from: a */
    private final zzd f46043a;

    /* renamed from: c */
    private final zzc f46044c;

    /* renamed from: d */
    private final zzg f46045d;

    /* renamed from: f */
    private final zzf f46046f;

    /* renamed from: g */
    private final zze f46047g;

    public static abstract class zzb<R extends Result, A extends Api.Client> extends BaseImplementation.ApiMethodImpl<R, A> {
    }

    public static abstract class zzc<A extends Api.Client> extends zzb<AutocompletePredictionBuffer, A> {
        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new AutocompletePredictionBuffer(DataHolder.m4297l2(status.mo21294n2()));
        }
    }

    public static abstract class zzd<A extends Api.Client> extends zzb<PlaceLikelihoodBuffer, A> {
        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new PlaceLikelihoodBuffer(DataHolder.m4297l2(status.mo21294n2()), 100);
        }
    }

    public static abstract class zze<A extends Api.Client> extends zzb<PlaceBuffer, A> {
        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return new PlaceBuffer(DataHolder.m4297l2(status.mo21294n2()));
        }
    }

    public static abstract class zzf<A extends Api.Client> extends zzb<Status, A> {
        /* access modifiers changed from: protected */
        /* renamed from: h */
        public /* synthetic */ Result mo21036h(Status status) {
            return status;
        }
    }

    @Deprecated
    public static abstract class zzg<A extends Api.Client> extends zzb<zzh, A> {
    }

    public zzm(zzd zzd2) {
        this.f46043a = zzd2;
        this.f46044c = null;
        this.f46045d = null;
        this.f46046f = null;
        this.f46047g = null;
    }

    /* renamed from: A6 */
    public final void mo54342A6(DataHolder dataHolder) throws RemoteException {
        if (dataHolder == null) {
            String str = f46042o;
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "onAutocompletePrediction received null DataHolder", new Throwable());
            }
            this.f46044c.mo21321b(Status.f3140z);
            return;
        }
        this.f46044c.mo21329l(new AutocompletePredictionBuffer(dataHolder));
    }

    /* renamed from: C4 */
    public final void mo54343C4(DataHolder dataHolder) throws RemoteException {
        if (dataHolder == null) {
            String str = f46042o;
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "onPlaceUserDataFetched received null DataHolder", new Throwable());
            }
            Status status = Status.f3140z;
            throw null;
        }
        new zzh(dataHolder);
        throw null;
    }

    /* renamed from: V0 */
    public final void mo54344V0(DataHolder dataHolder) throws RemoteException {
        this.f46047g.mo21329l(new PlaceBuffer(dataHolder));
    }

    /* renamed from: V5 */
    public final void mo54345V5(DataHolder dataHolder) throws RemoteException {
        int i;
        Preconditions.m4494q(this.f46043a != null, "placeEstimator cannot be null");
        if (dataHolder == null) {
            String str = f46042o;
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "onPlaceEstimated received null DataHolder", new Throwable());
            }
            this.f46043a.mo21321b(Status.f3140z);
            return;
        }
        Bundle o2 = dataHolder.mo21570o2();
        if (o2 == null) {
            i = 100;
        } else {
            i = PlaceLikelihoodBuffer.m64710h(o2);
        }
        this.f46043a.mo21329l(new PlaceLikelihoodBuffer(dataHolder, i));
    }

    /* renamed from: e0 */
    public final void mo54346e0(Status status) throws RemoteException {
        this.f46046f.mo21329l(status);
    }

    public zzm(zzc zzc2) {
        this.f46043a = null;
        this.f46044c = zzc2;
        this.f46045d = null;
        this.f46046f = null;
        this.f46047g = null;
    }

    public zzm(zzf zzf2) {
        this.f46043a = null;
        this.f46044c = null;
        this.f46045d = null;
        this.f46046f = zzf2;
        this.f46047g = null;
    }

    public zzm(zze zze2) {
        this.f46043a = null;
        this.f46044c = null;
        this.f46045d = null;
        this.f46046f = null;
        this.f46047g = zze2;
    }
}
