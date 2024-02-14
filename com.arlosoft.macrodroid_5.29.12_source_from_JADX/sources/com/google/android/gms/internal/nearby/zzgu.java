package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Map;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgu extends zzkf implements zzgk {

    /* renamed from: a */
    private final Context f44676a;

    /* renamed from: c */
    private final ListenerHolder f44677c;

    /* renamed from: d */
    private final Map f44678d = new ArrayMap();
    @Nullable

    /* renamed from: f */
    private final zzlt f44679f;

    zzgu(Context context, ListenerHolder listenerHolder, @Nullable zzlt zzlt) {
        this.f44676a = (Context) Preconditions.m4488k(context);
        this.f44677c = (ListenerHolder) Preconditions.m4488k(listenerHolder);
        this.f44679f = zzlt;
    }

    /* renamed from: c */
    public final synchronized void mo52720c() {
        for (Map.Entry entry : this.f44678d.entrySet()) {
            this.f44677c.mo21377c(new zzgs(this, ((zzgt) entry.getKey()).mo52731a(), (PayloadTransferUpdate) entry.getValue()));
        }
        this.f44678d.clear();
    }

    /* renamed from: e2 */
    public final synchronized void mo52734e2(zzlk zzlk) {
        if (zzlk.mo52879l2().mo55695n2() == 3) {
            this.f44678d.put(new zzgt(zzlk.mo52880m2(), zzlk.mo52879l2().mo55694m2()), zzlk.mo52879l2());
        } else {
            this.f44678d.remove(new zzgt(zzlk.mo52880m2(), zzlk.mo52879l2().mo55694m2()));
            zzlt zzlt = this.f44679f;
            if (zzlt != null) {
                zzlt.mo52902c(zzlk.mo52879l2().mo55694m2());
            }
        }
        this.f44677c.mo21377c(new zzgr(this, zzlk));
    }

    /* renamed from: f5 */
    public final synchronized void mo52735f5(zzli zzli) {
        Payload a = zzmd.m62747a(this.f44676a, zzli.mo52872l2());
        if (a == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[]{Long.valueOf(zzli.mo52872l2().zzb())}));
            return;
        }
        Map map = this.f44678d;
        zzgt zzgt = new zzgt(zzli.mo52873m2(), zzli.mo52872l2().zzb());
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder();
        builder.mo55699b(zzli.mo52872l2().zzb());
        map.put(zzgt, builder.mo55698a());
        this.f44677c.mo21377c(new zzgq(this, zzli, a));
    }
}
