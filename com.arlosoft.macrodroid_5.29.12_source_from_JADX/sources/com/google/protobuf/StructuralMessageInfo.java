package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

final class StructuralMessageInfo implements MessageInfo {

    /* renamed from: a */
    private final ProtoSyntax f57099a;

    /* renamed from: b */
    private final boolean f57100b;

    /* renamed from: c */
    private final int[] f57101c;

    /* renamed from: d */
    private final FieldInfo[] f57102d;

    /* renamed from: e */
    private final MessageLite f57103e;

    public static final class Builder {

        /* renamed from: a */
        private final List<FieldInfo> f57104a = new ArrayList();

        /* renamed from: b */
        private int[] f57105b = null;
    }

    /* renamed from: a */
    public boolean mo65340a() {
        return this.f57100b;
    }

    /* renamed from: b */
    public MessageLite mo65341b() {
        return this.f57103e;
    }

    /* renamed from: c */
    public ProtoSyntax mo65342c() {
        return this.f57099a;
    }

    /* renamed from: d */
    public int[] mo65432d() {
        return this.f57101c;
    }

    /* renamed from: e */
    public FieldInfo[] mo65433e() {
        return this.f57102d;
    }
}
