public class HalloweenFactory implements HolidayFactory{
    @Override
    public TableclothPatternInterface makeTableclothPattern() {
        return new HalloweenTableclothPatternProvider();
    }

    @Override
    public WallHangingInterface makeWallHanging() {
        return new HalloweenWallHangingProvider();
    }

    @Override
    public YardOrnamentInterface makeYardOrnament() {
        return new HalloweenYardOrnamentProvider();
    }
}
