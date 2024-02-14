package com.google.android.gms.ads;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Date;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class AdRequest {

    /* renamed from: a */
    protected final zzdr f1673a;

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static class Builder {

        /* renamed from: a */
        protected final zzdq f1674a;

        public Builder() {
            zzdq zzdq = new zzdq();
            this.f1674a = zzdq;
            zzdq.mo20025x(com.google.ads.AdRequest.TEST_EMULATOR);
        }

        @NonNull
        /* renamed from: a */
        public Builder mo19669a(@NonNull String str) {
            this.f1674a.mo20023v(str);
            return this;
        }

        @NonNull
        /* renamed from: b */
        public Builder mo19670b(@NonNull Class<? extends MediationExtrasReceiver> cls, @NonNull Bundle bundle) {
            this.f1674a.mo20024w(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f1674a.mo20026y(com.google.ads.AdRequest.TEST_EMULATOR);
            }
            return this;
        }

        @NonNull
        /* renamed from: c */
        public AdRequest mo19671c() {
            return new AdRequest(this);
        }

        @NonNull
        @Deprecated
        /* renamed from: d */
        public final Builder mo19672d(@NonNull String str) {
            this.f1674a.mo20025x(str);
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: e */
        public final Builder mo19673e(@NonNull Date date) {
            this.f1674a.mo20019a(date);
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: f */
        public final Builder mo19674f(int i) {
            this.f1674a.mo20020b(i);
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: g */
        public final Builder mo19675g(boolean z) {
            this.f1674a.mo20021c(z);
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: h */
        public final Builder mo19676h(boolean z) {
            this.f1674a.mo20022d(z);
            return this;
        }
    }

    protected AdRequest(@NonNull Builder builder) {
        this.f1673a = new zzdr(builder.f1674a, (SearchAdRequest) null);
    }

    /* renamed from: a */
    public zzdr mo19668a() {
        return this.f1673a;
    }
}
