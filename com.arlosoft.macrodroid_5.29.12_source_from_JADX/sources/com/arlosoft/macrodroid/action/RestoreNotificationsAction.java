package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import androidx.annotation.RequiresApi;
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
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.NotificationService;
import com.arlosoft.macrodroid.utils.C6378f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p128m0.C7868w2;
import p187x0.C10351d;

public class RestoreNotificationsAction extends Action implements C4049q.C4050a {
    public static final Parcelable.Creator<RestoreNotificationsAction> CREATOR = new C2607b();
    private static final int OPTION_CONTAINS = 2;
    private static final int OPTION_EXACT_MATCH = 1;
    private static final int OPTION_EXCLUDES = 3;
    private static final int OPTION_MATCH_ALL = 0;
    private static final int OPTION_RESTORE_ALL = 0;
    private static final int OPTION_SELECT_APPS = 1;
    private ArrayList<String> m_applicationNameList;
    private boolean m_excludes;
    private int m_option;
    private ArrayList<String> m_packageNameList;

    /* renamed from: com.arlosoft.macrodroid.action.RestoreNotificationsAction$a */
    class C2606a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7486a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f7487b;

        C2606a(C10351d dVar, CheckBox checkBox) {
            this.f7486a = dVar;
            this.f7487b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f7486a.getFilter().mo41019a(str, this.f7487b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.RestoreNotificationsAction$b */
    class C2607b implements Parcelable.Creator<RestoreNotificationsAction> {
        C2607b() {
        }

        /* renamed from: a */
        public RestoreNotificationsAction createFromParcel(Parcel parcel) {
            return new RestoreNotificationsAction(parcel, (C2606a) null);
        }

        /* renamed from: b */
        public RestoreNotificationsAction[] newArray(int i) {
            return new RestoreNotificationsAction[i];
        }
    }

    /* synthetic */ RestoreNotificationsAction(Parcel parcel, C2606a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private void m12066m3(List<C4013g> list) {
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
                checkBox.setOnCheckedChangeListener(new C3598xe(dVar, searchView));
                searchView.setOnQueryTextListener(new C2606a(dVar, checkBox));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3543ve(appCompatDialog));
                ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3571we(this, dVar, radioButton, appCompatDialog));
                appCompatDialog.show();
                appCompatDialog.getWindow().setAttributes(layoutParams);
                return;
            }
        }
    }

    /* renamed from: n3 */
    private String[] m12067n3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_restore_hidden_notifications_restore_all), MacroDroidApplication.m14845u().getString(C17541R$string.select_applications)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m12070q3(C10351d dVar, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
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
            mo24689O1();
        }
    }

    /* renamed from: r3 */
    private void m12071r3(StatusBarNotification statusBarNotification) {
        NotificationService.m24188m(mo27827K0(), statusBarNotification.getKey());
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        if (mo27836X() && z) {
            m12066m3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_option == 0) {
            return SelectableItem.m15535j1(C17541R$string.all_applications);
        }
        return this.m_applicationNameList.toString().replace("[", "").replace("]", "");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7868w2.m32915v();
    }

    @RequiresApi(api = 26)
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = 0;
        if (this.m_option != 0) {
            StatusBarNotification[] e = NotificationService.m24180e();
            ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
            for (StatusBarNotification add : e) {
                arrayList.add(add);
            }
            Iterator<String> it = this.m_packageNameList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                for (StatusBarNotification statusBarNotification : e) {
                    if (statusBarNotification.getPackageName().equals(next)) {
                        if (!this.m_excludes) {
                            m12071r3(statusBarNotification);
                        } else {
                            arrayList.remove(statusBarNotification);
                        }
                    }
                }
            }
            if (this.m_excludes) {
                for (StatusBarNotification r3 : arrayList) {
                    m12071r3(r3);
                }
            }
        } else if (!this.m_excludes) {
            StatusBarNotification[] e2 = NotificationService.m24180e();
            int length = e2.length;
            while (i < length) {
                m12071r3(e2[i]);
                i++;
            }
        } else {
            StatusBarNotification[] e3 = NotificationService.m24180e();
            int length2 = e3.length;
            while (i < length2) {
                m12071r3(e3[i]);
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12067n3();
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_option == 0) {
            mo24689O1();
            return;
        }
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.m_excludes ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public RestoreNotificationsAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private RestoreNotificationsAction() {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private RestoreNotificationsAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.m_excludes = parcel.readInt() != 0;
    }
}
