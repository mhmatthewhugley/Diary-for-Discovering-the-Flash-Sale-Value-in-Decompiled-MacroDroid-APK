package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class BaseImplementation {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk

        /* renamed from: r */
        private final Api.AnyClientKey<A> f3155r;
        @KeepForSdk
        @Nullable

        /* renamed from: s */
        private final Api<?> f3156s;

        @KeepForSdk
        protected ApiMethodImpl(@NonNull Api<?> api, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.m4489l(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.m4489l(api, "Api must not be null");
            this.f3155r = api.mo21189b();
            this.f3156s = api;
        }

        @KeepForSdk
        /* renamed from: y */
        private void m3714y(@NonNull RemoteException remoteException) {
            mo21321b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo21038a(@NonNull Object obj) {
            super.mo21329l((Result) obj);
        }

        @KeepForSdk
        /* renamed from: b */
        public final void mo21321b(@NonNull Status status) {
            Preconditions.m4479b(!status.mo21297q2(), "Failed result must not be success");
            Result h = mo21036h(status);
            mo21329l(h);
            mo21324w(h);
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        /* renamed from: t */
        public abstract void mo21037t(@NonNull A a) throws RemoteException;

        @KeepForSdk
        @Nullable
        /* renamed from: u */
        public final Api<?> mo21322u() {
            return this.f3156s;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: v */
        public final Api.AnyClientKey<A> mo21323v() {
            return this.f3155r;
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        /* renamed from: w */
        public void mo21324w(@NonNull R r) {
        }

        @KeepForSdk
        /* renamed from: x */
        public final void mo21325x(@NonNull A a) throws DeadObjectException {
            try {
                mo21037t(a);
            } catch (DeadObjectException e) {
                m3714y(e);
                throw e;
            } catch (RemoteException e2) {
                m3714y(e2);
            }
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface ResultHolder<R> {
        @KeepForSdk
        /* renamed from: a */
        void mo21038a(@NonNull R r);

        @KeepForSdk
        /* renamed from: b */
        void mo21321b(@NonNull Status status);
    }
}
