package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyq implements NativeCustomFormatAd {

    /* renamed from: a */
    private final zzbmy f28012a;
    @Nullable

    /* renamed from: b */
    private final MediaView f28013b;

    /* renamed from: c */
    private final VideoController f28014c = new VideoController();

    @VisibleForTesting
    public zzbyq(zzbmy zzbmy) {
        Context context;
        this.f28012a = zzbmy;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.m5050A1(zzbmy.mo42801e());
        } catch (RemoteException | NullPointerException e) {
            zzcgp.m45227e("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.f28012a.mo42800c0(ObjectWrapper.m5051g8(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzcgp.m45227e("", e2);
            }
        }
        this.f28013b = mediaView;
    }
}
