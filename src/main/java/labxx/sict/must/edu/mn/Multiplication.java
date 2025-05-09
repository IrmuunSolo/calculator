package labxx.sict.must.edu.mn;

/**
 * Хоёр тооны үржвэрийг олдог класс
 */
public class Multiplication {
    /**
     * Хоёр тоог үржүүлэх функц
     *
     * @param a эхний үржүүлэгч (дурын бодит тоо)
     * @param b хоёр дахь үржүүлэгч (дурын бодит тоо)
     * @return a ба b-ийн үржвэр (a × b)
     * @throws ArithmeticException хэрэв үржүүлэлт тоон хэлбэрээр илэрхийлэгдэхгүй бол
     */
    public double multiply(double a, double b) {
        return a * b;
    }
}