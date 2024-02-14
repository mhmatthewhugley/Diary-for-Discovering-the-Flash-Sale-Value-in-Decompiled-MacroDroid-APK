package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdol extends zzcze {

    /* renamed from: G */
    public static final zzfvn f32596G = zzfvn.m51128I("3010", "3008", "1005", "1009", "2011", "2007");

    /* renamed from: A */
    private final Context f32597A;

    /* renamed from: B */
    private final zzdon f32598B;

    /* renamed from: C */
    private final zzeoi f32599C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Map f32600D = new HashMap();

    /* renamed from: E */
    private final List f32601E = new ArrayList();

    /* renamed from: F */
    private final zzbbs f32602F;

    /* renamed from: i */
    private final Executor f32603i;

    /* renamed from: j */
    private final zzdoq f32604j;

    /* renamed from: k */
    private final zzdoy f32605k;

    /* renamed from: l */
    private final zzdpq f32606l;

    /* renamed from: m */
    private final zzdov f32607m;

    /* renamed from: n */
    private final zzdpb f32608n;

    /* renamed from: o */
    private final zzgxc f32609o;

    /* renamed from: p */
    private final zzgxc f32610p;

    /* renamed from: q */
    private final zzgxc f32611q;

    /* renamed from: r */
    private final zzgxc f32612r;

    /* renamed from: s */
    private final zzgxc f32613s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public zzdql f32614t;

    /* renamed from: u */
    private boolean f32615u;

    /* renamed from: v */
    private boolean f32616v;

    /* renamed from: w */
    private boolean f32617w;

    /* renamed from: x */
    private final zzcec f32618x;

    /* renamed from: y */
    private final zzape f32619y;

    /* renamed from: z */
    private final zzcgv f32620z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdol(zzczd zzczd, Executor executor, zzdoq zzdoq, zzdoy zzdoy, zzdpq zzdpq, zzdov zzdov, zzdpb zzdpb, zzgxc zzgxc, zzgxc zzgxc2, zzgxc zzgxc3, zzgxc zzgxc4, zzgxc zzgxc5, zzcec zzcec, zzape zzape, zzcgv zzcgv, Context context, zzdon zzdon, zzeoi zzeoi, zzbbs zzbbs) {
        super(zzczd);
        this.f32603i = executor;
        this.f32604j = zzdoq;
        this.f32605k = zzdoy;
        this.f32606l = zzdpq;
        this.f32607m = zzdov;
        this.f32608n = zzdpb;
        this.f32609o = zzgxc;
        this.f32610p = zzgxc2;
        this.f32611q = zzgxc3;
        this.f32612r = zzgxc4;
        this.f32613s = zzgxc5;
        this.f32618x = zzcec;
        this.f32619y = zzape;
        this.f32620z = zzcgv;
        this.f32597A = context;
        this.f32598B = zzdon;
        this.f32599C = zzeoi;
        this.f32602F = zzbbs;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final synchronized void mo44770O(zzdql zzdql) {
        View view;
        zzapa c;
        if (!this.f32615u) {
            this.f32614t = zzdql;
            this.f32606l.mo44902e(zzdql);
            this.f32605k.mo44736a1(zzdql.mo44874c(), zzdql.mo44881k(), zzdql.mo44884n(), zzdql, zzdql);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27134h2)).booleanValue() && (c = this.f32619y.mo41776c()) != null) {
                c.mo20427a(zzdql.mo44874c());
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27303y1)).booleanValue()) {
                zzfdk zzfdk = this.f31896b;
                if (zzfdk.f35544m0) {
                    Iterator<String> keys = zzfdk.f35542l0.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.f32614t.mo44880j().get(next);
                            this.f32600D.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                zzbbr zzbbr = new zzbbr(this.f32597A, view);
                                this.f32601E.add(zzbbr);
                                zzbbr.mo42398c(new zzdok(this, next));
                            }
                        }
                    }
                }
            }
            if (zzdql.mo44876g() != null) {
                zzdql.mo44876g().mo42398c(this.f32618x);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void mo44771P(zzdql zzdql) {
        this.f32605k.mo44731V0(zzdql.mo44874c(), zzdql.mo44880j());
        if (zzdql.mo44875e() != null) {
            zzdql.mo44875e().setClickable(false);
            zzdql.mo44875e().removeAllViews();
        }
        if (zzdql.mo44876g() != null) {
            zzdql.mo44876g().mo42400e(this.f32618x);
        }
        this.f32614t = null;
    }

    /* renamed from: I */
    public static /* synthetic */ void m47658I(zzdol zzdol) {
        try {
            zzdoq zzdoq = zzdol.f32604j;
            int K = zzdoq.mo44798K();
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 6) {
                            if (K != 7) {
                                zzcgp.m45226d("Wrong native template id!");
                                return;
                            }
                            zzdpb zzdpb = zzdol.f32608n;
                            if (zzdpb.mo44868g() != null) {
                                zzdpb.mo44868g().mo42951U1((zzbsf) zzdol.f32612r.zzb());
                            }
                        } else if (zzdol.f32608n.mo44867f() != null) {
                            zzdol.mo44767L("Google", true);
                            zzdol.f32608n.mo44867f().mo42826y8((zzbob) zzdol.f32611q.zzb());
                        }
                    } else if (zzdol.f32608n.mo44865d(zzdoq.mo44826g0()) != null) {
                        if (zzdol.f32604j.mo44813Z() != null) {
                            zzdol.mo44767L("Google", true);
                        }
                        zzdol.f32608n.mo44865d(zzdol.f32604j.mo44826g0()).mo42823La((zzbmy) zzdol.f32613s.zzb());
                    }
                } else if (zzdol.f32608n.mo44862a() != null) {
                    zzdol.mo44767L("Google", true);
                    zzdol.f32608n.mo44862a().mo42820K3((zzbmt) zzdol.f32610p.zzb());
                }
            } else if (zzdol.f32608n.mo44863b() != null) {
                zzdol.mo44767L("Google", true);
                zzdol.f32608n.mo44863b().mo42821r2((zzbmv) zzdol.f32609o.zzb());
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: w */
    public static boolean m47659w(View view) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27210o8)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        zzt.m2905r();
        long Q = zzs.m2743Q(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (Q >= ((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27220p8)).intValue())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: y */
    private final synchronized View m47660y(Map map) {
        if (map == null) {
            return null;
        }
        zzfvn zzfvn = f32596G;
        int size = zzfvn.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfvn.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    /* renamed from: z */
    private final synchronized void m47661z(View view, Map map, Map map2) {
        this.f32606l.mo44901d(this.f32614t);
        this.f32605k.mo44730U0(view, map, map2);
        this.f32616v = true;
    }

    /* renamed from: C */
    public final zzdon mo44761C() {
        return this.f32598B;
    }

    /* renamed from: E */
    public final String mo44762E() {
        return this.f32607m.mo44848b();
    }

    /* renamed from: G */
    public final synchronized JSONObject mo44763G(View view, Map map, Map map2) {
        return this.f32605k.mo44733X0(view, map, map2);
    }

    /* renamed from: H */
    public final synchronized JSONObject mo44764H(View view, Map map, Map map2) {
        return this.f32605k.mo44739c1(view, map, map2);
    }

    /* renamed from: J */
    public final void mo44765J(View view) {
        IObjectWrapper c0 = this.f32604j.mo44818c0();
        if (this.f32607m.mo44850d() && c0 != null && view != null) {
            zzt.m2888a();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue() && zzfkp.m50420b()) {
                Object A1 = ObjectWrapper.m5050A1(c0);
                if (A1 instanceof zzfkr) {
                    ((zzfkr) A1).mo45866b(view, zzfkx.NOT_VISIBLE, "Ad overlay");
                }
            }
        }
    }

    /* renamed from: K */
    public final synchronized void mo44766K() {
        this.f32605k.mo44741f();
    }

    /* renamed from: L */
    public final void mo44767L(String str, boolean z) {
        String str2;
        zzeha zzeha;
        zzehb zzehb;
        if (this.f32607m.mo44850d() && !TextUtils.isEmpty(str)) {
            zzdoq zzdoq = this.f32604j;
            zzcmp Y = zzdoq.mo44812Y();
            zzcmp Z = zzdoq.mo44813Z();
            if (Y == null && Z == null) {
                zzcgp.m45229g("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z2 = false;
            boolean z3 = Y != null;
            boolean z4 = Z != null;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27166k4)).booleanValue()) {
                this.f32607m.mo44847a();
                int b = this.f32607m.mo44847a().mo45628b();
                int i = b - 1;
                if (i != 0) {
                    if (i != 1) {
                        zzcgp.m45229g("Unknown omid media type: " + (b != 1 ? b != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return;
                    } else if (Y != null) {
                        z2 = true;
                        z4 = false;
                    } else {
                        zzcgp.m45229g("Omid media type was display but there was no display webview.");
                        return;
                    }
                } else if (Z != null) {
                    z4 = true;
                } else {
                    zzcgp.m45229g("Omid media type was video but there was no video webview.");
                    return;
                }
            } else {
                z2 = z3;
            }
            if (z2) {
                str2 = null;
            } else {
                str2 = "javascript";
                Y = Z;
            }
            String str3 = str2;
            Y.mo44029S();
            if (!zzt.m2888a().mo45294d(this.f32597A)) {
                zzcgp.m45229g("Failed to initialize omid in InternalNativeAd");
                return;
            }
            zzcgv zzcgv = this.f32620z;
            String str4 = zzcgv.f28447c + "." + zzcgv.f28448d;
            if (z4) {
                zzeha = zzeha.VIDEO;
                zzehb = zzehb.DEFINED_BY_JAVASCRIPT;
            } else {
                zzeha = zzeha.NATIVE_DISPLAY;
                if (this.f32604j.mo44798K() == 3) {
                    zzehb = zzehb.UNSPECIFIED;
                } else {
                    zzehb = zzehb.ONE_PIXEL;
                }
            }
            IObjectWrapper b2 = zzt.m2888a().mo45292b(str4, Y.mo44029S(), "", "javascript", str3, str, zzehb, zzeha, this.f31896b.f35546n0);
            if (b2 == null) {
                zzcgp.m45229g("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.f32604j.mo44796B(b2);
            Y.mo44015F0(b2);
            if (z4) {
                zzt.m2888a().mo45293c(b2, Z.mo44027R());
                this.f32617w = true;
            }
            if (z) {
                zzt.m2888a().mo45295d0(b2);
                Y.mo42954y("onSdkLoaded", new ArrayMap());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo44768M() {
        this.f32605k.mo44740e();
        this.f32604j.mo44825g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo44769N(boolean z) {
        this.f32605k.mo44732W0(this.f32614t.mo44874c(), this.f32614t.mo44880j(), this.f32614t.mo44881k(), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        return;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44772Q(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f32616v     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27303y1     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzfdk r0 = r3.f31896b     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.f35544m0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r3.f32600D     // Catch:{ all -> 0x00f2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f2 }
            java.util.Map r2 = r3.f32600D     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f2 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            if (r7 != 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzbiu r7 = com.google.android.gms.internal.ads.zzbjc.f27055Z2     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r0.mo42663b(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00f2 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0063:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00f2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f2 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f2 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = m47659w(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            r3.m47661z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0088:
            monitor-exit(r3)
            return
        L_0x008a:
            android.view.View r7 = r3.m47660y(r5)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x0095
            r3.m47661z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27065a3     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00b4
            boolean r7 = m47659w(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00b2
            r3.m47661z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00b2:
            monitor-exit(r3)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27075b3     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ed
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            r1 = 0
            boolean r1 = r7.getGlobalVisibleRect(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00eb
            int r1 = r7.getHeight()     // Catch:{ all -> 0x00f2 }
            int r2 = r0.height()     // Catch:{ all -> 0x00f2 }
            if (r1 != r2) goto L_0x00eb
            int r7 = r7.getWidth()     // Catch:{ all -> 0x00f2 }
            int r0 = r0.width()     // Catch:{ all -> 0x00f2 }
            if (r7 != r0) goto L_0x00eb
            r3.m47661z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00eb:
            monitor-exit(r3)
            return
        L_0x00ed:
            r3.m47661z(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00f2:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdol.mo44772Q(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: R */
    public final synchronized void mo44773R(@Nullable zzcu zzcu) {
        this.f32605k.mo44725P0(zzcu);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44774S(android.view.View r9, android.view.View r10, java.util.Map r11, java.util.Map r12, boolean r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.zzdpq r0 = r8.f32606l     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzdql r1 = r8.f32614t     // Catch:{ all -> 0x0031 }
            r0.mo44900c(r1)     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzdoy r2 = r8.f32605k     // Catch:{ all -> 0x0031 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.mo44729T0(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0031 }
            boolean r9 = r8.f32617w     // Catch:{ all -> 0x0031 }
            if (r9 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzdoq r9 = r8.f32604j     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzcmp r10 = r9.mo44813Z()     // Catch:{ all -> 0x0031 }
            if (r10 != 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            com.google.android.gms.internal.ads.zzcmp r9 = r9.mo44813Z()     // Catch:{ all -> 0x0031 }
            androidx.collection.ArrayMap r10 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0031 }
            r10.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r11 = "onSdkAdUserInteractionClick"
            r9.mo42954y(r11, r10)     // Catch:{ all -> 0x0031 }
            monitor-exit(r8)
            return
        L_0x002f:
            monitor-exit(r8)
            return
        L_0x0031:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdol.mo44774S(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: T */
    public final synchronized void mo44775T(String str) {
        this.f32605k.mo44728S0(str);
    }

    /* renamed from: U */
    public final synchronized void mo44776U(Bundle bundle) {
        this.f32605k.mo44724O0(bundle);
    }

    /* renamed from: a */
    public final synchronized void mo44439a() {
        this.f32615u = true;
        this.f32603i.execute(new zzdoj(this));
        super.mo44439a();
    }

    @AnyThread
    /* renamed from: b */
    public final void mo44461b() {
        this.f32603i.execute(new zzdof(this));
        if (this.f32604j.mo44798K() != 7) {
            Executor executor = this.f32603i;
            zzdoy zzdoy = this.f32605k;
            zzdoy.getClass();
            executor.execute(new zzdog(zzdoy));
        }
        super.mo44461b();
    }

    /* renamed from: h */
    public final synchronized void mo44777h() {
        zzdql zzdql = this.f32614t;
        if (zzdql == null) {
            zzcgp.m45224b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f32603i.execute(new zzdoh(this, zzdql instanceof zzdpk));
        }
    }

    /* renamed from: i */
    public final synchronized void mo44778i() {
        if (!this.f32616v) {
            this.f32605k.mo44744s();
        }
    }

    /* renamed from: j */
    public final void mo44779j(View view) {
        zzdoq zzdoq = this.f32604j;
        IObjectWrapper c0 = zzdoq.mo44818c0();
        zzcmp Y = zzdoq.mo44812Y();
        if (this.f32607m.mo44850d() && c0 != null && Y != null && view != null) {
            zzt.m2888a().mo45293c(c0, view);
        }
    }

    /* renamed from: k */
    public final synchronized void mo44780k(View view, MotionEvent motionEvent, View view2) {
        this.f32605k.mo44727R0(view, motionEvent, view2);
    }

    /* renamed from: l */
    public final synchronized void mo44781l(Bundle bundle) {
        this.f32605k.mo44746u1(bundle);
    }

    /* renamed from: m */
    public final synchronized void mo44782m(View view) {
        this.f32605k.mo44735Z0(view);
    }

    /* renamed from: n */
    public final synchronized void mo44783n() {
        this.f32605k.mo44745u();
    }

    /* renamed from: o */
    public final synchronized void mo44784o(zzcq zzcq) {
        this.f32605k.mo44734Y0(zzcq);
    }

    /* renamed from: p */
    public final synchronized void mo44785p(zzde zzde) {
        this.f32599C.mo45401b(zzde);
    }

    /* renamed from: q */
    public final synchronized void mo44786q(zzbny zzbny) {
        this.f32605k.mo44726Q0(zzbny);
    }

    /* renamed from: r */
    public final synchronized void mo44787r(zzdql zzdql) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27283w1)).booleanValue()) {
            zzs.f2304i.post(new zzdoi(this, zzdql));
        } else {
            mo44770O(zzdql);
        }
    }

    /* renamed from: s */
    public final synchronized void mo44788s(zzdql zzdql) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27283w1)).booleanValue()) {
            zzs.f2304i.post(new zzdoe(this, zzdql));
        } else {
            mo44771P(zzdql);
        }
    }

    /* renamed from: t */
    public final boolean mo44789t() {
        return this.f32607m.mo44851e();
    }

    /* renamed from: u */
    public final synchronized boolean mo44790u() {
        return this.f32605k.mo44723I();
    }

    /* renamed from: v */
    public final boolean mo44791v() {
        return this.f32607m.mo44850d();
    }

    /* renamed from: x */
    public final synchronized boolean mo44792x(Bundle bundle) {
        if (this.f32616v) {
            return true;
        }
        boolean b1 = this.f32605k.mo44737b1(bundle);
        this.f32616v = b1;
        return b1;
    }
}
