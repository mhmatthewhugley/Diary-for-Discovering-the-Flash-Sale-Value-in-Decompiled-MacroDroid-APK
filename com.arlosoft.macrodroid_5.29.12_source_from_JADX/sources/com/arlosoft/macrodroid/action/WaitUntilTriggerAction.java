package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddTriggerActivity;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p057a2.C2212a;
import p128m0.C7735e5;

/* compiled from: WaitUntilTriggerAction.kt */
public final class WaitUntilTriggerAction extends Action implements C2212a {
    public static final Parcelable.Creator<WaitUntilTriggerAction> CREATOR = new C2789a();
    private static final int REQUEST_CODE_ADD_TRIGGER = 4291;

    /* renamed from: d */
    public static final C2790b f7699d = new C2790b((C13695i) null);
    private transient ArrayList<Trigger> originalTriggerList;
    private transient ResumeMacroInfo resumeMacroInfo;
    private transient Trigger selectedTrigger;
    private transient Stack<Integer> skipEndIfIndexStack;
    private transient AppCompatDialog triggerConfigDialog;
    private ArrayList<Trigger> triggersToWaitFor;

    /* renamed from: com.arlosoft.macrodroid.action.WaitUntilTriggerAction$a */
    /* compiled from: WaitUntilTriggerAction.kt */
    public static final class C2789a implements Parcelable.Creator<WaitUntilTriggerAction> {
        C2789a() {
        }

        /* renamed from: a */
        public WaitUntilTriggerAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new WaitUntilTriggerAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public WaitUntilTriggerAction[] newArray(int i) {
            return new WaitUntilTriggerAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.WaitUntilTriggerAction$b */
    /* compiled from: WaitUntilTriggerAction.kt */
    public static final class C2790b {
        private C2790b() {
        }

        public /* synthetic */ C2790b(C13695i iVar) {
            this();
        }
    }

    public WaitUntilTriggerAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        m13784D1();
    }

    public /* synthetic */ WaitUntilTriggerAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private final void m13784D1() {
        this.triggersToWaitFor = new ArrayList<>();
    }

    /* renamed from: D3 */
    private final void m13785D3(Trigger trigger) {
        if (mo27836X()) {
            this.selectedTrigger = null;
            String[] strArr = {SelectableItem.m15535j1(C17541R$string.configure), SelectableItem.m15535j1(C17541R$string.delete), SelectableItem.m15535j1(C17541R$string.help)};
            Activity j0 = mo27850j0();
            AlertDialog.Builder builder = new AlertDialog.Builder(j0);
            builder.setTitle((CharSequence) trigger.mo27831M0()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3014dq(strArr, trigger, this, j0));
            builder.create().show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m13786E3(String[] strArr, Trigger trigger, WaitUntilTriggerAction waitUntilTriggerAction, Activity activity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(trigger, "$trigger");
        C13706o.m87929f(waitUntilTriggerAction, "this$0");
        String str = strArr[i];
        C13706o.m87928e(str, "options[index]");
        if (C13706o.m87924a(str, SelectableItem.m15535j1(C17541R$string.configure))) {
            trigger.mo24687G2(waitUntilTriggerAction.m_macro);
            trigger.mo27877y2(activity);
            trigger.mo25540W1();
            waitUntilTriggerAction.selectedTrigger = trigger;
            return;
        }
        ArrayList<Trigger> arrayList = null;
        if (C13706o.m87924a(str, SelectableItem.m15535j1(C17541R$string.help))) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle((CharSequence) trigger.mo25559a1());
            if (trigger.mo24673T0().mo27902t()) {
                builder.setMessage((CharSequence) C4061t1.m16007n(waitUntilTriggerAction.mo27827K0(), waitUntilTriggerAction.mo27827K0().getString(trigger.mo24673T0().mo27891f())));
            } else {
                builder.setMessage((CharSequence) trigger.mo25557Q0());
            }
            builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) null);
            builder.show();
        } else if (C13706o.m87924a(str, SelectableItem.m15535j1(C17541R$string.delete))) {
            ArrayList<Trigger> arrayList2 = waitUntilTriggerAction.triggersToWaitFor;
            if (arrayList2 == null) {
                C13706o.m87945v("triggersToWaitFor");
                arrayList2 = null;
            }
            if (arrayList2.contains(trigger)) {
                ArrayList<Trigger> arrayList3 = waitUntilTriggerAction.triggersToWaitFor;
                if (arrayList3 == null) {
                    C13706o.m87945v("triggersToWaitFor");
                } else {
                    arrayList = arrayList3;
                }
                arrayList.remove(trigger);
            }
            waitUntilTriggerAction.m13793q3();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger>} */
    /* JADX WARNING: type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13793q3() {
        /*
            r17 = this;
            r0 = r17
            androidx.appcompat.app.AppCompatDialog r1 = r0.triggerConfigDialog
            if (r1 == 0) goto L_0x01d3
            boolean r1 = r17.mo27836X()
            if (r1 != 0) goto L_0x000e
            goto L_0x01d3
        L_0x000e:
            androidx.appcompat.app.AppCompatDialog r1 = r0.triggerConfigDialog
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r2 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.C13706o.m87926c(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r3 = 2131364106(0x7f0a090a, float:1.834804E38)
            android.view.View r1 = r1.findViewById(r3)
            kotlin.jvm.internal.C13706o.m87926c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.removeAllViews()
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r3 = r0.triggersToWaitFor
            java.lang.String r4 = "triggersToWaitFor"
            r5 = 0
            if (r3 != 0) goto L_0x0039
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r3 = r5
        L_0x0039:
            int r3 = r3.size()
            r6 = 1
            r7 = 0
            if (r3 <= 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            r2.setEnabled(r3)
            android.app.Activity r2 = r17.mo27850j0()
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r3 = r0.triggersToWaitFor
            if (r3 != 0) goto L_0x0053
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r3 = r5
        L_0x0053:
            int r3 = r3.size()
            r8 = 2131363112(0x7f0a0528, float:1.8346024E38)
            r9 = 2131363110(0x7f0a0526, float:1.834602E38)
            r10 = 2131363113(0x7f0a0529, float:1.8346026E38)
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup"
            r12 = 2131558854(0x7f0d01c6, float:1.8743036E38)
            r13 = 8
            if (r3 != 0) goto L_0x00ca
            android.view.LayoutInflater r2 = r2.getLayoutInflater()
            android.view.View r2 = r2.inflate(r12, r5)
            kotlin.jvm.internal.C13706o.m87927d(r2, r11)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = r2.findViewById(r10)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View r4 = r2.findViewById(r9)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r5 = r2.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 91
            r6.append(r7)
            r7 = 2131954426(0x7f130afa, float:1.954535E38)
            java.lang.String r7 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r7)
            r6.append(r7)
            r7 = 93
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.setText(r6)
            r6 = 17
            r3.setGravity(r6)
            android.content.Context r6 = r17.mo27827K0()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131165872(0x7f0702b0, float:1.7945973E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r3.setPadding(r6, r6, r6, r6)
            r5.setVisibility(r13)
            r4.setVisibility(r13)
            r1.addView(r2)
            goto L_0x01d3
        L_0x00ca:
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r3 = r0.triggersToWaitFor
            if (r3 != 0) goto L_0x00d2
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r3 = r5
        L_0x00d2:
            int r3 = r3.size()
            r14 = 0
        L_0x00d7:
            if (r14 >= r3) goto L_0x01d3
            android.view.LayoutInflater r15 = r2.getLayoutInflater()
            android.view.View r15 = r15.inflate(r12, r5)
            kotlin.jvm.internal.C13706o.m87927d(r15, r11)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            android.view.View r16 = r15.findViewById(r10)
            r10 = r16
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.view.View r16 = r15.findViewById(r9)
            r9 = r16
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.view.View r16 = r15.findViewById(r8)
            r8 = r16
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r14 < r6) goto L_0x010e
            android.view.LayoutInflater r6 = r2.getLayoutInflater()
            r12 = 2131558682(0x7f0d011a, float:1.8742687E38)
            android.view.View r6 = r6.inflate(r12, r5)
            r15.addView(r6)
        L_0x010e:
            r6 = 2131363115(0x7f0a052b, float:1.834603E38)
            android.view.View r6 = r15.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r12 = r0.triggersToWaitFor
            if (r12 != 0) goto L_0x011f
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r12 = r5
        L_0x011f:
            java.lang.Object r12 = r12.get(r14)
            r15.setTag(r12)
            r12 = 2131230968(0x7f0800f8, float:1.8078004E38)
            r8.setBackgroundResource(r12)
            android.content.res.Resources r12 = r2.getResources()
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r5 = r0.triggersToWaitFor
            if (r5 != 0) goto L_0x0138
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r5 = 0
        L_0x0138:
            java.lang.Object r5 = r5.get(r14)
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5
            int r5 = r5.mo25558S0()
            android.graphics.drawable.Drawable r5 = r12.getDrawable(r5)
            r8.setImageDrawable(r5)
            r8.setVisibility(r7)
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r5 = r0.triggersToWaitFor
            if (r5 != 0) goto L_0x0154
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r5 = 0
        L_0x0154:
            java.lang.Object r5 = r5.get(r14)
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5
            java.lang.String r5 = r5.mo27831M0()
            r10.setText(r5)
            r5 = 8388627(0x800013, float:1.175497E-38)
            r10.setGravity(r5)
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r5 = r0.triggersToWaitFor
            if (r5 != 0) goto L_0x016f
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r5 = 0
        L_0x016f:
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r8 = "triggersToWaitFor[i]"
            kotlin.jvm.internal.C13706o.m87928e(r5, r8)
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5
            r15.setTag(r5)
            boolean r8 = r5.mo24824M1()
            if (r8 == 0) goto L_0x0187
            r6.setVisibility(r13)
            goto L_0x018a
        L_0x0187:
            r6.setVisibility(r7)
        L_0x018a:
            java.lang.String r6 = r5.mo24672O0()
            if (r6 == 0) goto L_0x01b3
            java.lang.String r5 = r5.mo24672O0()
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x01b3
            r9.setVisibility(r7)
            java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger> r5 = r0.triggersToWaitFor
            if (r5 != 0) goto L_0x01a5
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r5 = 0
        L_0x01a5:
            java.lang.Object r5 = r5.get(r14)
            com.arlosoft.macrodroid.triggers.Trigger r5 = (com.arlosoft.macrodroid.triggers.Trigger) r5
            java.lang.String r5 = r5.mo24672O0()
            r9.setText(r5)
            goto L_0x01b6
        L_0x01b3:
            r9.setVisibility(r13)
        L_0x01b6:
            com.arlosoft.macrodroid.action.gq r5 = new com.arlosoft.macrodroid.action.gq
            r5.<init>(r0, r14)
            r15.setOnClickListener(r5)
            r1.addView(r15)
            int r14 = r14 + 1
            r5 = 0
            r6 = 1
            r8 = 2131363112(0x7f0a0528, float:1.8346024E38)
            r9 = 2131363110(0x7f0a0526, float:1.834602E38)
            r10 = 2131363113(0x7f0a0529, float:1.8346026E38)
            r12 = 2131558854(0x7f0d01c6, float:1.8743036E38)
            goto L_0x00d7
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.WaitUntilTriggerAction.m13793q3():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m13794r3(WaitUntilTriggerAction waitUntilTriggerAction, int i, View view) {
        C13706o.m87929f(waitUntilTriggerAction, "this$0");
        ArrayList<Trigger> arrayList = waitUntilTriggerAction.triggersToWaitFor;
        if (arrayList == null) {
            C13706o.m87945v("triggersToWaitFor");
            arrayList = null;
        }
        Trigger trigger = arrayList.get(i);
        C13706o.m87928e(trigger, "triggersToWaitFor[i]");
        waitUntilTriggerAction.m13785D3(trigger);
    }

    /* renamed from: t3 */
    private final void m13795t3(boolean z) {
        Activity j0 = mo27850j0();
        WindowManager.LayoutParams layoutParams = null;
        if (z && this.originalTriggerList == null) {
            ArrayList<Trigger> arrayList = new ArrayList<>();
            ArrayList<Trigger> arrayList2 = this.triggersToWaitFor;
            if (arrayList2 == null) {
                C13706o.m87945v("triggersToWaitFor");
                arrayList2 = null;
            }
            arrayList.addAll(arrayList2);
            this.originalTriggerList = arrayList;
        }
        if (mo27836X()) {
            Macro macro = this.m_macro;
            if (macro != null) {
                macro.setActionBeingConfigured(this);
            }
            AppCompatDialog appCompatDialog = this.triggerConfigDialog;
            boolean z2 = true;
            if (appCompatDialog == null || !appCompatDialog.isShowing()) {
                z2 = false;
            }
            if (z2) {
                try {
                    AppCompatDialog appCompatDialog2 = this.triggerConfigDialog;
                    if (appCompatDialog2 != null) {
                        appCompatDialog2.dismiss();
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            AppCompatDialog appCompatDialog3 = new AppCompatDialog(j0, mo24688L0());
            this.triggerConfigDialog = appCompatDialog3;
            C13706o.m87926c(appCompatDialog3);
            appCompatDialog3.setContentView((int) C17535R$layout.dialog_wait_until_trigger_configure);
            appCompatDialog3.setTitle((CharSequence) mo25559a1());
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            Window window = appCompatDialog3.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            }
            layoutParams2.copyFrom(layoutParams);
            layoutParams2.width = -1;
            Window window2 = appCompatDialog3.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams2);
            }
            View findViewById = appCompatDialog3.findViewById(C17532R$id.okButton);
            C13706o.m87926c(findViewById);
            View findViewById2 = appCompatDialog3.findViewById(C17532R$id.cancelButton);
            C13706o.m87926c(findViewById2);
            View findViewById3 = appCompatDialog3.findViewById(C17532R$id.add_trigger_button);
            C13706o.m87926c(findViewById3);
            ArrayList arrayList3 = new ArrayList();
            String j1 = SelectableItem.m15535j1(C17541R$string.and);
            C13706o.m87928e(j1, "getString(R.string.and)");
            arrayList3.add(j1);
            String j12 = SelectableItem.m15535j1(C17541R$string.f7057or);
            C13706o.m87928e(j12, "getString(R.string.or)");
            arrayList3.add(j12);
            new ArrayAdapter(mo27850j0(), C17535R$layout.simple_spinner_item_white_text, arrayList3).setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            m13793q3();
            ((Button) findViewById).setOnClickListener(new C3043eq(this));
            ((Button) findViewById2).setOnClickListener(new C3071fq(this));
            appCompatDialog3.setOnCancelListener(new C2985cq(this));
            ((ImageButton) findViewById3).setOnClickListener(new C3127hq(this, j0));
            appCompatDialog3.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m13796u3(WaitUntilTriggerAction waitUntilTriggerAction, View view) {
        C13706o.m87929f(waitUntilTriggerAction, "this$0");
        AppCompatDialog appCompatDialog = waitUntilTriggerAction.triggerConfigDialog;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        waitUntilTriggerAction.originalTriggerList = null;
        waitUntilTriggerAction.triggerConfigDialog = null;
        waitUntilTriggerAction.mo24689O1();
        Macro macro = waitUntilTriggerAction.m_macro;
        if (macro != null) {
            macro.setActionBeingConfigured((Action) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m13797v3(WaitUntilTriggerAction waitUntilTriggerAction, View view) {
        C13706o.m87929f(waitUntilTriggerAction, "this$0");
        ArrayList<Trigger> arrayList = waitUntilTriggerAction.originalTriggerList;
        if (arrayList != null) {
            waitUntilTriggerAction.triggersToWaitFor = arrayList;
        }
        waitUntilTriggerAction.originalTriggerList = null;
        AppCompatDialog appCompatDialog = waitUntilTriggerAction.triggerConfigDialog;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        waitUntilTriggerAction.triggerConfigDialog = null;
        Macro macro = waitUntilTriggerAction.m_macro;
        if (macro != null) {
            macro.setActionBeingConfigured((Action) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m13798w3(WaitUntilTriggerAction waitUntilTriggerAction, DialogInterface dialogInterface) {
        C13706o.m87929f(waitUntilTriggerAction, "this$0");
        ArrayList<Trigger> arrayList = waitUntilTriggerAction.originalTriggerList;
        if (arrayList != null) {
            waitUntilTriggerAction.triggersToWaitFor = arrayList;
        }
        waitUntilTriggerAction.originalTriggerList = null;
        Macro macro = waitUntilTriggerAction.m_macro;
        if (macro != null) {
            macro.setActionBeingConfigured((Action) null);
        }
        waitUntilTriggerAction.triggerConfigDialog = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m13799x3(WaitUntilTriggerAction waitUntilTriggerAction, Activity activity, View view) {
        C13706o.m87929f(waitUntilTriggerAction, "this$0");
        AppCompatDialog appCompatDialog = waitUntilTriggerAction.triggerConfigDialog;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
        }
        waitUntilTriggerAction.triggerConfigDialog = null;
        if (activity != null) {
            C4934n M = C4934n.m18998M();
            Long Y0 = waitUntilTriggerAction.mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            if (M.mo29682Q(Y0.longValue()) == null) {
                waitUntilTriggerAction.m_macro.setCompleted(false);
                C4934n.m18998M().mo29701s(waitUntilTriggerAction.m_macro, false);
            }
            Intent intent = new Intent(activity, AddTriggerActivity.class);
            intent.putExtra("MacroId", waitUntilTriggerAction.m_macro.getId());
            intent.putExtra("ParentGUID", waitUntilTriggerAction.mo27847f1());
            activity.startActivityForResult(intent, REQUEST_CODE_ADD_TRIGGER);
        }
    }

    /* renamed from: y3 */
    private final void m13800y3() {
        ArrayList<Trigger> arrayList = this.triggersToWaitFor;
        if (arrayList == null) {
            C13706o.m87945v("triggersToWaitFor");
            arrayList = null;
        }
        Iterator<Trigger> it = arrayList.iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            next.mo24687G2(this.m_macro);
            next.mo31544V2();
        }
    }

    /* renamed from: A3 */
    public final Stack<Integer> mo26116A3() {
        return this.skipEndIfIndexStack;
    }

    /* renamed from: B3 */
    public final ArrayList<Trigger> mo26117B3() {
        ArrayList<Trigger> arrayList = this.triggersToWaitFor;
        if (arrayList != null) {
            return arrayList;
        }
        C13706o.m87945v("triggersToWaitFor");
        return null;
    }

    /* renamed from: C3 */
    public final void mo26118C3(Trigger trigger) {
        C13706o.m87929f(trigger, "trigger");
        m13793q3();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            ArrayList<Trigger> arrayList = this.triggersToWaitFor;
            ArrayList<Trigger> arrayList2 = null;
            if (arrayList == null) {
                C13706o.m87945v("triggersToWaitFor");
                arrayList = null;
            }
            if (arrayList.size() > i) {
                ArrayList<Trigger> arrayList3 = this.triggersToWaitFor;
                if (arrayList3 == null) {
                    C13706o.m87945v("triggersToWaitFor");
                    arrayList3 = null;
                }
                Trigger trigger = arrayList3.get(i);
                C13706o.m87928e(trigger, "triggersToWaitFor[i]");
                sb.append(trigger.mo27823H0());
                ArrayList<Trigger> arrayList4 = this.triggersToWaitFor;
                if (arrayList4 == null) {
                    C13706o.m87945v("triggersToWaitFor");
                } else {
                    arrayList2 = arrayList4;
                }
                if (i < arrayList2.size() - 1 && i < 4) {
                    sb.append(" ");
                    sb.append(SelectableItem.m15535j1(C17541R$string.f7057or));
                    sb.append(" ");
                }
            }
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "triggersList.toString()");
        return sb2;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7735e5.f18714j.mo37750a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo24692U2() {
        mo26121s3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        ArrayList<Trigger> arrayList = this.triggersToWaitFor;
        if (arrayList == null) {
            C13706o.m87945v("triggersToWaitFor");
            arrayList = null;
        }
        Iterator<Trigger> it = arrayList.iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            next.mo24687G2(this.m_macro);
            next.mo31544V2();
        }
    }

    /* renamed from: c2 */
    public void mo26119c2() {
        if (this.triggerConfigDialog != null) {
            m13795t3(false);
        }
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo2, boolean z2) {
        C13706o.m87929f(stack, "skipEndIfIndexSt");
        this.skipEndIfIndexStack = stack;
        this.resumeMacroInfo = resumeMacroInfo2;
        mo27837X0().setWaitForTriggerActive(this);
        mo27837X0().setOriginalTriggerContextInfo(triggerContextInfo);
        m13800y3();
    }

    /* renamed from: p3 */
    public final void mo26120p3(Trigger trigger) {
        C13706o.m87929f(trigger, "trigger");
        ArrayList<Trigger> arrayList = this.triggersToWaitFor;
        if (arrayList == null) {
            C13706o.m87945v("triggersToWaitFor");
            arrayList = null;
        }
        arrayList.add(trigger);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        Trigger trigger = this.selectedTrigger;
        if (trigger != null) {
            trigger.mo24713q1(activity, i, i2, intent);
        }
        mo27877y2(activity);
        m13795t3(false);
    }

    /* renamed from: s3 */
    public final void mo26121s3() {
        ArrayList<Trigger> arrayList = this.triggersToWaitFor;
        if (arrayList == null) {
            C13706o.m87945v("triggersToWaitFor");
            arrayList = null;
        }
        Iterator<Trigger> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo31543T2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m13795t3(true);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        ArrayList<Trigger> arrayList = this.triggersToWaitFor;
        if (arrayList == null) {
            C13706o.m87945v("triggersToWaitFor");
            arrayList = null;
        }
        parcel.writeList(C13566b0.m87402F0(arrayList));
    }

    /* renamed from: z3 */
    public final ResumeMacroInfo mo26122z3() {
        return this.resumeMacroInfo;
    }

    public WaitUntilTriggerAction() {
        this.skipEndIfIndexStack = new Stack<>();
        m13784D1();
    }

    private WaitUntilTriggerAction(Parcel parcel) {
        super(parcel);
        this.skipEndIfIndexStack = new Stack<>();
        m13784D1();
        ArrayList<Trigger> readArrayList = parcel.readArrayList(Constraint.class.getClassLoader());
        C13706o.m87927d(readArrayList, "null cannot be cast to non-null type java.util.ArrayList<com.arlosoft.macrodroid.triggers.Trigger>");
        this.triggersToWaitFor = readArrayList;
    }
}
