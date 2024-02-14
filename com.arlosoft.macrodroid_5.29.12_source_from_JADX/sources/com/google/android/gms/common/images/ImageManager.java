package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Object f3538h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static HashSet f3539i = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f3540a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f3541b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f3542c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zam f3543d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Map f3544e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map f3545f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map f3546g;

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f3547a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ArrayList f3548c = new ArrayList();

        ImageReceiver(Uri uri) {
            super(new zau(Looper.getMainLooper()));
            this.f3547a = uri;
        }

        /* renamed from: b */
        public final void mo21587b(zag zag) {
            Asserts.m4341a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f3548c.add(zag);
        }

        /* renamed from: c */
        public final void mo21588c(zag zag) {
            Asserts.m4341a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f3548c.remove(zag);
        }

        /* renamed from: d */
        public final void mo21589d() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("com.google.android.gms.extras.uri", this.f3547a);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.f3540a.sendBroadcast(intent);
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.f3542c.execute(new zaa(imageManager, this.f3547a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface OnImageLoadedListener {
        /* renamed from: a */
        void mo21591a(@NonNull Uri uri, @Nullable Drawable drawable, boolean z);
    }
}
