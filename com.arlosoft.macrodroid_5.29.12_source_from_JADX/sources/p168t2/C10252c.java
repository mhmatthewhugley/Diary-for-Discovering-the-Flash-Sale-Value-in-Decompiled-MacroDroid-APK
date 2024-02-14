package p168t2;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.C5099g;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.List;

/* renamed from: t2.c */
/* compiled from: SelectTriggerAdapter */
public class C10252c extends SelectableItemAdapter {
    public C10252c(Activity activity, Macro macro, boolean z, @NonNull C5099g gVar) {
        super(activity, macro, z, gVar, 0, false);
        refresh();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public List<C4001c1> mo30053G() {
        return Trigger.m23340W2(this.f12789s.getApplicationContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int mo30054H() {
        return C17530R$drawable.circular_icon_background_trigger;
    }
}
