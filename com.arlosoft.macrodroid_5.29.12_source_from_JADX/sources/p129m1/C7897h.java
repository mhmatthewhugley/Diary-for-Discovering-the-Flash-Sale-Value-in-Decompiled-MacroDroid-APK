package p129m1;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p129m1.C7894e;
import p319lc.C15626c;

/* renamed from: m1.h */
/* compiled from: ContactsHelper.kt */
public final class C7897h {

    /* renamed from: a */
    public static final C7897h f18975a = new C7897h();

    /* renamed from: m1.h$a */
    /* compiled from: ContactsHelper.kt */
    public static final class C7898a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C7894e f18976a;

        C7898a(C7894e eVar) {
            this.f18976a = eVar;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            this.f18976a.getFilter().filter(str);
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    private C7897h() {
    }

    /* renamed from: c */
    public static final void m33052c(Activity activity, int i, List<? extends Contact> list, Contact contact, boolean z, boolean z2, boolean z3, C7893a aVar) {
        boolean z4 = z;
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(list, "contactList");
        C13706o.m87929f(aVar, "contactSelectionListener");
        if (!((MacroDroidBaseActivity) activity).mo27315N1()) {
            List<Contact> D = C4061t1.m15950D(activity);
            if (z2) {
                D.add(0, new Contact("-4", C4061t1.f10627g, "-4"));
            }
            if (z3) {
                D.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
            }
            D.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
            D.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
            ArrayList arrayList = new ArrayList();
            int size = D.size();
            for (int i2 = 0; i2 < size; i2++) {
                boolean z5 = true;
                boolean z6 = contact != null && C13706o.m87924a(D.get(i2).mo27713g(), contact.mo27713g());
                Iterator<? extends Contact> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C13706o.m87924a(D.get(i2).mo27713g(), ((Contact) it.next()).mo27713g())) {
                            break;
                        }
                    } else {
                        z5 = z6;
                        break;
                    }
                }
                arrayList.add(Boolean.valueOf(z5));
            }
            int i3 = i;
            AppCompatDialog appCompatDialog = new AppCompatDialog(activity, i);
            appCompatDialog.setContentView((int) C17535R$layout.dialog_contact_chooser);
            appCompatDialog.setTitle((int) C17541R$string.select_contacts);
            ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.contacts_list);
            View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
            C13706o.m87926c(findViewById);
            View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
            C13706o.m87926c(findViewById2);
            View findViewById3 = appCompatDialog.findViewById(C17532R$id.radio_include);
            C13706o.m87926c(findViewById3);
            View findViewById4 = appCompatDialog.findViewById(C17532R$id.radio_exclude);
            C13706o.m87926c(findViewById4);
            RadioButton radioButton = (RadioButton) findViewById4;
            SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
            C7894e eVar = new C7894e(activity, D, arrayList, (C7894e.C7896b) null);
            C13706o.m87926c(listView);
            listView.setAdapter(eVar);
            eVar.getFilter().filter("");
            C13706o.m87926c(searchView);
            searchView.setOnQueryTextListener(new C7898a(eVar));
            ((RadioButton) findViewById3).setChecked(!z4);
            radioButton.setChecked(z4);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            C13706o.m87926c(window);
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            ((Button) findViewById2).setOnClickListener(new C15683f(appCompatDialog));
            ((Button) findViewById).setOnClickListener(new C15684g(eVar, aVar, radioButton, appCompatDialog, activity));
            appCompatDialog.show();
            Window window2 = appCompatDialog.getWindow();
            C13706o.m87926c(window2);
            window2.setAttributes(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m33053d(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m33054e(C7894e eVar, C7893a aVar, RadioButton radioButton, AppCompatDialog appCompatDialog, Activity activity, View view) {
        C13706o.m87929f(eVar, "$adapter");
        C13706o.m87929f(aVar, "$contactSelectionListener");
        C13706o.m87929f(radioButton, "$radioExclude");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(activity, "$activity");
        List<Contact> g = eVar.mo37779g();
        C13706o.m87928e(g, "checkedItems");
        if (!g.isEmpty()) {
            aVar.mo31007a(g, radioButton.isChecked());
            appCompatDialog.dismiss();
            return;
        }
        C15626c.makeText(activity, C17541R$string.select_contacts, 1).show();
    }
}
