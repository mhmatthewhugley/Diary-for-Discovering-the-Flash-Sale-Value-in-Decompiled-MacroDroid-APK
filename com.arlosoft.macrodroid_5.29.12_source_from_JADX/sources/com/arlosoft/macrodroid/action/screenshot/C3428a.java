package com.arlosoft.macrodroid.action.screenshot;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.action.screenshot.a */
/* compiled from: Capture.kt */
public final class C3428a implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    private final Context f9103a;

    /* renamed from: b */
    private VirtualDisplay f9104b;

    /* renamed from: c */
    private C16265l<? super Bitmap, C13339u> f9105c;

    public C3428a(Context context) {
        C13706o.m87929f(context, "context");
        this.f9103a = context;
    }

    /* renamed from: a */
    private final Bitmap m14314a(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        DisplayMetrics displayMetrics = this.f9103a.getResources().getDisplayMetrics();
        Image.Plane plane = acquireLatestImage.getPlanes()[0];
        Bitmap createBitmap = Bitmap.createBitmap(plane.getRowStride() / plane.getPixelStride(), displayMetrics.heightPixels, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(plane.getBuffer());
        acquireLatestImage.close();
        C13706o.m87928e(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: b */
    private final VirtualDisplay m14315b(MediaProjection mediaProjection) {
        DisplayMetrics displayMetrics = this.f9103a.getResources().getDisplayMetrics();
        ImageReader newInstance = ImageReader.newInstance(displayMetrics.widthPixels, displayMetrics.heightPixels, 1, 2);
        C13706o.m87928e(newInstance, "newInstance(\n           …mat.RGBA_8888, maxImages)");
        newInstance.setOnImageAvailableListener(this, (Handler) null);
        VirtualDisplay createVirtualDisplay = mediaProjection.createVirtualDisplay("Capture Display", displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi, 16, newInstance.getSurface(), (VirtualDisplay.Callback) null, (Handler) null);
        C13706o.m87928e(createVirtualDisplay, "mediaProjection.createVi…ader.surface, null, null)");
        return createVirtualDisplay;
    }

    /* renamed from: c */
    public final void mo26776c(MediaProjection mediaProjection, C16265l<? super Bitmap, C13339u> lVar) {
        C13706o.m87929f(mediaProjection, "mediaProjection");
        C13706o.m87929f(lVar, "onCaptureListener");
        this.f9105c = lVar;
        if (this.f9104b == null) {
            this.f9104b = m14315b(mediaProjection);
        }
    }

    /* renamed from: d */
    public final void mo26777d() {
        VirtualDisplay virtualDisplay = this.f9104b;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.f9104b = null;
        this.f9105c = null;
    }

    public void onImageAvailable(ImageReader imageReader) {
        C16265l<? super Bitmap, C13339u> lVar;
        C13706o.m87929f(imageReader, "reader");
        if (this.f9104b != null && (lVar = this.f9105c) != null) {
            lVar.invoke(m14314a(imageReader));
        }
    }
}
