public class NewClass {
    private int a = 25;

    public int getA() { //getter на вход ничего не принимает, возвращает значение переменной a
        return a;
    }

    public void setA(int a) { //setter принимает на вход значение переменной a
        this.a = a;    // берем переменную а которая находится внутри нашего класса NewClass (строка 2)
                       // и присваеваем ей значение переменной а из сигнатуры метода setA
    }
}
