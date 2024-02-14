package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public final boolean mo21710y(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    IObjectWrapper f = mo22024f();
                    parcel2.writeNoException();
                    zzc.m55909f(parcel2, f);
                    return true;
                case 3:
                    Bundle d = mo22022d();
                    parcel2.writeNoException();
                    zzc.m55908e(parcel2, d);
                    return true;
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    IFragmentWrapper b = mo22019b();
                    parcel2.writeNoException();
                    zzc.m55909f(parcel2, b);
                    return true;
                case 6:
                    IObjectWrapper e = mo22023e();
                    parcel2.writeNoException();
                    zzc.m55909f(parcel2, e);
                    return true;
                case 7:
                    boolean p = mo22030p();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, p);
                    return true;
                case 8:
                    String h = mo22026h();
                    parcel2.writeNoException();
                    parcel2.writeString(h);
                    return true;
                case 9:
                    IFragmentWrapper c = mo22020c();
                    parcel2.writeNoException();
                    zzc.m55909f(parcel2, c);
                    return true;
                case 10:
                    int a = mo22018a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 11:
                    boolean r = mo22031r();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, r);
                    return true;
                case 12:
                    IObjectWrapper g = mo22025g();
                    parcel2.writeNoException();
                    zzc.m55909f(parcel2, g);
                    return true;
                case 13:
                    boolean u = mo22033u();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, u);
                    return true;
                case 14:
                    boolean w = mo22034w();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, w);
                    return true;
                case 15:
                    boolean K = mo22016K();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, K);
                    return true;
                case 16:
                    boolean D = mo22012D();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, D);
                    return true;
                case 17:
                    boolean H = mo22014H();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, H);
                    return true;
                case 18:
                    boolean I = mo22015I();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, I);
                    return true;
                case 19:
                    boolean F = mo22013F();
                    parcel2.writeNoException();
                    zzc.m55906c(parcel2, F);
                    return true;
                case 20:
                    IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                    zzc.m55905b(parcel);
                    mo22032s1(t1);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean g2 = zzc.m55910g(parcel);
                    zzc.m55905b(parcel);
                    mo22017O6(g2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean g3 = zzc.m55910g(parcel);
                    zzc.m55905b(parcel);
                    mo22027i1(g3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean g4 = zzc.m55910g(parcel);
                    zzc.m55905b(parcel);
                    mo22028k1(g4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean g5 = zzc.m55910g(parcel);
                    zzc.m55905b(parcel);
                    mo22011C1(g5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    zzc.m55905b(parcel);
                    mo22029o8((Intent) zzc.m55904a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    int readInt = parcel.readInt();
                    zzc.m55905b(parcel);
                    mo22035x8((Intent) zzc.m55904a(parcel, Intent.CREATOR), readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                    zzc.m55905b(parcel);
                    mo22021c0(t12);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: C1 */
    void mo22011C1(boolean z) throws RemoteException;

    /* renamed from: D */
    boolean mo22012D() throws RemoteException;

    /* renamed from: F */
    boolean mo22013F() throws RemoteException;

    /* renamed from: H */
    boolean mo22014H() throws RemoteException;

    /* renamed from: I */
    boolean mo22015I() throws RemoteException;

    /* renamed from: K */
    boolean mo22016K() throws RemoteException;

    /* renamed from: O6 */
    void mo22017O6(boolean z) throws RemoteException;

    /* renamed from: a */
    int mo22018a() throws RemoteException;

    @Nullable
    /* renamed from: b */
    IFragmentWrapper mo22019b() throws RemoteException;

    @Nullable
    /* renamed from: c */
    IFragmentWrapper mo22020c() throws RemoteException;

    /* renamed from: c0 */
    void mo22021c0(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    @Nullable
    /* renamed from: d */
    Bundle mo22022d() throws RemoteException;

    @NonNull
    /* renamed from: e */
    IObjectWrapper mo22023e() throws RemoteException;

    @NonNull
    /* renamed from: f */
    IObjectWrapper mo22024f() throws RemoteException;

    @NonNull
    /* renamed from: g */
    IObjectWrapper mo22025g() throws RemoteException;

    @Nullable
    /* renamed from: h */
    String mo22026h() throws RemoteException;

    /* renamed from: i1 */
    void mo22027i1(boolean z) throws RemoteException;

    /* renamed from: k1 */
    void mo22028k1(boolean z) throws RemoteException;

    /* renamed from: o8 */
    void mo22029o8(@NonNull Intent intent) throws RemoteException;

    /* renamed from: p */
    boolean mo22030p() throws RemoteException;

    /* renamed from: r */
    boolean mo22031r() throws RemoteException;

    /* renamed from: s1 */
    void mo22032s1(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: u */
    boolean mo22033u() throws RemoteException;

    /* renamed from: w */
    boolean mo22034w() throws RemoteException;

    /* renamed from: x8 */
    void mo22035x8(@NonNull Intent intent, int i) throws RemoteException;

    int zzb() throws RemoteException;
}
