package HelpMe;
public class TestNoob
{
        public static void main(String[] args) {
        Noob [] n = new Noob[5];

        n[0] = new Noob ("TataZenon", 75);
        n[1] = new Noob ("AxileZenon", 54);
        n[2] = new Noob ("HannahZenonZ", 43);
        n[3] = new Noob ("ZenonMaster", 75);
        n[4] = new Noob ("ZeNoZenoN", 32);

        Noob.findNoob(n, "TataZenoN");
        Noob.findGroupOfNoob(n, 75);
    }
}