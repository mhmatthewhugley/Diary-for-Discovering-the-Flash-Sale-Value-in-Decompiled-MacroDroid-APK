package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public class DownloadConditions {

    /* renamed from: a */
    private final boolean f56265a;

    /* renamed from: b */
    private final boolean f56266b;

    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static class Builder {

        /* renamed from: a */
        private boolean f56267a = false;

        /* renamed from: b */
        private boolean f56268b = false;

        @NonNull
        /* renamed from: a */
        public DownloadConditions mo64524a() {
            return new DownloadConditions(this.f56267a, this.f56268b, (zzb) null);
        }
    }

    /* synthetic */ DownloadConditions(boolean z, boolean z2, zzb zzb) {
        this.f56265a = z;
        this.f56266b = z2;
    }

    /* renamed from: a */
    public boolean mo64520a() {
        return this.f56265a;
    }

    /* renamed from: b */
    public boolean mo64521b() {
        return this.f56266b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        return this.f56265a == downloadConditions.f56265a && this.f56266b == downloadConditions.f56266b;
    }

    public int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f56265a), Boolean.valueOf(this.f56266b));
    }
}
