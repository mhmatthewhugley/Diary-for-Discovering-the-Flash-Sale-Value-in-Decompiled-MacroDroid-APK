package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class zzk extends zzn {

    /* renamed from: a */
    private final /* synthetic */ zzj f39238a;

    zzk(zzj zzj) {
        this.f39238a = zzj;
    }

    /* renamed from: l5 */
    public final void mo20763l5(Account account) {
        this.f39238a.mo21329l(new zzo(account != null ? Status.f3138p : zzh.f39235a, account));
    }
}
