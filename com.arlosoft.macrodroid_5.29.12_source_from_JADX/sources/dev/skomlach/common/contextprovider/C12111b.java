package dev.skomlach.common.contextprovider;

import android.content.Context;
import android.os.Bundle;
import dev.skomlach.common.misc.C12120d;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¨\u0006\u0005"}, mo71668d2 = {"Landroid/content/Context;", "b", "context", "a", "c", "common_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.contextprovider.b */
/* compiled from: ContextOnApi30.kt */
public final class C12111b {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ Exception -> 0x002c }] */
    @androidx.annotation.RequiresApi(17)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final android.content.Context m82573a(android.content.Context r2) {
        /*
            dev.skomlach.common.misc.d r0 = dev.skomlach.common.misc.C12120d.f58384a     // Catch:{ Exception -> 0x000f }
            boolean r0 = r0.mo68315b()     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x000f
            android.view.Display r0 = r2.getDisplay()     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x000f
            return r2
        L_0x000f:
            androidx.core.hardware.display.DisplayManagerCompat r0 = androidx.core.hardware.display.DisplayManagerCompat.getInstance(r2)     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = "getInstance(context)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)     // Catch:{ Exception -> 0x002c }
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x002c
            android.content.Context r0 = r2.createDisplayContext(r0)     // Catch:{ Exception -> 0x002c }
            if (r0 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            java.lang.String r1 = "ctx ?: context"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)     // Catch:{ Exception -> 0x002c }
            r2 = r0
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.common.contextprovider.C12111b.m82573a(android.content.Context):android.content.Context");
    }

    /* renamed from: b */
    public static final Context m82574b(Context context) {
        C13706o.m87929f(context, "<this>");
        return m82575c(m82573a(context));
    }

    /* renamed from: c */
    private static final Context m82575c(Context context) {
        if (C12120d.f58384a.mo68315b()) {
            try {
                Context createWindowContext = context.createWindowContext(2038, (Bundle) null);
                C13706o.m87928e(createWindowContext, "context.createWindowCont…       null\n            )");
                return createWindowContext;
            } catch (Exception unused) {
            }
        }
        return context;
    }
}
