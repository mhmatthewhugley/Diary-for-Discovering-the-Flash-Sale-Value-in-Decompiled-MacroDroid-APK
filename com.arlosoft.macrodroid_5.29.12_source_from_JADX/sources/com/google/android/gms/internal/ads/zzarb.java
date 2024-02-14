package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarb extends zzarq {

    /* renamed from: A */
    private final long f25363A;

    /* renamed from: B */
    private final long f25364B;

    /* renamed from: z */
    private final zzapi f25365z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzarb(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, zzapi zzapi, long j, long j2) {
        super(zzaqe, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", zzamk, i, 11);
        this.f25365z = zzapi;
        this.f25363A = j;
        this.f25364B = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        zzapi zzapi = this.f25365z;
        if (zzapi != null) {
            zzapg zzapg = new zzapg((String) this.f25388o.invoke((Object) null, new Object[]{zzapi.mo41783b(), Long.valueOf(this.f25363A), Long.valueOf(this.f25364B)}));
            synchronized (this.f25387g) {
                this.f25387g.mo41669K0(zzapg.f25250a.longValue());
                if (zzapg.f25251b.longValue() >= 0) {
                    this.f25387g.mo41671M(zzapg.f25251b.longValue());
                }
                if (zzapg.f25252c.longValue() >= 0) {
                    this.f25387g.mo41692k0(zzapg.f25252c.longValue());
                }
            }
        }
    }
}
