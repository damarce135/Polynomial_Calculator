package ac.cr.tec;

/**
 * Created by fabian on 06/09/15.
 */
public class Multiplication {

    private String[] op1;
    private String[] op2;
    //String[] num2 = tokens[1].split(Pattern.quote("|"));


    public Multiplication() {

    }

    public void Operator1(String op1) {
        //System.out.println(op1[0]);
        int j = 0;
        String [] val = op1.split("\\|");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }

    }
    public void Operator2(String op2) {
        int j = 0;
        String [] val = op2.split("\\|");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }

    }
    public void result(){
        System.out.println("Yeah");
    }
}
