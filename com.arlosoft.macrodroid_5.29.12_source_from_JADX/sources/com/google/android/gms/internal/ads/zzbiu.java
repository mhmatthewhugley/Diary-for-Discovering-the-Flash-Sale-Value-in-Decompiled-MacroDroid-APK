package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbiu {

    /* renamed from: a */
    private final int f26787a;

    /* renamed from: b */
    private final String f26788b;

    /* renamed from: c */
    private final Object f26789c;

    /* synthetic */ zzbiu(int i, String str, Object obj, zzbit zzbit) {
        this.f26787a = i;
        this.f26788b = str;
        this.f26789c = obj;
        zzay.m1922a().mo42656d(this);
    }

    /* renamed from: f */
    public static zzbiu m43510f(int i, String str, float f) {
        return new zzbir(1, str, Float.valueOf(f));
    }

    /* renamed from: g */
    public static zzbiu m43511g(int i, String str, int i2) {
        return new zzbip(1, str, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static zzbiu m43512h(int i, String str, long j) {
        return new zzbiq(1, str, Long.valueOf(j));
    }

    /* renamed from: i */
    public static zzbiu m43513i(int i, String str, Boolean bool) {
        return new zzbio(i, str, bool);
    }

    /* renamed from: j */
    public static zzbiu m43514j(int i, String str, String str2) {
        return new zzbis(1, str, str2);
    }

    /* renamed from: k */
    public static zzbiu m43515k(int i, String str) {
        zzbiu j = m43514j(1, "gads:sdk_core_constants:experiment_id", (String) null);
        zzay.m1922a().mo42655c(j);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo42645a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract Object mo42646b(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo42647c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo42648d(SharedPreferences.Editor editor, Object obj);

    /* renamed from: e */
    public final int mo42649e() {
        return this.f26787a;
    }

    /* renamed from: l */
    public final Object mo42650l() {
        return zzay.m1924c().mo42663b(this);
    }

    /* renamed from: m */
    public final Object mo42651m() {
        return this.f26789c;
    }

    /* renamed from: n */
    public final String mo42652n() {
        return this.f26788b;
    }
}
