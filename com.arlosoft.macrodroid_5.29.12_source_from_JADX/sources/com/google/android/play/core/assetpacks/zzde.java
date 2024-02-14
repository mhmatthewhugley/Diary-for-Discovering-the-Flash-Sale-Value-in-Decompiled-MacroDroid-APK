package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.assetpacks.model.zzb;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzco;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzde {

    /* renamed from: g */
    private static final zzag f51452g = new zzag("ExtractorSessionStoreView");

    /* renamed from: a */
    private final zzbh f51453a;

    /* renamed from: b */
    private final zzco f51454b;

    /* renamed from: c */
    private final zzco f51455c;

    /* renamed from: d */
    private final zzco f51456d;

    /* renamed from: e */
    private final Map f51457e = new HashMap();

    /* renamed from: f */
    private final ReentrantLock f51458f = new ReentrantLock();

    zzde(zzbh zzbh, zzco zzco, zzco zzco2, zzco zzco3) {
        this.f51453a = zzbh;
        this.f51454b = zzco;
        this.f51455c = zzco2;
        this.f51456d = zzco3;
    }

    /* renamed from: p */
    private final zzdb m70652p(int i) {
        Map map = this.f51457e;
        Integer valueOf = Integer.valueOf(i);
        zzdb zzdb = (zzdb) map.get(valueOf);
        if (zzdb != null) {
            return zzdb;
        }
        throw new zzck(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: q */
    private final Object m70653q(zzdd zzdd) {
        try {
            this.f51458f.lock();
            return zzdd.zza();
        } finally {
            this.f51458f.unlock();
        }
    }

    /* renamed from: r */
    private static String m70654r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new zzck("Session without pack received.");
    }

    /* renamed from: s */
    private static List m70655s(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: t */
    private final Map m70656t(List list) {
        return (Map) m70653q(new zzcx(this, list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo59713a(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map map = this.f51457e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        zzdb zzdb = (zzdb) this.f51457e.get(valueOf);
        if (zzdb.f51445c.f51440d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!zzbg.m70552c(zzdb.f51445c.f51440d, bundle.getInt(zzb.m70477a(NotificationCompat.CATEGORY_STATUS, m70654r(bundle)))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Boolean mo59714b(Bundle bundle) {
        zzdc zzdc;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map map = this.f51457e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            zzdb p = m70652p(i);
            int i2 = bundle2.getInt(zzb.m70477a(NotificationCompat.CATEGORY_STATUS, p.f51445c.f51437a));
            zzda zzda = p.f51445c;
            int i3 = zzda.f51440d;
            if (zzbg.m70552c(i3, i2)) {
                f51452g.mo59805a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i3));
                zzda zzda2 = p.f51445c;
                String str = zzda2.f51437a;
                int i4 = zzda2.f51440d;
                if (i4 == 4) {
                    ((zzy) this.f51454b.zza()).mo59605a(i, str);
                } else if (i4 == 5) {
                    ((zzy) this.f51454b.zza()).mo59607b0(i);
                } else if (i4 == 6) {
                    ((zzy) this.f51454b.zza()).mo59609d(Arrays.asList(new String[]{str}));
                }
            } else {
                zzda.f51440d = i2;
                if (zzbg.m70553d(i2)) {
                    mo59725m(i);
                    this.f51455c.mo59710c(p.f51445c.f51437a);
                } else {
                    for (zzdc zzdc2 : zzda.f51442f) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(zzb.m70478b("chunk_intents", p.f51445c.f51437a, zzdc2.f51446a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    ((zzcz) zzdc2.f51449d.get(i5)).f51435a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r = m70654r(bundle);
            long j = bundle2.getLong(zzb.m70477a("pack_version", r));
            String string = bundle2.getString(zzb.m70477a("pack_version_tag", r), "");
            int i6 = bundle2.getInt(zzb.m70477a(NotificationCompat.CATEGORY_STATUS, r));
            long j2 = bundle2.getLong(zzb.m70477a("total_bytes_to_download", r));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(zzb.m70477a("slice_ids", r));
            ArrayList arrayList = new ArrayList();
            for (String str2 : m70655s(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(zzb.m70478b("chunk_intents", r, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m70655s(parcelableArrayList2)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new zzcz(z));
                    z = true;
                }
                String string2 = bundle2.getString(zzb.m70478b("uncompressed_hash_sha256", r, str2));
                long j3 = bundle2.getLong(zzb.m70478b("uncompressed_size", r, str2));
                int i7 = bundle2.getInt(zzb.m70478b("patch_format", r, str2), 0);
                if (i7 != 0) {
                    zzdc = new zzdc(str2, string2, j3, arrayList2, 0, i7);
                } else {
                    zzdc = new zzdc(str2, string2, j3, arrayList2, bundle2.getInt(zzb.m70478b("compression_format", r, str2), 0), 0);
                }
                arrayList.add(zzdc);
                z = true;
            }
            this.f51457e.put(Integer.valueOf(i), new zzdb(i, bundle2.getInt("app_version_code"), new zzda(r, j, i6, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo59715c(String str, int i, long j) {
        zzdb zzdb = (zzdb) m70656t(Arrays.asList(new String[]{str})).get(str);
        if (zzdb == null || zzbg.m70553d(zzdb.f51445c.f51440d)) {
            f51452g.mo59806b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f51453a.mo59639e(str, i, j);
        zzdb.f51445c.f51440d = 4;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo59716d(int i, int i2) {
        m70652p(i).f51445c.f51440d = 5;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo59717e(int i) {
        zzdb p = m70652p(i);
        zzda zzda = p.f51445c;
        if (zzbg.m70553d(zzda.f51440d)) {
            this.f51453a.mo59639e(zzda.f51437a, p.f51444b, zzda.f51438b);
            zzda zzda2 = p.f51445c;
            int i2 = zzda2.f51440d;
            if (i2 != 5 && i2 != 6) {
                return null;
            }
            this.f51453a.mo59640f(zzda2.f51437a, p.f51444b, zzda2.f51438b);
            return null;
        }
        throw new zzck(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Map mo59718f() {
        return this.f51457e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ Map mo59719g(List list) {
        Map t = m70656t(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzdb zzdb = (zzdb) t.get(str);
            if (zzdb == null) {
                hashMap.put(str, 8);
            } else {
                zzda zzda = zzdb.f51445c;
                if (zzbg.m70550a(zzda.f51440d)) {
                    try {
                        zzda.f51440d = 6;
                        ((Executor) this.f51456d.zza()).execute(new zzcy(this, zzdb));
                        this.f51455c.mo59710c(str);
                    } catch (zzck unused) {
                        f51452g.mo59808d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(zzdb.f51443a), str);
                    }
                }
                hashMap.put(str, Integer.valueOf(zzdb.f51445c.f51440d));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ Map mo59720h(List list) {
        int i;
        HashMap hashMap = new HashMap();
        for (zzdb zzdb : this.f51457e.values()) {
            String str = zzdb.f51445c.f51437a;
            if (list.contains(str)) {
                zzdb zzdb2 = (zzdb) hashMap.get(str);
                if (zzdb2 == null) {
                    i = -1;
                } else {
                    i = zzdb2.f51443a;
                }
                if (i < zzdb.f51443a) {
                    hashMap.put(str, zzdb);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo59721i() {
        this.f51458f.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo59722j(String str, int i, long j) {
        m70653q(new zzcv(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo59723k() {
        this.f51458f.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo59724l(int i, @AssetPackStatus int i2) {
        m70653q(new zzcs(this, i, 5));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo59725m(int i) {
        m70653q(new zzcr(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo59726n(Bundle bundle) {
        return ((Boolean) m70653q(new zzct(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo59727o(Bundle bundle) {
        return ((Boolean) m70653q(new zzcu(this, bundle))).booleanValue();
    }
}
