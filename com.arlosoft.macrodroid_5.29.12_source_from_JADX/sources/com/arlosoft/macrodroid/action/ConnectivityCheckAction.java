package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p057a2.C2212a;
import p057a2.C2216e;
import p057a2.C2219h;
import p057a2.C2224m;
import p128m0.C7692a0;
import p270ga.C12318a;
import p319lc.C15626c;
import p414v9.C16747p;
import p414v9.C16749r;
import p440y9.C16971a;

/* compiled from: ConnectivityCheckAction.kt */
public final class ConnectivityCheckAction extends Action implements C2219h, C2224m, C2212a, C2216e {
    public static final Parcelable.Creator<ConnectivityCheckAction> CREATOR = new C2379a();

    /* renamed from: d */
    public static final C2380b f7195d = new C2380b((C13695i) null);
    private boolean blockActions;
    private String site;
    private int timeout;
    private DictionaryKeys varDictionaryKeys;
    private MacroDroidVariable variable;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.ConnectivityCheckAction$a */
    /* compiled from: ConnectivityCheckAction.kt */
    public static final class C2379a implements Parcelable.Creator<ConnectivityCheckAction> {
        C2379a() {
        }

        /* renamed from: a */
        public ConnectivityCheckAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ConnectivityCheckAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ConnectivityCheckAction[] newArray(int i) {
            return new ConnectivityCheckAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ConnectivityCheckAction$b */
    /* compiled from: ConnectivityCheckAction.kt */
    public static final class C2380b {
        private C2380b() {
        }

        public /* synthetic */ C2380b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ConnectivityCheckAction$c */
    /* compiled from: ConnectivityCheckAction.kt */
    public static final class C2381c implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ConnectivityCheckAction f7196a;

        C2381c(ConnectivityCheckAction connectivityCheckAction) {
            this.f7196a = connectivityCheckAction;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            this.f7196a.workingVariable = null;
            this.f7196a.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7196a.workingVariable = macroDroidVariable;
            this.f7196a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ConnectivityCheckAction$d */
    /* compiled from: ConnectivityCheckAction.kt */
    public static final class C2382d implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ConnectivityCheckAction f7197a;

        C2382d(ConnectivityCheckAction connectivityCheckAction) {
            this.f7197a = connectivityCheckAction;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            this.f7197a.workingVariable = null;
            this.f7197a.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7197a.workingVariable = macroDroidVariable;
            this.f7197a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    public ConnectivityCheckAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ConnectivityCheckAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m10238A3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final C16749r m10239B3(ConnectivityCheckAction connectivityCheckAction, TriggerContextInfo triggerContextInfo) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        return C16747p.m99412k(Boolean.valueOf(connectivityCheckAction.m10243F3(triggerContextInfo)));
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m10240C3(ConnectivityCheckAction connectivityCheckAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        C13706o.m87929f(stack, "$skipToEndifIndexStack");
        if (connectivityCheckAction.blockActions && !z) {
            connectivityCheckAction.mo27837X0().invokeActions(connectivityCheckAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m10241D3(ConnectivityCheckAction connectivityCheckAction, TriggerContextInfo triggerContextInfo, Boolean bool) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        C13706o.m87928e(bool, "connected");
        connectivityCheckAction.m10244G3(bool.booleanValue(), triggerContextInfo);
        if (!connectivityCheckAction.mo27837X0().isExcludedFromLog()) {
            String str = "Connected to " + connectivityCheckAction.site + ": " + bool;
            Long Y0 = connectivityCheckAction.mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18874m(str, Y0.longValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m10242E3(ConnectivityCheckAction connectivityCheckAction, TriggerContextInfo triggerContextInfo, Throwable th) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        if (!connectivityCheckAction.mo27837X0().isExcludedFromLog()) {
            if ((th instanceof UnknownHostException) || (th instanceof TimeoutException)) {
                Long Y0 = connectivityCheckAction.mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18874m("Could not connect to: " + connectivityCheckAction.site, Y0.longValue());
            } else {
                Long Y02 = connectivityCheckAction.mo27840Y0();
                C13706o.m87928e(Y02, "macroGuid");
                C4878b.m18869h("Connectivity check failure: " + th.getMessage(), Y02.longValue());
            }
        }
        connectivityCheckAction.m10244G3(false, triggerContextInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m10243F3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r6) {
        /*
            r5 = this;
            java.lang.String r0 = "http://"
            android.content.Context r1 = r5.mo27827K0()
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.C13706o.m87927d(r1, r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            r2 = 0
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L_0x00b0
            android.content.Context r1 = r5.mo27827K0()     // Catch:{ IOException -> 0x008a }
            java.lang.String r3 = r5.site     // Catch:{ IOException -> 0x008a }
            com.arlosoft.macrodroid.macro.Macro r4 = r5.mo27837X0()     // Catch:{ IOException -> 0x008a }
            java.lang.String r6 = com.arlosoft.macrodroid.common.C4023j0.m15764v0(r1, r3, r6, r2, r4)     // Catch:{ IOException -> 0x008a }
            java.lang.String r1 = "siteToUse"
            kotlin.jvm.internal.C13706o.m87928e(r6, r1)     // Catch:{ IOException -> 0x008a }
            r1 = 0
            r3 = 2
            boolean r4 = kotlin.text.C15176v.m93634I(r6, r0, r2, r3, r1)     // Catch:{ IOException -> 0x008a }
            if (r4 != 0) goto L_0x0059
            java.lang.String r4 = "https://"
            boolean r1 = kotlin.text.C15176v.m93634I(r6, r4, r2, r3, r1)     // Catch:{ IOException -> 0x008a }
            if (r1 == 0) goto L_0x0044
            goto L_0x0059
        L_0x0044:
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x008a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008a }
            r3.<init>()     // Catch:{ IOException -> 0x008a }
            r3.append(r0)     // Catch:{ IOException -> 0x008a }
            r3.append(r6)     // Catch:{ IOException -> 0x008a }
            java.lang.String r6 = r3.toString()     // Catch:{ IOException -> 0x008a }
            r1.<init>(r6)     // Catch:{ IOException -> 0x008a }
            goto L_0x005e
        L_0x0059:
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x008a }
            r1.<init>(r6)     // Catch:{ IOException -> 0x008a }
        L_0x005e:
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ IOException -> 0x008a }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.C13706o.m87927d(r6, r0)     // Catch:{ IOException -> 0x008a }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x008a }
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "test"
            r6.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x008a }
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            r6.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x008a }
            int r0 = r5.timeout     // Catch:{ IOException -> 0x008a }
            r6.setConnectTimeout(r0)     // Catch:{ IOException -> 0x008a }
            r6.connect()     // Catch:{ IOException -> 0x008a }
            int r6 = r6.getResponseCode()     // Catch:{ IOException -> 0x008a }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x00b0
            r6 = 1
            r2 = 1
            goto L_0x00b0
        L_0x008a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Connectivity check failure: "
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.Long r0 = r5.mo27840Y0()
            java.lang.String r1 = "macroGuid"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            long r0 = r0.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r6, r0)
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ConnectivityCheckAction.m10243F3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: G3 */
    private final void m10244G3(boolean z, TriggerContextInfo triggerContextInfo) {
        List<String> list;
        MacroDroidVariable macroDroidVariable = this.variable;
        String str = null;
        MacroDroidVariable q = mo27861q(macroDroidVariable != null ? macroDroidVariable.getName() : null);
        if (q == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Connectivity check action variable not found ");
            MacroDroidVariable macroDroidVariable2 = this.variable;
            if (macroDroidVariable2 != null) {
                str = macroDroidVariable2.getName();
            }
            sb.append(str);
            String sb2 = sb.toString();
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h(sb2, Y0.longValue());
            return;
        }
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        DictionaryKeys dictionaryKeys = this.varDictionaryKeys;
        if (dictionaryKeys == null || (list = dictionaryKeys.getKeys()) == null) {
            list = C13614t.m87748j();
        }
        Macro X0 = mo27837X0();
        C13706o.m87928e(X0, "macro");
        mo27832M2(q, new VariableValue.BooleanValue(z, C6520o0.m24868C(K0, list, triggerContextInfo, X0)));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m10257v3(ConnectivityCheckAction connectivityCheckAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C6440u1.m24747d(connectivityCheckAction.mo27850j0(), (Spinner) appCompatDialog.findViewById(C17532R$id.booleanVariableSpinner), connectivityCheckAction, connectivityCheckAction.mo24688L0(), 0, new C3244m3(connectivityCheckAction, appCompatDialog));
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m10258w3(ConnectivityCheckAction connectivityCheckAction, AppCompatDialog appCompatDialog, MacroDroidVariable macroDroidVariable) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        connectivityCheckAction.workingVariable = macroDroidVariable;
        connectivityCheckAction.workingDictionaryKeys = null;
        List e = C13612s.m87736e(SelectableItem.m15535j1(C17541R$string.action_set_variable_select));
        Activity j0 = connectivityCheckAction.mo27850j0();
        C13706o.m87928e(j0, "activity");
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.booleanVariableSpinner);
        C13706o.m87928e(spinner, "dialog.booleanVariableSpinner");
        C6520o0.m24874F(j0, C17542R$style.Theme_App_Dialog_Action, connectivityCheckAction, spinner, connectivityCheckAction.mo27837X0(), e, macroDroidVariable.getName(), "", true, new C2381c(connectivityCheckAction));
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m10259x3(AppCompatDialog appCompatDialog, C4023j0.C4029f fVar) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        int i = C17532R$id.urlText;
        int max = Math.max(((AppCompatEditText) appCompatDialog.findViewById(i)).getSelectionStart(), 0);
        int max2 = Math.max(((AppCompatEditText) appCompatDialog.findViewById(i)).getSelectionEnd(), 0);
        Editable text = ((AppCompatEditText) appCompatDialog.findViewById(i)).getText();
        C13706o.m87926c(text);
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m10260y3(ConnectivityCheckAction connectivityCheckAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(connectivityCheckAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15698D(connectivityCheckAction.mo27850j0(), eVar, connectivityCheckAction.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, connectivityCheckAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m10261z3(AppCompatDialog appCompatDialog, String str, ConnectivityCheckAction connectivityCheckAction, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(str, "$noBooleanVarsConfigured");
        C13706o.m87929f(connectivityCheckAction, "this$0");
        int i = C17532R$id.urlText;
        Editable text = ((AppCompatEditText) appCompatDialog.findViewById(i)).getText();
        C13706o.m87926c(text);
        boolean z = true;
        if (!(text.length() == 0)) {
            int i2 = C17532R$id.timeoutMs;
            Editable text2 = ((AppCompatEditText) appCompatDialog.findViewById(i2)).getText();
            C13706o.m87926c(text2);
            if (text2.length() != 0) {
                z = false;
            }
            if (!z) {
                int i3 = C17532R$id.booleanVariableSpinner;
                if (((Spinner) appCompatDialog.findViewById(i3)).getAdapter().getCount() != 0 && !C13706o.m87924a(((Spinner) appCompatDialog.findViewById(i3)).getSelectedItem(), str)) {
                    if (connectivityCheckAction.workingVariable == null) {
                        C15626c.makeText(connectivityCheckAction.mo27850j0().getApplicationContext(), C17541R$string.action_set_variable_select, 0).show();
                        return;
                    }
                    connectivityCheckAction.site = String.valueOf(((AppCompatEditText) appCompatDialog.findViewById(i)).getText());
                    connectivityCheckAction.timeout = Integer.parseInt(String.valueOf(((AppCompatEditText) appCompatDialog.findViewById(i2)).getText()));
                    connectivityCheckAction.blockActions = ((CheckBox) appCompatDialog.findViewById(C17532R$id.blockActionsCheckbox)).isChecked();
                    connectivityCheckAction.variable = connectivityCheckAction.workingVariable;
                    connectivityCheckAction.varDictionaryKeys = connectivityCheckAction.workingDictionaryKeys;
                    appCompatDialog.dismiss();
                    connectivityCheckAction.mo24689O1();
                    return;
                }
            }
        }
        C15626c.makeText(connectivityCheckAction.mo27850j0().getApplicationContext(), C17541R$string.invalid_value, 0).show();
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.site};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        boolean z = true;
        if (strArr == null || strArr.length != 1) {
            z = false;
        }
        if (z) {
            this.site = strArr[0];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.site);
        sb.append(" -> ");
        MacroDroidVariable macroDroidVariable = this.variable;
        sb.append(macroDroidVariable != null ? macroDroidVariable.getName() : null);
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7692a0.f18639j.mo37740a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        C13706o.m87929f(stack, "skipToEndifIndexStack");
        C16747p.m99408d(new C3272n3(this, triggerContextInfo)).mo79730q(C12318a.m83030b()).mo79726l(C16971a.m100210a()).mo79723e(new C3132i3(this, z2, i, triggerContextInfo, z, stack, resumeMacroInfo)).mo79729o(new C3160j3(this, triggerContextInfo), new C3188k3(this, triggerContextInfo));
        if (!this.blockActions && !z2) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* renamed from: h3 */
    public void mo24703h3(TriggerContextInfo triggerContextInfo) {
        if (mo27839Y()) {
            mo24421h(triggerContextInfo, 0, true, new Stack(), (ResumeMacroInfo) null, true);
        }
    }

    /* renamed from: k */
    public void mo24427k(DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_connectivity_check);
        appCompatDialog.setTitle((int) C17541R$string.action_connectivity_check);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        String str = null;
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo27827K0().getString(C17541R$string.timeout));
        sb.append(" (");
        String string = mo27827K0().getString(C17541R$string.milliseconds_capital);
        C13706o.m87928e(string, "context.getString(R.string.milliseconds_capital)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        sb.append(lowerCase);
        sb.append(')');
        ((TextInputLayout) appCompatDialog.findViewById(C17532R$id.timeoutMsTextInput)).setHint((CharSequence) sb.toString());
        ((AppCompatEditText) appCompatDialog.findViewById(C17532R$id.urlText)).setText(this.site);
        ((AppCompatEditText) appCompatDialog.findViewById(C17532R$id.timeoutMs)).setText(String.valueOf(this.timeout));
        ((CheckBox) appCompatDialog.findViewById(C17532R$id.blockActionsCheckbox)).setChecked(this.blockActions);
        ((Button) appCompatDialog.findViewById(C17532R$id.addVariableButton)).setOnClickListener(new C3076g3(this, appCompatDialog));
        this.workingVariable = this.variable;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        List e = C13612s.m87736e(SelectableItem.m15535j1(C17541R$string.action_set_variable_select));
        Activity j02 = mo27850j0();
        C13706o.m87928e(j02, "activity");
        int i = C17532R$id.booleanVariableSpinner;
        Spinner spinner = (Spinner) appCompatDialog.findViewById(i);
        C13706o.m87928e(spinner, "dialog.booleanVariableSpinner");
        Macro X0 = mo27837X0();
        if (this.variable != null) {
            StringBuilder sb2 = new StringBuilder();
            MacroDroidVariable macroDroidVariable = this.variable;
            if (macroDroidVariable != null) {
                str = macroDroidVariable.getName();
            }
            sb2.append(str);
            sb2.append(C6520o0.m24912e0(this.varDictionaryKeys));
            str = sb2.toString();
        }
        C6520o0.m24874F(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, e, str, "", true, new C2382d(this));
        String string2 = mo27827K0().getString(C17541R$string.no_boolean_variables_configured);
        C13706o.m87928e(string2, "context.getString(R.stri…ean_variables_configured)");
        if (((Spinner) appCompatDialog.findViewById(i)).getCount() == 0) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(mo27850j0(), C17535R$layout.simple_spinner_item, C13612s.m87736e(string2));
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            ((Spinner) appCompatDialog.findViewById(i)).setAdapter(arrayAdapter);
        }
        ((Button) appCompatDialog.findViewById(C17532R$id.urlMagicTextButton)).setOnClickListener(new C3104h3(this, new C3216l3(appCompatDialog)));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3048f3(appCompatDialog, string2, this));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3019e3(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.site);
        parcel.writeInt(this.timeout);
        parcel.writeParcelable(this.variable, i);
        parcel.writeInt(this.blockActions ? 1 : 0);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public ConnectivityCheckAction() {
        this.site = "www.google.com";
        this.timeout = PathInterpolatorCompat.MAX_NUM_POINTS;
        this.blockActions = true;
    }

    private ConnectivityCheckAction(Parcel parcel) {
        super(parcel);
        this.site = "www.google.com";
        this.timeout = PathInterpolatorCompat.MAX_NUM_POINTS;
        boolean z = true;
        this.blockActions = true;
        String readString = parcel.readString();
        this.site = readString == null ? "" : readString;
        this.timeout = parcel.readInt();
        this.variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.blockActions = parcel.readInt() == 0 ? false : z;
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
