package rx_activity_result2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import p216ba.C11110a;

public class HolderActivity extends Activity {

    /* renamed from: o */
    private static C17427d f69170o = null;

    /* renamed from: p */
    private static int f69171p = -909;

    /* renamed from: a */
    private C17425b f69172a;

    /* renamed from: c */
    private C17426c f69173c;

    /* renamed from: d */
    private int f69174d;

    /* renamed from: f */
    private int f69175f;

    /* renamed from: g */
    private Intent f69176g;

    /* renamed from: rx_activity_result2.HolderActivity$a */
    class C17418a implements C11110a {
        C17418a() {
        }

        public void run() throws Exception {
            HolderActivity.this.finish();
        }
    }

    /* renamed from: a */
    static void m101182a(C17427d dVar) {
        f69170o = dVar;
    }

    /* renamed from: b */
    private void m101183b(C17428e eVar) {
        try {
            startIntentSenderForResult(eVar.mo80773j(), 0, eVar.mo80770g(), eVar.mo80771h(), eVar.mo80772i(), eVar.mo80769f());
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
            this.f69173c.mo80762o(f69171p, 0, (Intent) null);
        }
    }

    /* renamed from: c */
    private void m101184c(C17428e eVar) {
        try {
            startIntentSenderForResult(eVar.mo80773j(), 0, eVar.mo80770g(), eVar.mo80771h(), eVar.mo80772i(), eVar.mo80769f(), eVar.mo80774k());
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
            this.f69173c.mo80762o(f69171p, 0, (Intent) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f69174d = i2;
        this.f69175f = i;
        this.f69176g = intent;
        C17425b bVar = this.f69172a;
        if (bVar != null) {
            bVar.mo68746o(i, i2, intent).mo79708o(new C17418a()).mo79684O();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17427d dVar = f69170o;
        if (dVar == null) {
            finish();
            return;
        }
        this.f69172a = dVar.mo80765b();
        this.f69173c = f69170o.mo80766c();
        if (bundle == null) {
            C17427d dVar2 = f69170o;
            if (dVar2 instanceof C17428e) {
                C17428e eVar = (C17428e) dVar2;
                if (eVar.mo80774k() == null) {
                    m101183b(eVar);
                } else {
                    m101184c(eVar);
                }
            } else {
                try {
                    startActivityForResult(dVar2.mo80764a(), 0);
                } catch (ActivityNotFoundException e) {
                    C17426c cVar = this.f69173c;
                    if (cVar != null) {
                        cVar.mo80763s(e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C17426c cVar = this.f69173c;
        if (cVar != null) {
            cVar.mo80762o(this.f69175f, this.f69174d, this.f69176g);
        }
    }
}
