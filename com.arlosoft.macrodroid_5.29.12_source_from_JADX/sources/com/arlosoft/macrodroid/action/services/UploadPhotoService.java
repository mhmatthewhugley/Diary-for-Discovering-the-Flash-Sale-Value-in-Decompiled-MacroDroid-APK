package com.arlosoft.macrodroid.action.services;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import androidx.loader.content.CursorLoader;
import com.arlosoft.macrodroid.action.services.UploadService;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.tencent.soter.core.model.ConstantsSoter;
import java.io.File;
import p098h0.C7359c;
import p110j0.C7430a;
import p134n0.C7960a;

public class UploadPhotoService extends UploadService {

    /* renamed from: com.arlosoft.macrodroid.action.services.UploadPhotoService$a */
    class C3439a extends Thread {

        /* renamed from: a */
        final /* synthetic */ Intent f9135a;

        /* renamed from: c */
        final /* synthetic */ String f9136c;

        /* renamed from: d */
        final /* synthetic */ String f9137d;

        /* renamed from: f */
        final /* synthetic */ String f9138f;

        /* renamed from: g */
        final /* synthetic */ String f9139g;

        C3439a(Intent intent, String str, String str2, String str3, String str4) {
            this.f9135a = intent;
            this.f9136c = str;
            this.f9137d = str2;
            this.f9138f = str3;
            this.f9139g = str4;
        }

        public void run() {
            Object K;
            if (this.f9135a.getExtras().containsKey("photo_uri")) {
                K = this.f9135a.getExtras().getParcelable("photo_uri");
            } else if (this.f9135a.getExtras().containsKey("photo_file")) {
                K = this.f9135a.getExtras().getString("photo_file");
            } else {
                try {
                    Thread.sleep(ConstantsSoter.FACEID_AUTH_CHECK_TIME);
                } catch (InterruptedException unused) {
                }
                K = C4061t1.m15964K(UploadPhotoService.this);
            }
            Object obj = K;
            if (obj != null) {
                UploadService.C3444d dVar = new UploadService.C3444d(obj, this.f9136c, this.f9137d, this.f9138f, this.f9139g);
                synchronized (UploadService.f9143z) {
                    UploadPhotoService.this.f9147f.add(dVar);
                    if (UploadPhotoService.this.f9147f.size() == 1) {
                        UploadPhotoService.this.mo26819k(0);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("IN PHOTO - UPLOAD QUEUE SIZE IS ");
                        sb.append(UploadPhotoService.this.f9147f.size());
                        sb.append(" (NO ALARM SET)");
                    }
                }
                return;
            }
            Log.w("UploadPhotoService", "Could not detect last photo taken");
        }
    }

    /* renamed from: t */
    private String m14398t(Uri uri) {
        Looper.prepare();
        Cursor loadInBackground = new CursorLoader(this, uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null).loadInBackground();
        int columnIndexOrThrow = loadInBackground.getColumnIndexOrThrow("_data");
        loadInBackground.moveToFirst();
        String string = loadInBackground.getString(columnIndexOrThrow);
        loadInBackground.close();
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo26791g() {
        return "preferences:upload_photo_notify_failure";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo26792h() {
        return "preferences:upload_photo_notify_success";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo26793i() {
        return "preferences:upload_photo_retry_period";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C7960a.C7963c mo26794o(Context context, UploadService.C3444d dVar) {
        return C7960a.m33248k(context, (Uri) dVar.f9166a);
    }

    public void onCreate() {
        super.onCreate();
        this.f9145c = "photo";
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        new C3439a(intent, intent.getExtras().getString("UploadSite"), intent.getExtras().getString("EmailAddress"), intent.getExtras().getString("Subject"), intent.getExtras().getString("Body")).start();
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo26797q(Context context, UploadService.C3444d dVar, String str) throws Exception {
        File file;
        if (this.f9144a.f9166a instanceof Uri) {
            file = new File(m14398t((Uri) this.f9144a.f9166a));
        } else {
            file = new File((String) this.f9144a.f9166a);
        }
        C7430a aVar = new C7430a(str, C5163j2.m20061T(context));
        UploadService.C3444d dVar2 = this.f9144a;
        String str2 = str;
        aVar.mo37547d(dVar2.f9170e, dVar2.f9171f, str2, dVar2.f9169d, file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26798s(Context context, UploadService.C3444d dVar, String str, String str2) throws Exception {
        File file;
        if (this.f9144a.f9166a instanceof Uri) {
            file = new File(m14398t((Uri) this.f9144a.f9166a));
        } else {
            file = new File((String) this.f9144a.f9166a);
        }
        File file2 = file;
        C7359c cVar = new C7359c();
        UploadService.C3444d dVar2 = this.f9144a;
        cVar.mo37335c(context, dVar2.f9170e, dVar2.f9171f, str, str2, dVar2.f9169d, file2);
    }
}
