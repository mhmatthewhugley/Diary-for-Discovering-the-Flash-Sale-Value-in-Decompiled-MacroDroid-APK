package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarg extends zzarq {

    /* renamed from: z */
    private List f25368z = null;

    public zzarg(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", zzamk, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        this.f25387g.mo41677T(-1);
        this.f25387g.mo41673O(-1);
        if (this.f25368z == null) {
            this.f25368z = (List) this.f25388o.invoke((Object) null, new Object[]{this.f25384c.mo41806b()});
        }
        List list = this.f25368z;
        if (list != null && list.size() == 2) {
            synchronized (this.f25387g) {
                this.f25387g.mo41677T(((Long) this.f25368z.get(0)).longValue());
                this.f25387g.mo41673O(((Long) this.f25368z.get(1)).longValue());
            }
        }
    }
}
