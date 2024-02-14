package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Build;
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
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
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
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.NotificationService;
import com.arlosoft.macrodroid.utils.C6378f;
import com.arlosoft.macrodroid.utils.C6460y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p128m0.C7844t;
import p148q0.C8151a;
import p187x0.C10351d;

public class ClearNotificationsAction extends Action implements C4049q.C4050a, C2224m {
    public static final Parcelable.Creator<ClearNotificationsAction> CREATOR = new C2363c();
    private static final int OPTION_CLEAR_ALL = 0;
    private static final int OPTION_CONTAINS = 2;
    private static final int OPTION_EXACT_MATCH = 1;
    private static final int OPTION_EXCLUDES = 3;
    private static final int OPTION_MATCH_ALL = 0;
    private static final int OPTION_SELECT_APPS = 1;
    private boolean enableRegex;
    private int m_ageInSeconds;
    private ArrayList<String> m_applicationNameList;
    private boolean m_clearPersistent;
    private boolean m_excludes;
    private int m_matchOption;
    private String m_matchText;
    private int m_option;
    private ArrayList<String> m_packageNameList;

    /* renamed from: com.arlosoft.macrodroid.action.ClearNotificationsAction$a */
    class C2361a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7175a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f7176b;

        C2361a(C10351d dVar, CheckBox checkBox) {
            this.f7175a = dVar;
            this.f7176b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f7175a.getFilter().mo41019a(str, this.f7176b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearNotificationsAction$b */
    class C2362b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7178a;

        /* renamed from: c */
        final /* synthetic */ EditText f7179c;

        C2362b(Button button, EditText editText) {
            this.f7178a = button;
            this.f7179c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7178a.setEnabled(this.f7179c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearNotificationsAction$c */
    class C2363c implements Parcelable.Creator<ClearNotificationsAction> {
        C2363c() {
        }

        /* renamed from: a */
        public ClearNotificationsAction createFromParcel(Parcel parcel) {
            return new ClearNotificationsAction(parcel, (C2361a) null);
        }

        /* renamed from: b */
        public ClearNotificationsAction[] newArray(int i) {
            return new ClearNotificationsAction[i];
        }
    }

    /* synthetic */ ClearNotificationsAction(Parcel parcel, C2361a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m10053A3(C10351d dVar, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
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
            this.m_excludes = radioButton.isChecked();
            appCompatDialog.dismiss();
            m10075w3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m10054B3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static /* synthetic */ void m10055C3(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
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
    /* renamed from: D3 */
    public static /* synthetic */ void m10056D3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m10057E3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m10058F3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m10059G3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, CheckBox checkBox, EditText editText, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, CheckBox checkBox2, AppCompatDialog appCompatDialog, View view) {
        if (radioButton.isChecked()) {
            this.m_matchOption = 0;
        } else if (radioButton2.isChecked()) {
            this.m_matchOption = 1;
        } else if (radioButton3.isChecked()) {
            this.m_matchOption = 2;
        } else if (radioButton4.isChecked()) {
            this.m_matchOption = 3;
        }
        this.m_clearPersistent = !checkBox.isChecked();
        this.m_matchText = editText.getText().toString();
        this.m_ageInSeconds = numberPicker.getValue() + (numberPicker2.getValue() * 60) + (numberPicker3.getValue() * 3600);
        this.enableRegex = checkBox2.isChecked();
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static /* synthetic */ void m10061I3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: u3 */
    private void m10073u3(NotificationService.C6109d dVar, TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_matchText, triggerContextInfo, mo27837X0());
        String c = C6460y1.m24791c(t0.toLowerCase(), this.enableRegex);
        String b = C6460y1.m24790b(t0.toLowerCase(), this.enableRegex);
        int i = this.m_matchOption;
        if (i == 0) {
            NotificationService.m24179d(mo27827K0(), dVar, this.m_clearPersistent);
        } else if (i == 1) {
            if (C6460y1.m24792d(dVar.f14518e.toLowerCase(), c, this.enableRegex) || C6460y1.m24792d(dVar.f14519f.toLowerCase(), c, this.enableRegex)) {
                NotificationService.m24179d(mo27827K0(), dVar, this.m_clearPersistent);
            }
        } else if (i == 2) {
            if (C6460y1.m24792d(dVar.f14518e.toLowerCase(), b, this.enableRegex) || C6460y1.m24792d(dVar.f14519f.toLowerCase(), b, this.enableRegex)) {
                NotificationService.m24179d(mo27827K0(), dVar, this.m_clearPersistent);
            }
        } else if (i == 3 && !C6460y1.m24792d(dVar.f14518e.toLowerCase(), b, this.enableRegex) && !C6460y1.m24792d(dVar.f14519f.toLowerCase(), b, this.enableRegex)) {
            NotificationService.m24179d(mo27827K0(), dVar, this.m_clearPersistent);
        }
    }

    /* renamed from: v3 */
    private void m10074v3(List<C4013g> list) {
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
                ((RadioButton) appCompatDialog.findViewById(C17532R$id.radio_include)).setChecked(true ^ this.m_excludes);
                radioButton.setChecked(this.m_excludes);
                C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
                ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
                dVar.getFilter().mo41019a("", false);
                checkBox.setOnCheckedChangeListener(new C2989d2(dVar, searchView));
                searchView.setOnQueryTextListener(new C2361a(dVar, checkBox));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3467t1(appCompatDialog));
                ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3612y1(this, dVar, radioButton, appCompatDialog));
                appCompatDialog.show();
                appCompatDialog.getWindow().setAttributes(layoutParams);
                return;
            }
        }
    }

    /* renamed from: w3 */
    private void m10075w3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.notification_text_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_clear_notifications);
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
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.hour_picker);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.minute_picker);
        NumberPicker numberPicker3 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.second_picker);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Activity activity = j0;
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.older_than_container)).setVisibility(0);
        int i = this.m_ageInSeconds;
        int i2 = i / 3600;
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        int i3 = i2 * 3600;
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        int i4 = (i - i3) / 60;
        numberPicker3.setValue((i - i3) - (i4 * 60));
        numberPicker2.setValue(i4);
        numberPicker.setValue(i2);
        numberPicker3.setMaximum(59);
        numberPicker2.setMaximum(59);
        numberPicker.setMaximum(999999);
        checkBox2.setVisibility(Build.VERSION.SDK_INT >= 26 ? 0 : 8);
        checkBox2.setChecked(!this.m_clearPersistent);
        editText.setText(this.m_matchText);
        checkBox.setChecked(this.enableRegex);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);
        radioButton.setChecked(false);
        int i5 = this.m_matchOption;
        if (i5 == 0) {
            radioButton.setChecked(true);
            editText.setEnabled(false);
            button.setEnabled(false);
        } else if (i5 == 1) {
            radioButton2.setChecked(true);
            editText.setEnabled(true);
            button.setEnabled(editText.length() > 0);
        } else if (i5 == 2) {
            radioButton3.setChecked(true);
            editText.setEnabled(true);
            button.setEnabled(editText.length() > 0);
        } else if (i5 == 3) {
            radioButton4.setChecked(true);
            editText.setEnabled(true);
            button.setEnabled(editText.length() > 0);
        }
        radioButton.setOnCheckedChangeListener(new C3639z1(editText, button, radioButton2, radioButton3, radioButton4));
        radioButton2.setOnCheckedChangeListener(new C2805a2(radioButton, radioButton3, radioButton4));
        radioButton3.setOnCheckedChangeListener(new C2933b2(radioButton2, radioButton, radioButton4));
        radioButton4.setOnCheckedChangeListener(new C2961c2(radioButton2, radioButton3, radioButton));
        editText.addTextChangedListener(new C2362b(button, editText));
        RadioButton radioButton5 = radioButton;
        Button button4 = button2;
        Button button5 = button3;
        EditText editText2 = editText;
        C3585x1 x1Var = r0;
        Button button6 = button4;
        Button button7 = button;
        C3585x1 x1Var2 = new C3585x1(this, radioButton, radioButton2, radioButton3, radioButton4, checkBox2, editText, numberPicker3, numberPicker2, numberPicker, checkBox, appCompatDialog2);
        button7.setOnClickListener(x1Var);
        button7.setEnabled(this.m_matchOption == 0 || radioButton5.length() > 0);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button6.setOnClickListener(new C3530v1(appCompatDialog3));
        button5.setOnClickListener(new C3558w1(this, activity, new C3503u1(editText2)));
        appCompatDialog3.show();
    }

    /* renamed from: x3 */
    private String[] m10076x3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_clear_notifications_clear_all), MacroDroidApplication.m14845u().getString(C17541R$string.select_applications)};
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            m10074v3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_matchText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_matchText = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        if (this.m_option == 0) {
            str = SelectableItem.m15535j1(C17541R$string.all_applications);
        } else {
            str = this.m_applicationNameList.toString().replace("[", "").replace("]", "");
        }
        int i = this.m_matchOption;
        if (i == 0) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_any_content) + " (" + str + ")";
        } else if (i == 3) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_excludes) + " " + this.m_matchText + " (" + str + ")";
        } else if (i == 1) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_matches) + " " + this.m_matchText + " (" + str + ")";
        } else {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_contains) + " " + this.m_matchText + " (" + str + ")";
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7844t.m32795u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.m_option != 0) {
            List<NotificationService.C6109d> f = NotificationService.m24181f(this.m_ageInSeconds, false);
            ArrayList<NotificationService.C6109d> arrayList = new ArrayList<>(f);
            Iterator<String> it = this.m_packageNameList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                for (NotificationService.C6109d next2 : f) {
                    if (next2.f14515b.equals(next)) {
                        if (!this.m_excludes) {
                            m10073u3(next2, triggerContextInfo);
                        } else {
                            arrayList.remove(next2);
                        }
                    }
                }
            }
            if (this.m_excludes) {
                for (NotificationService.C6109d u3 : arrayList) {
                    m10073u3(u3, triggerContextInfo);
                }
            }
        } else if (!this.m_excludes) {
            for (NotificationService.C6109d u32 : NotificationService.m24181f(this.m_ageInSeconds, false)) {
                m10073u3(u32, triggerContextInfo);
            }
        } else {
            for (NotificationService.C6109d u33 : NotificationService.m24181f(this.m_ageInSeconds, false)) {
                m10073u3(u33, triggerContextInfo);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10076x3();
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_option == 0) {
            m10075w3();
            return;
        }
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.m_matchOption);
        parcel.writeString(this.m_matchText);
        parcel.writeInt(this.m_excludes ? 1 : 0);
        parcel.writeInt(this.m_ageInSeconds);
        parcel.writeInt(this.m_clearPersistent ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public ClearNotificationsAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ClearNotificationsAction() {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private ClearNotificationsAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.m_matchOption = parcel.readInt();
        this.m_matchText = parcel.readString();
        boolean z = true;
        this.m_excludes = parcel.readInt() != 0;
        this.m_ageInSeconds = parcel.readInt();
        this.m_clearPersistent = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() == 0 ? false : z;
    }
}
