package p087f2;

import com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroLogFilterActivity;
import com.arlosoft.macrodroid.macro.Macro;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: f2.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12226j implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Collator f58717a;

    public /* synthetic */ C12226j(Collator collator) {
        this.f58717a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return MacroLogFilterActivity.m18938v2(this.f58717a, (Macro) obj, (Macro) obj2);
    }
}
