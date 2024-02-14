package com.arlosoft.macrodroid.actionblock.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: ActionBlock.kt */
public final class ActionBlock extends Macro {
    public static final Parcelable.Creator<ActionBlock> CREATOR = new C3672a();
    public static final C3673b Companion = new C3673b((C13695i) null);
    private transient ActionBlockAction actionThatInvoked;
    private boolean isInputExpanded;
    private boolean isLocalExpanded;
    private boolean isOutputExpanded;
    private boolean isTestMode;
    private transient Macro parentMacro;

    /* renamed from: com.arlosoft.macrodroid.actionblock.data.ActionBlock$a */
    /* compiled from: ActionBlock.kt */
    public static final class C3672a implements Parcelable.Creator<ActionBlock> {
        C3672a() {
        }

        /* renamed from: a */
        public ActionBlock createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ActionBlock(parcel);
        }

        /* renamed from: b */
        public ActionBlock[] newArray(int i) {
            return new ActionBlock[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.data.ActionBlock$b */
    /* compiled from: ActionBlock.kt */
    public static final class C3673b {
        private C3673b() {
        }

        public /* synthetic */ C3673b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final ActionBlock mo27135a() {
            ActionBlock actionBlock = new ActionBlock();
            actionBlock.setCompleted(false);
            actionBlock.setDescriptionOpen(true);
            return actionBlock;
        }
    }

    public ActionBlock() {
        this.isActionBlock = true;
    }

    private final String getDefaultValueAsText(String str) {
        T t;
        List<MacroDroidVariable> inputOnlyActionBlockVariables = getInputOnlyActionBlockVariables(false);
        C13706o.m87928e(inputOnlyActionBlockVariables, "getInputOnlyActionBlockVariables(false)");
        Iterator<T> it = inputOnlyActionBlockVariables.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C13706o.m87924a(((MacroDroidVariable) t).getName(), str)) {
                break;
            }
        }
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) t;
        if (macroDroidVariable == null) {
            return "";
        }
        int S = macroDroidVariable.mo27743S();
        if (S == 0) {
            return String.valueOf(macroDroidVariable.mo27762j());
        }
        if (S == 1) {
            return String.valueOf(macroDroidVariable.mo27745U());
        }
        if (S == 2) {
            return macroDroidVariable.mo27736I();
        }
        if (S != 3) {
            return macroDroidVariable.mo27736I();
        }
        return String.valueOf(macroDroidVariable.mo27766l());
    }

    public final ActionBlock cloneActionBlock(boolean z) {
        Macro clone = clone(new ActionBlock(), z, true);
        C13706o.m87927d(clone, "null cannot be cast to non-null type com.arlosoft.macrodroid.actionblock.data.ActionBlock");
        return (ActionBlock) clone;
    }

    public final ActionBlock exactClone() {
        Parcel obtain = Parcel.obtain();
        C13706o.m87928e(obtain, "obtain()");
        obtain.writeParcelable(this, 0);
        obtain.setDataPosition(0);
        ActionBlock actionBlock = (ActionBlock) obtain.readParcelable(ActionBlock.class.getClassLoader());
        obtain.recycle();
        C13706o.m87926c(actionBlock);
        return actionBlock;
    }

    public final MacroDroidVariable findLocalVariableByName(String str, boolean z) {
        C13706o.m87929f(str, "variableName");
        for (MacroDroidVariable next : getLocalVariables()) {
            if (C13706o.m87924a(next.getName(), str) && ((z && next.mo27740P()) || (!z && next.mo27741Q()))) {
                return next;
            }
        }
        return null;
    }

    public final ActionBlockAction getActionThatInvoked() {
        return this.actionThatInvoked;
    }

    public List<Constraint> getConstraints() {
        return new ArrayList();
    }

    public final Macro getParentMacro() {
        return this.parentMacro;
    }

    public final Macro getTopLevelParentMacro() {
        Macro macro = this.parentMacro;
        while (macro != null && (macro instanceof ActionBlock)) {
            macro = ((ActionBlock) macro).parentMacro;
        }
        return macro;
    }

    public ArrayList<Trigger> getTriggerList() {
        return new ArrayList<>();
    }

    public final void invokeActions(TriggerContextInfo triggerContextInfo, boolean z, ResumeMacroInfo resumeMacroInfo, Map<String, String> map, Map<String, DictionaryKeys> map2, Macro macro) {
        List<String> list;
        String str;
        Map<String, String> map3 = map;
        Map<String, DictionaryKeys> map4 = map2;
        Macro macro2 = macro;
        C13706o.m87929f(map3, "inputValues");
        C13706o.m87929f(map4, "inputKeys");
        List<MacroDroidVariable> inputOnlyActionBlockVariables = getInputOnlyActionBlockVariables(false);
        this.parentMacro = macro2;
        C13706o.m87928e(inputOnlyActionBlockVariables, "inputVariables");
        for (MacroDroidVariable macroDroidVariable : inputOnlyActionBlockVariables) {
            String str2 = map3.get(macroDroidVariable.getName());
            DictionaryKeys dictionaryKeys = map4.get(macroDroidVariable.getName());
            if (macroDroidVariable.mo27743S() == 4 || macroDroidVariable.mo27743S() == 5) {
                TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
                MacroDroidVariable variableByName = macro2 != null ? macro2.getVariableByName(str2) : null;
                if (variableByName != null) {
                    if (dictionaryKeys == null || (list = dictionaryKeys.getKeys()) == null) {
                        list = C13614t.m87748j();
                    }
                    macroDroidVariable.mo27758e0(MacroDroidVariable.m15420r(variableByName, list, false, 2, (Object) null));
                }
            } else {
                if (str2 != null) {
                    str = C4023j0.m15760t0(MacroDroidApplication.f9883I.mo27303b(), str2, triggerContextInfo, macro2);
                } else {
                    TriggerContextInfo triggerContextInfo3 = triggerContextInfo;
                    str = getDefaultValueAsText(macroDroidVariable.getName());
                }
                String str3 = str;
                if (str3 != null) {
                    C13706o.m87928e(str3, "value");
                    macroDroidVariable.mo27767l0(VariableValue.C6485a.m24840d(VariableValue.Companion, str3, macroDroidVariable.mo27743S(), (List) null, 4, (Object) null), false, (VariableValue) null, this);
                }
            }
        }
        TriggerContextInfo triggerContextInfo4 = triggerContextInfo;
        invokeActionsInternal(triggerContextInfo, z, resumeMacroInfo);
    }

    public final boolean isInputExpanded() {
        return this.isInputExpanded;
    }

    public final boolean isLocalExpanded() {
        return this.isLocalExpanded;
    }

    public final boolean isOutputExpanded() {
        return this.isOutputExpanded;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    public boolean isValid() {
        if (this.m_actionList.size() < 1) {
            return false;
        }
        Iterator<Action> it = this.m_actionList.iterator();
        while (it.hasNext()) {
            if (!it.next().mo24824M1()) {
                return false;
            }
        }
        return true;
    }

    public final void setActionThatInvoked(ActionBlockAction actionBlockAction) {
        this.actionThatInvoked = actionBlockAction;
    }

    public final void setInputExpanded(boolean z) {
        this.isInputExpanded = z;
    }

    public final void setLocalExpanded(boolean z) {
        this.isLocalExpanded = z;
    }

    public final void setOutputExpanded(boolean z) {
        this.isOutputExpanded = z;
    }

    public final void setParentMacro(Macro macro) {
        this.parentMacro = macro;
    }

    public final void setTestMode(boolean z) {
        this.isTestMode = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.isInputExpanded ? 1 : 0);
        parcel.writeInt(this.isOutputExpanded ? 1 : 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionBlock(Parcel parcel) {
        super(parcel);
        C13706o.m87929f(parcel, "parcel");
        boolean z = true;
        this.isActionBlock = true;
        this.isInputExpanded = parcel.readInt() != 0;
        this.isOutputExpanded = parcel.readInt() == 0 ? false : z;
    }
}
