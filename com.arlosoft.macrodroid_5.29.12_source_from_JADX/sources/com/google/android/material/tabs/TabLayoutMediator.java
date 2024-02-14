package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

public final class TabLayoutMediator {
    @NonNull

    /* renamed from: a */
    private final TabLayout f50390a;
    @NonNull

    /* renamed from: b */
    private final ViewPager2 f50391b;

    /* renamed from: c */
    private final boolean f50392c;

    /* renamed from: d */
    private final boolean f50393d;

    /* renamed from: e */
    private final TabConfigurationStrategy f50394e;
    @Nullable

    /* renamed from: f */
    private RecyclerView.Adapter<?> f50395f;

    /* renamed from: g */
    private boolean f50396g;
    @Nullable

    /* renamed from: h */
    private TabLayoutOnPageChangeCallback f50397h;
    @Nullable

    /* renamed from: i */
    private TabLayout.OnTabSelectedListener f50398i;
    @Nullable

    /* renamed from: j */
    private RecyclerView.AdapterDataObserver f50399j;

    private class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        PagerAdapterObserver() {
        }

        public void onChanged() {
            TabLayoutMediator.this.mo59093b();
        }

        public void onItemRangeChanged(int i, int i2) {
            TabLayoutMediator.this.mo59093b();
        }

        public void onItemRangeInserted(int i, int i2) {
            TabLayoutMediator.this.mo59093b();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            TabLayoutMediator.this.mo59093b();
        }

        public void onItemRangeRemoved(int i, int i2) {
            TabLayoutMediator.this.mo59093b();
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            TabLayoutMediator.this.mo59093b();
        }
    }

    public interface TabConfigurationStrategy {
        /* renamed from: a */
        void mo27321a(@NonNull TabLayout.Tab tab, int i);
    }

    private static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        @NonNull

        /* renamed from: a */
        private final WeakReference<TabLayout> f50401a;

        /* renamed from: b */
        private int f50402b;

        /* renamed from: c */
        private int f50403c;

        TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.f50401a = new WeakReference<>(tabLayout);
            mo59094a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo59094a() {
            this.f50403c = 0;
            this.f50402b = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f50402b = this.f50403c;
            this.f50403c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f50401a.get();
            if (tabLayout != null) {
                int i3 = this.f50403c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f50402b == 1;
                if (!(i3 == 2 && this.f50402b == 0)) {
                    z = true;
                }
                tabLayout.mo58989J(i, f, z2, z);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.f50401a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f50403c;
                tabLayout.mo58986G(tabLayout.mo59045x(i), i2 == 0 || (i2 == 2 && this.f50402b == 0));
            }
        }
    }

    private static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {

        /* renamed from: a */
        private final ViewPager2 f50404a;

        /* renamed from: b */
        private final boolean f50405b;

        ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean z) {
            this.f50404a = viewPager2;
            this.f50405b = z;
        }

        /* renamed from: a */
        public void mo30427a(@NonNull TabLayout.Tab tab) {
            this.f50404a.setCurrentItem(tab.mo59065g(), this.f50405b);
        }

        /* renamed from: b */
        public void mo30428b(TabLayout.Tab tab) {
        }

        /* renamed from: c */
        public void mo30429c(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    /* renamed from: a */
    public void mo59092a() {
        if (!this.f50396g) {
            RecyclerView.Adapter<?> adapter = this.f50391b.getAdapter();
            this.f50395f = adapter;
            if (adapter != null) {
                this.f50396g = true;
                TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.f50390a);
                this.f50397h = tabLayoutOnPageChangeCallback;
                this.f50391b.registerOnPageChangeCallback(tabLayoutOnPageChangeCallback);
                ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.f50391b, this.f50393d);
                this.f50398i = viewPagerOnTabSelectedListener;
                this.f50390a.mo58998d(viewPagerOnTabSelectedListener);
                if (this.f50392c) {
                    PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
                    this.f50399j = pagerAdapterObserver;
                    this.f50395f.registerAdapterDataObserver(pagerAdapterObserver);
                }
                mo59093b();
                this.f50390a.mo58988I(this.f50391b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo59093b() {
        int min;
        this.f50390a.mo58983C();
        RecyclerView.Adapter<?> adapter = this.f50395f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab z = this.f50390a.mo59047z();
                this.f50394e.mo27321a(z, i);
                this.f50390a.mo59001g(z, false);
            }
            if (itemCount > 0 && (min = Math.min(this.f50391b.getCurrentItem(), this.f50390a.getTabCount() - 1)) != this.f50390a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f50390a;
                tabLayout.mo58985F(tabLayout.mo59045x(min));
            }
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this.f50390a = tabLayout;
        this.f50391b = viewPager2;
        this.f50392c = z;
        this.f50393d = z2;
        this.f50394e = tabConfigurationStrategy;
    }
}
