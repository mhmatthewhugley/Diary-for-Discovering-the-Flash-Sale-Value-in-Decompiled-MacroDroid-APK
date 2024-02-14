package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
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
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6378f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p128m0.C7865w;
import p148q0.C8151a;
import p187x0.C10351d;
import p385s7.C16505a;

public class CloseApplicationAction extends Action implements C4049q.C4050a, C2224m {
    public static final Parcelable.Creator<CloseApplicationAction> CREATOR = new C2371d();
    private static final int OPTION_KILL_BY_PACKAGE_NAME = 1;
    private static final int OPTION_LAUNCH_BY_APP_CHOOSER = 0;
    private String killByPackageName;
    private String m_applicationName;
    private ArrayList<String> m_applicationNameList;
    private ArrayList<String> m_packageNameList;
    private String m_packageToClose;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.CloseApplicationAction$a */
    class C2368a extends Thread {

        /* renamed from: a */
        final /* synthetic */ ActivityManager.RunningAppProcessInfo f7185a;

        C2368a(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
            this.f7185a = runningAppProcessInfo;
        }

        public void run() {
            for (int i = 0; i < 6; i++) {
                C4061t1.m15947B0(new String[]{"su", "-c", "pkill " + this.f7185a.processName});
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.CloseApplicationAction$b */
    class C2369b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7187a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f7188b;

        C2369b(C10351d dVar, CheckBox checkBox) {
            this.f7187a = dVar;
            this.f7188b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f7187a.getFilter().mo41019a(str, this.f7188b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.CloseApplicationAction$c */
    class C2370c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7190a;

        /* renamed from: c */
        final /* synthetic */ EditText f7191c;

        C2370c(Button button, EditText editText) {
            this.f7190a = button;
            this.f7191c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7190a.setEnabled(this.f7191c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.CloseApplicationAction$d */
    class C2371d implements Parcelable.Creator<CloseApplicationAction> {
        C2371d() {
        }

        /* renamed from: a */
        public CloseApplicationAction createFromParcel(Parcel parcel) {
            return new CloseApplicationAction(parcel, (C2368a) null);
        }

        /* renamed from: b */
        public CloseApplicationAction[] newArray(int i) {
            return new CloseApplicationAction[i];
        }
    }

    /* synthetic */ CloseApplicationAction(Parcel parcel, C2368a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m10121A3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m10122B3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.dismiss();
        this.killByPackageName = editText.getText().toString();
        mo24866t3();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m10124D3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m10125E3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: F3 */
    private void m10126F3() {
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
        if (editText.getText().length() == 0) {
            button.setEnabled(false);
        }
        editText.addTextChangedListener(new C2370c(button, editText));
        button.setOnClickListener(new C3329p2(this, appCompatDialog, editText));
        button2.setOnClickListener(new C3243m2(appCompatDialog));
        button3.setOnClickListener(new C3299o2(this, j0, new C3414s2(editText)));
        appCompatDialog.show();
    }

    /* renamed from: s3 */
    private void m10136s3(List<C4013g> list) {
        boolean z;
        if (mo27836X()) {
            String str = this.m_packageToClose;
            if (!(str == null || this.m_applicationName == null)) {
                this.m_packageNameList.add(str);
                this.m_applicationNameList.add(this.m_applicationName);
            }
            this.m_packageToClose = null;
            this.m_applicationName = null;
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
            ((RadioGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
            C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
            ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
            dVar.getFilter().mo41019a("", false);
            checkBox.setOnCheckedChangeListener(new C3385r2(dVar, searchView));
            searchView.setOnQueryTextListener(new C2369b(dVar, checkBox));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3271n2(appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3357q2(this, dVar, appCompatDialog));
            appCompatDialog.show();
            appCompatDialog.getWindow().setAttributes(layoutParams);
        }
    }

    /* renamed from: u3 */
    private String[] m10137u3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_application), SelectableItem.m15535j1(C17541R$string.action_launch_activity_option_enter_package_name)};
    }

    /* renamed from: v3 */
    private void m10138v3(String str) {
        ActivityManager activityManager = (ActivityManager) MacroDroidApplication.m14845u().getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        C4061t1.m15951D0(new String[]{"am force-stop " + str});
        activityManager.killBackgroundProcesses(str);
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                String[] strArr = next.pkgList;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equals(str)) {
                        C16505a.m98584y(next.processName);
                        new C2368a(next).start();
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m10141y3(C10351d dVar, AppCompatDialog appCompatDialog, View view) {
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
            mo24866t3();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* renamed from: z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m10142z3(android.app.Activity r2, android.content.DialogInterface r3, int r4) {
        /*
            r1 = this;
            java.lang.String r3 = "android.intent.action.VIEW"
            android.content.Intent r4 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0014 }
            java.lang.String r0 = "market://details?id=stericson.busybox"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x0014 }
            r4.<init>(r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0014 }
            r2.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x0014 }
            r1.mo24689O1()     // Catch:{ ActivityNotFoundException -> 0x0014 }
            goto L_0x0022
        L_0x0014:
            android.content.Intent r4 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0022 }
            java.lang.String r0 = "http://play.google.com/store/apps/details?id=stericson.busybox"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x0022 }
            r4.<init>(r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0022 }
            r2.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x0022 }
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.CloseApplicationAction.m10142z3(android.app.Activity, android.content.DialogInterface, int):void");
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            m10136s3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
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

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return !TextUtils.isEmpty(this.killByPackageName) || !TextUtils.isEmpty(this.m_packageToClose) || this.m_applicationName != null || this.m_applicationNameList.size() != 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.option == 1) {
            return this.killByPackageName;
        }
        String str = this.m_applicationName;
        if (str != null) {
            return str;
        }
        if (this.m_applicationNameList.size() > 1) {
            return this.m_applicationNameList.size() + " " + SelectableItem.m15535j1(C17541R$string.action_configure_app_notifications_apps);
        } else if (this.m_applicationNameList.size() == 1) {
            return this.m_applicationNameList.get(0);
        } else {
            return C4061t1.f10631k;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7865w.m32897u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.option == 1) {
            m10138v3(C4023j0.m15760t0(mo27827K0(), this.killByPackageName, triggerContextInfo, mo27837X0()));
            return;
        }
        if (this.m_packageToClose != null && this.m_packageNameList.size() == 0) {
            this.m_packageNameList.add(this.m_packageToClose);
            this.m_applicationNameList.add(this.m_applicationName);
            this.m_packageToClose = null;
            this.m_applicationName = null;
        }
        Iterator<String> it = this.m_packageNameList.iterator();
        while (it.hasNext()) {
            m10138v3(it.next());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10137u3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public void mo24866t3() {
        if (C4031k.m15907g() || C5163j2.m20077V1(mo27827K0())) {
            mo24689O1();
            return;
        }
        Activity j0 = mo27850j0();
        String string = mo27827K0().getString(C17541R$string.action_close_application_busybox_message);
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_close_application_kill_any));
        builder.setMessage((CharSequence) string);
        builder.setPositiveButton((int) C17541R$string.download_app, (DialogInterface.OnClickListener) new C3215l2(this, j0));
        builder.setNegativeButton((int) C17541R$string.not_now, (DialogInterface.OnClickListener) new C3187k2(this));
        builder.show();
        C5163j2.m19990I5(mo27827K0(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.option == 0) {
            new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
            return;
        }
        m10126F3();
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

    public CloseApplicationAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CloseApplicationAction() {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private CloseApplicationAction(Parcel parcel) {
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
