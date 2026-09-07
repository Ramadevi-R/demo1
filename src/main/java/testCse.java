//import jdk.javadoc.internal.doclets.toolkit.taglets.SeeTaglet;

import java.util.*;

public class testCse
{
    public static void main(String args[]) {

        /* ############ String Duplication (Hash Map) #############
        String strArr[]={"C#","V","Java", "Go", "Python", "Ruby", "Java"};
        HashMap<String, Integer> hashMap=new HashMap<>();
        for(int i=0;i<strArr.length;i++) {
            if(hashMap.putIfAbsent(strArr[i], i)!=null)
            {
                System.out.println("Duupicates found: "+strArr[i]);
                break;
            }
        }*/
        /* ######## String duplicate (Hash Set) ############
        String strArr[]={"C#","V","Go","Java", "Go", "Python", "Ruby", "Java"};
        Set<String> setStr = new HashSet<String>();
        setStr.addAll(Arrays.asList(strArr));
        for (String str : strArr) {
            if (!setStr.add(str)) {
                System.out.println("Duplicates Found" + str);
                break;
            }
        }
    */
        /* #######  String duplicates (Array of STrings) ##############
        String strArr[]={"C#","V","Go","Java", "Go", "Python", "Ruby", "Java"};

        int i, j=1;
        boolean flag=true;
        for(String str:strArr) {
            i=j++;
            for(;i< strArr.length && flag;i++)
            {
                if(str.equalsIgnoreCase(strArr[i])) {
                    System.out.println("FOund DUplicATES" + str);
                    flag=false;
                    return;
                }
            }
            System.out.println(str);
            }

      */
    }
        /*  ############### Missing number in a sequence ##########
        int missArr[] = {1, 3, 4, 5};
        int orgArr[]={1, 2, 3, 4, 5};
        System.out.println("Missing number is: "+ (add(orgArr)-add(missArr)));

        static int add(int a[])
        {
            int sum=0;
            for(int i=0;i<a.length;i++)
                sum=sum+a[i];
            return sum;
        }
        */
        /*   ######### Integer reverse ###############
        int num=98765;
        int revNum=0;
        int temp=num;

        while(temp>=1)
        {

            revNum=revNum*10 + (temp%10);
            temp=temp/10;
        }
        System.out.println("num is "+ num + "\nReverse num is: "+revNum);

        */

        /*   ######### Integer reverse ###############
        int num=98765;
        int revNum=0;
        int temp=num;

        Integer iNum=(Integer)num;
        StringBuffer sf=new StringBuffer(iNum.toString());
        System.out.println(Integer.parseInt(sf.reverse().toString()));
         */
        // }
}