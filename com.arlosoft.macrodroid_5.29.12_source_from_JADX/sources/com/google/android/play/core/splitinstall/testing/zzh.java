package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzh implements zzp {

    /* renamed from: a */
    public final /* synthetic */ SplitInstallRequest f51827a;

    /* renamed from: a */
    public final SplitInstallSessionState mo59990a(SplitInstallSessionState splitInstallSessionState) {
        int i;
        SplitInstallRequest splitInstallRequest = this.f51827a;
        int i2 = FakeSplitInstallManager.f51799q;
        if (splitInstallSessionState == null || splitInstallSessionState.mo59966d()) {
            if (splitInstallSessionState == null) {
                i = 1;
            } else {
                i = 1 + splitInstallSessionState.mo59970h();
            }
            return SplitInstallSessionState.m71110b(i, 1, 0, 0, 0, splitInstallRequest.mo59962b(), new ArrayList());
        }
        throw new SplitInstallException(-1);
    }
}
