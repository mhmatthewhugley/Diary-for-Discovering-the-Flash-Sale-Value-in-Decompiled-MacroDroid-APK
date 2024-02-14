package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbiv {

    /* renamed from: a */
    private final Collection f26790a = new ArrayList();

    /* renamed from: b */
    private final Collection f26791b = new ArrayList();

    /* renamed from: c */
    private final Collection f26792c = new ArrayList();

    /* renamed from: a */
    public final List mo42653a() {
        ArrayList arrayList = new ArrayList();
        for (zzbiu b : this.f26791b) {
            String str = (String) zzay.m1924c().mo42663b(b);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbjd.m43544a());
        return arrayList;
    }

    /* renamed from: b */
    public final List mo42654b() {
        List a = mo42653a();
        for (zzbiu b : this.f26792c) {
            String str = (String) zzay.m1924c().mo42663b(b);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(zzbjd.m43545b());
        return a;
    }

    /* renamed from: c */
    public final void mo42655c(zzbiu zzbiu) {
        this.f26791b.add(zzbiu);
    }

    /* renamed from: d */
    public final void mo42656d(zzbiu zzbiu) {
        this.f26790a.add(zzbiu);
    }

    /* renamed from: e */
    public final void mo42657e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbiu zzbiu : this.f26790a) {
            if (zzbiu.mo42649e() == 1) {
                zzbiu.mo42648d(editor, zzbiu.mo42645a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcgp.m45226d("Flag Json is null.");
        }
    }
}
