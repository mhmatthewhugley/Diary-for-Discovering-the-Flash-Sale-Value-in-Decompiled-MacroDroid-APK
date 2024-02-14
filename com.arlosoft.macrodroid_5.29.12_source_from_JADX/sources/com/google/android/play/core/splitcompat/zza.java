package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.internal.zzbw;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zza {

    /* renamed from: a */
    private final zze f51763a;

    public zza(zze zze) {
        this.f51763a = zze;
    }

    /* renamed from: b */
    public static final int m71064b(AssetManager assetManager, File file) {
        int intValue = ((Integer) zzbw.m70887d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        return intValue;
    }

    /* renamed from: a */
    public final synchronized void mo59934a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m71064b(assets, (File) it.next());
        }
    }
}
