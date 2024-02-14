package com.google.mlkit.p229nl.translate.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.mlkit.nl.translate.internal.zzah */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzah implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ List f56482a;

    public /* synthetic */ zzah(List list) {
        this.f56482a = list;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        List list = this.f56482a;
        List list2 = (List) task.mo23715p();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list2.size(); i++) {
            if (((Boolean) list2.get(i)).booleanValue()) {
                hashSet.add((TranslateRemoteModel) list.get(i));
            }
        }
        return hashSet;
    }
}
