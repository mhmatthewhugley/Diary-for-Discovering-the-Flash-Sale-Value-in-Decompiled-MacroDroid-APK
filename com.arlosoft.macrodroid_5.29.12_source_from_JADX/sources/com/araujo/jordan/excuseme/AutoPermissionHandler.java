package com.araujo.jordan.excuseme;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p018c0.C1423a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0007R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/AutoPermissionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Landroidx/lifecycle/LifecycleObserver;", "", "trowable", "Lkotlinx/coroutines/w1;", "c", "Ljava/lang/Thread;", "thread", "Lja/u;", "uncaughtException", "onDestroy", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "activity", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: AutoPermissionHandler.kt */
public final class AutoPermissionHandler implements Thread.UncaughtExceptionHandler, LifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f1062a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C16265l<? super Boolean, C13339u> f1063c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "com.araujo.jordan.excuseme.AutoPermissionHandler$handlePermission$1", mo71894f = "AutoPermissionHandler.kt", mo71895l = {92}, mo71896m = "invokeSuspend")
    /* renamed from: com.araujo.jordan.excuseme.AutoPermissionHandler$a */
    /* compiled from: AutoPermissionHandler.kt */
    static final class C1623a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Throwable $trowable;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* renamed from: p$ */
        private C15478k0 f1064p$;
        final /* synthetic */ AutoPermissionHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1623a(AutoPermissionHandler autoPermissionHandler, Throwable th, C13635d dVar) {
            super(2, dVar);
            this.this$0 = autoPermissionHandler;
            this.$trowable = th;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C13706o.m87930g(dVar, "completion");
            C1623a aVar = new C1623a(this.this$0, this.$trowable, dVar);
            aVar.f1064p$ = (C15478k0) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C1623a) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            Activity a;
            Collection collection;
            List x0;
            Object c = C13652d.m87832c();
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = this.f1064p$;
                String message = this.$trowable.getMessage();
                if (message == null || (x0 = C15177w.m93705x0(message, new String[]{" "}, false, 0, 6, (Object) null)) == null) {
                    collection = C13614t.m87748j();
                } else {
                    collection = new ArrayList();
                    for (Object next : x0) {
                        if (C13654b.m87833a(C15176v.m93634I((String) next, "android.permission.", false, 2, (Object) null)).booleanValue()) {
                            collection.add(next);
                        }
                    }
                }
                Object[] array = collection.toArray(new String[0]);
                if (array != null) {
                    String[] strArr2 = (String[]) array;
                    if (strArr2.length == 0) {
                        return C13339u.f61331a;
                    }
                    Activity a2 = this.this$0.f1062a;
                    if (a2 != null) {
                        this.L$0 = k0Var;
                        this.L$1 = strArr2;
                        this.L$2 = a2;
                        this.label = 1;
                        obj = C1624a.f1072f.mo19234c(a2).mo19239h((String[]) Arrays.copyOf(strArr2, strArr2.length), this);
                        if (obj == c) {
                            return c;
                        }
                        strArr = strArr2;
                    }
                    return C13339u.f61331a;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (i == 1) {
                Activity activity = (Activity) this.L$2;
                strArr = (String[]) this.L$1;
                C15478k0 k0Var2 = (C15478k0) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((C1423a) obj).mo16888b().size() == strArr.length) {
                z = true;
            }
            C16265l b = this.this$0.f1063c;
            if ((b == null || ((C13339u) b.invoke(C13654b.m87833a(z))) == null) && (a = this.this$0.f1062a) != null) {
                a.recreate();
                C13339u uVar = C13339u.f61331a;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: c */
    private final C15561w1 m913c(Throwable th) {
        return C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().mo74507o()), (C13640g) null, (C15486m0) null, new C1623a(this, th, (C13635d) null), 3, (Object) null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.f1062a = null;
        Thread currentThread = Thread.currentThread();
        C13706o.m87925b(currentThread, "Thread.currentThread()");
        currentThread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String message;
        C13706o.m87930g(thread, "thread");
        C13706o.m87930g(th, "trowable");
        if (!(th instanceof SecurityException) || (message = th.getMessage()) == null || !C15177w.m93659L(message, "Permission Denial", true)) {
            System.out.println(th.getMessage());
            Activity activity = this.f1062a;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        m913c(th);
    }
}
