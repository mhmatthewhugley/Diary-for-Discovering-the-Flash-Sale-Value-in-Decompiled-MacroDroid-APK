package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzekg implements zzehc {
    /* renamed from: d */
    private static Bundle m48993d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        return !TextUtils.isEmpty(zzfdk.f35557w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdk zzfdk2 = zzfdk;
        String optString = zzfdk2.f35557w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfef zzfef = zzfdw.f35589a.f35583a;
        zzfed zzfed = new zzfed();
        zzfed.mo45603G(zzfef);
        zzfed.mo45606J(optString);
        Bundle d = m48993d(zzfef.f35629d.f1985D);
        Bundle d2 = m48993d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = zzfdk2.f35557w.optString("mad_hac", (String) null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = zzfdk2.f35557w.optString("adJson", (String) null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfdk2.f35497E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfdk2.f35497E.optString(next, (String) null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        zzl zzl = zzfef.f35629d;
        zzl zzl2 = r5;
        zzl zzl3 = new zzl(zzl.f1997a, zzl.f1998c, d2, zzl.f2000f, zzl.f2001g, zzl.f2002o, zzl.f2003p, zzl.f2004s, zzl.f2005z, zzl.f1982A, zzl.f1983B, zzl.f1984C, d, zzl.f1986E, zzl.f1987F, zzl.f1988G, zzl.f1989H, zzl.f1990I, zzl.f1991J, zzl.f1992K, zzl.f1993L, zzl.f1994M, zzl.f1995N, zzl.f1996O);
        zzfed.mo45618e(zzl2);
        zzfef g = zzfed.mo45620g();
        Bundle bundle = new Bundle();
        zzfdw zzfdw2 = zzfdw;
        zzfdn zzfdn = zzfdw2.f35590b.f35587b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzfdn.f35565a));
        bundle2.putInt("refresh_interval", zzfdn.f35567c);
        bundle2.putString("gws_query_id", zzfdn.f35566b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfdw2.f35589a.f35583a.f35631f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzfdk zzfdk3 = zzfdk;
        bundle3.putString("allocation_id", zzfdk3.f35558x);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzfdk3.f35523c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzfdk3.f35525d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzfdk3.f35551q));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzfdk3.f35545n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzfdk3.f35533h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzfdk3.f35535i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzfdk3.f35537j));
        bundle3.putString("transaction_id", zzfdk3.f35539k);
        bundle3.putString("valid_from_timestamp", zzfdk3.f35541l);
        bundle3.putBoolean("is_closable_area_disabled", zzfdk3.f35509Q);
        if (zzfdk3.f35543m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfdk3.f35543m.f28208c);
            bundle4.putString("rb_type", zzfdk3.f35543m.f28207a);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo45348c(g, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract zzfzp mo45348c(zzfef zzfef, Bundle bundle);
}
