package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C1721R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbyc extends zzbyf {

    /* renamed from: c */
    private final Map f27974c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f27975d;

    public zzbyc(zzcmp zzcmp, Map map) {
        super(zzcmp, "storePicture");
        this.f27974c = map;
        this.f27975d = zzcmp.mo43756i();
    }

    /* renamed from: i */
    public final void mo43210i() {
        if (this.f27975d == null) {
            mo43218c("Activity context is not available");
            return;
        }
        zzt.m2905r();
        if (!new zzbim(this.f27975d).mo42644c()) {
            mo43218c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f27974c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo43218c("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.m2905r();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources d = zzt.m2904q().mo43491d();
                zzt.m2905r();
                AlertDialog.Builder g = zzs.m2756g(this.f27975d);
                g.setTitle(d != null ? d.getString(C1721R.string.f1781s1) : "Save image");
                g.setMessage(d != null ? d.getString(C1721R.string.f1782s2) : "Allow Ad to store image in Picture gallery?");
                g.setPositiveButton(d != null ? d.getString(C1721R.string.f1783s3) : "Accept", new zzbya(this, str, lastPathSegment));
                g.setNegativeButton(d != null ? d.getString(C1721R.string.f1784s4) : "Decline", new zzbyb(this));
                g.create().show();
                return;
            }
            mo43218c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            mo43218c("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
