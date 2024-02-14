package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.zza;
import com.google.android.play.core.tasks.zzj;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class InstallException extends zzj {
    @InstallErrorCode
    private final int zza;

    public InstallException(@InstallErrorCode int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), zza.m70781a(i)}));
        if (i != 0) {
            this.zza = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @InstallErrorCode
    /* renamed from: a */
    public int mo59570a() {
        return this.zza;
    }
}
