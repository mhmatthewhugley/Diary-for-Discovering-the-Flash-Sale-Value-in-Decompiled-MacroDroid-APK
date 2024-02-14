package com.arlosoft.macrodroid.action.activities;

import android.os.Bundle;
import android.view.WindowManager;
import com.arlosoft.macrodroid.common.NonAppActivity;

public class UpdateBrightnessActivity extends NonAppActivity {

    /* renamed from: com.arlosoft.macrodroid.action.activities.UpdateBrightnessActivity$a */
    class C2832a extends Thread {
        C2832a() {
        }

        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
            }
            UpdateBrightnessActivity.this.finish();
        }
    }

    /* renamed from: L1 */
    private void m14002L1(int i) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (i < 0) {
            attributes.screenBrightness = -1.0f;
        } else {
            attributes.screenBrightness = ((float) i) / 255.0f;
        }
        getWindow().setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        m14002L1(getIntent().getIntExtra("Brightness", 127));
        new C2832a().start();
    }
}
