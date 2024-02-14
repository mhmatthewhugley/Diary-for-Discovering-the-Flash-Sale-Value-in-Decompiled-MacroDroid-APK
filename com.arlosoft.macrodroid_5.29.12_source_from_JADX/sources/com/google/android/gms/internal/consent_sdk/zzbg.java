package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.UiThread;

@UiThread
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzbg extends WebView {

    /* renamed from: a */
    private final Handler f39348a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzbm f39349c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f39350d;

    /* renamed from: c */
    static /* synthetic */ boolean m55950c(zzbg zzbg, String str) {
        return str != null && str.startsWith("consent://");
    }

    /* renamed from: b */
    public final void mo48702b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        this.f39348a.post(new zzbd(this, sb.toString()));
    }
}
