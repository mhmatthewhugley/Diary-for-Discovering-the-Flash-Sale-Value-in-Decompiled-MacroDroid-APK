package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.events.MacroDeletedEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.ContinuePausedActionsHandler;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Iterator;
import java.util.List;
import p128m0.C7746g0;
import p161s1.C10180a;

public class DeleteMacroAction extends Action {
    public static final Parcelable.Creator<DeleteMacroAction> CREATOR = new C2395a();
    private static final String THIS_MACRO = MacroDroidApplication.m14845u().getString(C17541R$string.constraint_last_run_time_this_macro);
    private long m_GUID;
    private transient List<Macro> m_macroList;
    private String m_macroName;

    /* renamed from: com.arlosoft.macrodroid.action.DeleteMacroAction$a */
    class C2395a implements Parcelable.Creator<DeleteMacroAction> {
        C2395a() {
        }

        /* renamed from: a */
        public DeleteMacroAction createFromParcel(Parcel parcel) {
            return new DeleteMacroAction(parcel, (C2395a) null);
        }

        /* renamed from: b */
        public DeleteMacroAction[] newArray(int i) {
            return new DeleteMacroAction[i];
        }
    }

    /* synthetic */ DeleteMacroAction(Parcel parcel, C2395a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.m_GUID == 0) {
            return 0;
        }
        List<Macro> B = C4934n.m18998M().mo29672B(false);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        this.m_macroList.add(0, mo27837X0());
        for (int i = 0; i < this.m_macroList.size(); i++) {
            if (this.m_GUID == this.m_macroList.get(i).getGUID()) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_macroName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7746g0.m32319u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Macro Q = C4934n.m18998M().mo29682Q(this.m_GUID);
        if (Q != null) {
            Q.cancelActiveMacro(mo27827K0());
            C4878b.m18874m("Deleting macro: " + Q, mo27837X0().getGUID());
            ContinuePausedActionsHandler.m18973b(mo27827K0(), Q);
            C4934n.m18998M().mo29692k0(Q, true);
            C10180a.m40075a().mo80018i(new MacroDeletedEvent(Q.getGUID()));
            return;
        }
        C4878b.m18883v("Attempted to delete macro that no longer exists (Ignoring)", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<Macro> B = C4934n.m18998M().mo29672B(false);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        this.m_macroList.add(0, mo27837X0());
        String[] strArr = new String[this.m_macroList.size()];
        for (int i = 0; i < this.m_macroList.size(); i++) {
            if (mo27837X0().getGUID() == this.m_macroList.get(i).getGUID()) {
                strArr[i] = THIS_MACRO;
            } else {
                strArr[i] = this.m_macroList.get(i).getName();
            }
        }
        if (this.m_GUID == 0 && this.m_macroList.size() > 0) {
            this.m_GUID = this.m_macroList.get(0).getGUID();
            this.m_macroName = THIS_MACRO;
        }
        return strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_macroName);
        parcel.writeLong(this.m_GUID);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_GUID = this.m_macroList.get(i).getGUID();
        this.m_macroName = this.m_macroList.get(i).getName();
    }

    public DeleteMacroAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DeleteMacroAction() {
    }

    private DeleteMacroAction(Parcel parcel) {
        super(parcel);
        this.m_macroName = parcel.readString();
        this.m_GUID = parcel.readLong();
    }
}
