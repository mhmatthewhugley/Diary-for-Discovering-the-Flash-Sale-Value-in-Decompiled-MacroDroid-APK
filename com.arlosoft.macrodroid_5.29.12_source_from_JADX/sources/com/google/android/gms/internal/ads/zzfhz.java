package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfhz {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final zzfzp f35800d = zzfzg.m51414i((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzfzq f35801a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f35802b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzfia f35803c;

    public zzfhz(zzfzq zzfzq, ScheduledExecutorService scheduledExecutorService, zzfia zzfia) {
        this.f35801a = zzfzq;
        this.f35802b = scheduledExecutorService;
        this.f35803c = zzfia;
    }

    /* renamed from: a */
    public final zzfhp mo45751a(Object obj, zzfzp... zzfzpArr) {
        return new zzfhp(this, obj, Arrays.asList(zzfzpArr), (zzfho) null);
    }

    /* renamed from: b */
    public final zzfhy mo45752b(Object obj, zzfzp zzfzp) {
        return new zzfhy(this, obj, (String) null, zzfzp, Collections.singletonList(zzfzp), zzfzp, (zzfhx) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo45753f(Object obj);
}
