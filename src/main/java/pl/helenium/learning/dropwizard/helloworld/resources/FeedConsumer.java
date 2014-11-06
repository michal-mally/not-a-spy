package pl.helenium.learning.dropwizard.helloworld.resources;

import org.apache.commons.io.IOUtils;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;

import static java.nio.file.StandardOpenOption.APPEND;

@Path("/")
@Consumes("text/plain")
public class FeedConsumer {

    @POST
    @Path("/feed-consumer")
    public void consume(String body) throws IOException {
        OutputStream outputStream = Files.newOutputStream(FileSystems.getDefault().getPath(".", "feed-consumer"), APPEND);
        IOUtils.write(body, outputStream);
    }

    @POST
    @Path("/verify")
    public void verify(String body) throws IOException {
        OutputStream outputStream = Files.newOutputStream(FileSystems.getDefault().getPath(".", "verify"), APPEND);
        IOUtils.write(body, outputStream);
    }

}
