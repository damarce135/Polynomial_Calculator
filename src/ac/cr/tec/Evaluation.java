package ac.cr.tec;

/**
 * Created by fabian on 06/09/15.
 */

public class Evaluation {

    public Evaluation (){

    }

    public String[] Operator1(String op1) {
        //System.out.println(op1[0]);
        int j = 0;
        String [] val = op1.split(" \\| ");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }
        return val;
    }
    public String[] Operator2(String op2) {
        //System.out.println(op2[0]);
        int j = 0;
        String [] val = op2.split(" \\| ");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }
        return val;
    }

    public String[] splitt(String[] a, int i){
        int j = 0;
        String [] val = a[i].split(" ");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }
        return val;
    }

    public int i(String a){
        int b=Integer.parseInt(a);
        return b;
    }

    public String[] replace(String[] val, String a, String b){
        if (i(a) == 0){
            val[1] = "1";
        }
        if (i(b) == 0){
            val[2] = "1";
        }
        for (int i=1;i<i(a);i++){
            val[1] = Integer.toString(i(val[1])*i(val[1]));
        }
        return val;
    }

    public void resultEval(String[] val1, String[] val2){
        String res= "";
        String[] entry1 = splitt(val1, 0);
        String[] entry2 = splitt(val1, 1);
        String[] entry3 = splitt(val2, 2);
        String entry4 = val2[0];
        String entry5 = val2[1];

    }
}
