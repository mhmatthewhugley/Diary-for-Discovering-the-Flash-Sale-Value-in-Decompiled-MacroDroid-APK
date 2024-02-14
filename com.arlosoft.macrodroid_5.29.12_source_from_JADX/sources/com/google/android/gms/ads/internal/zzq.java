package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzq extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ zzs f2355a;

    /* synthetic */ zzq(zzs zzs, zzp zzp) {
        this.f2355a = zzs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzs = this.f2355a;
            zzs.f2369s = (zzape) zzs.f2364d.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            zzcgp.m45230h("", e);
        } catch (TimeoutException e2) {
            zzcgp.m45230h("", e2);
        }
        return this.f2355a.mo20458m();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzs = this.f2355a;
        if (zzs.f2367o != null && str != null) {
            zzs.f2367o.loadUrl(str);
        }
    }
}
