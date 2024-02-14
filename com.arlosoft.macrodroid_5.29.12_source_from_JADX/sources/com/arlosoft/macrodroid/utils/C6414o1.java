package com.arlosoft.macrodroid.utils;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* renamed from: com.arlosoft.macrodroid.utils.o1 */
/* compiled from: UdpSender */
public class C6414o1 {
    /* renamed from: c */
    private void m24696c(Context context, String str) {
        C4878b.m18873l("UDP Send failed: " + str);
        if (C5163j2.m20136d1(context)) {
            C4061t1.m16023v(context, context.getString(C17541R$string.udp_failed), str, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m24697d(String str, byte[] bArr, int i, Context context) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            DatagramSocket datagramSocket = new DatagramSocket();
            if (!datagramSocket.getBroadcast()) {
                datagramSocket.setBroadcast(true);
            }
            datagramSocket.send(new DatagramPacket(bArr, bArr.length, byName, i));
            datagramSocket.close();
        } catch (Exception e) {
            m24696c(context, e.toString());
        }
    }

    /* renamed from: b */
    public void mo32451b(Context context, String str, int i, String str2) {
        if (str2 == null) {
            m24696c(context, "empty message");
        }
        byte[] bytes = str2.getBytes();
        if (str2.startsWith("\\0x")) {
            bytes = str2.replace("\\0x", "0x").getBytes();
        } else if (str2.startsWith("0x")) {
            String replace = str2.replace("0x", "");
            if (!replace.matches("[a-fA-F0-9]+")) {
                m24696c(context, "Invalid Message Format");
                return;
            }
            bytes = C6387h0.m24641a(replace);
        }
        C4878b.m18873l("Sending UDP to " + str + ":" + i);
        new Thread(new C6408n1(this, str, bytes, i, context)).start();
    }
}
