package p139o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: o1.d */
/* compiled from: ActivityEditNotificationChannelsBinding */
public final class C7995d implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final FrameLayout f19238a;
    @NonNull

    /* renamed from: b */
    public final FloatingActionButton f19239b;
    @NonNull

    /* renamed from: c */
    public final TextView f19240c;
    @NonNull

    /* renamed from: d */
    public final FrameLayout f19241d;
    @NonNull

    /* renamed from: e */
    public final RecyclerView f19242e;

    private C7995d(@NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView) {
        this.f19238a = frameLayout;
        this.f19239b = floatingActionButton;
        this.f19240c = textView;
        this.f19241d = frameLayout2;
        this.f19242e = recyclerView;
    }

    @NonNull
    /* renamed from: a */
    public static C7995d m33306a(@NonNull View view) {
        int i = C17532R$id.addChannelFab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, C17532R$id.addChannelFab);
        if (floatingActionButton != null) {
            i = C17532R$id.celltowers_empty_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.celltowers_empty_text);
            if (textView != null) {
                i = C17532R$id.emptyView;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, C17532R$id.emptyView);
                if (frameLayout != null) {
                    i = 2131363593;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, 2131363593);
                    if (recyclerView != null) {
                        return new C7995d((FrameLayout) view, floatingActionButton, textView, frameLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    /* renamed from: c */
    public static C7995d m33307c(@NonNull LayoutInflater layoutInflater) {
        return m33308d(layoutInflater, (ViewGroup) null, false);
    }

    @NonNull
    /* renamed from: d */
    public static C7995d m33308d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.activity_edit_notification_channels, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33306a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f19238a;
    }
}
