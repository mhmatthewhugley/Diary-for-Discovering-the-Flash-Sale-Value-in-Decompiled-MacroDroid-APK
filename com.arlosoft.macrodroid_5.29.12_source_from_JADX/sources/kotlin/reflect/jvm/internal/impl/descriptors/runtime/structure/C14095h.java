package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import kotlin.jvm.internal.C13706o;
import p288ib.C12486d;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public interface C14095h extends C12486d {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h$a */
    /* compiled from: ReflectJavaAnnotationOwner.kt */
    public static final class C14096a {
        /* renamed from: a */
        public static C14091e m89416a(C14095h hVar, C16152c cVar) {
            Annotation[] declaredAnnotations;
            C13706o.m87929f(cVar, "fqName");
            AnnotatedElement b = hVar.mo72583b();
            if (b == null || (declaredAnnotations = b.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C14097i.m89419a(declaredAnnotations, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14097i.m89420b((r0 = r0.getDeclaredAnnotations()));
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14091e> m89417b(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14095h r0) {
            /*
                java.lang.reflect.AnnotatedElement r0 = r0.mo72583b()
                if (r0 == 0) goto L_0x0012
                java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
                if (r0 == 0) goto L_0x0012
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14097i.m89420b(r0)
                if (r0 != 0) goto L_0x0016
            L_0x0012:
                java.util.List r0 = kotlin.collections.C13614t.m87748j()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14095h.C14096a.m89417b(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h):java.util.List");
        }

        /* renamed from: c */
        public static boolean m89418c(C14095h hVar) {
            return false;
        }
    }

    /* renamed from: b */
    AnnotatedElement mo72583b();
}
