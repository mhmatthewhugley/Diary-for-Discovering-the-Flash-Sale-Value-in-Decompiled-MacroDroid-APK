package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.events.MacroUpdateEvent;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddActionActivity;
import com.arlosoft.macrodroid.selectableitemlist.AddConditionActivity;
import com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import com.google.android.material.snackbar.SnackbarAnimate;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.p353io.IOUtils;
import p099h1.C7364d;
import p123l1.C7592a;
import p123l1.C7593a0;
import p123l1.C7594a1;
import p123l1.C7595b;
import p123l1.C7596b0;
import p123l1.C7597b1;
import p123l1.C7598c;
import p123l1.C7599c0;
import p123l1.C7600c1;
import p123l1.C7602d;
import p123l1.C7603d0;
import p123l1.C7604d1;
import p123l1.C7605e;
import p123l1.C7606e0;
import p123l1.C7607e1;
import p123l1.C7608f;
import p123l1.C7609f0;
import p123l1.C7610f1;
import p123l1.C7611g;
import p123l1.C7612g0;
import p123l1.C7613g1;
import p123l1.C7615h;
import p123l1.C7616h0;
import p123l1.C7617h1;
import p123l1.C7618i;
import p123l1.C7619i0;
import p123l1.C7620i1;
import p123l1.C7621j;
import p123l1.C7623j0;
import p123l1.C7624k;
import p123l1.C7625k0;
import p123l1.C7626l;
import p123l1.C7628l0;
import p123l1.C7629m;
import p123l1.C7631m0;
import p123l1.C7632n;
import p123l1.C7633n0;
import p123l1.C7634o;
import p123l1.C7635o0;
import p123l1.C7636p;
import p123l1.C7637p0;
import p123l1.C7638q;
import p123l1.C7639q0;
import p123l1.C7640r;
import p123l1.C7641r0;
import p123l1.C7642s;
import p123l1.C7643s0;
import p123l1.C7644t;
import p123l1.C7645t0;
import p123l1.C7646u;
import p123l1.C7647u0;
import p123l1.C7648v;
import p123l1.C7650v0;
import p123l1.C7651w;
import p123l1.C7652w0;
import p123l1.C7653x;
import p123l1.C7654x0;
import p123l1.C7655y;
import p123l1.C7657y0;
import p123l1.C7659z;
import p123l1.C7661z0;
import p135n1.C7967d;
import p161s1.C10180a;

public abstract class Constraint extends SelectableItem {
    protected static final int PARENT_ACTION = 1;
    protected static final int PARENT_MACRO = 0;
    protected static final int PARENT_TRIGGER = 2;

    /* renamed from: d */
    public static final Object f10713d = new Object();

    /* renamed from: c */
    transient boolean f10714c;
    private transient long m_parentGUID;

    public Constraint() {
        mo27817C2((List<Constraint>) null);
    }

    /* renamed from: P2 */
    private static void m16347P2(List<C4001c1> list, C4001c1 c1Var) {
        if (c1Var.mo27887a()) {
            list.add(c1Var);
        }
    }

    /* renamed from: X2 */
    public static List<C4001c1> m16348X2(Context context, Macro macro, boolean z) {
        ArrayList arrayList = new ArrayList();
        m16347P2(arrayList, C7605e.m31660u());
        m16347P2(arrayList, C7617h1.m31722u());
        m16347P2(arrayList, C7647u0.m31867u());
        m16347P2(arrayList, C7642s.m31842u());
        try {
            if (((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0) {
                m16347P2(arrayList, C7653x.m31894u());
            }
        } catch (Exception unused) {
        }
        m16347P2(arrayList, C7623j0.m31749u());
        m16347P2(arrayList, C7636p.m31810u());
        m16347P2(arrayList, C7594a1.m31607u());
        m16347P2(arrayList, C7651w.m31884u());
        m16347P2(arrayList, C7592a.m31597u());
        m16347P2(arrayList, C7607e1.m31670u());
        m16347P2(arrayList, C7595b.m31612u());
        m16347P2(arrayList, C7639q0.m31826u());
        m16347P2(arrayList, C7628l0.m31771u());
        m16347P2(arrayList, C7646u.m31862u());
        m16347P2(arrayList, C7603d0.m31650u());
        m16347P2(arrayList, C7597b1.m31622u());
        m16347P2(arrayList, C7616h0.m31717u());
        m16347P2(arrayList, C7620i1.m31737u());
        m16347P2(arrayList, C7643s0.m31847u());
        m16347P2(arrayList, C7638q.m31821u());
        m16347P2(arrayList, C7632n.m31789u());
        m16347P2(arrayList, C7645t0.m31857u());
        m16347P2(arrayList, C7596b0.m31617u());
        m16347P2(arrayList, C7640r.m31831u());
        m16347P2(arrayList, C7618i.m31727u());
        m16347P2(arrayList, C7650v0.m31879u());
        m16347P2(arrayList, C7624k.m31754u());
        m16347P2(arrayList, C7648v.m31873v());
        m16347P2(arrayList, C7602d.m31645u());
        m16347P2(arrayList, C7635o0.m31805u());
        m16347P2(arrayList, C7598c.m31627u());
        m16347P2(arrayList, C7606e0.m31665u());
        m16347P2(arrayList, C7644t.m31852u());
        m16347P2(arrayList, C7609f0.m31681u());
        m16347P2(arrayList, C7615h.m31712u());
        m16347P2(arrayList, C7619i0.m31732u());
        m16347P2(arrayList, C7621j.m31743v());
        m16347P2(arrayList, C7634o.m31800u());
        m16347P2(arrayList, C7625k0.m31759u());
        if (!(macro instanceof ActionBlock)) {
            m16347P2(arrayList, C7604d1.m31655u());
            m16347P2(arrayList, C7655y.m31905v());
        }
        m16347P2(arrayList, C7610f1.m31688u());
        m16347P2(arrayList, C7654x0.m31899u());
        m16347P2(arrayList, C7652w0.m31889u());
        m16347P2(arrayList, C7599c0.m31632u());
        m16347P2(arrayList, C7593a0.m31602u());
        m16347P2(arrayList, C7631m0.m31784u());
        m16347P2(arrayList, C7626l.m31765v());
        m16347P2(arrayList, C4261h.m17265u());
        if (!z) {
            m16347P2(arrayList, C7612g0.m31699u());
        }
        m16347P2(arrayList, C7633n0.m31794u());
        m16347P2(arrayList, C7641r0.m31836u());
        m16347P2(arrayList, C7608f.m31675u());
        m16347P2(arrayList, C7611g.m31693u());
        m16347P2(arrayList, C7637p0.m31815u());
        m16347P2(arrayList, C7659z.m31919v());
        m16347P2(arrayList, C7657y0.m31912v());
        m16347P2(arrayList, C7613g1.m31705v());
        m16347P2(arrayList, C7629m.m31777v());
        m16347P2(arrayList, C7600c1.m31638v());
        m16347P2(arrayList, C7661z0.m31926v());
        Collator instance = Collator.getInstance(C5163j2.m19963F0(context));
        instance.setStrength(0);
        Collections.sort(arrayList, new C4221a0(instance, context));
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (true) {
            String str = "";
            if (it.hasNext()) {
                C4001c1 c1Var = (C4001c1) it.next();
                sb.append(context.getString(c1Var.mo27893k()));
                if (c1Var.mo27894l() != 9999) {
                    str = " (Root only)";
                }
                sb.append(str);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            } else {
                Log.e(str, sb.toString());
                return arrayList;
            }
        }
    }

    /* renamed from: Y2 */
    public static List<C7364d> m16349Y2(Context context, Macro macro, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m16347P2(arrayList2, C7611g.m31693u());
        m16347P2(arrayList2, C7646u.m31862u());
        m16347P2(arrayList2, C7609f0.m31681u());
        m16347P2(arrayList2, C7650v0.m31879u());
        m16347P2(arrayList2, C7632n.m31789u());
        m16347P2(arrayList2, C7596b0.m31617u());
        m16347P2(arrayList2, C7620i1.m31737u());
        m16347P2(arrayList2, C7617h1.m31722u());
        m16347P2(arrayList2, C7637p0.m31815u());
        m16347P2(arrayList2, C7659z.m31919v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_connectivity), C17530R$drawable.ic_router_wireless_white_24dp, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        m16347P2(arrayList3, C7653x.m31894u());
        m16347P2(arrayList3, C7639q0.m31826u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_phone), C17530R$drawable.ic_phone_classic_white_24dp, arrayList3));
        ArrayList arrayList4 = new ArrayList();
        m16347P2(arrayList4, C7607e1.m31670u());
        m16347P2(arrayList4, C7615h.m31712u());
        m16347P2(arrayList4, C7652w0.m31889u());
        m16347P2(arrayList4, C7647u0.m31867u());
        m16347P2(arrayList4, C7610f1.m31688u());
        m16347P2(arrayList4, C7629m.m31777v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_screen_and_speaker), C17530R$drawable.ic_account_white_24dp, arrayList4));
        ArrayList arrayList5 = new ArrayList();
        m16347P2(arrayList5, C7633n0.m31794u());
        m16347P2(arrayList5, C7635o0.m31805u());
        m16347P2(arrayList5, C7641r0.m31836u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_notification), C17530R$drawable.ic_alert_box_white_24dp, arrayList5));
        ArrayList arrayList6 = new ArrayList();
        m16347P2(arrayList6, C7618i.m31727u());
        m16347P2(arrayList6, C7634o.m31800u());
        m16347P2(arrayList6, C7636p.m31810u());
        m16347P2(arrayList6, C7625k0.m31759u());
        m16347P2(arrayList6, C7654x0.m31899u());
        m16347P2(arrayList6, C7594a1.m31607u());
        m16347P2(arrayList6, C7657y0.m31912v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_date_time), C17530R$drawable.ic_calendar_clock_white_24dp, arrayList6));
        ArrayList arrayList7 = new ArrayList();
        m16347P2(arrayList7, C7624k.m31754u());
        m16347P2(arrayList7, C7648v.m31873v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_location), C17530R$drawable.ic_google_maps_white_24dp, arrayList7));
        ArrayList arrayList8 = new ArrayList();
        m16347P2(arrayList8, C7645t0.m31857u());
        m16347P2(arrayList8, C7602d.m31645u());
        m16347P2(arrayList8, C7638q.m31821u());
        m16347P2(arrayList8, C7598c.m31627u());
        m16347P2(arrayList8, C7599c0.m31632u());
        m16347P2(arrayList8, C7593a0.m31602u());
        m16347P2(arrayList8, C7597b1.m31622u());
        m16347P2(arrayList8, C7595b.m31612u());
        m16347P2(arrayList8, C7592a.m31597u());
        m16347P2(arrayList8, C7631m0.m31784u());
        m16347P2(arrayList8, C7626l.m31765v());
        m16347P2(arrayList8, C7613g1.m31705v());
        m16347P2(arrayList8, C7600c1.m31638v());
        m16347P2(arrayList8, C7661z0.m31926v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_device_state), C17530R$drawable.ic_cellphone_settings_white_24dp, arrayList8));
        ArrayList arrayList9 = new ArrayList();
        if (!z) {
            m16347P2(arrayList9, C7612g0.m31699u());
        }
        m16347P2(arrayList9, C7603d0.m31650u());
        m16347P2(arrayList9, C7619i0.m31732u());
        m16347P2(arrayList9, C7621j.m31743v());
        m16347P2(arrayList9, C7623j0.m31749u());
        m16347P2(arrayList9, C7616h0.m31717u());
        if (!(macro instanceof ActionBlock)) {
            m16347P2(arrayList9, C7604d1.m31655u());
            m16347P2(arrayList9, C7655y.m31905v());
        }
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_macrodroid_specific), C17530R$drawable.active_icon_new, arrayList9));
        ArrayList arrayList10 = new ArrayList();
        m16347P2(arrayList10, C7651w.m31884u());
        m16347P2(arrayList10, C7628l0.m31771u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_media), C17530R$drawable.ic_account_white_24dp, arrayList10));
        ArrayList arrayList11 = new ArrayList();
        m16347P2(arrayList11, C7643s0.m31847u());
        m16347P2(arrayList11, C7606e0.m31665u());
        m16347P2(arrayList11, C7640r.m31831u());
        m16347P2(arrayList11, C7644t.m31852u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_sensors), C17530R$drawable.ic_compass_outline_white_24dp, arrayList11));
        ArrayList arrayList12 = new ArrayList();
        m16347P2(arrayList12, C7605e.m31660u());
        m16347P2(arrayList12, C7608f.m31675u());
        m16347P2(arrayList12, C7642s.m31842u());
        m16347P2(arrayList12, C4261h.m17265u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_battery_power), C17530R$drawable.ic_power_plug_white_24dp, arrayList12));
        Collator instance = Collator.getInstance(C5163j2.m19963F0(context));
        instance.setStrength(0);
        Collections.sort(arrayList, new C4351z(instance));
        return arrayList;
    }

    /* renamed from: E1 */
    public C7967d mo24686E1() {
        SelectableItem b3 = mo28117b3();
        if (b3 instanceof Action) {
            return ((Action) b3).mo24686E1();
        }
        return C7967d.NONE;
    }

    /* renamed from: L0 */
    public int mo24688L0() {
        Activity j0 = mo27850j0();
        if (j0 != null) {
            if ((j0 instanceof AddConditionActivity) || (j0 instanceof AddActionActivity)) {
                return C17542R$style.Theme_App_Dialog_Condition;
            }
            if ((j0 instanceof EditMacroActivity) && ((EditMacroActivity) j0).mo28957R3()) {
                return C17542R$style.Theme_App_Dialog_Condition;
            }
        }
        return (!(j0 instanceof ActionBlockEditActivity) || !((ActionBlockEditActivity) j0).mo27147q3()) ? C17542R$style.Theme_App_Dialog_Constraint : C17542R$style.Theme_App_Dialog_Condition;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        super.mo24689O1();
        Activity j0 = mo27850j0();
        if (j0 instanceof ActionBlockEditActivity) {
            j0.setResult(-1, new Intent());
            ActionBlockEditActivity actionBlockEditActivity = (ActionBlockEditActivity) j0;
            actionBlockEditActivity.mo27138H3();
            actionBlockEditActivity.mo27136B3(false);
        } else if (j0 instanceof EditMacroActivity) {
            j0.setResult(-1, new Intent());
            EditMacroActivity editMacroActivity = (EditMacroActivity) j0;
            editMacroActivity.mo28959U4();
            editMacroActivity.mo28962z4(false);
        } else if ((j0 instanceof AddConstraintActivity) || (j0 instanceof AddConditionActivity)) {
            long j = this.m_parentGUID;
            if (j != 0) {
                SelectableItem findChildByGUID = this.m_macro.findChildByGUID(j);
                if (findChildByGUID != null) {
                    findChildByGUID.mo27834R(this);
                }
            } else {
                Macro macro = this.m_macro;
                if (macro != null) {
                    macro.addConstraint(this);
                }
            }
            j0.setResult(-1);
            j0.finish();
        } else if (j0 instanceof AddActionActivity) {
            ((AddActionActivity) j0).refresh();
        } else if (!(j0 instanceof WizardActivity)) {
        } else {
            if (!this.m_macro.getConstraints().contains(this)) {
                View findViewById = j0.findViewById(C17532R$id.coordinator_layout);
                SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById, SelectableItem.m15535j1(C17541R$string.constraint_added) + ": " + mo24738G0(), -1);
                i.mo58921e().setBackgroundResource(C17528R$color.constraints_primary_dark);
                ((TextView) i.mo58921e().findViewById(2131363815)).setTextColor(-1);
                TextView textView = (TextView) i.mo58921e().findViewById(2131363815);
                textView.setCompoundDrawablesWithIntrinsicBounds(mo25558S0(), 0, 0, 0);
                textView.setCompoundDrawablePadding(mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small));
                i.mo58932r();
                this.m_macro.addConstraint(this);
                C10180a.m40075a().mo80018i(new MacroUpdateEvent(0, 2, this.m_macro.getConstraints().size() - 1, -1));
                return;
            }
            C10180a.m40075a().mo80018i(new MacroUpdateEvent(3, 2, -1, -1));
        }
    }

    /* renamed from: Q2 */
    public abstract boolean mo28033Q2(TriggerContextInfo triggerContextInfo);

    /* renamed from: R2 */
    public boolean mo28111R2(TriggerContextInfo triggerContextInfo) {
        return mo28033Q2(triggerContextInfo);
    }

    /* renamed from: S2 */
    public Constraint mo28112S2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(this, 0);
        obtain.setDataPosition(0);
        Constraint constraint = (Constraint) obtain.readParcelable(getClass().getClassLoader());
        obtain.recycle();
        return constraint;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
    }

    /* renamed from: U2 */
    public void mo28113U2() {
        synchronized (f10713d) {
            if (this.f10714c) {
                this.f10714c = false;
                mo28052T2();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
    }

    /* renamed from: W2 */
    public void mo28114W2() {
        synchronized (f10713d) {
            if (!this.f10714c) {
                this.f10714c = true;
                mo28053V2();
            }
        }
    }

    /* renamed from: Z2 */
    public long mo28115Z2() {
        return this.m_parentGUID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public int mo28116a3() {
        Activity j0 = mo27850j0();
        if (j0 instanceof AddConditionActivity) {
            return ContextCompat.getColor(j0, C17528R$color.condition_accent);
        }
        return ContextCompat.getColor(j0, C17528R$color.constraints_accent);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b3 */
    public SelectableItem mo28117b3() {
        SelectableItem findChildByGUID;
        boolean z;
        long j = this.m_parentGUID;
        if (j == 0) {
            return null;
        }
        do {
            findChildByGUID = this.m_macro.findChildByGUID(j);
            z = findChildByGUID instanceof Constraint;
            if (z) {
                j = ((Constraint) findChildByGUID).mo28115Z2();
                continue;
            }
        } while (z);
        return findChildByGUID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c3 */
    public int mo28118c3() {
        SelectableItem findChildByGUID;
        boolean z;
        long j = this.m_parentGUID;
        if (j == 0) {
            return 0;
        }
        do {
            findChildByGUID = this.m_macro.findChildByGUID(j);
            z = findChildByGUID instanceof Constraint;
            if (z) {
                j = ((Constraint) findChildByGUID).mo28115Z2();
                continue;
            }
        } while (z);
        return findChildByGUID instanceof Trigger ? 2 : 1;
    }

    /* renamed from: f3 */
    public void mo28119f3(long j) {
        this.m_parentGUID = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public int mo24705l0() {
        return mo24688L0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo24689O1();
    }

    protected Constraint(Parcel parcel) {
        super(parcel);
    }
}
