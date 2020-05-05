package interview.nineteen.HaoWeilai.com.xjl;

/**
 * 贷款分析
 *
 */
public class daikuanTest {
    public static void main(String[] args) {
      /*  YieldTask yieldTask = new YieldTask();
        Thread threadA =new Thread(yieldTask,"A");
        Thread threadB =new Thread(yieldTask,"B");
        threadA.start();
        threadB.start();*/
      //1108.27
        String daiKuai = null;
        Float value = 5230.89f;
        Float allYear = 0f;
        Float all = 0f;
        Float allCarYear = 0f;
        Float allGuangYear = 0f;
        Float car = 1108.27f;
        Float carYear = 0f;
        Float guangYear = 0f;
        Float guang = 3808.34f;
        int month = 0;


        int year = 2018;
        for (int i = 10; i < 370; i++) {
            value = value-10;
            allYear = value+allYear;
            carYear = carYear +car;

            all = value+all;
            if(i<12+10){
                guangYear = guangYear +guang;
            }


            if(i<22){
                month =month+1;
                 daiKuai = month+"月;房贷减10元后要还的钱:"+value+";车位贷:"+car+";广发贷款:"
                        +guang+";每月一共要还:"+(value+car+guang);

                System.out.println(daiKuai);

                if (i%12==1){
                    year++;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(year+"年,房贷:"+allYear+";车位贷:"+carYear+";广发贷款:"
                            +guangYear+";一共要还:"+(allYear+carYear+guangYear));
                    System.out.println("-----------------------------------------------------------");
                    allYear = 0f;
                    carYear =  0f;
                    guangYear =  0f;
                    month =  0;
                }
                allCarYear = car+allCarYear;
                allGuangYear = guang+allGuangYear;
            }else if(i<(5*12)+10){
                month =month+1;
                System.out.println(month+"月;房贷减10元后要还的钱:"+value+";车位贷:"+car
                        +";每月一共要还:"+(value+car));

                if (i%12==1){
                    year++;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(year+"年,房贷:"+allYear+";车位贷:"+carYear+";一共要还:"+(allYear+carYear+guangYear));
                    System.out.println("-----------------------------------------------------------");
                    allYear = 0f;
                    carYear =  0f;
                    guangYear =  0f;
                    month =  0;
                }

                allCarYear = car+allCarYear;
            }else {
                month =month+1;
                System.out.println(month+"月;房贷减10元后要还的钱:"+value+
                        ";每月一共要还:"+(value));
                if (i%12==1){
                    year++;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(year+"年,房贷:"+allYear+"一共要还:"+(allYear));
                    System.out.println("-----------------------------------------------------------");
                    allYear = 0f;
                    carYear =  0f;
                    guangYear =  0f;
                    month =  0;
                }
            }

            if( i==359+10){
                System.out.println("还了总房贷:"+all+";总车贷："+allCarYear+";总广发贷款:"+allGuangYear+";30年共还了:"+(all+allCarYear+allGuangYear));
            }

        }
    }
}
