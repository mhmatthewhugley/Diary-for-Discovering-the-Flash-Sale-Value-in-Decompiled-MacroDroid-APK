package com.arlosoft.macrodroid.utils;

import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ElseAction;
import com.arlosoft.macrodroid.action.ElseIfConditionAction;
import com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction;
import com.arlosoft.macrodroid.action.ElseParentAction;
import com.arlosoft.macrodroid.action.EndIfAction;
import com.arlosoft.macrodroid.action.EndLoopAction;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.IterateDictionaryAction;
import com.arlosoft.macrodroid.action.LoopAction;
import java.util.List;
import p135n1.C7967d;

/* renamed from: com.arlosoft.macrodroid.utils.p0 */
/* compiled from: MacroListUtils */
public class C6416p0 {
    /* renamed from: a */
    public static int m24704a(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < list.size() && i2 > 0; i3++) {
            Action action = list.get(i3);
            if (action instanceof IfConditionAction) {
                i2++;
            }
            if (action instanceof EndIfAction) {
                i2--;
            } else if (action.mo27822G1() && (action instanceof ElseAction) && i2 == 1) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m24705b(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < list.size(); i3++) {
            Action action = list.get(i3);
            if (action instanceof IfConditionAction) {
                i2++;
            } else if ((action instanceof EndIfAction) && i2 - 1 == 0) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static int m24706c(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < list.size(); i3++) {
            Action action = list.get(i3);
            if (action instanceof LoopAction) {
                i2++;
            } else if ((action instanceof EndLoopAction) && i2 - 1 == 0) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m24707d(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < list.size(); i3++) {
            Action action = list.get(i3);
            if (action instanceof IfConditionAction) {
                i2++;
            }
            if (action instanceof EndIfAction) {
                i2--;
            } else if (((action.mo27822G1() && (action instanceof ElseIfConditionAction)) || (action instanceof ElseIfConfirmedThenAction)) && i2 == 1) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static int m24708e(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < list.size(); i3++) {
            Action action = list.get(i3);
            if (action instanceof IfConditionAction) {
                i2++;
            }
            if (action instanceof EndIfAction) {
                i2--;
                if (i2 == 0) {
                    return i3;
                }
            } else if (((action instanceof ElseAction) || (action instanceof ElseIfConditionAction) || (action instanceof ElseIfConfirmedThenAction)) && i2 == 1) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static int m24709f(List<Action> list, int i) {
        if (list.get(i) instanceof LoopAction) {
            return m24706c(list, i);
        }
        return m24705b(list, i);
    }

    /* renamed from: g */
    public static int m24710g(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            Action action = list.get(i3);
            if (action instanceof EndIfAction) {
                i2++;
            } else if ((action instanceof IfConditionAction) && i2 - 1 == 0) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static int m24711h(List<Action> list, int i) {
        int i2 = 1;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            Action action = list.get(i3);
            if (action instanceof EndLoopAction) {
                i2++;
            } else if ((action instanceof LoopAction) && i2 - 1 == 0) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int m24712i(List<Action> list, int i) {
        Action action = list.get(i);
        if ((action instanceof EndIfAction) || (action instanceof ElseParentAction)) {
            return m24710g(list, i);
        }
        return m24711h(list, i);
    }

    /* renamed from: j */
    public static C7967d m24713j(List<Action> list, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            if (list.get(i5) instanceof IterateDictionaryAction) {
                i2++;
                if ((i2 + i3) - i4 > 0) {
                    return ((IterateDictionaryAction) list.get(i5)).mo25246e4() ? C7967d.ARRAY : C7967d.DICTIONARY;
                }
            }
            if ((list.get(i5) instanceof LoopAction) && i4 > 0) {
                i3++;
            } else if (list.get(i5) instanceof EndLoopAction) {
                i4++;
            }
        }
        return C7967d.NONE;
    }
}
