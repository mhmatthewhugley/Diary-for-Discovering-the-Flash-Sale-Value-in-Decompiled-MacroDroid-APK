package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqq extends zzarq {
    public zzaqq(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", zzamk, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        this.f25387g.mo41682Z(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f25388o.invoke((Object) null, new Object[]{this.f25384c.mo41806b()})).booleanValue();
            zzamk zzamk = this.f25387g;
            if (true == booleanValue) {
                i = 2;
            }
            zzamk.mo41682Z(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
