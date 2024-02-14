package p133m5;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.WebDialog;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: m5.c */
/* compiled from: FacebookSignInHandler */
public class C7936c extends C7959j<AuthUI.IdpConfig> {

    /* renamed from: e */
    private List<String> f19053e;

    /* renamed from: f */
    private final FacebookCallback<LoginResult> f19054f = new C7938b();

    /* renamed from: g */
    private final CallbackManager f19055g = CallbackManager.Factory.create();

    /* renamed from: m5.c$b */
    /* compiled from: FacebookSignInHandler */
    private class C7938b implements FacebookCallback<LoginResult> {
        private C7938b() {
        }
    }

    public C7936c(Application application) {
        super(application, "facebook.com");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo34263h() {
        Collection stringArrayList = ((AuthUI.IdpConfig) mo34277f()).mo34056a().getStringArrayList("extra_facebook_permissions");
        if (stringArrayList == null) {
            stringArrayList = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(stringArrayList);
        if (!arrayList.contains(NotificationCompat.CATEGORY_EMAIL)) {
            arrayList.add(NotificationCompat.CATEGORY_EMAIL);
        }
        if (!arrayList.contains("public_profile")) {
            arrayList.add("public_profile");
        }
        this.f19053e = arrayList;
        LoginManager.getInstance().registerCallback(this.f19055g, this.f19054f);
    }

    /* renamed from: l */
    public void mo34270l(int i, int i2, @Nullable Intent intent) {
        this.f19055g.onActivityResult(i, i2, intent);
    }

    /* renamed from: m */
    public void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        WebDialog.setWebDialogTheme(helperActivityBase.mo34180O1().f15987f);
        LoginManager.getInstance().logInWithReadPermissions(helperActivityBase, this.f19053e);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        LoginManager.getInstance().unregisterCallback(this.f19055g);
    }
}
