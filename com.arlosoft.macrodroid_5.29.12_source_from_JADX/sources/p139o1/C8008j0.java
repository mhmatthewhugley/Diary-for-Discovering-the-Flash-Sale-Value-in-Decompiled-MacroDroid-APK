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

/* renamed from: o1.j0 */
/* compiled from: ListItemNotificationChannelBinding */
public final class C8008j0 implements ViewBinding {
    @NonNull

    /* renamed from: a */
    private final LinearLayout f19317a;
    @NonNull

    /* renamed from: b */
    public final TextView f19318b;
    @NonNull

    /* renamed from: c */
    public final LinearLayout f19319c;

    private C8008j0(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f19317a = linearLayout;
        this.f19318b = textView;
        this.f19319c = linearLayout2;
    }

    @NonNull
    /* renamed from: a */
    public static C8008j0 m33350a(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C17532R$id.channelName);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C8008j0(linearLayout, textView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C17532R$id.channelName)));
    }

    @NonNull
    /* renamed from: c */
    public static C8008j0 m33351c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_notification_channel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m33350a(inflate);
    }

    @NonNull
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f19317a;
    }
}
