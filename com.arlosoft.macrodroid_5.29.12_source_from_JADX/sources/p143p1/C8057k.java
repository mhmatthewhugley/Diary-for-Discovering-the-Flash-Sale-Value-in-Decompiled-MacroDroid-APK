package p143p1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.drawer.p069ui.C4481a;
import com.arlosoft.macrodroid.drawer.p069ui.C4490d;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerActionBlockViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerAppShortcutViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerLogViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerMacroViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerOpenShortcutViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerSeparatorViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerStopWatchViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerTextViewHolder;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerVariableViewHolder;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.List;
import p149q1.C8153b;

/* renamed from: p1.k */
/* compiled from: MacroDroidDrawerAdapter */
public class C8057k extends RecyclerView.Adapter<C4490d> {

    /* renamed from: a */
    private List<C8153b> f19649a;

    /* renamed from: b */
    private C4481a f19650b;

    /* renamed from: c */
    private MacroDroidRoomDatabase f19651c;

    /* renamed from: d */
    private boolean f19652d;

    public C8057k(@NonNull Context context, MacroDroidRoomDatabase macroDroidRoomDatabase, List<C8153b> list, C4481a aVar) {
        this.f19649a = list;
        this.f19650b = aVar;
        this.f19651c = macroDroidRoomDatabase;
    }

    /* renamed from: D */
    public static C4490d m33603D(MacroDroidRoomDatabase macroDroidRoomDatabase, ViewGroup viewGroup, int i, C4481a aVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        int N = C5163j2.m20019N(viewGroup.getContext());
        switch (i) {
            case C17535R$layout.drawer_item_action_block:
                return new DrawerActionBlockViewHolder(inflate, aVar, N);
            case C17535R$layout.drawer_item_app_shortcut:
                return new DrawerAppShortcutViewHolder(inflate, aVar, N);
            case C17535R$layout.drawer_item_log:
                return new DrawerLogViewHolder(macroDroidRoomDatabase, inflate, aVar, N);
            case C17535R$layout.drawer_item_macro:
                return new DrawerMacroViewHolder(inflate, aVar, N);
            case C17535R$layout.drawer_item_open_shortcut:
                return new DrawerOpenShortcutViewHolder(inflate, aVar, N);
            case C17535R$layout.drawer_item_seperator:
                return new DrawerSeparatorViewHolder(inflate, aVar);
            case C17535R$layout.drawer_item_stopwatch:
                return new DrawerStopWatchViewHolder(inflate, aVar, N);
            case C17535R$layout.drawer_item_text:
                return new DrawerTextViewHolder(inflate, aVar, N);
            case C17535R$layout.drawer_item_variable:
                return new DrawerVariableViewHolder(inflate, aVar, N);
            default:
                return null;
        }
    }

    /* renamed from: B */
    public List<C8153b> mo38063B() {
        return this.f19649a;
    }

    /* renamed from: C */
    public boolean mo38064C() {
        return this.f19652d;
    }

    /* renamed from: E */
    public void onBindViewHolder(C4490d dVar, int i) {
        dVar.mo28843D(this.f19649a.get(i), this.f19652d);
    }

    /* renamed from: F */
    public void onBindViewHolder(C4490d dVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(dVar, i);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof C8058l) {
                dVar.mo28847E();
                return;
            }
        }
    }

    /* renamed from: G */
    public C4490d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m33603D(this.f19651c, viewGroup, i, this.f19650b);
    }

    /* renamed from: H */
    public void onViewRecycled(C4490d dVar) {
        dVar.mo28892K();
    }

    /* renamed from: I */
    public void mo38069I(boolean z) {
        this.f19652d = z;
        notifyDataSetChanged();
    }

    /* renamed from: J */
    public void mo38070J(List<C8153b> list) {
        this.f19649a = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f19649a.size();
    }

    public long getItemId(int i) {
        this.f19649a.get(i).getGuid();
        return this.f19649a.get(i).getGuid();
    }

    public int getItemViewType(int i) {
        return this.f19649a.get(i).getLayoutResId();
    }
}
