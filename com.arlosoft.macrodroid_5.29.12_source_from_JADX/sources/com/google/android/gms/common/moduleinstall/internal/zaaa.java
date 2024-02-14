package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaaa implements ListenerHolder.Notifier {

    /* renamed from: a */
    final /* synthetic */ ModuleInstallStatusUpdate f3815a;

    zaaa(zaab zaab, ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f3815a = moduleInstallStatusUpdate;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((InstallStatusListener) obj).mo21847a(this.f3815a);
    }

    /* renamed from: b */
    public final void mo21338b() {
    }
}
