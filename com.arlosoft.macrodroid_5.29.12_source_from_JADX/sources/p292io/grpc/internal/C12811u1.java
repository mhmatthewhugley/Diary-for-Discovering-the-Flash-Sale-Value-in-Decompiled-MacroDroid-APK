package p292io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.u1 */
/* compiled from: ReflectionLongAdderCounter */
public final class C12811u1 implements C12611b1 {

    /* renamed from: b */
    private static final Logger f60208b = Logger.getLogger(C12811u1.class.getName());

    /* renamed from: c */
    private static final Constructor<?> f60209c;

    /* renamed from: d */
    private static final Method f60210d;

    /* renamed from: e */
    private static final Method f60211e;

    /* renamed from: f */
    private static final RuntimeException f60212f;

    /* renamed from: a */
    private final Object f60213a;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<io.grpc.internal.u1> r0 = p292io.grpc.internal.C12811u1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f60208b = r0
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "add"
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0045 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0045 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0045 }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "sum"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0042 }
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch:{ all -> 0x0042 }
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch:{ all -> 0x0040 }
            int r4 = r1.length     // Catch:{ all -> 0x0040 }
        L_0x002e:
            if (r5 >= r4) goto L_0x003d
            r6 = r1[r5]     // Catch:{ all -> 0x0040 }
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch:{ all -> 0x0040 }
            int r7 = r7.length     // Catch:{ all -> 0x0040 }
            if (r7 != 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            int r5 = r5 + 1
            goto L_0x002e
        L_0x003d:
            r6 = r0
        L_0x003e:
            r1 = r0
            goto L_0x0052
        L_0x0040:
            r1 = move-exception
            goto L_0x0048
        L_0x0042:
            r1 = move-exception
            r3 = r0
            goto L_0x0048
        L_0x0045:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x0048:
            java.util.logging.Logger r4 = f60208b
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r4.log(r5, r6, r1)
            r6 = r0
        L_0x0052:
            if (r1 != 0) goto L_0x005f
            if (r6 == 0) goto L_0x005f
            f60209c = r6
            f60210d = r2
            f60211e = r3
            f60212f = r0
            goto L_0x006c
        L_0x005f:
            f60209c = r0
            f60210d = r0
            f60211e = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            f60212f = r0
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12811u1.<clinit>():void");
    }

    C12811u1() {
        RuntimeException runtimeException = f60212f;
        if (runtimeException == null) {
            try {
                this.f60213a = f60209c.newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw runtimeException;
        }
    }

    /* renamed from: b */
    static boolean m84585b() {
        return f60212f == null;
    }

    /* renamed from: a */
    public void mo69232a(long j) {
        try {
            f60210d.invoke(this.f60213a, new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
