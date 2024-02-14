package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ViewOverlayApi14 implements ViewOverlayImpl {

    /* renamed from: a */
    protected OverlayViewGroup f49667a;

    static class OverlayViewGroup extends ViewGroup {

        /* renamed from: g */
        static Method f49668g;

        /* renamed from: a */
        ViewGroup f49669a;

        /* renamed from: c */
        View f49670c;

        /* renamed from: d */
        ArrayList<Drawable> f49671d;

        /* renamed from: f */
        private boolean f49672f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f49668g = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: b */
        private void m68829b() {
            if (this.f49672f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: c */
        private void m68830c() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f49671d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f49672f = true;
                    this.f49669a.removeView(this);
                }
            }
        }

        /* renamed from: d */
        private void m68831d(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f49669a.getLocationOnScreen(iArr2);
            this.f49670c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo58230a(Drawable drawable) {
            m68829b();
            if (this.f49671d == null) {
                this.f49671d = new ArrayList<>();
            }
            if (!this.f49671d.contains(drawable)) {
                this.f49671d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f49669a.getLocationOnScreen(iArr);
            this.f49670c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f49670c.getWidth(), this.f49670c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f49671d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f49671d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public void mo58233e(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f49671d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m68830c();
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f49669a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f49669a != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m68831d(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f49671d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f49671d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public void add(@NonNull Drawable drawable) {
        this.f49667a.mo58230a(drawable);
    }

    public void remove(@NonNull Drawable drawable) {
        this.f49667a.mo58233e(drawable);
    }
}
