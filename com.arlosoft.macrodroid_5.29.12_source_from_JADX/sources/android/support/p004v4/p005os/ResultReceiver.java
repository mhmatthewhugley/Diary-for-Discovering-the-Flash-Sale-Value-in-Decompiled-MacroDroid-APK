package android.support.p004v4.p005os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p004v4.p005os.C0112a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0109a();

    /* renamed from: a */
    final boolean f286a = false;

    /* renamed from: c */
    final Handler f287c = null;

    /* renamed from: d */
    C0112a f288d;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0109a implements Parcelable.Creator<ResultReceiver> {
        C0109a() {
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0110b extends C0112a.C0113a {
        C0110b() {
        }

        /* renamed from: G6 */
        public void mo404G6(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f287c;
            if (handler != null) {
                handler.post(new C0111c(i, bundle));
            } else {
                resultReceiver.mo240a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0111c implements Runnable {

        /* renamed from: a */
        final int f290a;

        /* renamed from: c */
        final Bundle f291c;

        C0111c(int i, Bundle bundle) {
            this.f290a = i;
            this.f291c = bundle;
        }

        public void run() {
            ResultReceiver.this.mo240a(this.f290a, this.f291c);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f288d = C0112a.C0113a.m356y(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo240a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo397b(int i, Bundle bundle) {
        if (this.f286a) {
            Handler handler = this.f287c;
            if (handler != null) {
                handler.post(new C0111c(i, bundle));
            } else {
                mo240a(i, bundle);
            }
        } else {
            C0112a aVar = this.f288d;
            if (aVar != null) {
                try {
                    aVar.mo404G6(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            if (this.f288d == null) {
                this.f288d = new C0110b();
            }
            parcel.writeStrongBinder(this.f288d.asBinder());
        }
    }
}
