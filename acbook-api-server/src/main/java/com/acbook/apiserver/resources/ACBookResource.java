package com.acbook.apiserver.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.acbook.enums.ExpenseType;
import com.acbook.model.Expense;

@Path("/resource")
public class ACBookResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello ACBook !!";
    }

    @GET
    @Path("/expense")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getExpense(@QueryParam("from") String from, @QueryParam("to") String to) {
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense(0, ExpenseType.FOOD, "朝定食", 400, new Date(), 1));
        expenseList.add(new Expense(1, ExpenseType.FOOD, "コンビニ", 450, new Date(), 2));
        expenseList.add(new Expense(2, ExpenseType.FOOD, "デミ玉ハンバーグ定食", 580, new Date(), 3));
        expenseList.add(new Expense(3, ExpenseType.TRAFFIC, "通勤", 500, new Date(), 4));
        return Response.ok(expenseList).build();
    }

}
