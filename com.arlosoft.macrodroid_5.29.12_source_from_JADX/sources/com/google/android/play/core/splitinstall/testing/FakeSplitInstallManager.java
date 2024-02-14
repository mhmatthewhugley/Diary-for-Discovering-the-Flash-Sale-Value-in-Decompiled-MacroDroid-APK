package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzaf;
import com.google.android.play.core.internal.zzcf;
import com.google.android.play.core.internal.zzcj;
import com.google.android.play.core.internal.zzco;
import com.google.android.play.core.splitcompat.zzd;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zzg;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzs;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class FakeSplitInstallManager implements SplitInstallManager {

    /* renamed from: p */
    private static final long f51798p = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: q */
    public static final /* synthetic */ int f51799q = 0;

    /* renamed from: a */
    private final Handler f51800a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f51801b;

    /* renamed from: c */
    private final zzs f51802c;

    /* renamed from: d */
    private final zzco f51803d;

    /* renamed from: e */
    private final zzcf f51804e;

    /* renamed from: f */
    private final zzaf f51805f;

    /* renamed from: g */
    private final zzaf f51806g;

    /* renamed from: h */
    private final Executor f51807h;

    /* renamed from: i */
    private final zzg f51808i;

    /* renamed from: j */
    private final File f51809j;

    /* renamed from: k */
    private final AtomicReference f51810k = new AtomicReference();

    /* renamed from: l */
    private final Set f51811l = Collections.synchronizedSet(new HashSet());

    /* renamed from: m */
    private final Set f51812m = Collections.synchronizedSet(new HashSet());

    /* renamed from: n */
    private final AtomicBoolean f51813n = new AtomicBoolean(false);

    /* renamed from: o */
    private final zzd f51814o;

    FakeSplitInstallManager(Context context, @Nullable File file, zzs zzs, zzco zzco) {
        Executor a = zzd.m71068a();
        zzcf zzcf = new zzcf(context);
        zzd zzd = zzd.f51819a;
        this.f51801b = context;
        this.f51809j = file;
        this.f51802c = zzs;
        this.f51803d = zzco;
        this.f51807h = a;
        this.f51804e = zzcf;
        this.f51814o = zzd;
        this.f51806g = new zzaf();
        this.f51805f = new zzaf();
        this.f51808i = zzo.INSTANCE;
    }

    @Nullable
    /* renamed from: h */
    private final SplitInstallSessionState m71129h() {
        return (SplitInstallSessionState) this.f51810k.get();
    }

    @Nullable
    /* renamed from: i */
    private final synchronized SplitInstallSessionState m71130i(zzp zzp) {
        SplitInstallSessionState h = m71129h();
        SplitInstallSessionState a = zzp.mo59990a(h);
        if (this.f51810k.compareAndSet(h, a)) {
            return a;
        }
        return null;
    }

    /* renamed from: j */
    private static String m71131j(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m71132k(List list, List list2, List list3, long j, boolean z) {
        List list4 = list;
        this.f51808i.zza().mo59824a(list, new zzo(this, list2, list3, j, z, list));
    }

    /* renamed from: l */
    private final void m71133l(SplitInstallSessionState splitInstallSessionState) {
        this.f51800a.post(new zzm(this, splitInstallSessionState));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m71134m(List list, List list2, long j) {
        this.f51811l.addAll(list);
        this.f51812m.addAll(list2);
        Long valueOf = Long.valueOf(j);
        m71135n(5, 0, valueOf, valueOf, (List) null, (Integer) null, (List) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m71135n(int i, int i2, @Nullable Long l, @Nullable Long l2, @Nullable List list, @Nullable Integer num, @Nullable List list2) {
        SplitInstallSessionState i3 = m71130i(new zzi(num, i, i2, l, l2, list, list2));
        if (i3 == null) {
            return false;
        }
        m71133l(i3);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo59976c(long j, List list, List list2, List list3) {
        long j2 = j;
        long j3 = j2 / 3;
        long j4 = 0;
        int i = 0;
        while (i < 3) {
            j4 = Math.min(j2, j4 + j3);
            m71135n(2, 0, Long.valueOf(j4), Long.valueOf(j), (List) null, (Integer) null, (List) null);
            SystemClock.sleep(f51798p);
            SplitInstallSessionState h = m71129h();
            if (h.mo59971i() != 9 && h.mo59971i() != 7 && h.mo59971i() != 6) {
                i++;
            } else {
                return;
            }
        }
        this.f51807h.execute(new zze(this, list, list2, list3, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo59977d(SplitInstallSessionState splitInstallSessionState) {
        this.f51805f.mo59804a(splitInstallSessionState);
        this.f51806g.mo59804a(splitInstallSessionState);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo59978e(List list, List list2, List list3, long j) {
        if (this.f51813n.get()) {
            m71135n(6, -6, (Long) null, (Long) null, (List) null, (Integer) null, (List) null);
        } else if (this.f51808i.zza() != null) {
            m71132k(list, list2, list3, j, false);
        } else {
            m71134m(list2, list3, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo59979f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String a = zzcj.m70931a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.f51801b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", m71131j(a));
            intent.putExtra("split_id", a);
            arrayList.add(intent);
            arrayList2.add(m71131j(zzcj.m70931a(file)));
        }
        SplitInstallSessionState h = m71129h();
        if (h != null) {
            this.f51807h.execute(new zzl(this, h.mo59972j(), arrayList, arrayList2, list2));
        }
    }
}
