package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaap extends zaav {

    /* renamed from: c */
    private final ArrayList f3282c;

    /* renamed from: d */
    final /* synthetic */ zaaw f3283d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaaw, ArrayList arrayList) {
        super(zaaw, (zaau) null);
        this.f3283d = zaaw;
        this.f3282c = arrayList;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo21445a() {
        zaaw zaaw = this.f3283d;
        zaaw.f3289a.f3352E.f3336p = zaaw.m3991y(zaaw);
        ArrayList arrayList = this.f3282c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zaaw zaaw2 = this.f3283d;
            ((Api.Client) arrayList.get(i)).mo21204m(zaaw2.f3303o, zaaw2.f3289a.f3352E.f3336p);
        }
    }
}
