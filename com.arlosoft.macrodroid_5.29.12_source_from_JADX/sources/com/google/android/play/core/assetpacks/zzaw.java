package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzam;
import com.google.android.play.core.internal.zzas;
import com.google.android.play.core.internal.zzce;
import com.google.android.play.core.internal.zzch;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.zzi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzaw implements zzy {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final zzag f51231g = new zzag("AssetPackServiceImpl");

    /* renamed from: h */
    private static final Intent f51232h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f51233a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzco f51234b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzeb f51235c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public zzas f51236d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public zzas f51237e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicBoolean f51238f = new AtomicBoolean();

    zzaw(Context context, zzco zzco, zzeb zzeb) {
        this.f51233a = context.getPackageName();
        this.f51234b = zzco;
        this.f51235c = zzeb;
        if (zzch.m70928b(context)) {
            Context a = zzce.m70925a(context);
            zzag zzag = f51231g;
            Intent intent = f51232h;
            zzz zzz = zzz.f51642a;
            this.f51236d = new zzas(a, zzag, "AssetPackService", intent, zzz, (zzam) null);
            this.f51237e = new zzas(zzce.m70925a(context), zzag, "AssetPackService-keepAlive", intent, zzz, (zzam) null);
        }
        f51231g.mo59805a("AssetPackService initiated.", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Bundle m70511g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Bundle m70512h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* renamed from: i */
    private static Task m70513i() {
        f51231g.mo59806b("onError(%d)", -11);
        return Tasks.m71249b(new AssetPackException(-11));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m70514j(int i, String str, int i2) {
        if (this.f51236d != null) {
            f51231g.mo59808d("notifyModuleCompleted", new Object[0]);
            zzi zzi = new zzi();
            this.f51236d.mo59820q(new zzah(this, zzi, i, str, zzi, i2), zzi);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ Bundle m70515k(int i, String str, String str2, int i2) {
        Bundle z = m70530z(i, str);
        z.putString("slice_id", str2);
        z.putInt("chunk_number", i2);
        return z;
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ Bundle m70518n(Map map) {
        Bundle g = m70511g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        g.putParcelableArrayList("installed_asset_module", arrayList);
        return g;
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ ArrayList m70526v(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ List m70527w(zzaw zzaw, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = AssetPackStates.m70468c((Bundle) it.next(), zzaw.f51234b, zzaw.f51235c).mo59585a().values().iterator().next();
            if (next == null) {
                f51231g.mo59806b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (zzbg.m70550a(next.mo59579d())) {
                arrayList.add(next.mo59578c());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static Bundle m70530z(int i, String str) {
        Bundle h = m70512h(i);
        h.putString("module_name", str);
        return h;
    }

    /* renamed from: a */
    public final void mo59605a(int i, String str) {
        m70514j(i, str, 10);
    }

    /* renamed from: b */
    public final Task mo59606b(int i, String str, String str2, int i2) {
        if (this.f51236d == null) {
            return m70513i();
        }
        f51231g.mo59808d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        zzi zzi = new zzi();
        this.f51236d.mo59820q(new zzaj(this, zzi, i, str, str2, i2, zzi), zzi);
        return zzi.mo60030a();
    }

    /* renamed from: b0 */
    public final void mo59607b0(int i) {
        if (this.f51236d != null) {
            f51231g.mo59808d("notifySessionFailed", new Object[0]);
            zzi zzi = new zzi();
            this.f51236d.mo59820q(new zzai(this, zzi, i, zzi), zzi);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: c */
    public final synchronized void mo59608c() {
        if (this.f51237e == null) {
            f51231g.mo59809e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        zzag zzag = f51231g;
        zzag.mo59808d("keepAlive", new Object[0]);
        if (!this.f51238f.compareAndSet(false, true)) {
            zzag.mo59808d("Service is already kept alive.", new Object[0]);
            return;
        }
        zzi zzi = new zzi();
        this.f51237e.mo59820q(new zzak(this, zzi, zzi), zzi);
    }

    /* renamed from: d */
    public final void mo59609d(List list) {
        if (this.f51236d != null) {
            f51231g.mo59808d("cancelDownloads(%s)", list);
            zzi zzi = new zzi();
            this.f51236d.mo59820q(new zzad(this, zzi, list, zzi), zzi);
        }
    }

    /* renamed from: e */
    public final void mo59610e(int i, String str, String str2, int i2) {
        if (this.f51236d != null) {
            f51231g.mo59808d("notifyChunkTransferred", new Object[0]);
            zzi zzi = new zzi();
            this.f51236d.mo59820q(new zzag(this, zzi, i, str, str2, i2, zzi), zzi);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: f */
    public final Task mo59611f(Map map) {
        if (this.f51236d == null) {
            return m70513i();
        }
        f51231g.mo59808d("syncPacks", new Object[0]);
        zzi zzi = new zzi();
        this.f51236d.mo59820q(new zzae(this, zzi, map, zzi), zzi);
        return zzi.mo60030a();
    }

    /* renamed from: z1 */
    public final void mo59612z1(String str) {
        if (this.f51236d != null) {
            f51231g.mo59808d("removePack(%s)", str);
            zzi zzi = new zzi();
            this.f51236d.mo59820q(new zzab(this, zzi, str, zzi), zzi);
        }
    }
}
