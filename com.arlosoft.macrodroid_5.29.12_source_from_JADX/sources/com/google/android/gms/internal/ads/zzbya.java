package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbya implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f27970a;

    /* renamed from: c */
    final /* synthetic */ String f27971c;

    /* renamed from: d */
    final /* synthetic */ zzbyc f27972d;

    zzbya(zzbyc zzbyc, String str, String str2) {
        this.f27972d = zzbyc;
        this.f27970a = str;
        this.f27971c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f27972d.f27975d.getSystemService("download");
        try {
            String str = this.f27970a;
            String str2 = this.f27971c;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.m2905r();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f27972d.mo43218c("Could not store picture.");
        }
    }
}
