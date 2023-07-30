package org.example.intranet2;

/**
 * @author ldd
 * 网络接口，功能是接入互联网
 */
public interface Internet {
    /**
     * 接入互联网
     * @param url
     */
    void httpAccess(String url);

}