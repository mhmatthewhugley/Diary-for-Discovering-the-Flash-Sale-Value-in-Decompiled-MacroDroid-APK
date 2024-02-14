package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class BaseAdView extends ViewGroup {

    /* renamed from: a */
    protected final zzdu f1699a;

    protected BaseAdView(@NonNull Context context, int i) {
        super(context);
        this.f1699a = new zzdu(this, i);
    }

    /* renamed from: a */
    public void mo19704a() {
        zzbjc.m43542c(getContext());
        if (((Boolean) zzbkq.f27444e.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26905J8)).booleanValue()) {
                zzcge.f28418b.execute(new zze(this));
                return;
            }
        }
        this.f1699a.mo20058n();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: b */
    public void mo19705b(@NonNull AdRequest adRequest) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzbjc.m43542c(getContext());
        if (((Boolean) zzbkq.f27445f.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                zzcge.f28418b.execute(new zzc(this, adRequest));
                return;
            }
        }
        this.f1699a.mo20060p(adRequest.mo19668a());
    }

    /* renamed from: c */
    public void mo19706c() {
        zzbjc.m43542c(getContext());
        if (((Boolean) zzbkq.f27446g.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26915K8)).booleanValue()) {
                zzcge.f28418b.execute(new zzd(this));
                return;
            }
        }
        this.f1699a.mo20061q();
    }

    /* renamed from: d */
    public void mo19707d() {
        zzbjc.m43542c(getContext());
        if (((Boolean) zzbkq.f27447h.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26895I8)).booleanValue()) {
                zzcge.f28418b.execute(new zzf(this));
                return;
            }
        }
        this.f1699a.mo20062r();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.f1699a.mo20049d();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.f1699a.mo20050e();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f1699a.mo20057m();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.f1699a.mo20051f();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.f1699a.mo20052g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        AdSize adSize;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzcgp.m45227e("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int d = adSize.mo19681d(context);
                i3 = adSize.mo19679b(context);
                i4 = d;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(@NonNull AdListener adListener) {
        this.f1699a.mo20064t(adListener);
        if (adListener == null) {
            this.f1699a.mo20063s((zza) null);
            return;
        }
        if (adListener instanceof zza) {
            this.f1699a.mo20063s((zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.f1699a.mo20068x((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.f1699a.mo20065u(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f1699a.mo20067w(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.f1699a.mo20070z(onPaidEventListener);
    }

    protected BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f1699a = new zzdu(this, attributeSet, false, i);
    }

    protected BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f1699a = new zzdu(this, attributeSet, false, i2);
    }

    protected BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.f1699a = new zzdu(this, attributeSet, z, i2);
    }

    protected BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f1699a = new zzdu(this, attributeSet, z);
    }
}
