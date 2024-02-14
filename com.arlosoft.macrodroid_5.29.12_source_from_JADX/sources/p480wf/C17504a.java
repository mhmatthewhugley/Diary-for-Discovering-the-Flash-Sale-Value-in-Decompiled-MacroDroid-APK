package p480wf;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.app.backup.BackupAgent;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, mo71668d2 = {"Landroid/content/Context;", "Lja/u;", "b", "", "a", "appctx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: wf.a */
/* compiled from: AppCtx.kt */
public final class C17504a {

    /* renamed from: a */
    private static Context f69321a;

    /* renamed from: a */
    public static final boolean m101263a(Context context) {
        C13706o.m87929f(context, "$this$canLeakMemory");
        if (context instanceof Application) {
            return false;
        }
        if (!(context instanceof Activity) && !(context instanceof Service) && !(context instanceof BackupAgent)) {
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext() != context) {
                    Context baseContext = contextWrapper.getBaseContext();
                    C13706o.m87928e(baseContext, "baseContext");
                    return m101263a(baseContext);
                }
            } else if (context.getApplicationContext() == null) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m101264b(Context context) {
        C13706o.m87929f(context, "$this$injectAsAppCtx");
        if (!m101263a(context)) {
            f69321a = context;
            return;
        }
        throw new IllegalArgumentException(("The passed Context(" + context + ") would leak memory!").toString());
    }
}
