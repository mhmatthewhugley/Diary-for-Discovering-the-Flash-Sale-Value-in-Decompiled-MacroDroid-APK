package com.sun.mail.imap;

import com.sun.mail.util.DefaultProvider;
import javax.mail.Provider;
import p438y7.C16959h;

@DefaultProvider
public class IMAPSSLProvider extends Provider {
    public IMAPSSLProvider() {
        super(Provider.Type.STORE, "imaps", C16959h.class.getName(), "Oracle", (String) null);
    }
}
