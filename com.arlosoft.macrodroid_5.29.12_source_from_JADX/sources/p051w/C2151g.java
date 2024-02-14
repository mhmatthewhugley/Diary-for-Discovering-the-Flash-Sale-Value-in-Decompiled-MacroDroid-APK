package p051w;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import p012b0.C1399c;
import p043p.C2044a;
import p046r.C2068a;
import p046r.C2089p;

/* renamed from: w.g */
/* compiled from: SolidLayer */
public class C2151g extends C2140a {

    /* renamed from: A */
    private final Paint f6735A;

    /* renamed from: B */
    private final float[] f6736B;

    /* renamed from: C */
    private final Path f6737C;

    /* renamed from: D */
    private final C2146d f6738D;
    @Nullable

    /* renamed from: E */
    private C2068a<ColorFilter, ColorFilter> f6739E;

    /* renamed from: z */
    private final RectF f6740z = new RectF();

    C2151g(C1472f fVar, C2146d dVar) {
        super(fVar, dVar);
        C2044a aVar = new C2044a();
        this.f6735A = aVar;
        this.f6736B = new float[8];
        this.f6737C = new Path();
        this.f6738D = dVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(dVar.mo24364m());
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        super.mo24125c(t, cVar);
        if (t != C1492k.f984E) {
            return;
        }
        if (cVar == null) {
            this.f6739E = null;
        } else {
            this.f6739E = new C2089p(cVar);
        }
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        super.mo24127e(rectF, matrix, z);
        this.f6740z.set(0.0f, 0.0f, (float) this.f6738D.mo24366o(), (float) this.f6738D.mo24365n());
        this.f6671m.mapRect(this.f6740z);
        rectF.set(this.f6740z);
    }

    /* renamed from: t */
    public void mo24348t(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f6738D.mo24364m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f6680v.mo24192h() == null ? 100 : this.f6680v.mo24192h().mo24148h().intValue()))) / 100.0f) * 255.0f);
            this.f6735A.setAlpha(intValue);
            C2068a<ColorFilter, ColorFilter> aVar = this.f6739E;
            if (aVar != null) {
                this.f6735A.setColorFilter(aVar.mo24148h());
            }
            if (intValue > 0) {
                float[] fArr = this.f6736B;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f6738D.mo24366o();
                float[] fArr2 = this.f6736B;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f6738D.mo24366o();
                this.f6736B[5] = (float) this.f6738D.mo24365n();
                float[] fArr3 = this.f6736B;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f6738D.mo24365n();
                matrix.mapPoints(this.f6736B);
                this.f6737C.reset();
                Path path = this.f6737C;
                float[] fArr4 = this.f6736B;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f6737C;
                float[] fArr5 = this.f6736B;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f6737C;
                float[] fArr6 = this.f6736B;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f6737C;
                float[] fArr7 = this.f6736B;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f6737C;
                float[] fArr8 = this.f6736B;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f6737C.close();
                canvas.drawPath(this.f6737C, this.f6735A);
            }
        }
    }
}
