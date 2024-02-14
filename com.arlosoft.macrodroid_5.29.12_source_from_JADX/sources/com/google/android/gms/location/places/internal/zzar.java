package com.google.android.gms.location.places.internal;

import android.net.Uri;
import com.google.android.gms.location.places.Place;
import java.util.Collections;
import java.util.List;

public final class zzar extends zzaw implements Place {

    /* renamed from: f */
    private final String f45984f = mo54311i("place_id", "");

    /* renamed from: g */
    private final zzai f45985g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.google.android.gms.location.places.internal.zzai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.android.gms.location.places.internal.zzai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.google.android.gms.location.places.internal.zzai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.google.android.gms.location.places.internal.zzai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.google.android.gms.location.places.internal.zzai} */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzar(com.google.android.gms.common.data.DataHolder r7, int r8) {
        /*
            r6 = this;
            r6.<init>(r7, r8)
            java.lang.String r7 = "place_id"
            java.lang.String r8 = ""
            java.lang.String r7 = r6.mo54311i(r7, r8)
            r6.f45984f = r7
            java.util.List r7 = r6.mo54298n()
            int r7 = r7.size()
            if (r7 > 0) goto L_0x004b
            java.lang.CharSequence r7 = r6.mo54297m()
            if (r7 == 0) goto L_0x0027
            java.lang.CharSequence r7 = r6.mo54297m()
            int r7 = r7.length()
            if (r7 > 0) goto L_0x004b
        L_0x0027:
            android.net.Uri r7 = r6.mo54301q()
            if (r7 == 0) goto L_0x0039
            android.net.Uri r7 = r6.mo54301q()
            android.net.Uri r8 = android.net.Uri.EMPTY
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x004b
        L_0x0039:
            float r7 = r6.mo54300p()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x004b
            int r7 = r6.mo54299o()
            if (r7 < 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r7 = 0
            goto L_0x004c
        L_0x004b:
            r7 = 1
        L_0x004c:
            r8 = 0
            if (r7 == 0) goto L_0x0075
            com.google.android.gms.location.places.internal.zzai r7 = new com.google.android.gms.location.places.internal.zzai
            java.util.List r1 = r6.mo54298n()
            java.lang.CharSequence r0 = r6.mo54297m()
            if (r0 == 0) goto L_0x0063
            java.lang.CharSequence r8 = r6.mo54297m()
            java.lang.String r8 = r8.toString()
        L_0x0063:
            r2 = r8
            android.net.Uri r3 = r6.mo54301q()
            float r4 = r6.mo54300p()
            int r5 = r6.mo54299o()
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r7
        L_0x0075:
            r6.f45985g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.places.internal.zzar.<init>(com.google.android.gms.common.data.DataHolder, int):void");
    }

    public final CharSequence getName() {
        return mo54311i("place_name", "");
    }

    /* renamed from: m */
    public final CharSequence mo54297m() {
        return mo54311i("place_phone_number", "");
    }

    /* renamed from: n */
    public final List<Integer> mo54298n() {
        return mo54312j("place_types", Collections.emptyList());
    }

    /* renamed from: o */
    public final int mo54299o() {
        return mo54313l("place_price_level", -1);
    }

    /* renamed from: p */
    public final float mo54300p() {
        return mo54310h("place_rating", -1.0f);
    }

    /* renamed from: q */
    public final Uri mo54301q() {
        String i = mo54311i("place_website_uri", (String) null);
        if (i == null) {
            return null;
        }
        return Uri.parse(i);
    }
}
