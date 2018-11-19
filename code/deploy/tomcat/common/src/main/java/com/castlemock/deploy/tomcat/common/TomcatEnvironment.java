package com.castlemock.deploy.tomcat.common;

import com.castlemock.core.basis.Environment;
import org.apache.catalina.util.ServerInfo;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Component
public class TomcatEnvironment implements Environment {

    private static final Logger LOGGER = Logger.getLogger(TomcatEnvironment.class);


    @Override
    public boolean copy(final InputStream inputStream,
                        final OutputStream outputStream) {
        try {
            IOUtils.copy(inputStream, outputStream);
            return true;
        } catch (IOException e) {
            LOGGER.error("Unable to copy data", e);
            return false;
        }
    }

    @Override
    public String getServerInfo() {
        return ServerInfo.getServerInfo();
    }

    @Override
    public String getServerBuilt() {
        return ServerInfo.getServerBuilt();
    }

    @Override
    public String getServerNumber() {
        return ServerInfo.getServerNumber();
    }
}