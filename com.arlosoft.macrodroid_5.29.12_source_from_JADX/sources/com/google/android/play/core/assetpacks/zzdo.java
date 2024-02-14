package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.assetpacks.model.zzb;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzcj;
import com.google.android.play.core.internal.zzco;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.zzi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzdo implements zzy {

    /* renamed from: i */
    private static final zzag f51488i = new zzag("FakeAssetPackService");

    /* renamed from: j */
    private static final AtomicInteger f51489j = new AtomicInteger(1);

    /* renamed from: a */
    private final String f51490a;

    /* renamed from: b */
    private final zzbb f51491b;

    /* renamed from: c */
    private final zzco f51492c;

    /* renamed from: d */
    private final Context f51493d;

    /* renamed from: e */
    private final zzed f51494e;

    /* renamed from: f */
    private final zzco f51495f;

    /* renamed from: g */
    private final zzeb f51496g;

    /* renamed from: h */
    private final Handler f51497h = new Handler(Looper.getMainLooper());

    @VisibleForTesting
    zzdo(File file, zzbb zzbb, zzco zzco, Context context, zzed zzed, zzco zzco2, zzeb zzeb) {
        this.f51490a = file.getAbsolutePath();
        this.f51491b = zzbb;
        this.f51492c = zzco;
        this.f51493d = context;
        this.f51494e = zzed;
        this.f51495f = zzco2;
        this.f51496g = zzeb;
    }

    @VisibleForTesting
    /* renamed from: g */
    static long m70675g(@AssetPackStatus int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: l */
    private final Bundle m70676l(int i, String str, @AssetPackStatus int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f51494e.mo59753a());
        bundle.putInt("session_id", i);
        File[] o = m70679o(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : o) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a = zzcj.m70931a(file);
            bundle.putParcelableArrayList(zzb.m70478b("chunk_intents", str, a), arrayList2);
            bundle.putString(zzb.m70478b("uncompressed_hash_sha256", str, a), m70678n(file));
            bundle.putLong(zzb.m70478b("uncompressed_size", str, a), file.length());
            arrayList.add(a);
        }
        bundle.putStringArrayList(zzb.m70477a("slice_ids", str), arrayList);
        bundle.putLong(zzb.m70477a("pack_version", str), (long) this.f51494e.mo59753a());
        bundle.putInt(zzb.m70477a(NotificationCompat.CATEGORY_STATUS, str), i2);
        bundle.putInt(zzb.m70477a("error_code", str), 0);
        bundle.putLong(zzb.m70477a("bytes_downloaded", str), m70675g(i2, j));
        bundle.putLong(zzb.m70477a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m70675g(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f51497h.post(new zzdl(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        return bundle;
    }

    /* renamed from: m */
    private final AssetPackState m70677m(String str, @AssetPackStatus int i) throws LocalTestingException {
        String str2 = str;
        long j = 0;
        for (File length : m70679o(str)) {
            j += length.length();
        }
        int i2 = i;
        return AssetPackState.m70457h(str, i2, 0, m70675g(i2, j), j, this.f51492c.mo59708a(str), 1, String.valueOf(this.f51494e.mo59753a()), this.f51496g.mo59751a(str));
    }

    /* renamed from: n */
    private static String m70678n(File file) throws LocalTestingException {
        try {
            return zzdq.m70692a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: o */
    private final File[] m70679o(String str) throws LocalTestingException {
        File file = new File(this.f51490a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new zzdj(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a : listFiles) {
                        if (zzcj.m70931a(a).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No main slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: a */
    public final void mo59605a(int i, String str) {
        f51488i.mo59808d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f51495f.zza()).execute(new zzdk(this, i, str));
    }

    /* renamed from: b */
    public final Task mo59606b(int i, String str, String str2, int i2) {
        f51488i.mo59808d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        zzi zzi = new zzi();
        try {
            for (File file : m70679o(str)) {
                if (zzcj.m70931a(file).equals(str2)) {
                    zzi.mo60032c(ParcelFileDescriptor.open(file, 268435456));
                    return zzi.mo60030a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f51488i.mo59809e("getChunkFileDescriptor failed", e);
            zzi.mo60031b(new LocalTestingException("Asset Slice file not found.", e));
        } catch (LocalTestingException e2) {
            f51488i.mo59809e("getChunkFileDescriptor failed", e2);
            zzi.mo60031b(e2);
        }
    }

    /* renamed from: b0 */
    public final void mo59607b0(int i) {
        f51488i.mo59808d("notifySessionFailed", new Object[0]);
    }

    /* renamed from: c */
    public final void mo59608c() {
        f51488i.mo59808d("keepAlive", new Object[0]);
    }

    /* renamed from: d */
    public final void mo59609d(List list) {
        f51488i.mo59808d("cancelDownload(%s)", list);
    }

    /* renamed from: e */
    public final void mo59610e(int i, String str, String str2, int i2) {
        f51488i.mo59808d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: f */
    public final Task mo59611f(Map map) {
        f51488i.mo59808d("syncPacks()", new Object[0]);
        return Tasks.m71250c(new ArrayList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo59734h(Intent intent) {
        this.f51491b.mo59548a(this.f51493d, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo59735i(List list, zzbe zzbe, zzi zzi) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState m = m70677m(str, ((zze) zzbe).f51535a.mo59779a(8, str));
                j += m.mo59580e();
                hashMap.put(str, m);
            } catch (LocalTestingException e) {
                zzi.mo60031b(e);
                return;
            }
        }
        zzi.mo60032c(new zzbo(j, hashMap));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo59736j(int i, String str) {
        try {
            m70676l(i, str, 4);
        } catch (LocalTestingException e) {
            f51488i.mo59809e("notifyModuleCompleted failed", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo59737k(List list, zzi zzi, List list2) {
        zzi zzi2 = zzi;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState m = m70677m(str, 1);
                j += m.mo59580e();
                hashMap.put(str, m);
            } catch (LocalTestingException e) {
                zzi2.mo60031b(e);
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                int andIncrement = f51489j.getAndIncrement();
                m70676l(andIncrement, str2, 1);
                m70676l(andIncrement, str2, 2);
                m70676l(andIncrement, str2, 3);
            } catch (LocalTestingException e2) {
                zzi2.mo60031b(e2);
                return;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            hashMap.put(str3, AssetPackState.m70457h(str3, 4, 0, 0, 0, 0.0d, 1, String.valueOf(this.f51494e.mo59753a()), String.valueOf(this.f51494e.mo59753a())));
        }
        zzi2.mo60032c(new zzbo(j, hashMap));
    }

    /* renamed from: z1 */
    public final void mo59612z1(String str) {
        f51488i.mo59808d("removePack(%s)", str);
    }
}
