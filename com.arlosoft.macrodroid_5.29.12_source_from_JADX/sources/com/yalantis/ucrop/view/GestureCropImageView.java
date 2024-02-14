package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import p395t8.C16591h;

public class GestureCropImageView extends CropImageView {

    /* renamed from: S */
    private ScaleGestureDetector f58021S;

    /* renamed from: T */
    private C16591h f58022T;

    /* renamed from: U */
    private GestureDetector f58023U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public float f58024V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public float f58025W;

    /* renamed from: a0 */
    private boolean f58026a0;

    /* renamed from: b0 */
    private boolean f58027b0;

    /* renamed from: c0 */
    private int f58028c0;

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    private class C11919b extends GestureDetector.SimpleOnGestureListener {
        private C11919b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.mo67250z(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.mo67300k(-f, -f2);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    private class C11920c extends C16591h.C16593b {
        private C11920c() {
        }

        /* renamed from: a */
        public boolean mo67262a(C16591h hVar) {
            GestureCropImageView.this.mo67299i(hVar.mo79439c(), GestureCropImageView.this.f58024V, GestureCropImageView.this.f58025W);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    private class C11921d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C11921d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.mo67234j(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f58024V, GestureCropImageView.this.f58025W);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: G */
    private void m82241G() {
        this.f58023U = new GestureDetector(getContext(), new C11919b(), (Handler) null, true);
        this.f58021S = new ScaleGestureDetector(getContext(), new C11921d());
        this.f58022T = new C16591h(new C11920c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo67253g() {
        super.mo67253g();
        m82241G();
    }

    public int getDoubleTapScaleSteps() {
        return this.f58028c0;
    }

    /* access modifiers changed from: protected */
    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.f58028c0))));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            mo67235r();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f58024V = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f58025W = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.f58023U.onTouchEvent(motionEvent);
        if (this.f58027b0) {
            this.f58021S.onTouchEvent(motionEvent);
        }
        if (this.f58026a0) {
            this.f58022T.mo79440d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            mo67249x();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f58028c0 = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f58026a0 = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f58027b0 = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58026a0 = true;
        this.f58027b0 = true;
        this.f58028c0 = 5;
    }
}
