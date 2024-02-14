package p031f;

import agency.tango.materialintroscreen.widgets.SwipeableViewPager;
import p000a.C0002c;
import p011b.C1396a;

/* renamed from: f.e */
/* compiled from: SwipeStateTouchListener */
public class C1985e implements C1982c {

    /* renamed from: a */
    private final SwipeableViewPager f6061a;

    /* renamed from: b */
    private final C1396a f6062b;

    public C1985e(SwipeableViewPager swipeableViewPager, C1396a aVar) {
        this.f6061a = swipeableViewPager;
        this.f6062b = aVar;
    }

    /* renamed from: a */
    public void mo23993a() {
        C0002c b = this.f6062b.getItem(this.f6061a.getCurrentItem());
        if (!b.mo7Z() || b.mo11g0()) {
            this.f6061a.setAllowedSwipeDirection(SwipeableViewPager.C0047a.left);
        } else {
            this.f6061a.setAllowedSwipeDirection(SwipeableViewPager.C0047a.all);
        }
    }
}
