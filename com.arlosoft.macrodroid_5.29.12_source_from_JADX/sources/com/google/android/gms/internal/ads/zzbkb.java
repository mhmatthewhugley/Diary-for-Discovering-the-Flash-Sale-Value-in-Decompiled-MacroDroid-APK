package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbkb {

    /* renamed from: a */
    private MotionEvent f27375a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f27376b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final Context f27377c;

    /* renamed from: d */
    private final ScheduledExecutorService f27378d;

    /* renamed from: e */
    private final zzfju f27379e;

    /* renamed from: f */
    private final zzbkd f27380f;

    public zzbkb(Context context, ScheduledExecutorService scheduledExecutorService, zzbkd zzbkd, zzfju zzfju, byte[] bArr) {
        this.f27377c = context;
        this.f27378d = scheduledExecutorService;
        this.f27380f = zzbkd;
        this.f27379e = zzfju;
    }

    /* renamed from: a */
    public final zzfzp mo42726a() {
        return (zzfyx) zzfzg.m51420o(zzfyx.m51389C(zzfzg.m51414i((Object) null)), ((Long) zzbkr.f27454c.mo42728e()).longValue(), TimeUnit.MILLISECONDS, this.f27378d);
    }

    /* renamed from: b */
    public final void mo42727b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f27375a.getEventTime()) {
            this.f27375a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f27376b.getEventTime()) {
            this.f27376b = MotionEvent.obtain(motionEvent);
        }
    }
}
