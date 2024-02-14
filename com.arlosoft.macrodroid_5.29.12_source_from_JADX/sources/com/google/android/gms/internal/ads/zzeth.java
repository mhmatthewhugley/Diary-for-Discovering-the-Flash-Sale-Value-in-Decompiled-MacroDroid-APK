package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeth implements zzeve {

    /* renamed from: a */
    private final zzfzq f34875a;

    /* renamed from: b */
    private final zzfef f34876b;

    /* renamed from: c */
    private final PackageInfo f34877c;

    /* renamed from: d */
    private final zzg f34878d;

    public zzeth(zzfzq zzfzq, zzfef zzfef, @Nullable PackageInfo packageInfo, zzg zzg) {
        this.f34875a = zzfzq;
        this.f34876b = zzfef;
        this.f34877c = packageInfo;
        this.f34878d = zzg;
    }

    /* renamed from: a */
    public static /* synthetic */ zzeti m49494a(zzeth zzeth) {
        ArrayList arrayList = zzeth.f34876b.f35632g;
        return arrayList == null ? zzetd.f34870a : arrayList.isEmpty() ? zzete.f34871a : new zzetf(zzeth, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r9 == 3) goto L_0x0105;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo45464b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            java.util.ArrayList r9 = r9.f35633h
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbls r9 = r9.f35634i
            int r9 = r9.f27526a
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L_0x004f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbls r9 = r9.f35634i
            int r9 = r9.f27533s
            if (r9 == r6) goto L_0x0043
            if (r9 == r5) goto L_0x0041
            if (r9 == r1) goto L_0x003f
            r7 = 4
            if (r9 == r7) goto L_0x003c
            r9 = r4
            goto L_0x0044
        L_0x003c:
            java.lang.String r9 = "square"
            goto L_0x0044
        L_0x003f:
            r9 = r2
            goto L_0x0044
        L_0x0041:
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x004f:
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbls r9 = r9.f35634i
            int r9 = r9.f27528d
            if (r9 == 0) goto L_0x005f
            if (r9 == r6) goto L_0x005d
            if (r9 == r5) goto L_0x0060
            r0 = r4
            goto L_0x0060
        L_0x005d:
            r0 = r2
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x006b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x006b:
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbls r9 = r9.f35634i
            boolean r9 = r9.f27529f
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbls r9 = r9.f35634i
            boolean r9 = r9.f27532p
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.f34877c
            if (r9 != 0) goto L_0x0087
            r9 = 0
            goto L_0x0089
        L_0x0087:
            int r9 = r9.versionCode
        L_0x0089:
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f34878d
            int r0 = r0.zza()
            if (r9 <= r0) goto L_0x009b
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f34878d
            r0.mo20385p()
            com.google.android.gms.ads.internal.util.zzg r0 = r8.f34878d
            r0.mo20370g0(r9)
        L_0x009b:
            com.google.android.gms.ads.internal.util.zzg r9 = r8.f34878d
            org.json.JSONObject r9 = r9.mo20381m()
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzfef r2 = r8.f34876b
            java.lang.String r2 = r2.f35631f
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto L_0x00b2
            java.lang.String r0 = r9.toString()
        L_0x00b2:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        L_0x00bd:
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            int r9 = r9.f35636k
            if (r9 <= r6) goto L_0x00c8
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00c8:
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbsc r9 = r9.f35627b
            if (r9 == 0) goto L_0x0117
            java.lang.String r0 = r9.f27703d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x010b
            int r0 = r9.f27701a
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00e5
            int r9 = r9.f27704f
            if (r9 == r5) goto L_0x0104
            if (r9 == r1) goto L_0x0105
            goto L_0x0104
        L_0x00e5:
            int r9 = r9.f27702c
            if (r9 == r6) goto L_0x0104
            if (r9 == r5) goto L_0x0105
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.internal.ads.zzcgp.m45226d(r9)
        L_0x0104:
            r2 = r3
        L_0x0105:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0112
        L_0x010b:
            java.lang.String r9 = r9.f27703d
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0112:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0117:
            com.google.android.gms.internal.ads.zzfef r9 = r8.f34876b
            com.google.android.gms.internal.ads.zzbnv r9 = r9.mo45626a()
            if (r9 == 0) goto L_0x0124
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeth.mo45464b(java.util.ArrayList, android.os.Bundle):void");
    }

    public final int zza() {
        return 26;
    }

    public final zzfzp zzb() {
        return this.f34875a.mo46579F(new zzetg(this));
    }
}
