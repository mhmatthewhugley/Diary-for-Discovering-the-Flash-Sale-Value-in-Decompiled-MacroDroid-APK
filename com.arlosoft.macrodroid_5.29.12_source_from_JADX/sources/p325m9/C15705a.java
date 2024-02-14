package p325m9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p296j9.C13311b;

/* renamed from: m9.a */
/* compiled from: LayoutUtils */
public final class C15705a {
    @NonNull
    /* renamed from: a */
    public static String m94970a(@Nullable Object obj) {
        return obj == null ? "null" : obj.getClass().getSimpleName();
    }

    @NonNull
    /* renamed from: b */
    public static String m94971b(int i) {
        return i != 1 ? i != 2 ? "IDLE" : "MULTI" : "SINGLE";
    }

    /* renamed from: c */
    public static int m94972c(RecyclerView recyclerView) {
        return new C13311b(recyclerView).getOrientation();
    }
}
