package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzp {

    /* renamed from: a */
    public static final zzp f2018a = new zzp();

    @VisibleForTesting
    protected zzp() {
    }

    /* renamed from: a */
    public final zzl mo20160a(Context context, zzdr zzdr) {
        List list;
        Context context2;
        zzc zzc;
        String str;
        zzdr zzdr2 = zzdr;
        Date m = zzdr.mo20039m();
        long time = m != null ? m.getTime() : -1;
        String j = zzdr.mo20036j();
        int a = zzdr.mo20027a();
        Set p = zzdr.mo20042p();
        if (!p.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(p));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean r = zzdr2.mo20044r(context2);
        Bundle e = zzdr2.mo20031e(AdMobAdapter.class);
        AdInfo g = zzdr.mo20033g();
        if (g != null) {
            QueryInfo b = g.mo20702b();
            zzc = new zzc(zzdr.mo20033g().mo20701a(), b != null ? b.mo20704c().mo20090b() : "");
        } else {
            zzc = null;
        }
        String k = zzdr.mo20037k();
        SearchAdRequest h = zzdr.mo20034h();
        zzfb zzfb = h != null ? new zzfb(h) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzaw.m1917b();
            str = zzcgi.m45180p(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean q = zzdr.mo20043q();
        RequestConfiguration b2 = zzed.m2259e().mo20077b();
        return new zzl(8, time, e, a, list, r, Math.max(zzdr.mo20029c(), b2.mo19738b()), false, k, zzfb, (Location) null, j, zzdr.mo20032f(), zzdr.mo20030d(), Collections.unmodifiableList(new ArrayList(zzdr.mo20041o())), zzdr.mo20038l(), str, q, zzc, Math.max(-1, b2.mo19739c()), (String) Collections.max(Arrays.asList(new String[]{null, b2.mo19737a()}), zzo.f2017a), zzdr.mo20040n(), zzdr.mo20028b(), zzdr.mo20035i());
    }
}
