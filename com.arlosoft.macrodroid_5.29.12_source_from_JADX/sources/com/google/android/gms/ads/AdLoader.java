package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class AdLoader {

    /* renamed from: a */
    private final zzp f1668a;

    /* renamed from: b */
    private final Context f1669b;

    /* renamed from: c */
    private final zzbl f1670c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static class Builder {

        /* renamed from: a */
        private final Context f1671a;

        /* renamed from: b */
        private final zzbo f1672b;

        public Builder(@NonNull Context context, @NonNull String str) {
            zzbo c = zzaw.m1916a().mo19875c(context, str, new zzbvh());
            this.f1671a = (Context) Preconditions.m4489l(context, "context cannot be null");
            this.f1672b = c;
        }

        @NonNull
        /* renamed from: a */
        public AdLoader mo19661a() {
            try {
                return new AdLoader(this.f1671a, this.f1672b.mo19908b(), zzp.f2018a);
            } catch (RemoteException e) {
                zzcgp.m45227e("Failed to build AdLoader.", e);
                return new AdLoader(this.f1671a, new zzeo().mo20099Kb(), zzp.f2018a);
            }
        }

        @NonNull
        @Deprecated
        /* renamed from: b */
        public Builder mo19662b(@NonNull String str, @NonNull NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @Nullable NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzboj zzboj = new zzboj(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.f1672b.mo19912ma(str, zzboj.mo42865e(), zzboj.mo42864d());
            } catch (RemoteException e) {
                zzcgp.m45230h("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo19663c(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f1672b.mo19910m2(new zzbyr(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcgp.m45230h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: d */
        public Builder mo19664d(@NonNull UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.f1672b.mo19910m2(new zzbom(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcgp.m45230h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo19665e(@NonNull AdListener adListener) {
            try {
                this.f1672b.mo19911m7(new zzg(adListener));
            } catch (RemoteException e) {
                zzcgp.m45230h("Failed to set AdListener.", e);
            }
            return this;
        }

        @NonNull
        @Deprecated
        /* renamed from: f */
        public Builder mo19666f(@NonNull NativeAdOptions nativeAdOptions) {
            try {
                this.f1672b.mo19909i7(new zzbls(nativeAdOptions));
            } catch (RemoteException e) {
                zzcgp.m45230h("Failed to specify native ad options", e);
            }
            return this;
        }

        @NonNull
        /* renamed from: g */
        public Builder mo19667g(@NonNull com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.f1672b.mo19909i7(new zzbls(4, nativeAdOptions.mo20599e(), -1, nativeAdOptions.mo20598d(), nativeAdOptions.mo20595a(), nativeAdOptions.mo20597c() != null ? new zzff(nativeAdOptions.mo20597c()) : null, nativeAdOptions.mo20600f(), nativeAdOptions.mo20596b()));
            } catch (RemoteException e) {
                zzcgp.m45230h("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    AdLoader(Context context, zzbl zzbl, zzp zzp) {
        this.f1669b = context;
        this.f1670c = zzbl;
        this.f1668a = zzp;
    }

    /* renamed from: c */
    private final void m1679c(zzdr zzdr) {
        zzbjc.m43542c(this.f1669b);
        if (((Boolean) zzbkq.f27442c.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                zzcge.f28418b.execute(new zza(this, zzdr));
                return;
            }
        }
        try {
            this.f1670c.mo19903Q8(this.f1668a.mo20160a(this.f1669b, zzdr));
        } catch (RemoteException e) {
            zzcgp.m45227e("Failed to load ad.", e);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void mo19659a(@NonNull AdRequest adRequest) {
        m1679c(adRequest.mo19668a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo19660b(zzdr zzdr) {
        try {
            this.f1670c.mo19903Q8(this.f1668a.mo20160a(this.f1669b, zzdr));
        } catch (RemoteException e) {
            zzcgp.m45227e("Failed to load ad.", e);
        }
    }
}
