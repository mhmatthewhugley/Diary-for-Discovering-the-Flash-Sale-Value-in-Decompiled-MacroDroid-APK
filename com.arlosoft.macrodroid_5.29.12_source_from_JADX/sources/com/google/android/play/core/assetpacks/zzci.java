package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzci implements ServiceConnection {

    /* renamed from: a */
    private final zzag f51382a = new zzag("ExtractionForegroundServiceConnection");

    /* renamed from: c */
    private final List f51383c = new ArrayList();

    /* renamed from: d */
    private final Context f51384d;
    @Nullable

    /* renamed from: f */
    private ExtractionForegroundService f51385f;
    @Nullable

    /* renamed from: g */
    private Notification f51386g;

    zzci(Context context) {
        this.f51384d = context;
    }

    /* renamed from: d */
    private final void m70641d() {
        ArrayList arrayList;
        synchronized (this.f51383c) {
            arrayList = new ArrayList(this.f51383c);
            this.f51383c.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((zzz) arrayList.get(i)).mo59908R6(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f51382a.mo59806b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59699a(Notification notification) {
        this.f51386g = notification;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo59700b() {
        this.f51382a.mo59805a("Stopping foreground installation service.", new Object[0]);
        this.f51384d.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f51385f;
        if (extractionForegroundService != null) {
            extractionForegroundService.mo59587a();
        }
        m70641d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo59701c(zzz zzz) {
        synchronized (this.f51383c) {
            this.f51383c.add(zzz);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f51382a.mo59805a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((zzch) iBinder).f51381a;
        this.f51385f = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f51386g);
        m70641d();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
