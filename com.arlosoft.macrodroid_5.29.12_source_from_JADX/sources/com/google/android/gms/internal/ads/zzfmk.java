package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfmk extends AsyncTask {

    /* renamed from: a */
    private zzfml f36114a;

    /* renamed from: b */
    protected final zzfmc f36115b;

    public zzfmk(zzfmc zzfmc, byte[] bArr) {
        this.f36115b = zzfmc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        zzfml zzfml = this.f36114a;
        if (zzfml != null) {
            zzfml.mo45973a(this);
        }
    }

    /* renamed from: b */
    public final void mo45971b(zzfml zzfml) {
        this.f36114a = zzfml;
    }
}
