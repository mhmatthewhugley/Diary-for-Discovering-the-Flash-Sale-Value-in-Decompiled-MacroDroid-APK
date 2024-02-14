package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdqz {

    /* renamed from: a */
    private final zzbo f32843a;

    /* renamed from: b */
    private final Clock f32844b;

    /* renamed from: c */
    private final Executor f32845c;

    public zzdqz(zzbo zzbo, Clock clock, Executor executor) {
        this.f32843a = zzbo;
        this.f32844b = clock;
        this.f32845c = executor;
    }

    /* renamed from: c */
    private final Bitmap m47957c(byte[] bArr, BitmapFactory.Options options) {
        long c = this.f32844b.mo21952c();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long c2 = this.f32844b.mo21952c();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = c2 - c;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            zze.m2645k("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo44928a(double d, boolean z, zzajz zzajz) {
        byte[] bArr = zzajz.f24867b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27157j5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m47957c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzay.m1924c().mo42663b(zzbjc.f27167k5)).intValue())) / 2);
            }
        }
        return m47957c(bArr, options);
    }

    /* renamed from: b */
    public final zzfzp mo44929b(String str, double d, boolean z) {
        return zzfzg.m51418m(this.f32843a.mo20331a(str), new zzdqy(this, d, z), this.f32845c);
    }
}
