package p051w;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import p001a0.C0010h;
import p012b0.C1399c;
import p043p.C2044a;
import p046r.C2068a;
import p046r.C2089p;

/* renamed from: w.c */
/* compiled from: ImageLayer */
public class C2145c extends C2140a {

    /* renamed from: A */
    private final Rect f6693A = new Rect();

    /* renamed from: B */
    private final Rect f6694B = new Rect();
    @Nullable

    /* renamed from: C */
    private C2068a<ColorFilter, ColorFilter> f6695C;

    /* renamed from: z */
    private final Paint f6696z = new C2044a(3);

    C2145c(C1472f fVar, C2146d dVar) {
        super(fVar, dVar);
    }

    @Nullable
    /* renamed from: K */
    private Bitmap m8868K() {
        return this.f6672n.mo17146t(this.f6673o.mo24362k());
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        super.mo24125c(t, cVar);
        if (t != C1492k.f984E) {
            return;
        }
        if (cVar == null) {
            this.f6695C = null;
        } else {
            this.f6695C = new C2089p(cVar);
        }
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        super.mo24127e(rectF, matrix, z);
        Bitmap K = m8868K();
        if (K != null) {
            rectF.set(0.0f, 0.0f, ((float) K.getWidth()) * C0010h.m75e(), ((float) K.getHeight()) * C0010h.m75e());
            this.f6671m.mapRect(rectF);
        }
    }

    /* renamed from: t */
    public void mo24348t(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap K = m8868K();
        if (K != null && !K.isRecycled()) {
            float e = C0010h.m75e();
            this.f6696z.setAlpha(i);
            C2068a<ColorFilter, ColorFilter> aVar = this.f6695C;
            if (aVar != null) {
                this.f6696z.setColorFilter(aVar.mo24148h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f6693A.set(0, 0, K.getWidth(), K.getHeight());
            this.f6694B.set(0, 0, (int) (((float) K.getWidth()) * e), (int) (((float) K.getHeight()) * e));
            canvas.drawBitmap(K, this.f6693A, this.f6694B, this.f6696z);
            canvas.restore();
        }
    }
}
