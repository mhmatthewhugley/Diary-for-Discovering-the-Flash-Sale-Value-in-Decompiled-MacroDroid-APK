package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfxx<V> extends zzgai implements zzfzp<V> {

    /* renamed from: f */
    static final boolean f36539f;

    /* renamed from: g */
    private static final Logger f36540g = Logger.getLogger(zzfxx.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final zza f36541o;

    /* renamed from: p */
    private static final Object f36542p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile Object f36543a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile zzd f36544c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile zzk f36545d;

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    abstract class zza {
        /* synthetic */ zza(C104411 r1) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract zzd mo46566a(zzfxx zzfxx, zzd zzd);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract zzk mo46567b(zzfxx zzfxx, zzk zzk);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo46568c(zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo46569d(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract boolean mo46570e(zzfxx zzfxx, zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract boolean mo46571f(zzfxx zzfxx, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract boolean mo46572g(zzfxx zzfxx, zzk zzk, zzk zzk2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzb {

        /* renamed from: c */
        static final zzb f36546c;

        /* renamed from: d */
        static final zzb f36547d;

        /* renamed from: a */
        final boolean f36548a;

        /* renamed from: b */
        final Throwable f36549b;

        static {
            if (zzfxx.f36539f) {
                f36547d = null;
                f36546c = null;
                return;
            }
            f36547d = new zzb(false, (Throwable) null);
            f36546c = new zzb(true, (Throwable) null);
        }

        zzb(boolean z, Throwable th) {
            this.f36548a = z;
            this.f36549b = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzc {

        /* renamed from: b */
        static final zzc f36550b = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        final Throwable f36551a;

        zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.f36551a = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzd {

        /* renamed from: d */
        static final zzd f36552d = new zzd();

        /* renamed from: a */
        final Runnable f36553a;

        /* renamed from: b */
        final Executor f36554b;

        /* renamed from: c */
        zzd f36555c;

        zzd() {
            this.f36553a = null;
            this.f36554b = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.f36553a = runnable;
            this.f36554b = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zze extends zza {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<zzk, Thread> f36556a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<zzk, zzk> f36557b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<zzfxx, zzk> f36558c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<zzfxx, zzd> f36559d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<zzfxx, Object> f36560e;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super((C104411) null);
            this.f36556a = atomicReferenceFieldUpdater;
            this.f36557b = atomicReferenceFieldUpdater2;
            this.f36558c = atomicReferenceFieldUpdater3;
            this.f36559d = atomicReferenceFieldUpdater4;
            this.f36560e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final zzd mo46566a(zzfxx zzfxx, zzd zzd) {
            return this.f36559d.getAndSet(zzfxx, zzd);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final zzk mo46567b(zzfxx zzfxx, zzk zzk) {
            return this.f36558c.getAndSet(zzfxx, zzk);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo46568c(zzk zzk, zzk zzk2) {
            this.f36557b.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo46569d(zzk zzk, Thread thread) {
            this.f36556a.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo46570e(zzfxx zzfxx, zzd zzd, zzd zzd2) {
            return zzfxy.m51322a(this.f36559d, zzfxx, zzd, zzd2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final boolean mo46571f(zzfxx zzfxx, Object obj, Object obj2) {
            return zzfxy.m51322a(this.f36560e, zzfxx, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final boolean mo46572g(zzfxx zzfxx, zzk zzk, zzk zzk2) {
            return zzfxy.m51322a(this.f36558c, zzfxx, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzf<V> implements Runnable {

        /* renamed from: a */
        final zzfxx<V> f36561a;

        /* renamed from: c */
        final zzfzp<? extends V> f36562c;

        zzf(zzfxx zzfxx, zzfzp zzfzp) {
            this.f36561a = zzfxx;
            this.f36562c = zzfzp;
        }

        public final void run() {
            if (this.f36561a.f36543a == this) {
                if (zzfxx.f36541o.mo46571f(this.f36561a, this, zzfxx.m51269h(this.f36562c))) {
                    zzfxx.m51265A(this.f36561a);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzg extends zza {
        private zzg() {
            super((C104411) null);
        }

        /* synthetic */ zzg(C104411 r1) {
            super((C104411) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final zzd mo46566a(zzfxx zzfxx, zzd zzd) {
            zzd k;
            synchronized (zzfxx) {
                k = zzfxx.f36544c;
                if (k != zzd) {
                    zzd unused = zzfxx.f36544c = zzd;
                }
            }
            return k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final zzk mo46567b(zzfxx zzfxx, zzk zzk) {
            zzk m;
            synchronized (zzfxx) {
                m = zzfxx.f36545d;
                if (m != zzk) {
                    zzk unused = zzfxx.f36545d = zzk;
                }
            }
            return m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo46568c(zzk zzk, zzk zzk2) {
            zzk.f36571b = zzk2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo46569d(zzk zzk, Thread thread) {
            zzk.f36570a = thread;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo46570e(zzfxx zzfxx, zzd zzd, zzd zzd2) {
            synchronized (zzfxx) {
                if (zzfxx.f36544c != zzd) {
                    return false;
                }
                zzd unused = zzfxx.f36544c = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final boolean mo46571f(zzfxx zzfxx, Object obj, Object obj2) {
            synchronized (zzfxx) {
                if (zzfxx.f36543a != obj) {
                    return false;
                }
                Object unused = zzfxx.f36543a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final boolean mo46572g(zzfxx zzfxx, zzk zzk, zzk zzk2) {
            synchronized (zzfxx) {
                if (zzfxx.f36545d != zzk) {
                    return false;
                }
                zzk unused = zzfxx.f36545d = zzk2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    interface zzh<V> extends zzfzp<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    abstract class zzi<V> extends zzfxx<V> implements zzh<V> {
        zzi() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzj extends zza {

        /* renamed from: a */
        static final Unsafe f36563a;

        /* renamed from: b */
        static final long f36564b;

        /* renamed from: c */
        static final long f36565c;

        /* renamed from: d */
        static final long f36566d;

        /* renamed from: e */
        static final long f36567e;

        /* renamed from: f */
        static final long f36568f;

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzfxx.zzj.C104431());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.android.gms.internal.ads.zzfxx$zzk> r0 = com.google.android.gms.internal.ads.zzfxx.zzk.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.android.gms.internal.ads.zzfxx$zzj$1 r1 = new com.google.android.gms.internal.ads.zzfxx$zzj$1     // Catch:{ PrivilegedActionException -> 0x005c }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005c }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005c }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005c }
            L_0x0012:
                java.lang.Class<com.google.android.gms.internal.ads.zzfxx> r2 = com.google.android.gms.internal.ads.zzfxx.class
                java.lang.String r3 = "d"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                f36565c = r3     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                f36564b = r3     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r3 = "a"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                f36566d = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                f36567e = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                f36568f = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                f36563a = r1     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                throw r0
            L_0x0055:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005c:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxx.zzj.<clinit>():void");
        }

        private zzj() {
            super((C104411) null);
        }

        /* synthetic */ zzj(C104411 r1) {
            super((C104411) null);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: a */
        final com.google.android.gms.internal.ads.zzfxx.zzd mo46566a(com.google.android.gms.internal.ads.zzfxx r3, com.google.android.gms.internal.ads.zzfxx.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzfxx$zzd r0 = r3.f36544c
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.mo46570e(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxx.zzj.mo46566a(com.google.android.gms.internal.ads.zzfxx, com.google.android.gms.internal.ads.zzfxx$zzd):com.google.android.gms.internal.ads.zzfxx$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: b */
        final com.google.android.gms.internal.ads.zzfxx.zzk mo46567b(com.google.android.gms.internal.ads.zzfxx r3, com.google.android.gms.internal.ads.zzfxx.zzk r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzfxx$zzk r0 = r3.f36545d
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.mo46572g(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxx.zzj.mo46567b(com.google.android.gms.internal.ads.zzfxx, com.google.android.gms.internal.ads.zzfxx$zzk):com.google.android.gms.internal.ads.zzfxx$zzk");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo46568c(zzk zzk, zzk zzk2) {
            f36563a.putObject(zzk, f36568f, zzk2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo46569d(zzk zzk, Thread thread) {
            f36563a.putObject(zzk, f36567e, thread);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo46570e(zzfxx zzfxx, zzd zzd, zzd zzd2) {
            return zzfxz.m51323a(f36563a, zzfxx, f36564b, zzd, zzd2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final boolean mo46571f(zzfxx zzfxx, Object obj, Object obj2) {
            return zzfxz.m51323a(f36563a, zzfxx, f36566d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final boolean mo46572g(zzfxx zzfxx, zzk zzk, zzk zzk2) {
            return zzfxz.m51323a(f36563a, zzfxx, f36565c, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    final class zzk {

        /* renamed from: c */
        static final zzk f36569c = new zzk(false);

        /* renamed from: a */
        volatile Thread f36570a;

        /* renamed from: b */
        volatile zzk f36571b;

        zzk() {
            zzfxx.f36541o.mo46569d(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zza2;
        Class<zzk> cls = zzk.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f36539f = z;
        try {
            zza2 = new zzj((C104411) null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                zza2 = new zze(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "b"), AtomicReferenceFieldUpdater.newUpdater(zzfxx.class, cls, "d"), AtomicReferenceFieldUpdater.newUpdater(zzfxx.class, zzd.class, "c"), AtomicReferenceFieldUpdater.newUpdater(zzfxx.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zza2 = new zzg((C104411) null);
            }
        }
        f36541o = zza2;
        if (th != null) {
            Logger logger = f36540g;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected zzfxx() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static void m51265A(zzfxx<V> zzfxx) {
        zzd zzd2 = null;
        while (true) {
            for (zzk b = f36541o.mo46567b(zzfxx, zzk.f36569c); b != null; b = b.f36571b) {
                Thread thread = b.f36570a;
                if (thread != null) {
                    b.f36570a = null;
                    LockSupport.unpark(thread);
                }
            }
            zzfxx.mo46079e();
            zzd zzd3 = zzd2;
            zzd a = f36541o.mo46566a(zzfxx, zzd.f36552d);
            zzd zzd4 = zzd3;
            while (a != null) {
                zzd zzd5 = a.f36555c;
                a.f36555c = zzd4;
                zzd4 = a;
                a = zzd5;
            }
            while (true) {
                if (zzd4 != null) {
                    zzd2 = zzd4.f36555c;
                    Runnable runnable = zzd4.f36553a;
                    runnable.getClass();
                    if (runnable instanceof zzf) {
                        zzf zzf2 = (zzf) runnable;
                        zzfxx = zzf2.f36561a;
                        if (zzfxx.f36543a == zzf2) {
                            if (f36541o.mo46571f(zzfxx, zzf2, m51269h(zzf2.f36562c))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = zzd4.f36554b;
                        executor.getClass();
                        m51266B(runnable, executor);
                    }
                    zzd4 = zzd2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: B */
    private static void m51266B(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f36540g;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: b */
    private final void m51267b(zzk zzk2) {
        zzk2.f36570a = null;
        while (true) {
            zzk zzk3 = this.f36545d;
            if (zzk3 != zzk.f36569c) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.f36571b;
                    if (zzk3.f36570a != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.f36571b = zzk5;
                        if (zzk4.f36570a == null) {
                        }
                    } else if (!f36541o.mo46572g(this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: c */
    private static final Object m51268c(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).f36549b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).f36551a);
        } else if (obj == f36542p) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Object m51269h(zzfzp zzfzp) {
        Throwable a;
        if (zzfzp instanceof zzh) {
            Object obj = ((zzfxx) zzfzp).f36543a;
            if (obj instanceof zzb) {
                zzb zzb2 = (zzb) obj;
                if (zzb2.f36548a) {
                    Throwable th = zzb2.f36549b;
                    obj = th != null ? new zzb(false, th) : zzb.f36547d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzfzp instanceof zzgai) && (a = ((zzgai) zzfzp).mo46555a()) != null) {
            return new zzc(a);
        } else {
            boolean isCancelled = zzfzp.isCancelled();
            if ((!f36539f) && isCancelled) {
                zzb zzb3 = zzb.f36547d;
                zzb3.getClass();
                return zzb3;
            }
            try {
                Object i = m51270i(zzfzp);
                if (!isCancelled) {
                    return i == null ? f36542p : i;
                }
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfzp));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new zzc(e.getCause());
                }
                zzfzp.toString();
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfzp)), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new zzb(false, e2);
                }
                zzfzp.toString();
                return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfzp)), e2));
            } catch (Error | RuntimeException e3) {
                return new zzc(e3);
            }
        }
    }

    /* renamed from: i */
    private static Object m51270i(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: x */
    private final void m51280x(StringBuilder sb) {
        try {
            Object i = m51270i(this);
            sb.append("SUCCESS, result=[");
            if (i == null) {
                sb.append("null");
            } else if (i == this) {
                sb.append("this future");
            } else {
                sb.append(i.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(i)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: y */
    private final void m51281y(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f36543a;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            m51282z(sb, ((zzf) obj).f36562c);
            sb.append("]");
        } else {
            try {
                str = zzftm.m50970a(mo46078d());
            } catch (RuntimeException | StackOverflowError e) {
                Class<?> cls = e.getClass();
                cls.toString();
                str = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m51280x(sb);
        }
    }

    /* renamed from: z */
    private final void m51282z(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Throwable mo46555a() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.f36543a;
        if (obj instanceof zzc) {
            return ((zzc) obj).f36551a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzfzp<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f36543a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfxx.zzf
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f36539f
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzfxx$zzb r3 = new com.google.android.gms.internal.ads.zzfxx$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzfxx$zzb r3 = com.google.android.gms.internal.ads.zzfxx.zzb.f36546c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzfxx$zzb r3 = com.google.android.gms.internal.ads.zzfxx.zzb.f36547d
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.zzfxx$zza r6 = f36541o
            boolean r6 = r6.mo46571f(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.mo46561t()
        L_0x0038:
            m51265A(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfxx.zzf
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzfxx$zzf r0 = (com.google.android.gms.internal.ads.zzfxx.zzf) r0
            com.google.android.gms.internal.ads.zzfzp<? extends V> r0 = r0.f36562c
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfxx.zzh
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.zzfxx r4 = (com.google.android.gms.internal.ads.zzfxx) r4
            java.lang.Object r0 = r4.f36543a
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfxx.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = 1
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.f36543a
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfxx.zzf
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxx.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo46078d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo46079e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo46080f(Object obj) {
        if (obj == null) {
            obj = f36542p;
        }
        if (!f36541o.mo46571f(this, (Object) null, obj)) {
            return false;
        }
        m51265A(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo46081g(Throwable th) {
        Objects.requireNonNull(th);
        if (!f36541o.mo46571f(this, (Object) null, new zzc(th))) {
            return false;
        }
        m51265A(this);
        return true;
    }

    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f36543a;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return m51268c(obj2);
            }
            zzk zzk2 = this.f36545d;
            if (zzk2 != zzk.f36569c) {
                zzk zzk3 = new zzk();
                do {
                    zza zza2 = f36541o;
                    zza2.mo46568c(zzk3, zzk2);
                    if (zza2.mo46572g(this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36543a;
                            } else {
                                m51267b(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return m51268c(obj);
                    }
                    zzk2 = this.f36545d;
                } while (zzk2 != zzk.f36569c);
            }
            Object obj3 = this.f36543a;
            obj3.getClass();
            return m51268c(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f36543a instanceof zzb;
    }

    public boolean isDone() {
        Object obj = this.f36543a;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    /* renamed from: q */
    public void mo43580q(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzfsx.m50938c(runnable, "Runnable was null.");
        zzfsx.m50938c(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.f36544c) == zzd.f36552d) {
            m51266B(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.f36555c = zzd2;
            if (!f36541o.mo46570e(this, zzd2, zzd3)) {
                zzd2 = this.f36544c;
            } else {
                return;
            }
        } while (zzd2 != zzd.f36552d);
        m51266B(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo46561t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m51280x(sb);
        } else {
            m51281y(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo46563u(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo46565w());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo46564v(zzfzp zzfzp) {
        zzc zzc2;
        Objects.requireNonNull(zzfzp);
        Object obj = this.f36543a;
        if (obj == null) {
            if (zzfzp.isDone()) {
                if (!f36541o.mo46571f(this, (Object) null, m51269h(zzfzp))) {
                    return false;
                }
                m51265A(this);
                return true;
            }
            zzf zzf2 = new zzf(this, zzfzp);
            if (f36541o.mo46571f(this, (Object) null, zzf2)) {
                try {
                    zzfzp.mo43580q(zzf2, zzfyu.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzc2 = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzc2 = zzc.f36550b;
                    }
                    f36541o.mo46571f(this, zzf2, zzc2);
                }
                return true;
            }
            obj = this.f36543a;
        }
        if (obj instanceof zzb) {
            zzfzp.cancel(((zzb) obj).f36548a);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo46565w() {
        Object obj = this.f36543a;
        return (obj instanceof zzb) && ((zzb) obj).f36548a;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f36543a;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof zzf))) {
                return m51268c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.f36545d;
                if (zzk2 != zzk.f36569c) {
                    zzk zzk3 = new zzk();
                    do {
                        zza zza2 = f36541o;
                        zza2.mo46568c(zzk3, zzk2);
                        if (zza2.mo46572g(this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f36543a;
                                    if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                        return m51268c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m51267b(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m51267b(zzk3);
                        } else {
                            zzk2 = this.f36545d;
                        }
                    } while (zzk2 != zzk.f36569c);
                }
                Object obj3 = this.f36543a;
                obj3.getClass();
                return m51268c(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f36543a;
                if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                    return m51268c(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfxx = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzfxx);
        }
        throw new InterruptedException();
    }
}
