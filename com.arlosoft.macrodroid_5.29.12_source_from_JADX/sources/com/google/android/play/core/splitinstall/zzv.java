package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzv implements zzf {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f51938a;

    /* renamed from: b */
    final /* synthetic */ Intent f51939b;

    /* renamed from: c */
    final /* synthetic */ Context f51940c;

    /* renamed from: d */
    final /* synthetic */ zzx f51941d;

    zzv(zzx zzx, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f51941d = zzx;
        this.f51938a = splitInstallSessionState;
        this.f51939b = intent;
        this.f51940c = context;
    }

    /* renamed from: B */
    public final void mo59995B(@SplitInstallErrorCode int i) {
        this.f51941d.f51947g.post(new zzw(this.f51941d, this.f51938a, 6, i));
    }

    /* renamed from: a */
    public final void mo59996a() {
        if (!this.f51939b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f51939b.putExtra("triggered_from_app_after_verification", true);
            this.f51940c.sendBroadcast(this.f51939b);
            return;
        }
        this.f51941d.f51726a.mo59806b("Splits copied and verified more than once.", new Object[0]);
    }

    public final void zza() {
        this.f51941d.f51947g.post(new zzw(this.f51941d, this.f51938a, 5, 0));
    }
}
