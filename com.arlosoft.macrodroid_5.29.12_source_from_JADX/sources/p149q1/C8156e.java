package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;

/* renamed from: q1.e */
/* compiled from: DrawerItemLog */
public class C8156e extends C8153b implements C8163l {
    public static final String ITEM_TYPE = "Log";
    private boolean isUserLog;
    private int maxLines;

    public C8156e(boolean z, int i) {
        super(ITEM_TYPE);
        this.isUserLog = z;
        this.maxLines = i;
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_log;
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public String getName() {
        int i;
        MacroDroidApplication macroDroidApplication;
        if (this.isUserLog) {
            macroDroidApplication = MacroDroidApplication.m14845u();
            i = C17541R$string.user_log;
        } else {
            macroDroidApplication = MacroDroidApplication.m14845u();
            i = C17541R$string.system_log;
        }
        return macroDroidApplication.getString(i);
    }

    public boolean isUserLog() {
        return this.isUserLog;
    }

    public void setMaxLines(int i) {
        this.maxLines = i;
    }

    public C8156e() {
        super(ITEM_TYPE);
    }
}
