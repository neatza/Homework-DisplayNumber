public class DisplayLanguage {
    public static void main(String[] args) {
        System.out.println(" Hello World!");
        String[] languages={"C","C++","C#","Python","Go","Rust","JavaScript","Php","Swift","Java"};
        int n=(int) (Math.random()*1000000);
        int numberMultiplied=(n*3)/7;
        System.out.println(numberMultiplied);
        int numberDisplay=0;

        for(int i=0;i<5;i++){
            numberDisplay+=numberMultiplied%10;
        }

        while(numberDisplay/10!=0){
            int temp2=numberDisplay%10;
           int temp= numberDisplay/10;
           numberDisplay=temp2+temp;

        }

        System.out.println(numberDisplay);
        System.out.println(" In the summer I will learn "+languages[numberDisplay]);
    }
}
