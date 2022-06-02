package HelloWorld;

public class Main {
    public static void main(String args[])
        throws InterruptedException {
        String importantInfo[] = {
            "**********************************************",
            "*************** SERVER INSTALLED *************",
            "**********************************************",
            "************** SELECT YOUR MODPACK ***********",
            "*************** CLICK INSTALL ****************",
            "**********************************************",
            "**********************************************"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 10 seconds
            Thread.sleep(500);
            //Print a message
            System.out.println(importantInfo[i]);
        }
        try{System.in.read();}
catch(Exception e){}
    }
}
