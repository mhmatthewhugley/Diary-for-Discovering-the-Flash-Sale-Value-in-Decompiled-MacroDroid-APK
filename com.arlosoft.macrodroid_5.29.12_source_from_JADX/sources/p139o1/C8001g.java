package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: o1.g */
/* compiled from: ActivityLogcatMessageSelectBinding */
public final class C8001g implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19269a;
    @NonNull

    /* renamed from: b */
    public final RecyclerView f19270b;

    private C8001g(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f19269a = linearLayout;
        this.f19270b = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C8001g m33325a(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C17532R$id.recyclerView);
        if (recyclerView != null) {
            return new C8001g((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C17532R$id.recyclerView)));
    }

    @NonNull
    /* renamed from: c */
    public static C8001g m33326c(@NonNull LayoutInflater layoutInflater) {
        return m33327d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C8001g m33327d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_logcat_message_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33325a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19269a;
    }
}
