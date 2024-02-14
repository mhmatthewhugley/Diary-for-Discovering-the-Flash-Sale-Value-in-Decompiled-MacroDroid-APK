package dev.skomlach.common.misc;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, mo71668d2 = {"Landroid/content/Context;", "context", "", "a", "common_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.misc.a */
/* compiled from: ActivityTools.kt */
public final class C12112a {
    /* renamed from: a */
    public static final boolean m82576a(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
        }
        return false;
    }
}
