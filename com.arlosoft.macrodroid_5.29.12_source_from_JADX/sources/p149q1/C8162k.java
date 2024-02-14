package p149q1;

import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;

/* renamed from: q1.k */
/* compiled from: DrawerItemVariable */
public class C8162k extends C8153b implements C8163l {
    public static final String ITEM_TYPE = "Variable";
    private DictionaryKeys dictionaryKeys;
    private boolean hideVariableName;
    private String variableName;

    public C8162k() {
        super(ITEM_TYPE);
    }

    @Nullable
    public DictionaryKeys getDictionaryKeys() {
        return this.dictionaryKeys;
    }

    public boolean getHideName() {
        return this.hideVariableName;
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_variable;
    }

    public String getName() {
        if (isValid()) {
            return getVariableName() + C6520o0.m24912e0(this.dictionaryKeys);
        }
        return "<" + MacroDroidApplication.m14845u().getString(C17541R$string.variable_does_not_exit) + ">";
    }

    public String getVariableName() {
        return this.variableName;
    }

    public boolean isValid() {
        return C4064u.m16048t().mo27996w(this.variableName) != null;
    }

    public void setHideVariableName(boolean z) {
        this.hideVariableName = z;
    }

    public void setVariableName(String str) {
        this.variableName = str;
    }

    public C8162k(String str, @Nullable DictionaryKeys dictionaryKeys2) {
        super(ITEM_TYPE);
        this.variableName = str;
        this.dictionaryKeys = dictionaryKeys2;
        this.hideVariableName = true;
    }
}
