package com.arlosoft.macrodroid.triggers.activities;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcF;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.utils.C6361a;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import p148q0.C8151a;
import p319lc.C15626c;

public class ScanTagActivity extends AppCompatActivity {

    /* renamed from: d */
    private NfcAdapter f13813d;

    /* renamed from: f */
    private PendingIntent f13814f;

    /* renamed from: g */
    private IntentFilter[] f13815g;

    /* renamed from: o */
    private String[][] f13816o;

    /* renamed from: p */
    private String f13817p;

    /* renamed from: K1 */
    private static boolean m23895K1(NdefMessage ndefMessage, Tag tag) {
        int length = ndefMessage.toByteArray().length;
        try {
            Ndef ndef = Ndef.get(tag);
            if (ndef != null) {
                ndef.connect();
                if (!ndef.isWritable() || ndef.getMaxSize() < length) {
                    return false;
                }
                ndef.writeNdefMessage(ndefMessage);
                return true;
            }
            NdefFormatable ndefFormatable = NdefFormatable.get(tag);
            if (ndefFormatable != null) {
                try {
                    ndefFormatable.connect();
                    ndefFormatable.format(ndefMessage);
                    return true;
                } catch (IOException unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            Log.w("TAG", "Failed to write data to NFC Tag");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C6361a.m24594a(context, this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.scan_tag_view);
        if (getIntent().hasExtra("TagName")) {
            this.f13817p = getIntent().getExtras().getString("TagName");
        }
        this.f13813d = NfcAdapter.getDefaultAdapter(this);
        this.f13814f = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(536870912), C6368b1.f14960c);
        if (this.f13817p != null) {
            setTitle(C17541R$string.action_set_nfc_writing);
            IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
            IntentFilter intentFilter2 = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
            IntentFilter intentFilter3 = new IntentFilter("android.nfc.action.TAG_DISCOVERED");
            try {
                intentFilter.addDataType("*/*");
                intentFilter2.addDataScheme("http");
            } catch (IntentFilter.MalformedMimeTypeException e) {
                C8151a.m33873n(new RuntimeException("ScanTagActivity: MalformedMimeTypeException: " + e.getMessage()));
            }
            this.f13815g = new IntentFilter[]{intentFilter, intentFilter2, intentFilter3};
        } else {
            setTitle(C17541R$string.scan_compatible_nfc_tag);
            IntentFilter intentFilter4 = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
            intentFilter4.addDataScheme("http");
            intentFilter4.addDataPath("www.macrodroid.com", 2);
            intentFilter4.addDataScheme("macrodroid");
            intentFilter4.addDataPath("tag", 2);
            this.f13815g = new IntentFilter[]{intentFilter4};
        }
        this.f13816o = new String[][]{new String[]{NfcF.class.getName()}};
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("Foreground dispatch", "Discovered tag with intent: " + intent);
        Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        Intent intent2 = new Intent();
        if (this.f13817p == null) {
            Ndef ndef = Ndef.get(tag);
            if (ndef == null) {
                C15626c.makeText(getApplicationContext(), C17541R$string.error, 0).show();
                return;
            }
            NdefMessage cachedNdefMessage = ndef.getCachedNdefMessage();
            if (cachedNdefMessage != null) {
                NdefRecord[] records = cachedNdefMessage.getRecords();
                int length = records.length;
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = new String(records[i].getType());
                    if (strArr[i].startsWith("macrodroid://tag/")) {
                        String substring = strArr[i].substring(17);
                        setResult(-1, intent2);
                        intent2.putExtra("TagName", substring);
                        finish();
                    }
                }
            }
            setResult(0, intent2);
            finish();
            return;
        }
        if (m23895K1(new NdefMessage(new NdefRecord[]{new NdefRecord(3, ("macrodroid://tag/" + this.f13817p).getBytes(StandardCharsets.UTF_8), new byte[0], new byte[0])}), tag)) {
            setResult(-1, intent2);
            finish();
            return;
        }
        setResult(0, intent2);
        finish();
    }

    public void onPause() {
        super.onPause();
        NfcAdapter nfcAdapter = this.f13813d;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(this);
        }
    }

    public void onResume() {
        super.onResume();
        NfcAdapter nfcAdapter = this.f13813d;
        if (nfcAdapter != null) {
            nfcAdapter.enableForegroundDispatch(this, this.f13814f, this.f13815g, this.f13816o);
        }
    }
}
