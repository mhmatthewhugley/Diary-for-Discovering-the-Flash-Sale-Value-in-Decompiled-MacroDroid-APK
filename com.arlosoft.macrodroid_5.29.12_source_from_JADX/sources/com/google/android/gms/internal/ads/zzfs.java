package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfs extends zzfq {
    public final int zzd;
    @Nullable
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfs(int i, @Nullable String str, @Nullable IOException iOException, Map map, zzfc zzfc, byte[] bArr) {
        super("Response code: " + i, iOException, zzfc, SamsungIrisUnlockModule.IRIS_REQUEST_FACTORY_TEST_CAMERA_VERSION, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
