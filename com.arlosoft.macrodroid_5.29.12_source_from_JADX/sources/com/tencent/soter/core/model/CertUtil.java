package com.tencent.soter.core.model;

import android.util.Base64;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

public class CertUtil {
    public static final String JSON_KEY_COUNTER = "counter";
    public static final String JSON_KEY_CPU_ID = "cpu_id";
    public static final String JSON_KEY_UID = "uid";
    private static final String KEY_DESCRIPTION_OID = "1.3.6.1.4.1.11129.2.1.17";
    private static final int LINE_LENGTH = 64;
    private static final String LINE_SEPARATOR = "\n";
    protected static final String TAG = "Soter.CertUtil";

    public static void extractAttestationSequence(X509Certificate x509Certificate, SoterPubKeyModel soterPubKeyModel) throws Exception, IOException {
        byte[] extensionValue = x509Certificate.getExtensionValue(KEY_DESCRIPTION_OID);
        if (extensionValue == null || extensionValue.length == 0) {
            throw new Exception("Couldn't find the keystore attestation extension data.");
        }
        byte b = "{".getBytes()[0];
        byte b2 = "}".getBytes()[0];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < extensionValue.length; i3++) {
            byte b3 = extensionValue[i3];
            if (b3 == b) {
                i = i3;
            } else if (b3 == b2) {
                i2 = i3;
            }
        }
        if (i > 0 && i < i2) {
            int i4 = (i2 - i) + 1;
            if (extensionValue[i - 1] != i4) {
                SLogger.m81943w(TAG, "read extension lenght error", new Object[0]);
            }
            byte[] bArr = new byte[i4];
            System.arraycopy(extensionValue, i, bArr, 0, i4);
            String str = new String(bArr);
            SLogger.m81941i(TAG, "soter: challenge json in attestation certificate " + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            soterPubKeyModel.setCpu_id(jSONObject.getString("cpu_id"));
            soterPubKeyModel.setUid(jSONObject.getInt("uid"));
            soterPubKeyModel.setCounter(jSONObject.getLong("counter"));
        }
    }

    public static String format(Certificate certificate) throws Exception {
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        writePreEncapsulationBoundary(bufferedWriter, "CERTIFICATE");
        writeEncoded(bufferedWriter, Base64.encode(certificate.getEncoded(), 2));
        writePostEncapsulationBoundary(bufferedWriter, "CERTIFICATE");
        bufferedWriter.close();
        return stringWriter.toString();
    }

    private static void writeEncoded(BufferedWriter bufferedWriter, byte[] bArr) throws IOException {
        char[] cArr = new char[64];
        for (int i = 0; i < bArr.length; i += 64) {
            int i2 = 0;
            while (i2 != 64) {
                int i3 = i + i2;
                if (i3 >= bArr.length) {
                    break;
                }
                cArr[i2] = (char) bArr[i3];
                i2++;
            }
            bufferedWriter.write(cArr, 0, i2);
            bufferedWriter.write("\n");
        }
    }

    private static void writePostEncapsulationBoundary(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write("-----END " + str + "-----");
        bufferedWriter.write("\n");
    }

    private static void writePreEncapsulationBoundary(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write("-----BEGIN " + str + "-----");
        bufferedWriter.write("\n");
    }
}
