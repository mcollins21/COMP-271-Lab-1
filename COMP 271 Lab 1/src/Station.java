public class Station {
    public final double LOOP_LAT = 41.88204;
    public final double LOOP_LON = -87.62790;

    public final static String city = "Chicago";
    public static double fare = 2.25;

    private final double lat;
    private double lon;
    private String name = "Loop";
    private final String line;

    public Station() {
        this.lat = LOOP_LAT;
        this.lon = LOOP_LON;
        this.name = "Wells";
        this.line = "BROWN";
    }

    public Station(final String name, final String line, final double lat, final double lon) {
        this.name = name;
        this.line = line;
        this.lat = lat;
        this.lon = lon;
    }

    public static void main(final String[] args) {
        final Station loyola = new Station("Loyola", "RED", 42.0005321,-87.6654555);
        final Station granville = new Station("Granville", "RED", 41.9946956,-87.6648976);
        final Station thorndale = new Station("Thorndale", "RED", 41.9937068,-87.6627518);
        final Station inst4 = granville;

        System.out.print(loyola.city);
        System.out.print("/");
        System.out.print(loyola.name);
        System.out.print(" (" + loyola.line + " line)");
        System.out.print(" located at ");
        System.out.print(loyola.lat);
        System.out.print(",");
        System.out.print(loyola.lon);
        System.out.println();

        System.out.print(granville.city);
        System.out.print("/");
        System.out.print(granville.name);
        System.out.print(" (" + granville.line + " line)");
        System.out.print(" located at ");
        System.out.print(granville.lat);
        System.out.print(",");
        System.out.print(granville.lon);
        System.out.println();

        System.out.print(thorndale.city);
        System.out.print("/");
        System.out.print(thorndale.name);
        System.out.print(" (" + thorndale.line + " line)");
        System.out.print(" located at ");
        System.out.print(thorndale.lat);
        System.out.print(",");
        System.out.print(thorndale.lon);
        System.out.println();

        granville.fare = 2.75;
        granville.name = "Wilson";

        System.out.println();
        System.out.println(loyola.name);
        System.out.println(loyola.fare);
        System.out.println();

        System.out.print(inst4.city);
        System.out.print("/");
        System.out.print(inst4.name);
        System.out.print(" (" + inst4.line + " line)");
        System.out.print(" located at ");
        System.out.print(inst4.lat);
        System.out.print(",");
        System.out.print(inst4.lon);
        System.out.println();

        System.out.println();
        granville.reportStatus("OPEN");
        System.out.println("distance from loop: " + granville.distanceFromLoop() + " degrees");
        granville.relocate(0.012);
        System.out.println("new distance from loop: " + granville.distanceFromLoop() + " degrees");
        granville.changeName();
        System.out.println(granville.name);
        System.out.println();

        final Station inst5 = new Station();
        inst5.name = "Wilson";
        inst5.lon = inst5.lon + 0.012;

        System.out.println(inst5.name);
        System.out.println(city);
        System.out.println(fare);
    }

    public double distanceFromLoop() {
        final var dLat = lat - LOOP_LAT;
        final var dLon = lon - LOOP_LON;
        return Math.sqrt(Math.pow(dLat, 2) + Math.pow(dLon, 2));
    }

    public void reportStatus(final String statusString) {
        System.out.println(name + " station is " + statusString);
    }

    public void relocate(final double lon) {
        this.lon += lon;
    }

    public void changeName() {
        name = "Berwyn";
    }
}

