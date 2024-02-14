package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzcs;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzaf implements zzcs {

    /* renamed from: a */
    private final zzcs f51886a;

    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context a = ((zzad) this.f51886a).mo60006a();
        try {
            Bundle bundle = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128).metaData;
            if (!(bundle == null || (string = bundle.getString("local_testing_dir")) == null)) {
                return new File(a.getExternalFilesDir((String) null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
