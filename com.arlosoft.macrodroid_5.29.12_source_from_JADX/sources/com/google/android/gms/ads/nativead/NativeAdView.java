package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f2455a;
    @Nullable

    /* renamed from: c */
    private final zzbmi f2456c = m2983e();

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2455a = m2982d(context);
    }

    /* renamed from: d */
    private final FrameLayout m2982d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Nullable
    /* renamed from: e */
    private final zzbmi m2983e() {
        if (isInEditMode()) {
            return null;
        }
        return zzaw.m1916a().mo19878g(this.f2455a.getContext(), this, this.f2455a);
    }

    /* renamed from: f */
    private final void m2984f(String str, @Nullable View view) {
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null) {
            try {
                zzbmi.mo20105Xa(str, ObjectWrapper.m5051g8(view));
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call setAssetView on delegate", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final View mo20608a(@NonNull String str) {
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null) {
            try {
                IObjectWrapper t = zzbmi.mo20110t(str);
                if (t != null) {
                    return (View) ObjectWrapper.m5050A1(t);
                }
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f2455a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo20610b(MediaContent mediaContent) {
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null) {
            try {
                if (mediaContent instanceof zzej) {
                    zzbmi.mo20103E9(((zzej) mediaContent).mo20095a());
                } else if (mediaContent == null) {
                    zzbmi.mo20103E9((zzbmb) null);
                } else {
                    zzcgp.m45224b("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call setMediaContent on delegate", e);
            }
        }
    }

    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f2455a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo20612c(ImageView.ScaleType scaleType) {
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null && scaleType != null) {
            try {
                zzbmi.mo20109o9(ObjectWrapper.m5051g8(scaleType));
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        zzbmi zzbmi;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26869G2)).booleanValue() && (zzbmi = this.f2456c) != null) {
            try {
                zzbmi.mo20108d0(ObjectWrapper.m5051g8(motionEvent));
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View a = mo20608a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return mo20608a("3005");
    }

    @Nullable
    public final View getBodyView() {
        return mo20608a("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return mo20608a("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return mo20608a("3001");
    }

    @Nullable
    public final View getIconView() {
        return mo20608a("3003");
    }

    @Nullable
    public final View getImageView() {
        return mo20608a("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View a = mo20608a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a == null) {
            return null;
        }
        zzcgp.m45224b("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return mo20608a("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return mo20608a("3009");
    }

    @Nullable
    public final View getStoreView() {
        return mo20608a("3006");
    }

    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null) {
            try {
                zzbmi.mo20104V2(ObjectWrapper.m5051g8(view), i);
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f2455a);
    }

    public final void removeView(@NonNull View view) {
        if (this.f2455a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        m2984f("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        m2984f("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        m2984f("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        m2984f("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null) {
            try {
                zzbmi.mo20107a5(ObjectWrapper.m5051g8(view));
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        m2984f("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        m2984f("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        m2984f("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        m2984f("3010", mediaView);
        if (mediaView != null) {
            mediaView.mo20585a(new zzb(this));
            mediaView.mo20586b(new zzc(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(@NonNull NativeAd nativeAd) {
        zzbmi zzbmi = this.f2456c;
        if (zzbmi != null) {
            try {
                zzbmi.mo20111y5(nativeAd.mo20591b());
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(@Nullable View view) {
        m2984f("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        m2984f("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        m2984f("3006", view);
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2455a = m2982d(context);
    }
}
