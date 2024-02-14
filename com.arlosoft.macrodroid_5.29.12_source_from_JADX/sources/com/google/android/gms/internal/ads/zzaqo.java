package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqo extends zzarq {

    /* renamed from: A */
    private final View f25346A;

    /* renamed from: z */
    private final Activity f25347z;

    public zzaqo(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, View view, Activity activity) {
        super(zzaqe, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", zzamk, i, 62);
        this.f25346A = view;
        this.f25347z = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        if (this.f25346A != null) {
            boolean booleanValue = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27124g2)).booleanValue();
            Object[] objArr = (Object[]) this.f25388o.invoke((Object) null, new Object[]{this.f25346A, this.f25347z, Boolean.valueOf(booleanValue)});
            synchronized (this.f25387g) {
                this.f25387g.mo41689g0(((Long) objArr[0]).longValue());
                this.f25387g.mo41691j0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f25387g.mo41690i0((String) objArr[2]);
                }
            }
        }
    }
}
