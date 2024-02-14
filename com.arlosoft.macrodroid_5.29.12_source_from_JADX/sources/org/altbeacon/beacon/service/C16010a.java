package org.altbeacon.beacon.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.C8049f;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.a */
/* compiled from: Callback */
public class C16010a implements Serializable {
    public C16010a(String str) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
    }

    /* renamed from: a */
    public boolean mo76432a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), "org.altbeacon.beacon.BeaconIntentProcessor"));
        intent.putExtra(str, bundle);
        if (BeaconManager.m33479A(context).mo37985T()) {
            C7354d.m30376a("Callback", "attempting callback via global broadcast intent: %s", intent.getComponent());
            try {
                context.startService(intent);
                return true;
            } catch (Exception e) {
                C7354d.m30377b("Callback", "Failed attempting to start service: " + intent.getComponent().flattenToString(), e);
            }
        } else {
            C7354d.m30376a("Callback", "attempting callback via direct method call", new Object[0]);
            new C8049f().mo38058a(context, intent);
            return false;
        }
    }
}
