package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfhy {

    /* renamed from: a */
    private final Object f35794a;
    @Nullable

    /* renamed from: b */
    private final String f35795b;

    /* renamed from: c */
    private final zzfzp f35796c;

    /* renamed from: d */
    private final List f35797d;

    /* renamed from: e */
    private final zzfzp f35798e;

    /* renamed from: f */
    final /* synthetic */ zzfhz f35799f;

    private zzfhy(zzfhz zzfhz, Object obj, String str, zzfzp zzfzp, List list, zzfzp zzfzp2) {
        this.f35799f = zzfhz;
        this.f35794a = obj;
        this.f35795b = str;
        this.f35796c = zzfzp;
        this.f35797d = list;
        this.f35798e = zzfzp2;
    }

    /* synthetic */ zzfhy(zzfhz zzfhz, Object obj, String str, zzfzp zzfzp, List list, zzfzp zzfzp2, zzfhx zzfhx) {
        this(zzfhz, obj, (String) null, zzfzp, list, zzfzp2);
    }

    /* renamed from: a */
    public final zzfhm mo45742a() {
        Object obj = this.f35794a;
        String str = this.f35795b;
        if (str == null) {
            str = this.f35799f.mo45753f(obj);
        }
        zzfhm zzfhm = new zzfhm(obj, str, this.f35798e);
        this.f35799f.f35803c.mo45767b0(zzfhm);
        zzfzp zzfzp = this.f35796c;
        zzfhs zzfhs = new zzfhs(this, zzfhm);
        zzfzq zzfzq = zzchc.f28461f;
        zzfzp.mo43580q(zzfhs, zzfzq);
        zzfzg.m51423r(zzfhm, new zzfhw(this, zzfhm), zzfzq);
        return zzfhm;
    }

    /* renamed from: b */
    public final zzfhy mo45743b(Object obj) {
        return this.f35799f.mo45752b(obj, mo45742a());
    }

    /* renamed from: c */
    public final zzfhy mo45744c(Class cls, zzfyn zzfyn) {
        zzfhz zzfhz = this.f35799f;
        return new zzfhy(zzfhz, this.f35794a, this.f35795b, this.f35796c, this.f35797d, zzfzg.m51412g(this.f35798e, cls, zzfyn, zzfhz.f35801a));
    }

    /* renamed from: d */
    public final zzfhy mo45745d(zzfzp zzfzp) {
        return mo45748g(new zzfht(zzfzp), zzchc.f28461f);
    }

    /* renamed from: e */
    public final zzfhy mo45746e(zzfhk zzfhk) {
        return mo45747f(new zzfhv(zzfhk));
    }

    /* renamed from: f */
    public final zzfhy mo45747f(zzfyn zzfyn) {
        return mo45748g(zzfyn, this.f35799f.f35801a);
    }

    /* renamed from: g */
    public final zzfhy mo45748g(zzfyn zzfyn, Executor executor) {
        return new zzfhy(this.f35799f, this.f35794a, this.f35795b, this.f35796c, this.f35797d, zzfzg.m51419n(this.f35798e, zzfyn, executor));
    }

    /* renamed from: h */
    public final zzfhy mo45749h(String str) {
        return new zzfhy(this.f35799f, this.f35794a, str, this.f35796c, this.f35797d, this.f35798e);
    }

    /* renamed from: i */
    public final zzfhy mo45750i(long j, TimeUnit timeUnit) {
        zzfhz zzfhz = this.f35799f;
        return new zzfhy(zzfhz, this.f35794a, this.f35795b, this.f35796c, this.f35797d, zzfzg.m51420o(this.f35798e, j, timeUnit, zzfhz.f35802b));
    }
}
