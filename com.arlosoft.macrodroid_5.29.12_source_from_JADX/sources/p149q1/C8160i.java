package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import p183w2.C10330a;

/* renamed from: q1.i */
/* compiled from: DrawerItemStopwatch */
public class C8160i extends C8153b implements C8163l {
    public static final String ITEM_TYPE = "Stopwatch";
    private boolean hideName;
    private String stopwatchName;

    public C8160i() {
        super(ITEM_TYPE);
    }

    public boolean getHideName() {
        return this.hideName;
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_stopwatch;
    }

    public String getName() {
        if (isValid()) {
            return getStopwatchName();
        }
        return "<" + MacroDroidApplication.m14845u().getString(C17541R$string.stopwatch_not_found) + ">";
    }

    public String getStopwatchName() {
        return this.stopwatchName;
    }

    public boolean isValid() {
        return C10330a.m40553e(MacroDroidApplication.m14845u()).contains(this.stopwatchName);
    }

    public void setHideName(boolean z) {
        this.hideName = z;
    }

    public String setStopwatchName(String str) {
        this.stopwatchName = str;
        return str;
    }

    public C8160i(String str) {
        super(ITEM_TYPE);
        this.stopwatchName = str;
    }
}
