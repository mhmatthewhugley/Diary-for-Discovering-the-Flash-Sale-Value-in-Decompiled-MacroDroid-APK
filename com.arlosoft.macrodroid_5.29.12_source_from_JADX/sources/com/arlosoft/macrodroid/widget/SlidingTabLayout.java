package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.arlosoft.macrodroid.C17530R$drawable;

public class SlidingTabLayout extends HorizontalScrollView {

    /* renamed from: a */
    private final int f15385a;

    /* renamed from: c */
    private int f15386c;

    /* renamed from: d */
    private int f15387d;

    /* renamed from: f */
    private final SparseArray<TextView> f15388f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ViewPager f15389g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ViewPager.OnPageChangeListener f15390o;

    /* renamed from: p */
    private boolean f15391p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C6640g f15392s;

    /* renamed from: com.arlosoft.macrodroid.widget.SlidingTabLayout$b */
    private class C6630b implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        private int f15393a;

        private C6630b() {
        }

        public void onPageScrollStateChanged(int i) {
            this.f15393a = i;
            if (SlidingTabLayout.this.f15390o != null) {
                SlidingTabLayout.this.f15390o.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            int childCount = SlidingTabLayout.this.f15392s.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                SlidingTabLayout.this.f15392s.mo32913b(i, f);
                View childAt = SlidingTabLayout.this.f15392s.getChildAt(i);
                SlidingTabLayout.this.m25119h(i, childAt != null ? (int) (((float) childAt.getWidth()) * f) : 0);
                if (SlidingTabLayout.this.f15390o != null) {
                    SlidingTabLayout.this.f15390o.onPageScrolled(i, f, i2);
                }
            }
        }

        public void onPageSelected(int i) {
            if (this.f15393a == 0) {
                SlidingTabLayout.this.f15392s.mo32913b(i, 0.0f);
                SlidingTabLayout.this.m25119h(i, 0);
            }
            if (SlidingTabLayout.this.f15390o != null) {
                SlidingTabLayout.this.f15390o.onPageSelected(i);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.widget.SlidingTabLayout$c */
    private class C6631c implements View.OnClickListener {
        private C6631c() {
        }

        public void onClick(View view) {
            for (int i = 0; i < SlidingTabLayout.this.f15392s.getChildCount(); i++) {
                if (view == SlidingTabLayout.this.f15392s.getChildAt(i)) {
                    SlidingTabLayout.this.f15389g.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.widget.SlidingTabLayout$d */
    public interface C6632d {
        /* renamed from: a */
        int mo32894a(int i);

        /* renamed from: b */
        int mo32895b(int i);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private TextView m25116e(Context context) {
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(2, 18.0f);
        textView.setMaxLines(1);
        textView.setBackgroundResource(C17530R$drawable.tab_background);
        int i = (int) (getResources().getDisplayMetrics().density * 16.0f);
        textView.setPadding(i, i, i, i);
        return textView;
    }

    /* renamed from: f */
    private void m25117f() {
        TextView textView;
        View view;
        PagerAdapter adapter = this.f15389g.getAdapter();
        C6631c cVar = new C6631c();
        this.f15392s.removeAllViews();
        for (int i = 0; i < adapter.getCount(); i++) {
            if (this.f15386c != 0) {
                view = LayoutInflater.from(getContext()).inflate(this.f15386c, this.f15392s, false);
                textView = (TextView) view.findViewById(this.f15387d);
                if (this.f15391p) {
                    view.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                }
            } else {
                view = null;
                textView = null;
            }
            if (view == null) {
                view = m25116e(getContext());
                if (this.f15391p) {
                    view.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                }
            }
            if (textView == null && TextView.class.isInstance(view)) {
                textView = (TextView) view;
            }
            this.f15388f.put(i, textView);
            textView.setText(adapter.getPageTitle(i));
            view.setOnClickListener(cVar);
            this.f15392s.addView(view);
        }
    }

    /* renamed from: g */
    private void m25118g() {
        int childCount = this.f15392s.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f15392s.getChildAt(i);
            if (childAt != null) {
                childAt.setSelected(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m25119h(int i, int i2) {
        int childCount = this.f15392s.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            m25118g();
            View childAt = this.f15392s.getChildAt(i);
            if (childAt != null) {
                int left = childAt.getLeft() + i2;
                if (i > 0 || i2 > 0) {
                    left -= this.f15385a;
                }
                scrollTo(left, 0);
                childAt.setSelected(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f15389g;
        if (viewPager != null) {
            m25119h(viewPager.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(C6632d dVar) {
        this.f15392s.setCustomTabColorizer(dVar);
    }

    public void setDividerColors(int... iArr) {
        this.f15392s.setDividerColors(iArr);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f15390o = onPageChangeListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f15392s.setSelectedIndicatorColors(iArr);
    }

    public void setTabsEqualsWeight(boolean z) {
        this.f15391p = z;
    }

    public void setViewPager(ViewPager viewPager) {
        this.f15392s.removeAllViews();
        this.f15389g = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C6630b());
            m25117f();
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15388f = new SparseArray<>();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f15385a = (int) (getResources().getDisplayMetrics().density * 24.0f);
        C6640g gVar = new C6640g(context);
        this.f15392s = gVar;
        addView(gVar, -1, -1);
    }
}
