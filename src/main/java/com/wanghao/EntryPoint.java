package com.wanghao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by wanghao on 3/20/19.
 */
@Path("/api")
public class EntryPoint {

    @GET
    @Path("/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echoHttpCodeGet(@PathParam("code") String code) {
        return echoHttpCodeCommon(code);
    }

    @POST
    @Path("/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echoHttpCodePost(@PathParam("code") String code) {
        return echoHttpCodeCommon(code);
    }

    @PUT
    @Path("/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echoHttpCodePut(@PathParam("code") String code) {
        return echoHttpCodeCommon(code);
    }

    @DELETE
    @Path("/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echoHttpCodeDelete(@PathParam("code") String code) {
        return echoHttpCodeCommon(code);
    }

    @HEAD
    @Path("/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echoHttpCodeHead(@PathParam("code") String code) {
        return echoHttpCodeCommon(code);
    }

    @OPTIONS
    @Path("/{code}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echoHttpCodeOptions(@PathParam("code") String code) {
        return echoHttpCodeCommon(code);
    }

    private Response echoHttpCodeCommon(String code){
        try {
            int codeInt = Integer.parseInt(code);
            HttpStatus httpStatus = HttpStatus.fromCode(codeInt);
            if (httpStatus != null){
                return Response.status(httpStatus.getCode()).entity(httpStatus.getReason()).build();
            }
            return Response.status(codeInt).entity(code + " Unknown Http Status Code").build();
        } catch (NumberFormatException e){
            return Response.status(HttpStatus.BAD_REQUEST.getCode())
                    .entity(HttpStatus.BAD_REQUEST.getReason())
                    .build();
        }
    }

    @POST
    @Path("/json")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> echoJson(String json){
        JSONObject jsonObject = null;
        try {
            jsonObject = JSON.parseObject(json);
        } catch (JSONException e){
            e.printStackTrace();
        }

        return jsonObject;
    }
}
