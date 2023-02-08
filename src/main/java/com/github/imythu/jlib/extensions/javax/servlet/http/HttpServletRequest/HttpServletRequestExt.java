package com.github.imythu.jlib.extensions.javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

/**
 * @author imythu
 */
@Extension
public class HttpServletRequestExt {
    private static final String[] IP_HEADER_CANDIDATES = {
            "X-Forwarded-For",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP",
            "HTTP_X_FORWARDED_FOR",
            "HTTP_X_FORWARDED",
            "HTTP_X_CLUSTER_CLIENT_IP",
            "HTTP_CLIENT_IP",
            "HTTP_FORWARDED_FOR",
            "HTTP_FORWARDED",
            "HTTP_VIA",
            "REMOTE_ADDR"
    };

    /**
     * Get the real IP
     * @param request {@link HttpServletRequest}
     * @return IP
     */
    public static String getClientIp(@This HttpServletRequest request) {
        for (String header : IP_HEADER_CANDIDATES) {
            String ipList = request.getHeader(header);
            if (ipList != null && ipList.length() != 0 && !"unknown".equalsIgnoreCase(ipList)) {
                return ipList.split(" *, *")[0];
            }
        }
        return request.getRemoteAddr();
    }
}
