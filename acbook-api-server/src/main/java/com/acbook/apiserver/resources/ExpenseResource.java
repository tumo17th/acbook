package com.acbook.apiserver.resources;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.acbook.common.context.ACBookContext;
import com.acbook.model.Expense;
import com.acbook.rest.response.ACBookResponse;
import com.acbook.rest.response.GetExpenseResponse;

@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
public class ExpenseResource {

    @GET
    @Path("/expense")
    public Response getExpense(@QueryParam("from") Date from, @QueryParam("to") Date to) {
        List<Expense> expenseList = ACBookContext.getExpenseService().getExpenseList(from, to);
        return Response.ok(new GetExpenseResponse(true, null, expenseList)).build();
    }

    @POST
    @Path("/expense")
    public Response updateExpense() {
        ACBookResponse res = new ACBookResponse(false, Arrays.asList("ID=3のモデル更新に失敗しました"));
        return Response.ok(res).build();
    }

    @PUT
    @Path("/expense")
    public Response createExpense() {
        boolean result = ACBookContext.getExpenseService().createExpenses(null);
        if (!result) {
            ACBookResponse res = new ACBookResponse(false, Arrays.asList("ID=3のレコード作成に失敗しました"));
            return Response.ok(res).build();
        }
        return Response.ok(new ACBookResponse(true, null)).build();
    }

    @DELETE
    @Path("/expense")
    public Response deleteExpense() {
        return Response.ok().build();
    }

}
