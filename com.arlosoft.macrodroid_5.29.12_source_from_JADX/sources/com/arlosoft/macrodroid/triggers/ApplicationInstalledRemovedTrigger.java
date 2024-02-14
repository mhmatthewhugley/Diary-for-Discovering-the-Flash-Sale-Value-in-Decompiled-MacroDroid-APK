package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.ApplicationInstalledRemovedTriggerReceiver;
import com.arlosoft.macrodroid.utils.C6378f;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p119k3.C7487d;
import p148q0.C8151a;
import p187x0.C10351d;

public class ApplicationInstalledRemovedTrigger extends Trigger implements C4049q.C4050a {
    public static final Parcelable.Creator<ApplicationInstalledRemovedTrigger> CREATOR = new C5596b();
    private static ApplicationInstalledRemovedTriggerReceiver s_appInstallRemoveTriggerReceiver;
    private static final String[] s_optionsApplications = {SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application), SelectableItem.m15535j1(C17541R$string.select_applications)};
    private static int s_triggerCounter;
    private ArrayList<String> m_applicationNameList;
    private int m_applicationOption;
    private boolean m_installed;
    private ArrayList<String> m_packageNameList;
    private boolean m_updated;

    /* renamed from: com.arlosoft.macrodroid.triggers.ApplicationInstalledRemovedTrigger$a */
    class C5595a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f13572a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f13573b;

        C5595a(C10351d dVar, CheckBox checkBox) {
            this.f13572a = dVar;
            this.f13573b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f13572a.getFilter().mo41019a(str, this.f13573b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ApplicationInstalledRemovedTrigger$b */
    class C5596b implements Parcelable.Creator<ApplicationInstalledRemovedTrigger> {
        C5596b() {
        }

        /* renamed from: a */
        public ApplicationInstalledRemovedTrigger createFromParcel(Parcel parcel) {
            return new ApplicationInstalledRemovedTrigger(parcel, (C5595a) null);
        }

        /* renamed from: b */
        public ApplicationInstalledRemovedTrigger[] newArray(int i) {
            return new ApplicationInstalledRemovedTrigger[i];
        }
    }

    /* synthetic */ ApplicationInstalledRemovedTrigger(Parcel parcel, C5595a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m21467D1() {
        this.m_installed = true;
        this.m_updated = false;
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    /* renamed from: n3 */
    private void m21474n3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) s_optionsApplications, this.m_applicationOption, (DialogInterface.OnClickListener) C5904e.f14001a);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5892d(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C5880c(this));
    }

    /* renamed from: r3 */
    private String[] m21475r3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_application_installed_removed_installed), SelectableItem.m15535j1(C17541R$string.trigger_application_installed_removed_updated), SelectableItem.m15535j1(C17541R$string.trigger_application_installed_removed_removed)};
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m21478v3(C10351d dVar, AppCompatDialog appCompatDialog, View view) {
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
    /* renamed from: w3 */
    public static /* synthetic */ void m21479w3(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m21480x3(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            this.m_applicationOption = 0;
            mo24689O1();
            return;
        }
        this.m_applicationOption = 1;
        m21482z3();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m21481y3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: z3 */
    private void m21482z3() {
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.trigger_accent)).execute((Object[]) null);
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        Iterator<C4013g> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4013g next = it.next();
            if (next.f10397b.equals("com.arlosoft.macrodroid")) {
                list.remove(next);
                break;
            }
        }
        if (mo27836X() && z) {
            mo30912m3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.m_updated) {
            return 1;
        }
        return this.m_installed ? 0 : 2;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_updated ? m21475r3()[1] : this.m_installed ? m21475r3()[0] : m21475r3()[2];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_applicationOption == 0) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application);
        }
        return this.m_applicationNameList.toString();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_appInstallRemoveTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_appInstallRemoveTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7487d.m31122u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        sb.append(" (");
        if (this.m_applicationOption == 0) {
            str = SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application);
        } else {
            str = C6413o0.m24694c(this.m_applicationNameList.toString(), 15);
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_appInstallRemoveTriggerReceiver = new ApplicationInstalledRemovedTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            MacroDroidApplication.m14845u().registerReceiver(s_appInstallRemoveTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "com.test.package.name");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21475r3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        sb.append(" (");
        if (this.m_applicationOption == 0) {
            str = SelectableItem.m15535j1(C17541R$string.trigger_notification_any_application);
        } else {
            str = this.m_applicationNameList.toString();
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m3 */
    public void mo30912m3(List<C4013g> list) {
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
        ((RadioGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
        C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
        ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
        dVar.getFilter().mo41019a("", false);
        checkBox.setOnCheckedChangeListener(new C5940h(dVar, searchView));
        searchView.setOnQueryTextListener(new C5595a(dVar, checkBox));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5916f(appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5928g(this, dVar, appCompatDialog));
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: o3 */
    public boolean mo30913o3() {
        return this.m_applicationOption == 0;
    }

    /* renamed from: p3 */
    public boolean mo30914p3() {
        return this.m_installed;
    }

    /* renamed from: q3 */
    public boolean mo30915q3() {
        return this.m_updated;
    }

    /* renamed from: s3 */
    public List<String> mo30916s3() {
        return this.m_packageNameList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m21474n3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_installed ? 1 : 0);
        parcel.writeInt(this.m_updated ? 1 : 0);
        parcel.writeInt(this.m_applicationOption);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = false;
        this.m_installed = i == 0;
        if (i == 1) {
            z = true;
        }
        this.m_updated = z;
    }

    public ApplicationInstalledRemovedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ApplicationInstalledRemovedTrigger() {
        m21467D1();
    }

    private ApplicationInstalledRemovedTrigger(Parcel parcel) {
        super(parcel);
        m21467D1();
        boolean z = true;
        this.m_installed = parcel.readInt() != 0;
        this.m_updated = parcel.readInt() == 0 ? false : z;
        this.m_applicationOption = parcel.readInt();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
    }
}
