package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6378f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p128m0.C7813p;
import p148q0.C8151a;
import p187x0.C10351d;

public class ClearAppDataAction extends Action implements C4049q.C4050a, C2224m {
    public static final Parcelable.Creator<ClearAppDataAction> CREATOR = new C2352c();
    private static final int OPTION_CLEAR_BY_PACKAGE_NAME = 1;
    private static final int OPTION_LAUNCH_BY_APP_CHOOSER = 0;
    private String clearByPackageName;
    private ArrayList<String> m_applicationNameList;
    private ArrayList<String> m_packageNameList;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.ClearAppDataAction$a */
    class C2350a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7161a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f7162b;

        C2350a(C10351d dVar, CheckBox checkBox) {
            this.f7161a = dVar;
            this.f7162b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f7161a.getFilter().mo41019a(str, this.f7162b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearAppDataAction$b */
    class C2351b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7164a;

        /* renamed from: c */
        final /* synthetic */ EditText f7165c;

        C2351b(Button button, EditText editText) {
            this.f7164a = button;
            this.f7165c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7164a.setEnabled(this.f7165c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearAppDataAction$c */
    class C2352c implements Parcelable.Creator<ClearAppDataAction> {
        C2352c() {
        }

        /* renamed from: a */
        public ClearAppDataAction createFromParcel(Parcel parcel) {
            return new ClearAppDataAction(parcel, (C2350a) null);
        }

        /* renamed from: b */
        public ClearAppDataAction[] newArray(int i) {
            return new ClearAppDataAction[i];
        }
    }

    /* synthetic */ ClearAppDataAction(Parcel parcel, C2350a aVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private void m9958q3(List<C4013g> list) {
        boolean z;
        List<C4013g> b = C6378f.m24625b(list, this.m_packageNameList);
        ArrayList arrayList = new ArrayList(b.size());
        for (int i = 0; i < b.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.m_packageNameList.size()) {
                    z = false;
                    break;
                } else if (this.m_packageNameList.get(i2).equals(b.get(i).f10397b)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            arrayList.add(Boolean.valueOf(z));
        }
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
        appCompatDialog.setTitle((int) C17541R$string.select_applications);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.non_launchable_checkbox);
        SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.include_exclude_options)).setVisibility(0);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
        checkBox.setVisibility(0);
        C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
        ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
        dVar.getFilter().mo41019a("", false);
        checkBox.setOnCheckedChangeListener(new C3130i1(dVar, searchView));
        searchView.setOnQueryTextListener(new C2350a(dVar, checkBox));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C2988d1(appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3102h1(this, dVar, appCompatDialog));
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: r3 */
    private String[] m9959r3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_application), SelectableItem.m15535j1(C17541R$string.action_launch_activity_option_enter_package_name)};
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m9962u3(C10351d dVar, AppCompatDialog appCompatDialog, View view) {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        List<C4013g> g = dVar.mo41012g();
        int i = 0;
        boolean z = false;
        while (i < g.size()) {
            C4013g gVar = g.get(i);
            this.m_packageNameList.add(gVar.f10397b);
            this.m_applicationNameList.add(gVar.f10396a);
            i++;
            z = true;
        }
        if (z) {
            appCompatDialog.dismiss();
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m9963v3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.dismiss();
        this.clearByPackageName = editText.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m9965x3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m9966y3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: z3 */
    private void m9967z3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_package_name);
        appCompatDialog.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_launch_activity_option_enter_package_name));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!j0.getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.packageText);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magicTextButton);
        String str = this.clearByPackageName;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(this.clearByPackageName.length());
        }
        if (editText.getText().length() > 0) {
            button.setEnabled(true);
        }
        editText.addTextChangedListener(new C2351b(button, editText));
        button.setOnClickListener(new C3074g1(this, appCompatDialog, editText));
        button2.setOnClickListener(new C3017e1(appCompatDialog));
        button3.setOnClickListener(new C3046f1(this, j0, new C3158j1(editText)));
        appCompatDialog.show();
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            m9958q3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.clearByPackageName};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.clearByPackageName = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.option == 1) {
            return this.clearByPackageName;
        }
        return this.m_applicationNameList.toString().replace("[", "").replace("]", "");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7813p.m32647u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.option == 1) {
            String t0 = C4023j0.m15760t0(mo27827K0(), this.clearByPackageName, triggerContextInfo, mo27837X0());
            C4061t1.m15947B0(new String[]{"pm clear " + t0});
            return;
        }
        Iterator<String> it = this.m_packageNameList.iterator();
        while (it.hasNext()) {
            C4061t1.m15947B0(new String[]{"pm clear " + it.next()});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9959r3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.option == 0) {
            new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
            return;
        }
        m9967z3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.option);
        parcel.writeString(this.clearByPackageName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public ClearAppDataAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ClearAppDataAction() {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private ClearAppDataAction(Parcel parcel) {
        super(parcel);
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.option = parcel.readInt();
        this.clearByPackageName = parcel.readString();
    }
}
