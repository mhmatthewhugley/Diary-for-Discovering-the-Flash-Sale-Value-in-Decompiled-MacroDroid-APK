package p067c5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* renamed from: c5.e */
/* compiled from: ImageViewTargetFactory */
public class C2275e {
    @NonNull
    /* renamed from: a */
    public <Z> C2279i<ImageView, Z> mo24594a(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C2272b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2273c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
