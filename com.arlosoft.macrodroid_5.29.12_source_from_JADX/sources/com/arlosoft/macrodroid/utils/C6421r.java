package com.arlosoft.macrodroid.utils;

import android.os.Parcel;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.constraint.TriggerThatInvokedConstraint;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.utils.r */
/* compiled from: CopyHelper */
public class C6421r {

    /* renamed from: a */
    private static SelectableItem f15043a;

    /* renamed from: b */
    private static List<SelectableItem> f15044b;

    /* renamed from: a */
    private static void m24720a(List<Constraint> list, List<Trigger> list2, List<Trigger> list3) {
        if (list != null && list.size() != 0) {
            for (Constraint next : list) {
                next.mo27824H2();
                if (next instanceof LogicConstraint) {
                    m24720a(next.mo27826J0(), list2, list3);
                }
                if (list2 != null && (next instanceof TriggerThatInvokedConstraint)) {
                    TriggerThatInvokedConstraint triggerThatInvokedConstraint = (TriggerThatInvokedConstraint) next;
                    for (int i = 0; i < list3.size(); i++) {
                        if (triggerThatInvokedConstraint.mo28350j3() == list2.get(i).mo27847f1()) {
                            triggerThatInvokedConstraint.mo28351l3(list3.get(i).mo27847f1());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static SelectableItem m24721b() {
        return f15043a;
    }

    /* renamed from: c */
    public static SelectableItem m24722c(SelectableItem selectableItem, List<Trigger> list, List<Trigger> list2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(selectableItem, 0);
        obtain.setDataPosition(0);
        SelectableItem selectableItem2 = (SelectableItem) obtain.readParcelable(selectableItem.getClass().getClassLoader());
        selectableItem2.mo27824H2();
        m24720a(selectableItem2.mo27826J0(), list, list2);
        if (list != null && (selectableItem instanceof TriggerThatInvokedConstraint)) {
            TriggerThatInvokedConstraint triggerThatInvokedConstraint = (TriggerThatInvokedConstraint) selectableItem;
            for (int i = 0; i < list2.size(); i++) {
                if (triggerThatInvokedConstraint.mo28350j3() == list.get(i).mo27847f1()) {
                    triggerThatInvokedConstraint.mo28351l3(list2.get(i).mo27847f1());
                }
            }
        }
        obtain.recycle();
        return selectableItem2;
    }

    /* renamed from: d */
    public static List<SelectableItem> m24723d() {
        return f15044b;
    }

    /* renamed from: e */
    public static MacroDroidVariable m24724e(MacroDroidVariable macroDroidVariable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(macroDroidVariable, 0);
        obtain.setDataPosition(0);
        MacroDroidVariable macroDroidVariable2 = (MacroDroidVariable) obtain.readParcelable(MacroDroidVariable.class.getClassLoader());
        obtain.recycle();
        return macroDroidVariable2;
    }

    /* renamed from: f */
    public static void m24725f() {
        SelectableItem selectableItem = f15043a;
        if (selectableItem != null) {
            f15043a = m24722c(selectableItem, (List<Trigger>) null, (List<Trigger>) null);
        } else if (f15044b != null) {
            ArrayList arrayList = new ArrayList();
            for (SelectableItem c : f15044b) {
                arrayList.add(m24722c(c, (List<Trigger>) null, (List<Trigger>) null));
            }
            f15044b = arrayList;
        }
    }

    /* renamed from: g */
    public static void m24726g(SelectableItem selectableItem) {
        if (selectableItem != null) {
            f15043a = m24722c(selectableItem, (List<Trigger>) null, (List<Trigger>) null);
            f15044b = null;
            return;
        }
        f15043a = null;
        f15044b = null;
    }

    /* renamed from: h */
    public static void m24727h(List<SelectableItem> list) {
        if (list != null) {
            f15043a = null;
            f15044b = new ArrayList();
            for (SelectableItem c : list) {
                f15044b.add(m24722c(c, (List<Trigger>) null, (List<Trigger>) null));
            }
            return;
        }
        f15043a = null;
        f15044b = null;
    }
}
