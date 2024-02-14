package com.arlosoft.macrodroid.action.email;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.arlosoft.macrodroid.utils.C6383g0;

public class EmailOauthConfigureActivity extends Activity {

    /* renamed from: a */
    private C6383g0 f8293a;

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f8293a.mo32427e(i, i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6383g0 d = C6383g0.m24633d(this);
        this.f8293a = d;
        d.mo32425b(d.mo32426c(), this);
    }
}
