package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzv extends zzs {

    /* renamed from: a */
    private final Context f2945a;

    public zzv(Context context) {
        this.f2945a = context;
    }

    /* renamed from: r */
    private final void m3397r() {
        if (!UidVerifier.m4913a(this.f2945a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: m */
    public final void mo21039m() {
        m3397r();
        Storage b = Storage.m3343b(this.f2945a);
        GoogleSignInAccount c = b.mo21014c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f2878C;
        if (c != null) {
            googleSignInOptions = b.mo21015d();
        }
        GoogleSignInClient a = GoogleSignIn.m3281a(this.f2945a, googleSignInOptions);
        if (c != null) {
            a.mo20976H();
        } else {
            a.mo20977I();
        }
    }

    /* renamed from: s */
    public final void mo21040s() {
        m3397r();
        zzq.m3385c(this.f2945a).mo21041a();
    }
}
