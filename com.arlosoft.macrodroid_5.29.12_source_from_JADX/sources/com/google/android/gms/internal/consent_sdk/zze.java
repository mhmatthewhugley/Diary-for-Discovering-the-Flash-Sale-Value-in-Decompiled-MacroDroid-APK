package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class zze implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f39418a;

    /* renamed from: c */
    public final /* synthetic */ String f39419c;

    /* renamed from: d */
    public final /* synthetic */ zzg[] f39420d;

    public /* synthetic */ zze(String str, String str2, zzg[] zzgArr) {
        this.f39418a = str;
        this.f39419c = str2;
        this.f39420d = zzgArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str = this.f39418a;
        String str2 = this.f39419c;
        zzg[] zzgArr = this.f39420d;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str2).length());
                    sb.append("Action[");
                    sb.append(lowerCase);
                    sb.append("]: failed to parse args: ");
                    sb.append(str2);
                    return;
                }
            }
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
            sb2.append("Action[");
            sb2.append(lowerCase);
            sb2.append("]: ");
            sb2.append(valueOf);
            int length = zzgArr.length;
            int i = 0;
            while (i < length) {
                zzg zzg = zzgArr[i];
                FutureTask futureTask = new FutureTask(new zzf(zzg, lowerCase, jSONObject));
                zzg.zza().execute(futureTask);
                try {
                    if (!((Boolean) futureTask.get()).booleanValue()) {
                        i++;
                    } else {
                        return;
                    }
                } catch (ExecutionException e) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                    sb3.append("Failed to run Action[");
                    sb3.append(lowerCase);
                    sb3.append("]: ");
                    e.getCause();
                } catch (InterruptedException unused2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                    sb4.append("Thread interrupted for Action[");
                    sb4.append(lowerCase);
                    sb4.append("]: ");
                }
            }
        }
    }
}
