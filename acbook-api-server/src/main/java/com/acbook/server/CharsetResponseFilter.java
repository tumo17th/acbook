package com.acbook.server;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;

public class CharsetResponseFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext req, ContainerResponseContext res) throws IOException {
        MediaType contentType = res.getMediaType();
        if (contentType == null) {
            // 指定しない場合は null になっているのでデフォルトの Content-Type を指定するなりそのまま null にするなりの対応をする
            res.getHeaders().putSingle("Content-Type", "application/xml;charset=UTF-8");
        } else if (!contentType.toString().contains(";charset=")) {
            // 自前で設定したい場合もあるかと思うのでその場合は何もしない
            res.getHeaders().putSingle("Content-Type", contentType.toString() + ";charset=UTF-8");
        }
    }

}
