package p149q1;

import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.macro.C4934n;

/* renamed from: q1.c */
/* compiled from: DrawerItemActionBlock */
public class C8154c extends C8153b {
    public static final String ITEM_TYPE = "ActionBlock";
    private ActionBlockData actionBlockData;

    public C8154c() {
        super(ITEM_TYPE);
    }

    public ActionBlockData getActionBlockData() {
        return this.actionBlockData;
    }

    public long getActionBlockGuid() {
        return this.actionBlockData.mo27082c();
    }

    public int getLayoutResId() {
        return C17535R$layout.drawer_item_action_block;
    }

    public String getName() {
        ActionBlock g = C4934n.m18998M().mo29649g(this.actionBlockData.mo27082c());
        if (g != null) {
            return g.getName();
        }
        return "<" + MacroDroidApplication.m14845u().getString(C17541R$string.action_block_not_found) + ">";
    }

    public boolean isValid() {
        return C4934n.m18998M().mo29649g(this.actionBlockData.mo27082c()) != null;
    }

    public void setActionBlockData(ActionBlockData actionBlockData2) {
        this.actionBlockData = actionBlockData2;
    }

    public C8154c(ActionBlockData actionBlockData2) {
        super(ITEM_TYPE);
        this.actionBlockData = actionBlockData2;
    }
}
