package p411v6;

import android.graphics.Bitmap;

/* renamed from: v6.a */
/* compiled from: BitmapInfo */
public class C16714a {

    /* renamed from: a */
    public final Bitmap f67637a;

    /* renamed from: a */
    public int mo79630a() {
        Bitmap bitmap = this.f67637a;
        if (bitmap != null) {
            return bitmap.getRowBytes() * this.f67637a.getHeight();
        }
        return 0;
    }
}
