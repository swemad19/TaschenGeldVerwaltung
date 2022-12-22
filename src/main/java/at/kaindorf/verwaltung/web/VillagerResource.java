package at.kaindorf.verwaltung.web;

import at.kaindorf.verwaltung.bl.DatabaseRequestHandler;
import at.kaindorf.verwaltung.pojos.VillagerPerson;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class VillagerResource {

    DatabaseRequestHandler handler = DatabaseRequestHandler.getInstance();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getAllVillagers")
    public Response getAllVillagers(@QueryParam("name") String name) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getVillager")
    public Response getVillager(@QueryParam("personId") Long personId) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getVillagerBookingHistory")
    public Response getVillagerBookingHistory(@QueryParam("personId") Long personId) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getAllBookingHistory")
    public Response getAllBookingHistory() {
        return null;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/postFastBooking")
    public Response postFastBooking() {
        return null;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/postUpdateVillager")
    public Response postUpdateVillager(VillagerPerson vp) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getSaldenliste")
    public Response getSaldenliste() {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getBuchungsjournal")
    public Response getBuchungsjournal(@QueryParam("personId") Long personId) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getDepotauskuenfte")
    public Response getDepotauskuenfte() {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getDepotauskuenfteNegativ")
    public Response getDepotauskuenfteNegativ() {
        return null;
    }
}