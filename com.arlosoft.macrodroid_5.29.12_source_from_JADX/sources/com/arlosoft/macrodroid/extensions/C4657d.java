package com.arlosoft.macrodroid.extensions;

import android.content.res.Resources;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;

/* renamed from: com.arlosoft.macrodroid.extensions.d */
/* compiled from: IntExtensions.kt */
public final class C4657d {
    /* renamed from: a */
    public static final int m18116a(int i) {
        return i * TaskerPlugin.Setting.REQUESTED_TIMEOUT_MS_NEVER;
    }

    /* renamed from: b */
    public static final int m18117b(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }
}
