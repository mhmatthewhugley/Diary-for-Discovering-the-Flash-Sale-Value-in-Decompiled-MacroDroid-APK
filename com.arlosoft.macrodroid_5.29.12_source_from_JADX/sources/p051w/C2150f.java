package p051w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.C1472f;
import java.util.Collections;
import java.util.List;
import p045q.C2050d;
import p048t.C2097e;
import p050v.C2132n;

/* renamed from: w.f */
/* compiled from: ShapeLayer */
public class C2150f extends C2140a {

    /* renamed from: z */
    private final C2050d f6734z;

    C2150f(C1472f fVar, C2146d dVar) {
        super(fVar, dVar);
        C2050d dVar2 = new C2050d(fVar, this, new C2132n("__container", dVar.mo24363l(), false));
        this.f6734z = dVar2;
        dVar2.mo24124b(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo24342D(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        this.f6734z.mo24126d(eVar, i, list, eVar2);
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        super.mo24127e(rectF, matrix, z);
        this.f6734z.mo24127e(rectF, this.f6671m, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24348t(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.f6734z.mo24128g(canvas, matrix, i);
    }
}
