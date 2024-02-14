package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import java.io.FileNotFoundException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzat extends zzcu {

    /* renamed from: a */
    final /* synthetic */ DiagnosisKeyFileProvider f44557a;

    zzat(zzax zzax, DiagnosisKeyFileProvider diagnosisKeyFileProvider) {
        this.f44557a = diagnosisKeyFileProvider;
    }

    /* renamed from: a */
    public final boolean mo52530a() {
        return this.f44557a.mo55768b();
    }

    @Nullable
    public final ParcelFileDescriptor zzb() {
        try {
            return ParcelFileDescriptor.open(this.f44557a.mo55767a(), 268435456);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
