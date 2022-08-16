public class ChristmasFactory implements HolidayFactory{
    @Override
    public TableclothPatternInterface makeTableclothPattern() {
        return new ChristmasTableclothPatternProvider();
    }

    @Override
    public WallHangingInterface makeWallHanging() {
        return new ChristmasWallHangingProvider();
    }

    @Override
    public YardOrnamentInterface makeYardOrnament() {
        return new ChristmasYardOrnamentProvider();
    }
}
