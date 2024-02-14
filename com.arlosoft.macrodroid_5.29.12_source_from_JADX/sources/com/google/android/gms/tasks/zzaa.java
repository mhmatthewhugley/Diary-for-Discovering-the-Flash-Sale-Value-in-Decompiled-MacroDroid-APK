package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzaa implements Continuation {

    /* renamed from: a */
    final /* synthetic */ Collection f47999a;

    zzaa(Collection collection) {
        this.f47999a = collection;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Task p : this.f47999a) {
            arrayList.add(p.mo23715p());
        }
        return arrayList;
    }
}
