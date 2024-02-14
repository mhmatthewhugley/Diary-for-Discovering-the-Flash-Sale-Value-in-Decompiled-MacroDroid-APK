package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.safetynet.zzk;

final class zzl extends zzk.zzb {

    /* renamed from: u */
    private final /* synthetic */ byte[] f45511u;

    /* renamed from: v */
    private final /* synthetic */ String f45512v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzl(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        super(googleApiClient);
        this.f45511u = bArr;
        this.f45512v = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzx zzx = (zzx) anyClient;
        zzg zzg = this.f45495t;
        byte[] bArr = this.f45511u;
        String str = this.f45512v;
        if (TextUtils.isEmpty(str)) {
            str = zzx.mo53764s0("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzi) zzx.mo21626I()).mo53756J2(zzg, bArr, str);
    }
}
