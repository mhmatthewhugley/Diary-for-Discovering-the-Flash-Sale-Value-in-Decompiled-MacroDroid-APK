package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6416p0;
import java.util.ArrayList;
import java.util.List;

public abstract class ParentAction extends ConditionAction {
    private boolean childrenCollapsed;

    ParentAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    /* renamed from: I3 */
    public List<Integer> mo25457I3() {
        try {
            ArrayList<Action> actions = mo27837X0().getActions();
            int indexOf = actions.indexOf(this);
            int f = C6416p0.m24709f(actions, indexOf);
            ArrayList arrayList = new ArrayList();
            while (true) {
                indexOf++;
                if (indexOf >= f) {
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(actions.get(indexOf).mo25558S0()));
            }
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: J3 */
    public boolean mo25458J3() {
        return this.childrenCollapsed;
    }

    /* renamed from: K3 */
    public void mo25459K3(boolean z) {
        this.childrenCollapsed = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.childrenCollapsed ? 1 : 0);
    }

    ParentAction() {
    }

    ParentAction(Parcel parcel) {
        super(parcel);
        this.childrenCollapsed = parcel.readInt() != 0;
    }
}
