package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzehh {

    /* renamed from: a */
    private final List f34018a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final Map f34019b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final String f34020c;

    /* renamed from: d */
    private zzfdn f34021d = null;

    /* renamed from: e */
    private zzfdk f34022e = null;

    /* renamed from: f */
    private zzu f34023f = null;

    public zzehh(String str) {
        this.f34020c = str;
    }

    /* renamed from: h */
    private final void m48839h(zzfdk zzfdk, long j, @Nullable zze zze, boolean z) {
        String str = zzfdk.f35558x;
        if (this.f34019b.containsKey(str)) {
            if (this.f34022e == null) {
                this.f34022e = zzfdk;
            }
            zzu zzu = (zzu) this.f34019b.get(str);
            zzu.f2039c = j;
            zzu.f2040d = zze;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26992S5)).booleanValue() && z) {
                this.f34023f = zzu;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final zzu mo45302a() {
        return this.f34023f;
    }

    /* renamed from: b */
    public final zzdct mo45303b() {
        return new zzdct(this.f34022e, "", this, this.f34021d, this.f34020c);
    }

    /* renamed from: c */
    public final List mo45304c() {
        return this.f34018a;
    }

    /* renamed from: d */
    public final void mo45305d(zzfdk zzfdk) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfdk.f35558x;
        if (!this.f34019b.containsKey(str5)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzfdk.f35557w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzfdk.f35557w.getString(next));
                } catch (JSONException unused) {
                }
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26982R5)).booleanValue()) {
                String str6 = zzfdk.f35499G;
                String str7 = zzfdk.f35500H;
                str4 = str6;
                str3 = str7;
                str2 = zzfdk.f35501I;
                str = zzfdk.f35502J;
            } else {
                str4 = "";
                str3 = str4;
                str2 = str3;
                str = str2;
            }
            zzu zzu = new zzu(zzfdk.f35498F, 0, (zze) null, bundle, str4, str3, str2, str);
            this.f34018a.add(zzu);
            this.f34019b.put(str5, zzu);
        }
    }

    /* renamed from: e */
    public final void mo45306e(zzfdk zzfdk, long j, @Nullable zze zze) {
        m48839h(zzfdk, j, zze, false);
    }

    /* renamed from: f */
    public final void mo45307f(zzfdk zzfdk, long j, @Nullable zze zze) {
        m48839h(zzfdk, j, (zze) null, true);
    }

    /* renamed from: g */
    public final void mo45308g(zzfdn zzfdn) {
        this.f34021d = zzfdn;
    }
}
