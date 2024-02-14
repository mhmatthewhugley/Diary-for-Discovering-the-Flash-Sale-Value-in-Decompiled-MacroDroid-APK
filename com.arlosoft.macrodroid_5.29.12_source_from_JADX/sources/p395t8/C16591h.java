package p395t8;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* renamed from: t8.h */
/* compiled from: RotationGestureDetector */
public class C16591h {

    /* renamed from: a */
    private float f67404a;

    /* renamed from: b */
    private float f67405b;

    /* renamed from: c */
    private float f67406c;

    /* renamed from: d */
    private float f67407d;

    /* renamed from: e */
    private int f67408e = -1;

    /* renamed from: f */
    private int f67409f = -1;

    /* renamed from: g */
    private float f67410g;

    /* renamed from: h */
    private boolean f67411h;

    /* renamed from: i */
    private C16592a f67412i;

    /* renamed from: t8.h$a */
    /* compiled from: RotationGestureDetector */
    public interface C16592a {
        /* renamed from: a */
        boolean mo67262a(C16591h hVar);
    }

    /* renamed from: t8.h$b */
    /* compiled from: RotationGestureDetector */
    public static class C16593b implements C16592a {
    }

    public C16591h(C16592a aVar) {
        this.f67412i = aVar;
    }

    /* renamed from: a */
    private float m98874a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m98875b((float) Math.toDegrees((double) ((float) Math.atan2((double) (f2 - f4), (double) (f - f3)))), (float) Math.toDegrees((double) ((float) Math.atan2((double) (f6 - f8), (double) (f5 - f7)))));
    }

    /* renamed from: b */
    private float m98875b(float f, float f2) {
        float f3 = (f2 % 360.0f) - (f % 360.0f);
        this.f67410g = f3;
        if (f3 < -180.0f) {
            this.f67410g = f3 + 360.0f;
        } else if (f3 > 180.0f) {
            this.f67410g = f3 - 360.0f;
        }
        return this.f67410g;
    }

    /* renamed from: c */
    public float mo79439c() {
        return this.f67410g;
    }

    /* renamed from: d */
    public boolean mo79440d(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f67406c = motionEvent.getX();
            this.f67407d = motionEvent.getY();
            this.f67408e = motionEvent2.findPointerIndex(motionEvent2.getPointerId(0));
            this.f67410g = 0.0f;
            this.f67411h = true;
        } else if (actionMasked == 1) {
            this.f67408e = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f67404a = motionEvent.getX();
                this.f67405b = motionEvent.getY();
                this.f67409f = motionEvent2.findPointerIndex(motionEvent2.getPointerId(motionEvent.getActionIndex()));
                this.f67410g = 0.0f;
                this.f67411h = true;
            } else if (actionMasked == 6) {
                this.f67409f = -1;
            }
        } else if (!(this.f67408e == -1 || this.f67409f == -1 || motionEvent.getPointerCount() <= this.f67409f)) {
            float x = motionEvent2.getX(this.f67408e);
            float y = motionEvent2.getY(this.f67408e);
            float x2 = motionEvent2.getX(this.f67409f);
            float y2 = motionEvent2.getY(this.f67409f);
            if (this.f67411h) {
                this.f67410g = 0.0f;
                this.f67411h = false;
            } else {
                m98874a(this.f67404a, this.f67405b, this.f67406c, this.f67407d, x2, y2, x, y);
            }
            C16592a aVar = this.f67412i;
            if (aVar != null) {
                aVar.mo67262a(this);
            }
            this.f67404a = x2;
            this.f67405b = y2;
            this.f67406c = x;
            this.f67407d = y;
        }
        return true;
    }
}
