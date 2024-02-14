package p054y;

import android.graphics.Color;
import androidx.annotation.IntRange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0009g;
import p050v.C2118c;
import p055z.C2205c;

/* renamed from: y.l */
/* compiled from: GradientColorParser */
public class C2186l implements C2184j0<C2118c> {

    /* renamed from: a */
    private int f6797a;

    public C2186l(int i) {
        this.f6797a = i;
    }

    /* renamed from: b */
    private void m8990b(C2118c cVar, List<Float> list) {
        int i = this.f6797a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo24251c(); i3++) {
                int i4 = cVar.mo24249a()[i3];
                cVar.mo24249a()[i3] = Color.argb(m8991c((double) cVar.mo24250b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    @IntRange(from = 0, mo610to = 255)
    /* renamed from: c */
    private int m8991c(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = C0009g.m67j(dArr4[i2], dArr4[i], C0009g.m59b((d - d3) / (d4 - d3), 0.0d, 1.0d));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public C2118c mo24389a(C2205c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY;
        if (z) {
            cVar.mo24399c();
        }
        while (cVar.mo24404h()) {
            arrayList.add(Float.valueOf((float) cVar.mo24406j()));
        }
        if (z) {
            cVar.mo24401f();
        }
        if (this.f6797a == -1) {
            this.f6797a = arrayList.size() / 4;
        }
        int i = this.f6797a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f6797a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C2118c cVar2 = new C2118c(fArr, iArr);
        m8990b(cVar2, arrayList);
        return cVar2;
    }
}
