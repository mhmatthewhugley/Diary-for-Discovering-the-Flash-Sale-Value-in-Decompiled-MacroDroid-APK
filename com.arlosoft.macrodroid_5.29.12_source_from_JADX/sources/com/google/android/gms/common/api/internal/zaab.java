package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaab implements PendingResult.StatusListener {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f3258a;

    /* renamed from: b */
    final /* synthetic */ zaad f3259b;

    zaab(zaad zaad, BasePendingResult basePendingResult) {
        this.f3259b = zaad;
        this.f3258a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo21274a(Status status) {
        this.f3259b.f3262a.remove(this.f3258a);
    }
}
