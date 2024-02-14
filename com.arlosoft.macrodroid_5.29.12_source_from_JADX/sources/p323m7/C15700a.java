package p323m7;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: m7.a */
/* compiled from: AnimatorProxy */
public final class C15700a extends Animation {

    /* renamed from: H */
    public static final boolean f64989H = (Integer.valueOf(Build.VERSION.SDK).intValue() < 11);

    /* renamed from: I */
    private static final WeakHashMap<View, C15700a> f64990I = new WeakHashMap<>();

    /* renamed from: A */
    private float f64991A = 1.0f;

    /* renamed from: B */
    private float f64992B = 1.0f;

    /* renamed from: C */
    private float f64993C;

    /* renamed from: D */
    private float f64994D;

    /* renamed from: E */
    private final RectF f64995E = new RectF();

    /* renamed from: F */
    private final RectF f64996F = new RectF();

    /* renamed from: G */
    private final Matrix f64997G = new Matrix();

    /* renamed from: a */
    private final WeakReference<View> f64998a;

    /* renamed from: c */
    private final Camera f64999c = new Camera();

    /* renamed from: d */
    private boolean f65000d;

    /* renamed from: f */
    private float f65001f = 1.0f;

    /* renamed from: g */
    private float f65002g;

    /* renamed from: o */
    private float f65003o;

    /* renamed from: p */
    private float f65004p;

    /* renamed from: s */
    private float f65005s;

    /* renamed from: z */
    private float f65006z;

    private C15700a(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f64998a = new WeakReference<>(view);
    }

    /* renamed from: B */
    private void m94929B(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        boolean z = this.f65000d;
        float f = z ? this.f65002g : width / 2.0f;
        float f2 = z ? this.f65003o : height / 2.0f;
        float f3 = this.f65004p;
        float f4 = this.f65005s;
        float f5 = this.f65006z;
        if (!(f3 == 0.0f && f4 == 0.0f && f5 == 0.0f)) {
            Camera camera = this.f64999c;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f64991A;
        float f7 = this.f64992B;
        if (!(f6 == 1.0f && f7 == 1.0f)) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.f64993C, this.f64994D);
    }

    /* renamed from: C */
    public static C15700a m94930C(View view) {
        WeakHashMap<View, C15700a> weakHashMap = f64990I;
        C15700a aVar = weakHashMap.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        C15700a aVar2 = new C15700a(view);
        weakHashMap.put(view, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private void m94931a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.f64997G;
        matrix.reset();
        m94929B(matrix, view);
        this.f64997G.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* renamed from: o */
    private void m94932o() {
        View view = (View) this.f64998a.get();
        if (view != null && view.getParent() != null) {
            RectF rectF = this.f64996F;
            m94931a(rectF, view);
            rectF.union(this.f64995E);
            ((View) view.getParent()).invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
    }

    /* renamed from: p */
    private void m94933p() {
        View view = (View) this.f64998a.get();
        if (view != null) {
            m94931a(this.f64995E, view);
        }
    }

    /* renamed from: A */
    public void mo75091A(float f) {
        View view = (View) this.f64998a.get();
        if (view != null) {
            mo75110y(f - ((float) view.getTop()));
        }
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f64998a.get();
        if (view != null) {
            transformation.setAlpha(this.f65001f);
            m94929B(transformation.getMatrix(), view);
        }
    }

    /* renamed from: b */
    public float mo75093b() {
        return this.f65001f;
    }

    /* renamed from: c */
    public float mo75094c() {
        return this.f65006z;
    }

    /* renamed from: d */
    public float mo75095d() {
        return this.f65004p;
    }

    /* renamed from: e */
    public float mo75096e() {
        return this.f65005s;
    }

    /* renamed from: f */
    public float mo75097f() {
        return this.f64991A;
    }

    /* renamed from: g */
    public float mo75098g() {
        return this.f64992B;
    }

    /* renamed from: h */
    public float mo75099h() {
        return this.f64993C;
    }

    /* renamed from: k */
    public float mo75100k() {
        return this.f64994D;
    }

    /* renamed from: l */
    public float mo75101l() {
        View view = (View) this.f64998a.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getLeft()) + this.f64993C;
    }

    /* renamed from: n */
    public float mo75102n() {
        View view = (View) this.f64998a.get();
        if (view == null) {
            return 0.0f;
        }
        return ((float) view.getTop()) + this.f64994D;
    }

    /* renamed from: q */
    public void mo75103q(float f) {
        if (this.f65001f != f) {
            this.f65001f = f;
            View view = (View) this.f64998a.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: r */
    public void mo75104r(float f) {
        if (this.f65006z != f) {
            m94933p();
            this.f65006z = f;
            m94932o();
        }
    }

    /* renamed from: s */
    public void mo75105s(float f) {
        if (this.f65004p != f) {
            m94933p();
            this.f65004p = f;
            m94932o();
        }
    }

    /* renamed from: t */
    public void mo75106t(float f) {
        if (this.f65005s != f) {
            m94933p();
            this.f65005s = f;
            m94932o();
        }
    }

    /* renamed from: u */
    public void mo75107u(float f) {
        if (this.f64991A != f) {
            m94933p();
            this.f64991A = f;
            m94932o();
        }
    }

    /* renamed from: v */
    public void mo75108v(float f) {
        if (this.f64992B != f) {
            m94933p();
            this.f64992B = f;
            m94932o();
        }
    }

    /* renamed from: x */
    public void mo75109x(float f) {
        if (this.f64993C != f) {
            m94933p();
            this.f64993C = f;
            m94932o();
        }
    }

    /* renamed from: y */
    public void mo75110y(float f) {
        if (this.f64994D != f) {
            m94933p();
            this.f64994D = f;
            m94932o();
        }
    }

    /* renamed from: z */
    public void mo75111z(float f) {
        View view = (View) this.f64998a.get();
        if (view != null) {
            mo75109x(f - ((float) view.getLeft()));
        }
    }
}
