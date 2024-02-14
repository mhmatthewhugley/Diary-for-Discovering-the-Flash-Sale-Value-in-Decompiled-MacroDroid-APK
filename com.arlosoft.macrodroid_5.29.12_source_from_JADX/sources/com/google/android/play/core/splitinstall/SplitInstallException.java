package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.zza;
import com.google.android.play.core.tasks.zzj;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class SplitInstallException extends zzj {
    @SplitInstallErrorCode
    private final int zza;

    public SplitInstallException(@SplitInstallErrorCode int i) {
        super(String.format("Split Install Error(%d): %s", new Object[]{Integer.valueOf(i), zza.m71125b(i)}));
        if (i != 0) {
            this.zza = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @SplitInstallErrorCode
    /* renamed from: a */
    public int mo59570a() {
        return this.zza;
    }
}
