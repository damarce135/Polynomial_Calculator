package ac.cr.tec;

import java.util.Arrays;

/**
 * Created by fabian on 06/09/15.
 */
public class Addition {
    //private String[] op1;
    //private String[] op2;

    public Addition() {
    }

    //Obtains the first entry
    public String[] Operator1(String op1) {
        //System.out.println(op1[0]);
        int j = 0;
        String[] val = op1.split(" \\| ");
        while (j < val.length) {
            System.out.println(val[j]);
            j++;
        }
        return val;
    }

    //Obtains the second entry
    public String[] Operator2(String op2) {
        //System.out.println(op2[0]);
        int j = 0;
        String[] val = op2.split(" \\| ");
        while (j < val.length) {
            System.out.println(val[j]);
            j++;
        }
        return val;
    }

    //Divides the Strings in an array
    public String[] splitt(String[] a, int i) {
        int j = 0;
        String[] val = a[i].split(" ");
        while (j < val.length) {
            System.out.println(val[j]);
            j++;
        }
        return val;
    }

    //Obtains the result of the adding
    public String resultAdd(String[] val1, String[] val2) {
        String res = "";
        String[] entry1 = splitt(val1, 0);
        String[] entry2 = splitt(val1, 1);
        String[] entry3 = splitt(val1, 2);
        String[] entry4 = splitt(val2, 0);
        String[] entry5 = splitt(val2, 1);
        String[] entry6 = splitt(val2, 2);

        if (val1.length == 3 && val2.length == 4) {
            String[] entry7 = splitt(val2, 3);
            if (null != entry1) {
                if ((entry1[1].equals(entry4[1])) && (entry1[2].equals(entry4[2]))) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry4[0]);
                    //System.out.println("Suma:"+value);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else if (entry1[1].equals(entry5[1]) && entry1[2].equals(entry5[2])) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry5[0]);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else if (entry1[1].equals(entry6[1]) && entry1[2].equals(entry6[2])) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry6[0]);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else if (entry1[1].equals(entry7[1]) && entry1[2].equals(entry7[2])) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry7[0]);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else {
                    res = entry1[0] + " " + entry1[1] + " " + entry1[2] + " ";
                }
            }

            if (entry2 != null) {
                if (entry2[1].equals(entry4[1]) && entry2[2].equals(entry4[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry4[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else if (entry2[1].equals(entry5[1]) && entry2[2].equals(entry5[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry5[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else if (entry2[1].equals(entry6[1]) && entry2[2].equals(entry6[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry6[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else if (entry2[1].equals(entry7[1]) && entry2[2].equals(entry7[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry7[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else {
                    res = res + "|" + " " + entry2[0] + " " + entry2[1] + " " + entry2[2] + " ";
                }
            }

            if (entry3 != null) {
                if (entry3[1].equals(entry4[1]) && entry3[2].equals(entry4[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry4[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else if (entry3[1].equals(entry5[1]) && entry3[2].equals(entry5[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry5[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else if (entry3[1].equals(entry6[1]) && entry3[2].equals(entry6[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry6[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else if (entry3[1].equals(entry7[1]) && entry3[2].equals(entry7[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry7[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else {
                    res = res + "|" + " " + entry3[0] + " " + entry3[1] + " " + entry3[2] + " ";
                }
            }

            if (((!entry4[1].equals(entry1[1])) || (!entry4[2].equals(entry1[2]))) && ((!entry4[1].equals(entry2[1])) || (!entry4[2].equals(entry2[2]))) && ((!entry4[1].equals(entry3[1])) || (!entry4[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry4[0] + " " + entry4[1] + " " + entry4[2] + " ";
            }

            if (((!entry5[1].equals(entry1[1])) || (!entry5[2].equals(entry1[2]))) && ((!entry5[1].equals(entry2[1])) || (!entry5[2].equals(entry2[2]))) && ((!entry5[1].equals(entry3[1])) || (!entry5[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry5[0] + " " + entry5[1] + " " + entry5[2] + " ";
            }

            if (((!entry6[1].equals(entry1[1])) || (!entry6[2].equals(entry1[2]))) && ((!entry6[1].equals(entry2[1])) || (!entry6[2].equals(entry2[2]))) && ((!entry6[1].equals(entry3[1])) || (!entry6[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry6[0] + " " + entry6[1] + " " + entry6[2] + " ";
            }

            if (((!entry7[1].equals(entry1[1])) || (!entry7[2].equals(entry1[2]))) && ((!entry7[1].equals(entry2[1])) || (!entry7[2].equals(entry2[2]))) && ((!entry7[1].equals(entry3[1])) || (!entry7[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry7[0] + " " + entry7[1] + " " + entry7[2] + " ";
            }

        }
        if (val1.length == 3 && val2.length == 3) {
            if (null != entry1) {
                if ((entry1[1].equals(entry4[1])) && (entry1[2].equals(entry4[2]))) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry4[0]);
                    //System.out.println("Suma:"+value);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else if (entry1[1].equals(entry5[1]) && entry1[2].equals(entry5[2])) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry5[0]);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else if (entry1[1].equals(entry6[1]) && entry1[2].equals(entry6[2])) {
                    int value = Integer.parseInt(entry1[0]) + Integer.parseInt(entry6[0]);
                    if (value == 0) {
                    } else {
                        res = Integer.toString(value) + " " + entry1[1] + " " + entry1[2] + " ";
                    }
                } else {
                    res = entry1[0] + " " + entry1[1] + " " + entry1[2] + " ";
                }
            }

            if (entry2 != null) {
                if (entry2[1].equals(entry4[1]) && entry2[2].equals(entry4[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry4[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else if (entry2[1].equals(entry5[1]) && entry2[2].equals(entry5[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry5[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else if (entry2[1].equals(entry6[1]) && entry2[2].equals(entry6[2])) {
                    int value = Integer.parseInt(entry2[0]) + Integer.parseInt(entry6[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry2[1] + " " + entry2[2] + " ";
                    }
                } else {
                    res = res + "|" + " " + entry2[0] + " " + entry2[1] + " " + entry2[2] + " ";
                }
            }

            if (entry3 != null) {
                if (entry3[1].equals(entry4[1]) && entry3[2].equals(entry4[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry4[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else if (entry3[1].equals(entry5[1]) && entry3[2].equals(entry5[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry5[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else if (entry3[1].equals(entry6[1]) && entry3[2].equals(entry6[2])) {
                    int value = Integer.parseInt(entry3[0]) + Integer.parseInt(entry6[0]);
                    if (value == 0) {
                    } else {
                        res = res + "|" + " " + Integer.toString(value) + " " + entry3[1] + " " + entry3[2] + " ";
                    }
                } else {
                    res = res + "|" + " " + entry3[0] + " " + entry3[1] + " " + entry3[2] + " ";
                }
            }

            if (((!entry4[1].equals(entry1[1])) || (!entry4[2].equals(entry1[2]))) && ((!entry4[1].equals(entry2[1])) || (!entry4[2].equals(entry2[2]))) && ((!entry4[1].equals(entry3[1])) || (!entry4[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry4[0] + " " + entry4[1] + " " + entry4[2] + " ";
            }

            if (((!entry5[1].equals(entry1[1])) || (!entry5[2].equals(entry1[2]))) && ((!entry5[1].equals(entry2[1])) || (!entry5[2].equals(entry2[2]))) && ((!entry5[1].equals(entry3[1])) || (!entry5[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry5[0] + " " + entry5[1] + " " + entry5[2] + " ";
            }

            if (((!entry6[1].equals(entry1[1])) || (!entry6[2].equals(entry1[2]))) && ((!entry6[1].equals(entry2[1])) || (!entry6[2].equals(entry2[2]))) && ((!entry6[1].equals(entry3[1])) || (!entry6[2].equals(entry3[2])))) {
                res = res + "|" + " " + entry6[0] + " " + entry6[1] + " " + entry6[2] + " ";
            }

            }
        else{
            System.out.println("Error al ingresar valores");
        }
        System.out.println(res);
        return res;
    }

}


