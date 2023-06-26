package com.example;

import com.microsoft.azure.functions.ExecutionContext;
import io.micronaut.http.annotation.*;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.MediaType;
import io.micronaut.core.annotation.Introspected;

import java.util.logging.Level;

@Controller("/demo")
public class DemoController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get
    public String index() {
        return "Example Response";
    }

    @Post
    public SampleReturnMessage postMethod(@Body SampleInputMessage inputMessage, ExecutionContext context) {
      SampleReturnMessage retMessage = new SampleReturnMessage();
      context.getLogger().info("Hello " + inputMessage.getName() + ", thank you for sending the message");
      retMessage.setReturnMessage("Hello " + inputMessage.getName() + ", thank you for sending the message");
      return retMessage;
    }
}

@Introspected
class SampleInputMessage{
    private String name;

    public SampleInputMessage() {
    }

    public SampleInputMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

@Introspected
class SampleReturnMessage{
    private String returnMessage;
    public String getReturnMessage() {
        return returnMessage;
    }
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
