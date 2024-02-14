package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import p370qa.C16254a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n */
/* compiled from: DeserializedAnnotations.kt */
public final class C14780n extends C14727a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14780n(C17012n nVar, C16254a<? extends List<? extends C13915c>> aVar) {
        super(nVar, aVar);
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(aVar, "compute");
    }

    public boolean isEmpty() {
        return false;
    }
}
