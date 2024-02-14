package p215b8;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;
import p292io.reactivex.subjects.C13244c;

/* renamed from: b8.c */
/* compiled from: RxPermissionsFragment */
public class C11109c extends Fragment {

    /* renamed from: a */
    private Map<String, C13244c<C11101a>> f54034a = new HashMap();

    /* renamed from: c */
    private boolean f54035c;

    /* renamed from: U */
    public boolean mo62239U(@NonNull String str) {
        return this.f54034a.containsKey(str);
    }

    /* renamed from: V */
    public C13244c<C11101a> mo62240V(@NonNull String str) {
        return this.f54034a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo62241W(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(str) == 0;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo62242X(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo62243Z(String str) {
        if (this.f54035c) {
            String str2 = C11102b.f54021b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo62244a0(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            mo62243Z("onRequestPermissionsResult  " + strArr[i]);
            C13244c cVar = this.f54034a.get(strArr[i]);
            if (cVar == null) {
                Log.e(C11102b.f54021b, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f54034a.remove(strArr[i]);
            cVar.onNext(new C11101a(strArr[i], iArr[i] == 0, zArr[i]));
            cVar.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo62245e0(@NonNull String[] strArr) {
        requestPermissions(strArr, 42);
    }

    /* renamed from: f0 */
    public void mo62246f0(@NonNull String str, @NonNull C13244c<C11101a> cVar) {
        this.f54034a.put(str, cVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 42) {
            boolean[] zArr = new boolean[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
            }
            mo62244a0(strArr, iArr, zArr);
        }
    }
}
