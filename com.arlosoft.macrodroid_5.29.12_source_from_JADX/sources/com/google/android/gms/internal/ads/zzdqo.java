package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdqo implements zzdoy {
    @Nullable

    /* renamed from: a */
    private final zzbvz f32804a;

    /* renamed from: b */
    private final zzdds f32805b;

    /* renamed from: c */
    private final zzdcy f32806c;

    /* renamed from: d */
    private final zzdkl f32807d;

    /* renamed from: e */
    private final Context f32808e;

    /* renamed from: f */
    private final zzfdk f32809f;

    /* renamed from: g */
    private final zzcgv f32810g;

    /* renamed from: h */
    private final zzfef f32811h;

    /* renamed from: i */
    private boolean f32812i = false;

    /* renamed from: j */
    private boolean f32813j = false;

    /* renamed from: k */
    private boolean f32814k = true;
    @Nullable

    /* renamed from: l */
    private final zzbvv f32815l;
    @Nullable

    /* renamed from: m */
    private final zzbvw f32816m;

    public zzdqo(@Nullable zzbvv zzbvv, @Nullable zzbvw zzbvw, @Nullable zzbvz zzbvz, zzdds zzdds, zzdcy zzdcy, zzdkl zzdkl, Context context, zzfdk zzfdk, zzcgv zzcgv, zzfef zzfef, byte[] bArr) {
        this.f32815l = zzbvv;
        this.f32816m = zzbvw;
        this.f32804a = zzbvz;
        this.f32805b = zzdds;
        this.f32806c = zzdcy;
        this.f32807d = zzdkl;
        this.f32808e = context;
        this.f32809f = zzfdk;
        this.f32810g = zzcgv;
        this.f32811h = zzfef;
    }

    /* renamed from: a */
    private final void m47926a(View view) {
        try {
            zzbvz zzbvz = this.f32804a;
            if (zzbvz == null || zzbvz.mo43133F()) {
                zzbvv zzbvv = this.f32815l;
                if (zzbvv == null || zzbvv.mo43091D()) {
                    zzbvw zzbvw = this.f32816m;
                    if (zzbvw != null && !zzbvw.mo43130w()) {
                        this.f32816m.mo43116Lb(ObjectWrapper.m5051g8(view));
                        this.f32806c.onAdClicked();
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
                            this.f32807d.mo44113s();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f32815l.mo43096Lb(ObjectWrapper.m5051g8(view));
                this.f32806c.onAdClicked();
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
                    this.f32807d.mo44113s();
                    return;
                }
                return;
            }
            this.f32804a.mo43136b7(ObjectWrapper.m5051g8(view));
            this.f32806c.onAdClicked();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
                this.f32807d.mo44113s();
            }
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to call handleClick", e);
        }
    }

    /* renamed from: b */
    private static final HashMap m47927b(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: I */
    public final boolean mo44723I() {
        return this.f32809f.f35505M;
    }

    /* renamed from: O0 */
    public final void mo44724O0(Bundle bundle) {
    }

    /* renamed from: P0 */
    public final void mo44725P0(@Nullable zzcu zzcu) {
        zzcgp.m45229g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: Q0 */
    public final void mo44726Q0(zzbny zzbny) {
    }

    /* renamed from: R0 */
    public final void mo44727R0(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    /* renamed from: S0 */
    public final void mo44728S0(String str) {
    }

    /* renamed from: T0 */
    public final void mo44729T0(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z) {
        if (!this.f32813j || !this.f32809f.f35505M) {
            m47926a(view);
        }
    }

    /* renamed from: U0 */
    public final void mo44730U0(@Nullable View view, @Nullable Map map, @Nullable Map map2) {
        try {
            if (!this.f32812i) {
                this.f32812i = zzt.m2908u().mo20310n(this.f32808e, this.f32810g.f28446a, this.f32809f.f35496D.toString(), this.f32811h.f35631f);
            }
            if (this.f32814k) {
                zzbvz zzbvz = this.f32804a;
                if (zzbvz != null) {
                    if (!zzbvz.mo43134V()) {
                        this.f32804a.mo43132D();
                        this.f32805b.zza();
                        return;
                    }
                }
                zzbvv zzbvv = this.f32815l;
                if (zzbvv != null) {
                    if (!zzbvv.mo43092H()) {
                        this.f32815l.mo43109r();
                        this.f32805b.zza();
                        return;
                    }
                }
                zzbvw zzbvw = this.f32816m;
                if (zzbvw != null && !zzbvw.mo43114K()) {
                    this.f32816m.mo43128q();
                    this.f32805b.zza();
                }
            }
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to call recordImpression", e);
        }
    }

    /* renamed from: V0 */
    public final void mo44731V0(View view, @Nullable Map map) {
        try {
            IObjectWrapper g8 = ObjectWrapper.m5051g8(view);
            zzbvz zzbvz = this.f32804a;
            if (zzbvz != null) {
                zzbvz.mo43131B8(g8);
                return;
            }
            zzbvv zzbvv = this.f32815l;
            if (zzbvv != null) {
                zzbvv.mo43101b7(g8);
                return;
            }
            zzbvw zzbvw = this.f32816m;
            if (zzbvw != null) {
                zzbvw.mo43119Ob(g8);
            }
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to call untrackView", e);
        }
    }

    /* renamed from: W0 */
    public final void mo44732W0(View view, Map map, Map map2, boolean z) {
        if (!this.f32813j) {
            zzcgp.m45229g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f32809f.f35505M) {
            zzcgp.m45229g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            m47926a(view);
        }
    }

    @Nullable
    /* renamed from: X0 */
    public final JSONObject mo44733X0(View view, Map map, Map map2) {
        return null;
    }

    /* renamed from: Y0 */
    public final void mo44734Y0(zzcq zzcq) {
        zzcgp.m45229g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: Z0 */
    public final void mo44735Z0(View view) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44736a1(android.view.View r9, @androidx.annotation.Nullable java.util.Map r10, @androidx.annotation.Nullable java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r9)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzfdk r12 = r8.f32809f     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONObject r12 = r12.f35542l0     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbiu r13 = com.google.android.gms.internal.ads.zzbjc.f27223q1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r13 = r0.mo42663b(r13)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0124 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00e0
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0124 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00e0
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0124 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0124 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = 0
            goto L_0x00e0
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbiu r6 = com.google.android.gms.internal.ads.zzbjc.f27233r1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r6 = r7.mo42663b(r6)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0124 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.zzbvz r2 = r8.f32804a     // Catch:{ RemoteException -> 0x0124 }
            r5 = 0
            if (r2 == 0) goto L_0x0093
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.mo43147n()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x0091:
            goto L_0x00ac
        L_0x0093:
            com.google.android.gms.internal.ads.zzbvv r2 = r8.f32815l     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x009c
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.mo43094Jb()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x009c:
            com.google.android.gms.internal.ads.zzbvw r2 = r8.f32816m     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00a5
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.mo43112Ib()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r5
        L_0x00a6:
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r2)     // Catch:{  }
        L_0x00ac:
            if (r5 != 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
        L_0x00b3:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzbu.m2593c(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.zzt.m2905r()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.f32808e     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c8:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c8
            goto L_0x0045
        L_0x00e0:
            r8.f32814k = r0     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r10 = m47927b(r10)     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r11 = m47927b(r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbvz r12 = r8.f32804a     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x00fa
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo43154wa(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x00fa:
            com.google.android.gms.internal.ads.zzbvv r12 = r8.f32815l     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x010f
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo43098Nb(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbvv r10 = r8.f32815l     // Catch:{ RemoteException -> 0x0124 }
            r10.mo43097Mb(r9)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x010f:
            com.google.android.gms.internal.ads.zzbvw r12 = r8.f32816m     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x0123
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r10)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo43118Nb(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.zzbvw r10 = r8.f32816m     // Catch:{ RemoteException -> 0x0124 }
            r10.mo43117Mb(r9)     // Catch:{ RemoteException -> 0x0124 }
        L_0x0123:
            return
        L_0x0124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.internal.ads.zzcgp.m45230h(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqo.mo44736a1(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    /* renamed from: b1 */
    public final boolean mo44737b1(Bundle bundle) {
        return false;
    }

    /* renamed from: c */
    public final void mo44738c() {
        throw null;
    }

    @Nullable
    /* renamed from: c1 */
    public final JSONObject mo44739c1(View view, Map map, Map map2) {
        return null;
    }

    /* renamed from: e */
    public final void mo44740e() {
    }

    /* renamed from: f */
    public final void mo44741f() {
    }

    /* renamed from: l */
    public final void mo44743l() {
    }

    /* renamed from: s */
    public final void mo44744s() {
    }

    /* renamed from: u */
    public final void mo44745u() {
        this.f32813j = true;
    }

    /* renamed from: u1 */
    public final void mo44746u1(Bundle bundle) {
    }
}
