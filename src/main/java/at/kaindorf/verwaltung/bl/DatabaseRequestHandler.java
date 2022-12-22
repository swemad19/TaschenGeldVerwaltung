package at.kaindorf.verwaltung.bl;

public class DatabaseRequestHandler {
    private static DatabaseRequestHandler instance;

    private DatabaseRequestHandler() {
    }

    public static DatabaseRequestHandler getInstance() {
        if (instance == null) {
            instance = new DatabaseRequestHandler();
        }
        return instance;
    }

    public String exportSaldenliste() {
        return null;
    }

    public String exportDepotauskuenfte() {
        return null;
    }

    public String exportDepotauskuenfteNegativ() {
        return null;
    }

    public String exportDepotAuskunftEinzel() {
        return null;
    }
}
