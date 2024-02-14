package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfmw implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ zzalw f36128a;

    /* renamed from: b */
    public final /* synthetic */ int f36129b;

    public /* synthetic */ zzfmw(zzalw zzalw, int i) {
        this.f36128a = zzalw;
        this.f36129b = i;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        zzalw zzalw = this.f36128a;
        int i = this.f36129b;
        int i2 = zzfmx.f36131f;
        if (!task.mo23719t()) {
            return Boolean.FALSE;
        }
        zzfoy a = ((zzfoz) task.mo23715p()).mo46064a(((zzama) zzalw.mo47341h()).mo47050p());
        a.mo46061a(i);
        a.mo46063c();
        return Boolean.TRUE;
    }
}
