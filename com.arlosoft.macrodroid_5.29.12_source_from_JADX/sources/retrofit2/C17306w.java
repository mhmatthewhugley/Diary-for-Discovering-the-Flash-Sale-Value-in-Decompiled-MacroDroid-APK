package retrofit2;

import java.lang.annotation.Annotation;

/* renamed from: retrofit2.w */
/* compiled from: SkipCallbackExecutorImpl */
final class C17306w implements C17305v {

    /* renamed from: a */
    private static final C17305v f68972a = new C17306w();

    C17306w() {
    }

    /* renamed from: a */
    static Annotation[] m100998a(Annotation[] annotationArr) {
        if (C17307x.m101010l(annotationArr, C17305v.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f68972a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C17305v.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C17305v;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C17305v.class.getName() + "()";
    }
}
