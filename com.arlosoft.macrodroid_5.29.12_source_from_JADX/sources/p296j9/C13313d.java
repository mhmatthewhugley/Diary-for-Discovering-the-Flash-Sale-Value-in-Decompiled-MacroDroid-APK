package p296j9;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j9.d */
/* compiled from: TopSnappedSmoothScroller */
public class C13313d extends LinearSmoothScroller {

    /* renamed from: c */
    public static float f61312c = 100.0f;

    /* renamed from: a */
    private PointF f61313a = new PointF(0.0f, 0.0f);

    /* renamed from: b */
    private C13312c f61314b;

    public C13313d(Context context, RecyclerView.LayoutManager layoutManager) {
        super(context);
        this.f61314b = new C13311b(layoutManager);
    }

    /* access modifiers changed from: protected */
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return f61312c / ((float) displayMetrics.densityDpi);
    }

    public PointF computeScrollVectorForPosition(int i) {
        int i2 = i < this.f61314b.findFirstCompletelyVisibleItemPosition() ? -1 : 1;
        if (this.f61314b.getOrientation() == 0) {
            this.f61313a.set((float) i2, 0.0f);
            return this.f61313a;
        }
        this.f61313a.set(0.0f, (float) i2);
        return this.f61313a;
    }

    /* access modifiers changed from: protected */
    public int getVerticalSnapPreference() {
        return -1;
    }
}
