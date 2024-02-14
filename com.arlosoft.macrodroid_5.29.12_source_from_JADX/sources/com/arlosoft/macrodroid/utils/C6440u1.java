package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.utils.u1 */
/* compiled from: VariablesHelper */
public class C6440u1 {

    /* renamed from: com.arlosoft.macrodroid.utils.u1$a */
    /* compiled from: VariablesHelper */
    class C6441a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15066a;

        /* renamed from: c */
        final /* synthetic */ EditText f15067c;

        C6441a(Button button, EditText editText) {
            this.f15066a = button;
            this.f15067c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f15066a.setEnabled(this.f15067c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.utils.u1$b */
    /* compiled from: VariablesHelper */
    public interface C6442b {
        /* renamed from: a */
        void mo25850a(MacroDroidVariable macroDroidVariable);
    }

    /* renamed from: d */
    public static void m24747d(Activity activity, Spinner spinner, SelectableItem selectableItem, int i, int i2, @Nullable C6442b bVar) {
        m24748e(activity, spinner, selectableItem, i, i2, false, bVar);
    }

    /* renamed from: e */
    public static void m24748e(Activity activity, Spinner spinner, SelectableItem selectableItem, int i, int i2, boolean z, @Nullable C6442b bVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(activity, i);
        appCompatDialog.setContentView((int) C17535R$layout.variable_new_variable_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_set_variable_create);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.variable_new_variable_dialog_name);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.type_container)).setVisibility(8);
        editText.addTextChangedListener(new C6441a(button, editText));
        button.setOnClickListener(new C6426s1(editText, selectableItem, activity, i2, (RadioButton) appCompatDialog.findViewById(C17532R$id.radio_button_local), bVar, z, spinner, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6436t1(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: f */
    public static void m24749f(Activity activity, Spinner spinner, SelectableItem selectableItem, int i, boolean z, @Nullable C6442b bVar) {
        m24748e(activity, spinner, selectableItem, i, 2, z, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m24750g(EditText editText, SelectableItem selectableItem, Activity activity, int i, RadioButton radioButton, C6442b bVar, boolean z, Spinner spinner, AppCompatDialog appCompatDialog, View view) {
        String obj = editText.getText().toString();
        if (selectableItem.mo27837X0().findLocalVariableByName(obj) != null) {
            m24753j(activity);
            return;
        }
        MacroDroidVariable macroDroidVariable = new MacroDroidVariable(i, obj, radioButton.isChecked());
        macroDroidVariable.mo27761i0(false);
        selectableItem.mo27835S(macroDroidVariable);
        if (bVar != null) {
            bVar.mo25850a(macroDroidVariable);
        } else {
            List<MacroDroidVariable> p1 = selectableItem.mo27860p1(i);
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add(0, activity.getString(C17541R$string.none));
            }
            int i2 = 0;
            int i3 = 0;
            for (MacroDroidVariable next : p1) {
                if (obj.equals(next.getName())) {
                    i2 = i3 + (z ? 1 : 0);
                }
                arrayList.add(next.getName());
                i3++;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(activity, C17535R$layout.simple_spinner_item, arrayList);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
            spinner.setSelection(i2, false);
        }
        appCompatDialog.dismiss();
    }

    /* renamed from: j */
    private static void m24753j(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C17542R$style.Theme_App_Dialog_Variables);
        builder.setTitle((int) C17541R$string.variable_creation_failed);
        builder.setMessage((int) C17541R$string.variable_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C6423r1.f15046a);
        builder.show();
    }
}
