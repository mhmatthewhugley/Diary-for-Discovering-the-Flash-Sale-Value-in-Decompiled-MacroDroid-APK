package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.arlosoft.macrodroid.ConfigureNotificationBarActivity;

/* renamed from: com.arlosoft.macrodroid.triggers.n5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6018n5 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f14215a;

    public /* synthetic */ C6018n5(Activity activity) {
        this.f14215a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14215a.startActivity(new Intent(this.f14215a, ConfigureNotificationBarActivity.class));
    }
}
