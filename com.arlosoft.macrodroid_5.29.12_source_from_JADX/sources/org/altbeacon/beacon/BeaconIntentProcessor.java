package org.altbeacon.beacon;

import android.app.IntentService;
import android.content.Intent;

public class BeaconIntentProcessor extends IntentService {
    public BeaconIntentProcessor() {
        super("BeaconIntentProcessor");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        new C8049f().mo38058a(getApplicationContext(), intent);
    }
}
