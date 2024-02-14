package com.google.android.gms.location;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzg;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityRecognition {
    @NonNull

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f45781a;
    @NonNull
    @Deprecated

    /* renamed from: b */
    public static final ActivityRecognitionApi f45782b = new zzg();

    /* renamed from: c */
    private static final Api.ClientKey<zzaz> f45783c;

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f45784d;

    static {
        Api.ClientKey<zzaz> clientKey = new Api.ClientKey<>();
        f45783c = clientKey;
        zza zza = new zza();
        f45784d = zza;
        f45781a = new Api<>("ActivityRecognition.API", zza, clientKey);
    }

    private ActivityRecognition() {
    }

    @NonNull
    /* renamed from: a */
    public static ActivityRecognitionClient m64622a(@NonNull Context context) {
        return new ActivityRecognitionClient(context);
    }
}
