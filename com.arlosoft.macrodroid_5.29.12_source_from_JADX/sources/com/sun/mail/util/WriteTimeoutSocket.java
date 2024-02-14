package com.sun.mail.util;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class WriteTimeoutSocket extends Socket {
    private final ScheduledExecutorService ses;
    private final Socket socket;
    private final int timeout;

    public WriteTimeoutSocket(Socket socket2, int i) throws IOException {
        this.socket = socket2;
        this.ses = Executors.newScheduledThreadPool(1);
        this.timeout = i;
    }

    public void bind(SocketAddress socketAddress) throws IOException {
        this.socket.bind(socketAddress);
    }

    public void close() throws IOException {
        try {
            this.socket.close();
        } finally {
            this.ses.shutdownNow();
        }
    }

    public void connect(SocketAddress socketAddress) throws IOException {
        this.socket.connect(socketAddress, 0);
    }

    public SocketChannel getChannel() {
        return this.socket.getChannel();
    }

    public FileDescriptor getFileDescriptor$() {
        Class cls = this.socket.getClass();
        while (cls != Object.class) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getFileDescriptor$", new Class[0]);
                if (FileDescriptor.class.isAssignableFrom(declaredMethod.getReturnType())) {
                    return (FileDescriptor) declaredMethod.invoke(this.socket, new Object[0]);
                }
                cls = cls.getSuperclass();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public InetAddress getInetAddress() {
        return this.socket.getInetAddress();
    }

    public InputStream getInputStream() throws IOException {
        return this.socket.getInputStream();
    }

    public boolean getKeepAlive() throws SocketException {
        return this.socket.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.socket.getLocalAddress();
    }

    public int getLocalPort() {
        return this.socket.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.socket.getLocalSocketAddress();
    }

    public boolean getOOBInline() throws SocketException {
        return this.socket.getOOBInline();
    }

    public <T> T getOption(SocketOption<T> socketOption) throws IOException {
        throw new UnsupportedOperationException("WriteTimeoutSocket.getOption");
    }

    public synchronized OutputStream getOutputStream() throws IOException {
        return new TimeoutOutputStream(this.socket.getOutputStream(), this.ses, this.timeout);
    }

    public int getPort() {
        return this.socket.getPort();
    }

    public int getReceiveBufferSize() throws SocketException {
        return this.socket.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.socket.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() throws SocketException {
        return this.socket.getReuseAddress();
    }

    public int getSendBufferSize() throws SocketException {
        return this.socket.getSendBufferSize();
    }

    public int getSoLinger() throws SocketException {
        return this.socket.getSoLinger();
    }

    public int getSoTimeout() throws SocketException {
        return this.socket.getSoTimeout();
    }

    public boolean getTcpNoDelay() throws SocketException {
        return this.socket.getTcpNoDelay();
    }

    public int getTrafficClass() throws SocketException {
        return this.socket.getTrafficClass();
    }

    public boolean isBound() {
        return this.socket.isBound();
    }

    public boolean isClosed() {
        return this.socket.isClosed();
    }

    public boolean isConnected() {
        return this.socket.isConnected();
    }

    public boolean isInputShutdown() {
        return this.socket.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.socket.isOutputShutdown();
    }

    public void sendUrgentData(int i) throws IOException {
        this.socket.sendUrgentData(i);
    }

    public void setKeepAlive(boolean z) throws SocketException {
        this.socket.setKeepAlive(z);
    }

    public void setOOBInline(boolean z) throws SocketException {
        this.socket.setOOBInline(z);
    }

    public <T> Socket setOption(SocketOption<T> socketOption, T t) throws IOException {
        throw new UnsupportedOperationException("WriteTimeoutSocket.setOption");
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
        this.socket.setPerformancePreferences(i, i2, i3);
    }

    public void setReceiveBufferSize(int i) throws SocketException {
        this.socket.setReceiveBufferSize(i);
    }

    public void setReuseAddress(boolean z) throws SocketException {
        this.socket.setReuseAddress(z);
    }

    public void setSendBufferSize(int i) throws SocketException {
        this.socket.setSendBufferSize(i);
    }

    public void setSoLinger(boolean z, int i) throws SocketException {
        this.socket.setSoLinger(z, i);
    }

    public void setSoTimeout(int i) throws SocketException {
        this.socket.setSoTimeout(i);
    }

    public void setTcpNoDelay(boolean z) throws SocketException {
        this.socket.setTcpNoDelay(z);
    }

    public void setTrafficClass(int i) throws SocketException {
        this.socket.setTrafficClass(i);
    }

    public void shutdownInput() throws IOException {
        this.socket.shutdownInput();
    }

    public void shutdownOutput() throws IOException {
        this.socket.shutdownOutput();
    }

    public Set<SocketOption<?>> supportedOptions() {
        return Collections.emptySet();
    }

    public String toString() {
        return this.socket.toString();
    }

    public void connect(SocketAddress socketAddress, int i) throws IOException {
        this.socket.connect(socketAddress, i);
    }

    public WriteTimeoutSocket(int i) throws IOException {
        this(new Socket(), i);
    }

    public WriteTimeoutSocket(InetAddress inetAddress, int i, int i2) throws IOException {
        this(i2);
        this.socket.connect(new InetSocketAddress(inetAddress, i));
    }

    public WriteTimeoutSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, int i3) throws IOException {
        this(i3);
        this.socket.bind(new InetSocketAddress(inetAddress2, i2));
        this.socket.connect(new InetSocketAddress(inetAddress, i));
    }

    public WriteTimeoutSocket(String str, int i, int i2) throws IOException {
        this(i2);
        this.socket.connect(new InetSocketAddress(str, i));
    }

    public WriteTimeoutSocket(String str, int i, InetAddress inetAddress, int i2, int i3) throws IOException {
        this(i3);
        this.socket.bind(new InetSocketAddress(inetAddress, i2));
        this.socket.connect(new InetSocketAddress(str, i));
    }
}
