package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqz extends zzarq {

    /* renamed from: A */
    private static final Object f25359A = new Object();

    /* renamed from: z */
    private static volatile Long f25360z;

    public zzaqz(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", zzamk, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        if (f25360z == null) {
            synchronized (f25359A) {
                if (f25360z == null) {
                    f25360z = (Long) this.f25388o.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f25387g) {
            this.f25387g.mo41667J0(f25360z.longValue());
        }
    }
}
