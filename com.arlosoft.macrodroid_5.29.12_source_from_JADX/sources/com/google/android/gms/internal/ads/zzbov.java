package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbov implements zzfsm {

    /* renamed from: a */
    public final /* synthetic */ String f27595a;

    public /* synthetic */ zzbov(String str) {
        this.f27595a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f27595a;
        String str2 = (String) obj;
        zzbpu zzbpu = zzbpt.f27603a;
        if (str2 != null) {
            if (((Boolean) zzbkr.f27457f.mo42728e()).booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str).getHost();
                int i = 0;
                while (true) {
                    if (i < 3) {
                        if (host.endsWith(strArr[i])) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            String str3 = (String) zzbkr.f27452a.mo42728e();
            String str4 = (String) zzbkr.f27453b.mo42728e();
            if (!TextUtils.isEmpty(str3)) {
                str = str.replace(str3, str2);
            }
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                    return parse.buildUpon().appendQueryParameter(str4, str2).toString();
                }
            }
        }
        return str;
    }
}
