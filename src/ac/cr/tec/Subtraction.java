package ac.cr.tec;

/**
 * Created by fabian on 06/09/15.
 */

public class Subtraction {
    private String[] op1;
    private String[] op2;

    public Subtraction (){

    }

    public void Operator1(String[] op1) {
        this.op1=op1;
        //System.out.println(op1[0]);

    }
    public void Operator2(String[] op2) {
        this.op2=op2;
        //System.out.println(op2[0]);

    }
    public void result(){
        System.out.println(op1[0]);
        System.out.println(op2[0]);

    }
}
