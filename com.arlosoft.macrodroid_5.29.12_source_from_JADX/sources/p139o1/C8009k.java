package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: o1.k */
/* compiled from: ActivityMySubscriptionsBinding */
public final class C8009k implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19320a;
    @NonNull

    /* renamed from: b */
    public final AppBarLayout f19321b;
    @NonNull

    /* renamed from: c */
    public final FrameLayout f19322c;
    @NonNull

    /* renamed from: d */
    public final TabLayout f19323d;
    @NonNull

    /* renamed from: e */
    public final Toolbar f19324e;
    @NonNull

    /* renamed from: f */
    public final ViewPager2 f19325f;

    private C8009k(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout2, @NonNull TabLayout tabLayout, @NonNull Toolbar toolbar, @NonNull ViewPager2 viewPager2) {
        this.f19320a = frameLayout;
        this.f19321b = appBarLayout;
        this.f19322c = frameLayout2;
        this.f19323d = tabLayout;
        this.f19324e = toolbar;
        this.f19325f = viewPager2;
    }

    @NonNull
    /* renamed from: a */
    public static C8009k m33353a(@NonNull View view) {
        int i = C17532R$id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, C17532R$id.appBarLayout);
        if (appBarLayout != null) {
            i = C17532R$id.loadingView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.loadingView);
            if (frameLayout != null) {
                i = C17532R$id.tabLayout;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, C17532R$id.tabLayout);
                if (tabLayout != null) {
                    i = 2131364057;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                    if (toolbar != null) {
                        i = C17532R$id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, C17532R$id.viewPager);
                        if (viewPager2 != null) {
                            return new C8009k((FrameLayout) view, appBarLayout, frameLayout, tabLayout, toolbar, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8009k m33354c(@NonNull LayoutInflater layoutInflater) {
        return m33355d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8009k m33355d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_my_subscriptions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33353a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19320a;
    }
}
