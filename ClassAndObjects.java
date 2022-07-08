class Complex {

    int real,img;

    void print()
    {
        System.out.println(real+"+i"+img);
    }
    Complex(int r,int i)
    {
        real = r;
        img = i;
    }

    void add(Complex C)
    {
        real = real + C.real;
        img = img + C.img;
    }

}


public class Test {

    public static void main(String[] args)
    {

        Complex C1 = new Complex(10,20);
        Complex C2 = new Complex(20,30);

        C1.add(C2);
        C1.print();

    }

}