package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfmn extends zzfmj {
    public zzfmn(zzfmc zzfmc, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfmc, hashSet, jSONObject, j, (byte[]) null);
    }

    /* renamed from: c */
    private final void m50567c(String str) {
        zzflg a = zzflg.m50458a();
        if (a != null) {
            for (zzfkv zzfkv : a.mo45893c()) {
                if (this.f36111c.contains(zzfkv.mo45881h())) {
                    zzfkv.mo45880g().mo45934d(str, this.f36113e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45970a(String str) {
        m50567c(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f36112d.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m50567c(str);
        super.onPostExecute(str);
    }
}
