package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbkj {

    /* renamed from: a */
    public static final zzbke f27395a = zzbkf.m43649f("gads:consent:gmscore:dsid:enabled", true);

    /* renamed from: b */
    public static final zzbke f27396b = zzbkf.m43649f("gads:consent:gmscore:lat:enabled", true);

    /* renamed from: c */
    public static final zzbke f27397c = new zzbkf("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);

    /* renamed from: d */
    public static final zzbke f27398d = new zzbkf("gads:consent:gmscore:time_out", Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS), 2);

    /* renamed from: e */
    public static final zzbke f27399e = zzbkf.m43649f("gads:consent:gmscore:enabled", true);
}
