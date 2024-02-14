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

/* renamed from: o1.m0 */
/* compiled from: ListItemReportSummaryBinding */
public final class C8014m0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19353a;
    @NonNull

    /* renamed from: b */
    public final TextView f19354b;
    @NonNull

    /* renamed from: c */
    public final TextView f19355c;
    @NonNull

    /* renamed from: d */
    public final TextView f19356d;

    private C8014m0(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19353a = linearLayout;
        this.f19354b = textView;
        this.f19355c = textView2;
        this.f19356d = textView3;
    }

    @NonNull
    /* renamed from: a */
    public static C8014m0 m33371a(@NonNull View view) {
        int i = C17532R$id.reportCount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.reportCount);
        if (textView != null) {
            i = C17532R$id.starCount;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.starCount);
            if (textView2 != null) {
                i = C17532R$id.starPerReportRatio;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.starPerReportRatio);
                if (textView3 != null) {
                    return new C8014m0((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C8014m0 m33372c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_report_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33371a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19353a;
    }
}
