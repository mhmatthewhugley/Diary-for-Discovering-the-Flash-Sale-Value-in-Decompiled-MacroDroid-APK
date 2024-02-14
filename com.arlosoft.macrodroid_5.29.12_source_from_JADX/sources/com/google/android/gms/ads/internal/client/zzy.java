package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.C1720R;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzy {

    /* renamed from: a */
    private final AdSize[] f2047a;

    /* renamed from: b */
    private final String f2048b;

    public zzy(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1720R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(C1720R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C1720R.styleable.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f2047a = m2424c(string);
        } else if (!z && z2) {
            this.f2047a = m2424c(string2);
        } else if (z) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(C1720R.styleable.AdsAttrs_adUnitId);
        this.f2048b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: c */
    private static AdSize[] m2424c(String str) {
        int i;
        int i2;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i = -1;
                    } else {
                        i = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i2 = -2;
                    } else {
                        i2 = Integer.parseInt(split2[1]);
                    }
                    adSizeArr[i3] = new AdSize(i, i2);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i3] = AdSize.f1675i;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i3] = AdSize.f1677k;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i3] = AdSize.f1676j;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i3] = AdSize.f1678l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i3] = AdSize.f1679m;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i3] = AdSize.f1681o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i3] = AdSize.f1680n;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i3] = AdSize.f1682p;
            } else if ("ICON".equals(trim)) {
                adSizeArr[i3] = AdSize.f1685s;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    /* renamed from: a */
    public final String mo20173a() {
        return this.f2048b;
    }

    /* renamed from: b */
    public final AdSize[] mo20174b(boolean z) {
        if (z || this.f2047a.length == 1) {
            return this.f2047a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
