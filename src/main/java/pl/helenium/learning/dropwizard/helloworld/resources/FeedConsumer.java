package pl.helenium.learning.dropwizard.helloworld.resources;

import org.apache.commons.io.IOUtils;

import javax.activation.MimeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

@Path("/")
@Consumes("text/plain")
public class FeedConsumer {

    @POST
    @Path("/feed-consumer")
    public void consume(String body) throws IOException {
        System.out.println(body);
    }

    @POST
    @Path("/verify")
    public void verify(String body) {
        System.out.println(body);
    }

}
