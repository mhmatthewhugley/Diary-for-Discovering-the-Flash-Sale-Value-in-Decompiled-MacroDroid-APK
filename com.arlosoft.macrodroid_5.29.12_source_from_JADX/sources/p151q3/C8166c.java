package p151q3;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.SwipeTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.swipe.OverlayService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: q3.c */
/* compiled from: SwipeTriggerView */
public class C8166c extends C8165b {

    /* renamed from: f */
    private int f19794f;

    /* renamed from: g */
    private int f19795g;

    /* renamed from: o */
    private final int f19796o;

    /* renamed from: p */
    private final int f19797p;

    public C8166c(OverlayService overlayService, int i) {
        super(overlayService, C17535R$layout.overlay, 1, i);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f19796o = displayMetrics.widthPixels;
        this.f19797p = displayMetrics.heightPixels;
    }

    /* renamed from: o */
    private void m33901o(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof SwipeTrigger) {
                    SwipeTrigger swipeTrigger = (SwipeTrigger) next2;
                    if (swipeTrigger.mo31530p3() == i && swipeTrigger.mo31529m3() == i2 && next2.mo31374R2()) {
                        next.setTriggerThatInvoked(next2);
                        if (next.canInvoke(next.getTriggerContextInfo())) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* renamed from: h */
    public boolean mo38218h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo38219i(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo38220j(MotionEvent motionEvent) {
        this.f19794f = (int) motionEvent.getX();
        this.f19795g = (int) motionEvent.getY();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo38221k(MotionEvent motionEvent) {
        int x = ((int) motionEvent.getX()) - this.f19794f;
        int y = ((int) motionEvent.getY()) - this.f19795g;
        int i = this.f19793d;
        if (i == 0) {
            int i2 = this.f19796o;
            if (x > i2 / 2) {
                if (y > this.f19797p / 4) {
                    m33901o(0, 1);
                } else {
                    m33901o(0, 0);
                }
            } else if (x < i2 / 8 && y > this.f19797p / 4) {
                m33901o(0, 2);
            }
        } else if (i == 1) {
            int i3 = this.f19796o;
            if (x < (-(i3 / 2))) {
                if (y > this.f19797p / 4) {
                    m33901o(1, 1);
                } else {
                    m33901o(1, 0);
                }
            } else if (x < i3 / 8 && y > this.f19797p / 4) {
                m33901o(1, 2);
            }
        }
    }
}
