package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: q1.f */
/* compiled from: DrawerItemMacro */
public class C8157f extends C8153b {
    public static final String ITEM_TYPE = "Macro";
    private boolean enforceConstraints = false;
    private long macroGuid;

    public C8157f() {
        super(ITEM_TYPE);
    }

    public boolean getEnforceConstraints() {
        return this.enforceConstraints;
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_macro;
    }

    public long getMacroGuid() {
        return this.macroGuid;
    }

    public String getName() {
        Macro Q = C4934n.m18998M().mo29682Q(this.macroGuid);
        if (Q != null) {
            return Q.getName();
        }
        return "<" + MacroDroidApplication.m14845u().getString(C17541R$string.macro_not_found) + ">";
    }

    public boolean isValid() {
        return C4934n.m18998M().mo29682Q(this.macroGuid) != null;
    }

    public void setEnforceConstraints(boolean z) {
        this.enforceConstraints = z;
    }

    public C8157f(long j) {
        super(ITEM_TYPE);
        this.macroGuid = j;
    }
}
