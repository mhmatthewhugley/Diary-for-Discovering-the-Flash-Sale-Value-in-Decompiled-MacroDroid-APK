package com.arlosoft.macrodroid.triggers.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.arlosoft.macrodroid.triggers.services.NFCTriggeredService;

public class NFCTriggeredActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("android.nfc.action.NDEF_DISCOVERED".equals(getIntent().getAction())) {
            Intent intent = new Intent(this, NFCTriggeredService.class);
            intent.putExtra("android.nfc.extra.NDEF_MESSAGES", getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES"));
            startService(intent);
        }
        finish();
    }
}
