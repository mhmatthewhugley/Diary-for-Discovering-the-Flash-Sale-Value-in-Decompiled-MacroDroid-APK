package agency.tango.materialintroscreen;

import agency.tango.materialintroscreen.widgets.InkPageIndicator;
import agency.tango.materialintroscreen.widgets.SwipeableViewPager;
import android.animation.ArgbEvaluator;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.Snackbar;
import p000a.C0001b;
import p000a.C0002c;
import p011b.C1396a;
import p017c.C1422b;
import p030e.C1975a;
import p030e.C1976b;
import p030e.C1977c;
import p030e.C1978d;
import p030e.C1979e;
import p031f.C1980a;
import p031f.C1981b;
import p031f.C1983d;
import p031f.C1985e;
import p031f.C1986f;
import p032g.C1987a;
import p033h.C1988a;

public abstract class MaterialIntroActivity extends AppCompatActivity {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Button f41A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public LinearLayout f42B;

    /* renamed from: C */
    private ArgbEvaluator f43C = new ArgbEvaluator();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C1422b f44D;

    /* renamed from: E */
    private C1422b f45E;

    /* renamed from: F */
    private C1422b f46F;

    /* renamed from: G */
    private C1422b f47G;

    /* renamed from: H */
    private C1422b f48H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1983d f49I;

    /* renamed from: J */
    private View.OnClickListener f50J;

    /* renamed from: K */
    private View.OnClickListener f51K;

    /* renamed from: L */
    private SparseArray<C0001b> f52L = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SwipeableViewPager f53d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public InkPageIndicator f54f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1396a f55g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ImageButton f56o;

    /* renamed from: p */
    protected ImageButton f57p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ImageButton f58s;

    /* renamed from: z */
    private CoordinatorLayout f59z;

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$a */
    class C0020a implements Runnable {
        C0020a() {
        }

        public void run() {
            if (MaterialIntroActivity.this.f55g.mo16807g() == 0) {
                MaterialIntroActivity.this.finish();
                return;
            }
            int currentItem = MaterialIntroActivity.this.f53d.getCurrentItem();
            MaterialIntroActivity.this.f49I.mo85a(currentItem);
            MaterialIntroActivity materialIntroActivity = MaterialIntroActivity.this;
            materialIntroActivity.m107d2(currentItem, materialIntroActivity.f55g.getItem(currentItem));
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$b */
    class C0021b extends Snackbar.Callback {
        C0021b() {
        }

        /* renamed from: c */
        public void mo83a(Snackbar snackbar, int i) {
            MaterialIntroActivity.this.f42B.setTranslationY(0.0f);
            super.mo83a(snackbar, i);
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$c */
    class C0022c implements C1981b {
        C0022c() {
        }

        /* renamed from: a */
        public void mo85a(int i) {
            MaterialIntroActivity materialIntroActivity = MaterialIntroActivity.this;
            materialIntroActivity.m107d2(i, materialIntroActivity.f55g.getItem(i));
            if (MaterialIntroActivity.this.f55g.mo16806f(i)) {
                MaterialIntroActivity.this.mo75e2();
                MaterialIntroActivity.this.finish();
            }
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$d */
    class C0023d implements C1980a {

        /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$d$a */
        class C0024a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f64a;

            C0024a(int i) {
                this.f64a = i;
            }

            public void run() {
                if (MaterialIntroActivity.this.f55g.getItem(this.f64a).mo11g0() || !MaterialIntroActivity.this.f55g.getItem(this.f64a).mo7Z()) {
                    MaterialIntroActivity.this.f53d.setCurrentItem(this.f64a);
                    MaterialIntroActivity.this.f54f.mo121u();
                }
            }
        }

        C0023d() {
        }

        /* renamed from: a */
        public void mo86a(int i, float f) {
            MaterialIntroActivity.this.f53d.post(new C0024a(i));
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$e */
    class C0025e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0002c f66a;

        /* renamed from: c */
        final /* synthetic */ int f67c;

        C0025e(C0002c cVar, int i) {
            this.f66a = cVar;
            this.f67c = i;
        }

        public void onClick(View view) {
            if (!this.f66a.mo7Z()) {
                MaterialIntroActivity.this.f44D.mo16881c();
                MaterialIntroActivity.this.mo77g2(this.f66a.mo8a0());
                return;
            }
            MaterialIntroActivity.this.f53d.setCurrentItem(this.f67c + 1);
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$f */
    class C0026f implements View.OnClickListener {
        C0026f() {
        }

        public void onClick(View view) {
            for (int currentItem = MaterialIntroActivity.this.f53d.getCurrentItem(); currentItem < MaterialIntroActivity.this.f55g.mo16807g(); currentItem++) {
                if (!MaterialIntroActivity.this.f55g.getItem(currentItem).mo7Z()) {
                    MaterialIntroActivity.this.f53d.setCurrentItem(currentItem);
                    MaterialIntroActivity materialIntroActivity = MaterialIntroActivity.this;
                    materialIntroActivity.mo77g2(materialIntroActivity.f55g.getItem(currentItem).mo8a0());
                    return;
                }
            }
            MaterialIntroActivity.this.f53d.setCurrentItem(MaterialIntroActivity.this.f55g.mo16804c());
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$g */
    private class C0027g implements C1980a {
        private C0027g() {
        }

        /* renamed from: b */
        private void m117b(int i, float f) {
            int intValue = MaterialIntroActivity.this.m103Z1(i, f).intValue();
            MaterialIntroActivity.this.f53d.setBackgroundColor(intValue);
            MaterialIntroActivity.this.f41A.setTextColor(intValue);
            int intValue2 = MaterialIntroActivity.this.m104a2(i, f).intValue();
            MaterialIntroActivity.this.f54f.setPageIndicatorColor(MaterialIntroActivity.this.m105b2(i, f).intValue());
            m118c(ColorStateList.valueOf(intValue2));
        }

        /* renamed from: c */
        private void m118c(ColorStateList colorStateList) {
            ViewCompat.setBackgroundTintList(MaterialIntroActivity.this.f58s, colorStateList);
            ViewCompat.setBackgroundTintList(MaterialIntroActivity.this.f56o, colorStateList);
            ViewCompat.setBackgroundTintList(MaterialIntroActivity.this.f57p, colorStateList);
            MaterialIntroActivity.this.f58s.refreshDrawableState();
            MaterialIntroActivity.this.f56o.refreshDrawableState();
            MaterialIntroActivity.this.f57p.refreshDrawableState();
        }

        /* renamed from: a */
        public void mo86a(int i, float f) {
            if (i < MaterialIntroActivity.this.f55g.getCount() - 1) {
                m117b(i, f);
            } else if (MaterialIntroActivity.this.f55g.getCount() == 1) {
                MaterialIntroActivity.this.f53d.setBackgroundColor(MaterialIntroActivity.this.f55g.getItem(i).mo1W());
                MaterialIntroActivity.this.f41A.setTextColor(MaterialIntroActivity.this.f55g.getItem(i).mo1W());
                m118c(ColorStateList.valueOf(MaterialIntroActivity.this.f55g.getItem(i).mo2X()));
            }
        }

        /* synthetic */ C0027g(MaterialIntroActivity materialIntroActivity, C0020a aVar) {
            this();
        }
    }

    /* renamed from: agency.tango.materialintroscreen.MaterialIntroActivity$h */
    private class C0028h implements View.OnClickListener {
        private C0028h() {
        }

        public void onClick(View view) {
            C0002c b = MaterialIntroActivity.this.f55g.getItem(MaterialIntroActivity.this.f55g.mo16804c());
            if (!b.mo7Z()) {
                MaterialIntroActivity.this.f44D.mo16881c();
                MaterialIntroActivity.this.mo77g2(b.mo8a0());
                return;
            }
            MaterialIntroActivity.this.mo75e2();
            MaterialIntroActivity.this.finish();
        }

        /* synthetic */ C0028h(MaterialIntroActivity materialIntroActivity, C0020a aVar) {
            this();
        }
    }

    /* renamed from: Y1 */
    private int m102Y1(@ColorRes int i) {
        return ContextCompat.getColor(this, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public Integer m103Z1(int i, float f) {
        return (Integer) this.f43C.evaluate(f, Integer.valueOf(m102Y1(this.f55g.getItem(i).mo1W())), Integer.valueOf(m102Y1(this.f55g.getItem(i + 1).mo1W())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public Integer m104a2(int i, float f) {
        return (Integer) this.f43C.evaluate(f, Integer.valueOf(m102Y1(this.f55g.getItem(i).mo2X())), Integer.valueOf(m102Y1(this.f55g.getItem(i + 1).mo2X())));
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public Integer m105b2(int i, float f) {
        return (Integer) this.f43C.evaluate(f, Integer.valueOf(m102Y1(this.f55g.getItem(i).mo9e0())), Integer.valueOf(m102Y1(this.f55g.getItem(i + 1).mo2X())));
    }

    /* renamed from: c2 */
    private void m106c2() {
        this.f49I = new C1983d(this.f41A, this.f55g, this.f52L);
        SwipeableViewPager swipeableViewPager = this.f53d;
        swipeableViewPager.mo140b(new C1985e(swipeableViewPager, this.f55g));
        this.f45E = new C1975a(this.f56o);
        this.f46F = new C1977c(this.f54f);
        this.f47G = new C1979e(this.f53d);
        this.f48H = new C1978d(this.f57p);
        this.f53d.addOnPageChangeListener(new C1986f(this.f55g).mo23997d(this.f44D).mo23997d(this.f46F).mo23997d(this.f47G).mo23995b(new C0023d()).mo23995b(new C0027g(this, (C0020a) null)).mo23995b(new C1988a(this.f55g)).mo23996c(this.f49I).mo23996c(new C0022c()));
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public void m107d2(int i, C0002c cVar) {
        if (cVar.mo11g0()) {
            this.f58s.setImageDrawable(ContextCompat.getDrawable(this, R$drawable.ic_next));
            this.f58s.setOnClickListener(this.f50J);
        } else if (this.f55g.mo16805e(i)) {
            this.f58s.setImageDrawable(ContextCompat.getDrawable(this, R$drawable.ic_finish));
            this.f58s.setOnClickListener(this.f51K);
        } else {
            this.f58s.setImageDrawable(ContextCompat.getDrawable(this, R$drawable.ic_next));
            this.f58s.setOnClickListener(new C0025e(cVar, i));
        }
    }

    /* renamed from: X1 */
    public void mo74X1(C0002c cVar) {
        this.f55g.mo16802a(cVar);
    }

    /* renamed from: e2 */
    public void mo75e2() {
    }

    /* renamed from: f2 */
    public void mo76f2() {
        this.f56o.setVisibility(8);
        this.f57p.setVisibility(0);
        this.f57p.setOnClickListener(new C0026f());
    }

    /* renamed from: g2 */
    public void mo77g2(String str) {
        Snackbar.m69560c0(this.f59z, str, -1).mo58915e0(new C0021b()).mo58859S();
    }

    /* renamed from: h2 */
    public void mo78h2() {
        mo77g2(getString(R$string.please_grant_permissions));
    }

    public void onBackPressed() {
        if (this.f53d.getCurrentItem() == 0) {
            finish();
            return;
        }
        SwipeableViewPager swipeableViewPager = this.f53d;
        swipeableViewPager.setCurrentItem(swipeableViewPager.getPreviousItem());
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_material_intro);
        this.f53d = (SwipeableViewPager) findViewById(R$id.view_pager_slides);
        this.f54f = (InkPageIndicator) findViewById(R$id.indicator);
        this.f56o = (ImageButton) findViewById(R$id.button_back);
        this.f58s = (ImageButton) findViewById(R$id.button_next);
        this.f57p = (ImageButton) findViewById(R$id.button_skip);
        this.f41A = (Button) findViewById(R$id.button_message);
        this.f59z = (CoordinatorLayout) findViewById(R$id.coordinator_layout_slide);
        this.f42B = (LinearLayout) findViewById(R$id.navigation_view);
        C1396a aVar = new C1396a(getSupportFragmentManager());
        this.f55g = aVar;
        this.f53d.setAdapter(aVar);
        this.f53d.setOffscreenPageLimit(4);
        this.f54f.setViewPager(this.f53d);
        this.f44D = new C1976b(this.f58s);
        m106c2();
        this.f50J = new C1987a(this, this.f44D);
        this.f51K = new C0028h(this, (C0020a) null);
        this.f53d.post(new C0020a());
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        C0002c b = this.f55g.getItem(this.f53d.getCurrentItem());
        if (!b.mo11g0()) {
            this.f53d.setAllowedSwipeDirection(SwipeableViewPager.C0047a.all);
            m107d2(this.f53d.getCurrentItem(), b);
            this.f49I.mo85a(this.f53d.getCurrentItem());
        } else {
            mo78h2();
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
