package p309kc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.android.p023dx.rop.code.RegisterSpec;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u001c"}, mo71668d2 = {"Lkc/d;", "Landroid/os/MessageQueue$IdleHandler;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Lja/u;", "a", "Landroid/content/Context;", "sourceContext", "Landroid/app/Activity;", "b", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "", "queueIdle", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Ljava/lang/reflect/Field;", "mHField", "mServedViewField", "Ljava/lang/reflect/Method;", "finishInputLockedMethod", "<init>", "(Landroid/view/inputmethod/InputMethodManager;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
/* renamed from: kc.d */
/* compiled from: ReferenceCleaner.kt */
public final class C13549d implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final InputMethodManager f61824a;

    /* renamed from: c */
    private final Field f61825c;

    /* renamed from: d */
    private final Field f61826d;

    /* renamed from: f */
    private final Method f61827f;

    public C13549d(InputMethodManager inputMethodManager, Field field, Field field2, Method method) {
        C13706o.m87930g(inputMethodManager, "inputMethodManager");
        C13706o.m87930g(field, "mHField");
        C13706o.m87930g(field2, "mServedViewField");
        C13706o.m87930g(method, "finishInputLockedMethod");
        this.f61824a = inputMethodManager;
        this.f61825c = field;
        this.f61826d = field2;
        this.f61827f = method;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r1 = p471qf.C17227a.f68788b.mo80524a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        r1.mo80525a(r0, "Could not fix leak");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m87349a() {
        /*
            r6 = this;
            java.lang.reflect.Field r0 = r6.f61825c     // Catch:{ all -> 0x0082 }
            android.view.inputmethod.InputMethodManager r1 = r6.f61824a     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0018
            qf.a r0 = p471qf.C17227a.f68788b     // Catch:{ all -> 0x0082 }
            qf.a$a r0 = r0.mo80524a()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = "InputMethodManager.mH was null, could not fix leak."
            r0.mo80526b(r1)     // Catch:{ all -> 0x0082 }
        L_0x0017:
            return
        L_0x0018:
            monitor-enter(r0)     // Catch:{ all -> 0x0082 }
            java.lang.reflect.Field r1 = r6.f61826d     // Catch:{ all -> 0x007f }
            android.view.inputmethod.InputMethodManager r2 = r6.f61824a     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x007f }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x007b
            int r2 = r1.getWindowVisibility()     // Catch:{ all -> 0x007f }
            r3 = 1
            r4 = 8
            r5 = 0
            if (r2 == r4) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r2 == 0) goto L_0x003b
            r1.removeOnAttachStateChangeListener(r6)     // Catch:{ all -> 0x007f }
            r1.addOnAttachStateChangeListener(r6)     // Catch:{ all -> 0x007f }
            goto L_0x007b
        L_0x003b:
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "servedView.context"
            kotlin.jvm.internal.C13706o.m87925b(r1, r2)     // Catch:{ all -> 0x007f }
            android.app.Activity r1 = r6.m87350b(r1)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0072
            android.view.Window r2 = r1.getWindow()     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0051
            goto L_0x0072
        L_0x0051:
            android.view.Window r1 = r1.getWindow()     // Catch:{ all -> 0x007f }
            android.view.View r1 = r1.peekDecorView()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "decorView"
            kotlin.jvm.internal.C13706o.m87925b(r1, r2)     // Catch:{ all -> 0x007f }
            int r1 = r1.getWindowVisibility()     // Catch:{ all -> 0x007f }
            if (r1 == r4) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            if (r3 != 0) goto L_0x007b
            java.lang.reflect.Method r1 = r6.f61827f     // Catch:{ all -> 0x007f }
            android.view.inputmethod.InputMethodManager r2 = r6.f61824a     // Catch:{ all -> 0x007f }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x007f }
            r1.invoke(r2, r3)     // Catch:{ all -> 0x007f }
            goto L_0x007b
        L_0x0072:
            java.lang.reflect.Method r1 = r6.f61827f     // Catch:{ all -> 0x007f }
            android.view.inputmethod.InputMethodManager r2 = r6.f61824a     // Catch:{ all -> 0x007f }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x007f }
            r1.invoke(r2, r3)     // Catch:{ all -> 0x007f }
        L_0x007b:
            ja.u r1 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0090
        L_0x007f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            qf.a r1 = p471qf.C17227a.f68788b
            qf.a$a r1 = r1.mo80524a()
            if (r1 == 0) goto L_0x0090
            java.lang.String r2 = "Could not fix leak"
            r1.mo80525a(r0, r2)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p309kc.C13549d.m87349a():void");
    }

    /* renamed from: b */
    private final Activity m87350b(Context context) {
        Context baseContext;
        while (!(context instanceof Application)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
                return null;
            }
            C13706o.m87925b(baseContext, "baseContext");
            context = baseContext;
        }
        return null;
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (view2 != null) {
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
            Looper.myQueue().removeIdleHandler(this);
            view2.addOnAttachStateChangeListener(this);
        }
    }

    public void onViewAttachedToWindow(View view) {
        C13706o.m87930g(view, RegisterSpec.PREFIX);
    }

    public void onViewDetachedFromWindow(View view) {
        C13706o.m87930g(view, RegisterSpec.PREFIX);
        view.removeOnAttachStateChangeListener(this);
        Looper.myQueue().removeIdleHandler(this);
        Looper.myQueue().addIdleHandler(this);
    }

    public boolean queueIdle() {
        m87349a();
        return false;
    }
}
