package agency.tango.materialintroscreen.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
import p011b.C1396a;
import p031f.C1982c;

public class SwipeableViewPager extends ViewPager {

    /* renamed from: a */
    private float f164a;

    /* renamed from: c */
    private C0047a f165c = C0047a.all;

    /* renamed from: d */
    List<C1982c> f166d = new ArrayList();

    /* renamed from: agency.tango.materialintroscreen.widgets.SwipeableViewPager$a */
    public enum C0047a {
        all,
        left,
        right,
        none
    }

    public SwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m167a(MotionEvent motionEvent) {
        C0047a aVar = this.f165c;
        if (aVar == C0047a.all) {
            return true;
        }
        if (aVar == C0047a.none) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f164a = motionEvent.getX();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            try {
                float x = motionEvent.getX() - this.f164a;
                if (x > 0.0f && this.f165c == C0047a.right) {
                    return false;
                }
                if (x >= 0.0f || this.f165c != C0047a.left) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: b */
    public SwipeableViewPager mo140b(C1982c cVar) {
        this.f166d.add(cVar);
        return this;
    }

    public int getPreviousItem() {
        return getCurrentItem() - 1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m167a(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (C1982c a : this.f166d) {
            a.mo23993a();
        }
        if (m167a(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAllowedSwipeDirection(C0047a aVar) {
        this.f165c = aVar;
    }

    public C1396a getAdapter() {
        return (C1396a) super.getAdapter();
    }
}
