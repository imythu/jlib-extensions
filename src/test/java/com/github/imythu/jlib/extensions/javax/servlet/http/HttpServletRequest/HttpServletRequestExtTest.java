package com.github.imythu.jlib.extensions.javax.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author imythu
 */
public class HttpServletRequestExtTest {

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

    @Test
    public void testToObtainTheRealIPAddressOfTheClient() {
        String ip = "39.156.66.10";
        String localIp = "172.16.98.11";
        // mock HttpServletRequest
        HttpServletRequest request = mock(HttpServletRequest.class);

        when(request.getRemoteAddr()).thenReturn(localIp);

        Assert.assertEquals(request.getClientIp(), localIp);

        // mock the returned value of request.getParameterMap()
        Arrays.stream(IP_HEADER_CANDIDATES)
                .forEach(s -> {
                    when(request.getHeader(s)).thenReturn(ip);
                });

        Assert.assertEquals(request.getClientIp(), ip);
    }
}
