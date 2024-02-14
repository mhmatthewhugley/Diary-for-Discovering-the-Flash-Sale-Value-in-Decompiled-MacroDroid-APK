package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.MessageAware;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.MultipartDataSource;
import org.apache.commons.cli.HelpFormatter;

public class MimeMultipart extends Multipart {
    protected boolean allowEmpty;
    protected boolean complete;

    /* renamed from: ds */
    protected DataSource f61344ds;
    protected boolean ignoreExistingBoundaryParameter;
    protected boolean ignoreMissingBoundaryParameter;
    protected boolean ignoreMissingEndBoundary;
    protected boolean parsed;
    protected String preamble;

    public MimeMultipart() {
        this("mixed");
    }

    private static boolean allDashes(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '-') {
                return false;
            }
        }
        return true;
    }

    private MimeBodyPart createMimeBodyPartIs(InputStream inputStream) throws MessagingException {
        try {
            return createMimeBodyPart(inputStream);
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i2 > 0) {
            int read = inputStream.read(bArr, i, i2);
            if (read <= 0) {
                break;
            }
            i += read;
            i3 += read;
            i2 -= read;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    private void skipFully(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip > 0) {
                j -= skip;
            } else {
                throw new EOFException("can't skip");
            }
        }
    }

    public synchronized void addBodyPart(BodyPart bodyPart) throws MessagingException {
        parse();
        super.addBodyPart(bodyPart);
    }

    /* access modifiers changed from: protected */
    public InternetHeaders createInternetHeaders(InputStream inputStream) throws MessagingException {
        return new InternetHeaders(inputStream);
    }

    /* access modifiers changed from: protected */
    public MimeBodyPart createMimeBodyPart(InternetHeaders internetHeaders, byte[] bArr) throws MessagingException {
        return new MimeBodyPart(internetHeaders, bArr);
    }

    public synchronized BodyPart getBodyPart(int i) throws MessagingException {
        parse();
        return super.getBodyPart(i);
    }

    public synchronized int getCount() throws MessagingException {
        parse();
        return super.getCount();
    }

    public synchronized String getPreamble() throws MessagingException {
        parse();
        return this.preamble;
    }

    /* access modifiers changed from: protected */
    public void initializeProperties() {
        this.ignoreMissingEndBoundary = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingendboundary", true);
        this.ignoreMissingBoundaryParameter = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingboundaryparameter", true);
        this.ignoreExistingBoundaryParameter = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoreexistingboundaryparameter", false);
        this.allowEmpty = PropUtil.getBooleanSystemProperty("mail.mime.multipart.allowempty", false);
    }

    public synchronized boolean isComplete() throws MessagingException {
        parse();
        return this.complete;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:230:0x035a */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017a A[Catch:{ Exception -> 0x035b, IOException -> 0x034e, all -> 0x034c }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x016a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void parse() throws javax.mail.MessagingException {
        /*
            r28 = this;
            r1 = r28
            monitor-enter(r28)
            boolean r0 = r1.parsed     // Catch:{ all -> 0x0364 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r28)
            return
        L_0x0009:
            r28.initializeProperties()     // Catch:{ all -> 0x0364 }
            javax.activation.DataSource r0 = r1.f61344ds     // Catch:{ Exception -> 0x035b }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x035b }
            boolean r2 = r0 instanceof java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x035b }
            if (r2 != 0) goto L_0x0024
            boolean r2 = r0 instanceof java.io.BufferedInputStream     // Catch:{ Exception -> 0x035b }
            if (r2 != 0) goto L_0x0024
            boolean r2 = r0 instanceof javax.mail.internet.SharedInputStream     // Catch:{ Exception -> 0x035b }
            if (r2 != 0) goto L_0x0024
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x035b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x035b }
            goto L_0x0025
        L_0x0024:
            r2 = r0
        L_0x0025:
            boolean r0 = r2 instanceof javax.mail.internet.SharedInputStream     // Catch:{ all -> 0x0364 }
            if (r0 == 0) goto L_0x002e
            r0 = r2
            javax.mail.internet.SharedInputStream r0 = (javax.mail.internet.SharedInputStream) r0     // Catch:{ all -> 0x0364 }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            javax.mail.internet.ContentType r4 = new javax.mail.internet.ContentType     // Catch:{ all -> 0x0364 }
            java.lang.String r5 = r1.contentType     // Catch:{ all -> 0x0364 }
            r4.<init>(r5)     // Catch:{ all -> 0x0364 }
            boolean r5 = r1.ignoreExistingBoundaryParameter     // Catch:{ all -> 0x0364 }
            if (r5 != 0) goto L_0x0054
            java.lang.String r5 = "boundary"
            java.lang.String r4 = r4.getParameter(r5)     // Catch:{ all -> 0x0364 }
            if (r4 == 0) goto L_0x0054
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0364 }
            r5.<init>()     // Catch:{ all -> 0x0364 }
            java.lang.String r6 = "--"
            r5.append(r6)     // Catch:{ all -> 0x0364 }
            r5.append(r4)     // Catch:{ all -> 0x0364 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0364 }
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 != 0) goto L_0x0068
            boolean r5 = r1.ignoreMissingBoundaryParameter     // Catch:{ all -> 0x0364 }
            if (r5 != 0) goto L_0x0068
            boolean r5 = r1.ignoreExistingBoundaryParameter     // Catch:{ all -> 0x0364 }
            if (r5 == 0) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch:{ all -> 0x0364 }
            java.lang.String r2 = "Missing boundary parameter"
            r0.<init>(r2)     // Catch:{ all -> 0x0364 }
            throw r0     // Catch:{ all -> 0x0364 }
        L_0x0068:
            com.sun.mail.util.LineInputStream r5 = new com.sun.mail.util.LineInputStream     // Catch:{ IOException -> 0x034e }
            r5.<init>(r2)     // Catch:{ IOException -> 0x034e }
            r6 = 0
        L_0x006e:
            java.lang.String r7 = r5.readLine()     // Catch:{ IOException -> 0x034e }
            r8 = 9
            r9 = 32
            r10 = 2
            r11 = 0
            r12 = 1
            if (r7 == 0) goto L_0x00f4
            int r13 = r7.length()     // Catch:{ IOException -> 0x034e }
            int r13 = r13 - r12
        L_0x0080:
            if (r13 < 0) goto L_0x008e
            char r14 = r7.charAt(r13)     // Catch:{ IOException -> 0x034e }
            if (r14 == r9) goto L_0x008b
            if (r14 == r8) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            int r13 = r13 + -1
            goto L_0x0080
        L_0x008e:
            int r13 = r13 + 1
            java.lang.String r7 = r7.substring(r11, r13)     // Catch:{ IOException -> 0x034e }
            if (r4 == 0) goto L_0x00b8
            boolean r13 = r7.equals(r4)     // Catch:{ IOException -> 0x034e }
            if (r13 == 0) goto L_0x009d
            goto L_0x00f4
        L_0x009d:
            int r13 = r7.length()     // Catch:{ IOException -> 0x034e }
            int r14 = r4.length()     // Catch:{ IOException -> 0x034e }
            int r14 = r14 + r10
            if (r13 != r14) goto L_0x00d6
            boolean r13 = r7.startsWith(r4)     // Catch:{ IOException -> 0x034e }
            if (r13 == 0) goto L_0x00d6
            java.lang.String r13 = "--"
            boolean r13 = r7.endsWith(r13)     // Catch:{ IOException -> 0x034e }
            if (r13 == 0) goto L_0x00d6
            r7 = 0
            goto L_0x00f4
        L_0x00b8:
            int r13 = r7.length()     // Catch:{ IOException -> 0x034e }
            if (r13 <= r10) goto L_0x00d6
            java.lang.String r13 = "--"
            boolean r13 = r7.startsWith(r13)     // Catch:{ IOException -> 0x034e }
            if (r13 == 0) goto L_0x00d6
            int r13 = r7.length()     // Catch:{ IOException -> 0x034e }
            r14 = 4
            if (r13 <= r14) goto L_0x00d4
            boolean r13 = allDashes(r7)     // Catch:{ IOException -> 0x034e }
            if (r13 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r4 = r7
            goto L_0x00f4
        L_0x00d6:
            int r8 = r7.length()     // Catch:{ IOException -> 0x034e }
            if (r8 <= 0) goto L_0x006e
            if (r6 != 0) goto L_0x00e8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x034e }
            int r8 = r7.length()     // Catch:{ IOException -> 0x034e }
            int r8 = r8 + r10
            r6.<init>(r8)     // Catch:{ IOException -> 0x034e }
        L_0x00e8:
            r6.append(r7)     // Catch:{ IOException -> 0x034e }
            java.lang.String r7 = java.lang.System.lineSeparator()     // Catch:{ IOException -> 0x034e }
            r6.append(r7)     // Catch:{ IOException -> 0x034e }
            goto L_0x006e
        L_0x00f4:
            if (r6 == 0) goto L_0x00fc
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x034e }
            r1.preamble = r6     // Catch:{ IOException -> 0x034e }
        L_0x00fc:
            if (r7 != 0) goto L_0x010f
            boolean r0 = r1.allowEmpty     // Catch:{ IOException -> 0x034e }
            if (r0 == 0) goto L_0x0107
            r2.close()     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            monitor-exit(r28)
            return
        L_0x0107:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch:{ IOException -> 0x034e }
            java.lang.String r3 = "Missing start boundary"
            r0.<init>(r3)     // Catch:{ IOException -> 0x034e }
            throw r0     // Catch:{ IOException -> 0x034e }
        L_0x010f:
            byte[] r4 = com.sun.mail.util.ASCIIUtility.getBytes((java.lang.String) r4)     // Catch:{ IOException -> 0x034e }
            int r6 = r4.length     // Catch:{ IOException -> 0x034e }
            r7 = 256(0x100, float:3.59E-43)
            int[] r7 = new int[r7]     // Catch:{ IOException -> 0x034e }
            r13 = 0
        L_0x0119:
            if (r13 >= r6) goto L_0x0124
            byte r14 = r4[r13]     // Catch:{ IOException -> 0x034e }
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r13 = r13 + 1
            r7[r14] = r13     // Catch:{ IOException -> 0x034e }
            goto L_0x0119
        L_0x0124:
            int[] r13 = new int[r6]     // Catch:{ IOException -> 0x034e }
            r14 = r6
        L_0x0127:
            if (r14 <= 0) goto L_0x014a
            int r15 = r6 + -1
        L_0x012b:
            if (r15 < r14) goto L_0x013e
            byte r3 = r4[r15]     // Catch:{ IOException -> 0x034e }
            int r16 = r15 - r14
            byte r8 = r4[r16]     // Catch:{ IOException -> 0x034e }
            if (r3 != r8) goto L_0x0145
            int r3 = r15 + -1
            r13[r3] = r14     // Catch:{ IOException -> 0x034e }
            int r15 = r15 + -1
            r8 = 9
            goto L_0x012b
        L_0x013e:
            if (r15 <= 0) goto L_0x0145
            int r15 = r15 + -1
            r13[r15] = r14     // Catch:{ IOException -> 0x034e }
            goto L_0x013e
        L_0x0145:
            int r14 = r14 + -1
            r8 = 9
            goto L_0x0127
        L_0x014a:
            int r3 = r6 + -1
            r13[r3] = r12     // Catch:{ IOException -> 0x034e }
            r14 = 0
            r17 = r14
            r8 = 0
        L_0x0153:
            if (r8 != 0) goto L_0x0344
            if (r0 == 0) goto L_0x017d
            long r14 = r0.getPosition()     // Catch:{ IOException -> 0x034e }
        L_0x015b:
            java.lang.String r16 = r5.readLine()     // Catch:{ IOException -> 0x034e }
            if (r16 == 0) goto L_0x0168
            int r19 = r16.length()     // Catch:{ IOException -> 0x034e }
            if (r19 <= 0) goto L_0x0168
            goto L_0x015b
        L_0x0168:
            if (r16 != 0) goto L_0x017a
            boolean r0 = r1.ignoreMissingEndBoundary     // Catch:{ IOException -> 0x034e }
            if (r0 == 0) goto L_0x0172
            r1.complete = r11     // Catch:{ IOException -> 0x034e }
            goto L_0x0344
        L_0x0172:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch:{ IOException -> 0x034e }
            java.lang.String r3 = "missing multipart end boundary"
            r0.<init>(r3)     // Catch:{ IOException -> 0x034e }
            throw r0     // Catch:{ IOException -> 0x034e }
        L_0x017a:
            r20 = 0
            goto L_0x0183
        L_0x017d:
            javax.mail.internet.InternetHeaders r16 = r1.createInternetHeaders(r2)     // Catch:{ IOException -> 0x034e }
            r20 = r16
        L_0x0183:
            boolean r16 = r2.markSupported()     // Catch:{ IOException -> 0x034e }
            if (r16 == 0) goto L_0x033c
            if (r0 != 0) goto L_0x0193
            java.io.ByteArrayOutputStream r16 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x034e }
            r16.<init>()     // Catch:{ IOException -> 0x034e }
            r21 = r16
            goto L_0x0199
        L_0x0193:
            long r17 = r0.getPosition()     // Catch:{ IOException -> 0x034e }
            r21 = 0
        L_0x0199:
            byte[] r9 = new byte[r6]     // Catch:{ IOException -> 0x034e }
            byte[] r12 = new byte[r6]     // Catch:{ IOException -> 0x034e }
            r10 = 0
            r22 = 1
        L_0x01a0:
            int r11 = r6 + 4
            int r11 = r11 + 1000
            r2.mark(r11)     // Catch:{ IOException -> 0x034e }
            r23 = r3
            r11 = 0
            int r3 = readFully(r2, r9, r11, r6)     // Catch:{ IOException -> 0x034e }
            if (r3 >= r6) goto L_0x01d1
            boolean r8 = r1.ignoreMissingEndBoundary     // Catch:{ IOException -> 0x034e }
            if (r8 == 0) goto L_0x01c9
            if (r0 == 0) goto L_0x01ba
            long r17 = r0.getPosition()     // Catch:{ IOException -> 0x034e }
        L_0x01ba:
            r8 = 0
            r1.complete = r8     // Catch:{ IOException -> 0x034e }
            r26 = r4
            r24 = r5
            r22 = r9
            r4 = r17
            r8 = 1
            r11 = 0
            goto L_0x0267
        L_0x01c9:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch:{ IOException -> 0x034e }
            java.lang.String r3 = "missing multipart end boundary"
            r0.<init>(r3)     // Catch:{ IOException -> 0x034e }
            throw r0     // Catch:{ IOException -> 0x034e }
        L_0x01d1:
            r11 = r23
        L_0x01d3:
            if (r11 < 0) goto L_0x01e7
            r24 = r5
            byte r5 = r9[r11]     // Catch:{ IOException -> 0x034e }
            r25 = r8
            byte r8 = r4[r11]     // Catch:{ IOException -> 0x034e }
            if (r5 == r8) goto L_0x01e0
            goto L_0x01eb
        L_0x01e0:
            int r11 = r11 + -1
            r5 = r24
            r8 = r25
            goto L_0x01d3
        L_0x01e7:
            r24 = r5
            r25 = r8
        L_0x01eb:
            if (r11 >= 0) goto L_0x02cc
            r5 = 13
            r8 = 10
            if (r22 != 0) goto L_0x020a
            int r11 = r10 + -1
            byte r11 = r12[r11]     // Catch:{ IOException -> 0x034e }
            if (r11 == r5) goto L_0x01fb
            if (r11 != r8) goto L_0x020a
        L_0x01fb:
            if (r11 != r8) goto L_0x0208
            r11 = 2
            if (r10 < r11) goto L_0x0208
            int r11 = r10 + -2
            byte r11 = r12[r11]     // Catch:{ IOException -> 0x034e }
            if (r11 != r5) goto L_0x0208
            r11 = 2
            goto L_0x020b
        L_0x0208:
            r11 = 1
            goto L_0x020b
        L_0x020a:
            r11 = 0
        L_0x020b:
            if (r22 != 0) goto L_0x0219
            if (r11 <= 0) goto L_0x0210
            goto L_0x0219
        L_0x0210:
            r26 = r4
            r11 = r9
            r4 = r20
            r9 = r21
            goto L_0x02ae
        L_0x0219:
            if (r0 == 0) goto L_0x0228
            long r17 = r0.getPosition()     // Catch:{ IOException -> 0x034e }
            r22 = r9
            long r8 = (long) r6     // Catch:{ IOException -> 0x034e }
            long r17 = r17 - r8
            long r8 = (long) r11     // Catch:{ IOException -> 0x034e }
            long r17 = r17 - r8
            goto L_0x022a
        L_0x0228:
            r22 = r9
        L_0x022a:
            int r8 = r2.read()     // Catch:{ IOException -> 0x034e }
            r9 = 45
            if (r8 != r9) goto L_0x0241
            int r5 = r2.read()     // Catch:{ IOException -> 0x034e }
            if (r5 != r9) goto L_0x0241
            r5 = 1
            r1.complete = r5     // Catch:{ IOException -> 0x034e }
            r26 = r4
            r4 = r17
            r8 = 1
            goto L_0x0267
        L_0x0241:
            r5 = 32
            if (r8 == r5) goto L_0x02b2
            r9 = 9
            if (r8 != r9) goto L_0x024b
            goto L_0x02b2
        L_0x024b:
            r5 = 10
            if (r8 != r5) goto L_0x0250
            goto L_0x0261
        L_0x0250:
            r9 = 13
            if (r8 != r9) goto L_0x02a6
            r8 = 1
            r2.mark(r8)     // Catch:{ IOException -> 0x034e }
            int r8 = r2.read()     // Catch:{ IOException -> 0x034e }
            if (r8 == r5) goto L_0x0261
            r2.reset()     // Catch:{ IOException -> 0x034e }
        L_0x0261:
            r26 = r4
            r4 = r17
            r8 = r25
        L_0x0267:
            if (r0 == 0) goto L_0x0272
            java.io.InputStream r3 = r0.newStream(r14, r4)     // Catch:{ IOException -> 0x034e }
            javax.mail.internet.MimeBodyPart r3 = r1.createMimeBodyPartIs(r3)     // Catch:{ IOException -> 0x034e }
            goto L_0x0294
        L_0x0272:
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x027c
            r9 = r21
            r11 = 0
            r9.write(r12, r11, r10)     // Catch:{ IOException -> 0x034e }
            goto L_0x027e
        L_0x027c:
            r9 = r21
        L_0x027e:
            boolean r10 = r1.complete     // Catch:{ IOException -> 0x034e }
            if (r10 != 0) goto L_0x028a
            if (r3 <= 0) goto L_0x028a
            r11 = r22
            r10 = 0
            r9.write(r11, r10, r3)     // Catch:{ IOException -> 0x034e }
        L_0x028a:
            byte[] r3 = r9.toByteArray()     // Catch:{ IOException -> 0x034e }
            r9 = r20
            javax.mail.internet.MimeBodyPart r3 = r1.createMimeBodyPart(r9, r3)     // Catch:{ IOException -> 0x034e }
        L_0x0294:
            super.addBodyPart(r3)     // Catch:{ IOException -> 0x034e }
            r17 = r4
            r3 = r23
            r5 = r24
            r4 = r26
            r9 = 32
            r10 = 2
            r11 = 0
            r12 = 1
            goto L_0x0153
        L_0x02a6:
            r26 = r4
            r4 = r20
            r9 = r21
            r11 = r22
        L_0x02ae:
            r5 = r9
            r8 = r11
            r11 = 0
            goto L_0x02d3
        L_0x02b2:
            r26 = r4
            r4 = r20
            r5 = r21
            r8 = r22
            r9 = 13
            int r21 = r2.read()     // Catch:{ IOException -> 0x034e }
            r20 = r4
            r22 = r8
            r8 = r21
            r4 = r26
            r21 = r5
            goto L_0x0241
        L_0x02cc:
            r26 = r4
            r8 = r9
            r4 = r20
            r5 = r21
        L_0x02d3:
            int r3 = r11 + 1
            byte r9 = r8[r11]     // Catch:{ IOException -> 0x034e }
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r9 = r7[r9]     // Catch:{ IOException -> 0x034e }
            int r3 = r3 - r9
            r9 = r13[r11]     // Catch:{ IOException -> 0x034e }
            int r3 = java.lang.Math.max(r3, r9)     // Catch:{ IOException -> 0x034e }
            r9 = 2
            if (r3 >= r9) goto L_0x0312
            if (r0 != 0) goto L_0x02f0
            r3 = 1
            if (r10 <= r3) goto L_0x02f0
            int r3 = r10 + -1
            r11 = 0
            r5.write(r12, r11, r3)     // Catch:{ IOException -> 0x034e }
        L_0x02f0:
            r2.reset()     // Catch:{ IOException -> 0x034e }
            r11 = r10
            r9 = 1
            r1.skipFully(r2, r9)     // Catch:{ IOException -> 0x034e }
            r3 = 1
            if (r11 < r3) goto L_0x030a
            int r10 = r11 + -1
            byte r9 = r12[r10]     // Catch:{ IOException -> 0x034e }
            r10 = 0
            r12[r10] = r9     // Catch:{ IOException -> 0x034e }
            byte r9 = r8[r10]     // Catch:{ IOException -> 0x034e }
            r12[r3] = r9     // Catch:{ IOException -> 0x034e }
            r9 = 0
            r10 = 2
            goto L_0x032a
        L_0x030a:
            r3 = 0
            byte r9 = r8[r3]     // Catch:{ IOException -> 0x034e }
            r12[r3] = r9     // Catch:{ IOException -> 0x034e }
            r9 = 0
            r10 = 1
            goto L_0x032a
        L_0x0312:
            r11 = r10
            if (r11 <= 0) goto L_0x031c
            if (r0 != 0) goto L_0x031c
            r9 = 0
            r5.write(r12, r9, r11)     // Catch:{ IOException -> 0x034e }
            goto L_0x031d
        L_0x031c:
            r9 = 0
        L_0x031d:
            r2.reset()     // Catch:{ IOException -> 0x034e }
            long r10 = (long) r3     // Catch:{ IOException -> 0x034e }
            r1.skipFully(r2, r10)     // Catch:{ IOException -> 0x034e }
            r10 = r3
            r27 = r12
            r12 = r8
            r8 = r27
        L_0x032a:
            r20 = r4
            r21 = r5
            r9 = r8
            r3 = r23
            r5 = r24
            r8 = r25
            r4 = r26
            r11 = 0
            r22 = 0
            goto L_0x01a0
        L_0x033c:
            javax.mail.MessagingException r0 = new javax.mail.MessagingException     // Catch:{ IOException -> 0x034e }
            java.lang.String r3 = "Stream doesn't support mark"
            r0.<init>(r3)     // Catch:{ IOException -> 0x034e }
            throw r0     // Catch:{ IOException -> 0x034e }
        L_0x0344:
            r2.close()     // Catch:{ IOException -> 0x0347 }
        L_0x0347:
            r0 = 1
            r1.parsed = r0     // Catch:{ all -> 0x0364 }
            monitor-exit(r28)
            return
        L_0x034c:
            r0 = move-exception
            goto L_0x0357
        L_0x034e:
            r0 = move-exception
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch:{ all -> 0x034c }
            java.lang.String r4 = "IO Error"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x034c }
            throw r3     // Catch:{ all -> 0x034c }
        L_0x0357:
            r2.close()     // Catch:{ IOException -> 0x035a }
        L_0x035a:
            throw r0     // Catch:{ all -> 0x0364 }
        L_0x035b:
            r0 = move-exception
            javax.mail.MessagingException r2 = new javax.mail.MessagingException     // Catch:{ all -> 0x0364 }
            java.lang.String r3 = "No inputstream from datasource"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0364 }
            throw r2     // Catch:{ all -> 0x0364 }
        L_0x0364:
            r0 = move-exception
            monitor-exit(r28)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeMultipart.parse():void");
    }

    public boolean removeBodyPart(BodyPart bodyPart) throws MessagingException {
        parse();
        return super.removeBodyPart(bodyPart);
    }

    public synchronized void setPreamble(String str) throws MessagingException {
        this.preamble = str;
    }

    public synchronized void setSubType(String str) throws MessagingException {
        ContentType contentType = new ContentType(this.contentType);
        contentType.setSubType(str);
        this.contentType = contentType.toString();
    }

    /* access modifiers changed from: protected */
    public synchronized void updateHeaders() throws MessagingException {
        parse();
        for (int i = 0; i < this.parts.size(); i++) {
            ((MimeBodyPart) this.parts.elementAt(i)).updateHeaders();
        }
    }

    public synchronized void writeTo(OutputStream outputStream) throws IOException, MessagingException {
        parse();
        String str = HelpFormatter.DEFAULT_LONG_OPT_PREFIX + new ContentType(this.contentType).getParameter("boundary");
        LineOutputStream lineOutputStream = new LineOutputStream(outputStream);
        String str2 = this.preamble;
        if (str2 != null) {
            byte[] bytes = ASCIIUtility.getBytes(str2);
            lineOutputStream.write(bytes);
            if (!(bytes.length <= 0 || bytes[bytes.length - 1] == 13 || bytes[bytes.length - 1] == 10)) {
                lineOutputStream.writeln();
            }
        }
        if (this.parts.size() != 0) {
            for (int i = 0; i < this.parts.size(); i++) {
                lineOutputStream.writeln(str);
                ((MimeBodyPart) this.parts.elementAt(i)).writeTo(outputStream);
                lineOutputStream.writeln();
            }
        } else if (this.allowEmpty) {
            lineOutputStream.writeln(str);
            lineOutputStream.writeln();
        } else {
            throw new MessagingException("Empty multipart: " + this.contentType);
        }
        lineOutputStream.writeln(str + HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    }

    public MimeMultipart(String str) {
        this.f61344ds = null;
        this.parsed = true;
        this.complete = true;
        this.preamble = null;
        this.ignoreMissingEndBoundary = true;
        this.ignoreMissingBoundaryParameter = true;
        this.ignoreExistingBoundaryParameter = false;
        this.allowEmpty = false;
        String uniqueBoundaryValue = UniqueValue.getUniqueBoundaryValue();
        ContentType contentType = new ContentType("multipart", str, (ParameterList) null);
        contentType.setParameter("boundary", uniqueBoundaryValue);
        this.contentType = contentType.toString();
        initializeProperties();
    }

    /* access modifiers changed from: protected */
    public MimeBodyPart createMimeBodyPart(InputStream inputStream) throws MessagingException {
        return new MimeBodyPart(inputStream);
    }

    public synchronized BodyPart getBodyPart(String str) throws MessagingException {
        parse();
        int count = getCount();
        for (int i = 0; i < count; i++) {
            MimeBodyPart mimeBodyPart = (MimeBodyPart) getBodyPart(i);
            String contentID = mimeBodyPart.getContentID();
            if (contentID != null && contentID.equals(str)) {
                return mimeBodyPart;
            }
        }
        return null;
    }

    public void removeBodyPart(int i) throws MessagingException {
        parse();
        super.removeBodyPart(i);
    }

    public synchronized void addBodyPart(BodyPart bodyPart, int i) throws MessagingException {
        parse();
        super.addBodyPart(bodyPart, i);
    }

    public MimeMultipart(BodyPart... bodyPartArr) throws MessagingException {
        this();
        for (BodyPart addBodyPart : bodyPartArr) {
            super.addBodyPart(addBodyPart);
        }
    }

    public MimeMultipart(String str, BodyPart... bodyPartArr) throws MessagingException {
        this(str);
        for (BodyPart addBodyPart : bodyPartArr) {
            super.addBodyPart(addBodyPart);
        }
    }

    public MimeMultipart(DataSource dataSource) throws MessagingException {
        this.f61344ds = null;
        this.parsed = true;
        this.complete = true;
        this.preamble = null;
        this.ignoreMissingEndBoundary = true;
        this.ignoreMissingBoundaryParameter = true;
        this.ignoreExistingBoundaryParameter = false;
        this.allowEmpty = false;
        if (dataSource instanceof MessageAware) {
            setParent(((MessageAware) dataSource).getMessageContext().getPart());
        }
        if (dataSource instanceof MultipartDataSource) {
            setMultipartDataSource((MultipartDataSource) dataSource);
            return;
        }
        this.parsed = false;
        this.f61344ds = dataSource;
        this.contentType = dataSource.getContentType();
    }
}
