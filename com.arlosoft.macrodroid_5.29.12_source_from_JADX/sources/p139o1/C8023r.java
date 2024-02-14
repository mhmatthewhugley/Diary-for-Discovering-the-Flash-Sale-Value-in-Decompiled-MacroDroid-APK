package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: o1.r */
/* compiled from: ActivityVideosBinding */
public final class C8023r implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CoordinatorLayout f19419a;
    @NonNull

    /* renamed from: b */
    public final AppBarLayout f19420b;
    @NonNull

    /* renamed from: c */
    public final FrameLayout f19421c;
    @NonNull

    /* renamed from: d */
    public final FrameLayout f19422d;
    @NonNull

    /* renamed from: e */
    public final AppCompatButton f19423e;
    @NonNull

    /* renamed from: f */
    public final Toolbar f19424f;
    @NonNull

    /* renamed from: g */
    public final RecyclerView f19425g;

    private C8023r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AppCompatButton appCompatButton, @NonNull Toolbar toolbar, @NonNull RecyclerView recyclerView) {
        this.f19419a = coordinatorLayout;
        this.f19420b = appBarLayout;
        this.f19421c = frameLayout;
        this.f19422d = frameLayout2;
        this.f19423e = appCompatButton;
        this.f19424f = toolbar;
        this.f19425g = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C8023r m33402a(@NonNull View view) {
        int i = C17532R$id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, C17532R$id.appBarLayout);
        if (appBarLayout != null) {
            i = C17532R$id.errorView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.errorView);
            if (frameLayout != null) {
                i = C17532R$id.loadingView;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.loadingView);
                if (frameLayout2 != null) {
                    i = C17532R$id.retryButton;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, C17532R$id.retryButton);
                    if (appCompatButton != null) {
                        i = 2131364057;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                        if (toolbar != null) {
                            i = C17532R$id.videoEntries;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.videoEntries);
                            if (recyclerView != null) {
                                return new C8023r((CoordinatorLayout) view, appBarLayout, frameLayout, frameLayout2, appCompatButton, toolbar, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8023r m33403c(@NonNull LayoutInflater layoutInflater) {
        return m33404d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8023r m33404d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_videos, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33402a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f19419a;
    }
}
