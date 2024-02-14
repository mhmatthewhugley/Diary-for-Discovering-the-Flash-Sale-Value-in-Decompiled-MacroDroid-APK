package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzil implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Uri f48382a;

    /* renamed from: c */
    final /* synthetic */ BaseImplementation.ResultHolder f48383c;

    /* renamed from: d */
    final /* synthetic */ String f48384d;

    /* renamed from: f */
    final /* synthetic */ long f48385f;

    /* renamed from: g */
    final /* synthetic */ long f48386g;

    /* renamed from: o */
    final /* synthetic */ zzim f48387o;

    zzil(zzim zzim, Uri uri, BaseImplementation.ResultHolder resultHolder, String str, long j, long j2) {
        this.f48387o = zzim;
        this.f48382a = uri;
        this.f48383c = resultHolder;
        this.f48384d = str;
        this.f48385f = j;
        this.f48386g = j2;
    }

    public final void run() {
        Log.isLoggable("WearableClient", 2);
        if (!"file".equals(this.f48382a.getScheme())) {
            Log.w("WearableClient", "Channel.sendFile used with non-file URI");
            this.f48383c.mo21321b(new Status(10, "Channel.sendFile used with non-file URI"));
            return;
        }
        File file = new File(this.f48382a.getPath());
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            try {
                ((zzfb) this.f48387o.mo21626I()).mo56440ac(new zzie(this.f48383c), this.f48384d, open, this.f48385f, this.f48386g);
                try {
                    open.close();
                } catch (IOException e) {
                    Log.w("WearableClient", "Failed to close sourceFd", e);
                }
            } catch (RemoteException e2) {
                Log.w("WearableClient", "Channel.sendFile failed.", e2);
                this.f48383c.mo21321b(new Status(8));
                try {
                    open.close();
                } catch (IOException e3) {
                    Log.w("WearableClient", "Failed to close sourceFd", e3);
                }
            } catch (Throwable th) {
                try {
                    open.close();
                } catch (IOException e4) {
                    Log.w("WearableClient", "Failed to close sourceFd", e4);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            Log.w("WearableClient", "File couldn't be opened for Channel.sendFile: ".concat(file.toString()));
            this.f48383c.mo21321b(new Status(13));
        }
    }
}
