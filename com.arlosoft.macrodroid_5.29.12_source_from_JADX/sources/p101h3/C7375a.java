package p101h3;

import android.content.Context;
import android.os.Build;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.C13706o;
import p277h9.C12408a;
import p319lc.C15626c;

/* renamed from: h3.a */
/* compiled from: CustomToastHelper.kt */
public final class C7375a {

    /* renamed from: a */
    public static final C7375a f18029a = new C7375a();

    private C7375a() {
    }

    /* renamed from: a */
    public static final void m30478a(Context context, String str, @ColorInt int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "message");
        if (Build.VERSION.SDK_INT < 29) {
            C12408a.C12409a.m83286b().mo68758c(i).mo68757a();
            C12408a.m83283q(context, str, i2, i3, i4, z, z2).show();
            return;
        }
        C15626c.m94876a(context, str, 1).show();
    }
}
