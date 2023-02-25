import java.math.BigInteger;

public class DataTypes {

    public void getByte(Long a) {
        if(a>(Byte.MIN_VALUE) && a<(Byte.MAX_VALUE))
            System.out.println("* byte");
    }

    public void getShort(Long a) {
        if(a>(Short.MIN_VALUE) && a<(Short.MAX_VALUE))
            System.out.println("* short");
    }

    public void getInt(Long a) {
        if(a>(Integer.MIN_VALUE) && a<(Integer.MAX_VALUE))
            System.out.println("* int");
    }

    public void getLong(Long a) {
        if(a>(Long.MIN_VALUE) && a<(Long.MAX_VALUE))
            System.out.println("* long");
    }
}
