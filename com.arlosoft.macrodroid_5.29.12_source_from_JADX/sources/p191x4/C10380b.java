package p191x4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p090f5.C7315j;
import p102h4.C7384g;
import p120k4.C7587c;
import p164s4.C10216q;

/* renamed from: x4.b */
/* compiled from: BitmapDrawableTranscoder */
public class C10380b implements C10383e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f23600a;

    public C10380b(@NonNull Resources resources) {
        this.f23600a = (Resources) C7315j.m30204d(resources);
    }

    @Nullable
    /* renamed from: a */
    public C7587c<BitmapDrawable> mo41060a(@NonNull C7587c<Bitmap> cVar, @NonNull C7384g gVar) {
        return C10216q.m40191d(this.f23600a, cVar);
    }
}
