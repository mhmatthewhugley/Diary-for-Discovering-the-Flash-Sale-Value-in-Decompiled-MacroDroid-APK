package p142p0;

import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: p0.a */
/* compiled from: ActionBlockHelper.kt */
public final class C8056a {

    /* renamed from: a */
    public static final C8056a f19648a = new C8056a();

    private C8056a() {
    }

    /* renamed from: a */
    public static final void m33601a(C4915a aVar, Macro macro, List<ActionBlock> list, boolean z) {
        C13706o.m87929f(aVar, "actionBlockStore");
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(list, "actionBlocks");
        for (ActionBlock actionBlock : list) {
            if (aVar.mo29649g(actionBlock.getGUID()) != null) {
                if (z) {
                    m33602b(actionBlock);
                }
                aVar.mo29647e(actionBlock);
            } else {
                actionBlock.setIsBeingImported(true);
                String name = actionBlock.getName();
                C13706o.m87928e(name, "actionBlock.name");
                if (aVar.mo29650h(name) != null) {
                    actionBlock.setName(actionBlock.getName() + " 2");
                    ArrayList<Action> actions = macro.getActions();
                    C13706o.m87928e(actions, "macro.actions");
                    for (Action action : actions) {
                        if (action instanceof ActionBlockAction) {
                            ActionBlockAction actionBlockAction = (ActionBlockAction) action;
                            if (actionBlockAction.mo24715x3() == actionBlock.getGUID()) {
                                String name2 = actionBlock.getName();
                                C13706o.m87928e(name2, "actionBlock.name");
                                actionBlockAction.mo24710D3(name2);
                            }
                        }
                    }
                }
                if (z) {
                    m33602b(actionBlock);
                }
                aVar.mo29647e(actionBlock);
            }
        }
    }

    /* renamed from: b */
    public static final void m33602b(ActionBlock actionBlock) {
        C13706o.m87929f(actionBlock, "actionBlock");
        Iterator<Trigger> it = actionBlock.getTriggerList().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            next.mo25810V();
            for (Constraint next2 : next.mo27826J0()) {
                next2.mo24687G2(actionBlock);
                next2.mo25810V();
            }
        }
        Iterator<Action> it2 = actionBlock.getActions().iterator();
        while (it2.hasNext()) {
            Action next3 = it2.next();
            next3.mo25810V();
            for (Constraint next4 : next3.mo27826J0()) {
                next4.mo24687G2(actionBlock);
                next4.mo25810V();
            }
        }
        for (Constraint next5 : actionBlock.getConstraints()) {
            next5.mo24687G2(actionBlock);
            next5.mo25810V();
        }
    }
}
