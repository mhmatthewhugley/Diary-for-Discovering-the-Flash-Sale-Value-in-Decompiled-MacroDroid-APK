package com.github.javiersantos.licensing;

class LibraryValidator {

    /* renamed from: a */
    private final Policy f16230a;

    /* renamed from: b */
    private final LibraryCheckerCallback f16231b;

    /* renamed from: c */
    private final int f16232c;

    /* renamed from: d */
    private final String f16233d;

    /* renamed from: e */
    private final String f16234e;

    /* renamed from: f */
    private final DeviceLimiter f16235f;

    /* renamed from: e */
    private void m26160e(int i) {
        this.f16231b.mo34329b(i);
    }

    /* renamed from: f */
    private void m26161f() {
        this.f16231b.mo34330c(435);
    }

    /* renamed from: g */
    private void m26162g(int i, ResponseData responseData) {
        this.f16230a.mo34317b(i, responseData);
        if (this.f16230a.mo34316a()) {
            this.f16231b.mo34328a(i);
        } else {
            this.f16231b.mo34330c(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34331a(java.security.PublicKey r7, int r8, java.lang.String r9, java.util.Calendar r10, java.lang.String r11) {
        /*
            r6 = this;
            r0 = 5
            r1 = 0
            r2 = 2
            r3 = 1
            java.lang.String r4 = "LibraryValidator"
            if (r10 != 0) goto L_0x000c
            r6.m26161f()
            goto L_0x0013
        L_0x000c:
            if (r8 == 0) goto L_0x0016
            if (r8 == r3) goto L_0x0016
            if (r8 != r2) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r7 = r1
            goto L_0x00a2
        L_0x0016:
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            if (r10 == 0) goto L_0x0025
            java.lang.String r7 = "Signature verification failed: signedData is empty. (Device not signed-in to any Google accounts?)"
            android.util.Log.e(r4, r7)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            r6.m26161f()     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            return
        L_0x0025:
            java.lang.String r10 = "SHA1withRSA"
            java.security.Signature r10 = java.security.Signature.getInstance(r10)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            r10.initVerify(r7)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            byte[] r7 = r9.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            r10.update(r7)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            byte[] r7 = com.github.javiersantos.licensing.util.Base64.m26184a(r11)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            boolean r7 = r10.verify(r7)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            if (r7 != 0) goto L_0x0048
            java.lang.String r7 = "Signature verification failed."
            android.util.Log.e(r4, r7)     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            r6.m26161f()     // Catch:{ NoSuchAlgorithmException -> 0x010d, SignatureException -> 0x010b, InvalidKeyException -> 0x0107, Base64DecoderException -> 0x00fe }
            return
        L_0x0048:
            com.github.javiersantos.licensing.ResponseData r1 = com.github.javiersantos.licensing.ResponseData.m26173a(r9)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            int r7 = r1.f16239a
            if (r7 == r8) goto L_0x0059
            java.lang.String r7 = "Response codes don't match."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x0059:
            int r7 = r1.f16240b
            int r9 = r6.f16232c
            if (r7 == r9) goto L_0x0068
            java.lang.String r7 = "Nonce doesn't match."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x0068:
            java.lang.String r7 = r1.f16241c
            java.lang.String r9 = r6.f16233d
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "Package name doesn't match."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x007b:
            java.lang.String r7 = r1.f16242d
            java.lang.String r9 = r6.f16234e
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x008e
            java.lang.String r7 = "Version codes don't match."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x008e:
            java.lang.String r7 = r1.f16243e
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x009f
            java.lang.String r7 = "User identifier is empty."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x009f:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x00a2:
            if (r8 == 0) goto L_0x00eb
            if (r8 == r3) goto L_0x00e5
            if (r8 == r2) goto L_0x00eb
            r9 = 3
            if (r8 == r9) goto L_0x00e1
            r9 = 4
            r10 = 3144(0xc48, float:4.406E-42)
            if (r8 == r9) goto L_0x00d8
            if (r8 == r0) goto L_0x00cf
            switch(r8) {
                case 257: goto L_0x00c6;
                case 258: goto L_0x00c2;
                case 259: goto L_0x00be;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            java.lang.String r7 = "Unknown response code for license check."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            goto L_0x00f4
        L_0x00be:
            r6.m26160e(r2)
            goto L_0x00f4
        L_0x00c2:
            r6.m26160e(r3)
            goto L_0x00f4
        L_0x00c6:
            java.lang.String r8 = "Error contacting licensing server."
            android.util.Log.w(r4, r8)
            r6.m26162g(r10, r7)
            goto L_0x00f4
        L_0x00cf:
            java.lang.String r8 = "Licensing server is refusing to talk to this device, over quota."
            android.util.Log.w(r4, r8)
            r6.m26162g(r10, r7)
            goto L_0x00f4
        L_0x00d8:
            java.lang.String r8 = "An error has occurred on the licensing server."
            android.util.Log.w(r4, r8)
            r6.m26162g(r10, r7)
            goto L_0x00f4
        L_0x00e1:
            r6.m26160e(r9)
            goto L_0x00f4
        L_0x00e5:
            r8 = 435(0x1b3, float:6.1E-43)
            r6.m26162g(r8, r7)
            goto L_0x00f4
        L_0x00eb:
            com.github.javiersantos.licensing.DeviceLimiter r8 = r6.f16235f
            int r8 = r8.mo34321a(r1)
            r6.m26162g(r8, r7)
        L_0x00f4:
            return
        L_0x00f5:
            java.lang.String r7 = "Could not parse response."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x00fe:
            java.lang.String r7 = "Could not Base64-decode signature."
            android.util.Log.e(r4, r7)
            r6.m26161f()
            return
        L_0x0107:
            r6.m26160e(r0)
            return
        L_0x010b:
            r7 = move-exception
            goto L_0x010e
        L_0x010d:
            r7 = move-exception
        L_0x010e:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.javiersantos.licensing.LibraryValidator.mo34331a(java.security.PublicKey, int, java.lang.String, java.util.Calendar, java.lang.String):void");
    }

    /* renamed from: b */
    public LibraryCheckerCallback mo34332b() {
        return this.f16231b;
    }

    /* renamed from: c */
    public int mo34333c() {
        return this.f16232c;
    }

    /* renamed from: d */
    public String mo34334d() {
        return this.f16233d;
    }
}
