package com.acbook.apiserver.resources;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.acbook.rest.response.ACBookResponse;

@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
public class IncomeResource {

    @GET
    @Path("/income")
    public Response getIncome(@QueryParam("from") String from, @QueryParam("to") String to) {
        ACBookResponse res = new ACBookResponse(false, Arrays.asList("ID=3のモデル登録に失敗しました"));
        return Response.ok(res).build();
    }

}
