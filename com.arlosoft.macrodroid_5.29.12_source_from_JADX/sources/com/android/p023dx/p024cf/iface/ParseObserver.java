package com.android.p023dx.p024cf.iface;

import com.android.p023dx.util.ByteArray;

/* renamed from: com.android.dx.cf.iface.ParseObserver */
public interface ParseObserver {
    void changeIndent(int i);

    void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member);

    void parsed(ByteArray byteArray, int i, int i2, String str);

    void startParsingMember(ByteArray byteArray, int i, String str, String str2);
}
