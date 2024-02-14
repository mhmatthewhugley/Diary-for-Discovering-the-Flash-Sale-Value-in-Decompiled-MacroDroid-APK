package dev.skomlach.common.misc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.core.p007os.BuildCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p240d9.C11966a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0011\u0010\u000b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0012"}, mo71668d2 = {"Ldev/skomlach/common/misc/d;", "", "Landroid/content/Intent;", "intent", "Landroid/content/Context;", "context", "", "a", "e", "d", "()Z", "isAtLeastT", "b", "isAtLeastR", "c", "isAtLeastS", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.misc.d */
/* compiled from: Utils.kt */
public final class C12120d {

    /* renamed from: a */
    public static final C12120d f58384a = new C12120d();

    private C12120d() {
    }

    /* renamed from: a */
    private final boolean m82592a(Intent intent, Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        C13706o.m87928e(queryIntentActivities, "pm.queryIntentActivities(intent, 0)");
        if (queryIntentActivities.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo68315b() {
        return BuildCompat.isAtLeastR() || Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public final boolean mo68316c() {
        return BuildCompat.isAtLeastS() || Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: d */
    public final boolean mo68317d() {
        return BuildCompat.isAtLeastT() || Build.VERSION.SDK_INT >= 32;
    }

    /* renamed from: e */
    public final boolean mo68318e(Intent intent, Context context) {
        C13706o.m87929f(intent, "intent");
        C13706o.m87929f(context, "context");
        try {
            if (!m82592a(intent, context)) {
                return false;
            }
            context.startActivity(intent.addFlags(268435456));
            return true;
        } catch (Throwable th) {
            C11966a.f58161a.mo67381d(th);
            return false;
        }
    }
}
