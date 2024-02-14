package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.List;

public class ShapePath {
    @Deprecated

    /* renamed from: a */
    public float f50080a;
    @Deprecated

    /* renamed from: b */
    public float f50081b;
    @Deprecated

    /* renamed from: c */
    public float f50082c;
    @Deprecated

    /* renamed from: d */
    public float f50083d;
    @Deprecated

    /* renamed from: e */
    public float f50084e;
    @Deprecated

    /* renamed from: f */
    public float f50085f;

    /* renamed from: g */
    private final List<PathOperation> f50086g = new ArrayList();

    /* renamed from: h */
    private final List<ShadowCompatOperation> f50087h = new ArrayList();

    /* renamed from: i */
    private boolean f50088i;

    static class ArcShadowOperation extends ShadowCompatOperation {

        /* renamed from: b */
        private final PathArcOperation f50092b;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f50092b = pathArcOperation;
        }

        /* renamed from: a */
        public void mo58747a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i, @NonNull Canvas canvas) {
            float h = this.f50092b.m69374m();
            float i2 = this.f50092b.m69375n();
            shadowRenderer.mo58623a(canvas, matrix, new RectF(this.f50092b.m69372k(), this.f50092b.m69376o(), this.f50092b.m69373l(), this.f50092b.m69371j()), i, h, i2);
        }
    }

    static class LineShadowOperation extends ShadowCompatOperation {

        /* renamed from: b */
        private final PathLineOperation f50093b;

        /* renamed from: c */
        private final float f50094c;

        /* renamed from: d */
        private final float f50095d;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
            this.f50093b = pathLineOperation;
            this.f50094c = f;
            this.f50095d = f2;
        }

        /* renamed from: a */
        public void mo58747a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f50093b.f50110c - this.f50095d), (double) (this.f50093b.f50109b - this.f50094c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f50094c, this.f50095d);
            matrix2.preRotate(mo58748c());
            shadowRenderer.mo58624b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo58748c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f50093b.f50110c - this.f50095d) / (this.f50093b.f50109b - this.f50094c))));
        }
    }

    public static class PathArcOperation extends PathOperation {

        /* renamed from: h */
        private static final RectF f50096h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f50097b;
        @Deprecated

        /* renamed from: c */
        public float f50098c;
        @Deprecated

        /* renamed from: d */
        public float f50099d;
        @Deprecated

        /* renamed from: e */
        public float f50100e;
        @Deprecated

        /* renamed from: f */
        public float f50101f;
        @Deprecated

        /* renamed from: g */
        public float f50102g;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            m69378q(f);
            m69382u(f2);
            m69379r(f3);
            m69377p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m69371j() {
            return this.f50100e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m69372k() {
            return this.f50097b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m69373l() {
            return this.f50099d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m69374m() {
            return this.f50101f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m69375n() {
            return this.f50102g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m69376o() {
            return this.f50098c;
        }

        /* renamed from: p */
        private void m69377p(float f) {
            this.f50100e = f;
        }

        /* renamed from: q */
        private void m69378q(float f) {
            this.f50097b = f;
        }

        /* renamed from: r */
        private void m69379r(float f) {
            this.f50099d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m69380s(float f) {
            this.f50101f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m69381t(float f) {
            this.f50102g = f;
        }

        /* renamed from: u */
        private void m69382u(float f) {
            this.f50098c = f;
        }

        /* renamed from: a */
        public void mo58749a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f50111a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f50096h;
            rectF.set(m69372k(), m69376o(), m69373l(), m69371j());
            path.arcTo(rectF, m69374m(), m69375n(), false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {

        /* renamed from: b */
        private float f50103b;

        /* renamed from: c */
        private float f50104c;

        /* renamed from: d */
        private float f50105d;

        /* renamed from: e */
        private float f50106e;

        /* renamed from: f */
        private float f50107f;

        /* renamed from: g */
        private float f50108g;

        /* renamed from: a */
        public void mo58749a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f50111a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f50103b, this.f50104c, this.f50105d, this.f50106e, this.f50107f, this.f50108g);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f50109b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f50110c;

        /* renamed from: a */
        public void mo58749a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f50111a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f50109b, this.f50110c);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {

        /* renamed from: a */
        protected final Matrix f50111a = new Matrix();

        /* renamed from: a */
        public abstract void mo58749a(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {
        @Deprecated

        /* renamed from: b */
        public float f50112b;
        @Deprecated

        /* renamed from: c */
        public float f50113c;
        @Deprecated

        /* renamed from: d */
        public float f50114d;
        @Deprecated

        /* renamed from: e */
        public float f50115e;

        /* renamed from: b */
        private float m69391b() {
            return this.f50112b;
        }

        /* renamed from: c */
        private float m69392c() {
            return this.f50113c;
        }

        /* renamed from: d */
        private float m69393d() {
            return this.f50114d;
        }

        /* renamed from: e */
        private float m69394e() {
            return this.f50115e;
        }

        /* renamed from: a */
        public void mo58749a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f50111a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(m69391b(), m69392c(), m69393d(), m69394e());
            path.transform(matrix);
        }
    }

    static abstract class ShadowCompatOperation {

        /* renamed from: a */
        static final Matrix f50116a = new Matrix();

        ShadowCompatOperation() {
        }

        /* renamed from: a */
        public abstract void mo58747a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo58750b(ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            mo58747a(f50116a, shadowRenderer, i, canvas);
        }
    }

    public ShapePath() {
        mo58745n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m69338b(float f) {
        if (m69340g() != f) {
            float g = ((f - m69340g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                PathArcOperation pathArcOperation = new PathArcOperation(mo58740i(), mo58741j(), mo58740i(), mo58741j());
                pathArcOperation.m69380s(m69340g());
                pathArcOperation.m69381t(g);
                this.f50087h.add(new ArcShadowOperation(pathArcOperation));
                m69342p(f);
            }
        }
    }

    /* renamed from: c */
    private void m69339c(ShadowCompatOperation shadowCompatOperation, float f, float f2) {
        m69338b(f);
        this.f50087h.add(shadowCompatOperation);
        m69342p(f2);
    }

    /* renamed from: g */
    private float m69340g() {
        return this.f50084e;
    }

    /* renamed from: h */
    private float m69341h() {
        return this.f50085f;
    }

    /* renamed from: p */
    private void m69342p(float f) {
        this.f50084e = f;
    }

    /* renamed from: q */
    private void m69343q(float f) {
        this.f50085f = f;
    }

    /* renamed from: r */
    private void m69344r(float f) {
        this.f50082c = f;
    }

    /* renamed from: s */
    private void m69345s(float f) {
        this.f50083d = f;
    }

    /* renamed from: t */
    private void m69346t(float f) {
        this.f50080a = f;
    }

    /* renamed from: u */
    private void m69347u(float f) {
        this.f50081b = f;
    }

    /* renamed from: a */
    public void mo58736a(float f, float f2, float f3, float f4, float f5, float f6) {
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.m69380s(f5);
        pathArcOperation.m69381t(f6);
        this.f50086g.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m69339c(arcShadowOperation, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m69344r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m69345s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo58737d(Matrix matrix, Path path) {
        int size = this.f50086g.size();
        for (int i = 0; i < size; i++) {
            this.f50086g.get(i).mo58749a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo58738e() {
        return this.f50088i;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: f */
    public ShadowCompatOperation mo58739f(Matrix matrix) {
        m69338b(m69341h());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.f50087h);
        return new ShadowCompatOperation() {
            /* renamed from: a */
            public void mo58747a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
                for (ShadowCompatOperation a : arrayList) {
                    a.mo58747a(matrix2, shadowRenderer, i, canvas);
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo58740i() {
        return this.f50082c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo58741j() {
        return this.f50083d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo58742k() {
        return this.f50080a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo58743l() {
        return this.f50081b;
    }

    /* renamed from: m */
    public void mo58744m(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        float unused = pathLineOperation.f50109b = f;
        float unused2 = pathLineOperation.f50110c = f2;
        this.f50086g.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, mo58740i(), mo58741j());
        m69339c(lineShadowOperation, lineShadowOperation.mo58748c() + 270.0f, lineShadowOperation.mo58748c() + 270.0f);
        m69344r(f);
        m69345s(f2);
    }

    /* renamed from: n */
    public void mo58745n(float f, float f2) {
        mo58746o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo58746o(float f, float f2, float f3, float f4) {
        m69346t(f);
        m69347u(f2);
        m69344r(f);
        m69345s(f2);
        m69342p(f3);
        m69343q((f3 + f4) % 360.0f);
        this.f50086g.clear();
        this.f50087h.clear();
        this.f50088i = false;
    }
}
