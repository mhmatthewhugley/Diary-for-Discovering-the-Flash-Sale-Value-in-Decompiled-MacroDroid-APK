package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16152c;
import p362pb.C16157f;
import p389sb.C16519a;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.c */
/* compiled from: AnnotationDescriptor.kt */
public interface C13915c {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.c$a */
    /* compiled from: AnnotationDescriptor.kt */
    public static final class C13916a {
        /* renamed from: a */
        public static C16152c m88488a(C13915c cVar) {
            C13948e e = C16519a.m98612e(cVar);
            if (e == null) {
                return null;
            }
            if (C17088k.m100541m(e)) {
                e = null;
            }
            if (e != null) {
                return C16519a.m98611d(e);
            }
            return null;
        }
    }

    /* renamed from: a */
    Map<C16157f, C14617g<?>> mo72240a();

    /* renamed from: e */
    C16152c mo72241e();

    C14158z0 getSource();

    C14900e0 getType();
}
