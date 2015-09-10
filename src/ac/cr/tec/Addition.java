package ac.cr.tec;

/**
 * Created by fabian on 06/09/15.
 */
public class Addition {
    private String[] op1;
    private String[] op2;

    public Addition (){
    }

    public String[] Operator1(String op1) {
        //System.out.println(op1[0]);
        int j = 0;
        String [] val = op1.split("\\|");
        while(j<val.length){
            System.out.println(val[j]);
            j++;
        }
        return val;
    }
    public String[] Operator2(String op2) {
        //System.out.println(op2[0]);
        int j = 0;
        String [] val = op2.split("\\|");
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

    public String result(String[] val1,String[] val2){
        int i = 0;
        String res= "";
        String[] entry1 = splitt(val1, 0);
        String[] entry2 = splitt(val1, 1);
        String[] entry3 = splitt(val1, 2);
        String[] entry4 = splitt(val2, 0);
        String[] entry5 = splitt(val2, 1);
        String[] entry6 = splitt(val2, 2);

        if (entry1[1] == entry4[1] && entry1[2] == entry4[2]) {
                res = res + "|" + (entry1[0] + entry4[0]) + " " + entry1[1] + " " + entry1[2];

            }
        if (entry1[1] == entry5[1] && entry1[2] == entry5[2]) {
            res = res + "|" + (entry1[0] + entry5[0]) + " " + entry1[1] + " " + entry1[2];
        }
        if (entry1[1] == entry6[1] && entry1[2] == entry6[2]) {
            res = res + "|" + (entry1[0] + entry6[0]) + " " + entry1[1] + " " + entry1[2];
        }
        if (entry2[1] == entry4[1] && entry2[2] == entry4[2]) {
            res = res + "|" + (entry2[0] + entry4[0]) + " " + entry2[1] + " " + entry2[2];
        }
        if (entry2[1] == entry5[1] && entry2[2] == entry5[2]) {
            res = res + "|" + (entry2[0] + entry5[0]) + " " + entry2[1] + " " + entry2[2];
        }
        if (entry2[1] == entry6[1] && entry2[2] == entry6[2]) {
            res = res + "|" + (entry2[0] + entry6[0]) + " " + entry2[1] + " " + entry2[2];
        }
        if (entry3[1] == entry4[1] && entry3[2] == entry4[2]) {
            res = res + "|" + (entry3[0] + entry4[0]) + " " + entry3[1] + " " + entry3[2];
        }
        if (entry3[1] == entry5[1] && entry3[2] == entry5[2]) {
            res = res + "|" + (entry3[0] + entry5[0]) + " " + entry3[1] + " " + entry3[2];
        }
        if (entry3[1] == entry6[1] && entry3[2] == entry6[2]) {
            res = res + "|" + (entry3[0] + entry6[0]) + " " + entry3[1] + " " + entry3[2];
        }
        if (entry1[1] != entry4[1] || entry1[2] != entry4[2]) {
            res = res + "|" + entry1 +"|" +entry4;
        }
        if (entry1[1] != entry5[1] || entry1[2] != entry5[2]) {
            res = res + "|" + entry1 +"|" +entry5;
        }
        if (entry1[1] != entry6[1] || entry1[2] != entry6[2]) {
            res = res + "|" + entry1 +"|" +entry6;
        }
        if (entry2[1] != entry4[1] || entry2[2] != entry4[2]) {
            res = res + "|" + entry2 +"|" +entry4;
        }
        if (entry2[1] != entry5[1] || entry2[2] != entry5[2]) {
            res = res + "|" + entry2 +"|" +entry5;
        }
        if (entry2[1] != entry6[1] || entry2[2] != entry6[2]) {
            res = res + "|" + entry2 +"|" +entry6;
        }
        if (entry3[1] != entry4[1] || entry3[2] != entry4[2]) {
            res = res + "|" + entry3 +"|" +entry4;
        }
        if (entry3[1] != entry5[1] || entry3[2] != entry5[2]) {
            res = res + "|" + entry3 +"|" +entry5;
        }
        if (entry3[1] != entry6[1] || entry3[2] != entry6[2]) {
            res = res + "|" + entry3 +"|" +entry6;
        }
        System.out.println(res);
        return res;

        }
    }

