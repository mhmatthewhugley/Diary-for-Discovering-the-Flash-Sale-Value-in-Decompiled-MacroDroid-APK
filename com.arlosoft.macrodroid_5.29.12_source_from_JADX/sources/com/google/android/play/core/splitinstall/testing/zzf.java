package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzf implements zzp {

    /* renamed from: a */
    public final /* synthetic */ int f51825a;

    /* renamed from: a */
    public final SplitInstallSessionState mo59990a(SplitInstallSessionState splitInstallSessionState) {
        int i;
        int i2 = this.f51825a;
        int i3 = FakeSplitInstallManager.f51799q;
        if (splitInstallSessionState != null && i2 == splitInstallSessionState.mo59970h() && ((i = splitInstallSessionState.mo59971i()) == 1 || i == 2 || i == 8 || i == 9 || i == 7)) {
            return SplitInstallSessionState.m71110b(i2, 7, splitInstallSessionState.mo59965c(), splitInstallSessionState.mo59964a(), splitInstallSessionState.mo59972j(), splitInstallSessionState.mo59968f(), splitInstallSessionState.mo59967e());
        }
        throw new SplitInstallException(-3);
    }
}
