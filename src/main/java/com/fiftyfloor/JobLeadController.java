import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/joblead")
/*
used to mark a class as a controller component that handles HTTP requests
the parameter specifies that the controller will handle requests that start with "/joblead" in the URL path
 */
public class JobLeadController {

    @Post("/hubspot")
    public HttpResponse<String> hubspotDataHandler(@Body JobLeadInfo info) {
        // call service to get Oasis data based on "info"
        return HttpResponse.ok("Request received");
    }
}