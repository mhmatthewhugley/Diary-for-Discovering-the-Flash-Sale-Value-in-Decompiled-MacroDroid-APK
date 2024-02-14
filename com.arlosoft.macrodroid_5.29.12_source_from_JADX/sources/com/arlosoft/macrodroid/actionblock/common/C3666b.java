package com.arlosoft.macrodroid.actionblock.common;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p135n1.C7967d;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.actionblock.common.b */
/* compiled from: ActionBlockConfigDialog.kt */
public final class C3666b {

    /* renamed from: a */
    public static final C3666b f9715a = new C3666b();

    /* renamed from: com.arlosoft.macrodroid.actionblock.common.b$a */
    /* compiled from: ActionBlockConfigDialog.kt */
    static final class C3667a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        final /* synthetic */ SelectableItem $selectableItem;
        final /* synthetic */ MacroDroidVariable $variable;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3667a(MacroDroidVariable macroDroidVariable, Activity activity, C4023j0.C4028e eVar, SelectableItem selectableItem, C13635d<? super C3667a> dVar) {
            super(3, dVar);
            this.$variable = macroDroidVariable;
            this.$activity = activity;
            this.$magicTextListener = eVar;
            this.$selectableItem = selectableItem;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3667a(this.$variable, this.$activity, this.$magicTextListener, this.$selectableItem, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Macro macro = null;
                if (this.$variable.mo27743S() == 2) {
                    Activity activity = this.$activity;
                    C4023j0.C4028e eVar = this.$magicTextListener;
                    SelectableItem selectableItem = this.$selectableItem;
                    if (selectableItem != null) {
                        macro = selectableItem.mo27837X0();
                    }
                    C4023j0.m15700F(activity, eVar, macro, true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                } else {
                    Activity activity2 = this.$activity;
                    SelectableItem selectableItem2 = this.$selectableItem;
                    C4023j0.m15693A(activity2, selectableItem2 != null ? selectableItem2.mo27837X0() : null, this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText, (C7967d) null);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.common.b$b */
    /* compiled from: ActionBlockConfigDialog.kt */
    static final class C3668b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C16265l<ActionBlockData, C13339u> $actionBlockDataConfigured;
        final /* synthetic */ ActionBlockData $actionBlockDataReturn;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ List<Spinner> $inputVarBooleans;
        final /* synthetic */ List<EditText> $inputVarTexts;
        final /* synthetic */ List<Spinner> $outputVarSpinners;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3668b(List<EditText> list, List<Spinner> list2, List<Spinner> list3, AppCompatDialog appCompatDialog, C16265l<? super ActionBlockData, C13339u> lVar, ActionBlockData actionBlockData, Activity activity, C13635d<? super C3668b> dVar) {
            super(3, dVar);
            this.$inputVarTexts = list;
            this.$inputVarBooleans = list2;
            this.$outputVarSpinners = list3;
            this.$dialog = appCompatDialog;
            this.$actionBlockDataConfigured = lVar;
            this.$actionBlockDataReturn = actionBlockData;
            this.$activity = activity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3668b(this.$inputVarTexts, this.$inputVarBooleans, this.$outputVarSpinners, this.$dialog, this.$actionBlockDataConfigured, this.$actionBlockDataReturn, this.$activity, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            String str;
            String str2;
            String str3;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                List<EditText> list = this.$inputVarTexts;
                ActionBlockData actionBlockData = this.$actionBlockDataReturn;
                for (EditText editText : list) {
                    HashMap<String, String> e = actionBlockData.mo27085e();
                    Object tag = editText.getTag();
                    C13706o.m87927d(tag, "null cannot be cast to non-null type kotlin.String");
                    e.put((String) tag, editText.getText().toString());
                }
                List<EditText> list2 = this.$inputVarTexts;
                ActionBlockData actionBlockData2 = this.$actionBlockDataReturn;
                Iterator<T> it = list2.iterator();
                while (true) {
                    z = false;
                    str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    EditText editText2 = (EditText) it.next();
                    HashMap<String, String> e2 = actionBlockData2.mo27085e();
                    Object tag2 = editText2.getTag();
                    C13706o.m87927d(tag2, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) tag2;
                    Editable text = editText2.getText();
                    C13706o.m87928e(text, "it.text");
                    if (text.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        str = editText2.getText().toString();
                    }
                    e2.put(str4, str);
                }
                List<Spinner> list3 = this.$inputVarBooleans;
                ActionBlockData actionBlockData3 = this.$actionBlockDataReturn;
                Activity activity = this.$activity;
                for (Spinner spinner : list3) {
                    HashMap<String, String> e3 = actionBlockData3.mo27085e();
                    Object tag3 = spinner.getTag();
                    C13706o.m87927d(tag3, "null cannot be cast to non-null type kotlin.String");
                    String str5 = (String) tag3;
                    int selectedItemPosition = spinner.getSelectedItemPosition();
                    if (selectedItemPosition == 0) {
                        str2 = str;
                        str3 = str2;
                    } else if (selectedItemPosition == 1) {
                        str2 = str;
                        str3 = "true";
                    } else if (selectedItemPosition != 2) {
                        Object selectedItem = spinner.getSelectedItem();
                        C13706o.m87927d(selectedItem, "null cannot be cast to non-null type kotlin.String");
                        String str6 = (String) selectedItem;
                        if (C15176v.m93634I(str6, '(' + activity.getString(C17541R$string.variable_local) + ')', z, 2, str)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("[lv=");
                            String substring = str6.substring(C15177w.m93682a0(str6, " ", 0, false, 6, (Object) null) + 1);
                            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                            sb.append(substring);
                            sb.append(']');
                            str3 = sb.toString();
                            str2 = null;
                        } else {
                            if (C15176v.m93634I(str6, '(' + activity.getString(C17541R$string.variable_global) + ')', false, 2, (Object) null)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("[v=");
                                str2 = null;
                                String substring2 = str6.substring(C15177w.m93682a0(str6, " ", 0, false, 6, (Object) null) + 1);
                                C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
                                sb2.append(substring2);
                                sb2.append(']');
                                str3 = sb2.toString();
                            } else {
                                str2 = null;
                                str3 = "";
                            }
                        }
                    } else {
                        str2 = str;
                        str3 = "false";
                    }
                    e3.put(str5, str3);
                    str = str2;
                    z = false;
                }
                String str7 = str;
                List<Spinner> list4 = this.$outputVarSpinners;
                ActionBlockData actionBlockData4 = this.$actionBlockDataReturn;
                Activity activity2 = this.$activity;
                for (Spinner spinner2 : list4) {
                    String obj2 = spinner2.getSelectedItem().toString();
                    HashMap<String, String> f = actionBlockData4.mo27087f();
                    Object tag4 = spinner2.getTag();
                    C13706o.m87927d(tag4, "null cannot be cast to non-null type kotlin.String");
                    String str8 = (String) tag4;
                    if (C13706o.m87924a(obj2, activity2.getString(C17541R$string.trigger_variable_no_variables)) || C13706o.m87924a(obj2, activity2.getString(C17541R$string.output_variable_not_used))) {
                        obj2 = str7;
                    }
                    f.put(str8, obj2);
                }
                this.$dialog.dismiss();
                this.$actionBlockDataConfigured.invoke(this.$actionBlockDataReturn);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.common.b$c */
    /* compiled from: ActionBlockConfigDialog.kt */
    static final class C3669c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3669c(AppCompatDialog appCompatDialog, C13635d<? super C3669c> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3669c(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    private C3666b() {
    }

    /* renamed from: b */
    private final void m14511b(EditText editText, MacroDroidVariable macroDroidVariable) {
        int S = macroDroidVariable.mo27743S();
        editText.setInputType(S != 1 ? S != 3 ? 524288 : 8194 : 2);
    }

    /* renamed from: c */
    public static final void m14512c(Activity activity, ActionBlock actionBlock, ActionBlockData actionBlockData, SelectableItem selectableItem, C16265l<? super ActionBlockData, C13339u> lVar) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        Button button;
        AppCompatDialog appCompatDialog;
        ArrayList arrayList2;
        ActionBlockData actionBlockData2;
        ArrayList arrayList3;
        Button button2;
        ArrayList arrayList4;
        String str;
        MacroDroidVariable macroDroidVariable;
        Collection collection;
        ArrayList arrayList5;
        int i;
        ArrayList<MacroDroidVariable> n0;
        C15264f fVar;
        int i2;
        AppCompatDialog appCompatDialog2;
        Activity activity2 = activity;
        ActionBlock actionBlock2 = actionBlock;
        SelectableItem selectableItem2 = selectableItem;
        C13706o.m87929f(activity2, "activity");
        C13706o.m87929f(actionBlock2, "actionBlock");
        C13706o.m87929f(actionBlockData, "actionBlockData");
        C13706o.m87929f(lVar, "actionBlockDataConfigured");
        ActionBlockData b = ActionBlockData.m14501b(actionBlockData, (String) null, 0, (HashMap) null, (HashMap) null, 15, (Object) null);
        List<MacroDroidVariable> inputOnlyActionBlockVariables = actionBlock2.getInputOnlyActionBlockVariables(false);
        List<MacroDroidVariable> outputOnlyActionBlockVariables = actionBlock2.getOutputOnlyActionBlockVariables(false);
        AppCompatDialog appCompatDialog3 = new AppCompatDialog(activity2, C17542R$style.Theme_App_Dialog_Action);
        appCompatDialog3.setContentView((int) C17535R$layout.dialog_action_block_config);
        appCompatDialog3.setTitle((CharSequence) actionBlock.getName());
        C4656c.m18114c(appCompatDialog3, 0);
        Button button3 = (Button) appCompatDialog3.findViewById(C17532R$id.actionBlockName);
        View findViewById = appCompatDialog3.findViewById(C17532R$id.inputVarsContainer);
        C13706o.m87926c(findViewById);
        LinearLayout linearLayout2 = (LinearLayout) findViewById;
        View findViewById2 = appCompatDialog3.findViewById(C17532R$id.outputVarsContainer);
        C13706o.m87926c(findViewById2);
        LinearLayout linearLayout3 = (LinearLayout) findViewById2;
        Button button4 = (Button) appCompatDialog3.findViewById(C17532R$id.okButton);
        Button button5 = (Button) appCompatDialog3.findViewById(C17532R$id.cancelButton);
        if (button3 != null) {
            button3.setVisibility(8);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        String str2 = ": ";
        if (inputOnlyActionBlockVariables.isEmpty()) {
            TextView textView = new TextView(activity2);
            textView.setText(C17541R$string.none);
            arrayList = arrayList8;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(C17529R$dimen.margin_medium);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            textView.setTextColor(ContextCompat.getColor(activity2, C17528R$color.default_text_color));
            textView.setTextColor(ContextCompat.getColor(activity2, C17528R$color.default_text_color));
            linearLayout2.addView(textView);
        } else {
            arrayList = arrayList8;
            C13706o.m87928e(inputOnlyActionBlockVariables, "inputVars");
            Iterator<T> it = inputOnlyActionBlockVariables.iterator();
            while (it.hasNext()) {
                MacroDroidVariable next = it.next();
                String str3 = "";
                Iterator<T> it2 = it;
                if (next.mo27743S() == 0) {
                    View inflate = activity.getLayoutInflater().inflate(C17535R$layout.view_action_block_input_variable_boolean, linearLayout2, false);
                    Spinner spinner = (Spinner) inflate.findViewById(C17532R$id.variableBooleanSpinner);
                    button2 = button5;
                    actionBlockData2 = b;
                    String[] strArr = {activity2.getString(C17541R$string.default_value), activity2.getString(C17541R$string.true_label), activity2.getString(C17541R$string.false_label)};
                    if (selectableItem2 == null || (n0 = selectableItem.mo27855n0()) == null) {
                        appCompatDialog = appCompatDialog3;
                        button = button4;
                        collection = C13614t.m87748j();
                    } else {
                        appCompatDialog = appCompatDialog3;
                        button = button4;
                        collection = new ArrayList(C13616u.m87774u(n0, 10));
                        Iterator<T> it3 = n0.iterator();
                        while (it3.hasNext()) {
                            MacroDroidVariable macroDroidVariable2 = (MacroDroidVariable) it3.next();
                            Iterator<T> it4 = it3;
                            StringBuilder sb = new StringBuilder();
                            sb.append('(');
                            sb.append(activity2.getString(macroDroidVariable2.mo27754c0() ? C17541R$string.variable_local : C17541R$string.variable_global));
                            sb.append(") ");
                            sb.append(macroDroidVariable2.getName());
                            collection.add(sb.toString());
                            SelectableItem selectableItem3 = selectableItem;
                            it3 = it4;
                        }
                    }
                    String[] strArr2 = (String[]) C13593l.m87568o(strArr, collection);
                    ArrayAdapter arrayAdapter = new ArrayAdapter(activity2, C17535R$layout.simple_spinner_item, strArr2);
                    arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(arrayAdapter);
                    C13706o.m87928e(spinner, "booleanSpinner");
                    arrayList7.add(spinner);
                    spinner.setTag(next.getName());
                    String str4 = actionBlockData.mo27085e().get(next.getName());
                    if (str4 == null) {
                        str4 = str3;
                    }
                    C13706o.m87928e(str4, "actionBlockData.inputVarsMap[variable.name] ?: \"\"");
                    if (C13706o.m87924a(str4, "true")) {
                        arrayList5 = arrayList7;
                        linearLayout = linearLayout3;
                        i = 1;
                    } else if (C13706o.m87924a(str4, "false")) {
                        arrayList5 = arrayList7;
                        linearLayout = linearLayout3;
                        i = 2;
                    } else {
                        arrayList5 = arrayList7;
                        if (!C15176v.m93634I(str4, "[lv=", false, 2, (Object) null)) {
                            linearLayout = linearLayout3;
                            if (!C15176v.m93634I(str4, "{lv=", false, 2, (Object) null)) {
                                if (C15176v.m93634I(str4, "[v=", false, 2, (Object) null) || C15176v.m93634I(str4, "{v=", false, 2, (Object) null)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append('(');
                                    sb2.append(activity2.getString(C17541R$string.variable_global));
                                    sb2.append(") ");
                                    String substring = str4.substring(3, str4.length() - 1);
                                    C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    sb2.append(substring);
                                    i = C16792h.m99540b(C13596m.m87586K(strArr2, sb2.toString()), 0);
                                } else {
                                    i = 0;
                                }
                            }
                        } else {
                            linearLayout = linearLayout3;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append('(');
                        sb3.append(activity2.getString(C17541R$string.variable_local));
                        sb3.append(") ");
                        String substring2 = str4.substring(4, str4.length() - 1);
                        C13706o.m87928e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        i = C16792h.m99540b(C13596m.m87586K(strArr2, sb3.toString()), 0);
                    }
                    spinner.setSelection(i);
                    ((TextView) inflate.findViewById(C17532R$id.variableName)).setText(next.mo27744T(activity2) + str2 + next.getName());
                    linearLayout2.addView(inflate);
                    arrayList3 = arrayList6;
                    str = str2;
                    arrayList2 = arrayList;
                    arrayList4 = arrayList5;
                } else {
                    ArrayList arrayList9 = arrayList7;
                    actionBlockData2 = b;
                    appCompatDialog = appCompatDialog3;
                    linearLayout = linearLayout3;
                    button = button4;
                    button2 = button5;
                    View inflate2 = activity.getLayoutInflater().inflate(C17535R$layout.view_action_block_input_variable, linearLayout2, false);
                    EditText editText = (EditText) inflate2.findViewById(C17532R$id.variableValue);
                    TextView textView2 = (TextView) inflate2.findViewById(C17532R$id.variableName);
                    Button button6 = (Button) inflate2.findViewById(C17532R$id.variableMagicTextButton);
                    editText.setTag(next.getName());
                    C13706o.m87928e(editText, "inputEditText");
                    arrayList6.add(editText);
                    if (actionBlockData.mo27085e().get(next.getName()) != null) {
                        str3 = actionBlockData.mo27085e().get(next.getName());
                    }
                    editText.setText(str3);
                    C3666b bVar = f9715a;
                    C13706o.m87928e(next, "variable");
                    bVar.m14511b(editText, next);
                    C3665a aVar = new C3665a(editText);
                    if (button6 != null) {
                        C13706o.m87928e(button6, "inputMagicTextButton");
                        ArrayList arrayList10 = arrayList;
                        macroDroidVariable = next;
                        arrayList4 = arrayList9;
                        arrayList3 = arrayList6;
                        arrayList2 = arrayList10;
                        str = str2;
                        C4666m.m18147o(button6, (C13640g) null, new C3667a(next, activity, aVar, selectableItem, (C13635d<? super C3667a>) null), 1, (Object) null);
                        C13339u uVar = C13339u.f61331a;
                    } else {
                        arrayList3 = arrayList6;
                        str = str2;
                        arrayList2 = arrayList;
                        arrayList4 = arrayList9;
                        macroDroidVariable = next;
                    }
                    textView2.setText(String.valueOf(macroDroidVariable.getName()));
                    editText.setHint('<' + activity2.getString(C17541R$string.default_value) + '>');
                    linearLayout2.addView(inflate2);
                }
                selectableItem2 = selectableItem;
                C16265l<? super ActionBlockData, C13339u> lVar2 = lVar;
                str2 = str;
                arrayList7 = arrayList4;
                it = it2;
                button5 = button2;
                arrayList6 = arrayList3;
                b = actionBlockData2;
                arrayList = arrayList2;
                appCompatDialog3 = appCompatDialog;
                button4 = button;
                linearLayout3 = linearLayout;
            }
        }
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList6;
        ActionBlockData actionBlockData3 = b;
        AppCompatDialog appCompatDialog4 = appCompatDialog3;
        LinearLayout linearLayout4 = linearLayout3;
        Button button7 = button4;
        Button button8 = button5;
        ArrayList arrayList13 = arrayList;
        String str5 = str2;
        if (outputOnlyActionBlockVariables.isEmpty()) {
            TextView textView3 = new TextView(activity2);
            textView3.setText(C17541R$string.none);
            int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(C17529R$dimen.margin_medium);
            textView3.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            textView3.setTextColor(ContextCompat.getColor(activity2, C17528R$color.default_text_color));
            linearLayout4.addView(textView3);
        } else {
            LinearLayout linearLayout5 = linearLayout4;
            C13706o.m87928e(outputOnlyActionBlockVariables, "outputVars");
            for (MacroDroidVariable next2 : outputOnlyActionBlockVariables) {
                View inflate3 = activity.getLayoutInflater().inflate(C17535R$layout.view_action_block_output_variable, (ViewGroup) null);
                TextView textView4 = (TextView) inflate3.findViewById(C17532R$id.variableName);
                if (textView4 != null) {
                    textView4.setText(next2.mo27744T(activity2) + str5 + next2.getName());
                }
                Spinner spinner2 = (Spinner) inflate3.findViewById(C17532R$id.variableSpinner);
                spinner2.setTag(next2.getName());
                SelectableItem selectableItem4 = selectableItem;
                C3666b bVar2 = f9715a;
                int S = next2.mo27743S();
                List<MacroDroidVariable> f = selectableItem4 != null ? bVar2.m14515f(S, selectableItem4) : bVar2.m14514e(S);
                ArrayList arrayList14 = new ArrayList();
                if (f.size() == 0) {
                    arrayList14.add('[' + activity2.getString(C17541R$string.trigger_variable_no_variables) + ']');
                } else {
                    arrayList14.add('[' + activity2.getString(C17541R$string.output_variable_not_used) + ']');
                }
                String str6 = actionBlockData.mo27087f().get(next2.getName());
                int i3 = 0;
                int i4 = 1;
                for (MacroDroidVariable next3 : f) {
                    arrayList14.add(next3.getName());
                    if (C13706o.m87924a(str6, next3.getName())) {
                        i3 = i4;
                    }
                    i4++;
                }
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(activity2, 17367048, arrayList14);
                arrayAdapter2.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(arrayAdapter2);
                spinner2.setSelection(i3, false);
                C13339u uVar2 = C13339u.f61331a;
                linearLayout5.addView(inflate3);
                C13706o.m87928e(spinner2, "variableSpinner");
                arrayList13.add(spinner2);
            }
        }
        ArrayList arrayList15 = arrayList13;
        if (button7 != null) {
            i2 = 1;
            fVar = null;
            C4666m.m18147o(button7, (C13640g) null, new C3668b(arrayList12, arrayList11, arrayList15, appCompatDialog4, lVar, actionBlockData3, activity, (C13635d<? super C3668b>) null), 1, (Object) null);
            C13339u uVar3 = C13339u.f61331a;
        } else {
            i2 = 1;
            fVar = null;
        }
        if (button8 != null) {
            appCompatDialog2 = appCompatDialog4;
            C4666m.m18147o(button8, fVar, new C3669c(appCompatDialog2, fVar), i2, fVar);
            C13339u uVar4 = C13339u.f61331a;
        } else {
            appCompatDialog2 = appCompatDialog4;
        }
        appCompatDialog2.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m14513d(EditText editText, C4023j0.C4029f fVar) {
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

    /* renamed from: e */
    private final List<MacroDroidVariable> m14514e(int i) {
        if (i == 0) {
            List<MacroDroidVariable> j = C4064u.m16048t().mo27985j();
            C13706o.m87928e(j, "getInstance().allBooleanVariables");
            return j;
        } else if (i == 1) {
            List<MacroDroidVariable> n = C4064u.m16048t().mo27989n();
            C13706o.m87928e(n, "getInstance().allIntegerVariables");
            return n;
        } else if (i == 2) {
            List<MacroDroidVariable> p = C4064u.m16048t().mo27991p();
            C13706o.m87928e(p, "getInstance().allStringVariables");
            return p;
        } else if (i != 3) {
            List<MacroDroidVariable> k = C4064u.m16048t().mo27986k();
            C13706o.m87928e(k, "getInstance().allDecimalVariables");
            return k;
        } else {
            List<MacroDroidVariable> k2 = C4064u.m16048t().mo27986k();
            C13706o.m87928e(k2, "getInstance().allDecimalVariables");
            return k2;
        }
    }

    /* renamed from: f */
    private final List<MacroDroidVariable> m14515f(int i, SelectableItem selectableItem) {
        if (i == 0) {
            ArrayList<MacroDroidVariable> n0 = selectableItem.mo27855n0();
            C13706o.m87928e(n0, "selectableItem.allBooleanVariables");
            return n0;
        } else if (i == 1) {
            ArrayList<MacroDroidVariable> s0 = selectableItem.mo27865s0();
            C13706o.m87928e(s0, "selectableItem.allIntegerVariables");
            return s0;
        } else if (i == 2) {
            ArrayList<MacroDroidVariable> y0 = selectableItem.mo27875y0();
            C13706o.m87928e(y0, "selectableItem.allStringVariables");
            return y0;
        } else if (i != 3) {
            ArrayList<MacroDroidVariable> o0 = selectableItem.mo27857o0();
            C13706o.m87928e(o0, "selectableItem.allDecimalVariables");
            return o0;
        } else {
            ArrayList<MacroDroidVariable> o02 = selectableItem.mo27857o0();
            C13706o.m87928e(o02, "selectableItem.allDecimalVariables");
            return o02;
        }
    }
}
