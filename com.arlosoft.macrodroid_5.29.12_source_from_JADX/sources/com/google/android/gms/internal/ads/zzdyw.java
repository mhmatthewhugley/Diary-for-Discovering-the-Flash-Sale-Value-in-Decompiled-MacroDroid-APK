package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdyw extends zzbqt {

    /* renamed from: a */
    private final zzdyz f33412a;

    /* renamed from: c */
    private final zzdyu f33413c;

    /* renamed from: d */
    private final Map f33414d = new HashMap();

    zzdyw(zzdyz zzdyz, zzdyu zzdyu) {
        this.f33412a = zzdyz;
        this.f33413c = zzdyu;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Kb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.ads.internal.client.zzl m48414Kb(java.util.Map r30) {
        /*
            com.google.android.gms.ads.internal.client.zzm r0 = new com.google.android.gms.ads.internal.client.zzm
            r0.<init>()
            java.lang.String r1 = "ad_request"
            r2 = r30
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0016
            com.google.android.gms.ads.internal.client.zzl r0 = r0.mo20149a()
            return r0
        L_0x0016:
            java.lang.String r1 = android.net.Uri.decode(r1)
            android.util.JsonReader r2 = new android.util.JsonReader
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r1)
            r2.<init>(r3)
            r2.beginObject()     // Catch:{ IOException -> 0x010e }
        L_0x0027:
            boolean r1 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r2.nextName()     // Catch:{ IOException -> 0x010e }
            int r3 = r1.hashCode()     // Catch:{ IOException -> 0x010e }
            r4 = 1
            r5 = 0
            switch(r3) {
                case -1289032093: goto L_0x0077;
                case -839117230: goto L_0x006d;
                case -733436947: goto L_0x0063;
                case -99890337: goto L_0x0059;
                case 523149226: goto L_0x004f;
                case 597632527: goto L_0x0045;
                case 1411582723: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0081
        L_0x003b:
            java.lang.String r3 = "tagForChildDirectedTreatment"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 3
            goto L_0x0082
        L_0x0045:
            java.lang.String r3 = "maxAdContentRating"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 5
            goto L_0x0082
        L_0x004f:
            java.lang.String r3 = "keywords"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0059:
            java.lang.String r3 = "httpTimeoutMillis"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 6
            goto L_0x0082
        L_0x0063:
            java.lang.String r3 = "tagForUnderAgeOfConsent"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 4
            goto L_0x0082
        L_0x006d:
            java.lang.String r3 = "isTestDevice"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 2
            goto L_0x0082
        L_0x0077:
            java.lang.String r3 = "extras"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 0
            goto L_0x0082
        L_0x0081:
            r1 = -1
        L_0x0082:
            switch(r1) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0091;
                case 6: goto L_0x0089;
                default: goto L_0x0085;
            }
        L_0x0085:
            r2.skipValue()     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x0089:
            int r1 = r2.nextInt()     // Catch:{ IOException -> 0x010e }
            r0.mo20151c(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x0091:
            java.lang.String r1 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            java.util.List r3 = com.google.android.gms.ads.RequestConfiguration.f1702e     // Catch:{ IOException -> 0x010e }
            boolean r3 = r3.contains(r1)     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x0027
            r0.mo20154f(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00a1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x00ac
            r0.mo20156h(r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00ac:
            r0.mo20156h(r5)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00b1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x00bc
            r0.mo20155g(r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00bc:
            r0.mo20155g(r5)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00c1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            r0.mo20152d(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00ca:
            r2.beginArray()     // Catch:{ IOException -> 0x010e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x010e }
            r1.<init>()     // Catch:{ IOException -> 0x010e }
        L_0x00d2:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            r1.add(r3)     // Catch:{ IOException -> 0x010e }
            goto L_0x00d2
        L_0x00e0:
            r2.endArray()     // Catch:{ IOException -> 0x010e }
            r0.mo20153e(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00e8:
            r2.beginObject()     // Catch:{ IOException -> 0x010e }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ IOException -> 0x010e }
            r1.<init>()     // Catch:{ IOException -> 0x010e }
        L_0x00f0:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = r2.nextName()     // Catch:{ IOException -> 0x010e }
            java.lang.String r4 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            r1.putString(r3, r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x00f0
        L_0x0102:
            r2.endObject()     // Catch:{ IOException -> 0x010e }
            r0.mo20150b(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x010a:
            r2.endObject()     // Catch:{ IOException -> 0x010e }
            goto L_0x0113
        L_0x010e:
            java.lang.String r1 = "Ad Request json was malformed, parsing ended early."
            com.google.android.gms.internal.ads.zzcgp.m45224b(r1)
        L_0x0113:
            com.google.android.gms.ads.internal.client.zzl r0 = r0.mo20149a()
            android.os.Bundle r1 = r0.f1985D
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 != 0) goto L_0x0128
            android.os.Bundle r1 = r0.f1999d
            android.os.Bundle r3 = r0.f1985D
            r3.putBundle(r2, r1)
        L_0x0128:
            r8 = r1
            com.google.android.gms.ads.internal.client.zzl r1 = new com.google.android.gms.ads.internal.client.zzl
            r4 = r1
            int r5 = r0.f1997a
            long r6 = r0.f1998c
            int r9 = r0.f2000f
            java.util.List r10 = r0.f2001g
            boolean r11 = r0.f2002o
            int r12 = r0.f2003p
            boolean r13 = r0.f2004s
            java.lang.String r14 = r0.f2005z
            com.google.android.gms.ads.internal.client.zzfb r15 = r0.f1982A
            android.location.Location r2 = r0.f1983B
            r16 = r2
            java.lang.String r2 = r0.f1984C
            r17 = r2
            android.os.Bundle r2 = r0.f1985D
            r18 = r2
            android.os.Bundle r2 = r0.f1986E
            r19 = r2
            java.util.List r2 = r0.f1987F
            r20 = r2
            java.lang.String r2 = r0.f1988G
            r21 = r2
            java.lang.String r2 = r0.f1989H
            r22 = r2
            boolean r2 = r0.f1990I
            r23 = r2
            com.google.android.gms.ads.internal.client.zzc r2 = r0.f1991J
            r24 = r2
            int r2 = r0.f1992K
            r25 = r2
            java.lang.String r2 = r0.f1993L
            r26 = r2
            java.util.List r2 = r0.f1994M
            r27 = r2
            int r2 = r0.f1995N
            r28 = r2
            java.lang.String r0 = r0.f1996O
            r29 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyw.m48414Kb(java.util.Map):com.google.android.gms.ads.internal.client.zzl");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42916W(java.lang.String r12) throws android.os.RemoteException {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27120f8
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Received H5 gmsg: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)
            android.net.Uri r12 = android.net.Uri.parse(r12)
            com.google.android.gms.ads.internal.zzt.m2905r()
            java.util.Map r12 = com.google.android.gms.ads.internal.util.zzs.m2761l(r12)
            java.lang.String r0 = "action"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x003f
            java.lang.String r12 = "H5 gmsg did not contain an action"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r12)
            return
        L_0x003f:
            int r1 = r0.hashCode()
            r2 = 579053441(0x2283a781, float:3.5684973E-18)
            r3 = 0
            r4 = -1
            r5 = 1
            if (r1 == r2) goto L_0x005b
            r2 = 871091088(0x33ebcb90, float:1.0980068E-7)
            if (r1 == r2) goto L_0x0051
            goto L_0x0065
        L_0x0051:
            java.lang.String r1 = "initialize"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0065
            r1 = 0
            goto L_0x0066
        L_0x005b:
            java.lang.String r1 = "dispose_all"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = -1
        L_0x0066:
            if (r1 == 0) goto L_0x02bd
            if (r1 == r5) goto L_0x029d
            java.lang.String r1 = "obj_id"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()     // Catch:{ NullPointerException | NumberFormatException -> 0x028f }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x028f }
            int r6 = r0.hashCode()
            switch(r6) {
                case -1790951212: goto L_0x00bc;
                case -1266374734: goto L_0x00b2;
                case -257098725: goto L_0x00a8;
                case 393881811: goto L_0x009f;
                case 585513149: goto L_0x0095;
                case 1671767583: goto L_0x008b;
                case 2109237041: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00c6
        L_0x0081:
            java.lang.String r3 = "create_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 3
            goto L_0x00c7
        L_0x008b:
            java.lang.String r3 = "dispose"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 6
            goto L_0x00c7
        L_0x0095:
            java.lang.String r3 = "load_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x009f:
            java.lang.String r5 = "create_interstitial_ad"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00a8:
            java.lang.String r3 = "load_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 4
            goto L_0x00c7
        L_0x00b2:
            java.lang.String r3 = "show_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 5
            goto L_0x00c7
        L_0x00bc:
            java.lang.String r3 = "show_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 2
            goto L_0x00c7
        L_0x00c6:
            r3 = -1
        L_0x00c7:
            java.lang.String r4 = "Could not create H5 ad, missing ad unit id"
            java.lang.String r5 = " with ad unit "
            java.lang.String r6 = "Could not create H5 ad, object ID already exists"
            java.lang.String r7 = "ad_unit"
            java.lang.String r8 = "Could not show H5 ad, object ID does not exist"
            java.lang.String r9 = "Could not load H5 ad, object ID does not exist"
            java.lang.String r10 = "Could not create H5 ad, too many existing objects"
            switch(r3) {
                case 0: goto L_0x020b;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01d1;
                case 3: goto L_0x014d;
                case 4: goto L_0x012e;
                case 5: goto L_0x0113;
                case 6: goto L_0x00e2;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            java.lang.String r12 = "H5 gmsg contained invalid action: "
            java.lang.String r12 = r12.concat(r0)
            com.google.android.gms.internal.ads.zzcgp.m45224b(r12)
            return
        L_0x00e2:
            java.util.Map r12 = r11.f33414d
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.zzdyp r12 = (com.google.android.gms.internal.ads.zzdyp) r12
            if (r12 != 0) goto L_0x00f6
            java.lang.String r12 = "Could not dispose H5 ad, object ID does not exist"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r12)
            return
        L_0x00f6:
            r12.zza()
            java.util.Map r12 = r11.f33414d
            r12.remove(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Disposed H5 ad #"
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.ads.internal.util.zze.m2645k(r12)
            return
        L_0x0113:
            java.util.Map r12 = r11.f33414d
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.zzdyp r12 = (com.google.android.gms.internal.ads.zzdyp) r12
            if (r12 != 0) goto L_0x012a
            com.google.android.gms.internal.ads.zzcgp.m45224b(r8)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45083q(r1)
            return
        L_0x012a:
            r12.mo45064a()
            return
        L_0x012e:
            java.util.Map r0 = r11.f33414d
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzdyp r0 = (com.google.android.gms.internal.ads.zzdyp) r0
            if (r0 != 0) goto L_0x0145
            com.google.android.gms.internal.ads.zzcgp.m45224b(r9)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45083q(r1)
            return
        L_0x0145:
            com.google.android.gms.ads.internal.client.zzl r12 = m48414Kb(r12)
            r0.mo45065b(r12)
            return
        L_0x014d:
            java.util.Map r0 = r11.f33414d
            int r0 = r0.size()
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27130g8
            com.google.android.gms.internal.ads.zzbja r8 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r8.mo42663b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L_0x016e
            com.google.android.gms.internal.ads.zzcgp.m45229g(r10)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45075i(r1)
            return
        L_0x016e:
            java.util.Map r0 = r11.f33414d
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0183
            com.google.android.gms.internal.ads.zzcgp.m45224b(r6)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45075i(r1)
            return
        L_0x0183:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45075i(r1)
            return
        L_0x0198:
            com.google.android.gms.internal.ads.zzdyz r0 = r11.f33412a
            com.google.android.gms.internal.ads.zzdyq r0 = r0.zzb()
            r0.mo44314c(r1)
            r0.mo44315o(r12)
            com.google.android.gms.internal.ads.zzdyr r0 = r0.mo44313a()
            com.google.android.gms.internal.ads.zzdzf r0 = r0.zzb()
            java.util.Map r4 = r11.f33414d
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.zzdyu r0 = r11.f33413c
            r0.mo45074h(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Created H5 rewarded #"
            r0.append(r3)
            r0.append(r1)
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.m2645k(r12)
            return
        L_0x01d1:
            java.util.Map r12 = r11.f33414d
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.zzdyp r12 = (com.google.android.gms.internal.ads.zzdyp) r12
            if (r12 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.zzcgp.m45224b(r8)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45072f(r1)
            return
        L_0x01e8:
            r12.mo45064a()
            return
        L_0x01ec:
            java.util.Map r0 = r11.f33414d
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzdyp r0 = (com.google.android.gms.internal.ads.zzdyp) r0
            if (r0 != 0) goto L_0x0203
            com.google.android.gms.internal.ads.zzcgp.m45224b(r9)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45072f(r1)
            return
        L_0x0203:
            com.google.android.gms.ads.internal.client.zzl r12 = m48414Kb(r12)
            r0.mo45065b(r12)
            return
        L_0x020b:
            java.util.Map r0 = r11.f33414d
            int r0 = r0.size()
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27130g8
            com.google.android.gms.internal.ads.zzbja r8 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r8.mo42663b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L_0x022c
            com.google.android.gms.internal.ads.zzcgp.m45229g(r10)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45075i(r1)
            return
        L_0x022c:
            java.util.Map r0 = r11.f33414d
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0241
            com.google.android.gms.internal.ads.zzcgp.m45224b(r6)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45075i(r1)
            return
        L_0x0241:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0256
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45075i(r1)
            return
        L_0x0256:
            com.google.android.gms.internal.ads.zzdyz r0 = r11.f33412a
            com.google.android.gms.internal.ads.zzdyq r0 = r0.zzb()
            r0.mo44314c(r1)
            r0.mo44315o(r12)
            com.google.android.gms.internal.ads.zzdyr r0 = r0.mo44313a()
            com.google.android.gms.internal.ads.zzdzb r0 = r0.zza()
            java.util.Map r4 = r11.f33414d
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.zzdyu r0 = r11.f33413c
            r0.mo45074h(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Created H5 interstitial #"
            r0.append(r3)
            r0.append(r1)
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.m2645k(r12)
            return
        L_0x028f:
            java.lang.String r12 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "H5 gmsg did not contain a valid object id: "
            java.lang.String r12 = r0.concat(r12)
            com.google.android.gms.internal.ads.zzcgp.m45224b(r12)
            return
        L_0x029d:
            java.util.Map r12 = r11.f33414d
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x02a7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r0 = r12.next()
            com.google.android.gms.internal.ads.zzdyp r0 = (com.google.android.gms.internal.ads.zzdyp) r0
            r0.zza()
            goto L_0x02a7
        L_0x02b7:
            java.util.Map r12 = r11.f33414d
            r12.clear()
            return
        L_0x02bd:
            java.util.Map r12 = r11.f33414d
            r12.clear()
            com.google.android.gms.internal.ads.zzdyu r12 = r11.f33413c
            r12.mo45067a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyw.mo42916W(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo42917b() {
        this.f33414d.clear();
    }
}
