package at.kaindorf.verwaltung.database;



public class Access {

    private static Access theInstance;

    private Access() {

    }

    public static Access getTheInstance(){
        if (theInstance == null){
            theInstance = new Access();
        }
        return theInstance;
    }

    public List<VillagerPerson> getAllVillagers(){

    }


}
