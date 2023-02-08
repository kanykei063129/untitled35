public class Main {
    public static void main(String[] args) {
        Display display = new Display(15.2,"Kyrgyzstan","IPS ");

        HDD hdd= new HDD("256",1);

        RAM ram = new RAM("8гб","Kyrgyzstan");

        USBport usBport=new USBport(3.0,1512032);

        Keyboard keyboard = new Keyboard("With backlight");

        Computer computer = new Computer(display,"Mackbook","Black",hdd,"GPGPU",usBport,keyboard);

        System.out.println("Computer:"+computer.getName()+"\nColour:"+computer.getColour()+"\nRam:"+ram.getMemory()+"\nCountry;"+ram.getCountry()+"\nSSD:"+hdd.getMemorySSD()
                +"disk:"+computer.getHdd().getDisk()+"\nvideo card:"+computer.getVideoCard()+"\nUSB port:" +
                ""+computer.getUsBport().getTypePort()+" "+computer.getUsBport().getID()
                +"\nkey board:"+computer.getKeyboard().getBacklight() );
    }
}