package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@DoNotMock
public final class ClosingFuture<V> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f53461d = Logger.getLogger(ClosingFuture.class.getName());

    /* renamed from: a */
    private final AtomicReference<State> f53462a = new AtomicReference<>(State.OPEN);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final CloseableList f53463b = new CloseableList((C109741) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final FluentFuture<V> f53464c;

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$1 */
    class C109741 implements FutureCallback<Closeable> {

        /* renamed from: a */
        final /* synthetic */ ClosingFuture f53465a;

        /* renamed from: b */
        final /* synthetic */ Executor f53466b;

        /* renamed from: a */
        public void mo61663a(Throwable th) {
        }

        /* renamed from: c */
        public void mo61664b(Closeable closeable) {
            this.f53465a.f53463b.closer.mo61708a(closeable, this.f53466b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$10 */
    class C1097510 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ValueAndCloserConsumer f53467a;

        /* renamed from: c */
        final /* synthetic */ ClosingFuture f53468c;

        public void run() {
            ClosingFuture.m74073p(this.f53467a, this.f53468c);
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$12 */
    static /* synthetic */ class C1097712 {

        /* renamed from: a */
        static final /* synthetic */ int[] f53470a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = com.google.common.util.concurrent.ClosingFuture.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53470a = r0
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53470a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53470a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53470a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53470a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f53470a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ClosingFuture.C1097712.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$2 */
    class C109782 implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ ClosingCallable f53471a;

        /* renamed from: c */
        final /* synthetic */ ClosingFuture f53472c;

        @ParametricNullness
        public Object call() throws Exception {
            return this.f53471a.mo61684a(this.f53472c.f53463b.closer);
        }

        public String toString() {
            return this.f53471a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$3 */
    class C109793 implements AsyncCallable<Object> {

        /* renamed from: a */
        final /* synthetic */ AsyncClosingCallable f53473a;

        /* renamed from: b */
        final /* synthetic */ ClosingFuture f53474b;

        public ListenableFuture<Object> call() throws Exception {
            CloseableList closeableList = new CloseableList((C109741) null);
            try {
                ClosingFuture a = this.f53473a.mo61679a(closeableList.closer);
                a.m74067i(this.f53474b.f53463b);
                return a.f53464c;
            } finally {
                this.f53474b.f53463b.mo61680c(closeableList, MoreExecutors.m74259a());
            }
        }

        public String toString() {
            return this.f53473a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$4 */
    class C109804 implements AsyncFunction<Object, Object> {

        /* renamed from: a */
        final /* synthetic */ ClosingFunction f53475a;

        /* renamed from: b */
        final /* synthetic */ ClosingFuture f53476b;

        public ListenableFuture<Object> apply(Object obj) throws Exception {
            return this.f53476b.f53463b.mo61683f(this.f53475a, obj);
        }

        public String toString() {
            return this.f53475a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$5 */
    class C109815 implements AsyncFunction<Object, Object> {

        /* renamed from: a */
        final /* synthetic */ AsyncClosingFunction f53477a;

        /* renamed from: b */
        final /* synthetic */ ClosingFuture f53478b;

        public ListenableFuture<Object> apply(Object obj) throws Exception {
            return this.f53478b.f53463b.mo61682e(this.f53477a, obj);
        }

        public String toString() {
            return this.f53477a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$6 */
    class C109826 implements AsyncClosingFunction<Object, Object> {

        /* renamed from: a */
        final /* synthetic */ AsyncFunction f53479a;

        /* renamed from: a */
        public ClosingFuture<Object> mo61673a(DeferredCloser deferredCloser, Object obj) throws Exception {
            return ClosingFuture.m74072o(this.f53479a.apply(obj));
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$7 */
    class C109837 implements AsyncFunction<Throwable, Object> {

        /* renamed from: a */
        final /* synthetic */ ClosingFunction f53480a;

        /* renamed from: b */
        final /* synthetic */ ClosingFuture f53481b;

        /* renamed from: a */
        public ListenableFuture<Object> apply(Throwable th) throws Exception {
            return this.f53481b.f53463b.mo61683f(this.f53480a, th);
        }

        public String toString() {
            return this.f53480a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$8 */
    class C109848 implements AsyncFunction<Throwable, Object> {

        /* renamed from: a */
        final /* synthetic */ AsyncClosingFunction f53482a;

        /* renamed from: b */
        final /* synthetic */ ClosingFuture f53483b;

        /* renamed from: a */
        public ListenableFuture<Object> apply(Throwable th) throws Exception {
            return this.f53483b.f53463b.mo61682e(this.f53482a, th);
        }

        public String toString() {
            return this.f53482a.toString();
        }
    }

    public interface AsyncClosingCallable<V> {
        /* renamed from: a */
        ClosingFuture<V> mo61679a(DeferredCloser deferredCloser) throws Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        /* renamed from: a */
        ClosingFuture<U> mo61673a(DeferredCloser deferredCloser, @ParametricNullness T t) throws Exception;
    }

    public interface ClosingCallable<V> {
        @ParametricNullness
        /* renamed from: a */
        V mo61684a(DeferredCloser deferredCloser) throws Exception;
    }

    public interface ClosingFunction<T, U> {
        @ParametricNullness
        /* renamed from: a */
        U mo61685a(DeferredCloser deferredCloser, @ParametricNullness T t) throws Exception;
    }

    @DoNotMock
    public static class Combiner {

        /* renamed from: c */
        private static final Function<ClosingFuture<?>, FluentFuture<?>> f53485c = new Function<ClosingFuture<?>, FluentFuture<?>>() {
            /* renamed from: a */
            public FluentFuture<?> apply(ClosingFuture<?> closingFuture) {
                return closingFuture.f53464c;
            }
        };
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final CloseableList f53486a;

        /* renamed from: b */
        protected final ImmutableList<ClosingFuture<?>> f53487b;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$1 */
        class C109861 implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ CombiningCallable f53488a;

            /* renamed from: c */
            final /* synthetic */ Combiner f53489c;

            @ParametricNullness
            public Object call() throws Exception {
                return new Peeker(this.f53489c.f53487b, (C109741) null).m74126c(this.f53488a, this.f53489c.f53486a);
            }

            public String toString() {
                return this.f53488a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$2 */
        class C109872 implements AsyncCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ AsyncCombiningCallable f53490a;

            /* renamed from: b */
            final /* synthetic */ Combiner f53491b;

            public ListenableFuture<Object> call() throws Exception {
                return new Peeker(this.f53491b.f53487b, (C109741) null).m74127d(this.f53490a, this.f53491b.f53486a);
            }

            public String toString() {
                return this.f53490a.toString();
            }
        }

        public interface AsyncCombiningCallable<V> {
            /* renamed from: a */
            ClosingFuture<V> mo61690a(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        public interface CombiningCallable<V> {
            @ParametricNullness
            /* renamed from: a */
            V mo61691a(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }
    }

    public static final class Combiner2<V1, V2> extends Combiner {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ClosingFuture<V1> f53492d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final ClosingFuture<V2> f53493e;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$1 */
        class C109891 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ ClosingFunction2 f53494a;

            /* renamed from: b */
            final /* synthetic */ Combiner2 f53495b;

            @ParametricNullness
            /* renamed from: a */
            public Object mo61691a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53494a.mo61695a(deferredCloser, peeker.mo61709e(this.f53495b.f53492d), peeker.mo61709e(this.f53495b.f53493e));
            }

            public String toString() {
                return this.f53494a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$2 */
        class C109902 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ AsyncClosingFunction2 f53496a;

            /* renamed from: b */
            final /* synthetic */ Combiner2 f53497b;

            /* renamed from: a */
            public ClosingFuture<Object> mo61690a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53496a.mo61694a(deferredCloser, peeker.mo61709e(this.f53497b.f53492d), peeker.mo61709e(this.f53497b.f53493e));
            }

            public String toString() {
                return this.f53496a.toString();
            }
        }

        public interface AsyncClosingFunction2<V1, V2, U> {
            /* renamed from: a */
            ClosingFuture<U> mo61694a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2) throws Exception;
        }

        public interface ClosingFunction2<V1, V2, U> {
            @ParametricNullness
            /* renamed from: a */
            U mo61695a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2) throws Exception;
        }
    }

    public static final class Combiner3<V1, V2, V3> extends Combiner {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ClosingFuture<V1> f53498d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final ClosingFuture<V2> f53499e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ClosingFuture<V3> f53500f;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$1 */
        class C109911 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ ClosingFunction3 f53501a;

            /* renamed from: b */
            final /* synthetic */ Combiner3 f53502b;

            @ParametricNullness
            /* renamed from: a */
            public Object mo61691a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53501a.mo61699a(deferredCloser, peeker.mo61709e(this.f53502b.f53498d), peeker.mo61709e(this.f53502b.f53499e), peeker.mo61709e(this.f53502b.f53500f));
            }

            public String toString() {
                return this.f53501a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$2 */
        class C109922 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ AsyncClosingFunction3 f53503a;

            /* renamed from: b */
            final /* synthetic */ Combiner3 f53504b;

            /* renamed from: a */
            public ClosingFuture<Object> mo61690a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53503a.mo61698a(deferredCloser, peeker.mo61709e(this.f53504b.f53498d), peeker.mo61709e(this.f53504b.f53499e), peeker.mo61709e(this.f53504b.f53500f));
            }

            public String toString() {
                return this.f53503a.toString();
            }
        }

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            /* renamed from: a */
            ClosingFuture<U> mo61698a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3) throws Exception;
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            @ParametricNullness
            /* renamed from: a */
            U mo61699a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3) throws Exception;
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ClosingFuture<V1> f53505d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final ClosingFuture<V2> f53506e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ClosingFuture<V3> f53507f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final ClosingFuture<V4> f53508g;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$1 */
        class C109931 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ ClosingFunction4 f53509a;

            /* renamed from: b */
            final /* synthetic */ Combiner4 f53510b;

            @ParametricNullness
            /* renamed from: a */
            public Object mo61691a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53509a.mo61703a(deferredCloser, peeker.mo61709e(this.f53510b.f53505d), peeker.mo61709e(this.f53510b.f53506e), peeker.mo61709e(this.f53510b.f53507f), peeker.mo61709e(this.f53510b.f53508g));
            }

            public String toString() {
                return this.f53509a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$2 */
        class C109942 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ AsyncClosingFunction4 f53511a;

            /* renamed from: b */
            final /* synthetic */ Combiner4 f53512b;

            /* renamed from: a */
            public ClosingFuture<Object> mo61690a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53511a.mo61702a(deferredCloser, peeker.mo61709e(this.f53512b.f53505d), peeker.mo61709e(this.f53512b.f53506e), peeker.mo61709e(this.f53512b.f53507f), peeker.mo61709e(this.f53512b.f53508g));
            }

            public String toString() {
                return this.f53511a.toString();
            }
        }

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            /* renamed from: a */
            ClosingFuture<U> mo61702a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4) throws Exception;
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @ParametricNullness
            /* renamed from: a */
            U mo61703a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4) throws Exception;
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ClosingFuture<V1> f53513d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final ClosingFuture<V2> f53514e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ClosingFuture<V3> f53515f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final ClosingFuture<V4> f53516g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final ClosingFuture<V5> f53517h;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$1 */
        class C109951 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ ClosingFunction5 f53518a;

            /* renamed from: b */
            final /* synthetic */ Combiner5 f53519b;

            @ParametricNullness
            /* renamed from: a */
            public Object mo61691a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53518a.mo61707a(deferredCloser, peeker.mo61709e(this.f53519b.f53513d), peeker.mo61709e(this.f53519b.f53514e), peeker.mo61709e(this.f53519b.f53515f), peeker.mo61709e(this.f53519b.f53516g), peeker.mo61709e(this.f53519b.f53517h));
            }

            public String toString() {
                return this.f53518a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$2 */
        class C109962 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a */
            final /* synthetic */ AsyncClosingFunction5 f53520a;

            /* renamed from: b */
            final /* synthetic */ Combiner5 f53521b;

            /* renamed from: a */
            public ClosingFuture<Object> mo61690a(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                return this.f53520a.mo61706a(deferredCloser, peeker.mo61709e(this.f53521b.f53513d), peeker.mo61709e(this.f53521b.f53514e), peeker.mo61709e(this.f53521b.f53515f), peeker.mo61709e(this.f53521b.f53516g), peeker.mo61709e(this.f53521b.f53517h));
            }

            public String toString() {
                return this.f53520a.toString();
            }
        }

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            /* renamed from: a */
            ClosingFuture<U> mo61706a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4, @ParametricNullness V5 v5) throws Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @ParametricNullness
            /* renamed from: a */
            U mo61707a(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4, @ParametricNullness V5 v5) throws Exception;
        }
    }

    public static final class DeferredCloser {
        @RetainedWith

        /* renamed from: a */
        private final CloseableList f53522a;

        DeferredCloser(CloseableList closeableList) {
            this.f53522a = closeableList;
        }

        @ParametricNullness
        @CanIgnoreReturnValue
        /* renamed from: a */
        public <C extends Closeable> C mo61708a(@ParametricNullness C c, Executor executor) {
            Preconditions.m5392s(executor);
            if (c != null) {
                this.f53522a.mo61680c((Closeable) c, executor);
            }
            return c;
        }
    }

    public static final class Peeker {

        /* renamed from: a */
        private final ImmutableList<ClosingFuture<?>> f53523a;

        /* renamed from: b */
        private volatile boolean f53524b;

        /* synthetic */ Peeker(ImmutableList immutableList, C109741 r2) {
            this(immutableList);
        }

        /* access modifiers changed from: private */
        @ParametricNullness
        /* renamed from: c */
        public <V> V m74126c(Combiner.CombiningCallable<V> combiningCallable, CloseableList closeableList) throws Exception {
            this.f53524b = true;
            CloseableList closeableList2 = new CloseableList((C109741) null);
            try {
                return combiningCallable.mo61691a(closeableList2.closer, this);
            } finally {
                closeableList.mo61680c(closeableList2, MoreExecutors.m74259a());
                this.f53524b = false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public <V> FluentFuture<V> m74127d(Combiner.AsyncCombiningCallable<V> asyncCombiningCallable, CloseableList closeableList) throws Exception {
            this.f53524b = true;
            CloseableList closeableList2 = new CloseableList((C109741) null);
            try {
                ClosingFuture<V> a = asyncCombiningCallable.mo61690a(closeableList2.closer, this);
                a.m74067i(closeableList);
                return a.f53464c;
            } finally {
                closeableList.mo61680c(closeableList2, MoreExecutors.m74259a());
                this.f53524b = false;
            }
        }

        @ParametricNullness
        /* renamed from: e */
        public final <D> D mo61709e(ClosingFuture<D> closingFuture) throws ExecutionException {
            Preconditions.m5398y(this.f53524b);
            Preconditions.m5377d(this.f53523a.contains(closingFuture));
            return Futures.m74207a(closingFuture.f53464c);
        }

        private Peeker(ImmutableList<ClosingFuture<?>> immutableList) {
            this.f53523a = (ImmutableList) Preconditions.m5392s(immutableList);
        }
    }

    enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public static final class ValueAndCloser<V> {

        /* renamed from: a */
        private final ClosingFuture<? extends V> f53532a;

        ValueAndCloser(ClosingFuture<? extends V> closingFuture) {
            this.f53532a = (ClosingFuture) Preconditions.m5392s(closingFuture);
        }
    }

    public interface ValueAndCloserConsumer<V> {
        /* renamed from: a */
        void mo61710a(ValueAndCloser<V> valueAndCloser);
    }

    private ClosingFuture(ListenableFuture<V> listenableFuture) {
        this.f53464c = FluentFuture.m74178G(listenableFuture);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m74067i(CloseableList closeableList) {
        m74068j(State.OPEN, State.SUBSUMED);
        closeableList.mo61680c(this.f53463b, MoreExecutors.m74259a());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m74068j(State state, State state2) {
        Preconditions.m5373D(m74071m(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m74069k() {
        f53461d.log(Level.FINER, "closing {0}", this);
        this.f53463b.close();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m74070l(final Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new Runnable() {
                    public void run() {
                        try {
                            closeable.close();
                        } catch (IOException | RuntimeException e) {
                            ClosingFuture.f53461d.log(Level.WARNING, "thrown by close()", e);
                        }
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger logger = f53461d;
                Level level = Level.WARNING;
                if (logger.isLoggable(level)) {
                    logger.log(level, String.format("while submitting close to %s; will close inline", new Object[]{executor}), e);
                }
                m74070l(closeable, MoreExecutors.m74259a());
            }
        }
    }

    /* renamed from: m */
    private boolean m74071m(State state, State state2) {
        return this.f53462a.compareAndSet(state, state2);
    }

    /* renamed from: o */
    public static <V> ClosingFuture<V> m74072o(ListenableFuture<V> listenableFuture) {
        return new ClosingFuture<>(listenableFuture);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static <C, V extends C> void m74073p(ValueAndCloserConsumer<C> valueAndCloserConsumer, ClosingFuture<V> closingFuture) {
        valueAndCloserConsumer.mo61710a(new ValueAndCloser(closingFuture));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.f53462a.get().equals(State.OPEN)) {
            f53461d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            mo61661n();
        }
    }

    /* renamed from: n */
    public FluentFuture<V> mo61661n() {
        if (m74071m(State.OPEN, State.WILL_CLOSE)) {
            f53461d.log(Level.FINER, "will close {0}", this);
            this.f53464c.addListener(new Runnable() {
                public void run() {
                    ClosingFuture closingFuture = ClosingFuture.this;
                    State state = State.WILL_CLOSE;
                    State state2 = State.CLOSING;
                    closingFuture.m74068j(state, state2);
                    ClosingFuture.this.m74069k();
                    ClosingFuture.this.m74068j(state2, State.CLOSED);
                }
            }, MoreExecutors.m74259a());
        } else {
            switch (C1097712.f53470a[this.f53462a.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        return this.f53464c;
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("state", this.f53462a.get()).mo22196k(this.f53464c).toString();
    }

    private static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {
        private volatile boolean closed;
        /* access modifiers changed from: private */
        public final DeferredCloser closer;
        private volatile CountDownLatch whenClosed;

        private CloseableList() {
            this.closer = new DeferredCloser(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo61680c(Closeable closeable, Executor executor) {
            Preconditions.m5392s(executor);
            if (closeable != null) {
                synchronized (this) {
                    if (!this.closed) {
                        put(closeable, executor);
                    } else {
                        ClosingFuture.m74070l(closeable, executor);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
            r0 = entrySet().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            if (r0.hasNext() == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
            r1 = (java.util.Map.Entry) r0.next();
            com.google.common.util.concurrent.ClosingFuture.m74066h((java.io.Closeable) r1.getKey(), (java.util.concurrent.Executor) r1.getValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
            if (r3.whenClosed == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
            r3.whenClosed.countDown();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r3)
                boolean r0 = r3.closed     // Catch:{ all -> 0x0041 }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r3)     // Catch:{ all -> 0x0041 }
                return
            L_0x000c:
                r0 = 1
                r3.closed = r0     // Catch:{ all -> 0x0041 }
                monitor-exit(r3)     // Catch:{ all -> 0x0041 }
                java.util.Set r0 = r3.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0018:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0034
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.io.Closeable r2 = (java.io.Closeable) r2
                java.lang.Object r1 = r1.getValue()
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                com.google.common.util.concurrent.ClosingFuture.m74070l(r2, r1)
                goto L_0x0018
            L_0x0034:
                r3.clear()
                java.util.concurrent.CountDownLatch r0 = r3.whenClosed
                if (r0 == 0) goto L_0x0040
                java.util.concurrent.CountDownLatch r0 = r3.whenClosed
                r0.countDown()
            L_0x0040:
                return
            L_0x0041:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0041 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ClosingFuture.CloseableList.close():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <V, U> FluentFuture<U> mo61682e(AsyncClosingFunction<V, U> asyncClosingFunction, @ParametricNullness V v) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<U> a = asyncClosingFunction.mo61673a(closeableList.closer, v);
                a.m74067i(closeableList);
                return a.f53464c;
            } finally {
                mo61680c(closeableList, MoreExecutors.m74259a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public <V, U> ListenableFuture<U> mo61683f(ClosingFunction<? super V, U> closingFunction, @ParametricNullness V v) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                return Futures.m74210d(closingFunction.mo61685a(closeableList.closer, v));
            } finally {
                mo61680c(closeableList, MoreExecutors.m74259a());
            }
        }

        /* synthetic */ CloseableList(C109741 r1) {
            this();
        }
    }
}
