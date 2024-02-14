package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.json.JsonFactory;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class CloudShellCredential extends GoogleCredential {

    /* renamed from: u */
    private final int f52236u;

    /* renamed from: v */
    private final JsonFactory f52237v;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public TokenResponse mo60097d() throws IOException {
        Socket socket = new Socket("localhost", mo60216y());
        socket.setSoTimeout(SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        TokenResponse tokenResponse = new TokenResponse();
        try {
            new PrintWriter(socket.getOutputStream(), true).println("2\n[]");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.readLine();
            tokenResponse.mo60150q(((List) this.f52237v.mo60174d(bufferedReader).mo60538v(LinkedList.class, Object.class)).get(2).toString());
            return tokenResponse;
        } finally {
            socket.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public int mo60216y() {
        return this.f52236u;
    }
}
