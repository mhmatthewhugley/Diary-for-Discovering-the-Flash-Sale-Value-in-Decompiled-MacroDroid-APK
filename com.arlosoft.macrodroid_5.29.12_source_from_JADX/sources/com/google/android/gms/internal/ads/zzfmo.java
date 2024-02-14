package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfmo extends zzfmj {
    public zzfmo(zzfmc zzfmc, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfmc, hashSet, jSONObject, j, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45970a(String str) {
        zzflg a;
        if (!TextUtils.isEmpty(str) && (a = zzflg.m50458a()) != null) {
            for (zzfkv zzfkv : a.mo45893c()) {
                if (this.f36111c.contains(zzfkv.mo45881h())) {
                    zzfkv.mo45880g().mo45935e(str, this.f36113e);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzflw.m50524j(this.f36112d, this.f36115b.mo45957a())) {
            return null;
        }
        this.f36115b.mo45961e(this.f36112d);
        return this.f36112d.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
