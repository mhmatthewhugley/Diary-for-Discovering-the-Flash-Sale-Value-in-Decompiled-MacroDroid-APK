package p189x2;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.core.util.SparseArrayKt;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

/* renamed from: x2.p */
/* compiled from: TaskerVariableHelper.kt */
public final class C10375p {

    /* renamed from: x2.p$a */
    /* compiled from: TaskerVariableHelper.kt */
    public /* synthetic */ class C10376a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23595a;

        static {
            int[] iArr = new int[C10357b.values().length];
            iArr[C10357b.FIRST_ELEMENT.ordinal()] = 1;
            iArr[C10357b.COMMA_SEPARATED.ordinal()] = 2;
            iArr[C10357b.NEW_LINE_SEPARATED.ordinal()] = 3;
            f23595a = iArr;
        }
    }

    /* renamed from: c */
    private final String m40696c(String str, C10374m mVar) {
        String str2 = mVar.mo25306p().get(str);
        if (str2 == null) {
            Map<String, String> p = mVar.mo25306p();
            str2 = p.get(str + "()");
            if (str2 == null && C10377q.m40704d(str)) {
                Map<String, String> p2 = mVar.mo25306p();
                str2 = p2.get(C10377q.m40706f(str) + "()");
            }
        }
        if (str2 != null) {
            return str2;
        }
        MacroDroidVariable q = mVar.mo41056q(str);
        return q != null ? q.getName() : null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m40697f(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m40698g(RadioButton radioButton, RadioButton radioButton2, Pair pair, CheckBox checkBox, SelectableItem selectableItem, AppCompatDialog appCompatDialog, View view) {
        C10357b bVar;
        C13706o.m87929f(pair, "$pluginInstanceDataPair");
        C13706o.m87929f(checkBox, "$blockActionsCheckBox");
        C13706o.m87929f(selectableItem, "$selectableItem");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87926c(radioButton);
        if (radioButton.isChecked()) {
            bVar = C10357b.FIRST_ELEMENT;
        } else {
            C13706o.m87926c(radioButton2);
            if (radioButton2.isChecked()) {
                bVar = C10357b.COMMA_SEPARATED;
            } else {
                bVar = C10357b.NEW_LINE_SEPARATED;
            }
        }
        selectableItem.mo25307s1(new C10373l(pair, bVar, checkBox.isChecked()));
        appCompatDialog.dismiss();
    }

    /* renamed from: d */
    public final void mo41057d(Bundle bundle, C10374m mVar, SelectableItem selectableItem, C10357b bVar) {
        int i;
        MacroDroidVariable q;
        MacroDroidVariable q2;
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        Bundle bundle2 = bundle;
        C10374m mVar2 = mVar;
        SelectableItem selectableItem2 = selectableItem;
        C10357b bVar2 = bVar;
        C13706o.m87929f(bundle2, "variables");
        C13706o.m87929f(mVar2, "taskerVariableHandler");
        C13706o.m87929f(selectableItem2, "selectableItem");
        C13706o.m87929f(bVar2, "arrayHandlingOption");
        Set keySet = bundle.keySet();
        C13706o.m87928e(keySet, "variables.keySet()");
        List x0 = C13566b0.m87449x0(keySet);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = x0.iterator();
        while (true) {
            i = 2;
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            C13706o.m87928e(str2, "key");
            String c = m40696c(str2, mVar2);
            if (!(c == null || (q2 = selectableItem2.mo27861q(c)) == null)) {
                String str3 = "";
                if (C10377q.m40704d(str2)) {
                    if (!q2.mo27756d0() || bVar2 != C10357b.FIRST_ELEMENT) {
                        if (hashMap2.get(c) == null) {
                            hashMap2.put(c, new HashMap());
                        }
                        if (hashMap.get(c) == null) {
                            hashMap.put(c, new SparseArray());
                        }
                        StringBuilder sb = new StringBuilder();
                        int length = str2.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char charAt = str2.charAt(i2);
                            if (Character.isDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        String sb2 = sb.toString();
                        C13706o.m87928e(sb2, "filterTo(StringBuilder(), predicate).toString()");
                        int parseInt = Integer.parseInt(sb2);
                        SparseArray sparseArray = (SparseArray) hashMap.get(c);
                        if (sparseArray != null) {
                            Object obj6 = bundle2.get(str2);
                            if (obj6 != null) {
                                str = obj6.toString();
                            }
                            sparseArray.put(parseInt, str);
                        }
                        HashMap hashMap3 = (HashMap) hashMap2.get(c);
                        if (hashMap3 != null) {
                            Object obj7 = bundle2.get(str2);
                            if (!(obj7 == null || (obj4 = obj7.toString()) == null)) {
                                str3 = obj4;
                            }
                            String str4 = (String) hashMap3.put(str2, str3);
                        }
                    } else if (C10377q.m40705e(str2)) {
                        Object obj8 = bundle2.get(str2);
                        if (!(obj8 == null || (obj5 = obj8.toString()) == null)) {
                            str3 = obj5;
                        }
                        selectableItem2.mo27832M2(q2, new VariableValue.StringValue(str3, (List) null, 2, (C13695i) null));
                    }
                } else if (q2.mo27751a0()) {
                    if (hashMap2.get(c) == null) {
                        hashMap2.put(c, new HashMap());
                    }
                    HashMap hashMap4 = (HashMap) hashMap2.get(c);
                    if (hashMap4 != null) {
                        Object obj9 = bundle2.get(str2);
                        if (!(obj9 == null || (obj3 = obj9.toString()) == null)) {
                            str3 = obj3;
                        }
                        String str5 = (String) hashMap4.put(str2, str3);
                    }
                } else if (q2.mo27748X()) {
                    if (hashMap.get(c) == null) {
                        hashMap.put(c, new SparseArray());
                    }
                    SparseArray sparseArray2 = (SparseArray) hashMap.get(c);
                    if (sparseArray2 != null) {
                        Object obj10 = bundle2.get(str2);
                        if (!(obj10 == null || (obj2 = obj10.toString()) == null)) {
                            str3 = obj2;
                        }
                        sparseArray2.put(0, str3);
                    }
                } else {
                    Object obj11 = bundle2.get(str2);
                    if (!(obj11 == null || (obj = obj11.toString()) == null)) {
                        str3 = obj;
                    }
                    selectableItem2.mo27832M2(q2, new VariableValue.StringValue(str3, (List) null, 2, (C13695i) null));
                }
            }
        }
        String str6 = C10376a.f23595a[bVar.ordinal()] == 2 ? "," : "\\n";
        for (String str7 : hashMap.keySet()) {
            SparseArray sparseArray3 = (SparseArray) hashMap.get(str7);
            if (sparseArray3 != null) {
                MacroDroidVariable q3 = selectableItem2.mo27861q(str7);
                if (q3 != null && q3.mo27756d0()) {
                    List<String> D = C15132p.m93480D(C15125n.m93468c(SparseArrayKt.valueIterator(sparseArray3)));
                    ArrayList arrayList = new ArrayList(C13616u.m87774u(D, 10));
                    for (String add : D) {
                        arrayList.add(add);
                    }
                    selectableItem2.mo27832M2(q3, new VariableValue.StringValue(C13566b0.m87432g0(arrayList, str6, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null), (List) null, i, (C13695i) null));
                } else if (q3 != null && q3.mo27748X()) {
                    VariableValue.Dictionary dictionary = new VariableValue.Dictionary(new ArrayList(), true, (List) null, 4, (C13695i) null);
                    int size = sparseArray3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        int keyAt = sparseArray3.keyAt(i3);
                        dictionary.setEntry(new VariableValue.DictionaryEntry(String.valueOf(keyAt), new VariableValue.StringValue((String) sparseArray3.valueAt(i3), C13612s.m87736e(String.valueOf(keyAt))), (List) null, 4, (C13695i) null));
                    }
                    selectableItem2.mo27832M2(q3, dictionary);
                }
                i = 2;
            }
        }
        for (String str8 : hashMap2.keySet()) {
            HashMap hashMap5 = (HashMap) hashMap2.get(str8);
            if (!(hashMap5 == null || (q = selectableItem2.mo27861q(str8)) == null || !q.mo27751a0())) {
                VariableValue.Dictionary dictionary2 = new VariableValue.Dictionary(C13566b0.m87405I0(q.mo27770n().getEntries()), false, (List) null, 6, (C13695i) null);
                for (Map.Entry entry : hashMap5.entrySet()) {
                    String str9 = (String) entry.getKey();
                    dictionary2.setEntry(new VariableValue.DictionaryEntry(str9, new VariableValue.StringValue((String) entry.getValue(), C13612s.m87736e(str9.toString())), (List) null, 4, (C13695i) null));
                }
                selectableItem2.mo27832M2(q, dictionary2);
            }
        }
    }

    /* renamed from: e */
    public final void mo41058e(Activity activity, SelectableItem selectableItem, String[] strArr, C10374m mVar, Pair<Plugin, PluginInstanceData> pair, C10357b bVar, boolean z, boolean z2) {
        Activity activity2 = activity;
        C13706o.m87929f(activity2, "activity");
        C13706o.m87929f(selectableItem, "selectableItem");
        C13706o.m87929f(strArr, "relevantVariables");
        C13706o.m87929f(mVar, "variableHandler");
        C13706o.m87929f(pair, "pluginInstanceDataPair");
        C13706o.m87929f(bVar, "selectedArrayHandlingOption");
        if (selectableItem.mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(activity2, selectableItem.mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_tasker_variables);
            RecyclerView recyclerView = (RecyclerView) appCompatDialog.findViewById(C17532R$id.variablesList);
            if (recyclerView != null) {
                recyclerView.setLayerType(1, (Paint) null);
            }
            appCompatDialog.setTitle((int) C17541R$string.variables);
            RecyclerView recyclerView2 = (RecyclerView) appCompatDialog.findViewById(C17532R$id.variablesList);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            View findViewById = appCompatDialog.findViewById(C17532R$id.borderImage);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.arrayHandlingLabel);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.radioButtonFirstElement);
            RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.radioButtonCommaSeparated);
            RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.radioButtonNewLineSeparated);
            View findViewById2 = appCompatDialog.findViewById(C17532R$id.blockActionsCheckBox);
            C13706o.m87926c(findViewById2);
            CheckBox checkBox = (CheckBox) findViewById2;
            if (z) {
                checkBox.setVisibility(8);
            } else {
                checkBox.setChecked(z2);
            }
            if (findViewById != null) {
                findViewById.setBackgroundResource(z ? C17530R$drawable.trigger_border : C17530R$drawable.action_border);
            }
            if (textView != null) {
                textView.setTextColor(ContextCompat.getColor(activity2, z ? C17528R$color.trigger_accent : C17528R$color.actions_accent));
            }
            int i = C10376a.f23595a[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && radioButton3 != null) {
                        radioButton3.setChecked(true);
                    }
                } else if (radioButton2 != null) {
                    radioButton2.setChecked(true);
                }
            } else if (radioButton != null) {
                radioButton.setChecked(true);
            }
            C10367i iVar = new C10367i(strArr, mVar.mo25306p(), activity, selectableItem, selectableItem.mo24688L0());
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(iVar);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            C13706o.m87926c(window);
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (button2 != null) {
                button2.setOnClickListener(new C17512o(appCompatDialog));
            }
            if (button != null) {
                button.setOnClickListener(new C17511n(radioButton, radioButton2, pair, checkBox, selectableItem, appCompatDialog));
            }
            appCompatDialog.show();
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
    }
}
