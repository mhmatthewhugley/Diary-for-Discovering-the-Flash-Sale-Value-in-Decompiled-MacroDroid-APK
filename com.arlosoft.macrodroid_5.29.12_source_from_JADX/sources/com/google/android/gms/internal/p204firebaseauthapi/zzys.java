package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzys */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzys extends zzxa {

    /* renamed from: c */
    private final String f40656c;

    /* renamed from: d */
    final /* synthetic */ zzyv f40657d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzys(zzyv zzyv, zzxa zzxa, String str) {
        super(zzxa);
        this.f40657d = zzyv;
        this.f40656c = str;
    }

    /* renamed from: b */
    public final void mo49986b(String str) {
        zzyv.f40669d.mo21837a("onCodeSent", new Object[0]);
        zzyu zzyu = (zzyu) this.f40657d.f40672c.get(this.f40656c);
        if (zzyu != null) {
            for (zzxa b : zzyu.f40661b) {
                b.mo49986b(str);
            }
            zzyu.f40666g = true;
            zzyu.f40663d = str;
            if (zzyu.f40660a <= 0) {
                this.f40657d.mo50080h(this.f40656c);
            } else if (!zzyu.f40662c) {
                this.f40657d.m58501n(this.f40656c);
            } else if (!zzag.m56870d(zzyu.f40664e)) {
                zzyv.m58497e(this.f40657d, this.f40656c);
            }
        }
    }

    /* renamed from: h */
    public final void mo49992h(Status status) {
        Logger a = zzyv.f40669d;
        String a2 = CommonStatusCodes.m3624a(status.mo21294n2());
        String o2 = status.mo21295o2();
        a.mo21839c("SMS verification code request failed: " + a2 + " " + o2, new Object[0]);
        zzyu zzyu = (zzyu) this.f40657d.f40672c.get(this.f40656c);
        if (zzyu != null) {
            for (zzxa h : zzyu.f40661b) {
                h.mo49992h(status);
            }
            this.f40657d.mo50082j(this.f40656c);
        }
    }
}
