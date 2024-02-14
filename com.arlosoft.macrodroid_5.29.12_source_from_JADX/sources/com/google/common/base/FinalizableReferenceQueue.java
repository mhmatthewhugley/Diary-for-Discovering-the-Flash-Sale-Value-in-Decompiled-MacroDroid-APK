package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p353io.FilenameUtils;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class FinalizableReferenceQueue implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Logger f4153f = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* renamed from: g */
    private static final Method f4154g = m5289e(m5290f(new SystemLoader(), new DecoupledLoader(), new DirectLoader()));

    /* renamed from: a */
    final ReferenceQueue<Object> f4155a;

    /* renamed from: c */
    final PhantomReference<Object> f4156c;

    /* renamed from: d */
    final boolean f4157d;

    static class DecoupledLoader implements FinalizerLoader {
        DecoupledLoader() {
        }

        /* renamed from: a */
        public Class<?> mo22154a() {
            try {
                return mo22156c(mo22155b()).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e) {
                FinalizableReferenceQueue.f4153f.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", e);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public URL mo22155b() throws IOException {
            String concat = String.valueOf("com.google.common.base.internal.Finalizer".replace(FilenameUtils.EXTENSION_SEPARATOR, '/')).concat(".class");
            URL resource = getClass().getClassLoader().getResource(concat);
            if (resource != null) {
                String url = resource.toString();
                if (url.endsWith(concat)) {
                    return new URL(resource, url.substring(0, url.length() - concat.length()));
                }
                throw new IOException(url.length() != 0 ? "Unsupported path style: ".concat(url) : new String("Unsupported path style: "));
            }
            throw new FileNotFoundException(concat);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public URLClassLoader mo22156c(URL url) {
            return new URLClassLoader(new URL[]{url}, (ClassLoader) null);
        }
    }

    static class DirectLoader implements FinalizerLoader {
        DirectLoader() {
        }

        /* renamed from: a */
        public Class<?> mo22154a() {
            try {
                return Class.forName("com.google.common.base.internal.Finalizer");
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    interface FinalizerLoader {
        /* renamed from: a */
        Class<?> mo22154a();
    }

    static class SystemLoader implements FinalizerLoader {
        @VisibleForTesting

        /* renamed from: a */
        static boolean f4158a;

        SystemLoader() {
        }

        /* renamed from: a */
        public Class<?> mo22154a() {
            if (f4158a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.f4153f.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public FinalizableReferenceQueue() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f4155a = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f4156c = phantomReference;
        boolean z = true;
        try {
            f4154g.invoke((Object) null, new Object[]{FinalizableReference.class, referenceQueue, phantomReference});
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th) {
            f4153f.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.f4157d = z;
    }

    /* renamed from: e */
    static Method m5289e(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", new Class[]{Class.class, ReferenceQueue.class, PhantomReference.class});
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    private static Class<?> m5290f(FinalizerLoader... finalizerLoaderArr) {
        for (FinalizerLoader a : finalizerLoaderArr) {
            Class<?> a2 = a.mo22154a();
            if (a2 != null) {
                return a2;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo22152c() {
        if (!this.f4157d) {
            while (true) {
                Reference<? extends Object> poll = this.f4155a.poll();
                if (poll != null) {
                    poll.clear();
                    try {
                        ((FinalizableReference) poll).mo22151a();
                    } catch (Throwable th) {
                        f4153f.log(Level.SEVERE, "Error cleaning up after reference.", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void close() {
        this.f4156c.enqueue();
        mo22152c();
    }
}
