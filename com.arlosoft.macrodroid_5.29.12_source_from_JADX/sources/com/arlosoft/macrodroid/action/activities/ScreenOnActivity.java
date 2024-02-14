package com.arlosoft.macrodroid.action.activities;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.arlosoft.macrodroid.common.NonAppActivity;

public class ScreenOnActivity extends NonAppActivity {

    /* renamed from: com.arlosoft.macrodroid.action.activities.ScreenOnActivity$a */
    class C2828a implements Runnable {
        C2828a() {
        }

        public void run() {
            ScreenOnActivity.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            setTurnScreenOn(true);
            setShowWhenLocked(true);
        }
        getWindow().addFlags(2621569);
        new Handler().postDelayed(new C2828a(), 500);
    }
}
