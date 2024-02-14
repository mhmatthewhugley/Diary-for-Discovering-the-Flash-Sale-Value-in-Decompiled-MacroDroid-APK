package com.android.multidex;

import com.android.p023dx.p024cf.direct.DirectClassFile;
import com.android.p023dx.p024cf.direct.StdAttributeFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

class Path {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream(40960);
    private final String definition;
    List<ClassPathElement> elements = new ArrayList();
    private final byte[] readBuffer = new byte[20480];

    Path(String str) throws IOException {
        this.definition = str;
        String[] split = str.split(Pattern.quote(File.pathSeparator));
        int length = split.length;
        int i = 0;
        while (i < length) {
            try {
                addElement(getClassPathElement(new File(split[i])));
                i++;
            } catch (IOException e) {
                throw new IOException("Wrong classpath: " + e.getMessage(), e);
            }
        }
    }

    private void addElement(ClassPathElement classPathElement) {
        this.elements.add(classPathElement);
    }

    static ClassPathElement getClassPathElement(File file) throws ZipException, IOException {
        if (file.isDirectory()) {
            return new FolderPathElement(file);
        }
        if (file.isFile()) {
            return new ArchivePathElement(new ZipFile(file));
        }
        if (file.exists()) {
            throw new IOException("\"" + file.getPath() + "\" is not a directory neither a zip file");
        }
        throw new FileNotFoundException("File \"" + file.getPath() + "\" not found");
    }

    /* JADX INFO: finally extract failed */
    private static byte[] readStream(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) throws IOException {
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized DirectClassFile getClass(String str) throws FileNotFoundException {
        DirectClassFile directClassFile;
        Throwable th;
        directClassFile = null;
        Iterator<ClassPathElement> it = this.elements.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                InputStream open = it.next().open(str);
                try {
                    byte[] readStream = readStream(open, this.baos, this.readBuffer);
                    this.baos.reset();
                    DirectClassFile directClassFile2 = new DirectClassFile(readStream, str, false);
                    try {
                        directClassFile2.setAttributeFactory(StdAttributeFactory.THE_ONE);
                    } catch (Throwable th2) {
                        th = th2;
                        open.close();
                        throw th;
                    }
                    try {
                        open.close();
                        directClassFile = directClassFile2;
                        break;
                    } catch (IOException unused) {
                        directClassFile = directClassFile2;
                    }
                } catch (Throwable th3) {
                    DirectClassFile directClassFile3 = directClassFile;
                    th = th3;
                    open.close();
                    throw th;
                }
            } catch (IOException unused2) {
            }
        }
        if (directClassFile == null) {
            throw new FileNotFoundException("File \"" + str + "\" not found");
        }
        return directClassFile;
    }

    /* access modifiers changed from: package-private */
    public Iterable<ClassPathElement> getElements() {
        return this.elements;
    }

    public String toString() {
        return this.definition;
    }
}
