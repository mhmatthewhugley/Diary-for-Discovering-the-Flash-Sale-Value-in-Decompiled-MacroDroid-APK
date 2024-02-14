package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class ModelInfo {

    /* renamed from: a */
    private final String f56304a;

    /* renamed from: b */
    private final Uri f56305b;

    /* renamed from: c */
    private final String f56306c;

    /* renamed from: d */
    private final ModelType f56307d;

    @KeepForSdk
    public ModelInfo(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull ModelType modelType) {
        this.f56304a = str;
        this.f56305b = uri;
        this.f56306c = str2;
        this.f56307d = modelType;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public String mo64555a() {
        return this.f56306c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public String mo64556b() {
        return this.f56304a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public ModelType mo64557c() {
        return this.f56307d;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public Uri mo64558d() {
        return this.f56305b;
    }
}
