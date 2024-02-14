package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvf {

    /* renamed from: a */
    private final String f31646a;

    /* renamed from: b */
    private final zzbut f31647b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f31648c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzcvk f31649d;

    /* renamed from: e */
    private final zzbpu f31650e = new zzcvc(this);

    /* renamed from: f */
    private final zzbpu f31651f = new zzcve(this);

    public zzcvf(String str, zzbut zzbut, Executor executor) {
        this.f31646a = str;
        this.f31647b = zzbut;
        this.f31648c = executor;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ boolean m46868g(zzcvf zzcvf, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcvf.f31646a);
    }

    /* renamed from: c */
    public final void mo44401c(zzcvk zzcvk) {
        this.f31647b.mo43003b("/updateActiveView", this.f31650e);
        this.f31647b.mo43003b("/untrackActiveViewUnit", this.f31651f);
        this.f31649d = zzcvk;
    }

    /* renamed from: d */
    public final void mo44402d(zzcmp zzcmp) {
        zzcmp.mo44064o0("/updateActiveView", this.f31650e);
        zzcmp.mo44064o0("/untrackActiveViewUnit", this.f31651f);
    }

    /* renamed from: e */
    public final void mo44403e() {
        this.f31647b.mo43004c("/updateActiveView", this.f31650e);
        this.f31647b.mo43004c("/untrackActiveViewUnit", this.f31651f);
    }

    /* renamed from: f */
    public final void mo44404f(zzcmp zzcmp) {
        zzcmp.mo44063n0("/updateActiveView", this.f31650e);
        zzcmp.mo44063n0("/untrackActiveViewUnit", this.f31651f);
    }
}
