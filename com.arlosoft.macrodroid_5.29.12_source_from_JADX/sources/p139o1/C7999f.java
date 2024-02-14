package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.f */
/* compiled from: ActivityKeepAccessibilityServicesRunningBinding */
public final class C7999f implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final NestedScrollView f19258a;
    @NonNull

    /* renamed from: b */
    public final RecyclerView f19259b;
    @NonNull

    /* renamed from: c */
    public final CardView f19260c;
    @NonNull

    /* renamed from: d */
    public final Button f19261d;
    @NonNull

    /* renamed from: e */
    public final C7998e0 f19262e;
    @NonNull

    /* renamed from: f */
    public final TextView f19263f;

    private C7999f(@NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull CardView cardView, @NonNull Button button, @NonNull C7998e0 e0Var, @NonNull TextView textView) {
        this.f19258a = nestedScrollView;
        this.f19259b = recyclerView;
        this.f19260c = cardView;
        this.f19261d = button;
        this.f19262e = e0Var;
        this.f19263f = textView;
    }

    @NonNull
    /* renamed from: a */
    public static C7999f m33318a(@NonNull View view) {
        int i = C17532R$id.accessibilityServiceList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.accessibilityServiceList);
        if (recyclerView != null) {
            i = C17532R$id.adbHackCard;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, C17532R$id.adbHackCard);
            if (cardView != null) {
                i = C17532R$id.adbHackOkButton;
                Button button = (Button) ViewBindings.findChildViewById(view, C17532R$id.adbHackOkButton);
                if (button != null) {
                    i = C17532R$id.infoCard;
                    View findChildViewById = ViewBindings.findChildViewById(view, C17532R$id.infoCard);
                    if (findChildViewById != null) {
                        C7998e0 a = C7998e0.m33316a(findChildViewById);
                        i = C17532R$id.infoCardTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.infoCardTitle);
                        if (textView != null) {
                            return new C7999f((NestedScrollView) view, recyclerView, cardView, button, a, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C7999f m33319c(@NonNull LayoutInflater layoutInflater) {
        return m33320d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C7999f m33320d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_keep_accessibility_services_running, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33318a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f19258a;
    }
}
