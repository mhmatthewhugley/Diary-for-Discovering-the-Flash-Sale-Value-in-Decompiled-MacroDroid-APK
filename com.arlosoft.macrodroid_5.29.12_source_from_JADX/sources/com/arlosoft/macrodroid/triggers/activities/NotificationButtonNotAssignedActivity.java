package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.NotificationButtonTrigger;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import p149q1.C8157f;

public class NotificationButtonNotAssignedActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: s */
    C5070a f13803s;

    /* renamed from: z */
    C4083b f13804z;

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m23885T1(int i, View view) {
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(this);
        if (this.f13804z.mo28009e().mo28008a() || size < f0) {
            finish();
            Macro macro = new Macro();
            NotificationButtonTrigger notificationButtonTrigger = new NotificationButtonTrigger();
            notificationButtonTrigger.mo31362k3(i);
            macro.setTrigger(notificationButtonTrigger);
            macro.setConfiguringShortcut(true);
            Intent intent = new Intent(this, WizardActivity.class);
            intent.putExtra(C8157f.ITEM_TYPE, macro);
            startActivity(intent);
            return;
        }
        C4061t1.m15957G0(this, this.f13803s);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m23886U1(View view) {
        finish();
    }

    /* renamed from: V1 */
    private void m23887V1(Intent intent) {
        int intExtra = intent.getIntExtra("ButtonId", 0);
        setTitle(C17541R$string.notification_button_not_assigned_title);
        ((Button) findViewById(C17532R$id.button_create_macro)).setOnClickListener(new C5851p(this, intExtra));
        ((Button) findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5850o(this));
        setFinishOnTouchOutside(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.dialog_not_button_not_assigned);
        getWindow().setLayout(-1, -2);
        getWindow().addFlags(524288);
        m23887V1(getIntent());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m23887V1(intent);
    }
}
