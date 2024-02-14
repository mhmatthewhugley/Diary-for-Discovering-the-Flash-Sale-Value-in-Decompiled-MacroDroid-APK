package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.ActivityManager;
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
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
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
import p128m0.C7839s1;
import p148q0.C8151a;
import p187x0.C10351d;

public class KillBackgroundAppAction extends Action implements C4049q.C4050a, C2224m {
    private static final String ALL_APPLICATIONS_NAME = ("[" + SelectableItem.m15535j1(C17541R$string.all_applications) + "]");
    private static final String ALL_APPLICATIONS_PACKAGE = "all.applications";
    public static final Parcelable.Creator<KillBackgroundAppAction> CREATOR = new C2512d();
    private static final int OPTION_KILL_ALL_APPS = 1;
    private static final int OPTION_KILL_BY_APP_CHOOSER = 0;
    private static final int OPTION_LAUNCH_BY_PACKAGE_NAME = 2;
    private static final String[] s_options = {SelectableItem.m15535j1(C17541R$string.select_applications), SelectableItem.m15535j1(C17541R$string.all_applications), SelectableItem.m15535j1(C17541R$string.action_launch_activity_option_enter_package_name)};
    private String killByPackageName;
    private String m_applicationName;
    private ArrayList<String> m_applicationNameList;
    private ArrayList<String> m_packageNameList;
    private String m_packageToClose;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.KillBackgroundAppAction$a */
    class C2509a extends Thread {

        /* renamed from: a */
        final /* synthetic */ ActivityManager f7330a;

        C2509a(ActivityManager activityManager) {
            this.f7330a = activityManager;
        }

        public void run() {
            String str;
            for (C4013g next : C4061t1.m15962J(KillBackgroundAppAction.this.mo27827K0(), false)) {
                if (!(next == null || (str = next.f10397b) == null)) {
                    try {
                        this.f7330a.killBackgroundProcesses(str);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.KillBackgroundAppAction$b */
    class C2510b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7332a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f7333b;

        C2510b(C10351d dVar, CheckBox checkBox) {
            this.f7332a = dVar;
            this.f7333b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f7332a.getFilter().mo41019a(str, this.f7333b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.KillBackgroundAppAction$c */
    class C2511c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7335a;

        /* renamed from: c */
        final /* synthetic */ EditText f7336c;

        C2511c(Button button, EditText editText) {
            this.f7335a = button;
            this.f7336c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7335a.setEnabled(this.f7336c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.KillBackgroundAppAction$d */
    class C2512d implements Parcelable.Creator<KillBackgroundAppAction> {
        C2512d() {
        }

        /* renamed from: a */
        public KillBackgroundAppAction createFromParcel(Parcel parcel) {
            return new KillBackgroundAppAction(parcel, (C2509a) null);
        }

        /* renamed from: b */
        public KillBackgroundAppAction[] newArray(int i) {
            return new KillBackgroundAppAction[i];
        }
    }

    /* synthetic */ KillBackgroundAppAction(Parcel parcel, C2509a aVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private void m11156q3(List<C4013g> list) {
        boolean z;
        if (mo27836X()) {
            String str = this.m_packageToClose;
            if (!(str == null || this.m_applicationName == null)) {
                this.m_packageNameList.add(str);
                this.m_applicationNameList.add(this.m_applicationName);
            }
            List<C4013g> b = C6378f.m24625b(list, this.m_packageNameList);
            this.m_packageToClose = null;
            this.m_applicationName = null;
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
            ((RadioGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
            C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
            ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
            dVar.getFilter().mo41019a("", false);
            checkBox.setOnCheckedChangeListener(new C3473t7(dVar, searchView));
            searchView.setOnQueryTextListener(new C2510b(dVar, checkBox));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3334p7(appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3419s7(this, dVar, appCompatDialog));
            appCompatDialog.show();
            appCompatDialog.getWindow().setAttributes(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m11159t3(C10351d dVar, AppCompatDialog appCompatDialog, View view) {
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
    /* renamed from: u3 */
    public /* synthetic */ void m11160u3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.dismiss();
        this.killByPackageName = editText.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static /* synthetic */ void m11162w3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11163x3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: y3 */
    private void m11164y3() {
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
        String str = this.killByPackageName;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(this.killByPackageName.length());
        }
        if (editText.getText().length() > 0) {
            button.setEnabled(true);
        }
        editText.addTextChangedListener(new C2511c(button, editText));
        button.setOnClickListener(new C3390r7(this, appCompatDialog, editText));
        button2.setOnClickListener(new C3304o7(appCompatDialog));
        button3.setOnClickListener(new C3362q7(this, j0, new C3509u7(editText)));
        appCompatDialog.show();
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            m11156q3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        Iterator<String> it = this.m_packageNameList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(ALL_APPLICATIONS_PACKAGE)) {
                return 1;
            }
        }
        return this.option;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.killByPackageName};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.killByPackageName = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.option == 2) {
            return this.killByPackageName;
        }
        String str = this.m_applicationName;
        if (str != null) {
            return str;
        }
        if (this.m_applicationNameList.size() > 1) {
            return this.m_applicationNameList.size() + " Apps";
        } else if (this.m_applicationNameList.size() == 1) {
            return this.m_applicationNameList.get(0);
        } else {
            return C4061t1.f10631k;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7839s1.m32771u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        ActivityManager activityManager = (ActivityManager) MacroDroidApplication.m14845u().getSystemService("activity");
        if (this.option == 2) {
            try {
                activityManager.killBackgroundProcesses(C4023j0.m15760t0(mo27827K0(), this.killByPackageName, triggerContextInfo, mo27837X0()));
            } catch (Exception unused) {
            }
        } else {
            if (this.m_packageToClose != null && this.m_packageNameList.size() == 0) {
                this.m_packageNameList.add(this.m_packageToClose);
                this.m_applicationNameList.add(this.m_applicationName);
                this.m_packageToClose = null;
                this.m_applicationName = null;
            }
            Iterator<String> it = this.m_packageNameList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!(activityManager == null || next == null)) {
                    if (next.equals(ALL_APPLICATIONS_PACKAGE)) {
                        new C2509a(activityManager).start();
                        return;
                    }
                    try {
                        activityManager.killBackgroundProcesses(next);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        this.option = mo24671D0();
        return s_options;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.option;
        if (i == 1) {
            this.m_packageNameList.clear();
            this.m_applicationNameList.clear();
            this.m_packageNameList.add(ALL_APPLICATIONS_PACKAGE);
            this.m_applicationNameList.add(ALL_APPLICATIONS_NAME);
            mo24689O1();
        } else if (i == 0) {
            this.m_packageNameList.remove(ALL_APPLICATIONS_PACKAGE);
            this.m_applicationNameList.remove(ALL_APPLICATIONS_NAME);
            new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
        } else {
            m11164y3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_packageToClose);
        parcel.writeString(this.m_applicationName);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.option);
        parcel.writeString(this.killByPackageName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public KillBackgroundAppAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private KillBackgroundAppAction() {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private KillBackgroundAppAction(Parcel parcel) {
        super(parcel);
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        this.m_packageToClose = parcel.readString();
        this.m_applicationName = parcel.readString();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.option = parcel.readInt();
        this.killByPackageName = parcel.readString();
    }
}
