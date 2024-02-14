package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class NativeAdOptions {

    /* renamed from: a */
    private final boolean f2443a;

    /* renamed from: b */
    private final int f2444b;

    /* renamed from: c */
    private final boolean f2445c;

    /* renamed from: d */
    private final int f2446d;

    /* renamed from: e */
    private final VideoOptions f2447e;

    /* renamed from: f */
    private final boolean f2448f;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f2449a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f2450b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f2451c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public VideoOptions f2452d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f2453e = 1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f2454f = false;

        @NonNull
        /* renamed from: a */
        public NativeAdOptions mo20601a() {
            return new NativeAdOptions(this, (zza) null);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo20602b(@AdChoicesPlacement int i) {
            this.f2453e = i;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo20603c(@NativeMediaAspectRatio int i) {
            this.f2450b = i;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder mo20604d(boolean z) {
            this.f2454f = z;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo20605e(boolean z) {
            this.f2451c = z;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public Builder mo20606f(boolean z) {
            this.f2449a = z;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public Builder mo20607g(@NonNull VideoOptions videoOptions) {
            this.f2452d = videoOptions;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zza zza) {
        this.f2443a = builder.f2449a;
        this.f2444b = builder.f2450b;
        this.f2445c = builder.f2451c;
        this.f2446d = builder.f2453e;
        this.f2447e = builder.f2452d;
        this.f2448f = builder.f2454f;
    }

    /* renamed from: a */
    public int mo20595a() {
        return this.f2446d;
    }

    /* renamed from: b */
    public int mo20596b() {
        return this.f2444b;
    }

    @Nullable
    /* renamed from: c */
    public VideoOptions mo20597c() {
        return this.f2447e;
    }

    /* renamed from: d */
    public boolean mo20598d() {
        return this.f2445c;
    }

    /* renamed from: e */
    public boolean mo20599e() {
        return this.f2443a;
    }

    /* renamed from: f */
    public final boolean mo20600f() {
        return this.f2448f;
    }
}
