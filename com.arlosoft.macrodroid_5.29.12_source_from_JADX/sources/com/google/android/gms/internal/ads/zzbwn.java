package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwn implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f27897a;

    /* renamed from: b */
    private final int f27898b;

    /* renamed from: c */
    private final Set f27899c;

    /* renamed from: d */
    private final boolean f27900d;

    /* renamed from: e */
    private final Location f27901e;

    /* renamed from: f */
    private final int f27902f;

    /* renamed from: g */
    private final zzbls f27903g;

    /* renamed from: h */
    private final List f27904h = new ArrayList();

    /* renamed from: i */
    private final boolean f27905i;

    /* renamed from: j */
    private final Map f27906j = new HashMap();

    /* renamed from: k */
    private final String f27907k;

    public zzbwn(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, zzbls zzbls, List list, boolean z2, int i3, String str) {
        this.f27897a = date;
        this.f27898b = i;
        this.f27899c = set;
        this.f27901e = location;
        this.f27900d = z;
        this.f27902f = i2;
        this.f27903g = zzbls;
        this.f27905i = z2;
        this.f27907k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f27906j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f27906j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f27904h.add(str2);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final NativeAdOptions mo20513a() {
        return zzbls.m43673l2(this.f27903g);
    }

    /* renamed from: b */
    public final int mo20476b() {
        return this.f27902f;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo20477c() {
        return this.f27905i;
    }

    @Deprecated
    /* renamed from: d */
    public final Date mo20478d() {
        return this.f27897a;
    }

    /* renamed from: e */
    public final boolean mo20479e() {
        return this.f27900d;
    }

    /* renamed from: f */
    public final com.google.android.gms.ads.formats.NativeAdOptions mo20514f() {
        zzbls zzbls = this.f27903g;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbls == null) {
            return builder.mo19798a();
        }
        int i = zzbls.f27526a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.mo19802e(zzbls.f27532p);
                    builder.mo19801d(zzbls.f27533s);
                }
                builder.mo19804g(zzbls.f27527c);
                builder.mo19800c(zzbls.f27528d);
                builder.mo19803f(zzbls.f27529f);
                return builder.mo19798a();
            }
            zzff zzff = zzbls.f27531o;
            if (zzff != null) {
                builder.mo19805h(new VideoOptions(zzff));
            }
        }
        builder.mo19799b(zzbls.f27530g);
        builder.mo19804g(zzbls.f27527c);
        builder.mo19800c(zzbls.f27528d);
        builder.mo19803f(zzbls.f27529f);
        return builder.mo19798a();
    }

    @Deprecated
    /* renamed from: g */
    public final int mo20480g() {
        return this.f27898b;
    }

    /* renamed from: h */
    public final boolean mo20515h() {
        return this.f27904h.contains("6");
    }

    /* renamed from: i */
    public final Set<String> mo20481i() {
        return this.f27899c;
    }

    public final Map zza() {
        return this.f27906j;
    }

    public final boolean zzb() {
        return this.f27904h.contains(ExifInterface.GPS_MEASUREMENT_3D);
    }
}
