
public class Q3ClassContent {

     interface InnerInterface {

     }
     static class InnerClass implements InnerInterface {
        int x;
        public void setX(int x) { this.x = x;}
        public int getX() { return x; }

        public InnerClass() {}
        public InnerClass(int x) { this.x = x; }
    }

    enum SomeEnum {
        A,
        ONE,
        ANOTHER,
        SPECIFIC
    }


    static Object STATIC_MEMBER;

    InnerClass instanceObject = new InnerClass();


    public static void main(String[] args) {
        System.out.println("This method can be one of THE APPLICATION ENTRY POINT");
    }

    static void anotherStaticMethod() {

    }

    public InnerClass aMethod() {
        return new InnerClass();
    }



}
