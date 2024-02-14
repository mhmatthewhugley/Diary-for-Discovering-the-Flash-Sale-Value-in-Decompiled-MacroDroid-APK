package com.google.protobuf;

public class LazyFieldLite {

    /* renamed from: e */
    private static final ExtensionRegistryLite f56975e = ExtensionRegistryLite.m80520b();

    /* renamed from: a */
    private ByteString f56976a;

    /* renamed from: b */
    private ExtensionRegistryLite f56977b;

    /* renamed from: c */
    protected volatile MessageLite f56978c;

    /* renamed from: d */
    private volatile ByteString f56979d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f56978c = r4;
        r3.f56979d = com.google.protobuf.ByteString.f56619a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65265a(com.google.protobuf.MessageLite r4) {
        /*
            r3 = this;
            com.google.protobuf.MessageLite r0 = r3.f56978c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.MessageLite r0 = r3.f56978c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.ByteString r0 = r3.f56976a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.Parser r0 = r4.mo65178f()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r1 = r3.f56976a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ExtensionRegistryLite r2 = r3.f56977b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo64738a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.MessageLite r0 = (com.google.protobuf.MessageLite) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f56978c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = r3.f56976a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f56979d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f56978c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.f56619a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f56979d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f56978c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.ByteString r4 = com.google.protobuf.ByteString.f56619a     // Catch:{ all -> 0x0034 }
            r3.f56979d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.mo65265a(com.google.protobuf.MessageLite):void");
    }

    /* renamed from: b */
    public int mo65266b() {
        if (this.f56979d != null) {
            return this.f56979d.size();
        }
        ByteString byteString = this.f56976a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f56978c != null) {
            return this.f56978c.mo65174c();
        }
        return 0;
    }

    /* renamed from: c */
    public MessageLite mo65267c(MessageLite messageLite) {
        mo65265a(messageLite);
        return this.f56978c;
    }

    /* renamed from: d */
    public MessageLite mo65268d(MessageLite messageLite) {
        MessageLite messageLite2 = this.f56978c;
        this.f56976a = null;
        this.f56979d = null;
        this.f56978c = messageLite;
        return messageLite2;
    }

    /* renamed from: e */
    public ByteString mo65269e() {
        if (this.f56979d != null) {
            return this.f56979d;
        }
        ByteString byteString = this.f56976a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f56979d != null) {
                ByteString byteString2 = this.f56979d;
                return byteString2;
            }
            if (this.f56978c == null) {
                this.f56979d = ByteString.f56619a;
            } else {
                this.f56979d = this.f56978c.mo64717g();
            }
            ByteString byteString3 = this.f56979d;
            return byteString3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f56978c;
        MessageLite messageLite2 = lazyFieldLite.f56978c;
        if (messageLite == null && messageLite2 == null) {
            return mo65269e().equals(lazyFieldLite.mo65269e());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            return messageLite.equals(lazyFieldLite.mo65267c(messageLite.mo65176e()));
        }
        return mo65267c(messageLite2.mo65176e()).equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
