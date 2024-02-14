package p126l4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: l4.e */
/* compiled from: BitmapPoolAdapter */
public class C7670e implements C7669d {
    /* renamed from: a */
    public void mo37690a(int i) {
    }

    /* renamed from: b */
    public void mo37691b() {
    }

    /* renamed from: c */
    public void mo37692c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo37693d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @NonNull
    /* renamed from: e */
    public Bitmap mo37694e(int i, int i2, Bitmap.Config config) {
        return mo37693d(i, i2, config);
    }
}
