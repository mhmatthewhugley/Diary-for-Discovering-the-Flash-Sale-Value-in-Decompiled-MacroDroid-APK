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
final class zzik implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Uri f48377a;

    /* renamed from: c */
    final /* synthetic */ BaseImplementation.ResultHolder f48378c;

    /* renamed from: d */
    final /* synthetic */ boolean f48379d;

    /* renamed from: f */
    final /* synthetic */ String f48380f;

    /* renamed from: g */
    final /* synthetic */ zzim f48381g;

    zzik(zzim zzim, Uri uri, BaseImplementation.ResultHolder resultHolder, boolean z, String str) {
        this.f48381g = zzim;
        this.f48377a = uri;
        this.f48378c = resultHolder;
        this.f48379d = z;
        this.f48380f = str;
    }

    public final void run() {
        Log.isLoggable("WearableClient", 2);
        if (!"file".equals(this.f48377a.getScheme())) {
            Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
            this.f48378c.mo21321b(new Status(10, "Channel.receiveFile used with non-file URI"));
            return;
        }
        File file = new File(this.f48377a.getPath());
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, (true != this.f48379d ? 0 : 33554432) | 671088640);
            try {
                ((zzfb) this.f48381g.mo21626I()).mo56445ia(new zzii(this.f48378c), this.f48380f, open);
                try {
                    open.close();
                } catch (IOException e) {
                    Log.w("WearableClient", "Failed to close targetFd", e);
                }
            } catch (RemoteException e2) {
                Log.w("WearableClient", "Channel.receiveFile failed.", e2);
                this.f48378c.mo21321b(new Status(8));
                try {
                    open.close();
                } catch (IOException e3) {
                    Log.w("WearableClient", "Failed to close targetFd", e3);
                }
            } catch (Throwable th) {
                try {
                    open.close();
                } catch (IOException e4) {
                    Log.w("WearableClient", "Failed to close targetFd", e4);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            Log.w("WearableClient", "File couldn't be opened for Channel.receiveFile: ".concat(file.toString()));
            this.f48378c.mo21321b(new Status(13));
        }
    }
}
