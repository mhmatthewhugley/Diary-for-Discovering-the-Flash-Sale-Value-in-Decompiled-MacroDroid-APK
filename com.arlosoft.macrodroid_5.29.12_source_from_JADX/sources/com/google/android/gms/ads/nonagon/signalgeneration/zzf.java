package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzfef;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzf {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3060a(@androidx.annotation.Nullable java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x000a
            java.lang.String r1 = "unspecified"
            return r1
        L_0x000a:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L_0x0063;
                case 1743582863: goto L_0x0059;
                case 1743582864: goto L_0x004f;
                case 1743582865: goto L_0x0045;
                case 1743582866: goto L_0x003b;
                case 1743582867: goto L_0x0031;
                case 1743582868: goto L_0x0027;
                case 1743582869: goto L_0x001d;
                case 1743582870: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006d
        L_0x0012:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 8
            goto L_0x006e
        L_0x001d:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 7
            goto L_0x006e
        L_0x0027:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 6
            goto L_0x006e
        L_0x0031:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 5
            goto L_0x006e
        L_0x003b:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 4
            goto L_0x006e
        L_0x0045:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 3
            goto L_0x006e
        L_0x004f:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 2
            goto L_0x006e
        L_0x0059:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 1
            goto L_0x006e
        L_0x0063:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 0
            goto L_0x006e
        L_0x006d:
            r0 = -1
        L_0x006e:
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0087;
                case 2: goto L_0x0084;
                case 3: goto L_0x0081;
                case 4: goto L_0x007e;
                case 5: goto L_0x007b;
                case 6: goto L_0x0078;
                case 7: goto L_0x0075;
                case 8: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            return r1
        L_0x0072:
            java.lang.String r1 = "8"
            return r1
        L_0x0075:
            java.lang.String r1 = "7"
            return r1
        L_0x0078:
            java.lang.String r1 = "6"
            return r1
        L_0x007b:
            java.lang.String r1 = "5"
            return r1
        L_0x007e:
            java.lang.String r1 = "4"
            return r1
        L_0x0081:
            java.lang.String r1 = "3"
            return r1
        L_0x0084:
            java.lang.String r1 = "2"
            return r1
        L_0x0087:
            java.lang.String r1 = "1"
            return r1
        L_0x008a:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzf.m3060a(java.lang.String):java.lang.String");
    }

    @Nullable
    /* renamed from: b */
    public static String m3061b(zzl zzl) {
        Bundle bundle = zzl.f1999d;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    /* renamed from: c */
    public static void m3062c(zzdxv zzdxv, @Nullable zzdxl zzdxl, String str, Pair... pairArr) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27098d6)).booleanValue()) {
            zzchc.f28456a.execute(new zze(zzdxv, zzdxl, str, pairArr));
        }
    }

    /* renamed from: d */
    public static int m3063d(zzfef zzfef) {
        if (zzfef.f35642q) {
            return 2;
        }
        zzl zzl = zzfef.f35629d;
        zzc zzc = zzl.f1991J;
        if (zzc == null && zzl.f1996O == null) {
            return 1;
        }
        if (zzc == null || zzl.f1996O == null) {
            return zzc != null ? 3 : 4;
        }
        return 5;
    }
}
