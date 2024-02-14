package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbpt {

    /* renamed from: a */
    public static final zzbpu f27603a = zzbpa.f27600a;

    /* renamed from: b */
    public static final zzbpu f27604b = zzbpb.f27601a;

    /* renamed from: c */
    public static final zzbpu f27605c = zzbot.f27593a;

    /* renamed from: d */
    public static final zzbpu f27606d = new zzbpl();

    /* renamed from: e */
    public static final zzbpu f27607e = new zzbpm();

    /* renamed from: f */
    public static final zzbpu f27608f = zzboz.f27599a;

    /* renamed from: g */
    public static final zzbpu f27609g = new zzbpn();

    /* renamed from: h */
    public static final zzbpu f27610h = new zzbpo();

    /* renamed from: i */
    public static final zzbpu f27611i = zzboy.f27598a;

    /* renamed from: j */
    public static final zzbpu f27612j = new zzbpp();

    /* renamed from: k */
    public static final zzbpu f27613k = new zzbpq();

    /* renamed from: l */
    public static final zzbpu f27614l = new zzckp();

    /* renamed from: m */
    public static final zzbpu f27615m = new zzckq();

    /* renamed from: n */
    public static final zzbpu f27616n = new zzbos();

    /* renamed from: o */
    public static final zzbqj f27617o = new zzbqj();

    /* renamed from: p */
    public static final zzbpu f27618p = new zzbpr();

    /* renamed from: q */
    public static final zzbpu f27619q = new zzbps();

    /* renamed from: r */
    public static final zzbpu f27620r = new zzbpc();

    /* renamed from: s */
    public static final zzbpu f27621s = new zzbpd();

    /* renamed from: t */
    public static final zzbpu f27622t = new zzbpe();

    /* renamed from: u */
    public static final zzbpu f27623u = new zzbpf();

    /* renamed from: v */
    public static final zzbpu f27624v = new zzbpg();

    /* renamed from: w */
    public static final zzbpu f27625w = new zzbph();

    /* renamed from: x */
    public static final zzbpu f27626x = new zzbpi();

    /* renamed from: y */
    public static final zzbpu f27627y = new zzbpj();

    /* renamed from: a */
    public static zzbpu m43931a(zzdkn zzdkn) {
        return new zzbox(zzdkn);
    }

    /* renamed from: b */
    public static zzfzp m43932b(zzcmp zzcmp, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzape L = zzcmp.mo44019L();
            if (L != null && L.mo41779f(parse)) {
                parse = L.mo41774a(parse, zzcmp.getContext(), zzcmp.mo44027R(), zzcmp.mo43756i());
            }
        } catch (zzapf unused) {
            zzcgp.m45229g("Unable to append parameter to URL: ".concat(str));
        }
        String b = zzcew.m45059b(parse, zzcmp.getContext());
        long longValue = ((Long) zzbkr.f27456e.mo42728e()).longValue();
        if (longValue <= 0 || longValue > 223104600) {
            return zzfzg.m51414i(b);
        }
        zzfyx C = zzfyx.m51389C(zzcmp.mo44038Z0());
        zzbou zzbou = zzbou.f27594a;
        zzfzq zzfzq = zzchc.f28461f;
        return zzfzg.m51411f(zzfzg.m51418m(zzfzg.m51411f(C, Throwable.class, zzbou, zzfzq), new zzbov(b), zzfzq), Throwable.class, new zzbow(b), zzfzq);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m43933c(com.google.android.gms.internal.ads.zzcnq r16, java.util.Map r17) {
        /*
            java.lang.String r1 = "openableIntents"
            android.content.Context r0 = r16.getContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r0 = "data"
            r3 = r17
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0107 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r0 = "intents"
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x00fa }
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0026:
            int r0 = r3.length()
            if (r6 >= r0) goto L_0x00f2
            org.json.JSONObject r0 = r3.getJSONObject(r6)     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r0.optString(r7)
            java.lang.String r8 = "u"
            java.lang.String r8 = r0.optString(r8)
            java.lang.String r9 = "i"
            java.lang.String r9 = r0.optString(r9)
            java.lang.String r10 = "m"
            java.lang.String r10 = r0.optString(r10)
            java.lang.String r11 = "p"
            java.lang.String r11 = r0.optString(r11)
            java.lang.String r12 = "c"
            java.lang.String r12 = r0.optString(r12)
            java.lang.String r13 = "intent_url"
            java.lang.String r13 = r0.optString(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r14 = 0
            if (r0 != 0) goto L_0x0075
            android.content.Intent r0 = android.content.Intent.parseUri(r13, r5)     // Catch:{ URISyntaxException -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r13 = "Error parsing the url: "
            java.lang.String r0 = r13.concat(r0)
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r15)
        L_0x0075:
            r0 = r14
        L_0x0076:
            r13 = 1
            if (r0 != 0) goto L_0x00c2
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x008b
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.setData(r8)
        L_0x008b:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto L_0x0094
            r0.setAction(r9)
        L_0x0094:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 != 0) goto L_0x009d
            r0.setType(r10)
        L_0x009d:
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L_0x00a6
            r0.setPackage(r11)
        L_0x00a6:
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L_0x00c2
            java.lang.String r8 = "/"
            r9 = 2
            java.lang.String[] r8 = r12.split(r8, r9)
            int r10 = r8.length
            if (r10 != r9) goto L_0x00c2
            android.content.ComponentName r9 = new android.content.ComponentName
            r10 = r8[r5]
            r8 = r8[r13]
            r9.<init>(r10, r8)
            r0.setComponent(r9)
        L_0x00c2:
            r8 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r14 = r2.resolveActivity(r8, r0)     // Catch:{ NullPointerException -> 0x00ca }
            goto L_0x00d7
        L_0x00ca:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.internal.ads.zzcfy r0 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r8 = r8.toString()
            r0.mo43503t(r9, r8)
        L_0x00d7:
            if (r14 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            r4.put(r7, r13)     // Catch:{ JSONException -> 0x00df }
            goto L_0x00ee
        L_0x00df:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Error constructing openable urls response."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r7)
            goto L_0x00ee
        L_0x00e7:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Error parsing the intent data."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r7)
        L_0x00ee:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x00f2:
            r0 = r16
            com.google.android.gms.internal.ads.zzbsn r0 = (com.google.android.gms.internal.ads.zzbsn) r0
            r0.mo42953b(r1, r4)
            return
        L_0x00fa:
            r0 = r16
            com.google.android.gms.internal.ads.zzbsn r0 = (com.google.android.gms.internal.ads.zzbsn) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.mo42953b(r1, r2)
            return
        L_0x0107:
            r0 = r16
            com.google.android.gms.internal.ads.zzbsn r0 = (com.google.android.gms.internal.ads.zzbsn) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.mo42953b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpt.m43933c(com.google.android.gms.internal.ads.zzcnq, java.util.Map):void");
    }

    /* renamed from: d */
    public static void m43934d(Map map, zzdkn zzdkn) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27280v8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdkn != null) {
            zzdkn.mo44113s();
        }
    }
}
