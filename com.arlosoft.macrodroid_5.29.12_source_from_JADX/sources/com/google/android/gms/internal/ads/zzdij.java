package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzdij {

    /* renamed from: a */
    protected final Map f32291a = new HashMap();

    protected zzdij(Set set) {
        mo44630J0(set);
    }

    /* renamed from: G0 */
    public final synchronized void mo44629G0(Object obj, Executor executor) {
        this.f32291a.put(obj, executor);
    }

    /* renamed from: J0 */
    public final synchronized void mo44630J0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mo44632z0((zzdkg) it.next());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public final synchronized void mo44631L0(zzdii zzdii) {
        for (Map.Entry entry : this.f32291a.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzdih(zzdii, entry.getKey()));
        }
    }

    /* renamed from: z0 */
    public final synchronized void mo44632z0(zzdkg zzdkg) {
        mo44629G0(zzdkg.f32374a, zzdkg.f32375b);
    }
}
