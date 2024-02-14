package com.google.android.play.core.install;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class InstallState {
    /* renamed from: f */
    public static InstallState m70774f(@NonNull Intent intent, @NonNull zzag zzag) {
        Intent intent2 = intent;
        zzag zzag2 = zzag;
        zzag2.mo59805a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzag2.mo59805a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        zzag2.mo59805a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        return new zza(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
    }

    /* renamed from: a */
    public abstract long mo59792a();

    @InstallErrorCode
    /* renamed from: b */
    public abstract int mo59793b();

    @InstallStatus
    /* renamed from: c */
    public abstract int mo59794c();

    /* renamed from: d */
    public abstract String mo59795d();

    /* renamed from: e */
    public abstract long mo59796e();
}
