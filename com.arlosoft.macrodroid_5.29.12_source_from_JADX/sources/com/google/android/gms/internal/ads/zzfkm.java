package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfkm {

    /* renamed from: a */
    private final Context f35981a;

    /* renamed from: b */
    private final Executor f35982b;

    /* renamed from: c */
    private final zzcgu f35983c;

    /* renamed from: d */
    private final zzfjw f35984d;

    zzfkm(Context context, Executor executor, zzcgu zzcgu, zzfjw zzfjw) {
        this.f35981a = context;
        this.f35982b = executor;
        this.f35983c = zzcgu;
        this.f35984d = zzfjw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo45860a(String str) {
        this.f35983c.mo20399o(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo45861b(String str, zzfju zzfju) {
        zzfjj a = zzfji.m50258a(this.f35981a, 14);
        a.mo45794c();
        a.mo45801o0(this.f35983c.mo20399o(str));
        if (zzfju == null) {
            this.f35984d.mo45831b(a.mo45799h());
            return;
        }
        zzfju.mo45822a(a);
        zzfju.mo45828g();
    }

    /* renamed from: c */
    public final void mo45862c(String str, @Nullable zzfju zzfju) {
        if (!zzfjw.m50333a() || !((Boolean) zzbkl.f27409d.mo42728e()).booleanValue()) {
            this.f35982b.execute(new zzfkk(this, str));
        } else {
            this.f35982b.execute(new zzfkl(this, str, zzfju));
        }
    }

    /* renamed from: d */
    public final void mo45863d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo45862c((String) it.next(), (zzfju) null);
        }
    }
}
