package com.arlosoft.macrodroid.action.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.common.AppNotificationState;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4049q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p257f0.C12195a;
import p257f0.C12196b;
import p257f0.C12197c;

public class ConfigureNotificationsStateActivity extends MacroDroidDialogBaseActivity implements C4049q.C4050a {

    /* renamed from: f */
    private transient String[] f7763f;

    /* renamed from: g */
    private transient String[] f7764g;

    /* renamed from: o */
    private ListView f7765o;

    /* renamed from: p */
    private C2821a f7766p;

    /* renamed from: s */
    private ArrayList<AppNotificationState> f7767s;

    /* renamed from: z */
    private int f7768z = 1;

    /* renamed from: com.arlosoft.macrodroid.action.activities.ConfigureNotificationsStateActivity$a */
    public class C2821a extends ArrayAdapter<AppNotificationState> {

        /* renamed from: a */
        private ArrayList<AppNotificationState> f7769a;

        /* renamed from: com.arlosoft.macrodroid.action.activities.ConfigureNotificationsStateActivity$a$a */
        class C2822a implements AdapterView.OnItemSelectedListener {

            /* renamed from: a */
            final /* synthetic */ AppNotificationState f7771a;

            C2822a(AppNotificationState appNotificationState) {
                this.f7771a = appNotificationState;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                this.f7771a.mo27702d(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        public C2821a(Context context, int i, int i2, ArrayList<AppNotificationState> arrayList) {
            super(context, i, i2, arrayList);
            this.f7769a = arrayList;
        }

        /* renamed from: a */
        public ArrayList<AppNotificationState> mo26166a() {
            return this.f7769a;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            AppNotificationState appNotificationState = this.f7769a.get(i);
            if (view == null) {
                view = ((LayoutInflater) ConfigureNotificationsStateActivity.this.getSystemService("layout_inflater")).inflate(C17535R$layout.configure_notification_states_item, (ViewGroup) null);
            }
            ((TextView) view.findViewById(C17532R$id.configure_notification_item_app_name)).setText(this.f7769a.get(i).mo27699a());
            Spinner spinner = (Spinner) view.findViewById(C17532R$id.configure_notification_item_state);
            spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            spinner.setSelection(appNotificationState.mo27700b());
            spinner.setOnItemSelectedListener(new C2822a(appNotificationState));
            return view;
        }
    }

    /* renamed from: N1 */
    private void m13911N1() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f7763f.length; i++) {
            AppNotificationState appNotificationState = new AppNotificationState(this.f7763f[i], this.f7764g[i], 0);
            AppNotificationState appNotificationState2 = null;
            Iterator<AppNotificationState> it = this.f7767s.iterator();
            while (true) {
                if (it.hasNext()) {
                    AppNotificationState next = it.next();
                    if (next != null && next.mo27701c() != null && next.mo27701c().equals(appNotificationState.mo27701c())) {
                        appNotificationState2 = next;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appNotificationState2 != null) {
                arrayList.add(appNotificationState2);
            } else {
                arrayList.add(appNotificationState);
            }
        }
        C2821a aVar = new C2821a(this, C17535R$layout.configure_notification_states_item, C17532R$id.configure_notification_item_app_name, arrayList);
        this.f7766p = aVar;
        this.f7765o.setAdapter(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m13912O1(View view) {
        setResult(0, new Intent());
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m13913P1(View view) {
        Intent intent = new Intent();
        setResult(-1, intent);
        C2821a aVar = this.f7766p;
        if (aVar != null) {
            intent.putExtra("AppNotifications", aVar.mo26166a());
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m13914Q1(View view) {
        Iterator<AppNotificationState> it = this.f7766p.mo26166a().iterator();
        while (it.hasNext()) {
            it.next().mo27702d(this.f7768z);
        }
        int i = this.f7768z + 1;
        this.f7768z = i;
        if (i > 2) {
            this.f7768z = 0;
        }
        this.f7766p.notifyDataSetChanged();
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        this.f7763f = new String[list.size()];
        this.f7764g = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C4013g gVar = list.get(i);
            this.f7763f[i] = gVar.f10397b;
            this.f7764g[i] = gVar.f10396a;
        }
        m13911N1();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.configure_notification_states);
        getWindow().setLayout(-1, -1);
        this.f7765o = (ListView) findViewById(C17532R$id.configure_notification_states);
        setTitle(C17541R$string.configure_notifications);
        this.f7767s = new ArrayList<>();
        if (getIntent() != null) {
            Iterator it = getIntent().getParcelableArrayListExtra("AppNotifications").iterator();
            while (it.hasNext()) {
                this.f7767s.add((AppNotificationState) ((Parcelable) it.next()));
            }
        }
        ((Button) findViewById(C17532R$id.cancelButton)).setOnClickListener(new C12195a(this));
        ((Button) findViewById(C17532R$id.okButton)).setOnClickListener(new C12197c(this));
        ((Button) findViewById(C17532R$id.configure_notification_states_button_toggle)).setOnClickListener(new C12196b(this));
    }

    public void onResume() {
        super.onResume();
        if (this.f7763f == null || this.f7764g == null) {
            new C4049q(this, this, true, false, ContextCompat.getColor(this, C17528R$color.actions_accent)).execute((Object[]) null);
            return;
        }
        m13911N1();
    }
}
