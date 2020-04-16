public class Coordinates {
    private int x;
    private int y;
    //SINIR NOKTALARI
    private boolean xCoordL; // x<0
    private boolean xCoordB;//x>4
    private boolean yCoordL; //y<0
    private boolean yCoordB;//x>4





    public Coordinates() {
        this.x = 0;
        this.y = 0;
        xCoordL = true; // INITIALIZE
        xCoordB =true;
        yCoordL=true;
        yCoordB = true;
    }

    public Coordinates(int x, int y,boolean[] arr) {
        this.x = x;
        this.y = y;
        xCoordL = arr[0];// INITIALIZE
        xCoordB =arr[1];
        yCoordL=arr[2];
        yCoordB = arr[3];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }


    //Calculate sınıfı içinde coordinates nesnesinin içine gidicek
    public boolean[] diziDondur(){

        //TRUE FALSE DEGİŞTİRİRKEN(GİRDİ-CIKTI)
        //CALCULATE'E EN SON HALİNİ DÖNDÜRÜYORUM
        //YANİ FALSE İSE BİR DAHA DÜŞMESİN TRUE'DA DÜŞER
        boolean[] arr={xCoordL,xCoordB,yCoordL,yCoordB};  //dizi tanımlanır.
        return arr;

    }

    public void controlCoordinates(int condition){
        if(x<=0 || x>4 ||y>4 || y <= 0){
            if(condition==0 && xCoordB==true){
                ++this.x;
                xCoordB=false; // X 4'TEN BUYUK ISE BENIM UZAYIMDAN BUYUK (Böylece birdaha düşmez)

            }
            else if (condition==1 && yCoordB==true){
                ++this.y;
                yCoordB=false; // y 4 TEN BUYUK BIR DAHA GIRME


            }else if (condition==2 && xCoordL==true){
                --this.x;
                xCoordL=false; // X KUCUK SIFIRDAN BIRDAHA GIRME

            }else if(condition==3 && yCoordL==true){
                --this.y;
                yCoordL=false; // Y KUCUK SIFIRDAN BIRDAHA GIRME

            }
            else
                System.out.println("RIP // DUSTUGU KONUM //"); // İKİNCİ KEZ X Y UZAYLARINI AŞTIYSA

        }else // 0 İLE 4 ARASI SAYI GIRDIGIMDE BURAYA GEL
        if(condition==0){
            ++this.x;
        }
        else if (condition==1){
            ++this.y;


        }else if (condition==2 ){
            --this.x;
        }else if(condition ==3 ){
            --this.y;
        }

    }

    public String toString() {
        return this.x + " " + this.y;
    }
}

