package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.ConfirmDialogActivity;
import com.arlosoft.macrodroid.action.activities.MessageDialogActivity;
import com.arlosoft.macrodroid.action.activities.OptionDialogActivity;
import com.arlosoft.macrodroid.action.activities.TakePictureActivity;
import com.arlosoft.macrodroid.action.activities.TorchActivity;
import com.arlosoft.macrodroid.action.activities.UpdateBrightnessActivity;
import com.arlosoft.macrodroid.action.activities.VariableValuePrompt;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6378f;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p123l1.C7592a;
import p187x0.C10351d;

public class ActiveApplicationConstraint extends Constraint implements C4049q.C4050a {
    public static final Parcelable.Creator<ActiveApplicationConstraint> CREATOR = new C4107c();
    /* access modifiers changed from: private */
    public static String cameraPackage = "camera";

    /* renamed from: f */
    public static final Set<String> f10691f;
    private boolean m_active;
    private String m_applicationName;
    private ArrayList<String> m_applicationNameList;
    private boolean m_foreground;
    private String m_packageName;
    private ArrayList<String> m_packageNameList;

    /* renamed from: com.arlosoft.macrodroid.constraint.ActiveApplicationConstraint$a */
    class C4105a extends Thread {
        C4105a() {
        }

        public void run() {
            ComponentName resolveActivity = new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(MacroDroidApplication.m14845u().getPackageManager());
            if (resolveActivity != null) {
                String unused = ActiveApplicationConstraint.cameraPackage = resolveActivity.getPackageName();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ActiveApplicationConstraint$b */
    class C4106b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f10692a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f10693b;

        C4106b(C10351d dVar, CheckBox checkBox) {
            this.f10692a = dVar;
            this.f10693b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f10692a.getFilter().mo41019a(str, this.f10693b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ActiveApplicationConstraint$c */
    class C4107c implements Parcelable.Creator<ActiveApplicationConstraint> {
        C4107c() {
        }

        /* renamed from: a */
        public ActiveApplicationConstraint createFromParcel(Parcel parcel) {
            return new ActiveApplicationConstraint(parcel, (C4105a) null);
        }

        /* renamed from: b */
        public ActiveApplicationConstraint[] newArray(int i) {
            return new ActiveApplicationConstraint[i];
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f10691f = hashSet;
        hashSet.add(UpdateBrightnessActivity.class.getCanonicalName());
        hashSet.add(VariableValuePrompt.class.getCanonicalName());
        hashSet.add(ConfirmDialogActivity.class.getCanonicalName());
        hashSet.add(MessageDialogActivity.class.getCanonicalName());
        hashSet.add(OptionDialogActivity.class.getCanonicalName());
        hashSet.add(TakePictureActivity.class.getCanonicalName());
        hashSet.add(TorchActivity.class.getCanonicalName());
        new C4105a().start();
    }

    /* synthetic */ ActiveApplicationConstraint(Parcel parcel, C4105a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m16125D1() {
        this.m_active = true;
        this.m_foreground = true;
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    /* renamed from: k3 */
    private boolean m16130k3() {
        boolean z;
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) mo27827K0().getSystemService("activity")).getRunningServices(1000);
        try {
            if (Build.VERSION.SDK_INT < 24) {
                Process exec = Runtime.getRuntime().exec("/system/bin/ps");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                char[] cArr = new char[SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                }
                bufferedReader.close();
                exec.waitFor();
                String sb2 = sb.toString();
                if (sb2 != null) {
                    Iterator<String> it = this.m_packageNameList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (sb2.contains(it.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
            } else {
                boolean z2 = false;
                for (ActivityManager.RunningServiceInfo next : runningServices) {
                    Iterator<String> it2 = this.m_packageNameList.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        String str = next.process;
                        if (str != null && str.contains(next2)) {
                            z2 = true;
                        }
                    }
                }
                z = z2;
            }
            if (z == this.m_active) {
                return true;
            }
            return false;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.app.usage.UsageEvents$Event} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16131l3() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.Context r2 = r8.mo27827K0()
            java.lang.String r3 = "usagestats"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.usage.UsageStatsManager r2 = (android.app.usage.UsageStatsManager) r2
            r3 = 43200000(0x2932e00, double:2.1343636E-316)
            long r3 = r0 - r3
            r5 = 0
            android.app.usage.UsageEvents r0 = r2.queryEvents(r3, r0)     // Catch:{ Exception -> 0x001b }
            goto L_0x0026
        L_0x001b:
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r0 - r3
            android.app.usage.UsageEvents r0 = r2.queryEvents(r3, r0)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0026
        L_0x0025:
            r0 = r5
        L_0x0026:
            r1 = 0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x002f:
            boolean r3 = r0.hasNextEvent()
            r4 = 1
            if (r3 == 0) goto L_0x0054
            android.app.usage.UsageEvents$Event r3 = new android.app.usage.UsageEvents$Event
            r3.<init>()
            r0.getNextEvent(r3)
            java.util.Set<java.lang.String> r6 = f10691f
            java.lang.String r7 = r3.getClassName()
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x002f
            int r6 = r3.getEventType()
            if (r6 != r4) goto L_0x002f
            r2.add(r3)
            goto L_0x002f
        L_0x0054:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x007e
            int r0 = r2.size()
            int r0 = r0 - r4
            java.lang.Object r0 = r2.get(r0)
            r5 = r0
            android.app.usage.UsageEvents$Event r5 = (android.app.usage.UsageEvents.Event) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Current active app package: "
            r0.append(r2)
            java.lang.String r2 = r5.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
        L_0x007e:
            if (r5 == 0) goto L_0x00b4
            java.util.ArrayList<java.lang.String> r0 = r8.m_packageNameList
            java.util.Iterator r0 = r0.iterator()
        L_0x0086:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0086
            java.lang.String r3 = r5.getPackageName()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00b2
            java.lang.String r3 = "com.android.camera"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = r5.getPackageName()
            java.lang.String r3 = cameraPackage
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0086
        L_0x00b2:
            r0 = 1
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            boolean r2 = r8.m_active
            if (r0 != r2) goto L_0x00ba
            r1 = 1
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.ActiveApplicationConstraint.m16131l3():boolean");
    }

    /* renamed from: n3 */
    private String[] m16132n3() {
        String str;
        String[] strArr = new String[4];
        strArr[0] = MacroDroidApplication.m14845u().getString(C17541R$string.constraint_active_application_running_in_foreground);
        strArr[1] = MacroDroidApplication.m14845u().getString(C17541R$string.constraint_active_application_not_in_foreground);
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.constraint_active_application_alive_in_background));
        int i = Build.VERSION.SDK_INT;
        String str2 = "";
        if (i >= 26) {
            str = " (" + SelectableItem.m15535j1(C17541R$string.not_functional_on_android_oreo) + ")";
        } else {
            str = str2;
        }
        sb.append(str);
        strArr[2] = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MacroDroidApplication.m14845u().getString(C17541R$string.constraint_active_application_not_running));
        if (i >= 26) {
            str2 = " (" + SelectableItem.m15535j1(C17541R$string.not_functional_on_android_oreo) + ")";
        }
        sb2.append(str2);
        strArr[3] = sb2.toString();
        return strArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m16135q3(C10351d dVar, AppCompatDialog appCompatDialog, View view) {
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

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            mo28034m3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_foreground ? this.m_active ^ true ? 1 : 0 : this.m_active ? 2 : 3;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_foreground) {
            if (this.m_active) {
                return mo27827K0().getString(C17541R$string.constraint_active_application_extended_app_forground);
            }
            return mo27827K0().getString(C17541R$string.constraint_active_application_extended_not_forground);
        } else if (this.m_active) {
            return mo27827K0().getString(C17541R$string.constraint_active_application_extended_alive_bg);
        } else {
            return mo27827K0().getString(C17541R$string.constraint_active_application_extended_inactive);
        }
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return (this.m_applicationName == null && this.m_applicationNameList.size() == 0) ? false : true;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
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

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        ActivityManager activityManager = (ActivityManager) mo27827K0().getSystemService("activity");
        if (this.m_packageName != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.m_packageNameList = arrayList;
            arrayList.add(this.m_packageName);
        }
        if (this.m_foreground) {
            return m16131l3();
        }
        return m16130k3();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7592a.m31597u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16132n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m3 */
    public void mo28034m3(List<C4013g> list) {
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
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.non_launchable_checkbox);
            SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
            ((ViewGroup) appCompatDialog.findViewById(C17532R$id.include_exclude_options)).setVisibility(0);
            ((RadioGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
            C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
            ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
            dVar.getFilter().mo41019a("", false);
            checkBox.setOnCheckedChangeListener(new C4232c(dVar, searchView));
            searchView.setOnQueryTextListener(new C4106b(dVar, checkBox));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C4220a(appCompatDialog));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C4226b(this, dVar, appCompatDialog));
            appCompatDialog.show();
            appCompatDialog.getWindow().setAttributes(layoutParams);
        }
    }

    /* renamed from: s2 */
    public boolean mo27866s2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        new C4049q(this, mo27850j0(), true, false, mo28116a3()).execute((Object[]) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_active ? 1 : 0);
        parcel.writeInt(this.m_foreground ? 1 : 0);
        parcel.writeString(this.m_packageName);
        parcel.writeString(this.m_applicationName);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = false;
        this.m_active = i == 0 || i == 2;
        if (i < 2) {
            z = true;
        }
        this.m_foreground = z;
    }

    public ActiveApplicationConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ActiveApplicationConstraint() {
        m16125D1();
    }

    private ActiveApplicationConstraint(Parcel parcel) {
        super(parcel);
        m16125D1();
        boolean z = true;
        this.m_active = parcel.readInt() != 0;
        this.m_foreground = parcel.readInt() == 0 ? false : z;
        this.m_packageName = parcel.readString();
        this.m_applicationName = parcel.readString();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
    }
}
