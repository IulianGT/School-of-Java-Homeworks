public class EnumDays {

    enum DAYS{
        LUNI,
        MARTI,
        MIERCURI,
        JOI,
        VINERI,
        SAMBATA,
        DUMINICA
    }

    public static String workingDays(DAYS day){
    String s;
        switch (day){
            case LUNI:
                s="Working day";
                break;
            case MARTI:
                s="Working day";
                break;
            case MIERCURI:
                s="Working day";
                break;
            case JOI:
                s="Working day";
                break;
            case VINERI:
                s="Working day";
                break;
            case SAMBATA:
                s="WEEKEND";
                break;
            case DUMINICA:
                s="WEEKEND";
                break;

            default:
                s="something else";
                break;
        }
        return s;
    }

    public static String workingDaysWithArrow(DAYS day) {
        String s;
        switch (day) {
            case LUNI -> s = "Working day";

            case MARTI -> s = "Working day";

            case MIERCURI -> s = "Working day";

            case JOI -> s = "Working day";

            case VINERI -> s = "Working day";

            case SAMBATA -> s = "WEEKEND";

            case DUMINICA -> s = "WEEKEND";

            default -> s = "something else";

        }
        return s;
    }

    public static String workingDaysStacks(DAYS day) {
        String s;
        switch (day) {
            case LUNI:
            case MARTI:
            case MIERCURI:
            case JOI:
            case VINERI:
                s = "Working day";
                break;

            case SAMBATA:
            case DUMINICA:
                s="Weekend";
                break;

            default:
                s = "something else";
                break;
        }
        return s;
    }

    public static String workingDaysStackedAlong(DAYS day) {
        String s;
        switch (day) {
            case LUNI, MARTI, MIERCURI, JOI, VINERI->
                s = "Working day";

            case SAMBATA, DUMINICA->
                s="Weekend";

            default->
                s = "something else";
        }
        return s;
    }

    public static String workingDaysUpgraded(DAYS day){
        return switch (day){
            case LUNI:
                yield "Working day";

            case MARTI:
                yield "Working day";

            case MIERCURI:
                yield "Working day";

            case JOI:
                yield "Working day";

            case VINERI:
                yield "Working day";

            case SAMBATA:
                yield "WEEKEND";

            case DUMINICA:
                yield "WEEKEND";

            default:
                yield "Something else";
        };
    }

    public static String workingDaysStackedAlongSimplified(DAYS day) {
        return switch (day) {
            case LUNI, MARTI, MIERCURI, JOI, VINERI-> "Working day";

            case SAMBATA, DUMINICA-> "Weekend";

            default-> {
                yield "something else";
            }
        };
    }

    public static String multiCaseLabel(Object o){

        return switch (o){
            case Integer i -> "This is an " + i;
            case String s -> "This is a string";

            default -> "Not a known datatype";
        };
    }

    public static void main(String[] args) {
        System.out.println(multiCaseLabel(2.0));
    }
}
