package dev.skomlach.common.misc;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15499o1;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p240d9.C11966a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002J\u001a\u0010\u000e\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000f\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005J\u001a\u0010\u0010\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005J\u0012\u0010\u0012\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 Rh\u0010&\u001aV\u0012\u0016\u0012\u0014 #*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u0004j\u0002`\u0005\u0012\f\u0012\n #*\u0004\u0018\u00010\u00070\u0007 #**\u0012\u0016\u0012\u0014 #*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u0004j\u0002`\u0005\u0012\f\u0012\n #*\u0004\u0018\u00010\u00070\u0007\u0018\u00010$0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006*"}, mo71668d2 = {"Ldev/skomlach/common/misc/c;", "", "", "f", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "Lkotlinx/coroutines/w1;", "job", "Lja/u;", "b", "j", "", "delay", "l", "k", "h", "g", "i", "Landroid/os/Handler;", "Landroid/os/Handler;", "e", "()Landroid/os/Handler;", "handler", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "backgroundExecutor", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Map;", "tasksInMain", "<init>", "()V", "a", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.misc.c */
/* compiled from: ExecutorHelper.kt */
public final class C12114c {

    /* renamed from: a */
    public static final C12114c f58379a = new C12114c();

    /* renamed from: b */
    private static final Handler f58380b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final Executor f58381c = new C12115a();

    /* renamed from: d */
    private static final ExecutorService f58382d;

    /* renamed from: e */
    private static final Map<Runnable, C15561w1> f58383e = Collections.synchronizedMap(new WeakHashMap());

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/common/misc/c$a;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "Lja/u;", "execute", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: dev.skomlach.common.misc.c$a */
    /* compiled from: ExecutorHelper.kt */
    public static final class C12115a implements Executor {
        public void execute(Runnable runnable) {
            C13706o.m87929f(runnable, "runnable");
            C12114c.f58379a.mo68304e().post(runnable);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.misc.ExecutorHelper$post$job$1", mo71894f = "ExecutorHelper.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.misc.c$b */
    /* compiled from: ExecutorHelper.kt */
    static final class C12116b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Runnable $task;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12116b(Runnable runnable, C13635d<? super C12116b> dVar) {
            super(2, dVar);
            this.$task = runnable;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12116b(this.$task, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12116b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$task.run();
                C12114c.f58379a.m82583j(this.$task);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.misc.ExecutorHelper$postDelayed$job$1", mo71894f = "ExecutorHelper.kt", mo71895l = {85}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.misc.c$c */
    /* compiled from: ExecutorHelper.kt */
    static final class C12117c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ long $delay;
        final /* synthetic */ Runnable $task;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12117c(long j, Runnable runnable, C13635d<? super C12117c> dVar) {
            super(2, dVar);
            this.$delay = j;
            this.$task = runnable;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12117c(this.$delay, this.$task, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12117c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                long j = this.$delay;
                this.label = 1;
                if (C15552u0.m94699a(j, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$task.run();
            C12114c.f58379a.m82583j(this.$task);
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.misc.ExecutorHelper$startOnBackground$job$1", mo71894f = "ExecutorHelper.kt", mo71895l = {64}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.misc.c$d */
    /* compiled from: ExecutorHelper.kt */
    static final class C12118d extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ long $delay;
        final /* synthetic */ Runnable $task;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12118d(long j, Runnable runnable, C13635d<? super C12118d> dVar) {
            super(2, dVar);
            this.$delay = j;
            this.$task = runnable;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12118d(this.$delay, this.$task, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12118d) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                long j = this.$delay;
                this.label = 1;
                if (C15552u0.m94699a(j, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$task.run();
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.misc.ExecutorHelper$startOnBackground$job$2", mo71894f = "ExecutorHelper.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.misc.c$e */
    /* compiled from: ExecutorHelper.kt */
    static final class C12119e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Runnable $task;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12119e(Runnable runnable, C13635d<? super C12119e> dVar) {
            super(2, dVar);
            this.$task = runnable;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12119e(this.$task, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12119e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$task.run();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C13706o.m87928e(newCachedThreadPool, "newCachedThreadPool()");
        f58382d = newCachedThreadPool;
    }

    private C12114c() {
    }

    /* renamed from: b */
    private final void m82581b(Runnable runnable, C15561w1 w1Var) {
        try {
            Map<Runnable, C15561w1> map = f58383e;
            C13706o.m87928e(map, "tasksInMain");
            map.put(runnable, w1Var);
        } catch (Throwable th) {
            C11966a.f58161a.mo67382e(th, "addTaskSafely");
        }
    }

    /* renamed from: f */
    private final boolean m82582f() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m82583j(Runnable runnable) {
        try {
            f58383e.remove(runnable);
        } catch (Throwable th) {
            C11966a.f58161a.mo67382e(th, "removeTaskSafely");
        }
    }

    /* renamed from: c */
    public final ExecutorService mo68302c() {
        return f58382d;
    }

    /* renamed from: d */
    public final Executor mo68303d() {
        return f58381c;
    }

    /* renamed from: e */
    public final Handler mo68304e() {
        return f58380b;
    }

    /* renamed from: g */
    public final void mo68305g(Runnable runnable) {
        C13706o.m87929f(runnable, "task");
        if (m82582f()) {
            runnable.run();
        } else {
            m82581b(runnable, C15473j.m94492d(C15503p1.f64723a, C15186a1.m93731c(), (C15486m0) null, new C12116b(runnable, (C13635d<? super C12116b>) null), 2, (Object) null));
        }
    }

    /* renamed from: h */
    public final void mo68306h(Runnable runnable, long j) {
        C13706o.m87929f(runnable, "task");
        m82581b(runnable, C15473j.m94492d(C15503p1.f64723a, C15186a1.m93731c(), (C15486m0) null, new C12117c(j, runnable, (C13635d<? super C12117c>) null), 2, (Object) null));
    }

    /* renamed from: i */
    public final void mo68307i(Runnable runnable) {
        C13706o.m87929f(runnable, "task");
        try {
            Map<Runnable, C15561w1> map = f58383e;
            C15561w1 w1Var = map.get(runnable);
            if (w1Var != null) {
                C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
            }
            map.remove(runnable);
        } catch (Throwable th) {
            C11966a.f58161a.mo67382e(th, "removeCallbacks");
        }
    }

    /* renamed from: k */
    public final void mo68308k(Runnable runnable) {
        C13706o.m87929f(runnable, "task");
        if (!m82582f()) {
            runnable.run();
        } else {
            m82581b(runnable, C15473j.m94492d(C15503p1.f64723a, C15499o1.m94575b(f58382d), (C15486m0) null, new C12119e(runnable, (C13635d<? super C12119e>) null), 2, (Object) null));
        }
    }

    /* renamed from: l */
    public final void mo68309l(Runnable runnable, long j) {
        C13706o.m87929f(runnable, "task");
        m82581b(runnable, C15473j.m94492d(C15503p1.f64723a, C15499o1.m94575b(f58382d), (C15486m0) null, new C12118d(j, runnable, (C13635d<? super C12118d>) null), 2, (Object) null));
    }
}
