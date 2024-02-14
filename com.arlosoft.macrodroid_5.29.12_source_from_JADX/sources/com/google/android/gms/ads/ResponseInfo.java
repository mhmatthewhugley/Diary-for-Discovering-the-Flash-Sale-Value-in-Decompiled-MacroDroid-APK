package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ResponseInfo {
    @Nullable

    /* renamed from: a */
    private final zzdh f1711a;

    /* renamed from: b */
    private final List f1712b = new ArrayList();
    @Nullable

    /* renamed from: c */
    private AdapterResponseInfo f1713c;

    private ResponseInfo(@Nullable zzdh zzdh) {
        this.f1711a = zzdh;
        if (zzdh != null) {
            try {
                List<zzu> h = zzdh.mo19997h();
                if (h != null) {
                    for (zzu e : h) {
                        AdapterResponseInfo e2 = AdapterResponseInfo.m1716e(e);
                        if (e2 != null) {
                            this.f1712b.add(e2);
                        }
                    }
                }
            } catch (RemoteException e3) {
                zzcgp.m45227e("Could not forward getAdapterResponseInfo to ResponseInfo.", e3);
            }
        }
        zzdh zzdh2 = this.f1711a;
        if (zzdh2 != null) {
            try {
                zzu c = zzdh2.mo19993c();
                if (c != null) {
                    this.f1713c = AdapterResponseInfo.m1716e(c);
                }
            } catch (RemoteException e4) {
                zzcgp.m45227e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e4);
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public static ResponseInfo m1738d(@Nullable zzdh zzdh) {
        if (zzdh != null) {
            return new ResponseInfo(zzdh);
        }
        return null;
    }

    @NonNull
    /* renamed from: e */
    public static ResponseInfo m1739e(@Nullable zzdh zzdh) {
        return new ResponseInfo(zzdh);
    }

    @Nullable
    /* renamed from: a */
    public String mo19742a() {
        try {
            zzdh zzdh = this.f1711a;
            if (zzdh != null) {
                return zzdh.mo19995f();
            }
            return null;
        } catch (RemoteException e) {
            zzcgp.m45227e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public Bundle mo19743b() {
        try {
            zzdh zzdh = this.f1711a;
            if (zzdh != null) {
                return zzdh.mo19992b();
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @Nullable
    /* renamed from: c */
    public String mo19744c() {
        try {
            zzdh zzdh = this.f1711a;
            if (zzdh != null) {
                return zzdh.mo19996g();
            }
            return null;
        } catch (RemoteException e) {
            zzcgp.m45227e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: f */
    public final zzdh mo19745f() {
        return this.f1711a;
    }

    @NonNull
    /* renamed from: g */
    public final JSONObject mo19746g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String c = mo19744c();
        if (c == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", c);
        }
        String a = mo19742a();
        if (a == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", a);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo f : this.f1712b) {
            jSONArray.put(f.mo19702f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.f1713c;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.mo19702f());
        }
        Bundle b = mo19743b();
        if (b != null) {
            jSONObject.put("Response Extras", zzaw.m1917b().mo43549h(b));
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return mo19746g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
