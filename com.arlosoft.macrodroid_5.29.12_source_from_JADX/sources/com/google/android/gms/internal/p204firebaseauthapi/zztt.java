package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zztt implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzaao f40450a;

    /* renamed from: b */
    final /* synthetic */ zzzr f40451b;

    /* renamed from: c */
    final /* synthetic */ zzxa f40452c;

    /* renamed from: d */
    final /* synthetic */ zzzy f40453d;

    /* renamed from: e */
    final /* synthetic */ zzyf f40454e;

    /* renamed from: f */
    final /* synthetic */ zzvf f40455f;

    zztt(zzvf zzvf, zzaao zzaao, zzzr zzzr, zzxa zzxa, zzzy zzzy, zzyf zzyf) {
        this.f40455f = zzvf;
        this.f40450a = zzaao;
        this.f40451b = zzzr;
        this.f40452c = zzxa;
        this.f40453d = zzzy;
        this.f40454e = zzyf;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzaap zzaap = (zzaap) obj;
        if (this.f40450a.mo48790m("EMAIL")) {
            this.f40451b.mo50121q2((String) null);
        } else {
            zzaao zzaao = this.f40450a;
            if (zzaao.mo48787j() != null) {
                this.f40451b.mo50121q2(zzaao.mo48787j());
            }
        }
        if (this.f40450a.mo48790m("DISPLAY_NAME")) {
            this.f40451b.mo50120p2((String) null);
        } else {
            zzaao zzaao2 = this.f40450a;
            if (zzaao2.mo48786i() != null) {
                this.f40451b.mo50120p2(zzaao2.mo48786i());
            }
        }
        if (this.f40450a.mo48790m("PHOTO_URL")) {
            this.f40451b.mo50124t2((String) null);
        } else {
            zzaao zzaao3 = this.f40450a;
            if (zzaao3.mo48789l() != null) {
                this.f40451b.mo50124t2(zzaao3.mo48789l());
            }
        }
        if (!TextUtils.isEmpty(this.f40450a.mo48788k())) {
            this.f40451b.mo50123s2(Base64Utils.m4853c("redacted".getBytes()));
        }
        List e = zzaap.mo48795e();
        if (e == null) {
            e = new ArrayList();
        }
        this.f40451b.mo50125u2(e);
        zzxa zzxa = this.f40452c;
        zzzy zzzy = this.f40453d;
        Preconditions.m4488k(zzzy);
        Preconditions.m4488k(zzaap);
        String c = zzaap.mo48793c();
        String d = zzaap.mo48794d();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(d)) {
            zzzy = new zzzy(d, c, Long.valueOf(zzaap.mo48791a()), zzzy.mo50149o2());
        }
        zzxa.mo49993i(zzzy, this.f40451b);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40454e.mo49911o(str);
    }
}
