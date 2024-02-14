package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4659f;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p057a2.C2212a;
import p057a2.C2221j;
import p057a2.C2224m;
import p057a2.C2225n;
import p128m0.C7699b;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: ActionBlockAction.kt */
public final class ActionBlockAction extends Action implements C2221j, C2212a, C2224m, C2225n {
    public static final Parcelable.Creator<ActionBlockAction> CREATOR = new C2317a();
    private static final int REQUEST_ID_PICK_ACTION_BLOCK = 66;

    /* renamed from: d */
    public static final C2318b f7125d = new C2318b((C13695i) null);
    private long actionBlockId;
    private String actionBlockName;
    /* access modifiers changed from: private */
    public boolean continueActionsWithoutWaiting;
    /* access modifiers changed from: private */
    public Map<String, DictionaryKeys> inputDictionaryMap;
    /* access modifiers changed from: private */
    public Map<String, String> inputVarsMap;
    /* access modifiers changed from: private */
    public Map<String, DictionaryKeys> outputDictionaryMap;
    /* access modifiers changed from: private */
    public Map<String, String> outputVarsMap;
    /* access modifiers changed from: private */
    public transient Map<String, String> tempInputVarsMap;
    /* access modifiers changed from: private */
    public transient Map<String, DictionaryKeys> workingInputDictionaryMap;
    /* access modifiers changed from: private */
    public transient Map<String, String> workingInputVarsMap;
    /* access modifiers changed from: private */
    public transient Map<String, DictionaryKeys> workingOutputDictionaryMap;
    /* access modifiers changed from: private */
    public transient Map<String, String> workingOutputVarsMap;

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$a */
    /* compiled from: ActionBlockAction.kt */
    public static final class C2317a implements Parcelable.Creator<ActionBlockAction> {
        C2317a() {
        }

        /* renamed from: a */
        public ActionBlockAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ActionBlockAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ActionBlockAction[] newArray(int i) {
            return new ActionBlockAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$b */
    /* compiled from: ActionBlockAction.kt */
    public static final class C2318b {
        private C2318b() {
        }

        public /* synthetic */ C2318b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$c */
    /* compiled from: ActionBlockAction.kt */
    static final class C2319c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ List<Spinner> $inputVarBooleans;
        final /* synthetic */ List<EditText> $inputVarTexts;
        int label;
        final /* synthetic */ ActionBlockAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2319c(List<EditText> list, List<Spinner> list2, Activity activity, AppCompatDialog appCompatDialog, ActionBlockAction actionBlockAction, C13635d<? super C2319c> dVar) {
            super(3, dVar);
            this.$inputVarTexts = list;
            this.$inputVarBooleans = list2;
            this.$activity = activity;
            this.$dialog = appCompatDialog;
            this.this$0 = actionBlockAction;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2319c(this.$inputVarTexts, this.$inputVarBooleans, this.$activity, this.$dialog, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                List<EditText> list = this.$inputVarTexts;
                ActionBlockAction actionBlockAction = this.this$0;
                for (EditText editText : list) {
                    Map k3 = actionBlockAction.tempInputVarsMap;
                    Object tag = editText.getTag();
                    C13706o.m87927d(tag, "null cannot be cast to non-null type kotlin.String");
                    k3.put((String) tag, editText.getText().toString());
                }
                List<Spinner> list2 = this.$inputVarBooleans;
                ActionBlockAction actionBlockAction2 = this.this$0;
                for (Spinner spinner : list2) {
                    Map k32 = actionBlockAction2.tempInputVarsMap;
                    Object tag2 = spinner.getTag();
                    C13706o.m87927d(tag2, "null cannot be cast to non-null type kotlin.String");
                    k32.put((String) tag2, spinner.getSelectedItemPosition() == 0 ? "true" : "false");
                }
                ActionBlockListActivity.C3741a aVar = ActionBlockListActivity.f9803G;
                Activity activity = this.$activity;
                C13706o.m87928e(activity, "activity");
                aVar.mo27229b(activity, true, 66);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$d */
    /* compiled from: ActionBlockAction.kt */
    public static final class C2320d implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ActionBlockAction f7126a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f7127b;

        C2320d(ActionBlockAction actionBlockAction, MacroDroidVariable macroDroidVariable) {
            this.f7126a = actionBlockAction;
            this.f7127b = macroDroidVariable;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            this.f7126a.workingInputVarsMap.put(this.f7127b.getName(), (Object) null);
            this.f7126a.workingInputDictionaryMap.put(this.f7127b.getName(), (Object) null);
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "selectedVar");
            this.f7126a.workingInputVarsMap.put(this.f7127b.getName(), macroDroidVariable.getName());
            this.f7126a.workingInputDictionaryMap.put(this.f7127b.getName(), list != null ? new DictionaryKeys(list) : null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$e */
    /* compiled from: ActionBlockAction.kt */
    public static final class C2321e implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ActionBlockAction f7128a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f7129b;

        C2321e(ActionBlockAction actionBlockAction, MacroDroidVariable macroDroidVariable) {
            this.f7128a = actionBlockAction;
            this.f7129b = macroDroidVariable;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            this.f7128a.workingInputVarsMap.put(this.f7129b.getName(), (Object) null);
            this.f7128a.workingInputDictionaryMap.put(this.f7129b.getName(), (Object) null);
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "selectedVar");
            this.f7128a.workingInputVarsMap.put(this.f7129b.getName(), macroDroidVariable.getName());
            this.f7128a.workingInputDictionaryMap.put(this.f7129b.getName(), list != null ? new DictionaryKeys(list) : null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$f */
    /* compiled from: ActionBlockAction.kt */
    static final class C2322f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        final /* synthetic */ MacroDroidVariable $variable;
        int label;
        final /* synthetic */ ActionBlockAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2322f(MacroDroidVariable macroDroidVariable, Activity activity, C4023j0.C4028e eVar, ActionBlockAction actionBlockAction, C13635d<? super C2322f> dVar) {
            super(3, dVar);
            this.$variable = macroDroidVariable;
            this.$activity = activity;
            this.$magicTextListener = eVar;
            this.this$0 = actionBlockAction;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2322f(this.$variable, this.$activity, this.$magicTextListener, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.$variable.mo27743S() == 2) {
                    C4023j0.m15700F(this.$activity, this.$magicTextListener, this.this$0.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, this.this$0.mo24686E1());
                } else {
                    C4023j0.m15693A(this.$activity, this.this$0.mo27837X0(), this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText, this.this$0.mo24686E1());
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$g */
    /* compiled from: ActionBlockAction.kt */
    public static final class C2323g implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ActionBlockAction f7130a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f7131b;

        C2323g(ActionBlockAction actionBlockAction, MacroDroidVariable macroDroidVariable) {
            this.f7130a = actionBlockAction;
            this.f7131b = macroDroidVariable;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            this.f7130a.workingOutputVarsMap.put(this.f7131b.getName(), (Object) null);
            this.f7130a.workingOutputDictionaryMap.put(this.f7131b.getName(), (Object) null);
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7130a.workingOutputVarsMap.put(this.f7131b.getName(), macroDroidVariable.getName());
            this.f7130a.workingOutputDictionaryMap.put(this.f7131b.getName(), list != null ? new DictionaryKeys(list) : null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$h */
    /* compiled from: ActionBlockAction.kt */
    static final class C2324h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ List<Spinner> $inputVarBooleans;
        final /* synthetic */ List<EditText> $inputVarTexts;
        final /* synthetic */ CheckBox $waitUntilComplete;
        int label;
        final /* synthetic */ ActionBlockAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2324h(List<EditText> list, List<Spinner> list2, ActionBlockAction actionBlockAction, CheckBox checkBox, AppCompatDialog appCompatDialog, C13635d<? super C2324h> dVar) {
            super(3, dVar);
            this.$inputVarTexts = list;
            this.$inputVarBooleans = list2;
            this.this$0 = actionBlockAction;
            this.$waitUntilComplete = checkBox;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2324h(this.$inputVarTexts, this.$inputVarBooleans, this.this$0, this.$waitUntilComplete, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            String str;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                List<EditText> list = this.$inputVarTexts;
                ActionBlockAction actionBlockAction = this.this$0;
                Iterator<T> it = list.iterator();
                while (true) {
                    z = false;
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    EditText editText = (EditText) it.next();
                    Map m3 = actionBlockAction.workingInputVarsMap;
                    Object tag = editText.getTag();
                    C13706o.m87927d(tag, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) tag;
                    Editable text = editText.getText();
                    C13706o.m87928e(text, "it.text");
                    if (text.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        str2 = editText.getText().toString();
                    }
                    m3.put(str3, str2);
                }
                List<Spinner> list2 = this.$inputVarBooleans;
                ActionBlockAction actionBlockAction2 = this.this$0;
                for (Spinner spinner : list2) {
                    Map m32 = actionBlockAction2.workingInputVarsMap;
                    Object tag2 = spinner.getTag();
                    C13706o.m87927d(tag2, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) tag2;
                    int selectedItemPosition = spinner.getSelectedItemPosition();
                    if (selectedItemPosition == 0) {
                        str = null;
                    } else if (selectedItemPosition == 1) {
                        str = "true";
                    } else if (selectedItemPosition != 2) {
                        Object selectedItem = spinner.getSelectedItem();
                        C13706o.m87927d(selectedItem, "null cannot be cast to non-null type kotlin.String");
                        String str5 = (String) selectedItem;
                        if (C15176v.m93634I(str5, '(' + actionBlockAction2.mo27827K0().getString(C17541R$string.variable_local) + ')', z, 2, (Object) null)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("[lv=");
                            String substring = str5.substring(C15177w.m93682a0(str5, " ", 0, false, 6, (Object) null) + 1);
                            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                            sb.append(substring);
                            sb.append(']');
                            str = sb.toString();
                        } else {
                            String str6 = "this as java.lang.String).substring(startIndex)";
                            if (C15176v.m93634I(str5, '(' + actionBlockAction2.mo27827K0().getString(C17541R$string.variable_global) + ')', false, 2, (Object) null)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("[v=");
                                String substring2 = str5.substring(C15177w.m93682a0(str5, " ", 0, false, 6, (Object) null) + 1);
                                C13706o.m87928e(substring2, str6);
                                sb2.append(substring2);
                                sb2.append(']');
                                str = sb2.toString();
                            } else {
                                str = "";
                            }
                        }
                    } else {
                        str = "false";
                    }
                    m32.put(str4, str);
                    z = false;
                }
                ActionBlockAction actionBlockAction3 = this.this$0;
                actionBlockAction3.inputVarsMap = C13615t0.m87773w(actionBlockAction3.workingInputVarsMap);
                ActionBlockAction actionBlockAction4 = this.this$0;
                actionBlockAction4.inputDictionaryMap = C13615t0.m87773w(actionBlockAction4.workingInputDictionaryMap);
                ActionBlockAction actionBlockAction5 = this.this$0;
                actionBlockAction5.outputVarsMap = C13615t0.m87773w(actionBlockAction5.workingOutputVarsMap);
                ActionBlockAction actionBlockAction6 = this.this$0;
                actionBlockAction6.outputDictionaryMap = C13615t0.m87773w(actionBlockAction6.workingOutputDictionaryMap);
                this.this$0.continueActionsWithoutWaiting = !this.$waitUntilComplete.isChecked();
                this.$dialog.dismiss();
                this.this$0.mo24689O1();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ActionBlockAction$i */
    /* compiled from: ActionBlockAction.kt */
    static final class C2325i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2325i(AppCompatDialog appCompatDialog, C13635d<? super C2325i> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2325i(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ActionBlockAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        mo24687G2(macro);
    }

    public /* synthetic */ ActionBlockAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: u3 */
    private final void m9632u3(EditText editText, MacroDroidVariable macroDroidVariable) {
        int S = macroDroidVariable.mo27743S();
        editText.setInputType(S != 1 ? S != 3 ? 524288 : 12290 : InputDeviceCompat.SOURCE_TOUCHSCREEN);
    }

    /* renamed from: v3 */
    private final void m9633v3() {
        ArrayList arrayList;
        AppCompatDialog appCompatDialog;
        CheckBox checkBox;
        Button button;
        Button button2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        List<MacroDroidVariable> list;
        LinearLayout linearLayout3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str;
        String str2;
        MacroDroidVariable macroDroidVariable;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList6;
        int i;
        List<MacroDroidVariable> list2;
        int i2;
        String str7;
        C15264f fVar;
        int i3;
        AppCompatDialog appCompatDialog2;
        ActionBlockAction actionBlockAction = this;
        if (mo27836X()) {
            ActionBlock g = m9635z3().mo29649g(actionBlockAction.actionBlockId);
            if (g == null) {
                ActionBlockListActivity.C3741a aVar = ActionBlockListActivity.f9803G;
                Activity j0 = mo27850j0();
                C13706o.m87928e(j0, "activity");
                aVar.mo27229b(j0, true, 66);
                return;
            }
            actionBlockAction.workingOutputVarsMap = C13615t0.m87773w(actionBlockAction.outputVarsMap);
            actionBlockAction.workingOutputDictionaryMap = C13615t0.m87773w(actionBlockAction.outputDictionaryMap);
            actionBlockAction.workingInputDictionaryMap = C13615t0.m87773w(actionBlockAction.inputDictionaryMap);
            List<MacroDroidVariable> inputOnlyActionBlockVariables = g.getInputOnlyActionBlockVariables(false);
            List<MacroDroidVariable> outputOnlyActionBlockVariables = g.getOutputOnlyActionBlockVariables(false);
            Activity j02 = mo27850j0();
            AppCompatDialog appCompatDialog3 = new AppCompatDialog(j02, mo24688L0());
            appCompatDialog3.setContentView((int) C17535R$layout.dialog_action_block_config);
            appCompatDialog3.setTitle((int) C17541R$string.action_action_block);
            C4656c.m18114c(appCompatDialog3, 0);
            Button button3 = (Button) appCompatDialog3.findViewById(C17532R$id.actionBlockName);
            View findViewById = appCompatDialog3.findViewById(C17532R$id.inputVarsContainer);
            C13706o.m87926c(findViewById);
            LinearLayout linearLayout4 = (LinearLayout) findViewById;
            View findViewById2 = appCompatDialog3.findViewById(C17532R$id.outputVarsContainer);
            C13706o.m87926c(findViewById2);
            LinearLayout linearLayout5 = (LinearLayout) findViewById2;
            View findViewById3 = appCompatDialog3.findViewById(C17532R$id.waitToCompleteCheckBox);
            C13706o.m87926c(findViewById3);
            CheckBox checkBox2 = (CheckBox) findViewById3;
            Button button4 = (Button) appCompatDialog3.findViewById(C17532R$id.okButton);
            Button button5 = (Button) appCompatDialog3.findViewById(C17532R$id.cancelButton);
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            checkBox2.setChecked(!actionBlockAction.continueActionsWithoutWaiting);
            if (button3 != null) {
                button3.setText(actionBlockAction.actionBlockName);
            }
            if (button3 != null) {
                arrayList3 = arrayList8;
                arrayList2 = arrayList7;
                button2 = button5;
                button = button4;
                checkBox = checkBox2;
                AppCompatDialog appCompatDialog4 = appCompatDialog3;
                appCompatDialog = appCompatDialog3;
                linearLayout = linearLayout5;
                arrayList = arrayList9;
                linearLayout2 = linearLayout4;
                C4666m.m18147o(button3, (C13640g) null, new C2319c(arrayList7, arrayList3, j02, appCompatDialog4, this, (C13635d<? super C2319c>) null), 1, (Object) null);
                C13339u uVar = C13339u.f61331a;
            } else {
                arrayList3 = arrayList8;
                arrayList2 = arrayList7;
                button2 = button5;
                button = button4;
                checkBox = checkBox2;
                arrayList = arrayList9;
                appCompatDialog = appCompatDialog3;
                linearLayout = linearLayout5;
                linearLayout2 = linearLayout4;
            }
            String str8 = ": ";
            String str9 = "context";
            if (inputOnlyActionBlockVariables.isEmpty()) {
                TextView textView = new TextView(mo27827K0());
                textView.setText(C17541R$string.none);
                int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.margin_medium);
                textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                textView.setTextColor(ContextCompat.getColor(mo27827K0(), C17528R$color.default_text_color));
                linearLayout2.addView(textView);
            } else {
                C13706o.m87928e(inputOnlyActionBlockVariables, "inputVars");
                for (MacroDroidVariable next : inputOnlyActionBlockVariables) {
                    if (next.mo27743S() == 0) {
                        View inflate = j02.getLayoutInflater().inflate(C17535R$layout.view_action_block_input_variable_boolean, linearLayout2, false);
                        Spinner spinner = (Spinner) inflate.findViewById(C17532R$id.variableBooleanSpinner);
                        C13706o.m87928e(spinner, "booleanSpinner");
                        ArrayList arrayList10 = arrayList3;
                        arrayList10.add(spinner);
                        spinner.setTag(next.getName());
                        String[] strArr = {mo27827K0().getString(C17541R$string.default_value), mo27827K0().getString(C17541R$string.true_label), mo27827K0().getString(C17541R$string.false_label)};
                        ArrayList<MacroDroidVariable> n0 = mo27855n0();
                        C13706o.m87928e(n0, "allBooleanVariables");
                        ArrayList arrayList11 = new ArrayList(C13616u.m87774u(n0, 10));
                        Iterator<T> it = n0.iterator();
                        while (true) {
                            arrayList6 = arrayList10;
                            linearLayout3 = linearLayout;
                            if (!it.hasNext()) {
                                break;
                            }
                            MacroDroidVariable macroDroidVariable2 = (MacroDroidVariable) it.next();
                            Iterator<T> it2 = it;
                            StringBuilder sb = new StringBuilder();
                            sb.append('(');
                            Context K0 = mo27827K0();
                            if (macroDroidVariable2.mo27754c0()) {
                                list2 = outputOnlyActionBlockVariables;
                                i2 = C17541R$string.variable_local;
                            } else {
                                list2 = outputOnlyActionBlockVariables;
                                i2 = C17541R$string.variable_global;
                            }
                            sb.append(K0.getString(i2));
                            sb.append(") ");
                            sb.append(macroDroidVariable2.getName());
                            arrayList11.add(sb.toString());
                            arrayList10 = arrayList6;
                            linearLayout = linearLayout3;
                            it = it2;
                            outputOnlyActionBlockVariables = list2;
                        }
                        list = outputOnlyActionBlockVariables;
                        String[] strArr2 = (String[]) C13593l.m87568o(strArr, arrayList11);
                        ArrayAdapter arrayAdapter = new ArrayAdapter(mo27827K0(), C17535R$layout.simple_spinner_item, strArr2);
                        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
                        spinner.setAdapter(arrayAdapter);
                        String str10 = actionBlockAction.tempInputVarsMap.get(next.getName());
                        if (str10 == null && (str10 = actionBlockAction.inputVarsMap.get(next.getName())) == null) {
                            str10 = "";
                        }
                        if (C13706o.m87924a(str10, "true")) {
                            i = 1;
                        } else if (C13706o.m87924a(str10, "false")) {
                            i = 2;
                        } else if (C15176v.m93634I(str10, "[lv=", false, 2, (Object) null) || C15176v.m93634I(str10, "{lv=", false, 2, (Object) null)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append('(');
                            sb2.append(mo27827K0().getString(C17541R$string.variable_local));
                            sb2.append(") ");
                            String substring = str10.substring(4, str10.length() - 1);
                            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(substring);
                            i = C16792h.m99540b(C13596m.m87586K(strArr2, sb2.toString()), 0);
                        } else if (C15176v.m93634I(str10, "[v=", false, 2, (Object) null) || C15176v.m93634I(str10, "{v=", false, 2, (Object) null)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append('(');
                            sb3.append(mo27827K0().getString(C17541R$string.variable_global));
                            sb3.append(") ");
                            String substring2 = str10.substring(3, str10.length() - 1);
                            C13706o.m87928e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(substring2);
                            i = C16792h.m99540b(C13596m.m87586K(strArr2, sb3.toString()), 0);
                        } else {
                            i = 0;
                        }
                        spinner.setSelection(i);
                        StringBuilder sb4 = new StringBuilder();
                        Context K02 = mo27827K0();
                        C13706o.m87928e(K02, str9);
                        sb4.append(next.mo27744T(K02));
                        sb4.append(str8);
                        sb4.append(next.getName());
                        ((TextView) inflate.findViewById(C17532R$id.variableName)).setText(sb4.toString());
                        linearLayout2.addView(inflate);
                        str = str9;
                        str2 = str8;
                        arrayList5 = arrayList2;
                        arrayList4 = arrayList6;
                    } else {
                        list = outputOnlyActionBlockVariables;
                        linearLayout3 = linearLayout;
                        ArrayList arrayList12 = arrayList3;
                        if (next.mo27743S() == 4 || next.mo27743S() == 5) {
                            String str11 = str9;
                            String str12 = str8;
                            arrayList5 = arrayList2;
                            arrayList4 = arrayList12;
                            View inflate2 = j02.getLayoutInflater().inflate(C17535R$layout.view_action_block_input_variable_dictionary, linearLayout2, false);
                            Spinner spinner2 = (Spinner) inflate2.findViewById(C17532R$id.variableDictionarySpinner);
                            ArrayList arrayList13 = new ArrayList();
                            arrayList13.add('[' + SelectableItem.m15535j1(C17541R$string.output_variable_not_used) + ']');
                            String str13 = actionBlockAction.inputVarsMap.get(next.getName());
                            DictionaryKeys dictionaryKeys = actionBlockAction.inputDictionaryMap.get(next.getName());
                            if (next.mo27743S() == 4) {
                                C13706o.m87928e(j02, "activity");
                                C13706o.m87928e(spinner2, "spinner");
                                Macro X0 = mo27837X0();
                                if (str13 != null) {
                                    str4 = str13 + C6520o0.m24912e0(dictionaryKeys);
                                } else {
                                    str4 = null;
                                }
                                String str14 = str4;
                                macroDroidVariable = next;
                                C6520o0.m24878H(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner2, X0, arrayList13, str14, new C2320d(actionBlockAction, next));
                            } else {
                                macroDroidVariable = next;
                                if (macroDroidVariable.mo27743S() == 5) {
                                    C13706o.m87928e(j02, "activity");
                                    C13706o.m87928e(spinner2, "spinner");
                                    Macro X02 = mo27837X0();
                                    if (str13 != null) {
                                        str3 = str13 + C6520o0.m24912e0(dictionaryKeys);
                                    } else {
                                        str3 = null;
                                    }
                                    C6520o0.m24872E(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner2, X02, arrayList13, str3, new C2321e(actionBlockAction, macroDroidVariable));
                                }
                            }
                            StringBuilder sb5 = new StringBuilder();
                            Context K03 = mo27827K0();
                            str = str11;
                            C13706o.m87928e(K03, str);
                            sb5.append(macroDroidVariable.mo27744T(K03));
                            str2 = str12;
                            sb5.append(str2);
                            sb5.append(macroDroidVariable.getName());
                            ((TextView) inflate2.findViewById(C17532R$id.variableName)).setText(sb5.toString());
                            linearLayout2.addView(inflate2);
                            str8 = str2;
                            str9 = str;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList4;
                            linearLayout = linearLayout3;
                            outputOnlyActionBlockVariables = list;
                        } else {
                            View inflate3 = j02.getLayoutInflater().inflate(C17535R$layout.view_action_block_input_variable, linearLayout2, false);
                            EditText editText = (EditText) inflate3.findViewById(C17532R$id.variableValue);
                            TextView textView2 = (TextView) inflate3.findViewById(C17532R$id.variableName);
                            Button button6 = (Button) inflate3.findViewById(C17532R$id.variableMagicTextButton);
                            editText.setTag(next.getName());
                            C13706o.m87928e(editText, "inputEditText");
                            ArrayList arrayList14 = arrayList2;
                            arrayList14.add(editText);
                            String str15 = actionBlockAction.tempInputVarsMap.get(next.getName());
                            if (str15 == null && (str15 = actionBlockAction.inputVarsMap.get(next.getName())) == null) {
                                str15 = "";
                            }
                            editText.setText(str15);
                            C13706o.m87928e(next, "variable");
                            actionBlockAction.m9632u3(editText, next);
                            C3044f fVar2 = new C3044f(editText);
                            if (button6 != null) {
                                C13706o.m87928e(button6, "inputMagicTextButton");
                                str6 = str9;
                                str5 = str8;
                                C2322f fVar3 = r0;
                                arrayList5 = arrayList14;
                                arrayList4 = arrayList12;
                                C2322f fVar4 = new C2322f(next, j02, fVar2, this, (C13635d<? super C2322f>) null);
                                C4666m.m18147o(button6, (C13640g) null, fVar3, 1, (Object) null);
                                C13339u uVar2 = C13339u.f61331a;
                            } else {
                                str6 = str9;
                                str5 = str8;
                                arrayList5 = arrayList14;
                                arrayList4 = arrayList12;
                            }
                            textView2.setText(String.valueOf(next.getName()));
                            editText.setHint('<' + SelectableItem.m15535j1(C17541R$string.default_value) + '>');
                            linearLayout2.addView(inflate3);
                            str = str6;
                            str2 = str5;
                        }
                    }
                    str8 = str2;
                    str9 = str;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList4;
                    linearLayout = linearLayout3;
                    outputOnlyActionBlockVariables = list;
                }
            }
            String str16 = str9;
            String str17 = str8;
            List<MacroDroidVariable> list3 = outputOnlyActionBlockVariables;
            LinearLayout linearLayout6 = linearLayout;
            ArrayList arrayList15 = arrayList3;
            ArrayList arrayList16 = arrayList2;
            char c = '[';
            if (list3.isEmpty()) {
                TextView textView3 = new TextView(mo27827K0());
                textView3.setText(C17541R$string.none);
                int dimensionPixelSize2 = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.margin_medium);
                textView3.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                textView3.setTextColor(ContextCompat.getColor(mo27827K0(), C17528R$color.default_text_color));
                linearLayout6.addView(textView3);
            } else {
                LinearLayout linearLayout7 = linearLayout6;
                List<MacroDroidVariable> list4 = list3;
                C13706o.m87928e(list4, "outputVars");
                Iterator<T> it3 = list4.iterator();
                while (it3.hasNext()) {
                    MacroDroidVariable macroDroidVariable3 = (MacroDroidVariable) it3.next();
                    View inflate4 = j02.getLayoutInflater().inflate(C17535R$layout.view_action_block_output_variable, (ViewGroup) null);
                    TextView textView4 = (TextView) inflate4.findViewById(C17532R$id.variableName);
                    if (textView4 != null) {
                        StringBuilder sb6 = new StringBuilder();
                        Context K04 = mo27827K0();
                        C13706o.m87928e(K04, str16);
                        sb6.append(macroDroidVariable3.mo27744T(K04));
                        sb6.append(str17);
                        sb6.append(macroDroidVariable3.getName());
                        textView4.setText(sb6.toString());
                    }
                    Spinner spinner3 = (Spinner) inflate4.findViewById(C17532R$id.variableSpinner);
                    spinner3.setTag(macroDroidVariable3.getName());
                    ArrayList arrayList17 = new ArrayList();
                    arrayList17.add(c + SelectableItem.m15535j1(C17541R$string.output_variable_not_used) + ']');
                    String str18 = actionBlockAction.outputVarsMap.get(macroDroidVariable3.getName());
                    DictionaryKeys dictionaryKeys2 = actionBlockAction.outputDictionaryMap.get(macroDroidVariable3.getName());
                    int S = macroDroidVariable3.mo27743S();
                    Activity j03 = mo27850j0();
                    C13706o.m87928e(j03, "getActivity()");
                    C13706o.m87928e(spinner3, "variableSpinner");
                    Macro X03 = mo27837X0();
                    if (str18 != null) {
                        str7 = str18 + C6520o0.m24912e0(dictionaryKeys2);
                    } else {
                        str7 = null;
                    }
                    C2323g gVar = new C2323g(actionBlockAction, macroDroidVariable3);
                    ArrayList arrayList18 = arrayList17;
                    Macro macro = X03;
                    String str19 = str17;
                    ArrayList arrayList19 = arrayList18;
                    String str20 = str16;
                    ArrayList arrayList20 = arrayList;
                    C6520o0.m24885L(S, j03, C17542R$style.Theme_App_Dialog_Action, this, spinner3, macro, arrayList19, str7, "", gVar);
                    linearLayout7.addView(inflate4);
                    arrayList20.add(spinner3);
                    str17 = str19;
                    it3 = it3;
                    str16 = str20;
                    c = '[';
                    arrayList = arrayList20;
                    actionBlockAction = this;
                }
            }
            Button button7 = button;
            if (button7 != null) {
                i3 = 1;
                fVar = null;
                C4666m.m18147o(button7, (C13640g) null, new C2324h(arrayList16, arrayList15, this, checkBox, appCompatDialog, (C13635d<? super C2324h>) null), 1, (Object) null);
                C13339u uVar3 = C13339u.f61331a;
            } else {
                i3 = 1;
                fVar = null;
            }
            Button button8 = button2;
            if (button8 != null) {
                appCompatDialog2 = appCompatDialog;
                C4666m.m18147o(button8, fVar, new C2325i(appCompatDialog2, fVar), i3, fVar);
                C13339u uVar4 = C13339u.f61331a;
            } else {
                appCompatDialog2 = appCompatDialog;
            }
            appCompatDialog2.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m9634w3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87926c(editText);
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        editText.setInputType(1);
        Editable text = editText.getText();
        if (text != null) {
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            String str = fVar.f10575a;
            text.replace(min, max3, str, 0, str.length());
        }
    }

    /* renamed from: z3 */
    private final C4915a m9635z3() {
        C4934n M = C4934n.m18998M();
        C13706o.m87928e(M, "getInstance()");
        return M;
    }

    /* renamed from: A3 */
    public final Map<String, DictionaryKeys> mo24707A3() {
        return this.outputDictionaryMap;
    }

    /* renamed from: B3 */
    public final Map<String, String> mo24708B3() {
        return this.outputVarsMap;
    }

    /* renamed from: C3 */
    public final void mo24709C3(long j) {
        this.actionBlockId = j;
    }

    /* renamed from: D3 */
    public final void mo24710D3(String str) {
        C13706o.m87929f(str, "actionBlockName");
        this.actionBlockName = str;
    }

    /* renamed from: E3 */
    public final void mo24711E3(String str, String str2) {
        C13706o.m87929f(str, "oldName");
        C13706o.m87929f(str2, "newName");
        String str3 = this.inputVarsMap.get(str);
        if (str3 != null) {
            this.inputVarsMap.remove(str);
            this.inputVarsMap.put(str2, str3);
        }
        String str4 = this.outputVarsMap.get(str);
        if (str4 != null) {
            this.outputVarsMap.remove(str);
            this.outputVarsMap.put(str2, str4);
        }
    }

    /* renamed from: F */
    public String[] mo24440F() {
        Collection<String> values = this.inputVarsMap.values();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(values, 10));
        for (String str : values) {
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        try {
            int i = 0;
            for (T next : this.inputVarsMap.keySet()) {
                int i2 = i + 1;
                if (i < 0) {
                    C13614t.m87758t();
                }
                String str = (String) next;
                String str2 = strArr[i];
                Map<String, String> map = this.inputVarsMap;
                if (str2.length() == 0) {
                    str2 = null;
                }
                map.put(str, str2);
                i = i2;
            }
        } catch (Exception e) {
            C4878b.m18868g("Failed to set magic text on action block: " + e);
        }
    }

    /* renamed from: J1 */
    public boolean mo24712J1() {
        return true;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        try {
            if (this.actionBlockId == 0) {
                return this.actionBlockName;
            }
            return "<a href=\"macrodroid://www.macrodroid.com/actionblock/" + this.actionBlockId + "\">" + this.actionBlockName + "</a>";
        } catch (Exception unused) {
            return this.actionBlockName;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7699b.f18649j.mo37741a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + this.actionBlockName + ')';
    }

    /* renamed from: a */
    public String[] mo24435a() {
        Set<String> keySet = this.inputVarsMap.keySet();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(keySet, 10));
        for (String str : keySet) {
            arrayList.add(this.inputVarsMap.get(str));
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Set<String> keySet2 = this.outputVarsMap.keySet();
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(keySet2, 10));
        for (String str2 : keySet2) {
            arrayList2.add(this.outputVarsMap.get(str2));
        }
        Object[] array2 = arrayList2.toArray(new String[0]);
        C13706o.m87927d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) C13593l.m87569p(array, array2);
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        C13706o.m87929f(strArr, "varNames");
        if (strArr.length == this.inputVarsMap.size() + this.outputVarsMap.size()) {
            int i = 0;
            for (String next : this.inputVarsMap.keySet()) {
                int i2 = i + 1;
                String str = strArr[i];
                if (str != null && (C15177w.m93663N(str, "[lv=", false, 2, (Object) null) || C15177w.m93663N(str, "{lv=", false, 2, (Object) null) || C15177w.m93663N(str, "[v=", false, 2, (Object) null) || C15177w.m93663N(str, "{v=", false, 2, (Object) null))) {
                    this.inputVarsMap.put(next, str);
                }
                i = i2;
            }
            for (String put : this.outputVarsMap.keySet()) {
                this.outputVarsMap.put(put, strArr[i]);
                i++;
            }
            return;
        }
        C4878b.m18868g("Error when renaming variables in action block unexpected length.");
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        try {
            ActionBlock g = m9635z3().mo29649g(this.actionBlockId);
            ActionBlock cloneActionBlock = g != null ? g.cloneActionBlock(false) : null;
            if (cloneActionBlock != null) {
                ArrayList<Action> actions = cloneActionBlock.getActions();
                C13706o.m87928e(actions, "actionBlockInstance.actions");
                for (Action J0 : actions) {
                    List<Constraint> J02 = J0.mo27826J0();
                    C13706o.m87928e(J02, "action.constraints");
                    for (Constraint W2 : J02) {
                        W2.mo28114W2();
                    }
                }
                cloneActionBlock.setIsClonedInstance(true);
                m9635z3().mo29647e(cloneActionBlock);
                cloneActionBlock.setActionThatInvoked(this);
                long j = 0;
                if (z2 || this.continueActionsWithoutWaiting) {
                    Macro X0 = mo27837X0();
                    if (X0 != null) {
                        j = X0.getGUID();
                    }
                    cloneActionBlock.invokeActions(triggerContextInfo, true, new ResumeMacroInfo(j, 99999999, triggerContextInfo, z, new Stack(), (ResumeMacroInfo) null, (Map) null, 64, (C13695i) null), this.inputVarsMap, this.inputDictionaryMap, mo27837X0());
                } else {
                    Macro X02 = mo27837X0();
                    if (X02 != null) {
                        j = X02.getGUID();
                    }
                    cloneActionBlock.invokeActions(triggerContextInfo, true, new ResumeMacroInfo(j, i, triggerContextInfo, z, stack, resumeMacroInfo, (Map) null, 64, (C13695i) null), this.inputVarsMap, this.inputDictionaryMap, mo27837X0());
                }
                if (this.continueActionsWithoutWaiting) {
                    mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
                    return;
                }
                return;
            }
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Failed to find action block: " + this.actionBlockName, Y0.longValue());
            if (!z2) {
                mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
            }
        } catch (Exception unused) {
            Long Y02 = mo27840Y0();
            C13706o.m87928e(Y02, "macroGuid");
            C4878b.m18869h("Failed to run action block: " + this.actionBlockName, Y02.longValue());
            if (!z2) {
                mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
            }
        }
    }

    /* renamed from: i */
    public List<String> mo24442i() {
        return C13612s.m87736e(this.actionBlockName);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i == 66 && i2 == -1) {
            long j = this.actionBlockId;
            long j2 = 0;
            if (intent != null) {
                j2 = intent.getLongExtra("ActionBlockGuid", 0);
            }
            this.actionBlockId = j2;
            if (j2 != j) {
                this.tempInputVarsMap.clear();
            }
            String stringExtra = intent != null ? intent.getStringExtra("ActionBlockName") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.actionBlockName = stringExtra;
            m9633v3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        this.tempInputVarsMap.clear();
        if (this.actionBlockId == 0) {
            ActionBlockListActivity.C3741a aVar = ActionBlockListActivity.f9803G;
            Activity j0 = mo27850j0();
            C13706o.m87928e(j0, "activity");
            aVar.mo27229b(j0, true, 66);
            return;
        }
        m9633v3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.actionBlockId);
        parcel.writeString(this.actionBlockName);
        C4659f.m18122b(parcel, this.inputVarsMap);
        C4659f.m18122b(parcel, this.outputVarsMap);
        parcel.writeInt(this.continueActionsWithoutWaiting ? 1 : 0);
    }

    /* renamed from: x3 */
    public final long mo24715x3() {
        return this.actionBlockId;
    }

    /* renamed from: y3 */
    public final String mo24716y3() {
        return this.actionBlockName;
    }

    public ActionBlockAction() {
        this.actionBlockName = "";
        this.inputVarsMap = new LinkedHashMap();
        this.inputDictionaryMap = new LinkedHashMap();
        this.outputVarsMap = new LinkedHashMap();
        this.outputDictionaryMap = new LinkedHashMap();
        this.tempInputVarsMap = new LinkedHashMap();
        this.workingInputVarsMap = new LinkedHashMap();
        this.workingOutputVarsMap = new LinkedHashMap();
        this.workingInputDictionaryMap = new LinkedHashMap();
        this.workingOutputDictionaryMap = new LinkedHashMap();
    }

    private ActionBlockAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.actionBlockName = str;
        this.inputVarsMap = new LinkedHashMap();
        this.inputDictionaryMap = new LinkedHashMap();
        this.outputVarsMap = new LinkedHashMap();
        this.outputDictionaryMap = new LinkedHashMap();
        this.tempInputVarsMap = new LinkedHashMap();
        this.workingInputVarsMap = new LinkedHashMap();
        this.workingOutputVarsMap = new LinkedHashMap();
        this.workingInputDictionaryMap = new LinkedHashMap();
        this.workingOutputDictionaryMap = new LinkedHashMap();
        this.actionBlockId = parcel.readLong();
        String readString = parcel.readString();
        this.actionBlockName = readString != null ? readString : str;
        this.inputVarsMap = C13615t0.m87773w(C4659f.m18121a(parcel));
        this.outputVarsMap = C13615t0.m87773w(C4659f.m18121a(parcel));
        this.continueActionsWithoutWaiting = parcel.readInt() != 0;
    }
}
