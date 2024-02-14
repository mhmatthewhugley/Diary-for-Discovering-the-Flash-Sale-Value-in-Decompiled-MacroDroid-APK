package p038md;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo71668d2 = {"Landroid/content/Context;", "Landroid/app/ActivityManager;", "a", "(Landroid/content/Context;)Landroid/app/ActivityManager;", "activityManager", "anko-sdk27_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: md.g */
/* compiled from: Services.kt */
public final class C2035g {
    /* renamed from: a */
    public static final ActivityManager m8420a(Context context) {
        C13706o.m87930g(context, "receiver$0");
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            return (ActivityManager) systemService;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
