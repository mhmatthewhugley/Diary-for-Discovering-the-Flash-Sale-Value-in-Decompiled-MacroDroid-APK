package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularRevealHelper {

    /* renamed from: j */
    public static final int f49071j = 2;

    /* renamed from: a */
    private final Delegate f49072a;
    @NonNull

    /* renamed from: b */
    private final View f49073b;
    @NonNull

    /* renamed from: c */
    private final Path f49074c = new Path();
    @NonNull

    /* renamed from: d */
    private final Paint f49075d = new Paint(7);
    @NonNull

    /* renamed from: e */
    private final Paint f49076e;
    @Nullable

    /* renamed from: f */
    private CircularRevealWidget.RevealInfo f49077f;
    @Nullable

    /* renamed from: g */
    private Drawable f49078g;

    /* renamed from: h */
    private boolean f49079h;

    /* renamed from: i */
    private boolean f49080i;

    public interface Delegate {
        /* renamed from: c */
        void mo57488c(Canvas canvas);

        /* renamed from: d */
        boolean mo57489d();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    public CircularRevealHelper(Delegate delegate) {
        this.f49072a = delegate;
        View view = (View) delegate;
        this.f49073b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f49076e = paint;
        paint.setColor(0);
    }

    /* renamed from: d */
    private void m68049d(@NonNull Canvas canvas) {
        if (m68053o()) {
            Rect bounds = this.f49078g.getBounds();
            float width = this.f49077f.f49087a - (((float) bounds.width()) / 2.0f);
            float height = this.f49077f.f49088b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f49078g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: g */
    private float m68050g(@NonNull CircularRevealWidget.RevealInfo revealInfo) {
        return MathUtils.m68853b(revealInfo.f49087a, revealInfo.f49088b, 0.0f, 0.0f, (float) this.f49073b.getWidth(), (float) this.f49073b.getHeight());
    }

    /* renamed from: i */
    private void m68051i() {
        if (f49071j == 1) {
            this.f49074c.rewind();
            CircularRevealWidget.RevealInfo revealInfo = this.f49077f;
            if (revealInfo != null) {
                this.f49074c.addCircle(revealInfo.f49087a, revealInfo.f49088b, revealInfo.f49089c, Path.Direction.CW);
            }
        }
        this.f49073b.invalidate();
    }

    /* renamed from: n */
    private boolean m68052n() {
        CircularRevealWidget.RevealInfo revealInfo = this.f49077f;
        boolean z = revealInfo == null || revealInfo.mo57527a();
        if (f49071j != 0) {
            return !z;
        }
        if (z || !this.f49080i) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m68053o() {
        return (this.f49079h || this.f49078g == null || this.f49077f == null) ? false : true;
    }

    /* renamed from: p */
    private boolean m68054p() {
        return !this.f49079h && Color.alpha(this.f49076e.getColor()) != 0;
    }

    /* renamed from: a */
    public void mo57501a() {
        if (f49071j == 0) {
            this.f49079h = true;
            this.f49080i = false;
            this.f49073b.buildDrawingCache();
            Bitmap drawingCache = this.f49073b.getDrawingCache();
            if (!(drawingCache != null || this.f49073b.getWidth() == 0 || this.f49073b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f49073b.getWidth(), this.f49073b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f49073b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f49075d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f49079h = false;
            this.f49080i = true;
        }
    }

    /* renamed from: b */
    public void mo57502b() {
        if (f49071j == 0) {
            this.f49080i = false;
            this.f49073b.destroyDrawingCache();
            this.f49075d.setShader((Shader) null);
            this.f49073b.invalidate();
        }
    }

    /* renamed from: c */
    public void mo57503c(@NonNull Canvas canvas) {
        if (m68052n()) {
            int i = f49071j;
            if (i == 0) {
                CircularRevealWidget.RevealInfo revealInfo = this.f49077f;
                canvas.drawCircle(revealInfo.f49087a, revealInfo.f49088b, revealInfo.f49089c, this.f49075d);
                if (m68054p()) {
                    CircularRevealWidget.RevealInfo revealInfo2 = this.f49077f;
                    canvas.drawCircle(revealInfo2.f49087a, revealInfo2.f49088b, revealInfo2.f49089c, this.f49076e);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f49074c);
                this.f49072a.mo57488c(canvas);
                if (m68054p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f49073b.getWidth(), (float) this.f49073b.getHeight(), this.f49076e);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f49072a.mo57488c(canvas);
                if (m68054p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f49073b.getWidth(), (float) this.f49073b.getHeight(), this.f49076e);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f49072a.mo57488c(canvas);
            if (m68054p()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f49073b.getWidth(), (float) this.f49073b.getHeight(), this.f49076e);
            }
        }
        m68049d(canvas);
    }

    @Nullable
    /* renamed from: e */
    public Drawable mo57504e() {
        return this.f49078g;
    }

    @ColorInt
    /* renamed from: f */
    public int mo57505f() {
        return this.f49076e.getColor();
    }

    @Nullable
    /* renamed from: h */
    public CircularRevealWidget.RevealInfo mo57506h() {
        CircularRevealWidget.RevealInfo revealInfo = this.f49077f;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.mo57527a()) {
            revealInfo2.f49089c = m68050g(revealInfo2);
        }
        return revealInfo2;
    }

    /* renamed from: j */
    public boolean mo57507j() {
        return this.f49072a.mo57489d() && !m68052n();
    }

    /* renamed from: k */
    public void mo57508k(@Nullable Drawable drawable) {
        this.f49078g = drawable;
        this.f49073b.invalidate();
    }

    /* renamed from: l */
    public void mo57509l(@ColorInt int i) {
        this.f49076e.setColor(i);
        this.f49073b.invalidate();
    }

    /* renamed from: m */
    public void mo57510m(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.f49077f = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f49077f;
            if (revealInfo2 == null) {
                this.f49077f = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.mo57529c(revealInfo);
            }
            if (MathUtils.m68854c(revealInfo.f49089c, m68050g(revealInfo), 1.0E-4f)) {
                this.f49077f.f49089c = Float.MAX_VALUE;
            }
        }
        m68051i();
    }
}
