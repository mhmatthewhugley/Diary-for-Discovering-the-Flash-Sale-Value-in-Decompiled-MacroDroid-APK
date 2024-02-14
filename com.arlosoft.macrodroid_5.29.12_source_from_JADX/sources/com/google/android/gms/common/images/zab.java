package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zab implements Runnable {

    /* renamed from: a */
    private final zag f3559a;

    /* renamed from: c */
    final /* synthetic */ ImageManager f3560c;

    public final void run() {
        Asserts.m4341a("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f3560c.f3544e.get(this.f3559a);
        if (imageReceiver != null) {
            this.f3560c.f3544e.remove(this.f3559a);
            imageReceiver.mo21588c(this.f3559a);
        }
        zag zag = this.f3559a;
        zad zad = zag.f3568a;
        Uri uri = zad.f3565a;
        if (uri != null) {
            Long l = (Long) this.f3560c.f3546g.get(uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    zag zag2 = this.f3559a;
                    ImageManager imageManager = this.f3560c;
                    zag2.mo21612b(imageManager.f3540a, imageManager.f3543d, true);
                    return;
                }
                this.f3560c.f3546g.remove(zad.f3565a);
            }
            this.f3559a.mo21607a((Drawable) null, false, true, false);
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) this.f3560c.f3545f.get(zad.f3565a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageManager.ImageReceiver(zad.f3565a);
                this.f3560c.f3545f.put(zad.f3565a, imageReceiver2);
            }
            imageReceiver2.mo21587b(this.f3559a);
            zag zag3 = this.f3559a;
            if (!(zag3 instanceof zaf)) {
                this.f3560c.f3544e.put(zag3, imageReceiver2);
            }
            synchronized (ImageManager.f3538h) {
                if (!ImageManager.f3539i.contains(zad.f3565a)) {
                    ImageManager.f3539i.add(zad.f3565a);
                    imageReceiver2.mo21589d();
                }
            }
            return;
        }
        ImageManager imageManager2 = this.f3560c;
        zag.mo21612b(imageManager2.f3540a, imageManager2.f3543d, true);
    }
}
