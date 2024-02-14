package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzbzs extends zzcfc {

    /* renamed from: a */
    final /* synthetic */ QueryInfoGenerationCallback f28020a;

    zzbzs(zzbzt zzbzt, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f28020a = queryInfoGenerationCallback;
    }

    /* renamed from: F2 */
    public final void mo43234F2(String str, String str2, Bundle bundle) {
        this.f28020a.mo20679b(new QueryInfo(new zzeg(str, bundle, str2)));
    }

    /* renamed from: t */
    public final void mo43235t(String str) {
        this.f28020a.mo20678a(str);
    }
}
