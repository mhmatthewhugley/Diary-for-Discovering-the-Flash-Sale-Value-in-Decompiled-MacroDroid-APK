package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import org.apmem.tools.layouts.FlowLayout;

/* renamed from: o1.p0 */
/* compiled from: ViewActionBlockListItemBinding */
public final class C8020p0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final CardView f19397a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19398b;
    @NonNull

    /* renamed from: c */
    public final TextView f19399c;
    @NonNull

    /* renamed from: d */
    public final TextView f19400d;
    @NonNull

    /* renamed from: e */
    public final View f19401e;
    @NonNull

    /* renamed from: f */
    public final TextView f19402f;
    @NonNull

    /* renamed from: g */
    public final View f19403g;
    @NonNull

    /* renamed from: h */
    public final LinearLayout f19404h;
    @NonNull

    /* renamed from: i */
    public final TextView f19405i;
    @NonNull

    /* renamed from: j */
    public final FlowLayout f19406j;

    private C8020p0(@NonNull CardView cardView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull TextView textView3, @NonNull View view2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull FlowLayout flowLayout) {
        this.f19397a = cardView;
        this.f19398b = linearLayout;
        this.f19399c = textView;
        this.f19400d = textView2;
        this.f19401e = view;
        this.f19402f = textView3;
        this.f19403g = view2;
        this.f19404h = linearLayout2;
        this.f19405i = textView4;
        this.f19406j = flowLayout;
    }

    @NonNull
    /* renamed from: a */
    public static C8020p0 m33392a(@NonNull View view) {
        int i = C17532R$id.actionBlockContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.actionBlockContainer);
        if (linearLayout != null) {
            i = C17532R$id.actionsList;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.actionsList);
            if (textView != null) {
                i = C17532R$id.actions_one_char;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.actions_one_char);
                if (textView2 != null) {
                    i = C17532R$id.bottomSpace;
                    View findChildViewById = ViewBindings.findChildViewById(view, C17532R$id.bottomSpace);
                    if (findChildViewById != null) {
                        i = 2131362469;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, 2131362469);
                        if (textView3 != null) {
                            i = C17532R$id.divider_line;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, C17532R$id.divider_line);
                            if (findChildViewById2 != null) {
                                i = C17532R$id.macroActionsContainer;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.macroActionsContainer);
                                if (linearLayout2 != null) {
                                    i = 2131363335;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, 2131363335);
                                    if (textView4 != null) {
                                        i = C17532R$id.usedInList;
                                        FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, C17532R$id.usedInList);
                                        if (flowLayout != null) {
                                            return new C8020p0((CardView) view, linearLayout, textView, textView2, findChildViewById, textView3, findChildViewById2, linearLayout2, textView4, flowLayout);
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
    public static C8020p0 m33393c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.view_action_block_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33392a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public CardView getRoot() {
        return this.f19397a;
    }
}
