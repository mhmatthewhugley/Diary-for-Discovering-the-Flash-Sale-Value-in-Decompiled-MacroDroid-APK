package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;

/* renamed from: q1.j */
/* compiled from: DrawerItemText */
public class C8161j extends C8153b {
    public static final String ITEM_TYPE = "Text";
    private boolean enforceConstraints = false;
    private long macroGuid;
    private String text;

    public C8161j(String str, long j) {
        super(ITEM_TYPE);
        this.text = str;
        this.macroGuid = j;
    }

    public boolean getEnforceConstraints() {
        return this.enforceConstraints;
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_text;
    }

    public long getMacroGuid() {
        return this.macroGuid;
    }

    public String getName() {
        return this.text;
    }

    public String getText() {
        return this.text;
    }

    public void setEnforceConstraints(boolean z) {
        this.enforceConstraints = z;
    }

    public void setMacroGuid(long j) {
        this.macroGuid = j;
    }

    public void setText(String str) {
        this.text = str;
    }

    public C8161j() {
        super(ITEM_TYPE);
    }
}
