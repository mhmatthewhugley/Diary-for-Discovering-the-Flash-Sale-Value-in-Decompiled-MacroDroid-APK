package com.google.protobuf;

final class RawMessageInfo implements MessageInfo {

    /* renamed from: a */
    private final MessageLite f57052a;

    /* renamed from: b */
    private final String f57053b;

    /* renamed from: c */
    private final Object[] f57054c;

    /* renamed from: d */
    private final int f57055d;

    RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f57052a = messageLite;
        this.f57053b = str;
        this.f57054c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f57055d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f57055d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo65340a() {
        return (this.f57055d & 2) == 2;
    }

    /* renamed from: b */
    public MessageLite mo65341b() {
        return this.f57052a;
    }

    /* renamed from: c */
    public ProtoSyntax mo65342c() {
        return (this.f57055d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo65372d() {
        return this.f57054c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo65373e() {
        return this.f57053b;
    }
}
