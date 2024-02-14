package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.l0 */
/* compiled from: ListItemReportReasonBinding */
public final class C8012l0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19333a;
    @NonNull

    /* renamed from: b */
    public final TextView f19334b;
    @NonNull

    /* renamed from: c */
    public final TextView f19335c;

    private C8012l0(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f19333a = linearLayout;
        this.f19334b = textView;
        this.f19335c = textView2;
    }

    @NonNull
    /* renamed from: a */
    public static C8012l0 m33364a(@NonNull View view) {
        int i = C17532R$id.reasonCount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.reasonCount);
        if (textView != null) {
            i = C17532R$id.reasonText;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.reasonText);
            if (textView2 != null) {
                return new C8012l0((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8012l0 m33365c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_report_reason, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33364a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19333a;
    }
}
