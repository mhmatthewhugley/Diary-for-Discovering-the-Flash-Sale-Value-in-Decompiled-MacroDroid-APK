package com.android.multidex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class ArchivePathElement implements ClassPathElement {
    /* access modifiers changed from: private */
    public final ZipFile archive;

    static class DirectoryEntryException extends IOException {
        DirectoryEntryException() {
        }
    }

    public ArchivePathElement(ZipFile zipFile) {
        this.archive = zipFile;
    }

    public void close() throws IOException {
        this.archive.close();
    }

    public Iterable<String> list() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    Enumeration<? extends ZipEntry> delegate;
                    ZipEntry next = null;

                    {
                        this.delegate = ArchivePathElement.this.archive.entries();
                    }

                    public boolean hasNext() {
                        while (this.next == null && this.delegate.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) this.delegate.nextElement();
                            this.next = zipEntry;
                            if (zipEntry.isDirectory()) {
                                this.next = null;
                            }
                        }
                        return this.next != null;
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public String next() {
                        if (hasNext()) {
                            String name = this.next.getName();
                            this.next = null;
                            return name;
                        }
                        throw new NoSuchElementException();
                    }
                };
            }
        };
    }

    public InputStream open(String str) throws IOException {
        ZipEntry entry = this.archive.getEntry(str);
        if (entry == null) {
            throw new FileNotFoundException("File \"" + str + "\" not found");
        } else if (!entry.isDirectory()) {
            return this.archive.getInputStream(entry);
        } else {
            throw new DirectoryEntryException();
        }
    }
}
