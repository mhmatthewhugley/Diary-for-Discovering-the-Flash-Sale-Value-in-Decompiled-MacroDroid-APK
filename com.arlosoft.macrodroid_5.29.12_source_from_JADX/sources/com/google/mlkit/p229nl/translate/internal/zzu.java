package com.google.mlkit.p229nl.translate.internal;

import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.p229nl.translate.C11550R;
import com.google.mlkit.p229nl.translate.TranslateRemoteModel;

@WorkerThread
/* renamed from: com.google.mlkit.nl.translate.internal.zzu */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzu {

    /* renamed from: b */
    private static final int f56542b = C11550R.raw.translate_models_metadata;

    /* renamed from: a */
    private final zzt f56543a;

    public zzu(zzt zzt) {
        this.f56543a = zzt;
    }

    /* renamed from: b */
    private static final ModelInfo m79269b(String str, String str2, String str3) {
        return new ModelInfo(TranslateRemoteModel.m79145g(str), Uri.parse(String.format(str3, new Object[]{"v5", "r29", str})), str2, ModelType.TRANSLATE);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00cb */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo64715a(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull com.google.mlkit.p229nl.translate.TranslateRemoteModel r8) throws com.google.mlkit.common.MlKitException {
        /*
            r6 = this;
            java.lang.String r8 = r8.mo64631f()
            java.lang.String r8 = com.google.mlkit.p229nl.translate.internal.zzad.m79188e(r8)
            r0 = 13
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ NotFoundException -> 0x00ce, IOException -> 0x00cc }
            int r1 = f56542b     // Catch:{ NotFoundException -> 0x00ce, IOException -> 0x00cc }
            java.io.InputStream r7 = r7.openRawResource(r1)     // Catch:{ NotFoundException -> 0x00ce, IOException -> 0x00cc }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ all -> 0x00ac }
            r1.<init>(r7)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "\\A"
            java.util.Scanner r1 = r1.useDelimiter(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.next()     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x0028
            r7.close()     // Catch:{ NotFoundException -> 0x00ce, IOException -> 0x00cc }
        L_0x0028:
            com.google.android.gms.internal.mlkit_translate.zzbo r7 = com.google.android.gms.internal.mlkit_translate.zzbt.m61650b(r1)     // Catch:{ zzbv -> 0x009e }
            com.google.android.gms.internal.mlkit_translate.zzbr r7 = r7.mo52101c()     // Catch:{ zzbv -> 0x009e }
            java.lang.String r1 = "PKG_HIGH"
            com.google.android.gms.internal.mlkit_translate.zzbr r1 = r7.mo52107f(r1)
            java.lang.String r2 = "PKG_LOW"
            com.google.android.gms.internal.mlkit_translate.zzbr r7 = r7.mo52107f(r2)
            boolean r2 = r1.mo52112k(r8)
            if (r2 != 0) goto L_0x0056
            boolean r2 = r7.mo52112k(r8)
            if (r2 == 0) goto L_0x0049
            goto L_0x0056
        L_0x0049:
            com.google.mlkit.nl.translate.internal.zzt r7 = r6.f56543a
            r7.mo64709u()
            com.google.mlkit.common.MlKitException r7 = new com.google.mlkit.common.MlKitException
            java.lang.String r8 = "Could not locate the model metadata."
            r7.<init>(r8, r0)
            throw r7
        L_0x0056:
            boolean r2 = r1.mo52112k(r8)     // Catch:{ IllegalStateException -> 0x0090, NullPointerException -> 0x008e, ClassCastException -> 0x008c }
            if (r2 == 0) goto L_0x0061
            com.google.android.gms.internal.mlkit_translate.zzbo r7 = r1.mo52105d(r8)     // Catch:{ IllegalStateException -> 0x0090, NullPointerException -> 0x008e, ClassCastException -> 0x008c }
            goto L_0x0065
        L_0x0061:
            com.google.android.gms.internal.mlkit_translate.zzbo r7 = r7.mo52105d(r8)     // Catch:{ IllegalStateException -> 0x0090, NullPointerException -> 0x008e, ClassCastException -> 0x008c }
        L_0x0065:
            com.google.android.gms.internal.mlkit_translate.zzbr r7 = r7.mo52101c()     // Catch:{ IllegalStateException -> 0x0090, NullPointerException -> 0x008e, ClassCastException -> 0x008c }
            java.lang.String r1 = "HASH"
            com.google.android.gms.internal.mlkit_translate.zzbu r7 = r7.mo52108h(r1)     // Catch:{ IllegalStateException -> 0x0090, NullPointerException -> 0x008e, ClassCastException -> 0x008c }
            java.lang.String r7 = r7.mo52116h()     // Catch:{ IllegalStateException -> 0x0090, NullPointerException -> 0x008e, ClassCastException -> 0x008c }
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "https://redirector.gvt1.com/edgedl/translate/offline/%s/high/%s/%s.zip"
            com.google.mlkit.common.sdkinternal.ModelInfo r1 = m79269b(r8, r7, r1)
            r0.add(r1)
            java.lang.String r1 = "https://dl.google.com/translate/offline/%s/high/%s/%s.zip"
            com.google.mlkit.common.sdkinternal.ModelInfo r7 = m79269b(r8, r7, r1)
            r0.add(r7)
            return r0
        L_0x008c:
            r7 = move-exception
            goto L_0x0091
        L_0x008e:
            r7 = move-exception
            goto L_0x0091
        L_0x0090:
            r7 = move-exception
        L_0x0091:
            com.google.mlkit.nl.translate.internal.zzt r8 = r6.f56543a
            r8.mo64707s()
            com.google.mlkit.common.MlKitException r8 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Could not locate model's hash."
            r8.<init>(r1, r0, r7)
            throw r8
        L_0x009e:
            r7 = move-exception
            com.google.mlkit.nl.translate.internal.zzt r8 = r6.f56543a
            r8.mo64708t()
            com.google.mlkit.common.MlKitException r8 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Translate metadata could not be parsed."
            r8.<init>(r1, r0, r7)
            throw r8
        L_0x00ac:
            r8 = move-exception
            if (r7 == 0) goto L_0x00cb
            r7.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00cb
        L_0x00b3:
            r7 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00cb }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x00cb }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00cb }
            r1[r4] = r7     // Catch:{ Exception -> 0x00cb }
            r2.invoke(r8, r1)     // Catch:{ Exception -> 0x00cb }
        L_0x00cb:
            throw r8     // Catch:{ NotFoundException -> 0x00ce, IOException -> 0x00cc }
        L_0x00cc:
            r7 = move-exception
            goto L_0x00cf
        L_0x00ce:
            r7 = move-exception
        L_0x00cf:
            com.google.mlkit.nl.translate.internal.zzt r8 = r6.f56543a
            r8.mo64706r()
            com.google.mlkit.common.MlKitException r8 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Translate metadata could not be located."
            r8.<init>(r1, r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.p229nl.translate.internal.zzu.mo64715a(android.content.Context, com.google.mlkit.nl.translate.TranslateRemoteModel):java.util.List");
    }
}
