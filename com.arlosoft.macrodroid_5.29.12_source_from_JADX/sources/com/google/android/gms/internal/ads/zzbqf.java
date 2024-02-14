package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbqf implements zzbpu {
    @Nullable

    /* renamed from: a */
    private final zzb f27648a;
    @Nullable

    /* renamed from: b */
    private final zzdxq f27649b;
    @Nullable

    /* renamed from: c */
    private final zzfir f27650c;

    /* renamed from: d */
    private final zzcgu f27651d;
    @Nullable

    /* renamed from: e */
    private final zzbxz f27652e;
    @Nullable

    /* renamed from: f */
    private final zzego f27653f;

    /* renamed from: g */
    private zzx f27654g = null;

    public zzbqf(zzb zzb, zzbxz zzbxz, zzego zzego, zzdxq zzdxq, zzfir zzfir) {
        this.f27648a = zzb;
        this.f27652e = zzbxz;
        this.f27653f = zzego;
        this.f27649b = zzdxq;
        this.f27650c = zzfir;
        this.f27651d = new zzcgu((String) null);
    }

    /* renamed from: b */
    public static int m43959b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    /* renamed from: c */
    static Uri m43960c(Context context, zzape zzape, Uri uri, View view, @Nullable Activity activity) {
        if (zzape == null) {
            return uri;
        }
        try {
            if (zzape.mo41778e(uri)) {
                return zzape.mo41774a(uri, context, view, activity);
            }
            return uri;
        } catch (zzapf unused) {
            return uri;
        } catch (Exception e) {
            zzt.m2904q().mo43503t(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static Uri m43961d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcgp.m45227e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    /* renamed from: f */
    public static boolean m43962f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r3 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m43964h(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 1
            r1.m43965i(r3)
            r4 = r0
            com.google.android.gms.internal.ads.zzcmp r4 = (com.google.android.gms.internal.ads.zzcmp) r4
            android.content.Context r5 = r4.getContext()
            com.google.android.gms.internal.ads.zzape r6 = r4.mo44019L()
            android.view.View r7 = r4.mo44027R()
            java.lang.String r8 = "activity"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.lang.String r9 = "u"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 == 0) goto L_0x0032
            goto L_0x0133
        L_0x0032:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri r9 = m43960c(r5, r6, r9, r7, r11)
            android.net.Uri r9 = m43961d(r9)
            java.lang.String r10 = "use_first_package"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.String r12 = "use_running_process"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            java.lang.String r13 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f26860F3
            com.google.android.gms.internal.ads.zzbja r14 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r2 = r14.mo42663b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.String r2 = r9.getScheme()
            java.lang.String r14 = "http"
            boolean r2 = r14.equalsIgnoreCase(r2)
            java.lang.String r15 = "https"
            if (r2 == 0) goto L_0x0093
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
            android.net.Uri r11 = r2.build()
            goto L_0x00a9
        L_0x0093:
            java.lang.String r2 = r9.getScheme()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a9
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r14)
            android.net.Uri r11 = r2.build()
        L_0x00a9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.zzbqe.m43955a(r9, r5, r6, r7)
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbqe.m43955a(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00c4
            com.google.android.gms.ads.internal.zzt.m2905r()
            com.google.android.gms.ads.internal.util.zzs.m2736J(r5, r9)
            com.google.android.gms.ads.internal.zzt.m2905r()
            com.google.android.gms.ads.internal.util.zzs.m2736J(r5, r11)
        L_0x00c4:
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbqe.m43958d(r9, r2, r5, r6, r7)
            if (r3 == 0) goto L_0x00cf
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbqe.m43956b(r9, r3, r5, r6, r7)
            goto L_0x0133
        L_0x00cf:
            if (r11 == 0) goto L_0x00e1
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbqe.m43957c(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00e1
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbqe.m43956b(r9, r3, r5, r6, r7)
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbqe.m43957c(r11, r5, r6, r7)
            if (r3 != 0) goto L_0x0133
        L_0x00e1:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00e8
            goto L_0x0132
        L_0x00e8:
            if (r12 == 0) goto L_0x0124
            if (r8 == 0) goto L_0x0124
            java.util.List r3 = r8.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0124
            int r8 = r2.size()
            r11 = 0
        L_0x00f7:
            if (r11 >= r8) goto L_0x0124
            java.lang.Object r12 = r2.get(r11)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r14 = r3.iterator()
        L_0x0103:
            int r15 = r11 + 1
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0122
            java.lang.Object r15 = r14.next()
            android.app.ActivityManager$RunningAppProcessInfo r15 = (android.app.ActivityManager.RunningAppProcessInfo) r15
            java.lang.String r15 = r15.processName
            android.content.pm.ActivityInfo r13 = r12.activityInfo
            java.lang.String r13 = r13.packageName
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0103
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbqe.m43956b(r9, r12, r5, r6, r7)
            goto L_0x0133
        L_0x0122:
            r11 = r15
            goto L_0x00f7
        L_0x0124:
            if (r10 == 0) goto L_0x0132
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbqe.m43956b(r9, r2, r5, r6, r7)
            goto L_0x0133
        L_0x0132:
            r11 = r9
        L_0x0133:
            if (r20 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzego r2 = r1.f27653f
            if (r2 == 0) goto L_0x0151
            if (r11 == 0) goto L_0x0151
            android.content.Context r2 = r4.getContext()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r4 = r21
            boolean r2 = r1.m43966j(r0, r2, r3, r4)
            if (r2 != 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            return
        L_0x0151:
            com.google.android.gms.internal.ads.zzcnu r0 = (com.google.android.gms.internal.ads.zzcnu) r0     // Catch:{ ActivityNotFoundException -> 0x0160 }
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch:{ ActivityNotFoundException -> 0x0160 }
            com.google.android.gms.ads.internal.overlay.zzx r3 = r1.f27654g     // Catch:{ ActivityNotFoundException -> 0x0160 }
            r2.<init>(r11, r3)     // Catch:{ ActivityNotFoundException -> 0x0160 }
            r3 = r22
            r0.mo44139N0(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x0160 }
            return
        L_0x0160:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.ads.zzcgp.m45229g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqf.m43964h(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    /* renamed from: i */
    private final void m43965i(boolean z) {
        zzbxz zzbxz = this.f27652e;
        if (zzbxz != null) {
            zzbxz.mo43199h(z);
        }
    }

    /* renamed from: j */
    private final boolean m43966j(zza zza, Context context, String str, String str2) {
        String str3 = str2;
        Context context2 = context;
        boolean v = zzt.m2904q().mo43505v(context);
        zzt.m2905r();
        zzbr T = zzs.m2746T(context);
        zzdxq zzdxq = this.f27649b;
        if (zzdxq != null) {
            zzegw.m48813Kb(context, zzdxq, this.f27650c, this.f27653f, str2, "offline_open");
        }
        zzcmp zzcmp = (zzcmp) zza;
        boolean z = zzcmp.mo44009C().mo44186i() && zzcmp.mo43756i() == null;
        if (v) {
            this.f27653f.mo45282j(this.f27651d, str3);
            return false;
        }
        zzt.m2905r();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && T != null && !z) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27169k7)).booleanValue()) {
                if (zzcmp.mo44009C().mo44186i()) {
                    zzegw.m48815Mb(zzcmp.mo43756i(), (zzl) null, T, this.f27653f, this.f27649b, this.f27650c, str2, str);
                } else {
                    ((zzcnu) zza).mo44141Y0(T, this.f27653f, this.f27649b, this.f27650c, str2, str, 14);
                }
                zzdxq zzdxq2 = this.f27649b;
                if (zzdxq2 != null) {
                    zzegw.m48813Kb(context, zzdxq2, this.f27650c, this.f27653f, str2, "dialog_impression");
                }
                zza.onAdClicked();
                return true;
            }
        }
        this.f27653f.mo45278e(str3);
        if (this.f27649b != null) {
            HashMap hashMap = new HashMap();
            zzt.m2905r();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (T == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27169k7)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzegw.m48814Lb(context, this.f27649b, this.f27650c, this.f27653f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m43967k(int i) {
        if (this.f27649b != null) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27249s7)).booleanValue()) {
                zzfir zzfir = this.f27650c;
                zzfiq b = zzfiq.m50227b("cct_action");
                b.mo45774a("cct_open_status", zzbjz.m43592a(i));
                zzfir.mo45782a(b);
                return;
            }
            zzdxp a = this.f27649b.mo45050a();
            a.mo45041b("action", "cct_action");
            a.mo45041b("cct_open_status", zzbjz.m43592a(i));
            a.mo45046g();
        }
    }

    /* renamed from: e */
    public final void mo42867a(zza zza, Map map) {
        String str;
        boolean z;
        Object obj;
        HashMap hashMap;
        zza zza2 = zza;
        Map map2 = map;
        zzcmp zzcmp = (zzcmp) zza2;
        String c = zzcew.m45060c((String) map2.get("u"), zzcmp.getContext(), true);
        String str2 = (String) map2.get("a");
        if (str2 == null) {
            zzcgp.m45229g("Action missing from an open GMSG.");
            return;
        }
        zzb zzb = this.f27648a;
        if (zzb == null || zzb.mo20416c()) {
            zzfdk t = zzcmp.mo43986t();
            zzfdn O = zzcmp.mo44022O();
            boolean z2 = false;
            if (t == null || O == null) {
                str = "";
                z = false;
            } else {
                z = t.f35540k0;
                str = O.f35566b;
            }
            boolean z3 = !((Boolean) zzay.m1924c().mo42663b(zzbjc.f27270u8)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals("0");
            if ("expand".equalsIgnoreCase(str2)) {
                if (zzcmp.mo44055j0()) {
                    zzcgp.m45229g("Cannot expand WebView that is already expanded.");
                    return;
                }
                m43965i(false);
                ((zzcnu) zza2).mo44140W0(m43962f(map), m43959b(map), z3);
            } else if ("webapp".equalsIgnoreCase(str2)) {
                m43965i(false);
                if (c != null) {
                    ((zzcnu) zza2).mo44138M0(m43962f(map), m43959b(map), c, z3);
                } else {
                    ((zzcnu) zza2).mo44142c1(m43962f(map), m43959b(map), (String) map2.get("html"), (String) map2.get("baseurl"), z3);
                }
            } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = zzcmp.getContext();
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26880H3)).booleanValue()) {
                    if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26940N3)).booleanValue()) {
                        zze.m2645k("User opt out chrome custom tab.");
                    } else {
                        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26920L3)).booleanValue()) {
                            z2 = true;
                        } else {
                            String str3 = (String) zzay.m1924c().mo42663b(zzbjc.f26930M3);
                            if (!str3.isEmpty() && context != null) {
                                String packageName = context.getPackageName();
                                Iterator it = zzftk.m50964c(zzfsj.m50923c(';')).mo46184d(str3).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((String) it.next()).equals(packageName)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                }
                boolean g = zzbka.m43635g(zzcmp.getContext());
                if (z2) {
                    if (!g) {
                        m43967k(4);
                    } else {
                        m43965i(true);
                        if (TextUtils.isEmpty(c)) {
                            zzcgp.m45229g("Cannot open browser with null or empty url");
                            m43967k(7);
                            return;
                        }
                        Uri d = m43961d(m43960c(zzcmp.getContext(), zzcmp.mo44019L(), Uri.parse(c), zzcmp.mo44027R(), zzcmp.mo43756i()));
                        if (!z || this.f27653f == null || !m43966j(zza2, zzcmp.getContext(), d.toString(), str)) {
                            this.f27654g = new zzbqc(this);
                            ((zzcnu) zza2).mo44139N0(new zzc((String) null, d.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, ObjectWrapper.m5051g8(this.f27654g).asBinder(), true), z3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                m43964h(zza, map, z, str, z3);
            } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                m43964h(zza, map, z, str, z3);
            } else if ("open_app".equalsIgnoreCase(str2)) {
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27089c7)).booleanValue()) {
                    m43965i(true);
                    String str4 = (String) map2.get("p");
                    if (str4 == null) {
                        zzcgp.m45229g("Package name missing from open app action.");
                    } else if (!z || this.f27653f == null || !m43966j(zza2, zzcmp.getContext(), str4, str)) {
                        PackageManager packageManager = zzcmp.getContext().getPackageManager();
                        if (packageManager == null) {
                            zzcgp.m45229g("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            ((zzcnu) zza2).mo44139N0(new zzc(launchIntentForPackage, this.f27654g), z3);
                        }
                    }
                }
            } else {
                m43965i(true);
                String str5 = (String) map2.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        intent = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e) {
                        zzcgp.m45227e("Error parsing the url: ".concat(String.valueOf(str5)), e);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri d2 = m43961d(m43960c(zzcmp.getContext(), zzcmp.mo44019L(), data, zzcmp.mo44027R(), zzcmp.mo43756i()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27099d7)).booleanValue()) {
                                intent2.setDataAndType(d2, intent2.getType());
                            }
                        }
                        intent2.setData(d2);
                    }
                }
                boolean z4 = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27209o7)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z4) {
                    hashMap = hashMap2;
                    obj = "p";
                    zzbqd zzbqd = r1;
                    zzbqd zzbqd2 = new zzbqd(this, z3, zza, hashMap2, map);
                    this.f27654g = zzbqd;
                    z3 = false;
                } else {
                    hashMap = hashMap2;
                    obj = "p";
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    if (!TextUtils.isEmpty(c)) {
                        c = m43961d(m43960c(zzcmp.getContext(), zzcmp.mo44019L(), Uri.parse(c), zzcmp.mo44027R(), zzcmp.mo43756i())).toString();
                    }
                    if (!z || this.f27653f == null || !m43966j(zza2, zzcmp.getContext(), c, str)) {
                        ((zzcnu) zza2).mo44139N0(new zzc((String) map2.get("i"), c, (String) map2.get("m"), (String) map2.get(obj), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.f27654g), z3);
                    } else if (z4) {
                        hashMap3.put((String) map2.get("event_id"), Boolean.TRUE);
                        ((zzbsn) zza2).mo42954y("openIntentAsync", hashMap3);
                    }
                } else if (!z || this.f27653f == null || !m43966j(zza2, zzcmp.getContext(), intent2.getData().toString(), str)) {
                    ((zzcnu) zza2).mo44139N0(new zzc(intent2, this.f27654g), z3);
                } else if (z4) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbsn) zza2).mo42954y("openIntentAsync", hashMap4);
                }
            }
        } else {
            this.f27648a.mo20415b(c);
        }
    }
}
