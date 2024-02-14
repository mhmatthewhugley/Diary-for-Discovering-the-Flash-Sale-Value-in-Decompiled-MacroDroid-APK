package p292io.grpc;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: io.grpc.a1 */
/* compiled from: ServiceProviders */
final class C12527a1 {

    /* renamed from: io.grpc.a1$a */
    /* compiled from: ServiceProviders */
    class C12528a implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C12529b f59393a;

        C12528a(C12529b bVar) {
            this.f59393a = bVar;
        }

        public int compare(T t, T t2) {
            int b = this.f59393a.mo69018b(t) - this.f59393a.mo69018b(t2);
            if (b != 0) {
                return b;
            }
            return t.getClass().getName().compareTo(t2.getClass().getName());
        }
    }

    /* renamed from: io.grpc.a1$b */
    /* compiled from: ServiceProviders */
    public interface C12529b<T> {
        /* renamed from: a */
        boolean mo69017a(T t);

        /* renamed from: b */
        int mo69018b(T t);
    }

    @VisibleForTesting
    /* renamed from: a */
    static <T> T m83657a(Class<T> cls, Class<?> cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    static <T> Iterable<T> m83658b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> a : iterable) {
            arrayList.add(m83657a(cls, a));
        }
        return arrayList;
    }

    @VisibleForTesting
    /* renamed from: c */
    public static <T> Iterable<T> m83659c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* renamed from: d */
    static boolean m83660d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Iterable<java.lang.Class<?>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m83661e(java.lang.Class<T> r0, java.lang.Iterable<java.lang.Class<?>> r1, java.lang.ClassLoader r2, p292io.grpc.C12527a1.C12529b<T> r3) {
        /*
            java.util.List r0 = m83662f(r0, r1, r2, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.C12527a1.m83661e(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, io.grpc.a1$b):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<java.lang.Class<?>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.List<T> m83662f(java.lang.Class<T> r1, java.lang.Iterable<java.lang.Class<?>> r2, java.lang.ClassLoader r3, p292io.grpc.C12527a1.C12529b<T> r4) {
        /*
            boolean r0 = m83660d(r3)
            if (r0 == 0) goto L_0x000b
            java.lang.Iterable r1 = m83658b(r1, r2)
            goto L_0x000f
        L_0x000b:
            java.lang.Iterable r1 = m83659c(r1, r3)
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            boolean r0 = r4.mo69017a(r3)
            if (r0 != 0) goto L_0x0029
            goto L_0x0018
        L_0x0029:
            r2.add(r3)
            goto L_0x0018
        L_0x002d:
            io.grpc.a1$a r1 = new io.grpc.a1$a
            r1.<init>(r4)
            java.util.Comparator r1 = java.util.Collections.reverseOrder(r1)
            java.util.Collections.sort(r2, r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.C12527a1.m83662f(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, io.grpc.a1$b):java.util.List");
    }
}
