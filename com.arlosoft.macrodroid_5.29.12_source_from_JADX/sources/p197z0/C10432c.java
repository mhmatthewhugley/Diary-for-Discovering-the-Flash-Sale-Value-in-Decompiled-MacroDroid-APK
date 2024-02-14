package p197z0;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.arlosoft.macrodroid.avatar.views.AvatarView;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: z0.c */
/* compiled from: ImageLoaderBase */
public abstract class C10432c implements C10431b {

    /* renamed from: a */
    private String f23694a = HelpFormatter.DEFAULT_OPT_PREFIX;

    /* renamed from: b */
    public void mo41153b(@NonNull AvatarView avatarView, Bitmap bitmap, String str) {
        mo24419e(avatarView, new C10430a(str, this.f23694a), bitmap);
    }

    /* renamed from: c */
    public void mo41154c(@NonNull AvatarView avatarView, Uri uri, String str) {
        mo24420f(avatarView, new C10430a(str, this.f23694a), uri);
    }

    /* renamed from: d */
    public void mo41155d(@NonNull AvatarView avatarView, String str, String str2) {
        mo24418a(avatarView, new C10430a(str2, this.f23694a), str);
    }

    /* renamed from: e */
    public abstract void mo24419e(@NonNull AvatarView avatarView, @NonNull C10430a aVar, Bitmap bitmap);

    /* renamed from: f */
    public abstract void mo24420f(@NonNull AvatarView avatarView, @NonNull C10430a aVar, Uri uri);
}
