package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitInstallRequest f51950a;

    /* renamed from: c */
    final /* synthetic */ zzaa f51951c;

    public final void run() {
        zzx a = this.f51951c.f51875b;
        List<String> b = this.f51950a.mo59962b();
        List b2 = zzaa.m71177c(this.f51950a.mo59961a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt(NotificationCompat.CATEGORY_STATUS, 5);
        bundle.putInt("error_code", 0);
        if (!b.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(b));
        }
        if (!b2.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(b2));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        a.mo60012i(SplitInstallSessionState.m71111n(bundle));
    }
}
