package com.arlosoft.macrodroid.stopwatch;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.stopwatch.StopwatchesAdapter;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.Iterator;
import java.util.List;
import p057a2.C2218g;
import p057a2.C2224m;
import p149q1.C8152a;
import p149q1.C8153b;
import p149q1.C8160i;
import p183w2.C10330a;
import p183w2.C17491b;
import p183w2.C17493d;
import p183w2.C17494e;
import p183w2.C17495f;
import p183w2.C17496g;
import p183w2.C17497h;
import p183w2.C17498i;

public class StopWatchesActivity extends MacroDroidBaseActivity implements StopwatchesAdapter.C5219b {
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;

    /* renamed from: o */
    private StopwatchesAdapter f13024o;
    @BindView(2131363593)
    RecyclerView recyclerView;
    @BindView(2131364301)
    ViewFlipper viewFlipper;

    /* renamed from: com.arlosoft.macrodroid.stopwatch.StopWatchesActivity$a */
    class C5215a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13025a;

        /* renamed from: c */
        final /* synthetic */ EditText f13026c;

        C5215a(Button button, EditText editText) {
            this.f13025a = button;
            this.f13026c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13025a.setEnabled(this.f13026c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.stopwatch.StopWatchesActivity$b */
    class C5216b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13028a;

        /* renamed from: c */
        final /* synthetic */ EditText f13029c;

        C5216b(Button button, EditText editText) {
            this.f13028a = button;
            this.f13029c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13028a.setEnabled(this.f13029c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: Y1 */
    private void m20353Y1(Constraint constraint, String str, String str2) {
        m20368n2(constraint, str, str2);
        m20370p2(constraint, str, str2);
        if (constraint instanceof LogicConstraint) {
            for (Constraint Y1 : ((LogicConstraint) constraint).mo27826J0()) {
                m20353Y1(Y1, str, str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r3 = r1.getActions().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r3.hasNext() == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r4 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if ((r4 instanceof com.arlosoft.macrodroid.action.StopWatchAction) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r7.equals(((com.arlosoft.macrodroid.action.StopWatchAction) r4).mo24430G()) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r1 = r1.getConstraints().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r1.hasNext() == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r3 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if ((r3 instanceof com.arlosoft.macrodroid.constraint.StopWatchConstraint) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r7.equals(((com.arlosoft.macrodroid.constraint.StopWatchConstraint) r3).mo24430G()) == false) goto L_0x006b;
     */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20354Z1(java.lang.String r7) {
        /*
            r6 = this;
            com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r0 = r0.mo29710z()
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r0.next()
            com.arlosoft.macrodroid.macro.Macro r1 = (com.arlosoft.macrodroid.macro.Macro) r1
            java.util.ArrayList r3 = r1.getTriggerList()
            java.util.Iterator r3 = r3.iterator()
        L_0x0021:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r3.next()
            com.arlosoft.macrodroid.triggers.Trigger r4 = (com.arlosoft.macrodroid.triggers.Trigger) r4
            boolean r5 = r4 instanceof com.arlosoft.macrodroid.triggers.StopwatchTrigger
            if (r5 == 0) goto L_0x0021
            com.arlosoft.macrodroid.triggers.StopwatchTrigger r4 = (com.arlosoft.macrodroid.triggers.StopwatchTrigger) r4
            java.lang.String r4 = r4.mo24430G()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0021
            goto L_0x0089
        L_0x003e:
            java.util.ArrayList r3 = r1.getActions()
            java.util.Iterator r3 = r3.iterator()
        L_0x0046:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()
            com.arlosoft.macrodroid.action.Action r4 = (com.arlosoft.macrodroid.action.Action) r4
            boolean r5 = r4 instanceof com.arlosoft.macrodroid.action.StopWatchAction
            if (r5 == 0) goto L_0x0046
            com.arlosoft.macrodroid.action.StopWatchAction r4 = (com.arlosoft.macrodroid.action.StopWatchAction) r4
            java.lang.String r4 = r4.mo24430G()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0046
            goto L_0x0089
        L_0x0063:
            java.util.List r1 = r1.getConstraints()
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r1.next()
            com.arlosoft.macrodroid.constraint.Constraint r3 = (com.arlosoft.macrodroid.constraint.Constraint) r3
            boolean r4 = r3 instanceof com.arlosoft.macrodroid.constraint.StopWatchConstraint
            if (r4 == 0) goto L_0x006b
            com.arlosoft.macrodroid.constraint.StopWatchConstraint r3 = (com.arlosoft.macrodroid.constraint.StopWatchConstraint) r3
            java.lang.String r3 = r3.mo24430G()
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x006b
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            if (r2 != 0) goto L_0x008f
            r6.m20357c2(r7)
            goto L_0x00d2
        L_0x008f:
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r1 = 2132017831(0x7f1402a7, float:1.9673952E38)
            r0.<init>(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131953020(0x7f13057c, float:1.95425E38)
            java.lang.String r2 = r6.getString(r2)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            androidx.appcompat.app.AlertDialog$Builder r1 = r0.setTitle((java.lang.CharSequence) r1)
            r2 = 2131954948(0x7f130d04, float:1.954641E38)
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setMessage((int) r2)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            w2.c r3 = new w2.c
            r3.<init>(r6, r7)
            androidx.appcompat.app.AlertDialog$Builder r7 = r1.setPositiveButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            r7.setNegativeButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r0.show()
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.stopwatch.StopWatchesActivity.m20354Z1(java.lang.String):void");
    }

    /* renamed from: a2 */
    private void m20355a2() {
        if (C5163j2.m20277u6(this)) {
            this.infoCardView.setVisibility(8);
            return;
        }
        this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.stopwatches_primary));
        this.infoCardTitle.setText(C17541R$string.stopwatches);
        this.infoCardDetail.setText(C17541R$string.stopwatches_info_card);
        this.infoCardGotIt.setOnClickListener(new C17496g(this));
    }

    /* renamed from: b2 */
    private void m20356b2(@NonNull List<String> list) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_StopWatches);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_new_stopwatch);
        appCompatDialog.setTitle((int) C17541R$string.action_stop_watch_create_new);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363335);
        editText.addTextChangedListener(new C5216b(button, editText));
        button.setOnClickListener(new C17498i(this, editText, list, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C17494e(appCompatDialog));
        appCompatDialog.show();
        appCompatDialog.getWindow().setSoftInputMode(5);
    }

    /* renamed from: c2 */
    private void m20357c2(String str) {
        List<String> e = C10330a.m40553e(this);
        e.remove(str);
        C10330a.m40557i(this, e);
        C10330a.m40549a(str);
        if (e.size() > 0) {
            this.viewFlipper.setDisplayedChild(0);
            this.f13024o.mo30169R(e);
            return;
        }
        this.viewFlipper.setDisplayedChild(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void m20358d2(String str, DialogInterface dialogInterface, int i) {
        m20357c2(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void m20359e2(View view) {
        C5163j2.m20001K2(getApplicationContext());
        this.infoCardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m20360f2(EditText editText, List list, AppCompatDialog appCompatDialog, View view) {
        String obj = editText.getText().toString();
        if (list.contains(obj)) {
            m20369o2();
            return;
        }
        list.add(obj);
        C10330a.m40557i(this, list);
        appCompatDialog.dismiss();
        if (list.size() > 0) {
            this.viewFlipper.setDisplayedChild(0);
            this.f13024o.mo30169R(list);
            return;
        }
        this.viewFlipper.setDisplayedChild(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m20362h2(String str, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m20367m2(str);
        } else {
            m20354Z1(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m20363i2(EditText editText, String str, AppCompatDialog appCompatDialog, View view) {
        List<String> e = C10330a.m40553e(this);
        String obj = editText.getText().toString();
        if (e.contains(obj)) {
            m20369o2();
            return;
        }
        m20366l2(str, obj);
        e.remove(str);
        e.add(obj);
        C10330a.m40557i(this, e);
        appCompatDialog.dismiss();
        this.f13024o.mo30169R(e);
    }

    /* renamed from: l2 */
    private void m20366l2(String str, String str2) {
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                m20368n2(next2, str, str2);
                m20370p2(next2, str, str2);
                for (Constraint Y1 : next2.mo27826J0()) {
                    m20353Y1(Y1, str, str2);
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                Action next3 = it2.next();
                m20368n2(next3, str, str2);
                m20370p2(next3, str, str2);
                for (Constraint Y12 : next3.mo27826J0()) {
                    m20353Y1(Y12, str, str2);
                }
                if (next3 instanceof WaitUntilTriggerAction) {
                    Iterator<Trigger> it3 = ((WaitUntilTriggerAction) next3).mo26117B3().iterator();
                    while (it3.hasNext()) {
                        Trigger next4 = it3.next();
                        m20368n2(next4, str, str2);
                        m20370p2(next4, str, str2);
                        for (Constraint Y13 : next4.mo27826J0()) {
                            m20353Y1(Y13, str, str2);
                        }
                    }
                }
            }
            for (Constraint Y14 : next.getConstraints()) {
                m20353Y1(Y14, str, str2);
            }
        }
        C8152a M = C5163j2.m20012M(MacroDroidApplication.m14845u());
        for (C8153b next5 : M.drawerItems) {
            if (next5 instanceof C8160i) {
                C8160i iVar = (C8160i) next5;
                if (iVar.getStopwatchName().equals(str)) {
                    iVar.setStopwatchName(str2);
                }
            }
        }
        C5163j2.m19974G3(MacroDroidApplication.m14845u(), M);
        C4934n.m18998M().mo29702s0();
    }

    /* renamed from: m2 */
    private void m20367m2(String str) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_StopWatches);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_new_stopwatch);
        appCompatDialog.setTitle((int) C17541R$string.local_variable_rename);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(2131363335);
        editText.setText(str);
        editText.addTextChangedListener(new C5215a(button, editText));
        button.setOnClickListener(new C17497h(this, editText, str, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C17495f(appCompatDialog));
        appCompatDialog.show();
        appCompatDialog.getWindow().setSoftInputMode(5);
    }

    /* renamed from: n2 */
    private void m20368n2(SelectableItem selectableItem, String str, String str2) {
        if (selectableItem instanceof C2224m) {
            C2224m mVar = (C2224m) selectableItem;
            String[] F = mVar.mo24440F();
            for (int i = 0; i < F.length; i++) {
                if (!TextUtils.isEmpty(F[i])) {
                    if (F[i].contains("stopwatch=" + str)) {
                        F[i] = F[i].replace("stopwatch=" + str, "stopwatch=" + str2);
                    }
                }
                if (!TextUtils.isEmpty(F[i])) {
                    if (F[i].contains("stopwatchtime=" + str)) {
                        F[i] = F[i].replace("stopwatchtime=" + str, "stopwatchtime=" + str2);
                    }
                }
            }
            mVar.mo24441I(F);
        }
    }

    /* renamed from: o2 */
    private void m20369o2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_StopWatches);
        builder.setTitle((int) C17541R$string.error);
        builder.setMessage((int) C17541R$string.action_stop_watch_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C17493d.f69298a);
        builder.show();
    }

    /* renamed from: p2 */
    private void m20370p2(SelectableItem selectableItem, String str, String str2) {
        if (selectableItem instanceof C2218g) {
            C2218g gVar = (C2218g) selectableItem;
            if (str.equals(gVar.mo24430G())) {
                gVar.mo24431x(str2);
            }
        }
    }

    /* renamed from: Z0 */
    public void mo30157Z0(String str) {
        String[] strArr = {getString(C17541R$string.local_variable_rename), getString(C17541R$string.delete)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_StopWatches);
        builder.setTitle((CharSequence) str).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C17491b(this, str));
        builder.show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_stopwatches);
        ButterKnife.bind((Activity) this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(C17541R$string.stopwatches);
        List<String> e = C10330a.m40553e(this);
        this.f13024o = new StopwatchesAdapter(e, this, this);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setAdapter(this.f13024o);
        if (e.size() > 0) {
            this.viewFlipper.setDisplayedChild(0);
        } else {
            this.viewFlipper.setDisplayedChild(1);
        }
        m20355a2();
    }

    public void onDestroy() {
        this.f13024o.mo30166O();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362762})
    public void onPlusButtonClicked() {
        m20356b2(C10330a.m40553e(this));
    }
}
