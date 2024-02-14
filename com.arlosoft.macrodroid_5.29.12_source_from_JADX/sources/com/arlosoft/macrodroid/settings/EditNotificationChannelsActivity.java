package com.arlosoft.macrodroid.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.MessageDialogAction;
import com.arlosoft.macrodroid.action.NotificationAction;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6455x0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p106i2.C7395a;
import p106i2.C7396b;
import p139o1.C7995d;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;

@RequiresApi(26)
/* compiled from: EditNotificationChannelsActivity.kt */
public final class EditNotificationChannelsActivity extends MacroDroidDaggerBaseActivity implements C5120b {

    /* renamed from: A */
    public C6455x0 f12839A;

    /* renamed from: B */
    public Map<Integer, View> f12840B = new LinkedHashMap();

    /* renamed from: s */
    private C7995d f12841s;

    /* renamed from: z */
    private C7396b f12842z;

    /* renamed from: com.arlosoft.macrodroid.settings.EditNotificationChannelsActivity$a */
    /* compiled from: EditNotificationChannelsActivity.kt */
    static final class C5113a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditNotificationChannelsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5113a(EditNotificationChannelsActivity editNotificationChannelsActivity, C13635d<? super C5113a> dVar) {
            super(3, dVar);
            this.this$0 = editNotificationChannelsActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5113a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                EditNotificationChannelsActivity.m19756a2(this.this$0, (C7395a) null, 1, (Object) null);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.EditNotificationChannelsActivity$b */
    /* compiled from: EditNotificationChannelsActivity.kt */
    public static final class C5114b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12843a;

        /* renamed from: c */
        final /* synthetic */ EditText f12844c;

        C5114b(Button button, EditText editText) {
            this.f12843a = button;
            this.f12844c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f12843a;
            if (button != null) {
                button.setEnabled(this.f12844c.getText().length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: V1 */
    private final void m19752V1(boolean z) {
        C7995d dVar = null;
        if (z) {
            C7995d dVar2 = this.f12841s;
            if (dVar2 == null) {
                C13706o.m87945v("binding");
                dVar2 = null;
            }
            dVar2.f19241d.setVisibility(0);
            C7995d dVar3 = this.f12841s;
            if (dVar3 == null) {
                C13706o.m87945v("binding");
            } else {
                dVar = dVar3;
            }
            dVar.f19242e.setVisibility(8);
            return;
        }
        C7995d dVar4 = this.f12841s;
        if (dVar4 == null) {
            C13706o.m87945v("binding");
            dVar4 = null;
        }
        dVar4.f19241d.setVisibility(8);
        C7995d dVar5 = this.f12841s;
        if (dVar5 == null) {
            C13706o.m87945v("binding");
        } else {
            dVar = dVar5;
        }
        dVar.f19242e.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m19753X1(String[] strArr, EditNotificationChannelsActivity editNotificationChannelsActivity, C7395a aVar, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(editNotificationChannelsActivity, "this$0");
        C13706o.m87929f(aVar, "$notificationChannel");
        if (C13706o.m87924a(strArr[i], editNotificationChannelsActivity.getString(C17541R$string.edit))) {
            editNotificationChannelsActivity.m19755Z1(aVar);
        } else if (C13706o.m87924a(strArr[i], editNotificationChannelsActivity.getString(C17541R$string.delete))) {
            editNotificationChannelsActivity.mo30094W1().mo32507c(aVar.mo37426a());
            editNotificationChannelsActivity.refresh();
        }
    }

    /* renamed from: Y1 */
    private final void m19754Y1(String str, String str2) {
        boolean z = false;
        for (Macro actions : C4934n.m18998M().mo29710z()) {
            Iterator<Action> it = actions.getActions().iterator();
            while (it.hasNext()) {
                Action next = it.next();
                if ((next instanceof NotificationAction) && !(next instanceof MessageDialogAction)) {
                    z = z || ((NotificationAction) next).mo25381g4(str, str2);
                }
            }
        }
        if (z) {
            C4934n.m18998M().mo29702s0();
        }
    }

    /* renamed from: Z1 */
    private final void m19755Z1(C7395a aVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this);
        appCompatDialog.setContentView((int) C17535R$layout.notification_channel_dialog);
        appCompatDialog.setTitle((int) C17541R$string.notification_channel);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        View findViewById = appCompatDialog.findViewById(C17532R$id.noticationChannel);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.prioritySpinner);
        editText.setHint(C17541R$string.trigger_cell_tower_enter_group_name_hint);
        int[] intArray = getResources().getIntArray(C17525R$array.notification_priority_values_int);
        C13706o.m87928e(intArray, "resources.getIntArray(R.…tion_priority_values_int)");
        if (aVar != null) {
            editText.setText(aVar.mo37426a());
            C4666m.m18154v(editText);
            int indexOf = C13596m.m87608g0(intArray).indexOf(Integer.valueOf(aVar.mo37427b()));
            if (spinner != null) {
                spinner.setSelection(indexOf);
            }
        } else if (spinner != null) {
            spinner.setSelection(2);
        }
        editText.addTextChangedListener(new C5114b(button, editText));
        if (button != null) {
            button.setEnabled(editText.getText().length() > 0);
        }
        if (button != null) {
            button.setOnClickListener(new C5199v(editText, aVar, this, spinner, intArray, appCompatDialog));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C5202w(appCompatDialog));
        }
        appCompatDialog.show();
    }

    /* renamed from: a2 */
    static /* synthetic */ void m19756a2(EditNotificationChannelsActivity editNotificationChannelsActivity, C7395a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        editNotificationChannelsActivity.m19755Z1(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m19757b2(EditText editText, C7395a aVar, EditNotificationChannelsActivity editNotificationChannelsActivity, Spinner spinner, int[] iArr, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(editText, "$notificationChannel");
        C13706o.m87929f(editNotificationChannelsActivity, "this$0");
        C13706o.m87929f(iArr, "$priorityValues");
        C13706o.m87929f(appCompatDialog, "$dialog");
        String obj = editText.getText().toString();
        if (aVar != null || !editNotificationChannelsActivity.mo30094W1().mo32508e(obj)) {
            if (aVar != null) {
                editNotificationChannelsActivity.mo30094W1().mo32507c(aVar.mo37426a());
                if (!C13706o.m87924a(aVar.mo37426a(), obj)) {
                    editNotificationChannelsActivity.m19754Y1(aVar.mo37426a(), obj);
                }
            }
            editNotificationChannelsActivity.mo30094W1().mo32506b(obj, iArr[spinner != null ? spinner.getSelectedItemPosition() : 0]);
            appCompatDialog.dismiss();
            editNotificationChannelsActivity.refresh();
            return;
        }
        C15626c.makeText(editNotificationChannelsActivity.getApplicationContext(), C17541R$string.notification_channel_already_exists, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m19758c2(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.cancel();
    }

    private final void refresh() {
        this.f12842z = mo30094W1().mo32509f();
        C7995d dVar = this.f12841s;
        C7396b bVar = null;
        if (dVar == null) {
            C13706o.m87945v("binding");
            dVar = null;
        }
        RecyclerView recyclerView = dVar.f19242e;
        C7396b bVar2 = this.f12842z;
        if (bVar2 == null) {
            C13706o.m87945v("notificationChannelList");
            bVar2 = null;
        }
        recyclerView.setAdapter(new C5212z(bVar2, this));
        C7396b bVar3 = this.f12842z;
        if (bVar3 == null) {
            C13706o.m87945v("notificationChannelList");
        } else {
            bVar = bVar3;
        }
        m19752V1(bVar.mo37428a().isEmpty());
    }

    /* renamed from: I0 */
    public void mo30092I0(C7395a aVar) {
        C13706o.m87929f(aVar, "notificationChannel");
        String[] strArr = {getString(C17541R$string.edit), getString(C17541R$string.delete)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((CharSequence) aVar.mo37426a()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C5196u(strArr, this, aVar));
        builder.show();
    }

    /* renamed from: U1 */
    public View mo30093U1(int i) {
        Map<Integer, View> map = this.f12840B;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: W1 */
    public final C6455x0 mo30094W1() {
        C6455x0 x0Var = this.f12839A;
        if (x0Var != null) {
            return x0Var;
        }
        C13706o.m87945v("notificationChannelUtil");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7995d c = C7995d.m33307c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f12841s = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        setTitle(C17541R$string.notification_channels);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) mo30093U1(C17532R$id.addChannelFab);
        C13706o.m87928e(floatingActionButton, "addChannelFab");
        C4666m.m18147o(floatingActionButton, (C13640g) null, new C5113a(this, (C13635d<? super C5113a>) null), 1, (Object) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        refresh();
    }
}
