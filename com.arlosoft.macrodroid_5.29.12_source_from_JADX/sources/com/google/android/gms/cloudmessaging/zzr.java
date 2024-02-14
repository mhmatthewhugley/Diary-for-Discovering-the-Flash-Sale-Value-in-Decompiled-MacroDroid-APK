package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzr extends zzp<Bundle> {
    zzr(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21110a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo21113d(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo21111b() {
        return false;
    }
}
