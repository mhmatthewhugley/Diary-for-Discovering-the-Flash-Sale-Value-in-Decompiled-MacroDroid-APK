package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepm implements zzevd {

    /* renamed from: a */
    final zzfef f34656a;

    /* renamed from: b */
    private final long f34657b;

    public zzepm(zzfef zzfef, long j) {
        Preconditions.m4489l(zzfef, "the targeting must not be null");
        this.f34656a = zzfef;
        this.f34657b = j;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzl = this.f34656a.f35629d;
        bundle.putInt("http_timeout_millis", zzl.f1995N);
        bundle.putString("slotname", this.f34656a.f35631f);
        int i = this.f34656a.f35640o.f35582a;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.f34657b);
            zzfeq.m50025f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl.f1998c)), zzl.f1998c != -1);
            zzfeq.m50021b(bundle, "extras", zzl.f1999d);
            int i3 = zzl.f2000f;
            zzfeq.m50024e(bundle, "cust_gender", i3, i3 != -1);
            zzfeq.m50023d(bundle, "kw", zzl.f2001g);
            int i4 = zzl.f2003p;
            zzfeq.m50024e(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
            if (zzl.f2002o) {
                bundle.putBoolean("test_request", true);
            }
            zzfeq.m50024e(bundle, "d_imp_hdr", 1, zzl.f1997a >= 2 && zzl.f2004s);
            String str = zzl.f2005z;
            zzfeq.m50025f(bundle, "ppid", str, zzl.f1997a >= 2 && !TextUtils.isEmpty(str));
            Location location = zzl.f1983B;
            if (location != null) {
                float accuracy = location.getAccuracy();
                long time = location.getTime();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy * 1000.0f);
                bundle2.putLong("lat", (long) (latitude * 1.0E7d));
                bundle2.putLong("long", (long) (longitude * 1.0E7d));
                bundle2.putLong("time", time * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfeq.m50022c(bundle, "url", zzl.f1984C);
            zzfeq.m50023d(bundle, "neighboring_content_urls", zzl.f1994M);
            zzfeq.m50021b(bundle, "custom_targeting", zzl.f1986E);
            zzfeq.m50023d(bundle, "category_exclusions", zzl.f1987F);
            zzfeq.m50022c(bundle, "request_agent", zzl.f1988G);
            zzfeq.m50022c(bundle, "request_pkg", zzl.f1989H);
            zzfeq.m50026g(bundle, "is_designed_for_families", zzl.f1990I, zzl.f1997a >= 7);
            if (zzl.f1997a >= 8) {
                int i5 = zzl.f1992K;
                if (i5 == -1) {
                    z = false;
                }
                zzfeq.m50024e(bundle, "tag_for_under_age_of_consent", i5, z);
                zzfeq.m50022c(bundle, "max_ad_content_rating", zzl.f1993L);
                return;
            }
            return;
        }
        throw null;
    }
}
