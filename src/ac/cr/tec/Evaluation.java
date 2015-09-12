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
        if (a != null){
            if (i(val[1]) == 0) {
                val[1] = "1";
            }
            else if (i(val[1]) == 1){
                val[1] = a;
            }
            else {
                String value=a;
                for (int i=2;i<=i(val[1]);i++){
                    val[1] = Integer.toString(i(a)*i(value));
                }
                //System.out.println("Valor:"+val[1]);
            }
            //System.out.println("Llegué al 1");
        }

        if (b != null){
            //System.out.println("B:"+b);
            if (i(val[2]) == 0) {
                val[2] = "1";
            }
            else if (i(val[2]) == 1){
                val[2] = b;
            }
            else {
                String value1=b;
                for (int i = 2;i<=i(val[2]);i++){
                    val[2] = Integer.toString(i(a)*i(value1));
                }
                //System.out.println("Valora:"+val[2]);
            }
            //System.out.println("Llegué al dos");
        }

        return val;
    }

    public String resultEval(String[] val1, String[] val2){
        String res= "";
        String[] entry1 = splitt(val1, 0);
        String[] entry2 = splitt(val1, 1);
        String[] entry3 = splitt(val1, 2);
        String entry4 = val2[0];
        String entry5 = val2[1];

        //After replace
        entry1 = replace(entry1,entry4,entry5);
        entry2 = replace(entry2,entry4,entry5);
        entry3 = replace(entry3,entry4,entry5);

        //Suma
        int f1 = i(entry1[0])*i(entry1[1])*i(entry1[2]);
        int f2 = i(entry2[0])*i(entry2[1])*i(entry2[2]);
        int f3 = i(entry3[0])*i(entry3[1])*i(entry3[2]);
        System.out.println("a:"+f1+" b:"+f2+" c:"+f3);
        int f = f1 + f2 + f3;

        res = Integer.toString(f);
        return res;
    }
}
