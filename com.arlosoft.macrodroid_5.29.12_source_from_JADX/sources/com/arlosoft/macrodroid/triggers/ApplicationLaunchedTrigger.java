package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
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
import android.widget.RadioGroup;
import android.widget.TextView;
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
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.services.RunningApplicationServiceV21;
import com.arlosoft.macrodroid.triggers.services.RunningApplicationServiceV22;
import com.arlosoft.macrodroid.utils.C6378f;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p112j2.C7439d0;
import p119k3.C7491e;
import p135n1.C7967d;
import p148q0.C8151a;
import p187x0.C10351d;
import p455ag.C17105a;

public class ApplicationLaunchedTrigger extends Trigger implements C4049q.C4050a, C2224m {
    public static final Parcelable.Creator<ApplicationLaunchedTrigger> CREATOR = new C5599c();
    private static final String MACRODROID_PACKAGE = "com.arlosoft.macrodroid";
    private static final int OPTION_BY_APP_CHOOSER = 0;
    private static final int OPTION_BY_PACKAGE_NAME = 1;
    private static final String PACKAGE_ANDROID_SYSTEM_UI = "com.android.systemui";
    private static final String PACKAGE_GOOGLE_QUICK_SEARCH_BOX = "com.google.android.googlequicksearchbox";
    private static final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private static PackageManager packageManager = MacroDroidApplication.m14845u().getPackageManager();
    private static boolean s_api21HackEnabled = false;
    private static int s_triggerCounter;
    private String customPackageName;
    private boolean isAllApps;
    private String m_applicationName;
    private ArrayList<String> m_applicationNameList;
    private transient boolean m_editing;
    private boolean m_launched;
    private String m_packageName;
    private ArrayList<String> m_packageNameList;
    private transient int transientPackageNameOption;
    private int usePackageNameOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger$a */
    class C5597a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13575a;

        /* renamed from: c */
        final /* synthetic */ EditText f13576c;

        C5597a(Button button, EditText editText) {
            this.f13575a = button;
            this.f13576c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13575a.setEnabled(this.f13576c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger$b */
    class C5598b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f13578a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f13579b;

        C5598b(C10351d dVar, CheckBox checkBox) {
            this.f13578a = dVar;
            this.f13579b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f13578a.getFilter().mo41019a(str, this.f13579b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger$c */
    class C5599c implements Parcelable.Creator<ApplicationLaunchedTrigger> {
        C5599c() {
        }

        /* renamed from: a */
        public ApplicationLaunchedTrigger createFromParcel(Parcel parcel) {
            return new ApplicationLaunchedTrigger(parcel, (C5597a) null);
        }

        /* renamed from: b */
        public ApplicationLaunchedTrigger[] newArray(int i) {
            return new ApplicationLaunchedTrigger[i];
        }
    }

    /* synthetic */ ApplicationLaunchedTrigger(Parcel parcel, C5597a aVar) {
        this(parcel);
    }

    /* renamed from: B3 */
    private void m21503B3() {
        this.transientPackageNameOption = this.usePackageNameOption;
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m21505D3(), this.usePackageNameOption, (DialogInterface.OnClickListener) new C6081s(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6145u(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6133t(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C5952i(this));
    }

    /* renamed from: C3 */
    private void m21504C3() {
        int i = Build.VERSION.SDK_INT;
        if (s_triggerCounter != 0) {
            return;
        }
        if (i != 21) {
            mo27827K0().startService(new Intent(mo27827K0(), RunningApplicationServiceV22.class));
        } else if (C5163j2.m20142e(mo27827K0())) {
            mo27827K0().startService(new Intent(mo27827K0(), RunningApplicationServiceV22.class));
            s_api21HackEnabled = true;
        } else {
            mo27827K0().startService(new Intent(mo27827K0(), RunningApplicationServiceV21.class));
            s_api21HackEnabled = false;
        }
    }

    /* renamed from: D3 */
    private String[] m21505D3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_applications), SelectableItem.m15535j1(C17541R$string.action_launch_activity_option_enter_package_name)};
    }

    /* renamed from: E3 */
    private void m21506E3() {
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.trigger_accent)).execute((Object[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.arlosoft.macrodroid.triggers.TriggerContextInfo m21507I3(com.arlosoft.macrodroid.triggers.Trigger r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L_0x000a
            android.content.pm.PackageManager r0 = packageManager     // Catch:{ NameNotFoundException -> 0x000a }
            r1 = 0
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0014
            android.content.pm.PackageManager r0 = packageManager
            java.lang.CharSequence r3 = r0.getApplicationLabel(r3)
            goto L_0x001b
        L_0x0014:
            r3 = 2131955648(0x7f130fc0, float:1.954783E38)
            java.lang.String r3 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r3)
        L_0x001b:
            java.lang.String r3 = (java.lang.String) r3
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r0.<init>((com.arlosoft.macrodroid.triggers.Trigger) r2, (java.lang.String) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger.m21507I3(com.arlosoft.macrodroid.triggers.Trigger, java.lang.String):com.arlosoft.macrodroid.triggers.TriggerContextInfo");
    }

    /* renamed from: K3 */
    public static void m21508K3(String str, String str2) {
        C17105a.m100579a("Foreground APP: %s", str);
        if (!str.equals(MACRODROID_PACKAGE) || (!str2.equals("android.widget.FrameLayout") && !str2.equals("android.widget.ImageView"))) {
            try {
                if (NonAppActivity.class.isAssignableFrom(Class.forName(str2))) {
                    return;
                }
            } catch (Exception unused) {
            }
            String D = C5163j2.m19946D(MacroDroidApplication.m14845u());
            if (!str.equals(D)) {
                if (str2.startsWith("com.google.android.launcher")) {
                    str = "com.google.android.launcher";
                }
                if (!C5163j2.m20119b0(MacroDroidApplication.m14845u())) {
                    if (str.equals(PACKAGE_GOOGLE_QUICK_SEARCH_BOX)) {
                        m21546y3(true);
                        return;
                    }
                    if (D.equals(PACKAGE_GOOGLE_QUICK_SEARCH_BOX)) {
                        m21546y3(false);
                    }
                    if (!str.equals(PACKAGE_ANDROID_SYSTEM_UI) && !str.equals(PACKAGE_GOOGLE_QUICK_SEARCH_BOX) && !str.equals("none") && !str.equals(D)) {
                        boolean equals = str.equals(MACRODROID_PACKAGE);
                        boolean equals2 = D.equals(MACRODROID_PACKAGE);
                        if (!str.contains("com.google.android.inputmethod") && !str.contains("com.android.inputmethod")) {
                            C17105a.m100579a("Foreground app: %s", str);
                            ArrayList<Macro> arrayList = new ArrayList<>();
                            for (Macro next : C4934n.m18998M().mo29679I()) {
                                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Trigger next2 = it.next();
                                    if (next2 instanceof ApplicationLaunchedTrigger) {
                                        ApplicationLaunchedTrigger applicationLaunchedTrigger = (ApplicationLaunchedTrigger) next2;
                                        if (applicationLaunchedTrigger.mo30925J3()) {
                                            String t0 = C4023j0.m15760t0(MacroDroidApplication.m14845u(), applicationLaunchedTrigger.customPackageName, (TriggerContextInfo) null, applicationLaunchedTrigger.mo27837X0());
                                            if (!equals && applicationLaunchedTrigger.mo30922F3() && t0.equals(str) && next2.mo31374R2()) {
                                                next.setTriggerThatInvoked(next2);
                                                next.setTriggerContextInfo(m21507I3(next2, str));
                                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                                    arrayList.add(next);
                                                }
                                            } else if (!equals2 && !applicationLaunchedTrigger.mo30922F3() && t0.equals(D) && next2.mo31374R2()) {
                                                next.setTriggerThatInvoked(next2);
                                                next.setTriggerContextInfo(m21507I3(next2, D));
                                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                                    arrayList.add(next);
                                                }
                                            }
                                        } else if (!applicationLaunchedTrigger.isAllApps) {
                                            Iterator<String> it2 = applicationLaunchedTrigger.mo30924H3().iterator();
                                            while (it2.hasNext()) {
                                                String next3 = it2.next();
                                                if (!equals && applicationLaunchedTrigger.mo30922F3() && next3.equals(str) && next2.mo31374R2()) {
                                                    next.setTriggerThatInvoked(next2);
                                                    next.setTriggerContextInfo(m21507I3(next2, str));
                                                    if (next.canInvoke(next.getTriggerContextInfo())) {
                                                        arrayList.add(next);
                                                    }
                                                } else if (!equals2 && !applicationLaunchedTrigger.mo30922F3()) {
                                                    if ((next3.equals(D) || applicationLaunchedTrigger.isAllApps) && next2.mo31374R2()) {
                                                        next.setTriggerThatInvoked(next2);
                                                        next.setTriggerContextInfo(m21507I3(next2, D));
                                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                                            arrayList.add(next);
                                                        }
                                                    }
                                                }
                                            }
                                            continue;
                                        } else if (!equals && applicationLaunchedTrigger.mo30922F3() && applicationLaunchedTrigger.mo31374R2()) {
                                            next.setTriggerThatInvoked(next2);
                                            next.setTriggerContextInfo(m21507I3(next2, str));
                                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                                arrayList.add(next);
                                            }
                                        } else if (!equals2 && !applicationLaunchedTrigger.mo30922F3() && applicationLaunchedTrigger.mo31374R2()) {
                                            next.setTriggerThatInvoked(next2);
                                            next.setTriggerContextInfo(m21507I3(next2, str));
                                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                                arrayList.add(next);
                                            }
                                        }
                                    }
                                }
                            }
                            C5163j2.m19934B3(MacroDroidApplication.m14845u(), str);
                            if (arrayList.size() > 0) {
                                for (Macro pVar : arrayList) {
                                    mainThreadHandler.post(new C6036p(pVar));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m21512O3(C10351d dVar, Activity activity, AppCompatDialog appCompatDialog, View view) {
        this.m_editing = false;
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        List<C4013g> g = dVar.mo41012g();
        this.isAllApps = false;
        int i = 0;
        boolean z = false;
        while (i < g.size()) {
            C4013g gVar = g.get(i);
            this.m_packageNameList.add(gVar.f10397b);
            this.m_applicationNameList.add(gVar.f10396a);
            i++;
            z = true;
        }
        if (z && C7439d0.m30854A(activity, this, true, false)) {
            this.usePackageNameOption = 0;
            appCompatDialog.dismiss();
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m21513P3(AppCompatDialog appCompatDialog, View view) {
        this.m_editing = false;
        this.isAllApps = true;
        this.usePackageNameOption = 0;
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static /* synthetic */ void m21514Q3(View view, CompoundButton compoundButton, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m21515R3(AppCompatDialog appCompatDialog, CheckBox checkBox, RadioButton radioButton, CheckBox checkBox2, View view) {
        C5163j2.m20186j3(appCompatDialog.getContext(), checkBox.isChecked());
        this.m_launched = radioButton.isChecked();
        if (C5163j2.m20119b0(mo27827K0()) != checkBox2.isChecked()) {
            ArrayList<Macro> arrayList = new ArrayList<>();
            for (Macro next : C4934n.m18998M().mo29710z()) {
                if (next.isEnabled()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() instanceof ApplicationLaunchedTrigger) {
                                arrayList.add(next);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            for (Macro enabled : arrayList) {
                enabled.setEnabled(false);
            }
            C5163j2.m20051R3(mo27827K0(), checkBox2.isChecked());
            for (Macro enabled2 : arrayList) {
                enabled2.setEnabled(true);
            }
            mo27839Y();
        }
        appCompatDialog.dismiss();
        mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public /* synthetic */ void m21517T3(DialogInterface dialogInterface, int i) {
        this.transientPackageNameOption = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void m21518U3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m21519V3(DialogInterface dialogInterface, int i) {
        if (this.transientPackageNameOption == 1) {
            m21527d4();
        } else {
            m21506E3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void m21520W3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public /* synthetic */ void m21521X3(DialogInterface dialogInterface, int i) {
        super.mo24714u1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public static /* synthetic */ void m21523Z3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void m21524a4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public /* synthetic */ void m21525b4(EditText editText, Activity activity, AppCompatDialog appCompatDialog, View view) {
        this.m_editing = false;
        this.usePackageNameOption = 1;
        this.customPackageName = editText.getText().toString();
        if (C7439d0.m30854A(activity, this, true, false)) {
            appCompatDialog.dismiss();
            mo24689O1();
        }
    }

    /* renamed from: d4 */
    private void m21527d4() {
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
        String str = this.customPackageName;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(this.customPackageName.length());
        }
        if (editText.getText().length() > 0) {
            button.setEnabled(true);
        }
        editText.addTextChangedListener(new C5597a(button, editText));
        button.setOnClickListener(new C6205z(this, editText, j0, appCompatDialog));
        button2.setOnClickListener(new C6157v(appCompatDialog));
        button3.setOnClickListener(new C6193y(this, j0, new C6024o(editText)));
        appCompatDialog.show();
    }

    /* renamed from: y3 */
    private static void m21546y3(boolean z) {
        ArrayList<Macro> arrayList = new ArrayList<>();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof ApplicationLaunchedTrigger) {
                    ApplicationLaunchedTrigger applicationLaunchedTrigger = (ApplicationLaunchedTrigger) next2;
                    Iterator<String> it2 = applicationLaunchedTrigger.mo30924H3().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next3 = it2.next();
                        if (applicationLaunchedTrigger.mo30922F3() == z && next3.equals(PACKAGE_GOOGLE_QUICK_SEARCH_BOX) && next2.mo31374R2()) {
                            next.setTriggerThatInvoked(next2);
                            next.setTriggerContextInfo(m21507I3(next2, PACKAGE_GOOGLE_QUICK_SEARCH_BOX));
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        C5163j2.m19934B3(MacroDroidApplication.m14845u(), PACKAGE_GOOGLE_QUICK_SEARCH_BOX);
        if (arrayList.size() > 0) {
            for (Macro qVar : arrayList) {
                mainThreadHandler.post(new C6048q(qVar));
            }
        }
    }

    /* renamed from: z3 */
    private void m21547z3() {
        if (s_triggerCounter != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT != 21) {
            mo27827K0().stopService(new Intent(mo27827K0(), RunningApplicationServiceV22.class));
        } else if (s_api21HackEnabled) {
            mo27827K0().stopService(new Intent(mo27827K0(), RunningApplicationServiceV22.class));
        } else {
            mo27827K0().stopService(new Intent(mo27827K0(), RunningApplicationServiceV21.class));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A3 */
    public void mo30921A3(List<C4013g> list) {
        boolean z;
        if (mo27836X()) {
            String str = this.m_packageName;
            if (!(str == null || this.m_applicationName == null)) {
                this.m_packageNameList.add(str);
                this.m_applicationNameList.add(this.m_applicationName);
            }
            this.m_packageName = null;
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
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.allAppsButton);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.non_launchable_checkbox);
            SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
            button.setVisibility(0);
            ((ViewGroup) appCompatDialog.findViewById(C17532R$id.include_exclude_options)).setVisibility(0);
            ((RadioGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
            C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
            ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
            dVar.getFilter().mo41019a("", false);
            checkBox.setOnCheckedChangeListener(new C6012n(dVar, searchView));
            searchView.setOnQueryTextListener(new C5598b(dVar, checkBox));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6181x(appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5988l(this, dVar, j0, appCompatDialog));
            button.setOnClickListener(new C5964j(this, appCompatDialog));
            appCompatDialog.show();
            appCompatDialog.getWindow().setAttributes(layoutParams);
        }
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            mo30921A3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_launched ^ true ? 1 : 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.customPackageName};
    }

    /* renamed from: F3 */
    public boolean mo30922F3() {
        return this.m_launched;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_launched ? mo30923G3()[0] : mo30923G3()[1];
    }

    /* renamed from: G3 */
    public String[] mo30923G3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_application_launched_app_launched), SelectableItem.m15535j1(C17541R$string.trigger_application_launched_app_closed)};
    }

    /* renamed from: H3 */
    public ArrayList<String> mo30924H3() {
        if (this.m_packageName == null) {
            return this.m_packageNameList;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.m_packageName);
        return arrayList;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.customPackageName = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: J3 */
    public boolean mo30925J3() {
        return this.usePackageNameOption == 1;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return (this.usePackageNameOption == 1 && this.customPackageName != null) || mo30924H3().size() > 0 || this.isAllApps;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.isAllApps) {
            return SelectableItem.m15535j1(C17541R$string.all_applications);
        }
        if (this.usePackageNameOption == 1) {
            return this.customPackageName;
        }
        String str = this.m_applicationName;
        if (str != null) {
            return str;
        }
        if (this.m_applicationNameList.size() > 1) {
            return this.m_applicationNameList.toString();
        }
        if (this.m_applicationNameList.size() == 1) {
            return this.m_applicationNameList.get(0);
        }
        return SelectableItem.m15535j1(C17541R$string.select_app);
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            C5163j2.m19934B3(MacroDroidApplication.m14845u(), "none");
        }
        if (C5163j2.m20119b0(mo27827K0())) {
            m21547z3();
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7491e.m31142u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        if (this.usePackageNameOption == 1) {
            return mo24738G0() + " (" + this.customPackageName + ")";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        String str = this.m_applicationName;
        if (str == null) {
            if (this.m_applicationNameList.size() > 0) {
                str = " (" + C6413o0.m24694c(this.m_applicationNameList.toString(), 15) + ")";
            } else {
                str = " " + SelectableItem.m15535j1(C17541R$string.select_app);
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (C5163j2.m20119b0(mo27827K0())) {
            m21504C3();
        }
        s_triggerCounter++;
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        this.m_editing = true;
        super.mo25540W1();
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        if (!this.m_editing) {
            return !C5163j2.m20119b0(mo27827K0());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return mo30923G3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_app_launched_options);
        appCompatDialog.setTitle((int) C17541R$string.select_option);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.app_launched_radio);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.app_closed_radio);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.force_legacy_setting);
        View findViewById = appCompatDialog.findViewById(C17532R$id.legacy_settings_view);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.prevent_notification_interrupt);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.prevent_notification_interrupt_description);
        int i = 8;
        if (Build.VERSION.SDK_INT == 21 && !C5163j2.m20142e(j0)) {
            textView.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        checkBox.setOnCheckedChangeListener(new C6000m(findViewById));
        checkBox.setChecked(C5163j2.m20119b0(mo27827K0()));
        if (C5163j2.m20119b0(mo27827K0())) {
            i = 0;
        }
        findViewById.setVisibility(i);
        checkBox2.setChecked(C5163j2.m20190k(j0));
        radioButton.setChecked(this.m_launched);
        radioButton2.setChecked(!this.m_launched);
        button.setOnClickListener(new C5976k(this, appCompatDialog, checkBox2, radioButton, checkBox));
        button2.setOnClickListener(new C6169w(appCompatDialog));
        appCompatDialog.show();
        return null;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        if (this.usePackageNameOption == 1) {
            return mo24738G0() + " (" + this.customPackageName + ")";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        String str = this.m_applicationName;
        if (str == null) {
            if (this.m_applicationNameList.size() > 0) {
                str = " (" + this.m_applicationNameList.toString() + ")";
            } else {
                str = " " + SelectableItem.m15535j1(C17541R$string.select_app);
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: s2 */
    public boolean mo27866s2() {
        if (this.m_editing || !C5163j2.m20119b0(mo27827K0())) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 || (i == 21 && C5163j2.m20142e(mo27827K0()))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (Build.VERSION.SDK_INT != 21 || !C5163j2.m20119b0(mo27827K0()) || C5163j2.m19941C2(mo27827K0())) {
            super.mo24714u1();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_application_launched);
        builder.setMessage((int) C17541R$string.app_launched_5_0_warning);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6060r(this));
        builder.show();
        C5163j2.m19976G5(mo27827K0(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m21503B3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_launched ? 1 : 0);
        parcel.writeString(this.m_packageName);
        parcel.writeString(this.m_applicationName);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeString(this.customPackageName);
        parcel.writeInt(this.usePackageNameOption);
        parcel.writeInt(this.isAllApps ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_launched = i == 0;
    }

    public ApplicationLaunchedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ApplicationLaunchedTrigger() {
        this.m_launched = true;
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private ApplicationLaunchedTrigger(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_launched = parcel.readInt() != 0;
        this.m_packageName = parcel.readString();
        this.m_applicationName = parcel.readString();
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.customPackageName = parcel.readString();
        this.usePackageNameOption = parcel.readInt();
        this.isAllApps = parcel.readInt() == 0 ? false : z;
    }
}
