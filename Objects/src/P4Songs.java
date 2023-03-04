import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P4Songs {
    static class Songs {
        String typeList;
        String name ;
        String time ;

        public String getTypeList() {
            return typeList;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
        public  Songs(String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }


    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Songs> listOfSongs = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String input = scanner.nextLine();
            String typeList = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];
            Songs currentSong = new Songs(typeList, name, time);

            listOfSongs.add(currentSong);
        }
        String typeSong = scanner.nextLine();
        if (typeSong.equals("all")){
            for (Songs song:listOfSongs) {
                System.out.println(song.getName());
            }
        }else {
            for (Songs song:listOfSongs) {
                if (song.getTypeList().equals(typeSong)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
