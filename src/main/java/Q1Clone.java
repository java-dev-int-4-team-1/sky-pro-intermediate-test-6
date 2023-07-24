public class Q1Clone {
    static class MemberField implements Cloneable {
        private String s;
        private int ofPower3;
        public MemberField() {}
        public void setS(String s){
            this.s = s;
        }
        public void setOfPower3(int i) {
            ofPower3 = i * i * i;
        }
        @Override
        public String toString() {
            return "MemberField{s=" + s + ", ofPower3=" + ofPower3 + "}";
        }
        @Override
        protected MemberField clone() throws CloneNotSupportedException {
            return (MemberField) super.clone();
        }
    }
    static class ImplCloneableExample implements Cloneable {
        private String s;
        private MemberField mf = new MemberField();
        public ImplCloneableExample() {}
        public void setS(String s) {  this.s = s;
        }
        public void setMfS(String s) {
            mf.setS(s);
        }
        public void setMfOfPower3(int i) {
            mf.setOfPower3(i);
        }
        @Override
        public String toString() {
            return "Example{s=" + s + ", " + mf + "}";
        }
        @Override
        public ImplCloneableExample clone() throws CloneNotSupportedException {
            ImplCloneableExample cloned = (ImplCloneableExample) super.clone();
            cloned.mf = mf.clone();
            return cloned;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Course-6 Test");

        ImplCloneableExample example = new ImplCloneableExample();
        example.setS("example-s");
        example.setMfS("member-field-s");
        example.setMfOfPower3(2);

        ImplCloneableExample cloned = example.clone();

        example.setMfOfPower3(3);

        System.out.println("example = " + example);
        System.out.println("cloned = " + cloned);
    }
}


