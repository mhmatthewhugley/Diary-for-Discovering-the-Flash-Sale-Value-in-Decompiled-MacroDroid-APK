package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacd implements OnCompleteListener {

    /* renamed from: a */
    private final GoogleApiManager f3400a;

    /* renamed from: c */
    private final int f3401c;

    /* renamed from: d */
    private final ApiKey f3402d;

    /* renamed from: f */
    private final long f3403f;

    /* renamed from: g */
    private final long f3404g;

    @VisibleForTesting
    zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, @Nullable String str, @Nullable String str2) {
        this.f3400a = googleApiManager;
        this.f3401c = i;
        this.f3402d = apiKey;
        this.f3403f = j;
        this.f3404g = j2;
    }

    @Nullable
    /* renamed from: b */
    static zacd m4161b(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        if (!googleApiManager.mo21351g()) {
            return null;
        }
        RootTelemetryConfiguration a = RootTelemetryConfigManager.m4496b().mo21722a();
        if (a == null) {
            z = true;
        } else if (!a.mo21727n2()) {
            return null;
        } else {
            z = a.mo21728o2();
            zabq x = googleApiManager.mo21355x(apiKey);
            if (x != null) {
                if (!(x.mo21485s() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) x.mo21485s();
                if (baseGmsClient.mo21630O() && !baseGmsClient.mo21644f()) {
                    ConnectionTelemetryConfiguration c = m4162c(x, baseGmsClient, i);
                    if (c == null) {
                        return null;
                    }
                    x.mo21472E();
                    z = c.mo21689p2();
                }
            }
        }
        return new zacd(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    @Nullable
    /* renamed from: c */
    private static ConnectionTelemetryConfiguration m4162c(zabq zabq, BaseGmsClient baseGmsClient, int i) {
        int[] m2;
        int[] n2;
        ConnectionTelemetryConfiguration M = baseGmsClient.mo21628M();
        if (M == null || !M.mo21688o2() || ((m2 = M.mo21686m2()) != null ? !ArrayUtils.m4842b(m2, i) : !((n2 = M.mo21687n2()) == null || !ArrayUtils.m4842b(n2, i))) || zabq.mo21483p() >= M.mo21685l2()) {
            return null;
        }
        return M;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo21120a(@NonNull Task task) {
        zabq x;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7;
        if (this.f3400a.mo21351g()) {
            RootTelemetryConfiguration a = RootTelemetryConfigManager.m4496b().mo21722a();
            if ((a == null || a.mo21727n2()) && (x = this.f3400a.mo21355x(this.f3402d)) != null && (x.mo21485s() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) x.mo21485s();
                boolean z = true;
                boolean z2 = this.f3403f > 0;
                int E = baseGmsClient.mo21622E();
                if (a != null) {
                    boolean o2 = z2 & a.mo21728o2();
                    int l2 = a.mo21725l2();
                    int m2 = a.mo21726m2();
                    i3 = a.getVersion();
                    if (baseGmsClient.mo21630O() && !baseGmsClient.mo21644f()) {
                        ConnectionTelemetryConfiguration c = m4162c(x, baseGmsClient, this.f3401c);
                        if (c != null) {
                            if (!c.mo21689p2() || this.f3403f <= 0) {
                                z = false;
                            }
                            m2 = c.mo21685l2();
                            o2 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = l2;
                    i = m2;
                } else {
                    i3 = 0;
                    i2 = SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY;
                    i = 100;
                }
                GoogleApiManager googleApiManager = this.f3400a;
                if (task.mo23719t()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (task.mo23717r()) {
                        i5 = 100;
                    } else {
                        Exception o = task.mo23714o();
                        if (o instanceof ApiException) {
                            Status a2 = ((ApiException) o).mo21209a();
                            int n2 = a2.mo21294n2();
                            ConnectionResult l22 = a2.mo21292l2();
                            if (l22 == null) {
                                i7 = -1;
                            } else {
                                i7 = l22.mo21133l2();
                            }
                            i4 = i7;
                            i5 = n2;
                        } else {
                            i5 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f3403f;
                    j = System.currentTimeMillis();
                    j2 = j3;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.f3404g);
                } else {
                    j2 = 0;
                    j = 0;
                    i6 = -1;
                }
                googleApiManager.mo21345J(new MethodInvocation(this.f3401c, i5, i4, j2, j, (String) null, (String) null, E, i6), i3, (long) i2, i);
            }
        }
    }
}
