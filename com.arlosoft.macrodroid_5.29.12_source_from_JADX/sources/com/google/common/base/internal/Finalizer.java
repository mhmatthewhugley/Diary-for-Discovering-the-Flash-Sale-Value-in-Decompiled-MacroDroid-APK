package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer implements Runnable {

    /* renamed from: f */
    private static final Logger f4265f = Logger.getLogger(Finalizer.class.getName());

    /* renamed from: g */
    private static final Constructor<Thread> f4266g;

    /* renamed from: o */
    private static final Field f4267o;

    /* renamed from: a */
    private final WeakReference<Class<?>> f4268a;

    /* renamed from: c */
    private final PhantomReference<Object> f4269c;

    /* renamed from: d */
    private final ReferenceQueue<Object> f4270d;

    static {
        Constructor<Thread> b = m5500b();
        f4266g = b;
        f4267o = b == null ? m5502d() : null;
    }

    /* renamed from: a */
    private boolean m5499a(Reference<?> reference) {
        Method c = m5501c();
        if (c == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f4269c) {
                return false;
            }
            try {
                c.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                f4265f.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.f4270d.poll();
        } while (reference != null);
        return true;
    }

    /* renamed from: b */
    private static Constructor<Thread> m5500b() {
        try {
            return Thread.class.getConstructor(new Class[]{ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private Method m5501c() {
        Class cls = (Class) this.f4268a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    private static Field m5502d() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f4265f.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:2:0x000a, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r1.f4270d     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
            boolean r0 = r1.m5499a(r0)     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.internal.Finalizer.run():void");
    }
}
