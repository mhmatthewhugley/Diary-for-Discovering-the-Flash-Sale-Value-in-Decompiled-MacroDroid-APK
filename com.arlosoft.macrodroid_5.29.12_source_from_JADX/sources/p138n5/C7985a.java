package p138n5;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.firebase.auth.FirebaseUser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: n5.a */
/* compiled from: FragmentBase */
public abstract class C7985a extends Fragment implements C7988c {

    /* renamed from: a */
    private HelperActivityBase f19145a;

    /* renamed from: U */
    public FlowParameters mo37887U() {
        return this.f19145a.mo34180O1();
    }

    /* renamed from: V */
    public void mo37888V(FirebaseUser firebaseUser, IdpResponse idpResponse, @Nullable String str) {
        this.f19145a.mo34182Q1(firebaseUser, idpResponse, str);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof HelperActivityBase) {
            this.f19145a = (HelperActivityBase) activity;
            return;
        }
        throw new IllegalStateException("Cannot use this fragment without the helper activity");
    }
}
