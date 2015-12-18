package com.acbook.resource;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acbook.enums.ExpenseType;
import com.acbook.model.Expense;

@Path("/resource")
public class Resource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello ACBook !!";
    }

    @GET
    @Path("/expense")
    @Produces(MediaType.APPLICATION_JSON)
    public Expense getExpense() {
        Expense expense = new Expense(Integer.valueOf(0), ExpenseType.FOOD, "デミ玉ハンバーグ定食", 580, new Date());
        return expense;
    }

}
