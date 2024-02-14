package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6378f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p128m0.C7778k0;
import p187x0.C10351d;

public class DisableAppAction extends Action implements C4049q.C4050a {
    public static final Parcelable.Creator<DisableAppAction> CREATOR = new C2403b();
    private ArrayList<String> m_applicationNameList;
    private int m_option;
    private ArrayList<String> m_packageNameList;

    /* renamed from: com.arlosoft.macrodroid.action.DisableAppAction$a */
    class C2402a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7214a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f7215b;

        C2402a(C10351d dVar, CheckBox checkBox) {
            this.f7214a = dVar;
            this.f7215b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            this.f7214a.getFilter().mo41019a(str, this.f7215b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DisableAppAction$b */
    class C2403b implements Parcelable.Creator<DisableAppAction> {
        C2403b() {
        }

        /* renamed from: a */
        public DisableAppAction createFromParcel(Parcel parcel) {
            return new DisableAppAction(parcel, (C2402a) null);
        }

        /* renamed from: b */
        public DisableAppAction[] newArray(int i) {
            return new DisableAppAction[i];
        }
    }

    /* synthetic */ DisableAppAction(Parcel parcel, C2402a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private void m10415m3(List<C4013g> list) {
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
        ((ViewGroup) appCompatDialog.findViewById(C17532R$id.radio_options)).setVisibility(8);
        checkBox.setVisibility(0);
        C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
        ((ListView) appCompatDialog.findViewById(C17532R$id.application_list)).setAdapter(dVar);
        dVar.getFilter().mo41019a("", false);
        checkBox.setOnCheckedChangeListener(new C3020e4(dVar, searchView));
        searchView.setOnQueryTextListener(new C2402a(dVar, checkBox));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C2963c4(appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C2991d4(this, dVar, appCompatDialog));
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: n3 */
    private String[] m10416n3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m10419q3(C10351d dVar, AppCompatDialog appCompatDialog, View view) {
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
            m10415m3(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_applicationNameList.toString().replace("[", "").replace("]", "");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7778k0.m32472u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Iterator<String> it = this.m_packageNameList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (this.m_option == 0) {
                C4061t1.m15947B0(new String[]{"pm enable " + next});
            } else {
                C4061t1.m15947B0(new String[]{"pm disable " + next});
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10416n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27850j0(), C17528R$color.actions_accent)).execute((Object[]) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.m_packageNameList);
        parcel.writeStringList(this.m_applicationNameList);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public DisableAppAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DisableAppAction() {
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
    }

    private DisableAppAction(Parcel parcel) {
        super(parcel);
        this.m_packageNameList = new ArrayList<>();
        this.m_applicationNameList = new ArrayList<>();
        parcel.readStringList(this.m_packageNameList);
        parcel.readStringList(this.m_applicationNameList);
        this.m_option = parcel.readInt();
    }
}
