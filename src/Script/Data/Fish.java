package Script.Data;

public enum Fish {
    SHRIMPS(1, "Raw shrimps", "Fishing spot"),
    SARDINES(5, "Raw sardines", "Fishing spot"),
    HERRING(10, "Raw herring", "Fishing spot"),
    ANCHOVIES(15,),
    TROUT(20,),
    PIKE(25,),
    SALMON(30,),
    TUNA(),
    LOBSTER(),
    SWORDFISH()
    ;


    private int Level;
    private String fishName;
    private String spotName;

    Fish(int level, String fishName, String spotName) {
        Level = level;
        this.fishName = fishName;
        this.spotName = spotName;
    }

    public int getLevel() {
        return Level;
    }

    public String getFishName() {
        return fishName;
    }

    public String getSpotName() {
        return spotName;
    }
}
