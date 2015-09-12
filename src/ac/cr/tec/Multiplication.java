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

    //Obtains the first entry
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

    //Obtains the second entry
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

    //Divides the Strings in an array
    public String[] splitt(String[] a, int i){
        int j = 0;
        String [] val = a[i].split(" ");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }
        return val;
    }

    //Converts String to int
    public int i(String a){
        int b=Integer.parseInt(a);
        return b;
    }

    //Multiplies the values
    public String multi(String[] a, String[] b){
        int val1 = i(a[0])*i(b[0]);
        int val2 = i(a[1])+i(b[1]);
        int val3 = i(a[2])+i(b[2]);
        return Integer.toString(val1)+" "+Integer.toString(val2)+" "+Integer.toString(val3);
    }

    //Obtains the result of the multiplication
    public String resultMult(String[] val1,String[] val2){
        String res= "";
        String[] entry1 = splitt(val1, 0);
        //System.out.println("Este es el primer elemento:" +entry1[0]);
        String[] entry2 = splitt(val1, 1);
        String[] entry3 = splitt(val2, 0);
        String[] entry4 = splitt(val2, 1);
        String[] entry5 = splitt(val2, 2);

            System.out.println("YES");
            String[] first = {"","",""};
            first[0] = multi(entry1,entry3);
            first[1] = multi(entry1,entry4);
            first[2] = multi(entry1,entry5);
            String[] second = {"","","","0 0 0"};
            second[0] = multi(entry2,entry3);
            second[1] = multi(entry2,entry4);
            second[2] = multi(entry2,entry5);
            Addition end = new Addition();
            res = end.resultAdd(first,second);

        System.out.println("Yeah");
        return res;
    }
}
