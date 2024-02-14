package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.google.errorprone.annotations.ForOverride;
import java.lang.Throwable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {

    /* renamed from: A */
    F f53340A;

    /* renamed from: s */
    ListenableFuture<? extends V> f53341s;

    /* renamed from: z */
    Class<X> f53342z;

    private static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public ListenableFuture<? extends V> mo61542H(AsyncFunction<? super X, ? extends V> asyncFunction, X x) throws Exception {
            ListenableFuture<? extends V> apply = asyncFunction.apply(x);
            Preconditions.m5394u(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo61543I(ListenableFuture<? extends V> listenableFuture) {
            mo61564E(listenableFuture);
        }
    }

    private static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public void mo61543I(@ParametricNullness V v) {
            mo61562C(v);
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: J */
        public V mo61542H(Function<? super X, ? extends V> function, X x) throws Exception {
            return function.apply(x);
        }
    }

    /* access modifiers changed from: package-private */
    @ForOverride
    @ParametricNullness
    /* renamed from: H */
    public abstract T mo61542H(F f, X x) throws Exception;

    /* access modifiers changed from: package-private */
    @ForOverride
    /* renamed from: I */
    public abstract void mo61543I(@ParametricNullness T t);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo61544m() {
        mo61574y(this.f53341s);
        this.f53341s = null;
        this.f53342z = null;
        this.f53340A = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r9.f53341s
            java.lang.Class<X> r1 = r9.f53342z
            F r2 = r9.f53340A
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00b2
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x00b2
        L_0x0022:
            r3 = 0
            r9.f53341s = r3
            boolean r4 = r0 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.common.util.concurrent.internal.InternalFutureFailureAccess r4 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r4     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            java.lang.Throwable r4 = com.google.common.util.concurrent.internal.InternalFutures.m74373a(r4)     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003a
            java.lang.Object r5 = com.google.common.util.concurrent.Futures.m74207a(r0)     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0083
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            r5 = r3
            goto L_0x0083
        L_0x003c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0081
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Future type "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " threw "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " without a cause"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r5.<init>(r4)
        L_0x0081:
            r4 = r5
            goto L_0x003a
        L_0x0083:
            if (r4 != 0) goto L_0x008d
            java.lang.Object r0 = com.google.common.util.concurrent.NullnessCasts.m74277a(r5)
            r9.mo61562C(r0)
            return
        L_0x008d:
            boolean r1 = com.google.common.util.concurrent.Platform.m74280a(r4, r1)
            if (r1 != 0) goto L_0x0097
            r9.mo61564E(r0)
            return
        L_0x0097:
            java.lang.Object r0 = r9.mo61542H(r2, r4)     // Catch:{ all -> 0x00a3 }
            r9.f53342z = r3
            r9.f53340A = r3
            r9.mo61543I(r0)
            return
        L_0x00a3:
            r0 = move-exception
            r9.mo61563D(r0)     // Catch:{ all -> 0x00ac }
            r9.f53342z = r3
            r9.f53340A = r3
            return
        L_0x00ac:
            r0 = move-exception
            r9.f53342z = r3
            r9.f53340A = r3
            throw r0
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractCatchingFuture.run():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo61546z() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.f53341s;
        Class<X> cls = this.f53342z;
        F f = this.f53340A;
        String z = super.mo61546z();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + valueOf2.length() + valueOf3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (z == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            return z.length() != 0 ? valueOf4.concat(z) : new String(valueOf4);
        }
    }
}
