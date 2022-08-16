public class Main {

    public static void main(String[] args) {

        HolidayFactory halloweenFactory = new HalloweenFactory();
        HolidayFactory christmasFactory = new ChristmasFactory();
        DecorationPlacer decorationPlacer = new DecorationPlacer(halloweenFactory);
        DecorationPlacer dPlacer = new DecorationPlacer(christmasFactory);

        System.out.println(decorationPlacer.placeDecorations());
        System.out.println(dPlacer.placeDecorations());

    }
}
