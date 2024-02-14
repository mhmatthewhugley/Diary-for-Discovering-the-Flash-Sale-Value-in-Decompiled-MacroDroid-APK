package p164s4;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p083e4.C7271c;
import p090f5.C7316k;
import p102h4.C7387j;
import p120k4.C7587c;
import p126l4.C7669d;

/* renamed from: s4.e */
/* compiled from: BitmapTransformation */
public abstract class C10190e implements C7387j<Bitmap> {
    @NonNull
    /* renamed from: a */
    public final C7587c<Bitmap> mo37386a(@NonNull Context context, @NonNull C7587c<Bitmap> cVar, int i, int i2) {
        if (C7316k.m30223r(i, i2)) {
            C7669d f = C7271c.m30011c(context).mo37143f();
            Bitmap bitmap = cVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo40792c(f, bitmap, i, i2);
            return bitmap.equals(c) ? cVar : C10189d.m40094d(c, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo40792c(@NonNull C7669d dVar, @NonNull Bitmap bitmap, int i, int i2);
}
