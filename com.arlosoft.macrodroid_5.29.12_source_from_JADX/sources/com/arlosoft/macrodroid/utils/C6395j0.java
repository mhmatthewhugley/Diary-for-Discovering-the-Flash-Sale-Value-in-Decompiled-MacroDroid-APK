package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.io.IOException;

/* renamed from: com.arlosoft.macrodroid.utils.j0 */
/* compiled from: IconUtils */
public class C6395j0 {
    /* renamed from: a */
    public static void m24649a(Context context, ImageView imageView, String str, String str2, int i, Uri uri) {
        if (uri != null) {
            try {
                imageView.setImageURI(uri);
            } catch (Exception e) {
                C4878b.m18868g("Failed to set image: " + e.toString());
                imageView.setImageResource(C17530R$drawable.not_icon_setup);
            }
        } else if (str2 == null) {
            int V = str != null ? C4061t1.m15976V(context, str) : -1;
            if (V != -1) {
                imageView.setImageResource(V);
            } else if (i == 0) {
                imageView.setImageResource(C17530R$drawable.not_icon_setup);
            } else {
                imageView.setImageResource(i);
            }
        } else if (str2.equals("UserIcon")) {
            Bitmap f = C6362a0.m24600f(str);
            if (f != null) {
                imageView.setImageBitmap(f);
            } else {
                imageView.setImageResource(C17530R$drawable.launcher_no_border);
            }
        } else {
            Drawable I = C4061t1.m15960I(context, str2, str);
            if (I == null) {
                I = C4061t1.m15958H(context, str2, i);
            }
            if (I != null) {
                imageView.setImageDrawable(I);
            } else {
                imageView.setImageResource(C17530R$drawable.not_icon_setup);
            }
        }
    }

    /* renamed from: b */
    public static void m24650b(Context context, ImageView imageView, String str, String str2, int i, String str3) {
        m24649a(context, imageView, str, str2, i, str3 != null ? Uri.parse(str3) : null);
    }

    /* renamed from: c */
    public static void m24651c(Context context, RemoteViews remoteViews, int i, String str, String str2, int i2, String str3, Integer num) {
        if (str3 != null) {
            try {
                remoteViews.setImageViewBitmap(i, MediaStore.Images.Media.getBitmap(context.getContentResolver(), Uri.parse(str3)));
            } catch (IOException unused) {
                C4878b.m18868g("Could not load image: " + str3);
                remoteViews.setImageViewUri(i, Uri.parse(str3));
            }
        } else {
            boolean z = num != null && (str2 == null || str2.equals("com.arlosoft.macrodroid")) && (str == null || !str.equals("com.arlosoft.macrodroid"));
            if (str2 == null) {
                int V = str != null ? C4061t1.m15976V(context, str) : -1;
                Drawable I = C4061t1.m15960I(context, "com.arlosoft.macrodroid", str);
                if (I != null) {
                    Bitmap a = C6443v.m24755a(I);
                    if (z) {
                        remoteViews.setImageViewBitmap(i, m24652d(a, num.intValue()));
                    } else {
                        remoteViews.setImageViewBitmap(i, a);
                    }
                } else if (V != -1) {
                    remoteViews.setImageViewResource(i, V);
                } else if (i2 == 0) {
                    remoteViews.setImageViewResource(i, C17530R$drawable.not_icon_setup);
                } else {
                    remoteViews.setImageViewResource(i, i2);
                }
            } else if (str2.equals("UserIcon")) {
                Bitmap f = C6362a0.m24600f(str);
                if (f != null) {
                    remoteViews.setImageViewBitmap(i, f);
                } else {
                    remoteViews.setImageViewResource(i, C17530R$drawable.launcher_no_border);
                }
            } else {
                Drawable I2 = C4061t1.m15960I(context, str2, str);
                if (I2 == null) {
                    I2 = C4061t1.m15958H(context, str2, i2);
                }
                if (I2 != null) {
                    Bitmap a2 = C6443v.m24755a(I2);
                    if (z) {
                        remoteViews.setImageViewBitmap(i, m24652d(a2, num.intValue()));
                    } else {
                        remoteViews.setImageViewBitmap(i, a2);
                    }
                } else {
                    remoteViews.setImageViewResource(i, C17530R$drawable.not_icon_setup);
                }
            }
        }
    }

    /* renamed from: d */
    public static Bitmap m24652d(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(bitmap.getDensity());
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
