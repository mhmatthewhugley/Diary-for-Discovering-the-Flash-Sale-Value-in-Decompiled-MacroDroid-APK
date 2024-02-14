package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import p057a2.C2224m;
import p128m0.C7707b3;
import p148q0.C8151a;

public class SendIntentAction extends Action implements C2224m {
    public static final Parcelable.Creator<SendIntentAction> CREATOR = new C2616a();
    private static final String TARGET_ACTIVITY = "Activity";
    private static final String TARGET_BROADCAST = "Broadcast";
    private static final String TARGET_SERVICE = "Service";
    private String m_action;
    private String m_class;
    private String m_className;
    private String m_data;
    private String m_extra1Name;
    private String m_extra1Value;
    private String m_extra2Name;
    private String m_extra2Value;
    private String m_extra3Name;
    private String m_extra3Value;
    private String m_extra4Name;
    private String m_extra4Value;
    private String m_mimeType;
    private String m_packageName;
    private String m_target;

    /* renamed from: com.arlosoft.macrodroid.action.SendIntentAction$a */
    class C2616a implements Parcelable.Creator<SendIntentAction> {
        C2616a() {
        }

        /* renamed from: a */
        public SendIntentAction createFromParcel(Parcel parcel) {
            return new SendIntentAction(parcel, (C2616a) null);
        }

        /* renamed from: b */
        public SendIntentAction[] newArray(int i) {
            return new SendIntentAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SendIntentAction$b */
    private class C2617b implements C4023j0.C4028e {

        /* renamed from: a */
        private final EditText f7495a;

        public C2617b(EditText editText) {
            this.f7495a = editText;
        }

        /* renamed from: a */
        public void mo25564a(C4023j0.C4029f fVar) {
            int max = Math.max(this.f7495a.getSelectionStart(), 0);
            int max2 = Math.max(this.f7495a.getSelectionEnd(), 0);
            Editable text = this.f7495a.getText();
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* synthetic */ SendIntentAction(Parcel parcel, C2616a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m12163r3(AppCompatDialog appCompatDialog, EditText editText, Spinner spinner, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, EditText editText12, EditText editText13, View view) {
        appCompatDialog.cancel();
        this.m_action = editText.getText().toString();
        this.m_target = spinner.getSelectedItem().toString();
        this.m_packageName = editText2.getText().toString();
        this.m_className = editText3.getText().toString();
        this.m_data = editText4.getText().toString();
        this.m_mimeType = editText5.getText().toString();
        this.m_extra1Name = editText6.getText().toString();
        this.m_extra1Value = editText7.getText().toString();
        this.m_extra2Name = editText8.getText().toString();
        this.m_extra2Value = editText9.getText().toString();
        this.m_extra3Name = editText10.getText().toString();
        this.m_extra3Value = editText11.getText().toString();
        this.m_extra4Name = editText12.getText().toString();
        this.m_extra4Value = editText13.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m12165t3(Activity activity, EditText editText, View view) {
        C4023j0.m15698D(activity, new C2617b(editText), mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m12166u3(Activity activity, EditText editText, View view) {
        C4023j0.m15698D(activity, new C2617b(editText), mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m12167v3(Activity activity, EditText editText, View view) {
        C4023j0.m15698D(activity, new C2617b(editText), mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m12168w3(Activity activity, EditText editText, View view) {
        C4023j0.m15698D(activity, new C2617b(editText), mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m12169x3(Activity activity, EditText editText, View view) {
        C4023j0.m15698D(activity, new C2617b(editText), mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m12170y3(Activity activity, EditText editText, View view) {
        C4023j0.m15698D(activity, new C2617b(editText), mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_data, this.m_extra1Value, this.m_extra2Value, this.m_extra3Value, this.m_extra4Value};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 5) {
            this.m_data = strArr[0];
            this.m_extra1Value = strArr[1];
            this.m_extra2Value = strArr[2];
            this.m_extra3Value = strArr[3];
            this.m_extra4Value = strArr[4];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_action;
    }

    /* renamed from: Q0 */
    public String mo25557Q0() {
        return SelectableItem.m15535j1(C17541R$string.action_send_intent_help);
    }

    /* renamed from: S0 */
    public int mo25558S0() {
        return C17530R$drawable.ic_android_white_24dp;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7707b3.m32135u();
    }

    /* renamed from: a1 */
    public String mo25559a1() {
        return mo27827K0().getString(C17541R$string.action_send_intent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:73|74|75|76|(2:78|120)(2:79|124)) */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017c, code lost:
        r3.putExtra(r13[r8], r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x015e */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c8 A[Catch:{ Exception -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01df A[Catch:{ Exception -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0164 A[Catch:{ NumberFormatException -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0172 A[Catch:{ NumberFormatException -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a2 A[Catch:{ Exception -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01bd A[Catch:{ Exception -> 0x01e7 }] */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "f"
            java.lang.String r3 = r1.m_target
            r3.hashCode()
            int r4 = r3.hashCode()
            java.lang.String r5 = "Broadcast"
            java.lang.String r6 = "Service"
            java.lang.String r7 = "Activity"
            r9 = 2
            r10 = 1
            r11 = 0
            switch(r4) {
                case -1591322833: goto L_0x002f;
                case -646160747: goto L_0x0026;
                case 385091745: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r3 = -1
            goto L_0x0037
        L_0x001d:
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            r3 = 2
            goto L_0x0037
        L_0x0026:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x002d
            goto L_0x001b
        L_0x002d:
            r3 = 1
            goto L_0x0037
        L_0x002f:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0036
            goto L_0x001b
        L_0x0036:
            r3 = 0
        L_0x0037:
            java.lang.String r4 = ""
            switch(r3) {
                case 0: goto L_0x0064;
                case 1: goto L_0x005e;
                case 2: goto L_0x0058;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SendIntentAction: Invalid intent target type: "
            r2.append(r3)
            java.lang.String r3 = r1.m_target
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            p148q0.C8151a.m33873n(r0)
            return
        L_0x0058:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            goto L_0x007b
        L_0x005e:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            goto L_0x007b
        L_0x0064:
            r3 = 0
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x0072 }
            r12.<init>()     // Catch:{ Exception -> 0x0072 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r12.addFlags(r3)     // Catch:{ Exception -> 0x0071 }
            r3 = r12
            goto L_0x007b
        L_0x0071:
            r3 = r12
        L_0x0072:
            android.content.Context r12 = r16.mo27827K0()
            java.lang.String r13 = "Cannot Launch Activity"
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r12, r13, r4, r11)
        L_0x007b:
            java.lang.String r12 = r1.m_data
            if (r12 == 0) goto L_0x009a
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x009a
            android.content.Context r12 = r16.mo27827K0()
            java.lang.String r13 = r1.m_data
            com.arlosoft.macrodroid.macro.Macro r14 = r16.mo27837X0()
            java.lang.String r12 = com.arlosoft.macrodroid.common.C4023j0.m15764v0(r12, r13, r0, r11, r14)
            android.net.Uri r12 = android.net.Uri.parse(r12)
            r3.setData(r12)
        L_0x009a:
            java.lang.String r12 = r1.m_packageName
            if (r12 == 0) goto L_0x00a9
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x00a9
            java.lang.String r12 = r1.m_packageName
            r3.setPackage(r12)
        L_0x00a9:
            java.lang.String r12 = r1.m_className
            if (r12 == 0) goto L_0x00ba
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x00ba
            java.lang.String r12 = r1.m_packageName
            java.lang.String r13 = r1.m_className
            r3.setClassName(r12, r13)
        L_0x00ba:
            java.lang.String r12 = r1.m_action
            if (r12 == 0) goto L_0x00c9
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x00c9
            java.lang.String r12 = r1.m_action
            r3.setAction(r12)
        L_0x00c9:
            java.lang.String r12 = r1.m_mimeType
            if (r12 == 0) goto L_0x00d8
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x00d8
            java.lang.String r12 = r1.m_mimeType
            r3.setType(r12)
        L_0x00d8:
            r12 = 4
            java.lang.String[] r13 = new java.lang.String[r12]
            java.lang.String r14 = r1.m_extra1Name
            r13[r11] = r14
            java.lang.String r14 = r1.m_extra2Name
            r13[r10] = r14
            java.lang.String r14 = r1.m_extra3Name
            r13[r9] = r14
            java.lang.String r14 = r1.m_extra4Name
            r15 = 3
            r13[r15] = r14
            java.lang.String[] r14 = new java.lang.String[r12]
            java.lang.String r8 = r1.m_extra1Value
            r14[r11] = r8
            java.lang.String r8 = r1.m_extra2Value
            r14[r10] = r8
            java.lang.String r8 = r1.m_extra3Value
            r14[r9] = r8
            java.lang.String r8 = r1.m_extra4Value
            r14[r15] = r8
            r8 = 0
        L_0x00ff:
            if (r8 >= r12) goto L_0x0197
            r15 = r13[r8]
            if (r15 == 0) goto L_0x018f
            r15 = r14[r8]
            if (r15 == 0) goto L_0x018f
            r15 = r13[r8]
            int r15 = r15.length()
            if (r15 <= 0) goto L_0x018f
            r15 = r14[r8]
            int r15 = r15.length()
            if (r15 <= 0) goto L_0x018f
            android.content.Context r15 = r16.mo27827K0()
            r12 = r14[r8]
            com.arlosoft.macrodroid.macro.Macro r9 = r16.mo27837X0()
            java.lang.String r9 = com.arlosoft.macrodroid.common.C4023j0.m15764v0(r15, r12, r0, r11, r9)
            java.lang.String r12 = "\""
            boolean r15 = r9.startsWith(r12)
            if (r15 == 0) goto L_0x0144
            boolean r12 = r9.endsWith(r12)
            if (r12 == 0) goto L_0x0144
            int r12 = r9.length()
            int r12 = r12 - r10
            java.lang.String r9 = r9.substring(r10, r12)
            r12 = r13[r8]
            r3.putExtra(r12, r9)
            goto L_0x018f
        L_0x0144:
            java.lang.String r12 = "true"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0189
            java.lang.String r12 = "false"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0182
            int r12 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x015e }
            r15 = r13[r8]     // Catch:{ NumberFormatException -> 0x015e }
            r3.putExtra(r15, r12)     // Catch:{ NumberFormatException -> 0x015e }
            goto L_0x018f
        L_0x015e:
            boolean r12 = r9.endsWith(r2)     // Catch:{ NumberFormatException -> 0x017c }
            if (r12 == 0) goto L_0x0172
            java.lang.String r12 = r9.replace(r2, r4)     // Catch:{ NumberFormatException -> 0x017c }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x017c }
            r15 = r13[r8]     // Catch:{ NumberFormatException -> 0x017c }
            r3.putExtra(r15, r12)     // Catch:{ NumberFormatException -> 0x017c }
            goto L_0x018f
        L_0x0172:
            double r10 = java.lang.Double.parseDouble(r9)     // Catch:{ NumberFormatException -> 0x017c }
            r12 = r13[r8]     // Catch:{ NumberFormatException -> 0x017c }
            r3.putExtra(r12, r10)     // Catch:{ NumberFormatException -> 0x017c }
            goto L_0x018f
        L_0x017c:
            r10 = r13[r8]
            r3.putExtra(r10, r9)
            goto L_0x018f
        L_0x0182:
            r9 = r13[r8]
            r10 = 0
            r3.putExtra(r9, r10)
            goto L_0x018f
        L_0x0189:
            r9 = r13[r8]
            r10 = 1
            r3.putExtra(r9, r10)
        L_0x018f:
            int r8 = r8 + 1
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 4
            goto L_0x00ff
        L_0x0197:
            java.lang.String r0 = r1.m_target     // Catch:{ Exception -> 0x01e7 }
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x01e7 }
            r4 = -1591322833(0xffffffffa126572f, float:-5.6358374E-19)
            if (r2 == r4) goto L_0x01bd
            r4 = -646160747(0xffffffffd97c5e95, float:-4.43973051E15)
            if (r2 == r4) goto L_0x01b5
            r4 = 385091745(0x16f408a1, float:3.9425772E-25)
            if (r2 == r4) goto L_0x01ad
            goto L_0x01c5
        L_0x01ad:
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c5
            r8 = 1
            goto L_0x01c6
        L_0x01b5:
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c5
            r8 = 2
            goto L_0x01c6
        L_0x01bd:
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c5
            r8 = 0
            goto L_0x01c6
        L_0x01c5:
            r8 = -1
        L_0x01c6:
            if (r8 == 0) goto L_0x01df
            r0 = 1
            if (r8 == r0) goto L_0x01d7
            r0 = 2
            if (r8 == r0) goto L_0x01cf
            goto L_0x01f6
        L_0x01cf:
            android.content.Context r0 = r16.mo27827K0()     // Catch:{ Exception -> 0x01e7 }
            r0.startService(r3)     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01f6
        L_0x01d7:
            android.content.Context r0 = r16.mo27827K0()     // Catch:{ Exception -> 0x01e7 }
            r0.sendBroadcast(r3)     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01f6
        L_0x01df:
            android.content.Context r0 = r16.mo27827K0()     // Catch:{ Exception -> 0x01e7 }
            r0.startActivity(r3)     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01f6
        L_0x01e7:
            r0 = move-exception
            android.content.Context r2 = r16.mo27827K0()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Send Intent Failed"
            r4 = 0
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r2, r3, r0, r4)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SendIntentAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0300  */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24714u1() {
        /*
            r46 = this;
            r15 = r46
            android.app.Activity r14 = r46.mo27850j0()
            androidx.appcompat.app.AppCompatDialog r13 = new androidx.appcompat.app.AppCompatDialog
            int r0 = r46.mo24688L0()
            r13.<init>(r14, r0)
            r0 = 2131558503(0x7f0d0067, float:1.8742324E38)
            r13.setContentView((int) r0)
            r0 = 2131952105(0x7f1301e9, float:1.9540643E38)
            r13.setTitle((int) r0)
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            android.view.Window r1 = r13.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r0.copyFrom(r1)
            r1 = -1
            r0.width = r1
            android.view.Window r1 = r13.getWindow()
            r1.setAttributes(r0)
            r0 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = r0
            android.widget.Button r12 = (android.widget.Button) r12
            r0 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r0 = r13.findViewById(r0)
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362286(0x7f0a01ee, float:1.8344348E38)
            android.view.View r0 = r13.findViewById(r0)
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 2131362305(0x7f0a0201, float:1.8344387E38)
            android.view.View r0 = r13.findViewById(r0)
            r5 = r0
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0 = 2131362300(0x7f0a01fc, float:1.8344377E38)
            android.view.View r0 = r13.findViewById(r0)
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 2131362287(0x7f0a01ef, float:1.834435E38)
            android.view.View r0 = r13.findViewById(r0)
            r7 = r0
            android.widget.EditText r7 = (android.widget.EditText) r7
            r0 = 2131362288(0x7f0a01f0, float:1.8344352E38)
            android.view.View r0 = r13.findViewById(r0)
            r10 = r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 2131362298(0x7f0a01fa, float:1.8344373E38)
            android.view.View r0 = r13.findViewById(r0)
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 2131362290(0x7f0a01f2, float:1.8344356E38)
            android.view.View r0 = r13.findViewById(r0)
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 2131362291(0x7f0a01f3, float:1.8344358E38)
            android.view.View r0 = r13.findViewById(r0)
            r3 = r0
            android.widget.EditText r3 = (android.widget.EditText) r3
            r0 = 2131362292(0x7f0a01f4, float:1.834436E38)
            android.view.View r0 = r13.findViewById(r0)
            r2 = r0
            android.widget.EditText r2 = (android.widget.EditText) r2
            r0 = 2131362293(0x7f0a01f5, float:1.8344362E38)
            android.view.View r0 = r13.findViewById(r0)
            r1 = r0
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            android.view.View r0 = r13.findViewById(r0)
            r16 = r14
            r14 = r0
            android.widget.EditText r14 = (android.widget.EditText) r14
            r0 = 2131362295(0x7f0a01f7, float:1.8344367E38)
            android.view.View r0 = r13.findViewById(r0)
            r17 = r12
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 2131362296(0x7f0a01f8, float:1.8344369E38)
            android.view.View r0 = r13.findViewById(r0)
            r18 = r11
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 2131362297(0x7f0a01f9, float:1.834437E38)
            android.view.View r0 = r13.findViewById(r0)
            r19 = r11
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 2131362289(0x7f0a01f1, float:1.8344354E38)
            android.view.View r0 = r13.findViewById(r0)
            r20 = r11
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362299(0x7f0a01fb, float:1.8344375E38)
            android.view.View r0 = r13.findViewById(r0)
            r21 = r11
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362301(0x7f0a01fd, float:1.8344379E38)
            android.view.View r0 = r13.findViewById(r0)
            r22 = r11
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362302(0x7f0a01fe, float:1.834438E38)
            android.view.View r0 = r13.findViewById(r0)
            r23 = r11
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362303(0x7f0a01ff, float:1.8344383E38)
            android.view.View r0 = r13.findViewById(r0)
            r24 = r11
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362304(0x7f0a0200, float:1.8344385E38)
            android.view.View r0 = r13.findViewById(r0)
            r25 = r11
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131362756(0x7f0a03c4, float:1.8345302E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r26 = r11
            r11 = 2131362757(0x7f0a03c5, float:1.8345304E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r27 = r12
            r12 = 2131362758(0x7f0a03c6, float:1.8345306E38)
            android.view.View r12 = r13.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r28 = r14
            r14 = 2131362759(0x7f0a03c7, float:1.8345308E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r29 = r13
            r30 = 2131953958(0x7f130926, float:1.9544402E38)
            java.lang.String r13 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r30)     // Catch:{ Exception -> 0x01b1 }
            r32 = r1
            r1 = 1
            r33 = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01af }
            java.lang.Integer r34 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01af }
            r31 = 0
            r2[r31] = r34     // Catch:{ Exception -> 0x01af }
            java.lang.String r2 = java.lang.String.format(r13, r2)     // Catch:{ Exception -> 0x01af }
            r0.setText(r2)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r30)     // Catch:{ Exception -> 0x01af }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01af }
            r13 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01af }
            r31 = 0
            r2[r31] = r13     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ Exception -> 0x01af }
            r11.setText(r0)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r30)     // Catch:{ Exception -> 0x01af }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01af }
            r11 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01af }
            r11 = 0
            r2[r11] = r13     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ Exception -> 0x01af }
            r12.setText(r0)     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r30)     // Catch:{ Exception -> 0x01af }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01af }
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01af }
            r11 = 0
            r1[r11] = r2     // Catch:{ Exception -> 0x01af }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x01af }
            r14.setText(r0)     // Catch:{ Exception -> 0x01af }
            goto L_0x01b9
        L_0x01af:
            r0 = move-exception
            goto L_0x01b6
        L_0x01b1:
            r0 = move-exception
            r32 = r1
            r33 = r2
        L_0x01b6:
            p148q0.C8151a.m33873n(r0)
        L_0x01b9:
            java.lang.String r0 = r15.m_target
            r1 = 0
            if (r0 != 0) goto L_0x01c6
            java.lang.Object r0 = r5.getItemAtPosition(r1)
            java.lang.String r0 = (java.lang.String) r0
            r15.m_target = r0
        L_0x01c6:
            r1 = 3
            r13 = 0
        L_0x01c8:
            if (r13 >= r1) goto L_0x01e0
            java.lang.String r0 = r15.m_target
            java.lang.Object r2 = r5.getItemAtPosition(r13)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01dd
            r5.setSelection(r13)
        L_0x01dd:
            int r13 = r13 + 1
            goto L_0x01c8
        L_0x01e0:
            java.lang.String r0 = r15.m_action
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f4
            java.lang.String r0 = r15.m_action
            r4.setText(r0)
            int r0 = r4.length()
            r4.setSelection(r0)
        L_0x01f4:
            java.lang.String r0 = r15.m_packageName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = r15.m_packageName
            r6.setText(r0)
            int r0 = r6.length()
            r6.setSelection(r0)
        L_0x0208:
            java.lang.String r0 = r15.m_className
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x021c
            java.lang.String r0 = r15.m_className
            r7.setText(r0)
            int r0 = r7.length()
            r7.setSelection(r0)
        L_0x021c:
            java.lang.String r0 = r15.m_data
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0230
            java.lang.String r0 = r15.m_data
            r10.setText(r0)
            int r0 = r10.length()
            r10.setSelection(r0)
        L_0x0230:
            java.lang.String r0 = r15.m_mimeType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0244
            java.lang.String r0 = r15.m_mimeType
            r9.setText(r0)
            int r0 = r9.length()
            r9.setSelection(r0)
        L_0x0244:
            java.lang.String r0 = r15.m_extra1Name
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0258
            java.lang.String r0 = r15.m_extra1Name
            r8.setText(r0)
            int r0 = r8.length()
            r8.setSelection(r0)
        L_0x0258:
            java.lang.String r0 = r15.m_extra1Value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = r15.m_extra1Value
            r3.setText(r0)
            int r0 = r3.length()
            r3.setSelection(r0)
        L_0x026c:
            java.lang.String r0 = r15.m_extra2Name
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0283
            java.lang.String r0 = r15.m_extra2Name
            r2 = r33
            r2.setText(r0)
            int r0 = r2.length()
            r2.setSelection(r0)
            goto L_0x0285
        L_0x0283:
            r2 = r33
        L_0x0285:
            java.lang.String r0 = r15.m_extra2Value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x029c
            java.lang.String r0 = r15.m_extra2Value
            r1 = r32
            r1.setText(r0)
            int r0 = r1.length()
            r1.setSelection(r0)
            goto L_0x029e
        L_0x029c:
            r1 = r32
        L_0x029e:
            java.lang.String r0 = r15.m_extra3Name
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02b5
            java.lang.String r0 = r15.m_extra3Name
            r14 = r28
            r14.setText(r0)
            int r0 = r14.length()
            r14.setSelection(r0)
            goto L_0x02b7
        L_0x02b5:
            r14 = r28
        L_0x02b7:
            java.lang.String r0 = r15.m_extra3Value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = r15.m_extra3Value
            r12 = r27
            r12.setText(r0)
            int r0 = r12.length()
            r12.setSelection(r0)
            goto L_0x02d0
        L_0x02ce:
            r12 = r27
        L_0x02d0:
            java.lang.String r0 = r15.m_extra4Name
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02e7
            java.lang.String r0 = r15.m_extra4Name
            r11 = r19
            r11.setText(r0)
            int r0 = r11.length()
            r11.setSelection(r0)
            goto L_0x02e9
        L_0x02e7:
            r11 = r19
        L_0x02e9:
            java.lang.String r0 = r15.m_extra4Value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0300
            java.lang.String r0 = r15.m_extra4Value
            r13 = r20
            r13.setText(r0)
            int r0 = r13.length()
            r13.setSelection(r0)
            goto L_0x0302
        L_0x0300:
            r13 = r20
        L_0x0302:
            com.arlosoft.macrodroid.action.jf r0 = new com.arlosoft.macrodroid.action.jf
            r32 = r1
            r1 = r0
            r19 = r2
            r2 = r46
            r20 = r3
            r3 = r29
            r27 = r8
            r8 = r10
            r28 = r9
            r35 = r10
            r10 = r27
            r36 = r21
            r37 = r22
            r38 = r23
            r39 = r24
            r40 = r25
            r41 = r26
            r21 = r13
            r13 = r18
            r18 = r11
            r11 = r20
            r27 = r12
            r42 = r17
            r12 = r19
            r44 = r13
            r43 = r29
            r13 = r32
            r45 = r16
            r15 = r27
            r16 = r18
            r17 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r42
            r1.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.cf r0 = new com.arlosoft.macrodroid.action.cf
            r1 = r43
            r0.<init>(r1)
            r2 = r44
            r2.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.df r0 = new com.arlosoft.macrodroid.action.df
            r2 = r46
            r3 = r35
            r4 = r45
            r0.<init>(r2, r4, r3)
            r3 = r36
            r3.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.ff r0 = new com.arlosoft.macrodroid.action.ff
            r3 = r28
            r0.<init>(r2, r4, r3)
            r3 = r37
            r3.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.ef r0 = new com.arlosoft.macrodroid.action.ef
            r3 = r20
            r0.<init>(r2, r4, r3)
            r3 = r38
            r3.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.hf r0 = new com.arlosoft.macrodroid.action.hf
            r3 = r32
            r0.<init>(r2, r4, r3)
            r3 = r39
            r3.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.if r0 = new com.arlosoft.macrodroid.action.if
            r3 = r27
            r0.<init>(r2, r4, r3)
            r3 = r40
            r3.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.gf r0 = new com.arlosoft.macrodroid.action.gf
            r3 = r21
            r0.<init>(r2, r4, r3)
            r3 = r41
            r3.setOnClickListener(r0)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SendIntentAction.mo24714u1():void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_action);
        parcel.writeString(this.m_target);
        parcel.writeString(this.m_packageName);
        parcel.writeString(this.m_className);
        parcel.writeString(this.m_data);
        parcel.writeString(this.m_mimeType);
        parcel.writeString(this.m_class);
        parcel.writeString(this.m_extra1Name);
        parcel.writeString(this.m_extra1Value);
        parcel.writeString(this.m_extra2Name);
        parcel.writeString(this.m_extra2Value);
        parcel.writeString(this.m_extra3Name);
        parcel.writeString(this.m_extra3Value);
        parcel.writeString(this.m_extra4Name);
        parcel.writeString(this.m_extra4Value);
    }

    public SendIntentAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SendIntentAction() {
    }

    private SendIntentAction(Parcel parcel) {
        super(parcel);
        this.m_action = parcel.readString();
        this.m_target = parcel.readString();
        this.m_packageName = parcel.readString();
        this.m_className = parcel.readString();
        this.m_data = parcel.readString();
        this.m_mimeType = parcel.readString();
        this.m_class = parcel.readString();
        this.m_extra1Name = parcel.readString();
        this.m_extra1Value = parcel.readString();
        this.m_extra2Name = parcel.readString();
        this.m_extra2Value = parcel.readString();
        this.m_extra3Name = parcel.readString();
        this.m_extra3Value = parcel.readString();
        this.m_extra4Name = parcel.readString();
        this.m_extra4Value = parcel.readString();
    }
}
