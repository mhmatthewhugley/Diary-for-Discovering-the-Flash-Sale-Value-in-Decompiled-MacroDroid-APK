package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;
import java.util.List;

final class zzg implements zzj<List<AccountChangeEvent>> {

    /* renamed from: a */
    private final /* synthetic */ String f2958a;

    /* renamed from: b */
    private final /* synthetic */ int f2959b;

    /* renamed from: a */
    public final /* synthetic */ Object mo21064a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return ((AccountChangeEventsResponse) zzd.m3414h(zzf.m55801t1(iBinder).mo48563H6(new AccountChangeEventsRequest().mo20751l2(this.f2958a).mo20752m2(this.f2959b)))).mo20754l2();
    }
}
