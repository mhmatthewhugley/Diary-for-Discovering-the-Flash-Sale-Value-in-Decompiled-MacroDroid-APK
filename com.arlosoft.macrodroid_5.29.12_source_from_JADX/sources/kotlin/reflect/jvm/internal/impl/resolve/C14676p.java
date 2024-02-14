package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.p */
/* compiled from: VisibilityUtil.kt */
public final class C14676p {
    /* renamed from: a */
    public static final C13936b m91799a(Collection<? extends C13936b> collection) {
        Integer d;
        C13706o.m87929f(collection, "descriptors");
        collection.isEmpty();
        C13936b bVar = null;
        for (C13936b bVar2 : collection) {
            if (bVar == null || ((d = C14127t.m89522d(bVar.getVisibility(), bVar2.getVisibility())) != null && d.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        C13706o.m87926c(bVar);
        return bVar;
    }
}
