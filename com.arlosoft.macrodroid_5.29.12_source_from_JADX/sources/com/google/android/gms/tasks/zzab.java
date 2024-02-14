package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzab implements Continuation {

    /* renamed from: a */
    final /* synthetic */ Collection f48000a;

    zzab(Collection collection) {
        this.f48000a = collection;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f48000a);
        return Tasks.m66667f(arrayList);
    }
}
