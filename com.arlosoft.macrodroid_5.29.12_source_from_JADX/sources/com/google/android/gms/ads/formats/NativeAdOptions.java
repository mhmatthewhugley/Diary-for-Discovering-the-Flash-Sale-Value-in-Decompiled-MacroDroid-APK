package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class NativeAdOptions {

    /* renamed from: a */
    private final boolean f1747a;

    /* renamed from: b */
    private final int f1748b;

    /* renamed from: c */
    private final int f1749c;

    /* renamed from: d */
    private final boolean f1750d;

    /* renamed from: e */
    private final int f1751e;

    /* renamed from: f */
    private final VideoOptions f1752f;

    /* renamed from: g */
    private final boolean f1753g;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f1754a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f1755b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f1756c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f1757d = false;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public VideoOptions f1758e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f1759f = 1;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f1760g = false;

        @NonNull
        /* renamed from: a */
        public NativeAdOptions mo19798a() {
            return new NativeAdOptions(this, (zzd) null);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo19799b(@AdChoicesPlacement int i) {
            this.f1759f = i;
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: c */
        public Builder mo19800c(int i) {
            this.f1755b = i;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder mo19801d(@NativeMediaAspectRatio int i) {
            this.f1756c = i;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo19802e(boolean z) {
            this.f1760g = z;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public Builder mo19803f(boolean z) {
            this.f1757d = z;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public Builder mo19804g(boolean z) {
            this.f1754a = z;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public Builder mo19805h(@NonNull VideoOptions videoOptions) {
            this.f1758e = videoOptions;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zzd zzd) {
        this.f1747a = builder.f1754a;
        this.f1748b = builder.f1755b;
        this.f1749c = builder.f1756c;
        this.f1750d = builder.f1757d;
        this.f1751e = builder.f1759f;
        this.f1752f = builder.f1758e;
        this.f1753g = builder.f1760g;
    }

    /* renamed from: a */
    public int mo19791a() {
        return this.f1751e;
    }

    @Deprecated
    /* renamed from: b */
    public int mo19792b() {
        return this.f1748b;
    }

    /* renamed from: c */
    public int mo19793c() {
        return this.f1749c;
    }

    @Nullable
    /* renamed from: d */
    public VideoOptions mo19794d() {
        return this.f1752f;
    }

    /* renamed from: e */
    public boolean mo19795e() {
        return this.f1750d;
    }

    /* renamed from: f */
    public boolean mo19796f() {
        return this.f1747a;
    }

    /* renamed from: g */
    public final boolean mo19797g() {
        return this.f1753g;
    }
}
