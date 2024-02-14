package p349ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p336nb.C15766a;

/* renamed from: ob.h */
/* compiled from: JvmNameResolver.kt */
public final class C15840h {
    /* renamed from: a */
    public static final List<C15766a.C15777e.C15780c> m95456a(List<C15766a.C15777e.C15780c> list) {
        C13706o.m87929f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (C15766a.C15777e.C15780c next : list) {
            int H = next.mo75478H();
            for (int i = 0; i < H; i++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
