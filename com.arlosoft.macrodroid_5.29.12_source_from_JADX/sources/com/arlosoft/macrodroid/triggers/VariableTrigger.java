package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.C4068u1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.C6425s0;
import com.arlosoft.macrodroid.utils.C6451w;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2217f;
import p057a2.C2222k;
import p057a2.C2224m;
import p119k3.C7486c2;
import p135n1.C7967d;
import p148q0.C8151a;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

public class VariableTrigger extends Trigger implements C2222k, C2224m, C2217f {
    public static final Parcelable.Creator<VariableTrigger> CREATOR = new C5765e();
    private static final int DICTIONARY_OR_ARRAY_TYPE_NOT_SET = -1;
    private static final int STRING_CONTAINS = 1;
    private static final int STRING_EQUALITY_CHECK = 0;
    private static final int STRING_EXCLUDES = 2;
    private static int s_triggerCounter;
    private static C5766f s_updateListener;
    /* access modifiers changed from: private */
    public boolean checkCase;
    /* access modifiers changed from: private */
    public DictionaryKeys compareVarDictionaryKeys;
    /* access modifiers changed from: private */
    public DictionaryKeys dictionaryKeys;
    private int dictionaryType;
    /* access modifiers changed from: private */
    public boolean enableRegex;
    private boolean m_anyValueChange;
    private boolean m_booleanValue;
    private double m_doubleValue;
    private String m_expression;
    private boolean m_intCompareVariable;
    private boolean m_intGreaterThan;
    private boolean m_intLessThan;
    private boolean m_intNotEqual;
    private long m_intValue;
    private MacroDroidVariable m_otherValueToCompare;
    private transient int m_selectedIndex;
    private int m_stringComparisonType;
    private boolean m_stringEqual;
    private String m_stringValue;
    private MacroDroidVariable m_variable;
    /* access modifiers changed from: private */
    public DictionaryKeys workingCompareVarDictionaryKeys;
    /* access modifiers changed from: private */
    public MacroDroidVariable workingOtherVarToCompare;

    /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$a */
    class C5760a implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f13716a;

        /* renamed from: b */
        final /* synthetic */ VariableValue.Dictionary f13717b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f13718c;

        /* renamed from: d */
        final /* synthetic */ int f13719d;

        /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$a$a */
        class C5761a implements C16265l<C6520o0.C6523b, C13339u> {
            C5761a() {
            }

            /* renamed from: a */
            public C13339u invoke(C6520o0.C6523b bVar) {
                C5760a.this.f13718c.clear();
                C5760a.this.f13718c.addAll(bVar.mo32708c());
                VariableTrigger.this.m23413R3(bVar.mo32709d().intValue(), C5760a.this.f13718c);
                return null;
            }
        }

        C5760a(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList arrayList, int i) {
            this.f13716a = macroDroidVariable;
            this.f13717b = dictionary;
            this.f13718c = arrayList;
            this.f13719d = i;
        }

        /* renamed from: a */
        public void mo24836a() {
        }

        /* renamed from: b */
        public void mo24837b(@Nullable List<String> list) {
            C6520o0.m24902Z(VariableTrigger.this.mo27850j0(), C17542R$style.Theme_App_Dialog_Action, this.f13716a, this.f13717b, VariableTrigger.this.m_macro, this.f13718c, list, true, VariableTrigger.this, new C5761a());
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
        }

        /* renamed from: e */
        public void mo24840e(@NonNull VariableValue.DictionaryEntry dictionaryEntry) {
            this.f13718c.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableTrigger.this.m23456u4(this.f13716a, (VariableValue.Dictionary) dictionaryEntry.getVariable(), this.f13718c, this.f13719d + 1);
            } else {
                VariableTrigger.this.m23412Q3(dictionaryEntry.getVariable().getVariableType(), this.f13718c);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$b */
    class C5762b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13722a;

        C5762b(Button button) {
            this.f13722a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f13722a.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$c */
    class C5763c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditText f13724a;

        /* renamed from: c */
        final /* synthetic */ Button f13725c;

        C5763c(EditText editText, Button button) {
            this.f13724a = editText;
            this.f13725c = button;
        }

        public void afterTextChanged(Editable editable) {
            try {
                C6451w.m24766b(VariableTrigger.this.mo27827K0(), VariableTrigger.this.mo27837X0(), this.f13724a.getText().toString(), (TriggerContextInfo) null);
                this.f13725c.setEnabled(true);
            } catch (Exception unused) {
                this.f13725c.setEnabled(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$d */
    class C5764d implements C6520o0.C6540f {
        C5764d() {
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            MacroDroidVariable unused = VariableTrigger.this.workingOtherVarToCompare = null;
            DictionaryKeys unused2 = VariableTrigger.this.workingCompareVarDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            MacroDroidVariable unused = VariableTrigger.this.workingOtherVarToCompare = macroDroidVariable;
            DictionaryKeys unused2 = VariableTrigger.this.workingCompareVarDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$e */
    class C5765e implements Parcelable.Creator<VariableTrigger> {
        C5765e() {
        }

        /* renamed from: a */
        public VariableTrigger createFromParcel(Parcel parcel) {
            return new VariableTrigger(parcel, (C5760a) null);
        }

        /* renamed from: b */
        public VariableTrigger[] newArray(int i) {
            return new VariableTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VariableTrigger$f */
    private static class C5766f implements C4068u1 {

        /* renamed from: a */
        private Context f13728a;

        public C5766f(Context context) {
            this.f13728a = context;
        }

        /* renamed from: a */
        private boolean m23491a(@NonNull VariableTrigger variableTrigger, @NonNull Macro macro, @NonNull ArrayList<Macro> arrayList, @NonNull VariableValue.BooleanValue booleanValue, long j) {
            if (variableTrigger.m23414S3() && variableTrigger.mo31374R2()) {
                macro.setTriggerThatInvoked(variableTrigger);
                if (!macro.canInvoke(macro.getTriggerContextInfo())) {
                    return false;
                }
                arrayList.add(macro);
                return true;
            } else if (variableTrigger.m23415T3() != booleanValue.getBooleanValue() || !variableTrigger.mo31374R2()) {
                return false;
            } else {
                macro.setTriggerThatInvoked(variableTrigger);
                if (!macro.canInvoke(macro.getTriggerContextInfo())) {
                    return false;
                }
                arrayList.add(macro);
                return true;
            }
        }

        /* renamed from: b */
        private boolean m23492b(@NonNull VariableTrigger variableTrigger, @NonNull Macro macro, @NonNull ArrayList<Macro> arrayList, @NonNull VariableValue.DecimalValue decimalValue, @NonNull VariableValue.DecimalValue decimalValue2, long j) {
            boolean z;
            if (variableTrigger.m23414S3() && variableTrigger.mo31374R2()) {
                macro.setTriggerThatInvoked(variableTrigger);
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    arrayList.add(macro);
                    return true;
                }
            }
            double N3 = variableTrigger.m23416U3();
            String V3 = variableTrigger.mo31579V3();
            if (variableTrigger.m23414S3() && variableTrigger.mo31374R2()) {
                macro.setTriggerThatInvoked(variableTrigger);
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    arrayList.add(macro);
                    return true;
                }
            }
            ArrayList<String> arrayList2 = null;
            if (V3 != null) {
                try {
                    N3 = C6451w.m24766b(MacroDroidApplication.m14845u(), macro, V3, (TriggerContextInfo) null);
                } catch (IllegalArgumentException e) {
                    C4878b.m18869h("Variable trigger, expression evaluation failed: " + e, variableTrigger.mo27840Y0().longValue());
                    N3 = 0.0d;
                }
            }
            if (variableTrigger.m23418X3() && variableTrigger.m23424d4() != null) {
                MacroDroidVariable q = variableTrigger.mo27861q(variableTrigger.m23424d4().getName());
                if (q != null) {
                    if (variableTrigger.dictionaryKeys != null) {
                        arrayList2 = C6520o0.m24868C(this.f13728a, variableTrigger.dictionaryKeys.getKeys(), macro.getTriggerContextInfo(), macro);
                    }
                    Double m = q.mo27768m(arrayList2);
                    if (m != null) {
                        N3 = m.doubleValue();
                    } else {
                        C4878b.m18869h("Variable trigger, variable not found: " + variableTrigger.m23424d4().getName() + C6520o0.m24912e0(variableTrigger.compareVarDictionaryKeys), variableTrigger.mo27840Y0().longValue());
                    }
                } else {
                    C4878b.m18869h("Variable trigger, variable not found: " + variableTrigger.m23424d4().getName(), variableTrigger.mo27840Y0().longValue());
                    return false;
                }
            }
            if (!variableTrigger.m23419Y3() ? !variableTrigger.m23420Z3() ? !variableTrigger.m23421a4() ? !C6425s0.m24736a(decimalValue.getDecimalValue(), N3) : C6425s0.m24736a(decimalValue.getDecimalValue(), N3) : decimalValue.getDecimalValue() >= N3 || decimalValue2.getDecimalValue() < N3 : decimalValue.getDecimalValue() <= N3 || decimalValue2.getDecimalValue() > N3) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !variableTrigger.mo31374R2()) {
                return false;
            }
            macro.setTriggerThatInvoked(variableTrigger);
            if (macro.canInvoke(macro.getTriggerContextInfo())) {
                arrayList.add(macro);
            }
            return true;
        }

        /* renamed from: c */
        private boolean m23493c(@NonNull VariableTrigger variableTrigger, @NonNull Macro macro, @NonNull ArrayList<Macro> arrayList, @NonNull VariableValue.IntegerValue integerValue, @NonNull VariableValue.IntegerValue integerValue2, long j) {
            boolean z;
            if (variableTrigger.m23414S3() && variableTrigger.mo31374R2()) {
                macro.setTriggerThatInvoked(variableTrigger);
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    arrayList.add(macro);
                    return true;
                }
            }
            long A3 = variableTrigger.m23422b4();
            String V3 = variableTrigger.mo31579V3();
            ArrayList<String> arrayList2 = null;
            if (V3 != null) {
                try {
                    A3 = (long) ((int) C6451w.m24766b(MacroDroidApplication.m14845u(), macro, V3, (TriggerContextInfo) null));
                } catch (IllegalArgumentException unused) {
                    C4878b.m18868g("Variable constraint checking not working, expression evaluation failed");
                    A3 = 0;
                }
            } else if (variableTrigger.m23418X3() && variableTrigger.m23424d4() != null) {
                MacroDroidVariable q = variableTrigger.mo27861q(variableTrigger.m23424d4().getName());
                if (q != null) {
                    if (variableTrigger.dictionaryKeys != null) {
                        arrayList2 = C6520o0.m24868C(this.f13728a, variableTrigger.dictionaryKeys.getKeys(), macro.getTriggerContextInfo(), macro);
                    }
                    Long E = q.mo27733E(arrayList2);
                    if (E != null) {
                        A3 = E.longValue();
                    } else {
                        C4878b.m18869h("Variable trigger, variable not found: " + variableTrigger.m23424d4().getName() + C6520o0.m24912e0(variableTrigger.compareVarDictionaryKeys), variableTrigger.mo27840Y0().longValue());
                    }
                } else {
                    C4878b.m18869h("Variable trigger, variable not found: " + variableTrigger.m23424d4().getName(), variableTrigger.mo27840Y0().longValue());
                    return false;
                }
            }
            if (!variableTrigger.m23419Y3() ? !variableTrigger.m23420Z3() ? !variableTrigger.m23421a4() ? integerValue.getIntValue() != A3 : integerValue.getIntValue() == A3 : integerValue.getIntValue() >= A3 || integerValue2.getIntValue() < A3 : integerValue.getIntValue() <= A3 || integerValue2.getIntValue() > A3) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !variableTrigger.mo31374R2()) {
                return false;
            }
            macro.setTriggerThatInvoked(variableTrigger);
            if (macro.canInvoke(macro.getTriggerContextInfo())) {
                arrayList.add(macro);
            }
            return true;
        }

        /* renamed from: d */
        private boolean m23494d(@NonNull VariableTrigger variableTrigger, @NonNull Macro macro, @NonNull ArrayList<Macro> arrayList, @NonNull VariableValue variableValue, @NonNull VariableValue variableValue2, long j) {
            VariableValue variableValue3 = variableValue;
            if (variableValue3 instanceof VariableValue.BooleanValue) {
                return m23491a(variableTrigger, macro, arrayList, (VariableValue.BooleanValue) variableValue3, j);
            } else if (variableValue3 instanceof VariableValue.StringValue) {
                return m23495e(variableTrigger, macro, arrayList, (VariableValue.StringValue) variableValue3, j);
            } else if (variableValue3 instanceof VariableValue.DecimalValue) {
                return m23492b(variableTrigger, macro, arrayList, (VariableValue.DecimalValue) variableValue3, (VariableValue.DecimalValue) variableValue2, j);
            } else if (!(variableValue3 instanceof VariableValue.IntegerValue)) {
                return false;
            } else {
                return m23493c(variableTrigger, macro, arrayList, (VariableValue.IntegerValue) variableValue3, (VariableValue.IntegerValue) variableValue2, j);
            }
        }

        /* renamed from: e */
        private boolean m23495e(@NonNull VariableTrigger variableTrigger, @NonNull Macro macro, @NonNull ArrayList<Macro> arrayList, @NonNull VariableValue.StringValue stringValue, long j) {
            if (variableTrigger.m23414S3() && variableTrigger.mo31374R2()) {
                macro.setTriggerThatInvoked(variableTrigger);
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    arrayList.add(macro);
                    return true;
                }
            }
            String t0 = C4023j0.m15760t0(this.f13728a, variableTrigger.checkCase ? variableTrigger.m23428g4() : variableTrigger.m23428g4().toLowerCase(), (TriggerContextInfo) null, macro);
            String c = C6460y1.m24791c(variableTrigger.checkCase ? t0 : t0.toLowerCase(), variableTrigger.enableRegex);
            String c2 = C6460y1.m24791c(ProxyConfig.MATCH_ALL_SCHEMES + t0 + ProxyConfig.MATCH_ALL_SCHEMES, variableTrigger.enableRegex);
            boolean I3 = variableTrigger.checkCase;
            String textValue = stringValue.getTextValue();
            if (!I3) {
                textValue = textValue.toLowerCase();
            }
            if (variableTrigger.m23425e4() == 0) {
                if (variableTrigger.m23426f4()) {
                    if (!C6460y1.m24792d(textValue, c, variableTrigger.enableRegex) || !variableTrigger.mo31374R2()) {
                        return false;
                    }
                    macro.setTriggerThatInvoked(variableTrigger);
                    if (macro.canInvoke(macro.getTriggerContextInfo())) {
                        arrayList.add(macro);
                    }
                    return true;
                } else if (C6460y1.m24792d(textValue, c, variableTrigger.enableRegex) || !variableTrigger.mo31374R2()) {
                    return false;
                } else {
                    macro.setTriggerThatInvoked(variableTrigger);
                    if (macro.canInvoke(macro.getTriggerContextInfo())) {
                        arrayList.add(macro);
                    }
                    return true;
                }
            } else if (variableTrigger.m23425e4() == 1) {
                if (!C6460y1.m24792d(textValue, c2, variableTrigger.enableRegex) || !variableTrigger.mo31374R2()) {
                    return false;
                }
                macro.setTriggerThatInvoked(variableTrigger);
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    arrayList.add(macro);
                }
                return true;
            } else if (variableTrigger.m23425e4() != 2 || C6460y1.m24792d(textValue, c2, variableTrigger.enableRegex) || !variableTrigger.mo31374R2()) {
                return false;
            } else {
                macro.setTriggerThatInvoked(variableTrigger);
                if (macro.canInvoke(macro.getTriggerContextInfo())) {
                    arrayList.add(macro);
                }
                return true;
            }
        }

        /* renamed from: f */
        private boolean m23496f(@Nullable List<String> list, @Nullable List<String> list2) {
            if (list == null && (list2 == null || list2.isEmpty())) {
                return true;
            }
            if (list2 == null && list.isEmpty()) {
                return true;
            }
            if (list == null || !list.equals(list2)) {
                return false;
            }
            return true;
        }

        /* renamed from: v */
        public void mo27212v(@NonNull MacroDroidVariable macroDroidVariable, @NonNull VariableValue variableValue, @NonNull VariableValue variableValue2, long j) {
            ArrayList<String> arrayList;
            VariableValue variableValue3 = variableValue;
            VariableValue variableValue4 = variableValue2;
            if (!(variableValue4 instanceof VariableValue.Empty)) {
                if (variableValue3 instanceof VariableValue.DictionaryEntry) {
                    variableValue3 = ((VariableValue.DictionaryEntry) variableValue3).getVariable();
                }
                VariableValue variableValue5 = variableValue3;
                VariableValue variable = variableValue4 instanceof VariableValue.DictionaryEntry ? ((VariableValue.DictionaryEntry) variableValue4).getVariable() : variableValue4;
                ArrayList arrayList2 = new ArrayList();
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    if (!macroDroidVariable.mo27754c0() || j == next.getGUID()) {
                        Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                        while (it.hasNext()) {
                            Trigger next2 = it.next();
                            if (next2 instanceof VariableTrigger) {
                                VariableTrigger variableTrigger = (VariableTrigger) next2;
                                if (variableTrigger.dictionaryKeys != null) {
                                    arrayList = variableTrigger.dictionaryKeys == null ? new ArrayList<>() : C6520o0.m24868C(this.f13728a, variableTrigger.dictionaryKeys.getKeys(), next.getTriggerContextInfo(), next);
                                } else {
                                    arrayList = new ArrayList<>();
                                }
                                if (macroDroidVariable.getName().equals(variableTrigger.mo31580s().getName()) && m23496f(variableValue5.getParentKeys(), arrayList) && m23494d(variableTrigger, next, arrayList2, variableValue5, variable, j)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Macro macro = (Macro) it2.next();
                    macro.invokeActions(macro.getTriggerContextInfo());
                }
            }
        }
    }

    /* synthetic */ VariableTrigger(Parcel parcel, C5760a aVar) {
        this(parcel);
    }

    /* renamed from: P3 */
    private void m23411P3(Spinner spinner) {
        String str;
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        ArrayList arrayList = new ArrayList();
        if (this.workingOtherVarToCompare != null) {
            str = this.workingOtherVarToCompare.getName() + C6520o0.m24912e0(this.workingCompareVarDictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24879I(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList, str, "", false, new C5764d());
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public void m23412Q3(int i, ArrayList<String> arrayList) {
        String[] strArr = {mo27827K0().getResources().getString(C17541R$string.trigger_variable_specific_change), mo27827K0().getResources().getString(C17541R$string.trigger_variable_any_change)};
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        boolean z = this.m_anyValueChange;
        builder.setSingleChoiceItems((CharSequence[]) strArr, z ? 1 : 0, (DialogInterface.OnClickListener) new C5961i8(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C5949h8(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5973j8(this, i, arrayList));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C5901d8(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0505  */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23413R3(int r55, java.util.ArrayList<java.lang.String> r56) {
        /*
            r54 = this;
            r15 = r54
            r6 = r55
            android.app.Activity r14 = r54.mo27850j0()
            androidx.appcompat.app.AppCompatDialog r13 = new androidx.appcompat.app.AppCompatDialog
            int r0 = r54.mo24688L0()
            r13.<init>(r14, r0)
            r0 = 2131559062(0x7f0d0296, float:1.8743457E38)
            r13.setContentView((int) r0)
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r15.m_variable
            java.lang.String r0 = r0.getName()
            r13.setTitle((java.lang.CharSequence) r0)
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            android.view.Window r1 = r13.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r0.copyFrom(r1)
            r1 = -1
            r0.width = r1
            android.view.Window r1 = r13.getWindow()
            r1.setAttributes(r0)
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r15.m_otherValueToCompare
            r15.workingOtherVarToCompare = r0
            com.arlosoft.macrodroid.variables.DictionaryKeys r0 = r15.compareVarDictionaryKeys
            r15.workingCompareVarDictionaryKeys = r0
            r0 = 2131364226(0x7f0a0982, float:1.8348283E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = r0
            android.widget.Button r12 = (android.widget.Button) r12
            r0 = 2131364225(0x7f0a0981, float:1.8348281E38)
            android.view.View r0 = r13.findViewById(r0)
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131364232(0x7f0a0988, float:1.8348295E38)
            android.view.View r0 = r13.findViewById(r0)
            r7 = r0
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            r0 = 2131364238(0x7f0a098e, float:1.8348307E38)
            android.view.View r0 = r13.findViewById(r0)
            r8 = r0
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r0 = 2131364234(0x7f0a098a, float:1.83483E38)
            android.view.View r0 = r13.findViewById(r0)
            r9 = r0
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r0 = 2131364227(0x7f0a0983, float:1.8348285E38)
            android.view.View r0 = r13.findViewById(r0)
            r10 = r0
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0 = 2131364233(0x7f0a0989, float:1.8348297E38)
            android.view.View r0 = r13.findViewById(r0)
            r5 = r0
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            r0 = 2131364236(0x7f0a098c, float:1.8348303E38)
            android.view.View r0 = r13.findViewById(r0)
            r4 = r0
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r0 = 2131364235(0x7f0a098b, float:1.8348301E38)
            android.view.View r0 = r13.findViewById(r0)
            r3 = r0
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r0 = 2131364237(0x7f0a098d, float:1.8348305E38)
            android.view.View r0 = r13.findViewById(r0)
            r2 = r0
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r0 = 2131364228(0x7f0a0984, float:1.8348287E38)
            android.view.View r0 = r13.findViewById(r0)
            r1 = r0
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 2131364229(0x7f0a0985, float:1.834829E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r16 = r2
            r2 = 2131364230(0x7f0a0986, float:1.8348291E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r17 = r3
            r3 = 2131364231(0x7f0a0987, float:1.8348293E38)
            android.view.View r3 = r13.findViewById(r3)
            android.widget.Spinner r3 = (android.widget.Spinner) r3
            r18 = r4
            r4 = 2131364242(0x7f0a0992, float:1.8348316E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.RadioGroup r4 = (android.widget.RadioGroup) r4
            r19 = r4
            r4 = 2131364244(0x7f0a0994, float:1.834832E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r20 = r4
            r4 = 2131364246(0x7f0a0996, float:1.8348324E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r21 = r4
            r4 = 2131364243(0x7f0a0993, float:1.8348318E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r22 = r4
            r4 = 2131364245(0x7f0a0995, float:1.8348322E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r23 = r4
            r4 = 2131364240(0x7f0a0990, float:1.8348311E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r24 = r4
            r4 = 2131364239(0x7f0a098f, float:1.834831E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r25 = r4
            r4 = 2131364241(0x7f0a0991, float:1.8348314E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r26 = r4
            r4 = 2131364247(0x7f0a0997, float:1.8348326E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r27 = r4
            r4 = 2131362672(0x7f0a0370, float:1.8345131E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r28 = r4
            r4 = 2131362926(0x7f0a046e, float:1.8345646E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r29 = r4
            r4 = 2131362755(0x7f0a03c3, float:1.83453E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r30 = r5
            r5 = 2131362752(0x7f0a03c0, float:1.8345293E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r31 = r11
            r11 = 2131362754(0x7f0a03c2, float:1.8345298E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            r32 = r7
            r7 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r7 = r13.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r33 = r13
            java.util.ArrayList r13 = r54.mo27814A0()
            java.util.Iterator r34 = r13.iterator()
        L_0x017e:
            boolean r35 = r34.hasNext()
            r36 = r9
            if (r35 == 0) goto L_0x01b4
            java.lang.Object r35 = r34.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r35 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r35
            int r9 = r35.mo27743S()
            r37 = r8
            r8 = 3
            if (r9 == r8) goto L_0x019c
            int r8 = r35.mo27743S()
            r9 = 1
            if (r8 != r9) goto L_0x01ac
        L_0x019c:
            java.lang.String r8 = r35.getName()
            com.arlosoft.macrodroid.common.MacroDroidVariable r9 = r15.m_variable
            java.lang.String r9 = r9.getName()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01af
        L_0x01ac:
            r34.remove()
        L_0x01af:
            r9 = r36
            r8 = r37
            goto L_0x017e
        L_0x01b4:
            r37 = r8
            int r8 = r13.size()
            r9 = 0
            if (r8 <= 0) goto L_0x021c
            com.arlosoft.macrodroid.common.MacroDroidVariable r8 = r15.m_otherValueToCompare
            if (r8 != 0) goto L_0x01cf
            int r8 = r13.size()
            if (r8 <= 0) goto L_0x01cf
            java.lang.Object r8 = r13.get(r9)
            com.arlosoft.macrodroid.common.MacroDroidVariable r8 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r8
            r15.m_otherValueToCompare = r8
        L_0x01cf:
            int r8 = r13.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            r35 = r10
            r10 = 0
        L_0x01d8:
            int r6 = r13.size()
            if (r9 >= r6) goto L_0x0200
            java.lang.Object r6 = r13.get(r9)
            com.arlosoft.macrodroid.common.MacroDroidVariable r6 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r6
            java.lang.String r6 = r6.getName()
            r8[r9] = r6
            r6 = r8[r9]
            r38 = r7
            com.arlosoft.macrodroid.common.MacroDroidVariable r7 = r15.m_otherValueToCompare
            java.lang.String r7 = r7.getName()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01fb
            r10 = r9
        L_0x01fb:
            int r9 = r9 + 1
            r7 = r38
            goto L_0x01d8
        L_0x0200:
            r38 = r7
            android.widget.ArrayAdapter r6 = new android.widget.ArrayAdapter
            android.content.Context r7 = r54.mo27827K0()
            r9 = 2131559007(0x7f0d025f, float:1.8743346E38)
            r6.<init>(r7, r9, r8)
            r7 = 2131559004(0x7f0d025c, float:1.874334E38)
            r6.setDropDownViewResource(r7)
            r3.setAdapter(r6)
            r3.setSelection(r10)
            goto L_0x027d
        L_0x021c:
            r38 = r7
            r35 = r10
            int r6 = r13.size()
            if (r6 != 0) goto L_0x027d
            boolean r6 = r2.isChecked()
            if (r6 == 0) goto L_0x027d
            r6 = 1
            r0.setChecked(r6)
            boolean r6 = r0.isChecked()
            boolean r7 = r2.isChecked()
            boolean r8 = r4.isChecked()
            android.text.Editable r9 = r1.getText()
            java.lang.String r9 = r9.toString()
            android.text.Editable r10 = r5.getText()
            java.lang.String r10 = r10.toString()
            r13 = r0
            r0 = r54
            r39 = r1
            r1 = r6
            r40 = r2
            r6 = r16
            r2 = r7
            r41 = r3
            r7 = r17
            r3 = r8
            r17 = r6
            r16 = r13
            r13 = r19
            r42 = r23
            r43 = r24
            r44 = r26
            r6 = r28
            r8 = r29
            r23 = r4
            r19 = r7
            r7 = r25
            r4 = r9
            r9 = r5
            r5 = r10
            boolean r0 = r0.m23423c4(r1, r2, r3, r4, r5)
            r12.setEnabled(r0)
            goto L_0x029a
        L_0x027d:
            r39 = r1
            r40 = r2
            r41 = r3
            r9 = r5
            r13 = r19
            r42 = r23
            r43 = r24
            r7 = r25
            r44 = r26
            r6 = r28
            r8 = r29
            r23 = r4
            r19 = r17
            r17 = r16
            r16 = r0
        L_0x029a:
            java.lang.String r0 = r15.m_expression
            r9.setText(r0)
            com.arlosoft.macrodroid.triggers.f8 r0 = new com.arlosoft.macrodroid.triggers.f8
            r0.<init>(r9)
            com.arlosoft.macrodroid.triggers.m8 r1 = new com.arlosoft.macrodroid.triggers.m8
            r1.<init>(r15, r14, r0)
            r11.setOnClickListener(r1)
            r10 = 8
            r5 = r38
            r5.setVisibility(r10)
            boolean r0 = r15.enableRegex
            r6.setChecked(r0)
            boolean r0 = r15.checkCase
            r1 = 1
            r0 = r0 ^ r1
            r8.setChecked(r0)
            r3 = r55
            if (r3 != 0) goto L_0x0302
            r0 = r35
            r0.setVisibility(r10)
            r13.setVisibility(r10)
            r12.setEnabled(r1)
            boolean r0 = r15.m_booleanValue
            r4 = r37
            r4.setChecked(r0)
            boolean r0 = r15.m_booleanValue
            r0 = r0 ^ r1
            r2 = r36
            r2.setChecked(r0)
            r7.setVisibility(r10)
            r2 = r27
            r2.setVisibility(r10)
            r6.setVisibility(r10)
            r8.setVisibility(r10)
            r29 = r8
            r0 = r17
            r2 = r18
            r7 = r19
            r13 = r39
            r1 = r43
            r8 = 1
            r53 = r22
            r22 = r20
            r20 = r21
            r21 = r53
            goto L_0x0431
        L_0x0302:
            r2 = r27
            r0 = r35
            r4 = r37
            if (r3 == r1) goto L_0x038d
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = r15.m_variable
            int r1 = r1.mo27743S()
            r10 = 3
            if (r1 != r10) goto L_0x0323
            r0 = r32
            r1 = r43
            r10 = 8
            r53 = r22
            r22 = r20
            r20 = r21
            r21 = r53
            goto L_0x039b
        L_0x0323:
            r1 = r32
            r10 = 8
            r1.setVisibility(r10)
            r0.setVisibility(r10)
            int r0 = r15.m_stringComparisonType
            if (r0 != 0) goto L_0x0344
            boolean r0 = r15.m_stringEqual
            r10 = r20
            r10.setChecked(r0)
            boolean r0 = r15.m_stringEqual
            r1 = 1
            r0 = r0 ^ r1
            r2 = r21
            r2.setChecked(r0)
            r7 = r22
            goto L_0x035c
        L_0x0344:
            r10 = r20
            r2 = r21
            r1 = 1
            if (r0 != r1) goto L_0x0351
            r7 = r22
            r7.setChecked(r1)
            goto L_0x035c
        L_0x0351:
            r7 = r22
            r13 = 2
            if (r0 != r13) goto L_0x035c
            r0 = r42
            r0.setChecked(r1)
            goto L_0x035e
        L_0x035c:
            r0 = r42
        L_0x035e:
            java.lang.String r13 = r15.m_stringValue
            r1 = r43
            r1.setText(r13)
            android.text.Editable r13 = r1.getText()
            int r13 = r13.length()
            r1.setSelection(r13)
            r13 = 1
            r12.setEnabled(r13)
            r13 = 0
            r8.setVisibility(r13)
            r42 = r0
            r20 = r2
            r21 = r7
            r29 = r8
            r22 = r10
            r0 = r17
            r2 = r18
            r7 = r19
            r13 = r39
            r8 = 1
            goto L_0x0431
        L_0x038d:
            r10 = r20
            r20 = r21
            r21 = r22
            r0 = r32
            r1 = r43
            r22 = r10
            r10 = 8
        L_0x039b:
            r0.setVisibility(r10)
            r13.setVisibility(r10)
            android.text.Editable r0 = r39.getText()
            int r0 = r0.length()
            r13 = r39
            r13.setSelection(r0)
            r7.setVisibility(r10)
            r2.setVisibility(r10)
            r6.setVisibility(r10)
            r8.setVisibility(r10)
            r7 = 0
            r5.setVisibility(r7)
            android.app.Activity r0 = r54.mo27850j0()
            com.arlosoft.macrodroid.utils.C6451w.m24765a(r0, r5)
            r0 = 3
            if (r3 != r0) goto L_0x03d9
            r0 = 8194(0x2002, float:1.1482E-41)
            r13.setInputType(r0)
            r29 = r8
            double r7 = r15.m_doubleValue
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r13.setText(r0)
            goto L_0x03e9
        L_0x03d9:
            r29 = r8
            r0 = 4098(0x1002, float:5.743E-42)
            r13.setInputType(r0)
            long r7 = r15.m_intValue
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r13.setText(r0)
        L_0x03e9:
            int r0 = r13.length()
            r13.setSelection(r0)
            android.text.Editable r0 = r13.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x03fc
            r0 = 1
            goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            r12.setEnabled(r0)
            boolean r0 = r15.m_intGreaterThan
            if (r0 == 0) goto L_0x040f
            r7 = r19
            r8 = 1
            r7.setChecked(r8)
            r0 = r17
            r2 = r18
            goto L_0x0431
        L_0x040f:
            r7 = r19
            r8 = 1
            boolean r0 = r15.m_intLessThan
            if (r0 == 0) goto L_0x041e
            r2 = r18
            r2.setChecked(r8)
            r0 = r17
            goto L_0x0431
        L_0x041e:
            r2 = r18
            boolean r0 = r15.m_intNotEqual
            if (r0 == 0) goto L_0x042a
            r0 = r17
            r0.setChecked(r8)
            goto L_0x0431
        L_0x042a:
            r0 = r17
            r10 = r30
            r10.setChecked(r8)
        L_0x0431:
            com.arlosoft.macrodroid.triggers.VariableTrigger$b r10 = new com.arlosoft.macrodroid.triggers.VariableTrigger$b
            r10.<init>(r12)
            r13.addTextChangedListener(r10)
            com.arlosoft.macrodroid.triggers.n8 r10 = new com.arlosoft.macrodroid.triggers.n8
            r17 = r0
            r18 = r42
            r0 = r10
            r43 = r1
            r1 = r54
            r19 = r2
            r2 = r41
            r3 = r55
            r25 = r5
            r5 = r7
            r7 = r17
            r17 = r22
            r22 = r6
            r6 = r19
            r19 = r21
            r45 = r25
            r21 = 0
            r25 = r29
            r26 = 1
            r8 = r23
            r55 = r9
            r46 = r10
            r24 = 8
            r10 = r13
            r48 = r11
            r47 = r31
            r11 = r40
            r49 = r12
            r12 = r17
            r50 = r13
            r51 = r16
            r27 = r33
            r13 = r20
            r52 = r14
            r14 = r19
            r15 = r18
            r16 = r43
            r17 = r25
            r18 = r22
            r19 = r56
            r20 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r46
            r11 = r49
            r11.setOnClickListener(r0)
            com.arlosoft.macrodroid.triggers.k8 r0 = new com.arlosoft.macrodroid.triggers.k8
            r12 = r27
            r0.<init>(r12)
            r1 = r47
            r1.setOnClickListener(r0)
            com.arlosoft.macrodroid.triggers.g8 r0 = new com.arlosoft.macrodroid.triggers.g8
            r4 = r43
            r0.<init>(r4)
            com.arlosoft.macrodroid.triggers.l8 r1 = new com.arlosoft.macrodroid.triggers.l8
            r13 = r54
            r2 = r52
            r1.<init>(r13, r2, r0)
            r4 = r44
            r4.setOnClickListener(r1)
            boolean r0 = r13.m_intCompareVariable
            if (r0 != 0) goto L_0x04c1
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x04c1
            r14 = r51
            r9 = 1
            goto L_0x04c4
        L_0x04c1:
            r14 = r51
            r9 = 0
        L_0x04c4:
            r14.setChecked(r9)
            boolean r0 = r13.m_intCompareVariable
            if (r0 != 0) goto L_0x04d3
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x04d3
            r15 = r50
            r9 = 1
            goto L_0x04d6
        L_0x04d3:
            r15 = r50
            r9 = 0
        L_0x04d6:
            r15.setEnabled(r9)
            java.lang.String r0 = r13.m_expression
            r10 = r23
            if (r0 == 0) goto L_0x04e1
            r9 = 1
            goto L_0x04e2
        L_0x04e1:
            r9 = 0
        L_0x04e2:
            r10.setChecked(r9)
            java.lang.String r0 = r13.m_expression
            r8 = r55
            if (r0 == 0) goto L_0x04ed
            r9 = 1
            goto L_0x04ee
        L_0x04ed:
            r9 = 0
        L_0x04ee:
            r8.setEnabled(r9)
            java.lang.String r0 = r13.m_expression
            r7 = r48
            if (r0 == 0) goto L_0x04f9
            r9 = 1
            goto L_0x04fa
        L_0x04f9:
            r9 = 0
        L_0x04fa:
            r7.setEnabled(r9)
            java.lang.String r0 = r13.m_expression
            r6 = r45
            if (r0 == 0) goto L_0x0505
            r9 = 0
            goto L_0x0507
        L_0x0505:
            r9 = 8
        L_0x0507:
            r6.setVisibility(r9)
            java.lang.String r0 = r13.m_expression
            r8.setText(r0)
            boolean r0 = r13.m_intCompareVariable
            if (r0 == 0) goto L_0x051b
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x051b
            r5 = r40
            r9 = 1
            goto L_0x051e
        L_0x051b:
            r5 = r40
            r9 = 0
        L_0x051e:
            r5.setChecked(r9)
            boolean r0 = r13.m_intCompareVariable
            if (r0 == 0) goto L_0x052d
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x052d
            r4 = r41
            r9 = 0
            goto L_0x0531
        L_0x052d:
            r4 = r41
            r9 = 8
        L_0x0531:
            r4.setVisibility(r9)
            boolean r0 = r5.isChecked()
            if (r0 == 0) goto L_0x053d
            r13.m23411P3(r4)
        L_0x053d:
            com.arlosoft.macrodroid.triggers.e8 r9 = new com.arlosoft.macrodroid.triggers.e8
            r0 = r9
            r1 = r54
            r2 = r4
            r3 = r14
            r16 = r4
            r4 = r10
            r40 = r5
            r5 = r8
            r17 = r6
            r6 = r7
            r18 = r7
            r7 = r17
            r55 = r8
            r8 = r15
            r27 = r12
            r12 = r9
            r9 = r11
            r23 = r10
            r10 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r10.setOnCheckedChangeListener(r12)
            com.arlosoft.macrodroid.triggers.o8 r12 = new com.arlosoft.macrodroid.triggers.o8
            r0 = r12
            r2 = r10
            r3 = r15
            r4 = r23
            r5 = r55
            r6 = r18
            r8 = r16
            r19 = r10
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.setOnCheckedChangeListener(r12)
            com.arlosoft.macrodroid.triggers.p8 r12 = new com.arlosoft.macrodroid.triggers.p8
            r0 = r12
            r2 = r14
            r4 = r19
            r5 = r16
            r6 = r55
            r7 = r18
            r8 = r17
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = r23
            r4.setOnCheckedChangeListener(r12)
            com.arlosoft.macrodroid.triggers.VariableTrigger$c r0 = new com.arlosoft.macrodroid.triggers.VariableTrigger$c
            r5 = r55
            r0.<init>(r5, r11)
            r5.addTextChangedListener(r0)
            r27.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.VariableTrigger.m23413R3(int, java.util.ArrayList):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public boolean m23414S3() {
        return this.m_anyValueChange;
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public boolean m23415T3() {
        return this.m_booleanValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public double m23416U3() {
        return this.m_doubleValue;
    }

    /* renamed from: W3 */
    private String m23417W3(int i) {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.m_anyValueChange) {
            return "(" + SelectableItem.m15535j1(C17541R$string.trigger_variable_any_change) + ")";
        } else if (i == 0) {
            return "= " + this.m_booleanValue;
        } else if (i != 1) {
            if (i == 2) {
                int i2 = this.m_stringComparisonType;
                if (i2 == 0) {
                    if (this.m_stringEqual) {
                        return "= " + this.m_stringValue;
                    }
                    return "!= " + this.m_stringValue;
                } else if (i2 == 1) {
                    return SelectableItem.m15535j1(C17541R$string.contains).toLowerCase() + " " + this.m_stringValue;
                } else if (i2 == 2) {
                    return SelectableItem.m15535j1(C17541R$string.excludes).toLowerCase() + " " + this.m_stringValue;
                }
            } else if (i == 3) {
                String str = this.m_expression;
                if (str == null) {
                    if (this.m_intCompareVariable) {
                        sb2 = new StringBuilder();
                        sb2.append(this.m_otherValueToCompare.getName());
                        sb2.append(C6520o0.m24912e0(this.workingCompareVarDictionaryKeys));
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("");
                        sb2.append(this.m_doubleValue);
                    }
                    str = sb2.toString();
                }
                if (this.m_intGreaterThan) {
                    return "> " + str;
                } else if (this.m_intLessThan) {
                    return "< " + str;
                } else if (this.m_intNotEqual) {
                    return "!= " + str;
                } else {
                    return "= " + str;
                }
            }
            return "";
        } else {
            String str2 = this.m_expression;
            if (str2 == null) {
                if (this.m_intCompareVariable) {
                    sb = new StringBuilder();
                    sb.append(this.m_otherValueToCompare.getName());
                    sb.append(C6520o0.m24912e0(this.workingCompareVarDictionaryKeys));
                } else {
                    sb = new StringBuilder();
                    sb.append("");
                    sb.append(this.m_intValue);
                }
                str2 = sb.toString();
            }
            if (this.m_intGreaterThan) {
                return "> " + str2;
            } else if (this.m_intLessThan) {
                return "< " + str2;
            } else if (this.m_intNotEqual) {
                return "!= " + str2;
            } else {
                return "= " + str2;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public boolean m23418X3() {
        return this.m_intCompareVariable;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public boolean m23419Y3() {
        return this.m_intGreaterThan;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public boolean m23420Z3() {
        return this.m_intLessThan;
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public boolean m23421a4() {
        return this.m_intNotEqual;
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public long m23422b4() {
        return this.m_intValue;
    }

    /* renamed from: c4 */
    private boolean m23423c4(boolean z, boolean z2, boolean z3, String str, String str2) {
        if (z2) {
            return true;
        }
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        try {
            C6451w.m24766b(mo27827K0(), mo27837X0(), str2, (TriggerContextInfo) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public MacroDroidVariable m23424d4() {
        return this.m_otherValueToCompare;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public int m23425e4() {
        return this.m_stringComparisonType;
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public boolean m23426f4() {
        return this.m_stringEqual;
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public String m23428g4() {
        return this.m_stringValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public /* synthetic */ void m23430h4(DialogInterface dialogInterface, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.m_anyValueChange = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public /* synthetic */ void m23432i4(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public /* synthetic */ void m23434j4(int i, ArrayList arrayList, DialogInterface dialogInterface, int i2) {
        if (this.m_anyValueChange) {
            this.dictionaryType = i;
            this.dictionaryKeys = new DictionaryKeys(arrayList);
            mo24689O1();
            return;
        }
        m23413R3(i, arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public /* synthetic */ void m23436k4(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public /* synthetic */ void m23438l4(Spinner spinner, RadioButton radioButton, RadioButton radioButton2, EditText editText, Button button, LinearLayout linearLayout, EditText editText2, Button button2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            m23411P3(spinner);
            RadioButton radioButton4 = radioButton;
            radioButton.setChecked(false);
            RadioButton radioButton5 = radioButton2;
            radioButton2.setChecked(false);
            EditText editText3 = editText;
            editText.setEnabled(false);
            Button button3 = button;
            button.setEnabled(false);
            LinearLayout linearLayout2 = linearLayout;
            linearLayout.setVisibility(8);
            EditText editText4 = editText2;
            editText2.setEnabled(false);
            Spinner spinner2 = spinner;
            spinner.setVisibility(0);
            Button button4 = button2;
            button2.setEnabled(m23423c4(radioButton.isChecked(), radioButton3.isChecked(), radioButton2.isChecked(), editText2.getText().toString(), editText.getText().toString()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public /* synthetic */ void m23440m4(RadioButton radioButton, EditText editText, RadioButton radioButton2, EditText editText2, Button button, LinearLayout linearLayout, Spinner spinner, Button button2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        EditText editText3 = editText;
        if (z) {
            RadioButton radioButton4 = radioButton;
            radioButton.setChecked(false);
            editText.setEnabled(false);
            RadioButton radioButton5 = radioButton2;
            radioButton2.setChecked(false);
            EditText editText4 = editText2;
            editText2.setEnabled(false);
            Button button3 = button;
            button.setEnabled(false);
            LinearLayout linearLayout2 = linearLayout;
            linearLayout.setVisibility(8);
            Spinner spinner2 = spinner;
            spinner.setVisibility(8);
            editText.setEnabled(true);
            Button button4 = button2;
            button2.setEnabled(m23423c4(radioButton3.isChecked(), radioButton.isChecked(), radioButton2.isChecked(), editText.getText().toString(), editText2.getText().toString()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public /* synthetic */ void m23442n4(RadioButton radioButton, EditText editText, RadioButton radioButton2, Spinner spinner, EditText editText2, Button button, LinearLayout linearLayout, Button button2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            RadioButton radioButton4 = radioButton;
            radioButton.setChecked(false);
            EditText editText3 = editText;
            editText.setEnabled(false);
            RadioButton radioButton5 = radioButton2;
            radioButton2.setChecked(false);
            Spinner spinner2 = spinner;
            spinner.setVisibility(8);
            EditText editText4 = editText2;
            editText2.setEnabled(true);
            Button button3 = button;
            button.setEnabled(true);
            LinearLayout linearLayout2 = linearLayout;
            linearLayout.setVisibility(0);
            Button button4 = button2;
            button2.setEnabled(m23423c4(radioButton.isChecked(), radioButton2.isChecked(), radioButton3.isChecked(), editText.getText().toString(), editText2.getText().toString()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public static /* synthetic */ void m23444o4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public /* synthetic */ void m23446p4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15693A(activity, mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Trigger_SmallText, (C7967d) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public /* synthetic */ void m23448q4(Spinner spinner, int i, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, EditText editText, EditText editText2, RadioButton radioButton6, RadioButton radioButton7, RadioButton radioButton8, RadioButton radioButton9, RadioButton radioButton10, EditText editText3, CheckBox checkBox, CheckBox checkBox2, ArrayList arrayList, AppCompatDialog appCompatDialog, View view) {
        int i2 = i;
        Math.max(0, spinner.getSelectedItemPosition());
        if (i2 != 0) {
            String str = null;
            if (i2 == 1) {
                this.m_intGreaterThan = radioButton2.isChecked();
                this.m_intLessThan = radioButton3.isChecked();
                this.m_intNotEqual = radioButton4.isChecked();
                if (radioButton5.isChecked()) {
                    str = editText.getText().toString();
                }
                this.m_expression = str;
                if (editText2.length() > 0) {
                    this.m_intValue = Long.valueOf(editText2.getText().toString()).longValue();
                } else {
                    this.m_intValue = 0;
                }
                boolean isChecked = radioButton6.isChecked();
                this.m_intCompareVariable = isChecked;
                if (isChecked) {
                    this.m_otherValueToCompare = this.workingOtherVarToCompare;
                    this.compareVarDictionaryKeys = this.workingCompareVarDictionaryKeys;
                }
            } else if (i2 == 2) {
                if (radioButton7.isChecked() || radioButton8.isChecked()) {
                    this.m_stringComparisonType = 0;
                    this.m_stringEqual = radioButton7.isChecked();
                } else if (radioButton9.isChecked()) {
                    this.m_stringComparisonType = 1;
                } else if (radioButton10.isChecked()) {
                    this.m_stringComparisonType = 2;
                }
                this.m_stringValue = editText3.getText().toString();
            } else if (i2 == 3) {
                this.m_intGreaterThan = radioButton2.isChecked();
                this.m_intLessThan = radioButton3.isChecked();
                this.m_intNotEqual = radioButton4.isChecked();
                if (radioButton5.isChecked()) {
                    str = editText.getText().toString();
                }
                this.m_expression = str;
                if (editText2.length() > 0) {
                    this.m_doubleValue = Double.valueOf(editText2.getText().toString()).doubleValue();
                } else {
                    this.m_doubleValue = 0.0d;
                }
                boolean isChecked2 = radioButton6.isChecked();
                this.m_intCompareVariable = isChecked2;
                if (isChecked2) {
                    this.m_otherValueToCompare = this.workingOtherVarToCompare;
                    this.compareVarDictionaryKeys = this.workingCompareVarDictionaryKeys;
                }
            }
        } else {
            this.m_booleanValue = radioButton.isChecked();
        }
        this.checkCase = true ^ checkBox.isChecked();
        this.enableRegex = checkBox2.isChecked();
        this.dictionaryType = i2;
        this.dictionaryKeys = new DictionaryKeys(arrayList);
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static /* synthetic */ void m23452s4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public /* synthetic */ void m23454t4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public void m23456u4(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        List<String> list = null;
        String str = (dictionaryKeys2 == null || dictionaryKeys2.getKeys().size() <= i2) ? null : this.dictionaryKeys.getKeys().get(i2);
        Activity j0 = mo27850j0();
        DictionaryKeys dictionaryKeys3 = this.dictionaryKeys;
        if (dictionaryKeys3 != null) {
            list = dictionaryKeys3.getKeys();
        }
        C6520o0.m24884K0(j0, C17542R$style.Theme_App_Dialog_Action, dictionary, (C16265l<? super VariableValue, Boolean>) null, str, true, new C6520o0.C6525c(true, list), false, C6520o0.C6538e.DONT_SHOW, true, new C5760a(macroDroidVariable, dictionary, arrayList, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        ArrayList<MacroDroidVariable> A0 = mo27814A0();
        if (this.m_variable != null) {
            for (int i = 0; i < A0.size(); i++) {
                if (A0.get(i).getName().equals(this.m_variable.getName())) {
                    this.m_selectedIndex = i;
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_stringValue, this.m_expression};
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        return mo24672O0();
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_stringValue = strArr[0];
            this.m_expression = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        MacroDroidVariable macroDroidVariable = this.m_variable;
        if (macroDroidVariable == null) {
            return "";
        }
        int S = macroDroidVariable.mo27743S();
        if (S == 4 || S == 5) {
            return this.m_variable.getName() + C6520o0.m24912e0(this.dictionaryKeys) + " " + m23417W3(this.dictionaryType);
        }
        return this.m_variable.getName() + " " + m23417W3(this.m_variable.mo27743S());
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        s_triggerCounter--;
        Macro macro = this.m_macro;
        if (macro != null) {
            macro.removeLocalVariableUpdatedListener(s_updateListener);
        }
        if (s_triggerCounter == 0) {
            s_updateListener = null;
            C4064u.m16048t().mo27978M((C4068u1) null);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7486c2.m31117u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        if (this.m_anyValueChange) {
            return mo24738G0() + " (" + SelectableItem.m15535j1(C17541R$string.any) + ")";
        }
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_updateListener = new C5766f(mo27827K0());
            C4064u.m16048t().mo27978M(s_updateListener);
        }
        Macro macro = this.m_macro;
        if (macro != null) {
            macro.addLocalVariableUpdatedListener(s_updateListener);
        } else {
            C4878b.m18869h("Variable trigger, macro is null", mo27840Y0().longValue());
        }
        s_triggerCounter++;
    }

    /* renamed from: V3 */
    public String mo31579V3() {
        return this.m_expression;
    }

    @NonNull
    /* renamed from: b */
    public DictionaryKeys[] mo24428b() {
        return new DictionaryKeys[]{this.dictionaryKeys, this.compareVarDictionaryKeys};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        ArrayList<MacroDroidVariable> A0 = mo27814A0();
        if (A0.size() > 0) {
            String[] strArr = new String[A0.size()];
            for (int i = 0; i < A0.size(); i++) {
                strArr[i] = A0.get(i).getName();
            }
            return strArr;
        }
        C15626c.m94876a(mo27827K0().getApplicationContext(), SelectableItem.m15535j1(C17541R$string.trigger_variable_no_variables), 1).show();
        return new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.trigger_variable_select);
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo24437j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.m_variable);
        if (this.m_intCompareVariable) {
            arrayList.add(this.m_otherValueToCompare);
        }
        return arrayList;
    }

    /* renamed from: s */
    public MacroDroidVariable mo31580s() {
        return this.m_variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String[] g1 = mo24676g1();
        if (g1 != null && g1.length > 0) {
            mo27848g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        MacroDroidVariable macroDroidVariable = mo27814A0().get(this.m_selectedIndex);
        this.m_variable = macroDroidVariable;
        int S = macroDroidVariable.mo27743S();
        if (S == 4 || S == 5) {
            MacroDroidVariable macroDroidVariable2 = this.m_variable;
            m23456u4(macroDroidVariable2, macroDroidVariable2.mo27770n(), new ArrayList(), 0);
            return;
        }
        m23412Q3(this.m_variable.mo27743S(), new ArrayList());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeLong(this.m_intValue);
        parcel.writeParcelable(this.m_otherValueToCompare, i);
        parcel.writeInt(this.m_intGreaterThan ? 1 : 0);
        parcel.writeInt(this.m_intLessThan ? 1 : 0);
        parcel.writeInt(this.m_intNotEqual ? 1 : 0);
        parcel.writeInt(this.m_intCompareVariable ? 1 : 0);
        parcel.writeInt(this.m_booleanValue ? 1 : 0);
        parcel.writeString(this.m_stringValue);
        parcel.writeInt(this.m_stringEqual ? 1 : 0);
        parcel.writeInt(this.m_anyValueChange ? 1 : 0);
        parcel.writeDouble(this.m_doubleValue);
        parcel.writeInt(this.m_stringComparisonType);
        parcel.writeString(this.m_expression);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeInt(this.checkCase ? 1 : 0);
        parcel.writeInt(this.dictionaryType);
        parcel.writeParcelable(this.dictionaryKeys, i);
        parcel.writeParcelable(this.compareVarDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedIndex = i;
    }

    /* renamed from: z */
    public void mo24429z(@NonNull DictionaryKeys[] dictionaryKeysArr) {
        if (dictionaryKeysArr.length >= 2) {
            this.dictionaryKeys = dictionaryKeysArr[0];
            this.compareVarDictionaryKeys = dictionaryKeysArr[1];
        }
    }

    public VariableTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private VariableTrigger() {
        this.compareVarDictionaryKeys = null;
        this.dictionaryType = -1;
        this.m_stringEqual = true;
        this.m_anyValueChange = false;
        this.m_stringValue = "";
    }

    private VariableTrigger(Parcel parcel) {
        super(parcel);
        this.compareVarDictionaryKeys = null;
        this.dictionaryType = -1;
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_intValue = parcel.readLong();
        this.m_otherValueToCompare = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        boolean z = true;
        this.m_intGreaterThan = parcel.readInt() != 0;
        this.m_intLessThan = parcel.readInt() != 0;
        this.m_intNotEqual = parcel.readInt() != 0;
        this.m_intCompareVariable = parcel.readInt() != 0;
        this.m_booleanValue = parcel.readInt() != 0;
        this.m_stringValue = parcel.readString();
        this.m_stringEqual = parcel.readInt() != 0;
        this.m_anyValueChange = parcel.readInt() != 0;
        this.m_doubleValue = parcel.readDouble();
        this.m_stringComparisonType = parcel.readInt();
        this.m_expression = parcel.readString();
        this.enableRegex = parcel.readInt() != 0;
        this.checkCase = parcel.readInt() == 0 ? false : z;
        this.dictionaryType = parcel.readInt();
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
        this.compareVarDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
