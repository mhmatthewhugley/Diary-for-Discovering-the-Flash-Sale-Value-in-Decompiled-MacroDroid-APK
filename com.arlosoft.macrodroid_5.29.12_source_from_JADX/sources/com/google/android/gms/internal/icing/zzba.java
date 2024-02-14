package com.google.android.gms.internal.icing;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuthApi;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzba extends BaseImplementation.ApiMethodImpl<SearchAuthApi.GoogleNowAuthResult, zzav> {

    /* renamed from: t */
    private final String f40766t;

    /* renamed from: u */
    private final String f40767u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final boolean f40768v;

    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        super.mo21329l((Result) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        if (this.f40768v) {
            String valueOf = String.valueOf(status.mo21295o2());
            if (valueOf.length() != 0) {
                "GetGoogleNowAuthImpl received failure: ".concat(valueOf);
            }
        }
        return new zzbb(status, (GoogleNowAuthState) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzau) ((zzav) anyClient).mo21626I()).mo50170g8(new zzaz(this), this.f40767u, this.f40766t);
    }
}
