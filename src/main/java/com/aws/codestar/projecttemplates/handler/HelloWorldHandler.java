package main.java.com.aws.codestar.projecttemplates.handler;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.services.costexplorer.model.Context;

import main.java.com.aws.codestar.projecttemplates.GatewayResponse;
import net.sf.json.JSONObject;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return new GatewayResponse(new JSONObject().put("Output", "Hello World!").toString(), headers, 200);
    }
}
