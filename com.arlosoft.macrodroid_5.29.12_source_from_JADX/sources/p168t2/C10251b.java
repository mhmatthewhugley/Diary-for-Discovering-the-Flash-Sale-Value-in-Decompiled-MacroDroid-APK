package p168t2;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.C5099g;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import java.util.List;

/* renamed from: t2.b */
/* compiled from: SelectConstraintAdapter */
public class C10251b extends SelectableItemAdapter {
    public C10251b(Activity activity, Macro macro, boolean z, @NonNull C5099g gVar) {
        super(activity, macro, z, gVar, 2, false);
        refresh();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public List<C4001c1> mo30053G() {
        return Constraint.m16348X2(this.f12789s.getApplicationContext(), this.f12788p, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int mo30054H() {
        return C17530R$drawable.circular_icon_background_constraint;
    }
}
