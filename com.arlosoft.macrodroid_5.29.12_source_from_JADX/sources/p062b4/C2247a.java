package p062b4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.videos.data.VideoInfo;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* renamed from: b4.a */
/* compiled from: VideoHelper.kt */
public final class C2247a {

    /* renamed from: a */
    private final Context f6884a;

    public C2247a(Context context) {
        C13706o.m87929f(context, "context");
        this.f6884a = context;
    }

    /* renamed from: a */
    public final void mo24471a(VideoInfo videoInfo) {
        C13706o.m87929f(videoInfo, "videoInfo");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(videoInfo.getUrl()));
            intent.setFlags(intent.getFlags() + 268435456);
            this.f6884a.startActivity(intent);
        } catch (Exception unused) {
            Context context = this.f6884a;
            C15626c.m94876a(context, this.f6884a.getString(C17541R$string.no_app_available) + ':' + videoInfo.getUrl(), 1).show();
        }
    }
}
