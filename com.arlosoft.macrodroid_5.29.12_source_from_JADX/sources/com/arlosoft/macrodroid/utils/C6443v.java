package com.arlosoft.macrodroid.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;

/* renamed from: com.arlosoft.macrodroid.utils.v */
/* compiled from: DrawableUtils */
public class C6443v {
    /* renamed from: a */
    public static Bitmap m24755a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (Build.VERSION.SDK_INT >= 26 && (drawable instanceof AdaptiveIconDrawable)) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } else if (!(drawable instanceof VectorDrawable)) {
            return null;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            return createBitmap2;
        }
    }
}
