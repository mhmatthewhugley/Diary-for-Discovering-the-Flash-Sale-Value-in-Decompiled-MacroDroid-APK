package com.google.common.xml;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class XmlEscapers {

    /* renamed from: a */
    private static final Escaper f53718a;

    /* renamed from: b */
    private static final Escaper f53719b;

    /* renamed from: c */
    private static final Escaper f53720c;

    static {
        Escapers.Builder a = Escapers.m29222a();
        a.mo36796d(0, 65533);
        a.mo36797e("�");
        for (char c = 0; c <= 31; c = (char) (c + 1)) {
            if (!(c == 9 || c == 10 || c == 13)) {
                a.mo36794b(c, "�");
            }
        }
        a.mo36794b('&', "&amp;");
        a.mo36794b('<', "&lt;");
        a.mo36794b('>', "&gt;");
        f53719b = a.mo36795c();
        a.mo36794b('\'', "&apos;");
        a.mo36794b('\"', "&quot;");
        f53718a = a.mo36795c();
        a.mo36794b(9, "&#x9;");
        a.mo36794b(10, "&#xA;");
        a.mo36794b(13, "&#xD;");
        f53720c = a.mo36795c();
    }

    private XmlEscapers() {
    }
}
