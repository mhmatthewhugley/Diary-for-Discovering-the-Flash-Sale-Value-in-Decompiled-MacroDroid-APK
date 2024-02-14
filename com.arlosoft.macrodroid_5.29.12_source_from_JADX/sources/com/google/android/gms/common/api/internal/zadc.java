package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zadc {

    /* renamed from: c */
    public static final Status f3450c = new Status(8, "The connection to Google Play services was lost");
    @VisibleForTesting

    /* renamed from: a */
    final Set f3451a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final zadb f3452b = new zadb(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21517a(BasePendingResult basePendingResult) {
        this.f3451a.add(basePendingResult);
        basePendingResult.mo21332s(this.f3452b);
    }

    /* renamed from: b */
    public final void mo21518b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f3451a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo21332s((zadb) null);
            if (basePendingResult.mo21331r()) {
                this.f3451a.remove(basePendingResult);
            }
        }
    }
}
