package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: o1.y */
/* compiled from: FragmentHttpRequestParamListBinding */
public final class C8033y implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CoordinatorLayout f19520a;
    @NonNull

    /* renamed from: b */
    public final FloatingActionButton f19521b;
    @NonNull

    /* renamed from: c */
    public final CoordinatorLayout f19522c;
    @NonNull

    /* renamed from: d */
    public final TextView f19523d;
    @NonNull

    /* renamed from: e */
    public final RecyclerView f19524e;

    private C8033y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull TextView textView, @NonNull RecyclerView recyclerView) {
        this.f19520a = coordinatorLayout;
        this.f19521b = floatingActionButton;
        this.f19522c = coordinatorLayout2;
        this.f19523d = textView;
        this.f19524e = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C8033y m33435a(@NonNull View view) {
        int i = C17532R$id.addParamButton;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, C17532R$id.addParamButton);
        if (floatingActionButton != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = C17532R$id.emptyView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
            if (textView != null) {
                i = C17532R$id.paramsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.paramsRecyclerView);
                if (recyclerView != null) {
                    return new C8033y(coordinatorLayout, floatingActionButton, coordinatorLayout, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8033y m33436c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_http_request_param_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33435a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f19520a;
    }
}
