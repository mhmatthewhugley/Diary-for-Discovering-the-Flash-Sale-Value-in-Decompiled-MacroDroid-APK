package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.a0 */
/* compiled from: FragmentLocalBackupBinding */
public final class C7990a0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CoordinatorLayout f19201a;
    @NonNull

    /* renamed from: b */
    public final LottieAnimationView f19202b;
    @NonNull

    /* renamed from: c */
    public final FrameLayout f19203c;
    @NonNull

    /* renamed from: d */
    public final C7998e0 f19204d;
    @NonNull

    /* renamed from: e */
    public final FrameLayout f19205e;
    @NonNull

    /* renamed from: f */
    public final RecyclerView f19206f;

    private C7990a0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull FrameLayout frameLayout, @NonNull C7998e0 e0Var, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView) {
        this.f19201a = coordinatorLayout;
        this.f19202b = lottieAnimationView;
        this.f19203c = frameLayout;
        this.f19204d = e0Var;
        this.f19205e = frameLayout2;
        this.f19206f = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C7990a0 m33289a(@NonNull View view) {
        int i = C17532R$id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, C17532R$id.animationView);
        if (lottieAnimationView != null) {
            i = C17532R$id.emptyView;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
            if (frameLayout != null) {
                i = C17532R$id.infoCard;
                View findChildViewById = ViewBindings.findChildViewById(view, C17532R$id.infoCard);
                if (findChildViewById != null) {
                    C7998e0 a = C7998e0.m33316a(findChildViewById);
                    i = C17532R$id.loadingView;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.loadingView);
                    if (frameLayout2 != null) {
                        i = C17532R$id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.recyclerView);
                        if (recyclerView != null) {
                            return new C7990a0((CoordinatorLayout) view, lottieAnimationView, frameLayout, a, frameLayout2, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C7990a0 m33290c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_local_backup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33289a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f19201a;
    }
}
