package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.annotation.NonNull;
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
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6378f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p128m0.C7846t1;
import p148q0.C8151a;
import p187x0.C10351d;

public class LaunchActivityAction extends Action implements C4049q.C4050a, C2224m {
    public static final Parcelable.Creator<LaunchActivityAction> CREATOR = new C2516d();
    private static final int OPTION_LAUNCH_BY_APP_CHOOSER = 0;
    private static final int OPTION_LAUNCH_BY_PACKAGE_NAME = 1;
    protected static final String SELECT_APPLICATION = MacroDroidApplication.m14845u().getString(C17541R$string.select_app);
    private String launchByPackageName;
    protected String m_activityName;
    protected String m_activityToLaunch;
    protected transient List<C4013g> m_appInfoList;
    protected String m_applicationName;
    /* access modifiers changed from: private */
    public boolean m_excludeFromRecents;
    protected String m_packageToLaunch;
    protected boolean m_startNew;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.LaunchActivityAction$a */
    class C2513a implements DialogInterface.OnClickListener {
        C2513a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
            LaunchActivityAction.this.m_startNew = checkedItemPositions.get(0, false);
            boolean unused = LaunchActivityAction.this.m_excludeFromRecents = checkedItemPositions.get(1, false);
            LaunchActivityAction.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LaunchActivityAction$b */
    class C2514b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7339a;

        C2514b(C10351d dVar) {
            this.f7339a = dVar;
        }

        public boolean onQueryTextChange(String str) {
            this.f7339a.getFilter().mo41019a(str, false);
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LaunchActivityAction$c */
    class C2515c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7341a;

        /* renamed from: c */
        final /* synthetic */ EditText f7342c;

        C2515c(Button button, EditText editText) {
            this.f7341a = button;
            this.f7342c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7341a.setEnabled(this.f7342c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LaunchActivityAction$d */
    class C2516d implements Parcelable.Creator<LaunchActivityAction> {
        C2516d() {
        }

        /* renamed from: a */
        public LaunchActivityAction createFromParcel(Parcel parcel) {
            return new LaunchActivityAction(parcel);
        }

        /* renamed from: b */
        public LaunchActivityAction[] newArray(int i) {
            return new LaunchActivityAction[i];
        }
    }

    public LaunchActivityAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m11177A3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: B3 */
    private void m11178B3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.launchByPackageName, triggerContextInfo, mo27837X0());
        Intent launchIntentForPackage = mo27827K0().getPackageManager().getLaunchIntentForPackage(t0);
        if (launchIntentForPackage != null) {
            if (this.m_excludeFromRecents) {
                launchIntentForPackage.addFlags(8388608);
            }
            if (this.m_startNew) {
                launchIntentForPackage.addFlags(32768);
            } else {
                launchIntentForPackage.addFlags(2097152);
            }
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.addFlags(270532608);
            try {
                mo27827K0().startActivity(launchIntentForPackage);
            } catch (Exception e) {
                C4878b.m18869h("Could not launch: " + this.m_applicationName + ". Error details: " + e.toString(), mo27840Y0().longValue());
            }
        } else {
            C4878b.m18869h("Could not launch: " + t0 + ". The package or a launchable activity was not found", mo27840Y0().longValue());
        }
    }

    /* renamed from: E3 */
    private void m11179E3(@NonNull PackageManager packageManager, @NonNull List<ResolveInfo> list, @NonNull String str, @NonNull String str2) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i).activityInfo.loadLabel(packageManager).toString();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) strArr, 0, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3564w7(this, str2, str, list, strArr));
        builder.create().show();
    }

    /* renamed from: F3 */
    private void m11180F3() {
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
        String str = this.launchByPackageName;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(this.launchByPackageName.length());
        }
        if (editText.getText().length() > 0) {
            button.setEnabled(true);
        }
        editText.addTextChangedListener(new C2515c(button, editText));
        button.setOnClickListener(new C3645z7(this, appCompatDialog, editText));
        button2.setOnClickListener(new C3591x7(appCompatDialog));
        button3.setOnClickListener(new C3618y7(this, j0, new C2811a8(editText)));
        appCompatDialog.show();
    }

    /* renamed from: s3 */
    private String[] m11189s3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_application), SelectableItem.m15535j1(C17541R$string.action_launch_activity_option_enter_package_name)};
    }

    /* renamed from: t3 */
    private String[] m11190t3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_launch_activity_force_new), MacroDroidApplication.m14845u().getString(C17541R$string.exclude_from_recents)};
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m11191u3(AppCompatDialog appCompatDialog, C4013g gVar) {
        PackageManager packageManager = mo27827K0().getPackageManager();
        List<ResolveInfo> a = C6378f.m24624a(packageManager, gVar.f10397b);
        if (a == null || a.size() < 2) {
            this.m_applicationName = gVar.f10396a;
            this.m_packageToLaunch = gVar.f10397b;
            this.m_activityToLaunch = null;
            this.m_activityName = null;
            mo25280C3();
        } else {
            m11179E3(packageManager, a, gVar.f10397b, gVar.f10396a);
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m11192v3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m11193w3(String str, String str2, List list, String[] strArr, DialogInterface dialogInterface, int i) {
        this.m_applicationName = str;
        this.m_packageToLaunch = str2;
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.m_activityToLaunch = ((ResolveInfo) list.get(checkedItemPosition)).activityInfo.name;
        this.m_activityName = strArr[checkedItemPosition];
        mo25280C3();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11194x3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.dismiss();
        this.launchByPackageName = editText.getText().toString();
        mo25281D3();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static /* synthetic */ void m11196z3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        this.m_appInfoList = list;
        mo25282r3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C3 */
    public void mo25280C3() {
        mo25281D3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public void mo25281D3() {
        Activity j0 = mo27850j0();
        if (mo27836X()) {
            boolean[] zArr = {this.m_startNew, this.m_excludeFromRecents};
            AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
            builder.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.action_launch_activity_select_launch_options));
            builder.setMultiChoiceItems((CharSequence[]) m11190t3(), zArr, (DialogInterface.OnMultiChoiceClickListener) null);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2513a());
            AlertDialog create = builder.create();
            create.show();
            create.setOnCancelListener(new C3536v7(this));
        }
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.launchByPackageName};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.option == 0) {
            return SelectableItem.m15535j1(C17541R$string.action_launch_activity_launch) + " " + this.m_applicationName;
        }
        return SelectableItem.m15535j1(C17541R$string.action_launch_activity_launch) + " " + this.launchByPackageName;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.launchByPackageName = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        if (this.option == 1) {
            return true;
        }
        String str = this.m_applicationName;
        return str != null && !str.equals(SELECT_APPLICATION);
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        String str;
        if (this.option == 1 || (str = this.m_packageToLaunch) == null || str.equals("com.android.camera") || mo27827K0().getPackageManager().getLaunchIntentForPackage(this.m_packageToLaunch) != null) {
            return null;
        }
        return String.format(SelectableItem.m15535j1(C17541R$string.requires_application), new Object[]{this.m_applicationName});
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        if (this.m_startNew) {
            sb.append(m11190t3()[0]);
        }
        if (this.m_excludeFromRecents) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(m11190t3()[1]);
        }
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7846t1.m32806u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.option == 1) {
            m11178B3(triggerContextInfo);
            return;
        }
        PackageManager packageManager = mo27827K0().getPackageManager();
        if ("com.android.camera".equals(this.m_packageToLaunch)) {
            try {
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.media.action.IMAGE_CAPTURE"), 0);
                Intent intent = new Intent();
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.addFlags(270532608);
                if (this.m_excludeFromRecents) {
                    intent.addFlags(8388608);
                }
                mo27827K0().startActivity(intent);
            } catch (Exception unused) {
                C8151a.m33873n(new RuntimeException("LaunchActiviity Action: Failed to launch camera App"));
            }
        } else {
            try {
                if (this.m_activityName == null) {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(this.m_packageToLaunch);
                    if (launchIntentForPackage != null) {
                        if (this.m_excludeFromRecents) {
                            launchIntentForPackage.addFlags(8388608);
                        }
                        if (this.m_startNew) {
                            launchIntentForPackage.addFlags(32768);
                        } else {
                            launchIntentForPackage.addFlags(2097152);
                        }
                        launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                        launchIntentForPackage.addFlags(270532608);
                        try {
                            mo27827K0().startActivity(launchIntentForPackage);
                        } catch (Exception e) {
                            Context K0 = mo27827K0();
                            String string = mo27827K0().getString(C17541R$string.error);
                            C4061t1.m16023v(K0, string, mo27827K0().getString(C17541R$string.action_launch_activity_failed_to_launch) + " " + this.m_applicationName, false);
                            C4878b.m18869h("Could not launch: " + this.m_applicationName + ". Error details: " + e.toString(), mo27840Y0().longValue());
                        }
                    } else {
                        Context K02 = mo27827K0();
                        C4061t1.m16023v(K02, mo27827K0().getString(C17541R$string.action_launch_activity_failed_to_launch) + " " + this.m_applicationName, mo27827K0().getString(C17541R$string.action_launch_activity_has_removed), false);
                    }
                } else {
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.setPackage(this.m_packageToLaunch);
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setClassName(this.m_packageToLaunch, this.m_activityToLaunch);
                    if (this.m_excludeFromRecents) {
                        intent2.addFlags(8388608);
                    }
                    if (this.m_startNew) {
                        intent2.addFlags(32768);
                    } else {
                        intent2.addFlags(2097152);
                    }
                    intent2.addFlags(268435456);
                    mo27827K0().startActivity(intent2);
                }
            } catch (ActivityNotFoundException unused2) {
                if ("com.android.camera".equals(this.m_packageToLaunch)) {
                    Intent intent3 = new Intent();
                    intent3.setComponent(new ComponentName("com.android.camera", "com.android.camera.CameraEntry"));
                    intent3.addFlags(268435456);
                    if (this.m_excludeFromRecents) {
                        intent3.addFlags(8388608);
                    }
                    mo27827K0().startActivity(intent3);
                    return;
                }
                Context K03 = mo27827K0();
                C4061t1.m16023v(K03, mo27827K0().getString(C17541R$string.action_launch_activity_failed_to_launch) + " " + this.m_applicationName, mo27827K0().getString(C17541R$string.action_launch_activity_could_not_start), false);
            } catch (IllegalArgumentException unused3) {
                Context K04 = mo27827K0();
                C4061t1.m16023v(K04, mo27827K0().getString(C17541R$string.action_launch_activity_failed_to_launch) + " " + this.m_applicationName, mo27827K0().getString(C17541R$string.action_launch_activity_could_not_start), false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11189s3();
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        if (this.launchByPackageName == null) {
            return super.mo24728k1(triggerContextInfo);
        }
        return mo25559a1() + " (" + mo24690R2(this.launchByPackageName, triggerContextInfo) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: r3 */
    public AlertDialog mo25282r3() {
        Activity j0 = mo27850j0();
        if (j0 == null) {
            return null;
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
        appCompatDialog.setTitle((int) C17541R$string.select_application);
        ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.application_list);
        SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.button_bar)).setVisibility(8);
        ArrayList arrayList = new ArrayList(this.m_appInfoList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4013g gVar = (C4013g) it.next();
            if (gVar.f10397b.equals(this.m_packageToLaunch)) {
                arrayList.add(0, gVar);
                break;
            }
        }
        C10351d dVar = new C10351d(j0, arrayList, (List<Boolean>) null, new C2939b8(this, appCompatDialog));
        listView.setAdapter(dVar);
        searchView.setOnQueryTextListener(new C2514b(dVar));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.option == 0) {
            new C4049q(this, mo27850j0(), true, true, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
            return;
        }
        m11180F3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_packageToLaunch);
        parcel.writeString(this.m_applicationName);
        parcel.writeString(this.m_activityToLaunch);
        parcel.writeString(this.m_activityName);
        parcel.writeInt(this.m_startNew ? 1 : 0);
        parcel.writeInt(this.m_excludeFromRecents ? 1 : 0);
        parcel.writeInt(this.option);
        parcel.writeString(this.launchByPackageName);
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.m_packageToLaunch));
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + this.m_packageToLaunch));
            intent2.addFlags(268435456);
            mo27827K0().startActivity(intent2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public LaunchActivityAction() {
        this.m_startNew = false;
    }

    protected LaunchActivityAction(Parcel parcel) {
        super(parcel);
        this.m_packageToLaunch = parcel.readString();
        this.m_applicationName = parcel.readString();
        this.m_activityToLaunch = parcel.readString();
        this.m_activityName = parcel.readString();
        boolean z = true;
        this.m_startNew = parcel.readInt() != 0;
        this.m_excludeFromRecents = parcel.readInt() == 0 ? false : z;
        this.option = parcel.readInt();
        this.launchByPackageName = parcel.readString();
    }
}
