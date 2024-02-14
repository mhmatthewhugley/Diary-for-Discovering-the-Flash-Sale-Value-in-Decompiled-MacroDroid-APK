package android.support.p004v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: IMediaSession */
public interface C0106b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0107a extends Binder implements C0106b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        private static class C0108a implements C0106b {

            /* renamed from: c */
            public static C0106b f284c;

            /* renamed from: a */
            private IBinder f285a;

            C0108a(IBinder iBinder) {
                this.f285a = iBinder;
            }

            /* renamed from: V6 */
            public void mo395V6(C0104a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f285a.transact(3, obtain, obtain2, 0) || C0107a.m347t1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0107a.m347t1().mo395V6(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f285a;
            }
        }

        /* renamed from: t1 */
        public static C0106b m347t1() {
            return C0108a.f284c;
        }

        /* renamed from: y */
        public static C0106b m348y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0106b)) {
                return new C0108a(iBinder);
            }
            return (C0106b) queryLocalInterface;
        }
    }

    /* renamed from: V6 */
    void mo395V6(C0104a aVar) throws RemoteException;
}
