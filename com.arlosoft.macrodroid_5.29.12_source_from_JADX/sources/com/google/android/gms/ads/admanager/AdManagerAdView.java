package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context) {
        super(context, 0);
        Preconditions.m4489l(context, "Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo19764e(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.f1699a.mo20060p(adManagerAdRequest.mo19668a());
        } catch (IllegalStateException e) {
            zzcaf.m44757c(getContext()).mo43253b(e, "AdManagerAdView.loadAd");
        }
    }

    /* renamed from: f */
    public final boolean mo19765f(zzbs zzbs) {
        return this.f1699a.mo20047B(zzbs);
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.f1699a.mo20048a();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.f1699a.mo20055k();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.f1699a.mo20053i();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f1699a.mo20054j();
    }

    public void setAdSizes(@NonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f1699a.mo20066v(adSizeArr);
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener) {
        this.f1699a.mo20068x(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f1699a.mo20069y(z);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions) {
        this.f1699a.mo20046A(videoOptions);
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.m4489l(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.m4489l(context, "Context cannot be null");
    }
}
