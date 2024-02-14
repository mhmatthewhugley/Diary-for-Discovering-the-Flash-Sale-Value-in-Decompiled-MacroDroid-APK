package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6378f;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p057a2.C2224m;
import p123l1.C7633n0;
import p148q0.C8151a;
import p187x0.C10351d;

public class NotificationPresentConstraint extends Constraint implements C4049q.C4050a, C2224m {
    private static final String ALL_APPLICATIONS_PACKAGE = "allApplications";
    public static final Parcelable.Creator<NotificationPresentConstraint> CREATOR = new C4176c();
    private static final int OPTION_NOT_PRESENT = 1;
    private static final int OPTION_PRESENT = 0;
    private boolean enableRegex;
    private boolean ignoreOngoing;
    private ArrayList<String> m_applicationNameList;
    private boolean m_exactMatch;
    private boolean m_excludes;
    private int m_excludesApps;
    private int m_option;
    private ArrayList<String> m_packageNameList;
    private String m_textContent;

    /* renamed from: com.arlosoft.macrodroid.constraint.NotificationPresentConstraint$a */
    class C4174a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f10744a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f10745b;

        C4174a(C10351d dVar, CheckBox checkBox) {
            this.f10744a = dVar;
            this.f10745b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f10744a.getFilter().mo41019a(str, this.f10745b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.NotificationPresentConstraint$b */
    class C4175b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10747a;

        /* renamed from: c */
        final /* synthetic */ EditText f10748c;

        C4175b(Button button, EditText editText) {
            this.f10747a = button;
            this.f10748c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f10747a.setEnabled(this.f10748c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.NotificationPresentConstraint$c */
    class C4176c implements Parcelable.Creator<NotificationPresentConstraint> {
        C4176c() {
        }

        /* renamed from: a */
        public NotificationPresentConstraint createFromParcel(Parcel parcel) {
            return new NotificationPresentConstraint(parcel, (C4174a) null);
        }

        /* renamed from: b */
        public NotificationPresentConstraint[] newArray(int i) {
            return new NotificationPresentConstraint[i];
        }
    }

    /* synthetic */ NotificationPresentConstraint(Parcel parcel, C4174a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m16855B3(C10351d dVar, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
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
            this.m_excludesApps = radioButton.isChecked() ? 1 : 0;
            appCompatDialog.dismiss();
            m16881v3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m16856C3(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            this.m_packageNameList.removeAll(Collections.singletonList(ALL_APPLICATIONS_PACKAGE));
            this.m_applicationNameList.removeAll(Collections.singletonList(SelectableItem.m15535j1(C17541R$string.all_applications)));
            m16866M3();
            return;
        }
        this.m_packageNameList.clear();
        this.m_applicationNameList.clear();
        this.m_packageNameList.add(ALL_APPLICATIONS_PACKAGE);
        this.m_applicationNameList.add(SelectableItem.m15535j1(C17541R$string.all_applications));
        m16881v3();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m16857D3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m16858E3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Constraint_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m16859F3(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
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
    /* renamed from: G3 */
    public static /* synthetic */ void m16860G3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static /* synthetic */ void m16861H3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static /* synthetic */ void m16862I3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m16863J3(RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, View view) {
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
        this.enableRegex = checkBox.isChecked();
        this.ignoreOngoing = checkBox2.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static /* synthetic */ void m16865L3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: M3 */
    private void m16866M3() {
        new C4049q(this, mo27850j0(), true, false, mo28116a3()).execute((Object[]) null);
    }

    /* renamed from: u3 */
    private void m16880u3() {
        int i = (this.m_applicationNameList.size() <= 0 || !this.m_packageNameList.contains(ALL_APPLICATIONS_PACKAGE)) ? 0 : 1;
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m16882w3(), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4284l2(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C4264h2(this));
    }

    /* renamed from: v3 */
    private void m16881v3() {
        int i;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.notification_text_dialog);
        appCompatDialog.setTitle((CharSequence) m16884y3()[this.m_option]);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_text_content);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_any_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_matches_radio_button);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_contains_radio_button);
        RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_excludes_radio_button);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_exclude_ongoing);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.notification_text_dialog_supress_multiples);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        if (this.m_option == 1) {
            i = 8;
            radioButton4.setVisibility(8);
            if (this.m_excludes) {
                this.m_excludes = false;
            }
        } else {
            i = 8;
        }
        checkBox.setChecked(this.enableRegex);
        checkBox3.setVisibility(i);
        editText.setEnabled(false);
        checkBox2.setChecked(this.ignoreOngoing);
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
        Activity activity = j0;
        C4314r2 r2Var = r1;
        CheckBox checkBox4 = checkBox;
        C4314r2 r2Var2 = new C4314r2(editText, button, radioButton2, radioButton3, radioButton4);
        radioButton.setOnCheckedChangeListener(r2Var);
        radioButton2.setOnCheckedChangeListener(new C4319s2(radioButton, radioButton3, radioButton4));
        radioButton3.setOnCheckedChangeListener(new C4324t2(radioButton2, radioButton, radioButton4));
        radioButton4.setOnCheckedChangeListener(new C4269i2(radioButton2, radioButton3, radioButton));
        editText.addTextChangedListener(new C4175b(button, editText));
        button.setOnClickListener(new C4304p2(this, radioButton, editText, radioButton4, radioButton2, checkBox4, checkBox2, appCompatDialog));
        button2.setOnClickListener(new C4294n2(appCompatDialog));
        button3.setOnClickListener(new C4299o2(this, activity, new C4279k2(editText)));
        appCompatDialog.show();
    }

    /* renamed from: w3 */
    private String[] m16882w3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_applications), SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application)};
    }

    /* renamed from: x3 */
    private boolean m16883x3() {
        int i = this.m_excludesApps;
        if (i != -1) {
            return i != 0;
        }
        return this.m_excludes;
    }

    /* renamed from: y3 */
    private String[] m16884y3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.constraint_notification_present), SelectableItem.m15535j1(C17541R$string.constraint_notification_not_present)};
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            mo28260t3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_textContent};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m16884y3()[this.m_option];
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_textContent = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return this.m_applicationNameList.size() != 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        if (this.m_applicationNameList.size() <= 0) {
            return SelectableItem.m15535j1(C17541R$string.select_applications);
        }
        if (this.m_packageNameList.contains(ALL_APPLICATIONS_PACKAGE)) {
            str = SelectableItem.m15535j1(C17541R$string.all_applications);
        } else {
            str = this.m_applicationNameList.toString().replace("[", "").replace("]", "");
        }
        String str2 = this.m_textContent;
        String str3 = " !(";
        if (str2 == null || str2.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_any_content));
            if (!m16883x3()) {
                str3 = " (";
            }
            sb.append(str3);
            sb.append(str);
            sb.append(")");
            return sb.toString();
        } else if (this.m_excludes) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_excludes));
            sb2.append(" ");
            sb2.append(this.m_textContent);
            if (!m16883x3()) {
                str3 = " (";
            }
            sb2.append(str3);
            sb2.append(str);
            sb2.append(")");
            return sb2.toString();
        } else if (this.m_exactMatch) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_matches));
            sb3.append(" ");
            sb3.append(this.m_textContent);
            if (!m16883x3()) {
                str3 = " (";
            }
            sb3.append(str3);
            sb3.append(str);
            sb3.append(")");
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(SelectableItem.m15535j1(C17541R$string.trigger_notification_contains));
            sb4.append(" ");
            sb4.append(this.m_textContent);
            if (!m16883x3()) {
                str3 = " (";
            }
            sb4.append(str3);
            sb4.append(str);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        if (r8.m_option != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo r9) {
        /*
            r8 = this;
            boolean r0 = r8.ignoreOngoing
            r1 = 0
            java.util.List r0 = com.arlosoft.macrodroid.triggers.services.NotificationService.m24181f(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x00d8
            java.lang.Object r2 = r0.next()
            com.arlosoft.macrodroid.triggers.services.NotificationService$d r2 = (com.arlosoft.macrodroid.triggers.services.NotificationService.C6109d) r2
            java.util.ArrayList<java.lang.String> r4 = r8.m_packageNameList
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x000b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "allApplications"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x003a
            java.lang.String r6 = r2.f14515b
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x001e
        L_0x003a:
            java.lang.String r5 = r8.m_textContent
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0048
            int r9 = r8.m_option
            if (r9 != 0) goto L_0x0047
            r1 = 1
        L_0x0047:
            return r1
        L_0x0048:
            android.content.Context r5 = r8.mo27827K0()
            java.lang.String r6 = r8.m_textContent
            com.arlosoft.macrodroid.macro.Macro r7 = r8.mo27837X0()
            java.lang.String r5 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r5, r6, r9, r7)
            java.lang.String r6 = r5.toLowerCase()
            boolean r7 = r8.enableRegex
            java.lang.String r6 = com.arlosoft.macrodroid.utils.C6460y1.m24791c(r6, r7)
            java.lang.String r5 = r5.toLowerCase()
            boolean r7 = r8.enableRegex
            java.lang.String r5 = com.arlosoft.macrodroid.utils.C6460y1.m24790b(r5, r7)
            boolean r7 = r8.m_excludes
            if (r7 == 0) goto L_0x0090
            java.lang.String r6 = r2.f14518e
            java.lang.String r6 = r6.toLowerCase()
            boolean r7 = r8.enableRegex
            boolean r6 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r5, r7)
            if (r6 != 0) goto L_0x001e
            java.lang.String r6 = r2.f14519f
            java.lang.String r6 = r6.toLowerCase()
            boolean r7 = r8.enableRegex
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r5, r7)
            if (r5 != 0) goto L_0x001e
            int r9 = r8.m_option
            if (r9 != 0) goto L_0x008f
            r1 = 1
        L_0x008f:
            return r1
        L_0x0090:
            boolean r7 = r8.m_exactMatch
            if (r7 == 0) goto L_0x00b6
            java.lang.String r5 = r2.f14518e
            java.lang.String r5 = r5.toLowerCase()
            boolean r7 = r8.enableRegex
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r6, r7)
            if (r5 != 0) goto L_0x00b0
            java.lang.String r5 = r2.f14519f
            java.lang.String r5 = r5.toLowerCase()
            boolean r7 = r8.enableRegex
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r5, r6, r7)
            if (r5 == 0) goto L_0x001e
        L_0x00b0:
            int r9 = r8.m_option
            if (r9 != 0) goto L_0x00b5
            r1 = 1
        L_0x00b5:
            return r1
        L_0x00b6:
            java.lang.String r6 = r2.f14518e
            java.lang.String r6 = r6.toLowerCase()
            boolean r7 = r8.enableRegex
            boolean r6 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r5, r7)
            if (r6 != 0) goto L_0x00d2
            java.lang.String r6 = r2.f14519f
            java.lang.String r6 = r6.toLowerCase()
            boolean r7 = r8.enableRegex
            boolean r5 = com.arlosoft.macrodroid.utils.C6460y1.m24792d(r6, r5, r7)
            if (r5 == 0) goto L_0x001e
        L_0x00d2:
            int r9 = r8.m_option
            if (r9 != 0) goto L_0x00d7
            r1 = 1
        L_0x00d7:
            return r1
        L_0x00d8:
            int r9 = r8.m_option
            if (r9 != r3) goto L_0x00dd
            r1 = 1
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.NotificationPresentConstraint.mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7633n0.m31794u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16884y3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public void mo28260t3(List<C4013g> list) {
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
                ((RadioButton) appCompatDialog.findViewById(C17532R$id.radio_include)).setChecked(true ^ m16883x3());
                radioButton.setChecked(m16883x3());
                C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
                ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
                dVar.getFilter().mo41019a("", false);
                checkBox.setOnCheckedChangeListener(new C4274j2(dVar, searchView));
                searchView.setOnQueryTextListener(new C4174a(dVar, checkBox));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C4289m2(appCompatDialog));
                ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C4309q2(this, dVar, radioButton, appCompatDialog));
                appCompatDialog.show();
                appCompatDialog.getWindow().setAttributes(layoutParams);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m16880u3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_textContent);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.m_exactMatch ? 1 : 0);
        parcel.writeInt(this.m_excludes ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeInt(this.m_excludesApps);
        parcel.writeInt(this.ignoreOngoing ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public NotificationPresentConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private NotificationPresentConstraint() {
        this.m_excludesApps = -1;
        this.ignoreOngoing = false;
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        this.m_option = 0;
    }

    private NotificationPresentConstraint(Parcel parcel) {
        super(parcel);
        this.m_excludesApps = -1;
        boolean z = false;
        this.ignoreOngoing = false;
        this.m_option = parcel.readInt();
        this.m_textContent = parcel.readString();
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.m_exactMatch = parcel.readInt() != 0;
        this.m_excludes = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() != 0;
        this.m_excludesApps = parcel.readInt();
        this.ignoreOngoing = parcel.readInt() != 0 ? true : z;
    }
}
