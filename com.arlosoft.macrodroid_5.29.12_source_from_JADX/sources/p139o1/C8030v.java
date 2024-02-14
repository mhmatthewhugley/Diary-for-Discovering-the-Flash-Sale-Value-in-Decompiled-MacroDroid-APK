package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.v */
/* compiled from: FragmentCloudBackupBinding */
public final class C8030v implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CoordinatorLayout f19473a;
    @NonNull

    /* renamed from: b */
    public final LottieAnimationView f19474b;
    @NonNull

    /* renamed from: c */
    public final LottieAnimationView f19475c;
    @NonNull

    /* renamed from: d */
    public final View f19476d;
    @NonNull

    /* renamed from: e */
    public final FrameLayout f19477e;
    @NonNull

    /* renamed from: f */
    public final FrameLayout f19478f;
    @NonNull

    /* renamed from: g */
    public final FrameLayout f19479g;
    @NonNull

    /* renamed from: h */
    public final LinearLayout f19480h;
    @NonNull

    /* renamed from: i */
    public final RecyclerView f19481i;
    @NonNull

    /* renamed from: j */
    public final Button f19482j;
    @NonNull

    /* renamed from: k */
    public final Button f19483k;
    @NonNull

    /* renamed from: l */
    public final TextView f19484l;
    @NonNull

    /* renamed from: m */
    public final ViewFlipper f19485m;

    private C8030v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull ViewFlipper viewFlipper) {
        this.f19473a = coordinatorLayout;
        this.f19474b = lottieAnimationView;
        this.f19475c = lottieAnimationView2;
        this.f19476d = view;
        this.f19477e = frameLayout;
        this.f19478f = frameLayout2;
        this.f19479g = frameLayout3;
        this.f19480h = linearLayout;
        this.f19481i = recyclerView;
        this.f19482j = button;
        this.f19483k = button2;
        this.f19484l = textView;
        this.f19485m = viewFlipper;
    }

    @NonNull
    /* renamed from: a */
    public static C8030v m33427a(@NonNull View view) {
        View view2 = view;
        int i = C17532R$id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view2, C17532R$id.animationView);
        if (lottieAnimationView != null) {
            i = C17532R$id.animationView2;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view2, C17532R$id.animationView2);
            if (lottieAnimationView2 != null) {
                i = C17532R$id.emptyState;
                View findChildViewById = ViewBindings.findChildViewById(view2, C17532R$id.emptyState);
                if (findChildViewById != null) {
                    i = C17532R$id.emptyView;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view2, C17532R$id.emptyView);
                    if (frameLayout != null) {
                        i = C17532R$id.failedDownloadView;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view2, C17532R$id.failedDownloadView);
                        if (frameLayout2 != null) {
                            i = C17532R$id.loadingView;
                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view2, C17532R$id.loadingView);
                            if (frameLayout3 != null) {
                                i = C17532R$id.nonProInfoScreen;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C17532R$id.nonProInfoScreen);
                                if (linearLayout != null) {
                                    i = C17532R$id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C17532R$id.recyclerView);
                                    if (recyclerView != null) {
                                        i = C17532R$id.retryButton;
                                        Button button = (Button) ViewBindings.findChildViewById(view2, C17532R$id.retryButton);
                                        if (button != null) {
                                            i = C17532R$id.upgradeSignInButton;
                                            Button button2 = (Button) ViewBindings.findChildViewById(view2, C17532R$id.upgradeSignInButton);
                                            if (button2 != null) {
                                                i = C17532R$id.upgradeSignInText;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C17532R$id.upgradeSignInText);
                                                if (textView != null) {
                                                    i = C17532R$id.viewFlipper;
                                                    ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view2, C17532R$id.viewFlipper);
                                                    if (viewFlipper != null) {
                                                        return new C8030v((CoordinatorLayout) view2, lottieAnimationView, lottieAnimationView2, findChildViewById, frameLayout, frameLayout2, frameLayout3, linearLayout, recyclerView, button, button2, textView, viewFlipper);
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
    public static C8030v m33428c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_cloud_backup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33427a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f19473a;
    }
}
