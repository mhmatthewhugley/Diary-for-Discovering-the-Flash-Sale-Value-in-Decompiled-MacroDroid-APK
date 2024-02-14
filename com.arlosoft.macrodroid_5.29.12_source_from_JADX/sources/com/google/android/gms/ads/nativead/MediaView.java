package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MediaView extends FrameLayout {
    @Nullable

    /* renamed from: a */
    private MediaContent f2437a;

    /* renamed from: c */
    private boolean f2438c;

    /* renamed from: d */
    private ImageView.ScaleType f2439d;

    /* renamed from: f */
    private boolean f2440f;

    /* renamed from: g */
    private zzb f2441g;

    /* renamed from: o */
    private zzc f2442o;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo20585a(zzb zzb) {
        this.f2441g = zzb;
        if (this.f2438c) {
            zzb.f2458a.mo20610b(this.f2437a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo20586b(zzc zzc) {
        this.f2442o = zzc;
        if (this.f2440f) {
            zzc.f2459a.mo20612c(this.f2439d);
        }
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.f2437a;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f2440f = true;
        this.f2439d = scaleType;
        zzc zzc = this.f2442o;
        if (zzc != null) {
            zzc.f2459a.mo20612c(scaleType);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        this.f2438c = true;
        this.f2437a = mediaContent;
        zzb zzb = this.f2441g;
        if (zzb != null) {
            zzb.f2458a.mo20610b(mediaContent);
        }
        if (mediaContent != null) {
            try {
                zzbmy zza = mediaContent.zza();
                if (zza != null && !zza.mo42800c0(ObjectWrapper.m5051g8(this))) {
                    removeAllViews();
                }
            } catch (RemoteException e) {
                removeAllViews();
                zzcgp.m45227e("", e);
            }
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
