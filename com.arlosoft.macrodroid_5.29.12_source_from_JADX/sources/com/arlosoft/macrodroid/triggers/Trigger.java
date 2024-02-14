package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.events.MacroUpdateEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddTriggerActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import com.google.android.material.snackbar.SnackbarAnimate;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p099h1.C7364d;
import p119k3.C7472a;
import p119k3.C7473a0;
import p119k3.C7475a1;
import p119k3.C7476a2;
import p119k3.C7477b;
import p119k3.C7479b0;
import p119k3.C7480b1;
import p119k3.C7481b2;
import p119k3.C7483c;
import p119k3.C7484c0;
import p119k3.C7485c1;
import p119k3.C7486c2;
import p119k3.C7487d;
import p119k3.C7488d0;
import p119k3.C7489d1;
import p119k3.C7490d2;
import p119k3.C7491e;
import p119k3.C7492e0;
import p119k3.C7493e1;
import p119k3.C7494e2;
import p119k3.C7496f;
import p119k3.C7497f0;
import p119k3.C7498f1;
import p119k3.C7500f2;
import p119k3.C7502g;
import p119k3.C7503g0;
import p119k3.C7504g1;
import p119k3.C7505g2;
import p119k3.C7506h;
import p119k3.C7507h0;
import p119k3.C7508h1;
import p119k3.C7509h2;
import p119k3.C7511i;
import p119k3.C7512i0;
import p119k3.C7513i1;
import p119k3.C7514i2;
import p119k3.C7515j;
import p119k3.C7516j0;
import p119k3.C7518j1;
import p119k3.C7520j2;
import p119k3.C7521k;
import p119k3.C7523k0;
import p119k3.C7524k1;
import p119k3.C7525k2;
import p119k3.C7526l;
import p119k3.C7527l0;
import p119k3.C7529l1;
import p119k3.C7530m;
import p119k3.C7531m0;
import p119k3.C7532m1;
import p119k3.C7533n;
import p119k3.C7534n0;
import p119k3.C7535n1;
import p119k3.C7536o;
import p119k3.C7537o0;
import p119k3.C7538o1;
import p119k3.C7539p;
import p119k3.C7540p0;
import p119k3.C7542p1;
import p119k3.C7544q;
import p119k3.C7545q0;
import p119k3.C7547q1;
import p119k3.C7548r;
import p119k3.C7549r0;
import p119k3.C7550r1;
import p119k3.C7551s;
import p119k3.C7552s0;
import p119k3.C7553s1;
import p119k3.C7554t;
import p119k3.C7556t0;
import p119k3.C7557t1;
import p119k3.C7558u;
import p119k3.C7559u0;
import p119k3.C7561u1;
import p119k3.C7562v;
import p119k3.C7563v0;
import p119k3.C7564v1;
import p119k3.C7566w;
import p119k3.C7567w0;
import p119k3.C7569w1;
import p119k3.C7571x;
import p119k3.C7572x0;
import p119k3.C7573x1;
import p119k3.C7574y;
import p119k3.C7575y0;
import p119k3.C7576y1;
import p119k3.C7577z;
import p119k3.C7578z0;
import p119k3.C7579z1;
import p149q1.C8157f;
import p161s1.C10180a;
import p319lc.C15626c;

public abstract class Trigger extends SelectableItem {

    /* renamed from: c */
    public static final Object f13695c = new Object();

    /* renamed from: a */
    transient boolean f13696a;
    private transient long parentGUID;

    public Trigger() {
    }

    /* renamed from: P2 */
    private static void m23339P2(List<C4001c1> list, C4001c1 c1Var) {
        if (c1Var.mo27887a()) {
            list.add(c1Var);
        }
    }

    /* renamed from: W2 */
    public static List<C4001c1> m23340W2(Context context) {
        ArrayList arrayList = new ArrayList();
        m23339P2(arrayList, C7523k0.m31294u());
        m23339P2(arrayList, C7526l.m31309u());
        m23339P2(arrayList, C7513i1.m31251u());
        m23339P2(arrayList, C7506h.m31216u());
        m23339P2(arrayList, C7477b.m31078v());
        m23339P2(arrayList, C7476a2.m31072u());
        m23339P2(arrayList, C7514i2.m31256u());
        m23339P2(arrayList, C7574y.m31533u());
        m23339P2(arrayList, C7537o0.m31366u());
        m23339P2(arrayList, C7534n0.m31351u());
        m23339P2(arrayList, C7484c0.m31107u());
        m23339P2(arrayList, C7520j2.m31280u());
        m23339P2(arrayList, C7530m.m31329u());
        m23339P2(arrayList, C7557t1.m31456u());
        m23339P2(arrayList, C7535n1.m31356u());
        m23339P2(arrayList, C7556t0.m31451u());
        m23339P2(arrayList, C7547q1.m31407u());
        m23339P2(arrayList, C7487d.m31122u());
        m23339P2(arrayList, C7550r1.m31423u());
        m23339P2(arrayList, C7577z.m31550u());
        m23339P2(arrayList, C7561u1.m31475u());
        m23339P2(arrayList, C7493e1.m31154u());
        m23339P2(arrayList, C7525k2.m31304u());
        m23339P2(arrayList, C7578z0.m31555u());
        m23339P2(arrayList, C7539p.m31376u());
        m23339P2(arrayList, C7558u.m31461u());
        m23339P2(arrayList, C7488d0.m31127u());
        m23339P2(arrayList, C7553s1.m31438u());
        m23339P2(arrayList, C7497f0.m31175u());
        m23339P2(arrayList, C7524k1.m31299u());
        m23339P2(arrayList, C7490d2.m31137u());
        m23339P2(arrayList, C7494e2.m31161v());
        m23339P2(arrayList, C7507h0.m31221u());
        m23339P2(arrayList, C7504g1.m31205u());
        m23339P2(arrayList, C7538o1.m31371u());
        m23339P2(arrayList, C7486c2.m31117u());
        m23339P2(arrayList, C7571x.m31518u());
        m23339P2(arrayList, C7479b0.m31084u());
        m23339P2(arrayList, C7531m0.m31334u());
        m23339P2(arrayList, C7563v0.m31485u());
        m23339P2(arrayList, C7505g2.m31210u());
        m23339P2(arrayList, C7533n.m31346u());
        m23339P2(arrayList, C7483c.m31102u());
        m23339P2(arrayList, C7536o.m31361u());
        m23339P2(arrayList, C7566w.m31497u());
        m23339P2(arrayList, C7544q.m31395u());
        m23339P2(arrayList, C7551s.m31428u());
        m23339P2(arrayList, C7485c1.m31112u());
        m23339P2(arrayList, C7576y1.m31545u());
        m23339P2(arrayList, C7472a.m31055u());
        m23339P2(arrayList, C7503g0.m31200u());
        m23339P2(arrayList, C7573x1.m31528u());
        m23339P2(arrayList, C7502g.m31195u());
        m23339P2(arrayList, C7496f.m31170u());
        m23339P2(arrayList, C7511i.m31239u());
        m23339P2(arrayList, C7540p0.m31382v());
        m23339P2(arrayList, C7498f1.m31181v());
        m23339P2(arrayList, C7569w1.m31510v());
        m23339P2(arrayList, C7572x0.m31523u());
        m23339P2(arrayList, C7575y0.m31538u());
        m23339P2(arrayList, C7491e.m31142u());
        m23339P2(arrayList, C7579z1.m31560u());
        m23339P2(arrayList, C7489d1.m31132u());
        m23339P2(arrayList, C7473a0.m31061v());
        m23339P2(arrayList, C7567w0.m31503v());
        m23339P2(arrayList, C7562v.m31480u());
        m23339P2(arrayList, C7532m1.m31339u());
        m23339P2(arrayList, C7475a1.m31067u());
        m23339P2(arrayList, C7529l1.m31323u());
        m23339P2(arrayList, C7512i0.m31245u());
        m23339P2(arrayList, C7480b1.m31089u());
        m23339P2(arrayList, C7508h1.m31226u());
        m23339P2(arrayList, C7548r.m31412u());
        m23339P2(arrayList, C7549r0.m31417u());
        m23339P2(arrayList, C7552s0.m31433u());
        m23339P2(arrayList, C7492e0.m31147u());
        m23339P2(arrayList, C7527l0.m31316v());
        m23339P2(arrayList, C7521k.m31286v());
        m23339P2(arrayList, C7509h2.m31233v());
        m23339P2(arrayList, C7481b2.m31096v());
        m23339P2(arrayList, C7515j.m31261u());
        m23339P2(arrayList, C7518j1.m31274v());
        m23339P2(arrayList, C7559u0.m31467v());
        m23339P2(arrayList, C7564v1.m31491v());
        m23339P2(arrayList, C7554t.m31444v());
        m23339P2(arrayList, C7542p1.m31389v());
        m23339P2(arrayList, C7516j0.m31267v());
        m23339P2(arrayList, C7500f2.m31188v());
        m23339P2(arrayList, C7545q0.m31401v());
        Collator instance = Collator.getInstance(C5163j2.m19963F0(context));
        instance.setStrength(0);
        Collections.sort(arrayList, new C5877b8(instance, context));
        return arrayList;
    }

    /* renamed from: X2 */
    public static List<C7364d> m23341X2(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m23339P2(arrayList2, C7506h.m31216u());
        m23339P2(arrayList2, C7511i.m31239u());
        m23339P2(arrayList2, C7484c0.m31107u());
        m23339P2(arrayList2, C7513i1.m31251u());
        m23339P2(arrayList2, C7515j.m31261u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_battery_power), C17530R$drawable.ic_power_plug_white_24dp, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        m23339P2(arrayList3, C7483c.m31102u());
        m23339P2(arrayList3, C7508h1.m31226u());
        m23339P2(arrayList3, C7526l.m31309u());
        m23339P2(arrayList3, C7531m0.m31334u());
        m23339P2(arrayList3, C7523k0.m31294u());
        m23339P2(arrayList3, C7557t1.m31456u());
        m23339P2(arrayList3, C7485c1.m31112u());
        m23339P2(arrayList3, C7520j2.m31280u());
        m23339P2(arrayList3, C7525k2.m31304u());
        m23339P2(arrayList3, C7558u.m31461u());
        m23339P2(arrayList3, C7521k.m31286v());
        m23339P2(arrayList3, C7509h2.m31233v());
        m23339P2(arrayList3, C7481b2.m31096v());
        m23339P2(arrayList3, C7500f2.m31188v());
        m23339P2(arrayList3, C7545q0.m31401v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_connectivity), C17530R$drawable.ic_router_wireless_white_24dp, arrayList3));
        ArrayList arrayList4 = new ArrayList();
        m23339P2(arrayList4, C7534n0.m31351u());
        m23339P2(arrayList4, C7544q.m31395u());
        m23339P2(arrayList4, C7536o.m31361u());
        m23339P2(arrayList4, C7539p.m31376u());
        m23339P2(arrayList4, C7537o0.m31366u());
        m23339P2(arrayList4, C7574y.m31533u());
        m23339P2(arrayList4, C7504g1.m31205u());
        m23339P2(arrayList4, C7538o1.m31371u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_call_sms), C17530R$drawable.ic_phone_classic_white_24dp, arrayList4));
        ArrayList arrayList5 = new ArrayList();
        m23339P2(arrayList5, C7472a.m31055u());
        m23339P2(arrayList5, C7497f0.m31175u());
        m23339P2(arrayList5, C7550r1.m31423u());
        m23339P2(arrayList5, C7549r0.m31417u());
        m23339P2(arrayList5, C7524k1.m31299u());
        m23339P2(arrayList5, C7498f1.m31181v());
        m23339P2(arrayList5, C7569w1.m31510v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_sensors), C17530R$drawable.ic_compass_outline_white_24dp, arrayList5));
        ArrayList arrayList6 = new ArrayList();
        m23339P2(arrayList6, C7572x0.m31523u());
        m23339P2(arrayList6, C7575y0.m31538u());
        m23339P2(arrayList6, C7553s1.m31438u());
        m23339P2(arrayList6, C7579z1.m31560u());
        m23339P2(arrayList6, C7490d2.m31137u());
        m23339P2(arrayList6, C7494e2.m31161v());
        m23339P2(arrayList6, C7514i2.m31256u());
        m23339P2(arrayList6, C7503g0.m31200u());
        m23339P2(arrayList6, C7492e0.m31147u());
        m23339P2(arrayList6, C7527l0.m31316v());
        m23339P2(arrayList6, C7516j0.m31267v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_user_input), C17530R$drawable.ic_account_white_24dp, arrayList6));
        ArrayList arrayList7 = new ArrayList();
        m23339P2(arrayList7, C7533n.m31346u());
        m23339P2(arrayList7, C7566w.m31497u());
        m23339P2(arrayList7, C7476a2.m31072u());
        m23339P2(arrayList7, C7573x1.m31528u());
        m23339P2(arrayList7, C7535n1.m31356u());
        m23339P2(arrayList7, C7576y1.m31545u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_date_time), C17530R$drawable.ic_calendar_clock_white_24dp, arrayList7));
        ArrayList arrayList8 = new ArrayList();
        m23339P2(arrayList8, C7530m.m31329u());
        m23339P2(arrayList8, C7562v.m31480u());
        m23339P2(arrayList8, C7488d0.m31127u());
        m23339P2(arrayList8, C7493e1.m31154u());
        m23339P2(arrayList8, C7547q1.m31407u());
        m23339P2(arrayList8, C7571x.m31518u());
        m23339P2(arrayList8, C7561u1.m31475u());
        m23339P2(arrayList8, C7577z.m31550u());
        m23339P2(arrayList8, C7477b.f18329j.mo37637a());
        m23339P2(arrayList8, C7507h0.m31221u());
        m23339P2(arrayList8, C7475a1.m31067u());
        m23339P2(arrayList8, C7480b1.m31089u());
        m23339P2(arrayList8, C7496f.m31170u());
        m23339P2(arrayList8, C7551s.m31428u());
        m23339P2(arrayList8, C7502g.m31195u());
        m23339P2(arrayList8, C7540p0.m31382v());
        m23339P2(arrayList8, C7518j1.m31274v());
        m23339P2(arrayList8, C7559u0.m31467v());
        m23339P2(arrayList8, C7564v1.m31491v());
        m23339P2(arrayList8, C7554t.m31444v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_device_events), C17530R$drawable.ic_cellphone_android_white_24dp, arrayList8));
        ArrayList arrayList9 = new ArrayList();
        m23339P2(arrayList9, C7487d.m31122u());
        m23339P2(arrayList9, C7491e.m31142u());
        m23339P2(arrayList9, C7552s0.m31433u());
        m23339P2(arrayList9, C7532m1.m31339u());
        m23339P2(arrayList9, C7542p1.m31389v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_applications), C17530R$drawable.ic_apps_white_24dp, arrayList9));
        ArrayList arrayList10 = new ArrayList();
        m23339P2(arrayList10, C7529l1.m31323u());
        m23339P2(arrayList10, C7479b0.m31084u());
        m23339P2(arrayList10, C7563v0.m31485u());
        m23339P2(arrayList10, C7578z0.m31555u());
        m23339P2(arrayList10, C7486c2.m31117u());
        m23339P2(arrayList10, C7489d1.m31132u());
        m23339P2(arrayList10, C7473a0.m31061v());
        m23339P2(arrayList10, C7567w0.m31503v());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_macrodroid_specific), C17530R$drawable.active_icon_new, arrayList10));
        ArrayList arrayList11 = new ArrayList();
        m23339P2(arrayList11, C7556t0.m31451u());
        m23339P2(arrayList11, C7512i0.m31245u());
        m23339P2(arrayList11, C7548r.m31412u());
        m23339P2(arrayList11, C7505g2.m31210u());
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_location), C17530R$drawable.ic_google_maps_white_24dp, arrayList11));
        Collator instance = Collator.getInstance(C5163j2.m19963F0(context));
        instance.setStrength(0);
        Collections.sort(arrayList, new C5814a8(instance));
        return arrayList;
    }

    /* renamed from: Z2 */
    private void m23342Z2() {
        Macro X0 = mo27837X0();
        X0.setTriggerThatInvoked(this);
        TriggerContextInfo Y2 = mo30911Y2();
        if (Y2 != null) {
            X0.setTriggerContextInfo(Y2);
        }
        X0.invokeActions(X0.getTriggerContextInfo(), true);
    }

    /* renamed from: L0 */
    public int mo24688L0() {
        return C17542R$style.Theme_App_Dialog_Trigger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        super.mo24689O1();
        Activity j0 = mo27850j0();
        if (j0 instanceof EditMacroActivity) {
            long j = this.parentGUID;
            if (j != 0) {
                SelectableItem findChildByGUID = this.m_macro.findChildByGUID(j);
                if (findChildByGUID instanceof WaitUntilTriggerAction) {
                    ((WaitUntilTriggerAction) findChildByGUID).mo26118C3(this);
                    return;
                }
                return;
            }
            j0.setResult(-1, new Intent());
            EditMacroActivity editMacroActivity = (EditMacroActivity) j0;
            editMacroActivity.mo28959U4();
            editMacroActivity.mo28962z4(false);
        } else if (this.m_returnOnComplete) {
            Intent intent = new Intent();
            intent.putExtra(C8157f.ITEM_TYPE, this.m_macro);
            j0.setResult(1, intent);
            j0.finish();
        } else if (j0 instanceof AddTriggerActivity) {
            long j2 = this.parentGUID;
            if (j2 != 0) {
                SelectableItem findChildByGUID2 = this.m_macro.findChildByGUID(j2);
                if (findChildByGUID2 instanceof WaitUntilTriggerAction) {
                    ((WaitUntilTriggerAction) findChildByGUID2).mo26120p3(this);
                }
            } else {
                this.m_macro.addTrigger(this);
            }
            j0.setResult(-1);
            j0.finish();
        } else if (!(j0 instanceof WizardActivity)) {
        } else {
            if (!this.m_macro.getTriggerList().contains(this)) {
                View findViewById = j0.findViewById(C17532R$id.coordinator_layout);
                SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById, SelectableItem.m15535j1(C17541R$string.trigger_added) + ": " + mo24738G0(), -1);
                i.mo58921e().setBackgroundResource(C17528R$color.trigger_primary_dark);
                ((TextView) i.mo58921e().findViewById(2131363815)).setTextColor(-1);
                TextView textView = (TextView) i.mo58921e().findViewById(2131363815);
                textView.setCompoundDrawablesWithIntrinsicBounds(mo25558S0(), 0, 0, 0);
                textView.setCompoundDrawablePadding(mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_small));
                i.mo58932r();
                this.m_macro.addTrigger(this);
                C10180a.m40075a().mo80018i(new MacroUpdateEvent(0, 0, this.m_macro.getTriggerList().size() - 1, -1));
                return;
            }
            C10180a.m40075a().mo80018i(new MacroUpdateEvent(3, 0, -1, -1));
        }
    }

    /* renamed from: Q2 */
    public void mo31542Q2() {
        if (!mo27839Y()) {
            C4878b.m18868g(mo27837X0().getName() + " - " + mo24738G0() + "  missing permission");
        }
        if (mo27822G1()) {
            mo31544V2();
        }
    }

    /* renamed from: R2 */
    public boolean mo31374R2() {
        return mo27845e0((TriggerContextInfo) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public abstract void mo30885S2();

    /* renamed from: T2 */
    public void mo31543T2() {
        synchronized (f13695c) {
            if (this.f13696a) {
                this.f13696a = false;
                mo30885S2();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public abstract void mo30886U2();

    /* renamed from: V2 */
    public void mo31544V2() {
        synchronized (f13695c) {
            if (!this.f13696a) {
                this.f13696a = true;
                mo30886U2();
            }
        }
    }

    /* renamed from: W0 */
    public String mo24695W0() {
        return "T: ";
    }

    @Nullable
    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return null;
    }

    /* renamed from: c3 */
    public void mo31545c3() {
    }

    /* renamed from: d3 */
    public void mo31546d3(long j) {
        this.parentGUID = j;
    }

    /* renamed from: e3 */
    public void mo31547e3() {
        C4878b.m18874m("Testing trigger: " + mo24728k1(new TriggerContextInfo(this)), mo27840Y0().longValue());
        m23342Z2();
    }

    /* renamed from: f3 */
    public void mo31548f3() {
        C4878b.m18874m("Testing trigger with constraints: " + mo24728k1(new TriggerContextInfo(this)), mo27840Y0().longValue());
        if (mo31374R2()) {
            m23342Z2();
        } else {
            C15626c.makeText(mo27827K0(), C17541R$string.constraint_check_false_not_running, 1).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public int mo24705l0() {
        return C17542R$style.Theme_App_Dialog_Trigger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo24689O1();
    }

    protected Trigger(Parcel parcel) {
        super(parcel);
    }
}
