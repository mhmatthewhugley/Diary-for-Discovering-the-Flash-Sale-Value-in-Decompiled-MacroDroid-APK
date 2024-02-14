package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import net.cachapa.expandablelayout.ExpandableLayout;

/* renamed from: o1.b */
/* compiled from: ActivityActionBlockListBinding */
public final class C7991b implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CoordinatorLayout f19207a;
    @NonNull

    /* renamed from: b */
    public final RecyclerView f19208b;
    @NonNull

    /* renamed from: c */
    public final AppBarLayout f19209c;
    @NonNull

    /* renamed from: d */
    public final ImageView f19210d;
    @NonNull

    /* renamed from: e */
    public final FrameLayout f19211e;
    @NonNull

    /* renamed from: f */
    public final ImageView f19212f;
    @NonNull

    /* renamed from: g */
    public final FloatingActionButton f19213g;
    @NonNull

    /* renamed from: h */
    public final ConstraintLayout f19214h;
    @NonNull

    /* renamed from: i */
    public final C7998e0 f19215i;
    @NonNull

    /* renamed from: j */
    public final TextView f19216j;
    @NonNull

    /* renamed from: k */
    public final ImageView f19217k;
    @NonNull

    /* renamed from: l */
    public final ExpandableLayout f19218l;
    @NonNull

    /* renamed from: m */
    public final ProgressBar f19219m;
    @NonNull

    /* renamed from: n */
    public final NestedScrollView f19220n;
    @NonNull

    /* renamed from: o */
    public final TextView f19221o;
    @NonNull

    /* renamed from: p */
    public final Toolbar f19222p;

    private C7991b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull AppBarLayout appBarLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull FloatingActionButton floatingActionButton, @NonNull ConstraintLayout constraintLayout, @NonNull C7998e0 e0Var, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull ExpandableLayout expandableLayout, @NonNull ProgressBar progressBar, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView2, @NonNull Toolbar toolbar) {
        this.f19207a = coordinatorLayout;
        this.f19208b = recyclerView;
        this.f19209c = appBarLayout;
        this.f19210d = imageView;
        this.f19211e = frameLayout;
        this.f19212f = imageView2;
        this.f19213g = floatingActionButton;
        this.f19214h = constraintLayout;
        this.f19215i = e0Var;
        this.f19216j = textView;
        this.f19217k = imageView3;
        this.f19218l = expandableLayout;
        this.f19219m = progressBar;
        this.f19220n = nestedScrollView;
        this.f19221o = textView2;
        this.f19222p = toolbar;
    }

    @NonNull
    /* renamed from: a */
    public static C7991b m33292a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.actionBlocksList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C17532R$id.actionBlocksList);
        if (recyclerView != null) {
            i = C17532R$id.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view2, C17532R$id.appBarLayout);
            if (appBarLayout != null) {
                i = C17532R$id.dismissButton;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.dismissButton);
                if (imageView != null) {
                    i = C17532R$id.emptyView;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view2, C17532R$id.emptyView);
                    if (frameLayout != null) {
                        i = C17532R$id.empty_view;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.empty_view);
                        if (imageView2 != null) {
                            i = C17532R$id.fab;
                            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view2, C17532R$id.fab);
                            if (floatingActionButton != null) {
                                i = C17532R$id.infoBarBg;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view2, C17532R$id.infoBarBg);
                                if (constraintLayout != null) {
                                    i = C17532R$id.infoCard;
                                    View findChildViewById = ViewBindings.findChildViewById(view2, C17532R$id.infoCard);
                                    if (findChildViewById != null) {
                                        C7998e0 a = C7998e0.m33316a(findChildViewById);
                                        i = C17532R$id.macrolist_emptyLabel;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.macrolist_emptyLabel);
                                        if (textView != null) {
                                            i = C17532R$id.nearbyImage;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C17532R$id.nearbyImage);
                                            if (imageView3 != null) {
                                                i = C17532R$id.nearbySharePanel;
                                                ExpandableLayout expandableLayout = (ExpandableLayout) ViewBindings.findChildViewById(view2, C17532R$id.nearbySharePanel);
                                                if (expandableLayout != null) {
                                                    i = C17532R$id.scanningSpinner;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C17532R$id.scanningSpinner);
                                                    if (progressBar != null) {
                                                        i = 2131363679;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view2, 2131363679);
                                                        if (nestedScrollView != null) {
                                                            i = C17532R$id.shareNearbyText;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.shareNearbyText);
                                                            if (textView2 != null) {
                                                                i = 2131364057;
                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view2, 2131364057);
                                                                if (toolbar != null) {
                                                                    return new C7991b((CoordinatorLayout) view2, recyclerView, appBarLayout, imageView, frameLayout, imageView2, floatingActionButton, constraintLayout, a, textView, imageView3, expandableLayout, progressBar, nestedScrollView, textView2, toolbar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
    public static C7991b m33293c(@NonNull LayoutInflater layoutInflater) {
        return m33294d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C7991b m33294d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_action_block_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33292a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f19207a;
    }
}
