package p473rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import p463if.C17175a;
import p468nf.C17214f;

/* renamed from: rx.exceptions.OnErrorThrowable */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue */
    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        static final class C17316a {

            /* renamed from: a */
            static final Set<Class<?>> f68982a = m101035a();

            /* renamed from: a */
            private static Set<Class<?>> m101035a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + m101033b(obj));
            this.value = obj;
        }

        /* renamed from: b */
        static String m101033b(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (C17316a.f68982a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String b = C17214f.m100769c().mo80507b().mo80483b(obj);
            if (b != null) {
                return b;
            }
            return obj.getClass().getName() + ".class";
        }

        /* renamed from: a */
        public Object mo80644a() {
            return this.value;
        }
    }

    /* renamed from: a */
    public static Throwable m101032a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable b = C17175a.m100682b(th);
        if ((b instanceof OnNextValue) && ((OnNextValue) b).mo80644a() == obj) {
            return th;
        }
        C17175a.m100681a(th, new OnNextValue(obj));
        return th;
    }
}
