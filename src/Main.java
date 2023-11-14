public class Main {
    public static void main(String[] args){
        Transport bmw = new Transport();
        bmw.setValues(150.5f, 3000, "Green", new byte[]{0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);
//        bmw.speed = 150.5f;
//        bmw.weight = 3000;
//        bmw.color = "Green";
//        bmw.coordinate = new byte[]{0, 0, 0};
        Transport mann = new Transport();
        mann.speed = 140.5f;
        mann.weight = 8000;
        mann.color = "Red";
        mann.coordinate = new byte[] {100, 0, 100};

        String res2 = mann.getValues();
        System.out.println(res2);
    }
}

