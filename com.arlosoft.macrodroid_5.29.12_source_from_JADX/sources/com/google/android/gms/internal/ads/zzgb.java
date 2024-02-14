package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgb extends zzer {

    /* renamed from: e */
    private final byte[] f36630e;

    /* renamed from: f */
    private final DatagramPacket f36631f;
    @Nullable

    /* renamed from: g */
    private Uri f36632g;
    @Nullable

    /* renamed from: h */
    private DatagramSocket f36633h;
    @Nullable

    /* renamed from: i */
    private MulticastSocket f36634i;
    @Nullable

    /* renamed from: j */
    private InetAddress f36635j;

    /* renamed from: k */
    private boolean f36636k;

    /* renamed from: l */
    private int f36637l;

    public zzgb() {
        this(2000);
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f36632g;
    }

    /* renamed from: d */
    public final void mo43926d() {
        this.f36632g = null;
        MulticastSocket multicastSocket = this.f36634i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f36635j;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f36634i = null;
        }
        DatagramSocket datagramSocket = this.f36633h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f36633h = null;
        }
        this.f36635j = null;
        this.f36637l = 0;
        if (this.f36636k) {
            this.f36636k = false;
            mo45436o();
        }
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws zzga {
        if (i2 == 0) {
            return 0;
        }
        if (this.f36637l == 0) {
            try {
                DatagramSocket datagramSocket = this.f36633h;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f36631f);
                int length = this.f36631f.getLength();
                this.f36637l = length;
                mo45439x(length);
            } catch (SocketTimeoutException e) {
                throw new zzga(e, 2002);
            } catch (IOException e2) {
                throw new zzga(e2, 2001);
            }
        }
        int length2 = this.f36631f.getLength();
        int i3 = this.f36637l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f36630e, length2 - i3, bArr, i, min);
        this.f36637l -= min;
        return min;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws zzga {
        Uri uri = zzfc.f35396a;
        this.f36632g = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f36632g.getPort();
        mo45437p(zzfc);
        try {
            this.f36635j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f36635j, port);
            if (this.f36635j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f36634i = multicastSocket;
                multicastSocket.joinGroup(this.f36635j);
                this.f36633h = this.f36634i;
            } else {
                this.f36633h = new DatagramSocket(inetSocketAddress);
            }
            this.f36633h.setSoTimeout(8000);
            this.f36636k = true;
            mo45438q(zzfc);
            return -1;
        } catch (SecurityException e) {
            throw new zzga(e, 2006);
        } catch (IOException e2) {
            throw new zzga(e2, 2001);
        }
    }

    public zzgb(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f36630e = bArr;
        this.f36631f = new DatagramPacket(bArr, 0, 2000);
    }
}
