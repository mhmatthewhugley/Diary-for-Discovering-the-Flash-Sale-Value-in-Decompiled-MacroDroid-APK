package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfr implements zzbj {

    /* renamed from: a */
    private final SharedPreferences.Editor f40075a;

    /* renamed from: b */
    private final String f40076b = "GenericIdpKeyset";

    public zzfr(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f40075a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f40075a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    /* renamed from: a */
    public final void mo49301a(zzof zzof) throws IOException {
        if (!this.f40075a.putString(this.f40076b, zzqj.m57968a(zzof.mo48861s())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* renamed from: b */
    public final void mo49302b(zzmo zzmo) throws IOException {
        if (!this.f40075a.putString(this.f40076b, zzqj.m57968a(zzmo.mo48861s())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
