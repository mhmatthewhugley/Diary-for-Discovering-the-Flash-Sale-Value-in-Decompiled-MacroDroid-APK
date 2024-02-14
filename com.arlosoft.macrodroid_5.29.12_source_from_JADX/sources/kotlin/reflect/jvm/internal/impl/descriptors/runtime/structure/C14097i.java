package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.i */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public final class C14097i {
    /* renamed from: a */
    public static final C14091e m89419a(Annotation[] annotationArr, C16152c cVar) {
        Annotation annotation;
        C13706o.m87929f(annotationArr, "<this>");
        C13706o.m87929f(cVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C13706o.m87924a(C14088d.m89397a(C16147a.m96968b(C16147a.m96967a(annotation))).mo78544b(), cVar)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C14091e(annotation);
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C14091e> m89420b(Annotation[] annotationArr) {
        C13706o.m87929f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation eVar : annotationArr) {
            arrayList.add(new C14091e(eVar));
        }
        return arrayList;
    }
}
