public class DecorationPlacer {
    private TableclothPatternInterface tableclothPattern;
    private WallHangingInterface wallHanging;
    private YardOrnamentInterface yardOrnament;

    private HolidayFactory factory;

    public DecorationPlacer(HolidayFactory factory) {
        this.factory = factory;
        tableclothPattern = factory.makeTableclothPattern();
        wallHanging = factory.makeWallHanging();
        yardOrnament = factory.makeYardOrnament();
    }

    public String placeDecorations() {
        return "Everything was ready for the party. The " + yardOrnament.getOrnament()
                + " was in front of the house, the " + wallHanging.getHanging()
                + " was hanging on the wall, and the tablecloth with " + tableclothPattern.getTablecloth()
                + " was spread over the table.";
    }
}
