package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbmz implements NativeCustomTemplateAd {

    /* renamed from: a */
    private final zzbmy f27566a;

    /* renamed from: b */
    private final MediaView f27567b;

    /* renamed from: c */
    private final VideoController f27568c = new VideoController();

    @VisibleForTesting
    public zzbmz(zzbmy zzbmy) {
        Context context;
        this.f27566a = zzbmy;
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
                if (true == this.f27566a.mo42800c0(ObjectWrapper.m5051g8(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzcgp.m45227e("", e2);
            }
        }
        this.f27567b = mediaView;
    }

    @Nullable
    /* renamed from: a */
    public final String mo19806a() {
        try {
            return this.f27566a.mo42802g();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final zzbmy mo42815b() {
        return this.f27566a;
    }
}
