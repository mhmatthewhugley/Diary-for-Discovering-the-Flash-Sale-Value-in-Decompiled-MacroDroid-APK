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

/* renamed from: o1.q0 */
/* compiled from: ViewSystemLogEntryBinding */
public final class C8022q0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19412a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f19413b;
    @NonNull

    /* renamed from: c */
    public final LinearLayout f19414c;
    @NonNull

    /* renamed from: d */
    public final TextView f19415d;
    @NonNull

    /* renamed from: e */
    public final TextView f19416e;
    @NonNull

    /* renamed from: f */
    public final TextView f19417f;
    @NonNull

    /* renamed from: g */
    public final TextView f19418g;

    private C8022q0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f19412a = linearLayout;
        this.f19413b = linearLayout2;
        this.f19414c = linearLayout3;
        this.f19415d = textView;
        this.f19416e = textView2;
        this.f19417f = textView3;
        this.f19418g = textView4;
    }

    @NonNull
    /* renamed from: a */
    public static C8022q0 m33399a(@NonNull View view) {
        int i = C17532R$id.dateHeader;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.dateHeader);
        if (linearLayout != null) {
            i = C17532R$id.dateHeaderBottom;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, C17532R$id.dateHeaderBottom);
            if (linearLayout2 != null) {
                i = C17532R$id.dateText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.dateText);
                if (textView != null) {
                    i = C17532R$id.dateTextBottom;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.dateTextBottom);
                    if (textView2 != null) {
                        i = C17532R$id.logText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.logText);
                        if (textView3 != null) {
                            i = C17532R$id.timeText;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C17532R$id.timeText);
                            if (textView4 != null) {
                                return new C8022q0((LinearLayout) view, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
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
    public static C8022q0 m33400c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.view_system_log_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33399a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19412a;
    }
}
