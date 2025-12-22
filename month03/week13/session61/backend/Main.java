public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Session - 61");
        Uboot marineBoot = new Uboot("U-47", 66);
        marineBoot.printInfo();

        BattleShip BS1 = new BattleShip("Oak", 100);
        BS1.printInfo();

        System.out.println();
        System.out.println("Interface.");
        Player player = new Player("Hero");
        player.draw();
        player.move(100, 200);
        player.resizable(1.5);
        player.draw();

        System.out.println();
        System.out.println("Rectangle.");
        Drawable circle = new Circle(5);
        Drawable rect = new Rectangle(10, 5);
        circle.draw(); // toirog zurj baina (r = 5)
        rect.draw(); // tegsh untsugt zurj baina ( 10 x 5)

        System.out.println();
        System.out.println("RubberDuck");
        RubberDuck rubberduck = new RubberDuck("Rubby");
        rubberduck.swim();
        rubberduck.makeSound();

        System.out.println();
        System.out.println("Triangle");
        Triangle triangle = new Triangle(6, 4);
        triangle.draw();

        System.out.println();
        System.out.println("Playable");
        MusicPlayer musicplayer = new MusicPlayer("Duu");
        VideoPlayer videoplayer = new VideoPlayer("Bichleg");

        musicplayer.play();
        musicplayer.pause();
        musicplayer.stop();

        System.out.println();

        videoplayer.play();
        videoplayer.pause();
        videoplayer.stop();

        System.out.println();
    }

    
}