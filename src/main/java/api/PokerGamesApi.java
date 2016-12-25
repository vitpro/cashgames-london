package api;

import com.google.inject.Inject;
import database.PokerGameStore;
import model.PokerGameDetail;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class PokerGamesApi {

    @Inject
    private PokerGameStore pokerGameStore;

    @GET
    @Path("poker-games")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PokerGameDetail> pokerGameDetails() {
        return pokerGameStore.getPokerGameDetails();
    }
}
