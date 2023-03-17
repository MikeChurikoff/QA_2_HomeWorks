package HW_14;

public class Ex_HW14 {
    public static void main(String[] args) {

     /*   int a = 7;
        int b = 9;
        System.out.println(a+" "+b);
        a = a + b - (b = a);
        System.out.println(a+" "+b);*/

        /*double chislitel = 7.0;
        double znamenatel = 5.0;
        double drob1 = chislitel/znamenatel;
        double drob2 = chislitel%znamenatel;
        double drob3 = znamenatel;
        System.out.println("Целая часть равна"+" "+(int) drob1);
        System.out.println("Остаток от деления равен"+" "+(int) drob2);
        System.out.println("Знаменатель равен"+" "+(int) drob3);*/


        /*String string = "This line that i want to cut, cause it is too long";
        String string2 = string.replace("it is too long","");
        String string3 = string2.concat("it is perfect");
        System.out.println(string+" "+string.length());
        System.out.println(string2+" "+string2.length());
        System.out.println(string3+" "+string3.length());*/
        //можно было и substring, но лень считать индексы, так кажется быстрее)


       /* String string = "Testing, is my favorite job";
        String [] words = string.split(" ");
        String word1 = words[0].replace(",","");
        String word2 = words[1];
        String word3 = words[2];
        String word4 = words[3];
        String word5 = words[4];
        boolean result = word1.length()>word2.length()&&
                         word1.length()>word3.length()&&
                         word1.length()>word4.length()&&
                         word1.length()>word5.length();
        System.out.println(word1+","+" "+word1.length());
        System.out.println(word2+","+" "+word2.length());
        System.out.println(word3+","+" "+word3.length());
        System.out.println(word4+","+" "+word4.length());
        System.out.println(word5+","+" "+word5.length());
        System.out.println(result);*/



        String string = "Completely random text in English."+
                        "In it, we just need to determine how many times"+
                        "the character 'a' occurs there. And we can use the"+
                        "split method and the length method.";
        String [] words = string.toLowerCase().split("a");
        System.out.println(words.length-1);




        }





    }

