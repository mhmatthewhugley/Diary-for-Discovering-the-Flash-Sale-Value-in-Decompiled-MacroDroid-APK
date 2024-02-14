package p151q3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.swipe.OverlayService;
import com.arlosoft.macrodroid.utils.C6363a1;
import p319lc.C15626c;

/* renamed from: q3.b */
/* compiled from: OverlayView */
public abstract class C8165b extends RelativeLayout {

    /* renamed from: a */
    private WindowManager.LayoutParams f19791a;

    /* renamed from: c */
    private final int f19792c;

    /* renamed from: d */
    int f19793d;

    public C8165b(OverlayService overlayService, int i, int i2, int i3) {
        super(overlayService);
        this.f19793d = i3;
        this.f19792c = i;
        setLongClickable(true);
        setOnLongClickListener(new C16216a(this));
        m33892g();
    }

    /* renamed from: b */
    private void m33888b() {
        m33895n();
        try {
            ((WindowManager) getContext().getSystemService("window")).addView(this, this.f19791a);
        } catch (SecurityException unused) {
            C4878b.m18868g("Screen Swipe Overlay failed: requires SYSTEM_ALERT_WINDOW permission");
            Context applicationContext = getContext().getApplicationContext();
            C15626c.m94876a(applicationContext, getContext().getString(C17541R$string.trigger_swipe) + " " + getContext().getString(C17541R$string.action_failed_requires_permission), 0).show();
        } catch (WindowManager.BadTokenException e) {
            C4878b.m18868g("Screen Swipe Overlay failed: " + e);
        }
        super.setVisibility(8);
    }

    /* renamed from: d */
    private void m33889d() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.f19792c, this);
    }

    /* renamed from: e */
    private boolean m33890e() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ boolean m33891f(View view) {
        return mo38218h();
    }

    /* renamed from: g */
    private void m33892g() {
        m33889d();
        m33888b();
        m33894m();
    }

    private int getLayoutGravity() {
        int i = this.f19793d;
        if (i == 0) {
            return 8388659;
        }
        return i == 1 ? 8388661 : 0;
    }

    /* renamed from: l */
    private boolean m33893l(int i) {
        return true;
    }

    /* renamed from: m */
    private void m33894m() {
        if (!m33890e()) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    /* renamed from: n */
    private void m33895n() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, C6363a1.m24607a(), 786472, -3);
        this.f19791a = layoutParams;
        layoutParams.gravity = getLayoutGravity();
    }

    /* renamed from: c */
    public void mo38216c() {
        try {
            ((WindowManager) getContext().getSystemService("window")).removeView(this);
        } catch (SecurityException unused) {
            C4878b.m18868g("Screen Swipe Overlay failed: requires SYSTEM_ALERT_WINDOW permission");
            Context applicationContext = getContext().getApplicationContext();
            C15626c.m94876a(applicationContext, getContext().getString(C17541R$string.trigger_swipe) + " " + getContext().getString(C17541R$string.action_failed_requires_permission), 0).show();
        }
    }

    public OverlayService getService() {
        return (OverlayService) getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo38218h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo38219i(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo38220j(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo38221k(MotionEvent motionEvent) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mo38220j(motionEvent);
        } else if (motionEvent.getActionMasked() == 1) {
            mo38221k(motionEvent);
        } else if (motionEvent.getActionMasked() == 2) {
            mo38219i(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setVisibility(int i) {
        if (getVisibility() != i && m33893l(i)) {
            super.setVisibility(i);
        }
    }
}
