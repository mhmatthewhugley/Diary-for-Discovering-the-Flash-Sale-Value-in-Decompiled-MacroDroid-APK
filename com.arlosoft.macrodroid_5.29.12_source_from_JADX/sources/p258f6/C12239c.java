package p258f6;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import p237d6.C11961g;
import p237d6.C11962h;

/* renamed from: f6.c */
/* compiled from: WrappedAdapterUtils */
public class C12239c {
    /* renamed from: a */
    public static boolean m82902a(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof C11961g) {
            return ((C11961g) adapter).mo67365m(viewHolder, i);
        }
        return adapter.onFailedToRecycleView(viewHolder);
    }

    /* renamed from: b */
    public static void m82903b(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof C11961g) {
            ((C11961g) adapter).mo67369y(viewHolder, i);
        } else {
            adapter.onViewAttachedToWindow(viewHolder);
        }
    }

    /* renamed from: c */
    public static void m82904c(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof C11961g) {
            ((C11961g) adapter).mo67368t(viewHolder, i);
        } else {
            adapter.onViewDetachedFromWindow(viewHolder);
        }
    }

    /* renamed from: d */
    public static void m82905d(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof C11962h) {
            ((C11962h) adapter).mo67364j(viewHolder, i);
        } else {
            adapter.onViewRecycled(viewHolder);
        }
    }
}
