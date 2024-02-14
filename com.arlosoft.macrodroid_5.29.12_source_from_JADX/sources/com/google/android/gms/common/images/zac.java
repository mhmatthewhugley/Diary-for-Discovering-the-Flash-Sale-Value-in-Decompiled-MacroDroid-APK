package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zac implements Runnable {

    /* renamed from: a */
    private final Uri f3561a;
    @Nullable

    /* renamed from: c */
    private final Bitmap f3562c;

    /* renamed from: d */
    private final CountDownLatch f3563d;

    /* renamed from: f */
    final /* synthetic */ ImageManager f3564f;

    public zac(ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f3564f = imageManager;
        this.f3561a = uri;
        this.f3562c = bitmap;
        this.f3563d = countDownLatch;
    }

    public final void run() {
        Asserts.m4341a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f3562c;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f3564f.f3545f.remove(this.f3561a);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f3548c;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                zag zag = (zag) a.get(i);
                Bitmap bitmap2 = this.f3562c;
                if (bitmap2 == null || bitmap == null) {
                    this.f3564f.f3546g.put(this.f3561a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f3564f;
                    zag.mo21612b(imageManager.f3540a, imageManager.f3543d, false);
                } else {
                    zag.mo21613c(this.f3564f.f3540a, bitmap2, false);
                }
                if (!(zag instanceof zaf)) {
                    this.f3564f.f3544e.remove(zag);
                }
            }
        }
        this.f3563d.countDown();
        synchronized (ImageManager.f3538h) {
            ImageManager.f3539i.remove(this.f3561a);
        }
    }
}
