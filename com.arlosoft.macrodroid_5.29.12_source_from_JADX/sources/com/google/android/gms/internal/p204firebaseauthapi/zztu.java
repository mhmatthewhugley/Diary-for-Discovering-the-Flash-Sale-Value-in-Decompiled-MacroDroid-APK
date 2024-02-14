package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.zze;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zztu implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzyf f40456a;

    /* renamed from: b */
    final /* synthetic */ String f40457b;

    /* renamed from: c */
    final /* synthetic */ String f40458c;

    /* renamed from: d */
    final /* synthetic */ Boolean f40459d;

    /* renamed from: e */
    final /* synthetic */ zze f40460e;

    /* renamed from: f */
    final /* synthetic */ zzxa f40461f;

    /* renamed from: g */
    final /* synthetic */ zzzy f40462g;

    zztu(zzvf zzvf, zzyf zzyf, String str, String str2, Boolean bool, zze zze, zzxa zzxa, zzzy zzzy) {
        this.f40456a = zzyf;
        this.f40457b = str;
        this.f40458c = str2;
        this.f40459d = bool;
        this.f40460e = zze;
        this.f40461f = zzxa;
        this.f40462g = zzzy;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        List l2 = ((zzzp) obj).mo50108l2();
        if (l2 == null || l2.isEmpty()) {
            this.f40456a.mo49911o("No users.");
            return;
        }
        int i = 0;
        zzzr zzzr = (zzzr) l2.get(0);
        zzaag v2 = zzzr.mo50126v2();
        List n2 = v2 != null ? v2.mo48751n2() : null;
        if (n2 != null && !n2.isEmpty()) {
            if (!TextUtils.isEmpty(this.f40457b)) {
                while (true) {
                    if (i >= n2.size()) {
                        break;
                    } else if (((zzaae) n2.get(i)).mo48745q2().equals(this.f40457b)) {
                        ((zzaae) n2.get(i)).mo48747s2(this.f40458c);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                ((zzaae) n2.get(0)).mo48747s2(this.f40458c);
            }
        }
        zzzr.mo50122r2(this.f40459d.booleanValue());
        zzzr.mo50119o2(this.f40460e);
        this.f40461f.mo49993i(this.f40462g, zzzr);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40456a.mo49911o(str);
    }
}
