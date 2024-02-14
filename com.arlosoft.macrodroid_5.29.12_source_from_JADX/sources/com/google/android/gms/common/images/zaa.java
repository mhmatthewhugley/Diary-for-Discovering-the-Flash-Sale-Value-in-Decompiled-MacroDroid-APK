package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaa implements Runnable {

    /* renamed from: a */
    private final Uri f3556a;
    @Nullable

    /* renamed from: c */
    private final ParcelFileDescriptor f3557c;

    /* renamed from: d */
    final /* synthetic */ ImageManager f3558d;

    public zaa(ImageManager imageManager, @Nullable Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3558d = imageManager;
        this.f3556a = uri;
        this.f3557c = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        Asserts.m4342b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f3557c;
        Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f3556a)), e);
                z2 = true;
            }
            try {
                this.f3557c.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f3558d;
        imageManager.f3541b.post(new zac(imageManager, this.f3556a, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f3556a)));
        }
    }
}
