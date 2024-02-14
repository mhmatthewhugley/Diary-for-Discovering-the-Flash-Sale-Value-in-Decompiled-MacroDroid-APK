package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.NotificationContextInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6378f;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p057a2.C2224m;
import p119k3.C7493e1;
import p135n1.C7967d;
import p148q0.C8151a;
import p187x0.C10351d;

public class NotificationTrigger extends Trigger implements C4049q.C4050a, C2224m {
    public static final Parcelable.Creator<NotificationTrigger> CREATOR = new C5709c();
    private static final int IGNORE_MULTIPLES_MS = 800;

    /* renamed from: d */
    public static final String f13658d = SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application);
    private boolean enableRegex;
    private transient long lastInvocation;
    private String m_applicationName;
    private ArrayList<String> m_applicationNameList;
    private boolean m_exactMatch;
    private boolean m_excludeApps;
    private boolean m_excludes;
    private boolean m_ignoreOngoing;
    private int m_option;
    private String m_packageName;
    private ArrayList<String> m_packageNameList;
    private int m_soundOption;
    private boolean m_supressMultiples;
    private String m_textContent;

    /* renamed from: com.arlosoft.macrodroid.triggers.NotificationTrigger$a */
    class C5707a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f13659a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f13660b;

        C5707a(C10351d dVar, CheckBox checkBox) {
            this.f13659a = dVar;
            this.f13660b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f13659a.getFilter().mo41019a(str, this.f13660b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.NotificationTrigger$b */
    class C5708b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13662a;

        /* renamed from: c */
        final /* synthetic */ EditText f13663c;

        C5708b(Button button, EditText editText) {
            this.f13662a = button;
            this.f13663c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13662a.setEnabled(this.f13663c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.NotificationTrigger$c */
    class C5709c implements Parcelable.Creator<NotificationTrigger> {
        C5709c() {
        }

        /* renamed from: a */
        public NotificationTrigger createFromParcel(Parcel parcel) {
            return new NotificationTrigger(parcel, (C5707a) null);
        }

        /* renamed from: b */
        public NotificationTrigger[] newArray(int i) {
            return new NotificationTrigger[i];
        }
    }

    /* synthetic */ NotificationTrigger(Parcel parcel, C5707a aVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private String[] m22813A3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_notification_received), SelectableItem.m15535j1(C17541R$string.trigger_notification_cleared)};
    }

    /* renamed from: D1 */
    private void m22814D1() {
        this.m_applicationName = null;
        this.m_packageName = null;
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        this.m_ignoreOngoing = true;
        this.m_supressMultiples = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void m22817K3(C10351d dVar, AppCompatDialog appCompatDialog, RadioButton radioButton, View view) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<C4013g> g = dVar.mo41012g();
        int i = 0;
        boolean z = false;
        while (i < g.size()) {
            C4013g gVar = g.get(i);
            arrayList.add(gVar.f10397b);
            arrayList2.add(gVar.f10396a);
            i++;
            z = true;
        }
        if (z) {
            appCompatDialog.dismiss();
            m22843v3(arrayList, arrayList2, radioButton.isChecked());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void m22818L3(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            arrayList.addAll(this.m_packageNameList);
            arrayList2.addAll(this.m_applicationNameList);
            String str = f13658d;
            arrayList.removeAll(Collections.singletonList(str));
            arrayList2.removeAll(Collections.singletonList(str));
            arrayList.removeAll(Collections.singletonList("Any Application"));
            arrayList2.removeAll(Collections.singletonList("Any Application"));
            m22828V3();
            return;
        }
        arrayList.add("Any Application");
        arrayList2.add("Any Application");
        m22843v3(arrayList, arrayList2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m22819M3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void m22820N3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public static /* synthetic */ void m22821O3(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(!z);
        boolean z2 = true;
        if (!z) {
            if (editText.getText().length() <= 0) {
                z2 = false;
            }
            button.setEnabled(z2);
            return;
        }
        button.setEnabled(true);
        radioButton.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public static /* synthetic */ void m22822P3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static /* synthetic */ void m22823Q3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public static /* synthetic */ void m22824R3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void m22825S3(RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, CheckBox checkBox, boolean z, ArrayList arrayList, ArrayList arrayList2, CheckBox checkBox2, AppCompatSpinner appCompatSpinner, CheckBox checkBox3, AppCompatDialog appCompatDialog, View view) {
        if (radioButton.isChecked()) {
            this.m_textContent = "";
            this.m_excludes = false;
        } else {
            this.m_textContent = editText.getText().toString().trim();
            if (radioButton2.isChecked()) {
                this.m_excludes = true;
            } else {
                this.m_exactMatch = radioButton3.isChecked();
                this.m_excludes = false;
            }
        }
        this.m_supressMultiples = checkBox.isChecked();
        this.m_excludeApps = z;
        this.m_packageNameList = arrayList;
        this.m_applicationNameList = arrayList2;
        this.m_ignoreOngoing = checkBox2.isChecked();
        this.m_soundOption = appCompatSpinner.getSelectedItemPosition();
        this.enableRegex = checkBox3.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public static /* synthetic */ void m22827U3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: V3 */
    private void m22828V3() {
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.trigger_accent)).execute((Object[]) null);
    }

    /* renamed from: u3 */
    private void m22842u3() {
        int i = (this.m_applicationNameList.size() <= 0 || (!this.m_packageNameList.contains(f13658d) && !this.m_packageNameList.contains("Any Application"))) ? 0 : 1;
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m22844w3(), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6087s5(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C6030o5(this));
    }

    /* renamed from: v3 */
    private void m22843v3(ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z) {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.notification_text_dialog);
        appCompatDialog.setTitle((CharSequence) m22813A3()[this.m_option]);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_text_content);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_any_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_matches_radio_button);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_contains_radio_button);
        RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_excludes_radio_button);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_exclude_ongoing);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_supress_multiples);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.sound_options_container);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) appCompatDialog.findViewById(C17532R$id.sound_option_spinner);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        int i = this.m_option;
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        checkBox2.setVisibility(i == 0 ? 0 : 8);
        checkBox2.setChecked(this.m_ignoreOngoing);
        checkBox3.setVisibility(this.m_option == 0 ? 0 : 8);
        checkBox3.setChecked(this.m_supressMultiples);
        checkBox.setChecked(this.enableRegex);
        viewGroup.setVisibility(this.m_option == 0 ? 0 : 8);
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, new String[]{SelectableItem.m15535j1(C17541R$string.notification_sound_any_value), SelectableItem.m15535j1(C17541R$string.has_sound), SelectableItem.m15535j1(C17541R$string.has_no_sound)});
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        appCompatSpinner.setSelection(this.m_soundOption, false);
        editText.setEnabled(false);
        String str = this.m_textContent;
        if (str == null || str.length() <= 0) {
            radioButton.setChecked(true);
        } else {
            radioButton.setChecked(false);
            editText.setText(this.m_textContent);
            editText.setSelection(editText.length());
            editText.setEnabled(true);
            if (this.m_excludes) {
                radioButton4.setChecked(true);
            } else if (this.m_exactMatch) {
                radioButton2.setChecked(true);
            } else {
                radioButton3.setChecked(true);
            }
        }
        radioButton.setOnCheckedChangeListener(new C6199y5(editText, button, radioButton2, radioButton3, radioButton4));
        radioButton2.setOnCheckedChangeListener(new C5812a6(radioButton, radioButton3, radioButton4));
        radioButton3.setOnCheckedChangeListener(new C6211z5(radioButton2, radioButton, radioButton4));
        radioButton4.setOnCheckedChangeListener(new C6042p5(radioButton2, radioButton3, radioButton));
        editText.addTextChangedListener(new C5708b(button, editText));
        C6175w5 w5Var = r0;
        C6175w5 w5Var2 = new C6175w5(this, radioButton, editText, radioButton4, radioButton2, checkBox3, z, arrayList, arrayList2, checkBox2, appCompatSpinner, checkBox, appCompatDialog);
        button.setOnClickListener(w5Var);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        button3.setOnClickListener(new C6151u5(appCompatDialog2));
        button2.setOnClickListener(new C6163v5(this, j0, new C6066r5(editText)));
        appCompatDialog2.show();
    }

    /* renamed from: w3 */
    private String[] m22844w3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_applications), SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application)};
    }

    /* renamed from: y3 */
    private String m22845y3(boolean z) {
        String str = "!";
        if (this.m_packageNameList.contains(f13658d) || this.m_packageNameList.contains("Any Application")) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo24738G0());
            sb.append(" (");
            if (!this.m_excludeApps) {
                str = "";
            }
            sb.append(str);
            sb.append(SelectableItem.m15535j1(C17541R$string.all_applications));
            sb.append(")");
            return sb.toString();
        } else if (this.m_applicationNameList.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo24738G0());
            sb2.append(" (");
            if (!this.m_excludeApps) {
                str = "";
            }
            sb2.append(str);
            sb2.append(C6413o0.m24694c(this.m_applicationNameList.toString(), z ? 150 : 15));
            sb2.append(")");
            return sb2.toString();
        } else {
            return mo24738G0() + " (" + SelectableItem.m15535j1(C17541R$string.select_applications) + ")";
        }
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            mo31376t3(list);
        }
    }

    /* renamed from: B3 */
    public List<String> mo31367B3() {
        String str;
        if (this.m_packageNameList.size() == 0 && (str = this.m_packageName) != null) {
            this.m_packageNameList.add(str);
        }
        return this.m_packageNameList;
    }

    /* renamed from: C3 */
    public int mo31368C3() {
        return this.m_soundOption;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: D3 */
    public String mo31369D3() {
        return this.m_textContent;
    }

    /* renamed from: E3 */
    public boolean mo31370E3() {
        return this.enableRegex;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_textContent};
    }

    /* renamed from: F3 */
    public boolean mo31371F3() {
        return this.m_exactMatch;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m22813A3()[this.m_option];
    }

    /* renamed from: G3 */
    public boolean mo31372G3() {
        return this.m_excludeApps;
    }

    /* renamed from: H3 */
    public boolean mo31373H3() {
        return this.m_excludes;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_textContent = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        if (this.m_applicationNameList.size() == 0 && (str = this.m_applicationName) != null) {
            this.m_applicationNameList.add(str);
        }
        if (this.m_applicationNameList.size() <= 0) {
            return SelectableItem.m15535j1(C17541R$string.select_applications);
        }
        String str2 = "!";
        if (this.m_packageNameList.contains(f13658d) || this.m_packageNameList.contains("Any Application")) {
            StringBuilder sb = new StringBuilder();
            if (!this.m_excludeApps) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(SelectableItem.m15535j1(C17541R$string.all_applications));
            return sb.toString();
        }
        String replace = this.m_applicationNameList.toString().replace("[", "").replace("]", "");
        String str3 = this.m_textContent;
        String str4 = "(";
        if (str3 == null || str3.length() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_any_content));
            sb2.append(" ");
            if (!this.m_excludeApps) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(str4);
            sb2.append(replace);
            sb2.append(")");
            return sb2.toString();
        } else if (this.m_excludes) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_excludes));
            sb3.append(" ");
            sb3.append(this.m_textContent);
            sb3.append(" ");
            if (this.m_excludeApps) {
                str4 = "!(";
            }
            sb3.append(str4);
            sb3.append(replace);
            sb3.append(")");
            return sb3.toString();
        } else if (this.m_exactMatch) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_matches));
            sb4.append(" ");
            sb4.append(this.m_textContent);
            sb4.append(" ");
            if (this.m_excludeApps) {
                str4 = "!(";
            }
            sb4.append(str4);
            sb4.append(replace);
            sb4.append(")");
            return sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_contains));
            sb5.append(" ");
            sb5.append(this.m_textContent);
            sb5.append(" ");
            if (this.m_excludeApps) {
                str4 = "!(";
            }
            sb5.append(str4);
            sb5.append(replace);
            sb5.append(")");
            return sb5.toString();
        }
    }

    /* renamed from: R2 */
    public boolean mo31374R2() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.m_supressMultiples || this.lastInvocation + 800 <= currentTimeMillis) {
            return super.mo31374R2();
        }
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7493e1.m31154u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return m22845y3(false);
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* renamed from: W3 */
    public void mo31375W3() {
        this.lastInvocation = System.currentTimeMillis();
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, new NotificationContextInfo("test body", "test app name", "test app package", "test app title", "test app text", "test big text", "test app lines", "test action names", "test subtitle"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22813A3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return m22845y3(true);
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public void mo31376t3(List<C4013g> list) {
        String str = this.m_packageName;
        if (!(str == null || this.m_applicationName == null)) {
            this.m_packageNameList.add(str);
            this.m_applicationNameList.add(this.m_applicationName);
        }
        this.m_packageName = null;
        this.m_applicationName = null;
        List<C4013g> b = C6378f.m24625b(list, this.m_packageNameList);
        ArrayList arrayList = new ArrayList(b.size());
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < b.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.m_packageNameList.size()) {
                        z = false;
                        break;
                    } else if (this.m_packageNameList.get(i2).equals(b.get(i).f10397b)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                arrayList.add(Boolean.valueOf(z));
                i++;
            } else {
                Activity j0 = mo27850j0();
                AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
                appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
                appCompatDialog.setTitle((int) C17541R$string.select_applications);
                RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.radio_exclude);
                CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.non_launchable_checkbox);
                SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
                ((ViewGroup) appCompatDialog.findViewById(C17532R$id.include_exclude_options)).setVisibility(0);
                ((RadioButton) appCompatDialog.findViewById(C17532R$id.radio_include)).setChecked(true ^ this.m_excludeApps);
                radioButton.setChecked(this.m_excludeApps);
                C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
                ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
                dVar.getFilter().mo41019a("", false);
                checkBox.setOnCheckedChangeListener(new C6054q5(dVar, searchView));
                searchView.setOnQueryTextListener(new C5707a(dVar, checkBox));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6139t5(appCompatDialog));
                ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C6187x5(this, dVar, appCompatDialog, radioButton));
                appCompatDialog.show();
                appCompatDialog.getWindow().setAttributes(layoutParams);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m22842u3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_textContent);
        parcel.writeInt(this.m_exactMatch ? 1 : 0);
        parcel.writeString(this.m_applicationName);
        parcel.writeString(this.m_packageName);
        parcel.writeInt(this.m_excludes ? 1 : 0);
        parcel.writeInt(this.m_ignoreOngoing ? 1 : 0);
        parcel.writeInt(this.m_option);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.m_excludeApps ? 1 : 0);
        parcel.writeInt(this.m_soundOption);
        parcel.writeInt(this.m_supressMultiples ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    /* renamed from: x3 */
    public boolean mo31377x3() {
        return this.m_ignoreOngoing;
    }

    /* renamed from: z3 */
    public int mo31378z3() {
        return this.m_option;
    }

    public NotificationTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public NotificationTrigger() {
        m22814D1();
    }

    private NotificationTrigger(Parcel parcel) {
        super(parcel);
        m22814D1();
        this.m_textContent = parcel.readString();
        boolean z = true;
        this.m_exactMatch = parcel.readInt() != 0;
        this.m_applicationName = parcel.readString();
        this.m_packageName = parcel.readString();
        this.m_excludes = parcel.readInt() != 0;
        this.m_ignoreOngoing = parcel.readInt() != 0;
        this.m_option = parcel.readInt();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.m_excludeApps = parcel.readInt() != 0;
        this.m_soundOption = parcel.readInt();
        this.m_supressMultiples = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() == 0 ? false : z;
    }
}
