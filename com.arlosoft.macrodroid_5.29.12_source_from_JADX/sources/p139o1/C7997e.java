package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: o1.e */
/* compiled from: ActivityHttpRequestConfigBinding */
public final class C7997e implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19247a;
    @NonNull

    /* renamed from: b */
    public final AppBarLayout f19248b;
    @NonNull

    /* renamed from: c */
    public final TabLayout f19249c;
    @NonNull

    /* renamed from: d */
    public final Toolbar f19250d;
    @NonNull

    /* renamed from: e */
    public final ViewPager f19251e;

    private C7997e(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TabLayout tabLayout, @NonNull Toolbar toolbar, @NonNull ViewPager viewPager) {
        this.f19247a = linearLayout;
        this.f19248b = appBarLayout;
        this.f19249c = tabLayout;
        this.f19250d = toolbar;
        this.f19251e = viewPager;
    }

    @NonNull
    /* renamed from: a */
    public static C7997e m33312a(@NonNull View view) {
        int i = C17532R$id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, C17532R$id.appBarLayout);
        if (appBarLayout != null) {
            i = C17532R$id.tabBar;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, C17532R$id.tabBar);
            if (tabLayout != null) {
                i = 2131364057;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                if (toolbar != null) {
                    i = C17532R$id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, C17532R$id.viewPager);
                    if (viewPager != null) {
                        return new C7997e((LinearLayout) view, appBarLayout, tabLayout, toolbar, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C7997e m33313c(@NonNull LayoutInflater layoutInflater) {
        return m33314d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C7997e m33314d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_http_request_config, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33312a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19247a;
    }
}
