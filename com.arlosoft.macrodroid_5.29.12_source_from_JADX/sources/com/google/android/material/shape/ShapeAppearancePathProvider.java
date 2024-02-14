package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

public class ShapeAppearancePathProvider {

    /* renamed from: a */
    private final ShapePath[] f50062a = new ShapePath[4];

    /* renamed from: b */
    private final Matrix[] f50063b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f50064c = new Matrix[4];

    /* renamed from: d */
    private final PointF f50065d = new PointF();

    /* renamed from: e */
    private final Path f50066e = new Path();

    /* renamed from: f */
    private final Path f50067f = new Path();

    /* renamed from: g */
    private final ShapePath f50068g = new ShapePath();

    /* renamed from: h */
    private final float[] f50069h = new float[2];

    /* renamed from: i */
    private final float[] f50070i = new float[2];

    /* renamed from: j */
    private final Path f50071j = new Path();

    /* renamed from: k */
    private final Path f50072k = new Path();

    /* renamed from: l */
    private boolean f50073l = true;

    private static class Lazy {

        /* renamed from: a */
        static final ShapeAppearancePathProvider f50074a = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface PathListener {
        /* renamed from: a */
        void mo58687a(ShapePath shapePath, Matrix matrix, int i);

        /* renamed from: b */
        void mo58688b(ShapePath shapePath, Matrix matrix, int i);
    }

    static final class ShapeAppearancePathSpec {
        @NonNull

        /* renamed from: a */
        public final ShapeAppearanceModel f50075a;
        @NonNull

        /* renamed from: b */
        public final Path f50076b;
        @NonNull

        /* renamed from: c */
        public final RectF f50077c;
        @Nullable

        /* renamed from: d */
        public final PathListener f50078d;

        /* renamed from: e */
        public final float f50079e;

        ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.f50078d = pathListener;
            this.f50075a = shapeAppearanceModel;
            this.f50079e = f;
            this.f50077c = rectF;
            this.f50076b = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.f50062a[i] = new ShapePath();
            this.f50063b[i] = new Matrix();
            this.f50064c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m69322a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m69323b(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        this.f50069h[0] = this.f50062a[i].mo58742k();
        this.f50069h[1] = this.f50062a[i].mo58743l();
        this.f50063b[i].mapPoints(this.f50069h);
        if (i == 0) {
            Path path = shapeAppearancePathSpec.f50076b;
            float[] fArr = this.f50069h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.f50076b;
            float[] fArr2 = this.f50069h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f50062a[i].mo58737d(this.f50063b[i], shapeAppearancePathSpec.f50076b);
        PathListener pathListener = shapeAppearancePathSpec.f50078d;
        if (pathListener != null) {
            pathListener.mo58687a(this.f50062a[i], this.f50063b[i], i);
        }
    }

    /* renamed from: c */
    private void m69324c(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        int i2 = (i + 1) % 4;
        this.f50069h[0] = this.f50062a[i].mo58740i();
        this.f50069h[1] = this.f50062a[i].mo58741j();
        this.f50063b[i].mapPoints(this.f50069h);
        this.f50070i[0] = this.f50062a[i2].mo58742k();
        this.f50070i[1] = this.f50062a[i2].mo58743l();
        this.f50063b[i2].mapPoints(this.f50070i);
        float[] fArr = this.f50069h;
        float f = fArr[0];
        float[] fArr2 = this.f50070i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m69328i(shapeAppearancePathSpec.f50077c, i);
        this.f50068g.mo58745n(0.0f, 0.0f);
        EdgeTreatment j = m69329j(i, shapeAppearancePathSpec.f50075a);
        j.mo56905b(max, i3, shapeAppearancePathSpec.f50079e, this.f50068g);
        this.f50071j.reset();
        this.f50068g.mo58737d(this.f50064c[i], this.f50071j);
        if (!this.f50073l || (!j.mo58635a() && !m69331l(this.f50071j, i) && !m69331l(this.f50071j, i2))) {
            this.f50068g.mo58737d(this.f50064c[i], shapeAppearancePathSpec.f50076b);
        } else {
            Path path = this.f50071j;
            path.op(path, this.f50067f, Path.Op.DIFFERENCE);
            this.f50069h[0] = this.f50068g.mo58742k();
            this.f50069h[1] = this.f50068g.mo58743l();
            this.f50064c[i].mapPoints(this.f50069h);
            Path path2 = this.f50066e;
            float[] fArr3 = this.f50069h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f50068g.mo58737d(this.f50064c[i], this.f50066e);
        }
        PathListener pathListener = shapeAppearancePathSpec.f50078d;
        if (pathListener != null) {
            pathListener.mo58688b(this.f50068g, this.f50064c[i], i);
        }
    }

    /* renamed from: f */
    private void m69325f(int i, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private CornerSize m69326g(int i, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i == 1) {
            return shapeAppearanceModel.mo58698l();
        }
        if (i == 2) {
            return shapeAppearanceModel.mo58696j();
        }
        if (i != 3) {
            return shapeAppearanceModel.mo58705t();
        }
        return shapeAppearanceModel.mo58703r();
    }

    /* renamed from: h */
    private CornerTreatment m69327h(int i, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i == 1) {
            return shapeAppearanceModel.mo58697k();
        }
        if (i == 2) {
            return shapeAppearanceModel.mo58695i();
        }
        if (i != 3) {
            return shapeAppearanceModel.mo58704s();
        }
        return shapeAppearanceModel.mo58702q();
    }

    /* renamed from: i */
    private float m69328i(@NonNull RectF rectF, int i) {
        float[] fArr = this.f50069h;
        ShapePath[] shapePathArr = this.f50062a;
        fArr[0] = shapePathArr[i].f50082c;
        fArr[1] = shapePathArr[i].f50083d;
        this.f50063b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f50069h[0]);
        }
        return Math.abs(rectF.centerY() - this.f50069h[1]);
    }

    /* renamed from: j */
    private EdgeTreatment m69329j(int i, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i == 1) {
            return shapeAppearanceModel.mo58694h();
        }
        if (i == 2) {
            return shapeAppearanceModel.mo58699n();
        }
        if (i != 3) {
            return shapeAppearanceModel.mo58700o();
        }
        return shapeAppearanceModel.mo58701p();
    }

    @UiThread
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public static ShapeAppearancePathProvider m69330k() {
        return Lazy.f50074a;
    }

    @RequiresApi(19)
    /* renamed from: l */
    private boolean m69331l(Path path, int i) {
        this.f50072k.reset();
        this.f50062a[i].mo58737d(this.f50063b[i], this.f50072k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f50072k.computeBounds(rectF, true);
        path.op(this.f50072k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m69332m(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        m69327h(i, shapeAppearancePathSpec.f50075a).mo58634c(this.f50062a[i], 90.0f, shapeAppearancePathSpec.f50079e, shapeAppearancePathSpec.f50077c, m69326g(i, shapeAppearancePathSpec.f50075a));
        float a = m69322a(i);
        this.f50063b[i].reset();
        m69325f(i, shapeAppearancePathSpec.f50077c, this.f50065d);
        Matrix matrix = this.f50063b[i];
        PointF pointF = this.f50065d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f50063b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m69333n(int i) {
        this.f50069h[0] = this.f50062a[i].mo58740i();
        this.f50069h[1] = this.f50062a[i].mo58741j();
        this.f50063b[i].mapPoints(this.f50069h);
        float a = m69322a(i);
        this.f50064c[i].reset();
        Matrix matrix = this.f50064c[i];
        float[] fArr = this.f50069h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f50064c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo58734d(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, @NonNull Path path) {
        mo58735e(shapeAppearanceModel, f, rectF, (PathListener) null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo58735e(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.f50066e.rewind();
        this.f50067f.rewind();
        this.f50067f.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f, rectF, pathListener, path);
        for (int i = 0; i < 4; i++) {
            m69332m(shapeAppearancePathSpec, i);
            m69333n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m69323b(shapeAppearancePathSpec, i2);
            m69324c(shapeAppearancePathSpec, i2);
        }
        path.close();
        this.f50066e.close();
        if (!this.f50066e.isEmpty()) {
            path.op(this.f50066e, Path.Op.UNION);
        }
    }
}
