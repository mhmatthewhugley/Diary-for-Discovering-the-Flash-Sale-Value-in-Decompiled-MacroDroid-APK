package com.arlosoft.macrodroid.macro;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.action.ElseAction;
import com.arlosoft.macrodroid.action.ElseIfConditionAction;
import com.arlosoft.macrodroid.action.EndParentAction;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.IfConfirmedThenAction;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.action.ShellScriptAction;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.C4068u1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.events.ShowActionBlockTestSummaryEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.arlosoft.macrodroid.utils.C6421r;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p057a2.C2223l;
import p161s1.C10180a;

public class Macro implements Parcelable {
    public static final Parcelable.Creator<Macro> CREATOR = new C4914a();
    private static final int MAX_INVOCATIONS_PER_SECOND = 500;
    private static boolean sMacroDroidEnabled;
    private static int s_idCounter;
    private transient List<ActionBlock> actionBlocksToImport = new ArrayList();
    private transient WaitUntilTriggerAction actionWaitingForTriggerActive = null;
    @Nullable
    private transient ShellScriptAction activeShellScriptAction = null;
    private long disabledTimestamp = 0;
    private transient boolean enabledStateDuringLoad = false;
    private List<ActionBlock> exportedActionBlocks = new ArrayList();
    private long forceEvenIfNotEnabledTimestamp = 0;
    private boolean globalForceIfNotEnabled;
    private boolean hasBeenDisabled = false;
    public boolean isActionBlock = false;
    private boolean isBeingImported = false;
    private boolean isClonedInstance = false;
    private boolean isFavourite = false;
    private long lastEditedTimestamp;
    private transient Set<C4068u1> localVariableUpdatedListeners = Collections.synchronizedSet(new HashSet());
    private ArrayList<MacroDroidVariable> localVariables;
    private long m_GUID;
    private transient Action m_actionBeingConfigured;
    protected final ArrayList<Action> m_actionList;
    private transient boolean m_cancelFlag;
    private String m_category;
    private transient boolean m_completed = true;
    private transient boolean m_configuringShortcut;
    private final List<Constraint> m_constraintList;
    private String m_description;
    private boolean m_descriptionOpen = false;
    private boolean m_enabled = false;
    private boolean m_excludeLog;
    @ColorInt
    private int m_headingColor;
    private transient int m_invokeCount;
    private transient long m_invokeStart;
    private boolean m_isOrCondition;
    private String m_name;
    private transient boolean m_resetLoopCount;
    private transient Object m_tag;
    private Trigger m_trigger;
    private ArrayList<Trigger> m_triggerList;
    private transient int m_uniqueId;
    private transient TriggerContextInfo originalTriggerContextInfo = null;
    private transient TriggerContextInfo triggerContextInfo;
    private transient Trigger triggerThatInvoked;

    /* renamed from: com.arlosoft.macrodroid.macro.Macro$a */
    class C4914a implements Parcelable.Creator<Macro> {
        C4914a() {
        }

        /* renamed from: a */
        public Macro createFromParcel(Parcel parcel) {
            return new Macro(parcel);
        }

        /* renamed from: b */
        public Macro[] newArray(int i) {
            return new Macro[i];
        }
    }

    public Macro() {
        if (this.m_GUID == 0) {
            this.m_GUID = UUID.randomUUID().getLeastSignificantBits();
        }
        this.m_name = "";
        int i = s_idCounter + 1;
        s_idCounter = i;
        this.m_uniqueId = i;
        this.m_triggerList = new ArrayList<>();
        this.m_actionList = new ArrayList<>();
        this.m_constraintList = new ArrayList();
        this.localVariables = new ArrayList<>();
    }

    private boolean deleteChildConstraint(SelectableItem selectableItem, SelectableItem selectableItem2) {
        if (selectableItem.mo27826J0() == null) {
            return false;
        }
        for (Constraint next : selectableItem.mo27826J0()) {
            if (selectableItem2 == next) {
                selectableItem.mo27843d2(next);
                return true;
            } else if (deleteChildConstraint(next, selectableItem2)) {
                return true;
            }
        }
        return false;
    }

    private void displayOutputVarSummary(ResumeMacroInfo resumeMacroInfo) {
        ActionBlock actionBlock = (ActionBlock) this;
        actionBlock.getParentMacro();
        C10180a.m40075a().mo80018i(new ShowActionBlockTestSummaryEvent(actionBlock, getOutputOnlyActionBlockVariables(false)));
    }

    private SelectableItem findSelectableItemFromChildren(SelectableItem selectableItem, long j) {
        if (selectableItem.mo27847f1() == j) {
            return selectableItem;
        }
        if (selectableItem instanceof WaitUntilTriggerAction) {
            Iterator<Trigger> it = ((WaitUntilTriggerAction) selectableItem).mo26117B3().iterator();
            while (it.hasNext()) {
                SelectableItem findSelectableItemFromChildren = findSelectableItemFromChildren(it.next(), j);
                if (findSelectableItemFromChildren != null) {
                    return findSelectableItemFromChildren;
                }
            }
        }
        if (selectableItem.mo27826J0() == null) {
            return null;
        }
        for (Constraint findSelectableItemFromChildren2 : selectableItem.mo27826J0()) {
            SelectableItem findSelectableItemFromChildren3 = findSelectableItemFromChildren(findSelectableItemFromChildren2, j);
            if (findSelectableItemFromChildren3 != null) {
                return findSelectableItemFromChildren3;
            }
        }
        return null;
    }

    private boolean isCategoryDisabled() {
        return C5163j2.m19991J(MacroDroidApplication.m14845u()).contains(getCategory());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int lambda$getLocalVariablesSorted$0(Locale locale, MacroDroidVariable macroDroidVariable, MacroDroidVariable macroDroidVariable2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macroDroidVariable.getName(), macroDroidVariable2.getName());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortVariables$1(Locale locale, MacroDroidVariable macroDroidVariable, MacroDroidVariable macroDroidVariable2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macroDroidVariable.getName(), macroDroidVariable2.getName());
    }

    private void logAction(Action action, TriggerContextInfo triggerContextInfo2) {
        if (!this.m_excludeLog) {
            C4878b.m18862a(action.mo24728k1(triggerContextInfo2), getGUID());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: notifyVariableListeners */
    public void lambda$notifyVariableListenersOnCorrectThread$2(MacroDroidVariable macroDroidVariable, VariableValue variableValue, VariableValue variableValue2) {
        Set<C4068u1> localVariableUpdatedListeners2 = getLocalVariableUpdatedListeners();
        if (localVariableUpdatedListeners2 != null) {
            for (C4068u1 v : localVariableUpdatedListeners2) {
                v.mo27212v(macroDroidVariable, variableValue, variableValue2, getGUID());
            }
        }
    }

    public static void setMacroDroidEnabledState(boolean z) {
        sMacroDroidEnabled = z;
    }

    private void updateActionBlockOutputVariables(ResumeMacroInfo resumeMacroInfo) {
        ArrayList<String> arrayList;
        MacroDroidVariable q;
        if (this.isActionBlock) {
            ActionBlock actionBlock = (ActionBlock) this;
            ActionBlockAction actionThatInvoked = actionBlock.getActionThatInvoked();
            if (actionThatInvoked != null) {
                List<MacroDroidVariable> outputOnlyActionBlockVariables = getOutputOnlyActionBlockVariables(true);
                Map<String, String> B3 = actionThatInvoked.mo24708B3();
                Map<String, DictionaryKeys> A3 = actionThatInvoked.mo24707A3();
                for (MacroDroidVariable next : outputOnlyActionBlockVariables) {
                    String str = B3.get(next.getName());
                    DictionaryKeys dictionaryKeys = A3.get(next.getName());
                    if (dictionaryKeys == null) {
                        arrayList = null;
                    } else {
                        arrayList = C6520o0.m24868C(MacroDroidApplication.m14845u(), dictionaryKeys.getKeys(), this.triggerContextInfo, actionBlock.getParentMacro());
                    }
                    if (!(str == null || (q = actionThatInvoked.mo27861q(str)) == null)) {
                        VariableValue V = next.mo27746V();
                        if (arrayList != null) {
                            V.setParentKeys(arrayList);
                        }
                        actionThatInvoked.mo27832M2(q, V);
                    }
                }
                return;
            }
            Macro parentMacro = actionBlock.getParentMacro();
            List<MacroDroidVariable> outputOnlyActionBlockVariables2 = getOutputOnlyActionBlockVariables(true);
            Map<String, String> a = resumeMacroInfo.mo28552a();
            if (a != null) {
                for (MacroDroidVariable next2 : outputOnlyActionBlockVariables2) {
                    String str2 = a.get(next2.getName());
                    if (str2 != null) {
                        if (parentMacro != null) {
                            MacroDroidVariable variableByName = parentMacro.getVariableByName(str2);
                            if (variableByName != null) {
                                parentMacro.variableUpdate(variableByName, next2.mo27746V());
                            }
                        } else {
                            MacroDroidVariable w = C4064u.m16048t().mo27996w(str2);
                            if (w != null) {
                                C4064u.m16048t().mo27980P(w, next2.mo27746V(), true, (Macro) null);
                            }
                        }
                    }
                }
            }
        }
    }

    private void updateGUIDRefsIfRequired(long j, long j2, SelectableItem selectableItem) {
        if (selectableItem instanceof C2223l) {
            C2223l lVar = (C2223l) selectableItem;
            ArrayList<Long> C = lVar.mo24438C();
            for (int i = 0; i < C.size(); i++) {
                if (C.get(i).longValue() == j) {
                    C.set(i, Long.valueOf(j2));
                }
            }
            lVar.mo24439r(C);
        }
    }

    public void addAction(Action action) {
        this.m_actionList.add(action);
        if (isEnabled()) {
            action.mo24696W2();
        }
        action.mo24687G2(this);
    }

    public void addActionAtIndex(Action action, int i) {
        if (i >= this.m_actionList.size()) {
            i = Math.max(this.m_actionList.size() - 1, 0);
        }
        this.m_actionList.add(i, action);
    }

    public void addActionBlocksToList(C4915a aVar, ArrayList<ActionBlock> arrayList, Action action) {
        ActionBlock g;
        if ((action instanceof ActionBlockAction) && (g = aVar.mo29649g(((ActionBlockAction) action).mo24715x3())) != null && g.getGUID() != getGUID() && !arrayList.contains(g)) {
            arrayList.add(g);
            Iterator<Action> it = g.getActions().iterator();
            while (it.hasNext()) {
                addActionBlocksToList(aVar, arrayList, it.next());
            }
        }
    }

    public void addConstraint(Constraint constraint) {
        if (isEnabled()) {
            constraint.mo28114W2();
        }
        this.m_constraintList.add(constraint);
        constraint.mo24687G2(this);
    }

    public void addConstraintsToList(List<Constraint> list, Constraint constraint) {
        list.add(constraint);
        for (Constraint addConstraintsToList : constraint.mo27826J0()) {
            addConstraintsToList(list, addConstraintsToList);
        }
    }

    public void addLocalVariableUpdatedListener(C4068u1 u1Var) {
        synchronized (this.localVariableUpdatedListeners) {
            this.localVariableUpdatedListeners.add(u1Var);
        }
    }

    public void addTrigger(Trigger trigger) {
        this.m_triggerList.add(trigger);
        trigger.mo24687G2(this);
    }

    public boolean canInvoke(TriggerContextInfo triggerContextInfo2) {
        return canInvoke(triggerContextInfo2, false);
    }

    public void cancelActiveMacro(Context context) {
        this.m_cancelFlag = true;
        ContinuePausedActionsHandler.m18973b(context, this);
        for (Macro next : C4934n.m18998M().mo29709y()) {
            if (((ActionBlock) next).getTopLevelParentMacro() == this) {
                ContinuePausedActionsHandler.m18973b(context, next);
            }
        }
        ShellScriptAction shellScriptAction = this.activeShellScriptAction;
        if (shellScriptAction != null) {
            shellScriptAction.mo25766w3();
        }
        WaitUntilTriggerAction waitUntilTriggerAction = this.actionWaitingForTriggerActive;
        if (waitUntilTriggerAction != null) {
            waitUntilTriggerAction.mo26121s3();
            this.actionWaitingForTriggerActive = null;
        }
    }

    public void clearExportedActionBlocks() {
        this.exportedActionBlocks = null;
    }

    /* access modifiers changed from: protected */
    public Macro clone(Macro macro, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(z ? " 2" : "");
        macro.setName(sb.toString());
        macro.setDescription(getDescription());
        macro.setConstraintIsOrCondition(isConstraintOrCondition());
        macro.setExcludeFromLog(isExcludedFromLog());
        ArrayList<Trigger> triggerList = getTriggerList();
        for (MacroDroidVariable e : getLocalVariables()) {
            macro.getLocalVariables().add(C6421r.m24724e(e));
        }
        for (Trigger c : triggerList) {
            Trigger trigger = (Trigger) C6421r.m24722c(c, triggerList, macro.getTriggerList());
            trigger.mo24687G2(macro);
            macro.addTrigger(trigger);
        }
        Iterator<Action> it = getActions().iterator();
        while (it.hasNext()) {
            Action action = (Action) C6421r.m24722c(it.next(), triggerList, macro.getTriggerList());
            action.mo24702g3(macro, this);
            macro.addAction(action);
        }
        for (Constraint c2 : getConstraints()) {
            macro.addConstraint((Constraint) C6421r.m24722c(c2, triggerList, macro.getTriggerList()));
        }
        for (Constraint G2 : macro.getAllConstraints()) {
            G2.mo24687G2(macro);
        }
        HashMap hashMap = new HashMap();
        if (z2) {
            for (ActionBlock next : this.actionBlocksToImport) {
                long guid = next.getGUID();
                next.setGUID(UUID.randomUUID().getLeastSignificantBits());
                hashMap.put(Long.valueOf(guid), Long.valueOf(next.getGUID()));
            }
            for (Long l : hashMap.keySet()) {
                Iterator<Action> it2 = macro.getActions().iterator();
                while (it2.hasNext()) {
                    Action next2 = it2.next();
                    if (next2 instanceof ActionBlockAction) {
                        ActionBlockAction actionBlockAction = (ActionBlockAction) next2;
                        if (actionBlockAction.mo24715x3() == l.longValue()) {
                            actionBlockAction.mo24709C3(((Long) hashMap.get(l)).longValue());
                        }
                    }
                }
                for (ActionBlock actions : this.actionBlocksToImport) {
                    Iterator<Action> it3 = actions.getActions().iterator();
                    while (it3.hasNext()) {
                        Action next3 = it3.next();
                        if (next3 instanceof ActionBlockAction) {
                            ActionBlockAction actionBlockAction2 = (ActionBlockAction) next3;
                            if (actionBlockAction2.mo24715x3() == l.longValue()) {
                                actionBlockAction2.mo24709C3(((Long) hashMap.get(l)).longValue());
                            }
                        }
                    }
                }
            }
        }
        macro.setActionBlocksToImport(this.actionBlocksToImport);
        macro.setCategory(getCategory());
        macro.setIsBeingImported(getIsBeingImported());
        macro.setCompleted(true);
        if (z) {
            C4878b.m18874m("Add cloned macro to JSON with id: " + macro.getGUID(), getGUID());
            C4934n.m18998M().mo29697q(macro);
            macro.setTemplateSelected();
            macro.setEnabled(isEnabled());
        }
        return macro;
    }

    public Macro cloneMacro(boolean z, boolean z2) {
        return clone(new Macro(), z, z2);
    }

    public Macro createExactClone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(this, 0);
        obtain.setDataPosition(0);
        Macro macro = (Macro) obtain.readParcelable(getClass().getClassLoader());
        obtain.recycle();
        return macro;
    }

    public int describeContents() {
        return 0;
    }

    public void enableOrDisableItemAndChildren(Action action, boolean z) {
        int i;
        ArrayList<Action> actions = getActions();
        int indexOf = getActions().indexOf(action);
        if (action instanceof ElseIfConditionAction) {
            i = C6416p0.m24708e(actions, indexOf) - 1;
        } else {
            int f = C6416p0.m24709f(actions, indexOf);
            i = action instanceof ElseAction ? f - 1 : f;
        }
        while (indexOf <= i) {
            actions.get(indexOf).mo27818D2(z);
            indexOf++;
        }
    }

    public void enableParentItem(Action action) {
        ArrayList<Action> actions = getActions();
        int indexOf = getActions().indexOf(action);
        int f = C6416p0.m24709f(actions, indexOf);
        while (indexOf <= f) {
            if (actions.get(indexOf) instanceof EndParentAction) {
                actions.get(indexOf).mo27818D2(true);
            }
            indexOf++;
        }
    }

    @Nullable
    public SelectableItem findChildByGUID(long j) {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            SelectableItem findSelectableItemFromChildren = findSelectableItemFromChildren(it.next(), j);
            if (findSelectableItemFromChildren != null) {
                return findSelectableItemFromChildren;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            SelectableItem findSelectableItemFromChildren2 = findSelectableItemFromChildren(it2.next(), j);
            if (findSelectableItemFromChildren2 != null) {
                return findSelectableItemFromChildren2;
            }
        }
        for (Constraint findSelectableItemFromChildren3 : this.m_constraintList) {
            SelectableItem findSelectableItemFromChildren4 = findSelectableItemFromChildren(findSelectableItemFromChildren3, j);
            if (findSelectableItemFromChildren4 != null) {
                return findSelectableItemFromChildren4;
            }
        }
        Action action = this.m_actionBeingConfigured;
        if (action == null) {
            return null;
        }
        if (action.mo27847f1() == j) {
            return this.m_actionBeingConfigured;
        }
        if (this.m_actionBeingConfigured.mo27826J0() != null) {
            return findChildByGUID(j, this.m_actionBeingConfigured.mo27826J0());
        }
        return null;
    }

    @Nullable
    public MacroDroidVariable findLocalVariableByName(String str) {
        Iterator<MacroDroidVariable> it = this.localVariables.iterator();
        while (it.hasNext()) {
            MacroDroidVariable next = it.next();
            if (next.getName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Action getActionBeingConfigured() {
        return this.m_actionBeingConfigured;
    }

    public List<MacroDroidVariable> getActionBlockWorkingVariables(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<MacroDroidVariable> it = this.localVariables.iterator();
        while (it.hasNext()) {
            MacroDroidVariable next = it.next();
            if (next.mo27747W()) {
                arrayList.add(next);
            }
        }
        return z ? sortVariables(arrayList) : arrayList;
    }

    public List<ActionBlock> getActionBlocksToImport() {
        return this.actionBlocksToImport;
    }

    public ArrayList<Action> getActions() {
        return this.m_actionList;
    }

    public List<Constraint> getAllConstraints() {
        ArrayList arrayList = new ArrayList();
        Iterator<Trigger> it = getTriggerList().iterator();
        while (it.hasNext()) {
            for (Constraint addConstraintsToList : it.next().mo27826J0()) {
                addConstraintsToList(arrayList, addConstraintsToList);
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            for (Constraint addConstraintsToList2 : it2.next().mo27826J0()) {
                addConstraintsToList(arrayList, addConstraintsToList2);
            }
        }
        for (Constraint addConstraintsToList3 : this.m_constraintList) {
            addConstraintsToList(arrayList, addConstraintsToList3);
        }
        return arrayList;
    }

    public String getCategory() {
        if (this.m_category == null) {
            this.m_category = MacroDroidApplication.m14845u().getString(C17541R$string.uncategorized);
        }
        return this.m_category;
    }

    public List<Constraint> getConstraints() {
        return this.m_constraintList;
    }

    public String getDescription() {
        return this.m_description;
    }

    public boolean getEnabledStateDuringLoad() {
        return this.enabledStateDuringLoad;
    }

    public List<ActionBlock> getExportedActionBlocks() {
        return this.exportedActionBlocks;
    }

    public long getGUID() {
        return this.m_GUID;
    }

    @ColorInt
    public int getHeadingColor() {
        return this.m_headingColor;
    }

    public int getId() {
        return this.m_uniqueId;
    }

    public List<MacroDroidVariable> getInputOnlyActionBlockVariables(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<MacroDroidVariable> it = this.localVariables.iterator();
        while (it.hasNext()) {
            MacroDroidVariable next = it.next();
            if (!next.mo27747W() && next.mo27740P()) {
                arrayList.add(next);
            }
        }
        return z ? sortVariables(arrayList) : arrayList;
    }

    public boolean getIsBeingImported() {
        return this.isBeingImported;
    }

    public boolean getIsFavourite() {
        return this.isFavourite;
    }

    public long getLastEditedTimestamp() {
        return this.lastEditedTimestamp;
    }

    @Nullable
    public MacroDroidVariable getLocalVariableByName(String str) {
        for (MacroDroidVariable next : getLocalVariables()) {
            if (next.getName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Set<C4068u1> getLocalVariableUpdatedListeners() {
        Set<C4068u1> set;
        synchronized (this.localVariableUpdatedListeners) {
            set = this.localVariableUpdatedListeners;
        }
        return set;
    }

    public List<MacroDroidVariable> getLocalVariables() {
        return this.localVariables;
    }

    public List<MacroDroidVariable> getLocalVariablesForDirection(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<MacroDroidVariable> it = this.localVariables.iterator();
        while (it.hasNext()) {
            MacroDroidVariable next = it.next();
            if ((z && next.mo27740P() && !next.mo27747W()) || (!z && next.mo27741Q())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<MacroDroidVariable> getLocalVariablesSorted() {
        ArrayList arrayList = new ArrayList(this.localVariables);
        Collections.sort(arrayList, new C4920f(C5163j2.m19963F0(MacroDroidApplication.m14845u())));
        return arrayList;
    }

    public List<MacroDroidVariable> getLocalVariablesSortedForDirection(boolean z) {
        return sortVariables(getLocalVariablesForDirection(z));
    }

    public int getMinSdk() {
        Iterator<Trigger> it = getTriggerList().iterator();
        int i = 0;
        while (it.hasNext()) {
            Trigger next = it.next();
            if (next.mo24673T0().mo27901s() > i) {
                i = next.mo24673T0().mo27901s();
            }
            for (Constraint next2 : next.mo27826J0()) {
                if (next2.mo24673T0().mo27901s() > i) {
                    i = next2.mo24673T0().mo27901s();
                }
            }
        }
        Iterator<Action> it2 = getActions().iterator();
        while (it2.hasNext()) {
            Action next3 = it2.next();
            if (next3.mo24673T0().mo27901s() > i) {
                i = next3.mo24673T0().mo27901s();
            }
            for (Constraint next4 : next3.mo27826J0()) {
                if (next4.mo24673T0().mo27901s() > i) {
                    i = next4.mo24673T0().mo27901s();
                }
            }
        }
        for (Constraint next5 : getConstraints()) {
            if (next5.mo24673T0().mo27901s() > i) {
                i = next5.mo24673T0().mo27901s();
            }
        }
        return i;
    }

    public String getName() {
        return this.m_name;
    }

    public List<MacroDroidVariable> getOutputOnlyActionBlockVariables(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<MacroDroidVariable> it = this.localVariables.iterator();
        while (it.hasNext()) {
            MacroDroidVariable next = it.next();
            if (!next.mo27747W() && next.mo27741Q()) {
                arrayList.add(next);
            }
        }
        return z ? sortVariables(arrayList) : arrayList;
    }

    @Nullable
    public ParentAction getParentAction(Action action) {
        int i = 0;
        for (int indexOf = getActions().indexOf(action); indexOf >= 0; indexOf--) {
            Action action2 = getActions().get(indexOf);
            if (action2 instanceof EndParentAction) {
                i--;
            } else if ((action2 instanceof ParentAction) && (i = i + 1) == 1) {
                return (ParentAction) action2;
            }
        }
        return null;
    }

    public String[] getRequiredPermissions() {
        ArrayList arrayList = new ArrayList();
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (String str : it.next().mo24700e1()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            for (String str2 : it2.next().mo24700e1()) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        for (Constraint e1 : this.m_constraintList) {
            for (String str3 : e1.mo24700e1()) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getRequiredPermissionsOnImport() {
        ArrayList arrayList = new ArrayList();
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (String str : it.next().mo24826d1()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            for (String str2 : it2.next().mo24826d1()) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        for (Constraint d1 : this.m_constraintList) {
            for (String str3 : d1.mo24826d1()) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public int getRootVersion() {
        Iterator<Trigger> it = getTriggerList().iterator();
        int i = 9999;
        while (it.hasNext()) {
            i = Math.min(i, it.next().mo24673T0().mo27894l());
        }
        Iterator<Action> it2 = getActions().iterator();
        while (it2.hasNext()) {
            i = Math.min(i, it2.next().mo24673T0().mo27894l());
        }
        for (Constraint T0 : getConstraints()) {
            i = Math.min(i, T0.mo24673T0().mo27894l());
        }
        return i;
    }

    public Object getTag() {
        return this.m_tag;
    }

    public TriggerContextInfo getTriggerContextInfo() {
        return this.triggerContextInfo;
    }

    public ArrayList<Trigger> getTriggerList() {
        return getTriggerList(false);
    }

    public ArrayList<Trigger> getTriggerListWithAwaitingActions() {
        ArrayList<Trigger> triggerList = getTriggerList(true);
        ArrayList<Trigger> arrayList = new ArrayList<>();
        Iterator<Trigger> it = triggerList.iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            if (next.mo27822G1()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Trigger getTriggerThatInvoked() {
        return this.triggerThatInvoked;
    }

    @Nullable
    public MacroDroidVariable getVariableByName(String str) {
        MacroDroidVariable localVariableByName = getLocalVariableByName(str);
        return localVariableByName == null ? C4064u.m16048t().mo27996w(str) : localVariableByName;
    }

    public WaitUntilTriggerAction getWaitForTriggerActive() {
        return this.actionWaitingForTriggerActive;
    }

    public boolean hasOnlyTrigger(Class cls) {
        ArrayList<Trigger> triggerList = getTriggerList();
        if (triggerList.size() == 0) {
            return false;
        }
        for (Trigger isInstance : triggerList) {
            if (!cls.isInstance(isInstance)) {
                return false;
            }
        }
        return true;
    }

    public void initialiseExportedActionBlocks(C4915a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Action> it = getActions().iterator();
        while (it.hasNext()) {
            addActionBlocksToList(aVar, arrayList, it.next());
        }
        this.exportedActionBlocks = arrayList;
    }

    public void invokeActions(TriggerContextInfo triggerContextInfo2) {
        invokeActionsInternal(triggerContextInfo2, false, (ResumeMacroInfo) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d A[Catch:{ StackOverflowError -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invokeActionsInternal(com.arlosoft.macrodroid.triggers.TriggerContextInfo r13, boolean r14, @androidx.annotation.Nullable com.arlosoft.macrodroid.data.ResumeMacroInfo r15) {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r12.m_GUID
            com.arlosoft.macrodroid.database.C4375c.m17362a(r2, r0)
            com.arlosoft.macrodroid.triggers.Trigger r2 = r12.getTriggerThatInvoked()
            if (r2 == 0) goto L_0x0051
            boolean r2 = r12.m_excludeLog
            if (r2 != 0) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.arlosoft.macrodroid.triggers.Trigger r3 = r12.getTriggerThatInvoked()
            java.lang.String r3 = r3.mo24728k1(r13)
            r2.append(r3)
            if (r13 == 0) goto L_0x0041
            java.lang.String r3 = r13.mo31563p()
            if (r3 == 0) goto L_0x0041
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ": "
            r3.append(r4)
            java.lang.String r4 = r13.mo31563p()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0043
        L_0x0041:
            java.lang.String r3 = ""
        L_0x0043:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            long r3 = r12.getGUID()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18877p(r2, r3)
        L_0x0051:
            r2 = 1
            r3 = 0
            if (r14 != 0) goto L_0x007a
            boolean r4 = r12.isEnabled()     // Catch:{ StackOverflowError -> 0x0156 }
            if (r4 != 0) goto L_0x0062
            java.lang.String r4 = "Macro triggered but is currently disabled."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18882u(r4)     // Catch:{ StackOverflowError -> 0x0156 }
        L_0x0060:
            r4 = 0
            goto L_0x007b
        L_0x0062:
            boolean r4 = r12.isCategoryDisabled()     // Catch:{ StackOverflowError -> 0x0156 }
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = "Macro triggered but category is disabled."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18882u(r4)     // Catch:{ StackOverflowError -> 0x0156 }
            goto L_0x0060
        L_0x006e:
            boolean r4 = r12.isValidForRun()     // Catch:{ StackOverflowError -> 0x0156 }
            if (r4 != 0) goto L_0x007a
            java.lang.String r4 = "Macro triggered but is not valid for run."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18882u(r4)     // Catch:{ StackOverflowError -> 0x0156 }
            goto L_0x0060
        L_0x007a:
            r4 = 1
        L_0x007b:
            if (r4 == 0) goto L_0x0168
            r12.m_cancelFlag = r3     // Catch:{ StackOverflowError -> 0x0156 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ StackOverflowError -> 0x0156 }
            java.util.ArrayList r4 = r12.getActions()     // Catch:{ StackOverflowError -> 0x0156 }
            r6.<init>(r4)     // Catch:{ StackOverflowError -> 0x0156 }
            java.util.ArrayList r4 = r12.getTriggerList()     // Catch:{ StackOverflowError -> 0x0156 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ StackOverflowError -> 0x0156 }
        L_0x0090:
            boolean r5 = r4.hasNext()     // Catch:{ StackOverflowError -> 0x0156 }
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r4.next()     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5     // Catch:{ StackOverflowError -> 0x0156 }
            if (r13 == 0) goto L_0x0090
            com.arlosoft.macrodroid.triggers.Trigger r7 = r13.mo31564q()     // Catch:{ StackOverflowError -> 0x0156 }
            if (r5 != r7) goto L_0x0090
            r4 = 1
            goto L_0x00a7
        L_0x00a6:
            r4 = 0
        L_0x00a7:
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r5 = r12.actionWaitingForTriggerActive     // Catch:{ StackOverflowError -> 0x0156 }
            r7 = 0
            if (r5 == 0) goto L_0x00f7
            if (r4 != 0) goto L_0x00f7
            boolean r13 = r12.m_excludeLog     // Catch:{ StackOverflowError -> 0x0156 }
            if (r13 != 0) goto L_0x00d2
            boolean r13 = r12.isActionBlock     // Catch:{ StackOverflowError -> 0x0156 }
            if (r13 != 0) goto L_0x00d2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ StackOverflowError -> 0x0156 }
            r13.<init>()     // Catch:{ StackOverflowError -> 0x0156 }
            java.lang.String r15 = "Resuming Macro: "
            r13.append(r15)     // Catch:{ StackOverflowError -> 0x0156 }
            java.lang.String r15 = r12.getName()     // Catch:{ StackOverflowError -> 0x0156 }
            r13.append(r15)     // Catch:{ StackOverflowError -> 0x0156 }
            java.lang.String r13 = r13.toString()     // Catch:{ StackOverflowError -> 0x0156 }
            long r0 = r12.getGUID()     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r13, r0)     // Catch:{ StackOverflowError -> 0x0156 }
        L_0x00d2:
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r13 = r12.actionWaitingForTriggerActive     // Catch:{ StackOverflowError -> 0x0156 }
            r13.mo26121s3()     // Catch:{ StackOverflowError -> 0x0156 }
            java.util.ArrayList<com.arlosoft.macrodroid.action.Action> r13 = r12.m_actionList     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r15 = r12.actionWaitingForTriggerActive     // Catch:{ StackOverflowError -> 0x0156 }
            int r13 = r13.indexOf(r15)     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r15 = r12.actionWaitingForTriggerActive     // Catch:{ StackOverflowError -> 0x0156 }
            r12.setWaitForTriggerActive(r7)     // Catch:{ StackOverflowError -> 0x0156 }
            int r7 = r13 + 1
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r12.originalTriggerContextInfo     // Catch:{ StackOverflowError -> 0x0156 }
            java.util.Stack r10 = r15.mo26116A3()     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.data.ResumeMacroInfo r11 = r15.mo26122z3()     // Catch:{ StackOverflowError -> 0x0156 }
            r5 = r12
            r9 = r14
            r5.invokeActions(r6, r7, r8, r9, r10, r11)     // Catch:{ StackOverflowError -> 0x0156 }
            goto L_0x0168
        L_0x00f7:
            r12.originalTriggerContextInfo = r7     // Catch:{ StackOverflowError -> 0x0156 }
            p064c2.C2267a.m9333b(r12)     // Catch:{ StackOverflowError -> 0x0156 }
            r12.m_resetLoopCount = r2     // Catch:{ StackOverflowError -> 0x0156 }
            r12.m_invokeCount = r3     // Catch:{ StackOverflowError -> 0x0156 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ StackOverflowError -> 0x0156 }
            r12.m_invokeStart = r4     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r2 = r12.actionWaitingForTriggerActive     // Catch:{ StackOverflowError -> 0x0156 }
            if (r2 == 0) goto L_0x010f
            r2.mo26121s3()     // Catch:{ StackOverflowError -> 0x0156 }
            r12.actionWaitingForTriggerActive = r7     // Catch:{ StackOverflowError -> 0x0156 }
        L_0x010f:
            r12.m_cancelFlag = r3     // Catch:{ StackOverflowError -> 0x0156 }
            boolean r2 = r12.m_excludeLog     // Catch:{ StackOverflowError -> 0x0156 }
            if (r2 != 0) goto L_0x0135
            boolean r2 = r12.isActionBlock     // Catch:{ StackOverflowError -> 0x0156 }
            if (r2 != 0) goto L_0x0135
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ StackOverflowError -> 0x0156 }
            r2.<init>()     // Catch:{ StackOverflowError -> 0x0156 }
            java.lang.String r3 = "Invoking Macro: "
            r2.append(r3)     // Catch:{ StackOverflowError -> 0x0156 }
            java.lang.String r3 = r12.getName()     // Catch:{ StackOverflowError -> 0x0156 }
            r2.append(r3)     // Catch:{ StackOverflowError -> 0x0156 }
            java.lang.String r2 = r2.toString()     // Catch:{ StackOverflowError -> 0x0156 }
            long r3 = r12.getGUID()     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r2, r3)     // Catch:{ StackOverflowError -> 0x0156 }
        L_0x0135:
            com.arlosoft.macrodroid.database.C4375c.m17363b()     // Catch:{ StackOverflowError -> 0x0156 }
            x8.c r2 = p161s1.C10180a.m40075a()     // Catch:{ StackOverflowError -> 0x0156 }
            com.arlosoft.macrodroid.events.MacroRunEvent r3 = new com.arlosoft.macrodroid.events.MacroRunEvent     // Catch:{ StackOverflowError -> 0x0156 }
            long r4 = r12.getGUID()     // Catch:{ StackOverflowError -> 0x0156 }
            r3.<init>(r4, r0)     // Catch:{ StackOverflowError -> 0x0156 }
            r2.mo80018i(r3)     // Catch:{ StackOverflowError -> 0x0156 }
            r7 = 0
            java.util.Stack r10 = new java.util.Stack     // Catch:{ StackOverflowError -> 0x0156 }
            r10.<init>()     // Catch:{ StackOverflowError -> 0x0156 }
            r5 = r12
            r8 = r13
            r9 = r14
            r11 = r15
            r5.invokeActions(r6, r7, r8, r9, r10, r11)     // Catch:{ StackOverflowError -> 0x0156 }
            goto L_0x0168
        L_0x0156:
            com.arlosoft.macrodroid.app.MacroDroidApplication r13 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            r14 = 2131953934(0x7f13090e, float:1.9544353E38)
            java.lang.String r13 = r13.getString(r14)
            long r14 = r12.getGUID()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r14)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.Macro.invokeActionsInternal(com.arlosoft.macrodroid.triggers.TriggerContextInfo, boolean, com.arlosoft.macrodroid.data.ResumeMacroInfo):void");
    }

    public boolean isCancelled() {
        return this.m_cancelFlag;
    }

    public boolean isClonedInstance() {
        return this.isClonedInstance;
    }

    public boolean isCompleted() {
        return this.m_completed;
    }

    public boolean isConfiguringShortcut() {
        return this.m_configuringShortcut;
    }

    public boolean isConstraintOrCondition() {
        return this.m_isOrCondition;
    }

    public boolean isDescriptionOpen() {
        return this.m_descriptionOpen;
    }

    public boolean isEnabled() {
        return this.m_enabled || this.isActionBlock;
    }

    public boolean isExcludedFromLog() {
        return this.m_excludeLog;
    }

    public boolean isRootOnlyWithNoAdbHack() {
        Iterator<Trigger> it = getTriggerList().iterator();
        while (it.hasNext()) {
            if (it.next().mo27829L1()) {
                return true;
            }
        }
        Iterator<Action> it2 = getActions().iterator();
        while (it2.hasNext()) {
            if (it2.next().mo27829L1()) {
                return true;
            }
        }
        for (Constraint L1 : getConstraints()) {
            if (L1.mo27829L1()) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid() {
        if (this.m_actionList.size() < 1 || getTriggerList().size() < 1) {
            return false;
        }
        Iterator<Trigger> it = getTriggerList().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            if (next.mo27822G1() && !next.mo24824M1()) {
                return false;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            Action next2 = it2.next();
            if (next2.mo27822G1() && !next2.mo24824M1()) {
                return false;
            }
        }
        for (Constraint next3 : getAllConstraints()) {
            if (next3.mo27822G1() && !next3.mo24824M1()) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidForRun() {
        if (this.m_actionList.size() < 1) {
            return false;
        }
        if (getTriggerList().size() < 1) {
            C4878b.m18883v("Not valid for running. Trigger list is empty", getGUID());
            return false;
        }
        Iterator<Trigger> it = getTriggerList().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            if (next.mo27822G1() && !next.mo24824M1() && !next.mo25030W()) {
                C4878b.m18883v("Invlaid trigger: " + next.mo24738G0(), getGUID());
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            Action next2 = it2.next();
            if (next2.mo27822G1() && !next2.mo24824M1() && !next2.mo25030W()) {
                C4878b.m18883v("Invalid action within macro: " + next2.mo24738G0(), getGUID());
            }
        }
        for (Constraint next3 : getAllConstraints()) {
            if (next3.mo27822G1() && !next3.mo24824M1() && !next3.mo25030W()) {
                C4878b.m18883v("Invalid constraint within macro: " + next3.mo24738G0(), getGUID());
            }
        }
        return true;
    }

    public void notifyVariableListenersOnCorrectThread(MacroDroidVariable macroDroidVariable, VariableValue variableValue, VariableValue variableValue2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lambda$notifyVariableListenersOnCorrectThread$2(macroDroidVariable, variableValue, variableValue2);
        } else {
            new Handler(Looper.getMainLooper()).post(new C4918d(this, macroDroidVariable, variableValue, variableValue2));
        }
    }

    public void onEditScreenClosed() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            it.next().mo31545c3();
        }
    }

    public void persistMacro() {
        C4934n.m18998M().mo29695o0(this);
    }

    public void removeAction(Action action) {
        this.m_actionList.remove(action);
        action.mo24691T2();
    }

    public void removeConstraint(Constraint constraint) {
        constraint.mo28113U2();
        this.m_constraintList.remove(constraint);
    }

    public void removeItem(SelectableItem selectableItem) {
        if (selectableItem instanceof Trigger) {
            removeTrigger((Trigger) selectableItem);
            return;
        }
        boolean z = false;
        if (selectableItem instanceof Action) {
            if (selectableItem instanceof LoopAction) {
                int c = C6416p0.m24706c(getActions(), getActions().indexOf(selectableItem));
                if (c >= 0) {
                    removeAction(getActions().get(c));
                }
            } else if ((selectableItem instanceof IfConditionAction) || (selectableItem instanceof IfConfirmedThenAction)) {
                ArrayList<Action> actions = getActions();
                int indexOf = actions.indexOf(selectableItem);
                int b = C6416p0.m24705b(actions, indexOf);
                ArrayList<Integer> arrayList = new ArrayList<>();
                int i = indexOf;
                do {
                    i = C6416p0.m24707d(actions, i);
                    if (i >= 0) {
                        arrayList.add(0, Integer.valueOf(i));
                        continue;
                    }
                } while (i >= 0);
                int a = C6416p0.m24704a(actions, indexOf);
                if (b >= 0) {
                    removeAction(actions.get(b));
                }
                if (a >= 0 && a < b) {
                    removeAction(actions.get(a));
                }
                for (Integer intValue : arrayList) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 >= 0 && intValue2 < b) {
                        removeAction(actions.get(intValue2));
                    }
                }
            }
            removeAction((Action) selectableItem);
            return;
        }
        findChildByGUID(selectableItem.mo27847f1());
        Iterator<Action> it = getActions().iterator();
        while (it.hasNext()) {
            z = deleteChildConstraint(it.next(), selectableItem);
        }
        Iterator<Trigger> it2 = getTriggerList().iterator();
        while (it2.hasNext()) {
            z = deleteChildConstraint(it2.next(), selectableItem);
        }
        if (!z) {
            for (Constraint deleteChildConstraint : getConstraints()) {
                z = deleteChildConstraint(deleteChildConstraint, selectableItem);
            }
            if (!z) {
                removeConstraint((Constraint) selectableItem);
            }
        }
    }

    public void removeItemAndChildren(ParentAction parentAction) {
        ArrayList<Action> actions = getActions();
        int indexOf = getActions().indexOf(parentAction);
        for (int f = C6416p0.m24709f(actions, indexOf); f >= indexOf; f--) {
            actions.remove(f);
        }
    }

    public void removeLocalVariableUpdatedListener(C4068u1 u1Var) {
        synchronized (this.localVariableUpdatedListeners) {
            this.localVariableUpdatedListeners.remove(u1Var);
        }
    }

    public void removeTrigger(Trigger trigger) {
        this.m_triggerList.remove(trigger);
        trigger.mo31543T2();
    }

    public void renameLocalVariable(MacroDroidVariable macroDroidVariable, String str) {
        macroDroidVariable.mo27765k0(str);
        persistMacro();
    }

    public boolean requiresAccessibity() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo24749f2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo24749f2()) {
                return true;
            }
        }
        for (Constraint f2 : this.m_constraintList) {
            if (f2.mo24749f2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresCanDrawOverlays() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo24893h2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo24893h2()) {
                return true;
            }
        }
        for (Constraint h2 : this.m_constraintList) {
            if (h2.mo24893h2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresDefaultAssist() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo25569i2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo25569i2()) {
                return true;
            }
        }
        for (Constraint i2 : this.m_constraintList) {
            if (i2.mo25569i2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresDeviceAdmin() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo24958j2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo24958j2()) {
                return true;
            }
        }
        for (Constraint j2 : this.m_constraintList) {
            if (j2.mo24958j2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresFingerprintAccessibility() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo27852l2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo27852l2()) {
                return true;
            }
        }
        for (Constraint l2 : this.m_constraintList) {
            if (l2.mo27852l2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresLocationServicesEnabled() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo25733n2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo25733n2()) {
                return true;
            }
        }
        for (Constraint n2 : this.m_constraintList) {
            if (n2.mo25733n2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresNewHelperFileVersion() {
        int d = C4031k.m15904d();
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo27858o2(d)) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo27858o2(d)) {
                return true;
            }
        }
        for (Constraint o2 : this.m_constraintList) {
            if (o2.mo27858o2(d)) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresNotificationAccess() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo24773q2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo24773q2()) {
                return true;
            }
        }
        for (Constraint q2 : this.m_constraintList) {
            if (q2.mo24773q2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresUiInteractionAccessibility() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo25499r2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo25499r2()) {
                return true;
            }
        }
        for (Constraint r2 : this.m_constraintList) {
            if (r2.mo25499r2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresUsageAccess() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo27866s2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo27866s2()) {
                return true;
            }
        }
        for (Constraint s2 : this.m_constraintList) {
            if (s2.mo27866s2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresVolumeAccessibility() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo27868t2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo27868t2()) {
                return true;
            }
        }
        for (Constraint t2 : this.m_constraintList) {
            if (t2.mo27868t2()) {
                return true;
            }
        }
        return false;
    }

    public boolean requiresWriteSettings() {
        Iterator<Trigger> it = this.m_triggerList.iterator();
        while (it.hasNext()) {
            if (it.next().mo25103u2()) {
                return true;
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            if (it2.next().mo25103u2()) {
                return true;
            }
        }
        for (Constraint u2 : this.m_constraintList) {
            if (u2.mo25103u2()) {
                return true;
            }
        }
        return false;
    }

    public void setActionBeingConfigured(Action action) {
        this.m_actionBeingConfigured = action;
    }

    public void setActionBlocksToImport(List<ActionBlock> list) {
        this.actionBlocksToImport = list;
    }

    public void setCategory(String str) {
        this.m_category = str;
    }

    public void setCompleted(boolean z) {
        this.m_completed = z;
    }

    public void setConfiguringShortcut(boolean z) {
        this.m_configuringShortcut = z;
    }

    public void setConstraintIsOrCondition(boolean z) {
        this.m_isOrCondition = z;
    }

    public void setDescription(String str) {
        this.m_description = str;
    }

    public void setDescriptionOpen(boolean z) {
        this.m_descriptionOpen = z;
    }

    public void setEnabled(boolean z) {
        setEnabled(z, true);
    }

    public void setEnabledFlag(boolean z) {
        this.m_enabled = z;
    }

    public void setEnabledStateDuringLoad(boolean z) {
        this.enabledStateDuringLoad = z;
    }

    public void setExcludeFromLog(boolean z) {
        this.m_excludeLog = z;
    }

    public void setExportedActionBlocks(List<ActionBlock> list) {
        this.exportedActionBlocks = list;
    }

    public void setGUID(long j) {
        this.m_GUID = j;
    }

    public void setHeadingColor(@ColorInt int i) {
        this.m_headingColor = i;
    }

    public void setId(int i) {
        this.m_uniqueId = i;
    }

    public void setIsBeingImported(boolean z) {
        this.isBeingImported = z;
    }

    public void setIsClonedInstance(boolean z) {
        this.isClonedInstance = z;
    }

    public void setIsFavourite(boolean z) {
        this.isFavourite = z;
    }

    public void setLastEditedTimestamp(long j) {
        this.lastEditedTimestamp = j;
    }

    public void setName(String str) {
        this.m_name = str;
    }

    public void setNewRandomGUID() {
        long j = this.m_GUID;
        this.m_GUID = UUID.randomUUID().getLeastSignificantBits();
        Iterator<Trigger> it = getTriggerList().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            updateGUIDRefsIfRequired(j, this.m_GUID, next);
            for (Constraint next2 : next.mo27826J0()) {
                updateGUIDRefsIfRequired(j, this.m_GUID, next2);
                next2.mo28113U2();
            }
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            Action next3 = it2.next();
            updateGUIDRefsIfRequired(j, this.m_GUID, next3);
            next3.mo24691T2();
            for (Constraint next4 : next3.mo27826J0()) {
                updateGUIDRefsIfRequired(j, this.m_GUID, next4);
                next4.mo28113U2();
            }
        }
        for (Constraint next5 : this.m_constraintList) {
            updateGUIDRefsIfRequired(j, this.m_GUID, next5);
            next5.mo28113U2();
        }
    }

    public void setOriginalTriggerContextInfo(@Nullable TriggerContextInfo triggerContextInfo2) {
        this.originalTriggerContextInfo = triggerContextInfo2;
    }

    public void setTag(Object obj) {
        this.m_tag = obj;
    }

    public void setTemplateSelected() {
        Iterator<Trigger> it = getTriggerList().iterator();
        while (it.hasNext()) {
            it.next().mo24888J2();
        }
        Iterator<Action> it2 = this.m_actionList.iterator();
        while (it2.hasNext()) {
            it2.next().mo24888J2();
        }
        for (Constraint J2 : getAllConstraints()) {
            J2.mo24888J2();
        }
    }

    public void setTrigger(Trigger trigger) {
        this.m_trigger = trigger;
    }

    public void setTriggerContextInfo(TriggerContextInfo triggerContextInfo2) {
        this.triggerContextInfo = triggerContextInfo2;
    }

    public void setTriggerThatInvoked(Trigger trigger) {
        this.triggerThatInvoked = trigger;
        if (trigger != null) {
            setTriggerContextInfo(new TriggerContextInfo(this.triggerThatInvoked));
        } else {
            setTriggerContextInfo((TriggerContextInfo) null);
        }
    }

    public void setWaitForTriggerActive(WaitUntilTriggerAction waitUntilTriggerAction) {
        this.actionWaitingForTriggerActive = waitUntilTriggerAction;
    }

    public List<MacroDroidVariable> sortVariables(List<MacroDroidVariable> list) {
        Collections.sort(list, new C4919e(C5163j2.m19963F0(MacroDroidApplication.m14845u())));
        return list;
    }

    public String toString() {
        return this.m_name + ":" + this.m_description;
    }

    public void updateEnabledStateBasedOnGlobalState(Set<String> set) {
        if (!sMacroDroidEnabled || !isEnabled() || set.contains(getCategory())) {
            Iterator<Trigger> it = getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                next.mo31543T2();
                for (Constraint U2 : next.mo27826J0()) {
                    U2.mo28113U2();
                }
            }
            Iterator<Action> it2 = this.m_actionList.iterator();
            while (it2.hasNext()) {
                Action next2 = it2.next();
                next2.mo24691T2();
                for (Constraint U22 : next2.mo27826J0()) {
                    U22.mo28113U2();
                }
            }
            for (Constraint U23 : this.m_constraintList) {
                U23.mo28113U2();
            }
            return;
        }
        for (Constraint next3 : this.m_constraintList) {
            if (next3.mo27822G1()) {
                next3.mo28114W2();
            }
        }
        Iterator<Action> it3 = this.m_actionList.iterator();
        while (it3.hasNext()) {
            Action next4 = it3.next();
            for (Constraint next5 : next4.mo27826J0()) {
                if (next5.mo27822G1()) {
                    next5.mo28114W2();
                }
            }
            next4.mo24696W2();
        }
        Iterator<Trigger> it4 = getTriggerList().iterator();
        while (it4.hasNext()) {
            Trigger next6 = it4.next();
            for (Constraint next7 : next6.mo27826J0()) {
                if (next7.mo27822G1()) {
                    next7.mo28114W2();
                }
            }
            next6.mo31542Q2();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void variableUpdate(com.arlosoft.macrodroid.common.MacroDroidVariable r6, com.arlosoft.macrodroid.variables.VariableValue r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.getName()     // Catch:{ all -> 0x0053 }
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r5.findLocalVariableByName(r0)     // Catch:{ all -> 0x0053 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0044
            java.util.List r6 = r7.getParentKeys()     // Catch:{ all -> 0x0053 }
            com.arlosoft.macrodroid.variables.VariableValue$DictionaryEntry r6 = r0.mo27742R(r6, r2)     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x001c
            com.arlosoft.macrodroid.variables.VariableValue r6 = r6.getVariable()     // Catch:{ all -> 0x0053 }
            goto L_0x0020
        L_0x001c:
            com.arlosoft.macrodroid.variables.VariableValue r6 = r0.mo27746V()     // Catch:{ all -> 0x0053 }
        L_0x0020:
            java.lang.String r3 = r7.getComparisonValueAsText()     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = r6.getComparisonValueAsText()     // Catch:{ all -> 0x0053 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0030
            monitor-exit(r5)
            return
        L_0x0030:
            boolean r3 = r5.m_excludeLog     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            r0.mo27767l0(r7, r1, r6, r5)     // Catch:{ all -> 0x0053 }
            com.arlosoft.macrodroid.macro.n r1 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ all -> 0x0053 }
            r1.mo29688f0(r5)     // Catch:{ all -> 0x0053 }
            r5.notifyVariableListenersOnCorrectThread(r0, r7, r6)     // Catch:{ all -> 0x0053 }
            goto L_0x0051
        L_0x0044:
            com.arlosoft.macrodroid.common.u r0 = com.arlosoft.macrodroid.common.C4064u.m16048t()     // Catch:{ all -> 0x0053 }
            boolean r3 = r5.m_excludeLog     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            r0.mo27980P(r6, r7, r1, r5)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r5)
            return
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.Macro.variableUpdate(com.arlosoft.macrodroid.common.MacroDroidVariable, com.arlosoft.macrodroid.variables.VariableValue):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m_trigger, i);
        parcel.writeList(this.m_triggerList);
        parcel.writeList(this.m_actionList);
        parcel.writeList(this.m_constraintList);
        parcel.writeList(this.localVariables);
        parcel.writeString(this.m_name);
        parcel.writeInt(this.m_enabled ? 1 : 0);
        parcel.writeInt(this.m_isOrCondition ? 1 : 0);
        parcel.writeInt(this.m_configuringShortcut ? 1 : 0);
        parcel.writeInt(this.m_uniqueId);
        parcel.writeString(this.m_category);
        if (this.m_GUID == 0) {
            this.m_GUID = UUID.randomUUID().getLeastSignificantBits();
        }
        parcel.writeLong(this.m_GUID);
        parcel.writeString(this.m_description);
        parcel.writeInt(this.m_descriptionOpen ? 1 : 0);
        parcel.writeInt(this.m_excludeLog ? 1 : 0);
        parcel.writeInt(this.m_headingColor);
        parcel.writeInt(this.isActionBlock ? 1 : 0);
        parcel.writeInt(this.isBeingImported ? 1 : 0);
        parcel.writeInt(this.isClonedInstance ? 1 : 0);
        parcel.writeInt(this.isFavourite ? 1 : 0);
        parcel.writeLong(this.lastEditedTimestamp);
        parcel.writeList(this.exportedActionBlocks);
    }

    private ArrayList<Trigger> getTriggerList(boolean z) {
        if (this.m_triggerList == null) {
            this.m_triggerList = new ArrayList<>();
        }
        if (this.m_triggerList.size() == 0) {
            Trigger trigger = this.m_trigger;
            if (trigger != null) {
                this.m_triggerList.add(trigger);
            }
            this.m_trigger = null;
        }
        if (!z || this.actionWaitingForTriggerActive == null) {
            return this.m_triggerList;
        }
        ArrayList<Trigger> arrayList = new ArrayList<>();
        arrayList.addAll(this.actionWaitingForTriggerActive.mo26117B3());
        arrayList.addAll(this.m_triggerList);
        return arrayList;
    }

    public boolean canInvoke(@Nullable TriggerContextInfo triggerContextInfo2, boolean z) {
        boolean z2;
        int i;
        if (this.isActionBlock) {
            return true;
        }
        if ((!z && !sMacroDroidEnabled) || isCategoryDisabled()) {
            return false;
        }
        Trigger trigger = null;
        if (triggerContextInfo2 != null) {
            trigger = triggerContextInfo2.mo31564q();
        }
        if (this.m_constraintList.size() > 0) {
            if (!isConstraintOrCondition()) {
                Iterator<Constraint> it = this.m_constraintList.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Constraint next = it.next();
                    if (next.mo27822G1()) {
                        i++;
                        if (!next.mo28111R2(triggerContextInfo2)) {
                            if (this.m_excludeLog) {
                                if (trigger != null) {
                                    C4878b.m18863b(trigger.mo24728k1(triggerContextInfo2) + " did not fire because constraint failed: " + next.mo24728k1(triggerContextInfo2) + " (" + getName() + ")", getGUID());
                                } else {
                                    C4878b.m18863b(getName() + " did not invoke because constraint failed: " + next.mo24728k1(triggerContextInfo2) + " (" + getName() + ")", getGUID());
                                }
                            }
                            z2 = false;
                        }
                    }
                }
            } else {
                Iterator<Constraint> it2 = this.m_constraintList.iterator();
                String str = "";
                i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    Constraint next2 = it2.next();
                    if (next2.mo27822G1()) {
                        i++;
                        if (next2.mo28111R2(triggerContextInfo2)) {
                            z2 = true;
                            break;
                        } else if (str.isEmpty()) {
                            str = next2.mo24738G0();
                        }
                    }
                }
                if (!z2 && !this.m_excludeLog) {
                    if (trigger == null) {
                        C4878b.m18863b(getName() + " did not fire because no constraints were true (" + str + ")", getGUID());
                    } else if (this.m_constraintList.size() > 1) {
                        C4878b.m18863b(trigger.mo24738G0() + " did not fire because no constraints were true (" + str + ")", getGUID());
                    } else if (this.m_constraintList.size() == 1) {
                        C4878b.m18863b(trigger.mo24738G0() + " did not fire because constraint failed: " + this.m_constraintList.get(0).mo24738G0() + " (" + getName() + ")", getGUID());
                    }
                }
            }
        } else {
            z2 = true;
            i = 0;
        }
        if (i == 0 || z2) {
            return true;
        }
        return false;
    }

    public void invokeActions(TriggerContextInfo triggerContextInfo2, boolean z) {
        if (z) {
            this.forceEvenIfNotEnabledTimestamp = System.currentTimeMillis();
        } else {
            this.forceEvenIfNotEnabledTimestamp = 0;
        }
        invokeActionsInternal(triggerContextInfo2, z, (ResumeMacroInfo) null);
    }

    public void setEnabled(boolean z, boolean z2) {
        boolean z3;
        if (this.m_enabled != z) {
            this.m_enabled = z;
            C4934n.m19014l0();
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            this.disabledTimestamp = 0;
            if (sMacroDroidEnabled && !C5163j2.m19991J(MacroDroidApplication.m14845u()).contains(this.m_category)) {
                if (!this.isActionBlock) {
                    C4878b.m18880s("Enabling macro: " + getName(), getGUID());
                }
                for (Constraint next : this.m_constraintList) {
                    if (next.mo27822G1()) {
                        next.mo27839Y();
                        next.mo28114W2();
                    }
                }
                Iterator<Action> it = this.m_actionList.iterator();
                while (it.hasNext()) {
                    Action next2 = it.next();
                    for (Constraint next3 : next2.mo27826J0()) {
                        if (next3.mo27822G1()) {
                            next3.mo27839Y();
                            next3.mo28114W2();
                        }
                    }
                    next2.mo27839Y();
                    next2.mo24696W2();
                }
                Iterator<Trigger> it2 = getTriggerList().iterator();
                while (it2.hasNext()) {
                    Trigger next4 = it2.next();
                    for (Constraint next5 : next4.mo27826J0()) {
                        if (next5.mo27822G1()) {
                            next5.mo27839Y();
                            next5.mo28114W2();
                        }
                    }
                    next4.mo31542Q2();
                }
                return;
            }
            return;
        }
        if (z3) {
            this.disabledTimestamp = System.currentTimeMillis();
            Iterator<Trigger> it3 = getTriggerList().iterator();
            while (it3.hasNext()) {
                Trigger next6 = it3.next();
                next6.mo31543T2();
                for (Constraint U2 : next6.mo27826J0()) {
                    U2.mo28113U2();
                }
            }
            Iterator<Action> it4 = this.m_actionList.iterator();
            while (it4.hasNext()) {
                Action next7 = it4.next();
                next7.mo24691T2();
                for (Constraint U22 : next7.mo27826J0()) {
                    U22.mo28113U2();
                }
            }
            for (Constraint U23 : this.m_constraintList) {
                U23.mo28113U2();
            }
            if (z2 && !this.isActionBlock) {
                C4878b.m18880s("Disabling macro: " + getName(), getGUID());
            }
        }
        ContinuePausedActionsHandler.m18973b(MacroDroidApplication.m14845u(), this);
    }

    public void invokeActions(TriggerContextInfo triggerContextInfo2, boolean z, ResumeMacroInfo resumeMacroInfo) {
        invokeActionsInternal(triggerContextInfo2, z, resumeMacroInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0260, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invokeActions(java.util.List<com.arlosoft.macrodroid.action.Action> r18, int r19, com.arlosoft.macrodroid.triggers.TriggerContextInfo r20, boolean r21, java.util.Stack<java.lang.Integer> r22, @androidx.annotation.Nullable com.arlosoft.macrodroid.data.ResumeMacroInfo r23) {
        /*
            r17 = this;
            r9 = r17
            r1 = r18
            r5 = r20
            r6 = r22
            r7 = r23
            r0 = 0
            r9.activeShellScriptAction = r0
            int r2 = r9.m_invokeCount
            r3 = 1
            int r2 = r2 + r3
            r9.m_invokeCount = r2
            r4 = 0
            r8 = 500(0x1f4, float:7.0E-43)
            if (r2 <= r8) goto L_0x005d
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 1
            long r14 = r9.m_invokeStart
            long r10 = r10 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r14
            long r10 = java.lang.Math.max(r12, r10)
            int r2 = r9.m_invokeCount
            long r12 = (long) r2
            long r12 = r12 / r10
            r10 = 500(0x1f4, double:2.47E-321)
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x005d
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            r1 = 2131955121(0x7f130db1, float:1.954676E38)
            android.widget.Toast r0 = p319lc.C15626c.makeText(r0, r1, r4)
            r0.show()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r17.getName()
            r0.append(r1)
            java.lang.String r1 = " macro attempting to invoke actions too rapidly. If running in a loop you should add a wait before next action to prevent rapid iteration."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            long r1 = r17.getGUID()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r1)
            return
        L_0x005d:
            r2 = r19
        L_0x005f:
            int r8 = r18.size()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 >= r8) goto L_0x0458
            boolean r8 = r9 instanceof com.arlosoft.macrodroid.actionblock.data.ActionBlock     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x007f
            r8 = r9
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r8 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r8     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.macro.Macro r8 = r8.getTopLevelParentMacro()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x007f
            r8 = r9
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r8 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r8     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.macro.Macro r8 = r8.getTopLevelParentMacro()     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r8 = r8.m_cancelFlag     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x007f
            r9.m_cancelFlag = r3     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x007f:
            boolean r8 = r9.m_cancelFlag     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x0085
            goto L_0x0458
        L_0x0085:
            if (r21 == 0) goto L_0x008f
            long r10 = r9.disabledTimestamp     // Catch:{ StackOverflowError -> 0x04d5 }
            long r12 = r9.forceEvenIfNotEnabledTimestamp     // Catch:{ StackOverflowError -> 0x04d5 }
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x009b
        L_0x008f:
            boolean r8 = sMacroDroidEnabled     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x0458
            boolean r8 = r17.isEnabled()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x009b
            goto L_0x0458
        L_0x009b:
            java.lang.Object r8 = r1.get(r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.Action r8 = (com.arlosoft.macrodroid.action.Action) r8     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.macro.Macro r10 = r8.mo27837X0()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x00aa
            r8.mo24687G2(r9)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x00aa:
            r9.setTriggerContextInfo(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ConditionAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x00b7
            boolean r10 = r8.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x00bd
        L_0x00b7:
            boolean r10 = r8.mo27845e0(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x00bf
        L_0x00bd:
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            boolean r11 = r8 instanceof com.arlosoft.macrodroid.action.EndIfAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 != 0) goto L_0x00c8
            boolean r11 = r8 instanceof com.arlosoft.macrodroid.action.ElseParentAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 == 0) goto L_0x00dc
        L_0x00c8:
            int r11 = r1.indexOf(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            int r11 = com.arlosoft.macrodroid.utils.C6416p0.m24710g(r1, r11)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 < 0) goto L_0x00dc
            java.lang.Object r10 = r1.get(r11)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.Action r10 = (com.arlosoft.macrodroid.action.Action) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r10 = r10.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x00dc:
            if (r10 == 0) goto L_0x0455
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.PauseAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0139
            r0 = r8
            com.arlosoft.macrodroid.action.PauseAction r0 = (com.arlosoft.macrodroid.action.PauseAction) r0     // Catch:{ StackOverflowError -> 0x04d5 }
            int r1 = r0.mo25460j3()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.common.MacroDroidVariable r4 = r0.mo24432s()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r4 == 0) goto L_0x011b
            com.arlosoft.macrodroid.common.MacroDroidVariable r4 = r0.mo24432s()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r4 = r4.getName()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.common.MacroDroidVariable r4 = r0.mo27861q(r4)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r4 == 0) goto L_0x011b
            com.arlosoft.macrodroid.variables.DictionaryKeys r10 = r0.mo24426b()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.Double r4 = r4.mo27734F(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r4 == 0) goto L_0x011b
            double r10 = r4.doubleValue()     // Catch:{ StackOverflowError -> 0x04d5 }
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r10 = r10 * r12
            int r1 = (int) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            int r4 = r0.mo25461k3()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r4 != r3) goto L_0x011b
            int r1 = r1 * 60
        L_0x011b:
            r10 = r1
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r9.triggerContextInfo     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.logAction(r8, r1)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r1 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = r2 + r3
            boolean r8 = r0.mo25462l3()     // Catch:{ StackOverflowError -> 0x04d5 }
            r0 = r17
            r3 = r22
            r4 = r23
            r5 = r20
            r6 = r10
            r7 = r21
            com.arlosoft.macrodroid.macro.ContinuePausedActionsHandler.m18975d(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0139:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.IfConditionAction     // Catch:{ StackOverflowError -> 0x04d5 }
            r11 = -1
            if (r10 != 0) goto L_0x0324
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ElseIfConditionAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x0324
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0148
            goto L_0x0324
        L_0x0148:
            boolean r10 = r8 instanceof p057a2.C2212a     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0163
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r9.triggerContextInfo     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.logAction(r8, r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            r0 = r8
            a2.a r0 = (p057a2.C2212a) r0     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = r2 + r3
            r8 = 0
            r1 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r8
            r0.mo24421h(r1, r2, r3, r4, r5, r6)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0163:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.SetVariableAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0185
            r10 = r8
            com.arlosoft.macrodroid.action.SetVariableAction r10 = (com.arlosoft.macrodroid.action.SetVariableAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r10 = r10.mo25692c4()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0185
            r0 = r8
            com.arlosoft.macrodroid.action.SetVariableAction r0 = (com.arlosoft.macrodroid.action.SetVariableAction) r0     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = r2 + r3
            r1 = r20
            r3 = r22
            r4 = r21
            r5 = r23
            r0.mo25695g4(r1, r2, r3, r4, r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r9.triggerContextInfo     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.logAction(r8, r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0185:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.CancelActiveMacroAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x019e
            r10 = r8
            com.arlosoft.macrodroid.action.CancelActiveMacroAction r10 = (com.arlosoft.macrodroid.action.CancelActiveMacroAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            long r12 = r10.mo24799p3()     // Catch:{ StackOverflowError -> 0x04d5 }
            long r14 = r17.getGUID()     // Catch:{ StackOverflowError -> 0x04d5 }
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x019e
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = r9.triggerContextInfo     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.logAction(r8, r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x019e:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.LoopAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x022b
            r10 = r8
            com.arlosoft.macrodroid.action.LoopAction r10 = (com.arlosoft.macrodroid.action.LoopAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r12 = r9.m_resetLoopCount     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 == 0) goto L_0x01b9
            boolean r12 = r10 instanceof com.arlosoft.macrodroid.action.IterateDictionaryAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 == 0) goto L_0x01b4
            r12 = r10
            com.arlosoft.macrodroid.action.IterateDictionaryAction r12 = (com.arlosoft.macrodroid.action.IterateDictionaryAction) r12     // Catch:{ StackOverflowError -> 0x04d5 }
            r12.mo25248g4()     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x01b7
        L_0x01b4:
            r10.mo25327X3()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x01b7:
            r9.m_resetLoopCount = r4     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x01b9:
            boolean r12 = r10 instanceof com.arlosoft.macrodroid.action.IterateDictionaryAction     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r13 = "No corresponding end loop for a loop"
            if (r12 == 0) goto L_0x01e6
            r8 = r10
            com.arlosoft.macrodroid.action.IterateDictionaryAction r8 = (com.arlosoft.macrodroid.action.IterateDictionaryAction) r8     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r12 = r8.mo25249h4()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 != 0) goto L_0x01df
            p064c2.C2267a.m9335d(r9, r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.IterateDictionaryAction r10 = (com.arlosoft.macrodroid.action.IterateDictionaryAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            r10.mo25248g4()     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = com.arlosoft.macrodroid.utils.C6416p0.m24706c(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != r11) goto L_0x0455
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ StackOverflowError -> 0x04d5 }
            r0.<init>(r13)     // Catch:{ StackOverflowError -> 0x04d5 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x01df:
            com.arlosoft.macrodroid.action.IterateDictionaryAction r10 = (com.arlosoft.macrodroid.action.IterateDictionaryAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            p064c2.C2267a.m9332a(r9, r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x0455
        L_0x01e6:
            int r12 = r10.mo25325R3()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 != r3) goto L_0x0207
            boolean r12 = r10.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 == 0) goto L_0x0207
            boolean r8 = r8.mo27845e0(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x0455
            int r2 = com.arlosoft.macrodroid.utils.C6416p0.m24706c(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != r11) goto L_0x0455
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ StackOverflowError -> 0x04d5 }
            r0.<init>(r13)     // Catch:{ StackOverflowError -> 0x04d5 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0207:
            int r8 = r10.mo25325R3()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x0455
            boolean r8 = r10.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x0455
            boolean r8 = r10.mo25326T3()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x0455
            r10.mo25327X3()     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = com.arlosoft.macrodroid.utils.C6416p0.m24706c(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != r11) goto L_0x0455
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ StackOverflowError -> 0x04d5 }
            r0.<init>(r13)     // Catch:{ StackOverflowError -> 0x04d5 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x022b:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.EndLoopAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0261
            int r8 = com.arlosoft.macrodroid.utils.C6416p0.m24711h(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 < 0) goto L_0x0455
            java.lang.Object r10 = r1.get(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.LoopAction r10 = (com.arlosoft.macrodroid.action.LoopAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r11 = r10.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 == 0) goto L_0x0455
            int r11 = r10.mo25325R3()     // Catch:{ StackOverflowError -> 0x04d5 }
            r12 = 2
            if (r11 != r12) goto L_0x0250
            boolean r10 = r10.mo27845e0(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x0250
            goto L_0x0455
        L_0x0250:
            r0 = r17
            r1 = r18
            r2 = r8
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r0.invokeActions(r1, r2, r3, r4, r5, r6)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0261:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.BreakFromLoopAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x02ac
            int r8 = com.arlosoft.macrodroid.utils.C6416p0.m24706c(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24711h(r1, r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 < 0) goto L_0x0280
            java.lang.Object r11 = r1.get(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r11 = r11 instanceof com.arlosoft.macrodroid.action.IterateDictionaryAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 == 0) goto L_0x0280
            java.lang.Object r10 = r1.get(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.IterateDictionaryAction r10 = (com.arlosoft.macrodroid.action.IterateDictionaryAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            r10.mo25248g4()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0280:
            int r10 = r2 + 1
        L_0x0282:
            if (r10 >= r8) goto L_0x0298
            java.lang.Object r11 = r1.get(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r11 = r11 instanceof com.arlosoft.macrodroid.action.EndIfAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 == 0) goto L_0x0295
            boolean r11 = r22.isEmpty()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r11 != 0) goto L_0x0295
            r22.pop()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0295:
            int r10 = r10 + 1
            goto L_0x0282
        L_0x0298:
            if (r8 < 0) goto L_0x0455
            int r2 = r8 + 1
            r0 = r17
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r0.invokeActions(r1, r2, r3, r4, r5, r6)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x02ac:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ContinueLoopAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x02c7
            int r8 = com.arlosoft.macrodroid.utils.C6416p0.m24711h(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 < 0) goto L_0x0455
            r0 = r17
            r1 = r18
            r2 = r8
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r0.invokeActions(r1, r2, r3, r4, r5, r6)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x02c7:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ElseAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0302
            boolean r8 = r22.isEmpty()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x02d4
            r22.pop()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x02d4:
            int r8 = com.arlosoft.macrodroid.utils.C6416p0.m24710g(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != r11) goto L_0x02e5
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r1 = "No corresponding if for an else clause"
            r0.<init>(r1)     // Catch:{ StackOverflowError -> 0x04d5 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x02e5:
            java.lang.Object r8 = r1.get(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.Action r8 = (com.arlosoft.macrodroid.action.Action) r8     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r8 = r8.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 == 0) goto L_0x0455
            int r2 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != r11) goto L_0x0455
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r1 = "No corresponding end if for an else clause"
            r0.<init>(r1)     // Catch:{ StackOverflowError -> 0x04d5 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0302:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.EndParentAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0311
            boolean r8 = r22.isEmpty()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x0455
            r22.pop()     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x0455
        L_0x0311:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ShellScriptAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x031a
            r10 = r8
            com.arlosoft.macrodroid.action.ShellScriptAction r10 = (com.arlosoft.macrodroid.action.ShellScriptAction) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.activeShellScriptAction = r10     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x031a:
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r10 = r9.triggerContextInfo     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.logAction(r8, r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            r8.mo24698b3(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x0455
        L_0x0324:
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r10 = r9.triggerContextInfo     // Catch:{ StackOverflowError -> 0x04d5 }
            r9.logAction(r8, r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r10 = r22.isEmpty()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0331
            r10 = 0
            goto L_0x033b
        L_0x0331:
            java.lang.Object r10 = r22.peek()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ StackOverflowError -> 0x04d5 }
            int r10 = r10.intValue()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x033b:
            boolean r12 = r8 instanceof com.arlosoft.macrodroid.action.ElseParentAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 == 0) goto L_0x0368
            if (r10 <= 0) goto L_0x0368
            boolean r2 = r9.m_excludeLog     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != 0) goto L_0x0362
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ StackOverflowError -> 0x04d5 }
            r2.<init>()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = "SKIPPING TO ENDIF (Index "
            r2.append(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            r2.append(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = ")"
            r2.append(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r2 = r2.toString()     // Catch:{ StackOverflowError -> 0x04d5 }
            long r11 = r17.getGUID()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18865d(r2, r11, r0)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0362:
            r22.pop()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0365:
            r2 = r10
            goto L_0x0455
        L_0x0368:
            boolean r10 = r8.mo27822G1()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x0370
            goto L_0x0455
        L_0x0370:
            boolean r10 = r8.mo27846f0(r5, r3)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x03e9
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.IfConditionAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0381
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ StackOverflowError -> 0x04d5 }
            r6.push(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0381:
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            int r12 = com.arlosoft.macrodroid.utils.C6416p0.m24707d(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r12 < 0) goto L_0x0394
            if (r12 >= r10) goto L_0x0394
            int r10 = r12 + -1
            goto L_0x0399
        L_0x0394:
            if (r2 < 0) goto L_0x0399
            if (r2 >= r10) goto L_0x0399
            r10 = r2
        L_0x0399:
            boolean r13 = r9.m_excludeLog     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r13 != 0) goto L_0x03c1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ StackOverflowError -> 0x04d5 }
            r13.<init>()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r14 = "IF CLAUSE FALSE: "
            r13.append(r14)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = r8.mo24728k1(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            r13.append(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = " Next action = "
            r13.append(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            r13.append(r10)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = r13.toString()     // Catch:{ StackOverflowError -> 0x04d5 }
            long r13 = r17.getGUID()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18880s(r8, r13)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x03c1:
            if (r10 != r11) goto L_0x03ce
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r1 = "No corresponding end if or else for an if"
            r0.<init>(r1)     // Catch:{ StackOverflowError -> 0x04d5 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x03ce:
            if (r12 != r11) goto L_0x0365
            if (r2 != r11) goto L_0x0365
            boolean r2 = r22.isEmpty()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != 0) goto L_0x0365
            java.lang.Object r2 = r22.peek()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = r2.intValue()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 != 0) goto L_0x0365
            r22.pop()     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x0365
        L_0x03e9:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.IfConfirmedThenAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x03ff
            r0 = r8
            com.arlosoft.macrodroid.action.IfConfirmedThenAction r0 = (com.arlosoft.macrodroid.action.IfConfirmedThenAction) r0     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = r2 + r3
            r8 = 0
            r1 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r8
            r0.mo24421h(r1, r2, r3, r4, r5, r6)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x03ff:
            boolean r10 = r8 instanceof com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x0415
            r0 = r8
            com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction r0 = (com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction) r0     // Catch:{ StackOverflowError -> 0x04d5 }
            int r2 = r2 + r3
            r8 = 0
            r1 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r8
            r0.mo24991h(r1, r2, r3, r4, r5, r6)     // Catch:{ StackOverflowError -> 0x04d5 }
            return
        L_0x0415:
            boolean r10 = r9.m_excludeLog     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 != 0) goto L_0x0435
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ StackOverflowError -> 0x04d5 }
            r10.<init>()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r11 = "IF CLAUSE TRUE: "
            r10.append(r11)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = r8.mo24728k1(r5)     // Catch:{ StackOverflowError -> 0x04d5 }
            r10.append(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.String r8 = r10.toString()     // Catch:{ StackOverflowError -> 0x04d5 }
            long r10 = r17.getGUID()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18880s(r8, r10)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0435:
            boolean r8 = r22.isEmpty()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x044a
            java.lang.Object r8 = r22.peek()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ StackOverflowError -> 0x04d5 }
            int r8 = r8.intValue()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r8 != 0) goto L_0x044a
            r22.pop()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x044a:
            int r8 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r1, r2)     // Catch:{ StackOverflowError -> 0x04d5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
            r6.push(r8)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0455:
            int r2 = r2 + r3
            goto L_0x005f
        L_0x0458:
            boolean r0 = r9.isActionBlock     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r0 == 0) goto L_0x04a2
            r0 = r9
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r0     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r0 = r0.isTestMode()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r0 == 0) goto L_0x0468
            r9.displayOutputVarSummary(r7)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0468:
            boolean r0 = r9.isClonedInstance     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r0 == 0) goto L_0x04a2
            java.util.ArrayList r0 = r17.getActions()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0474:
            boolean r1 = r0.hasNext()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r1 == 0) goto L_0x0498
            java.lang.Object r1 = r0.next()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.action.Action r1 = (com.arlosoft.macrodroid.action.Action) r1     // Catch:{ StackOverflowError -> 0x04d5 }
            java.util.List r1 = r1.mo27826J0()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x0488:
            boolean r2 = r1.hasNext()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r2 == 0) goto L_0x0474
            java.lang.Object r2 = r1.next()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.constraint.Constraint r2 = (com.arlosoft.macrodroid.constraint.Constraint) r2     // Catch:{ StackOverflowError -> 0x04d5 }
            r2.mo28113U2()     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x0488
        L_0x0498:
            com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ StackOverflowError -> 0x04d5 }
            r1 = r9
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r1 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r1     // Catch:{ StackOverflowError -> 0x04d5 }
            r0.mo29646d(r1)     // Catch:{ StackOverflowError -> 0x04d5 }
        L_0x04a2:
            if (r7 == 0) goto L_0x04e7
            r9.updateActionBlockOutputVariables(r7)     // Catch:{ StackOverflowError -> 0x04d5 }
            int r0 = r23.mo28559f()     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r0 < 0) goto L_0x04e7
            com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ StackOverflowError -> 0x04d5 }
            long r1 = r23.mo28555d()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.macro.Macro r10 = r0.mo29682Q(r1)     // Catch:{ StackOverflowError -> 0x04d5 }
            if (r10 == 0) goto L_0x04e7
            java.util.ArrayList<com.arlosoft.macrodroid.action.Action> r11 = r10.m_actionList     // Catch:{ StackOverflowError -> 0x04d5 }
            int r12 = r23.mo28559f()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r13 = r23.mo28553b()     // Catch:{ StackOverflowError -> 0x04d5 }
            boolean r14 = r23.mo28554c()     // Catch:{ StackOverflowError -> 0x04d5 }
            java.util.Stack r15 = r23.mo28560g()     // Catch:{ StackOverflowError -> 0x04d5 }
            com.arlosoft.macrodroid.data.ResumeMacroInfo r16 = r23.mo28557e()     // Catch:{ StackOverflowError -> 0x04d5 }
            r10.invokeActions(r11, r12, r13, r14, r15, r16)     // Catch:{ StackOverflowError -> 0x04d5 }
            goto L_0x04e7
        L_0x04d5:
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            r1 = 2131953934(0x7f13090e, float:1.9544353E38)
            java.lang.String r0 = r0.getString(r1)
            long r1 = r17.getGUID()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18880s(r0, r1)
        L_0x04e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.Macro.invokeActions(java.util.List, int, com.arlosoft.macrodroid.triggers.TriggerContextInfo, boolean, java.util.Stack, com.arlosoft.macrodroid.data.ResumeMacroInfo):void");
    }

    private SelectableItem findChildByGUID(long j, List<Constraint> list) {
        SelectableItem findChildByGUID;
        if (!(list == null || list.size() == 0)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).mo27847f1() == j) {
                    return list.get(i);
                }
                if ((list.get(i) instanceof LogicConstraint) && (findChildByGUID = findChildByGUID(j, list.get(i).mo27826J0())) != null) {
                    return findChildByGUID;
                }
            }
        }
        return null;
    }

    protected Macro(Parcel parcel) {
        boolean z = false;
        this.m_trigger = (Trigger) parcel.readParcelable(Trigger.class.getClassLoader());
        this.m_triggerList = parcel.readArrayList(Trigger.class.getClassLoader());
        this.m_actionList = parcel.readArrayList(Action.class.getClassLoader());
        this.m_constraintList = parcel.readArrayList(Constraint.class.getClassLoader());
        this.localVariables = parcel.readArrayList(MacroDroidVariable.class.getClassLoader());
        this.m_name = parcel.readString();
        this.m_enabled = parcel.readInt() != 0;
        this.m_isOrCondition = parcel.readInt() != 0;
        this.m_configuringShortcut = parcel.readInt() != 0;
        this.m_uniqueId = parcel.readInt();
        this.m_category = parcel.readString();
        this.m_GUID = parcel.readLong();
        this.m_description = parcel.readString();
        this.m_descriptionOpen = parcel.readInt() != 0;
        this.m_excludeLog = parcel.readInt() != 0;
        this.m_headingColor = parcel.readInt();
        this.isActionBlock = parcel.readInt() != 0;
        this.isBeingImported = parcel.readInt() != 0;
        this.isClonedInstance = parcel.readInt() != 0;
        this.isFavourite = parcel.readInt() != 0 ? true : z;
        this.lastEditedTimestamp = parcel.readLong();
        this.exportedActionBlocks = parcel.readArrayList(ActionBlock.class.getClassLoader());
    }
}
