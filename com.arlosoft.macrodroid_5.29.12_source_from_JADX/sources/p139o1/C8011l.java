package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.l */
/* compiled from: ActivityReportsSummaryBinding */
public final class C8011l implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19328a;
    @NonNull

    /* renamed from: b */
    public final Button f19329b;
    @NonNull

    /* renamed from: c */
    public final RecyclerView f19330c;
    @NonNull

    /* renamed from: d */
    public final Button f19331d;
    @NonNull

    /* renamed from: e */
    public final Toolbar f19332e;

    private C8011l(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull RecyclerView recyclerView, @NonNull Button button2, @NonNull Toolbar toolbar) {
        this.f19328a = linearLayout;
        this.f19329b = button;
        this.f19330c = recyclerView;
        this.f19331d = button2;
        this.f19332e = toolbar;
    }

    @NonNull
    /* renamed from: a */
    public static C8011l m33360a(@NonNull View view) {
        int i = C17532R$id.clearReportsButton;
        Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.clearReportsButton);
        if (button != null) {
            i = C17532R$id.commentsRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.commentsRecyclerView);
            if (recyclerView != null) {
                i = C17532R$id.deleteMacroButton;
                Button button2 = (Button) ViewBindings.findChildViewById(view, C17532R$id.deleteMacroButton);
                if (button2 != null) {
                    i = 2131364057;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, 2131364057);
                    if (toolbar != null) {
                        return new C8011l((LinearLayout) view, button, recyclerView, button2, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8011l m33361c(@NonNull LayoutInflater layoutInflater) {
        return m33362d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8011l m33362d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_reports_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33360a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19328a;
    }
}
